package com.learning.jenkins

//There might compiliation errors but the reference code needs to debug
	
	import jenkins.model.*
	import hudson.model.*
	import hudson.slaves.*


	def sfrId
	def instanceId
	def instanceType
	def instanceRequest
	def instanceIp
	def maxSpotInstanceCount = 100
	String jsonFile = "cli_full.json"
	String slaveLabel = "dynamic-node"
	String dummySlaveLabel = "DummySlave"
	String slaveExecutorsCount = "3"
	
	Boolean isXlarge = false
	if (build.getBuildVariables()['isXlarge'] != null) {
	  jsonFile = "cli_full_xlarge.json"
	  slaveLabel = "dynamic-node2"
	  dummySlaveLabel = "DummySlave2"
	  slaveExecutorsCount = "1"
	}
	//println jsonFile
	
	  
	def startSpotFleet(file){
	  println "Starting Spot Fleet request"
	  sfrId = "cmd /c aws ec2 request-spot-fleet --spot-fleet-request-config file://C:\\Tools\\util_scripts\\AWS_Spot_Fleet_instances\\${file}".execute().text.trim()
	  //sfrId = "cmd /c aws ec2 request-spot-fleet --spot-fleet-request-config file://C:\\Tools\\util_scripts\\AWS_Spot_Fleet_instances\\cli_full_xlarge.json".execute().text.trim()
	  println "Spot fleet request: ${sfrId}"
	  return sfrId
	}
	
	def verifyRequest(sfrId) {
	  Boolean isFound = false
	  int actualWaitTime = 0
	  int maxWaitTime = 600000
	  println "Showing status of Spot Fleet request '${sfrId}'"
	  while (!isFound){
		def requestHist = "cmd /c aws ec2 describe-spot-fleet-request-history --spot-fleet-request-id ${sfrId} --start-time 2015-09-01T00:00:00Z".execute().text
		println requestHist
		if (requestHist.contains("launched")) {
		isFound = true
		println "Instance successfully launched"
		} else {
		  println "Instance was not launched yet. Waiting 30 sec."
		  println "Already waiting: " + actualWaitTime/1000 + " sec."
		  if (actualWaitTime < maxWaitTime) {
			actualWaitTime = actualWaitTime + 30000
			Thread.sleep(30000)
		  } else {
			println "Text was not found during ${actualWaitTime}. Going forward."
			stopSpotFleet(sfrId)
			return isFound
			//break
		  }
		}
	  }
	  return isFound
	}
	
	def setTag(awsObjectID, tag, value){
	  println "Setting Tag '${tag}'='${value}' to object '${awsObjectID}'"
	  "cmd /c aws ec2 create-tags --resources ${awsObjectID} --tags Key=${tag},Value=${value}".execute()
	  println "Tag '${tag}'='${value}' is set successfully to object '${awsObjectID}'."
	}
	
	def stopSpotFleet(sfrId) {
	  println "Stopping '$sfrId'"
	  def cancelRequest = "cmd /c aws ec2 cancel-spot-fleet-requests --spot-fleet-request-ids ${sfrId} --terminate-instances".execute().text
	  println cancelRequest
	}
	
	def countSpotSlaves() {
	  def slaves = Jenkins.instance.getSlaves()
	  def spotSlaves = []
	  slaves.each() {
		if (it.getNodeName().contains("spot_") && !it.getNodeName().contains("dummy"))
	  spotSlaves.add(it)
	}
	  return spotSlaves.size()
	}
	//------ End of Methods definition --------//
	
	def spotSlavesCount = countSpotSlaves()
	println("Currently there are ${spotSlavesCount} spots running.")
	
	if (spotSlavesCount >= maxSpotInstanceCount) {
	  println ("Skipping start operation as number of running spot instances more than ${maxSpotInstanceCount}.")
	} else {
	
	sfrId = startSpotFleet(jsonFile)
	
	Boolean isInstanceStarted = verifyRequest(sfrId)
	//verifyRequest(sfrId)
	if (isInstanceStarted) {
	
	  println "Getting Spot Fleet instanceID"
	  def instanceIdOutput = "cmd /c aws ec2 describe-spot-fleet-instances --spot-fleet-request-id ${sfrId}".execute().text.trim()
	  instanceId = instanceIdOutput.split('\t')[1]
	  instanceType = instanceIdOutput.split('\t')[2]
	  instanceRequest = instanceIdOutput.split('\t')[3]
	  println "instanceId = '${instanceId}'"
	  println "instanceType = '${instanceType}'"
	  println "instanceRequest = '${instanceRequest}'"
	
	  setTag(instanceId, "Name", "Spot_instance_"+sfrId)
	
	  println "Describing instance info"
	  def instanceOutput = "cmd /c aws ec2 describe-instances --instance-ids ${instanceId}".execute().text
	  
	  try {
		instanceIp = instanceOutput.split('\t')[17]
	  } catch (ArrayIndexOutOfBoundsException e) {
		println "Failed to retrieve information about instance"
	  }
	  println "instanceIp = '${instanceIp}'"
	
	  def slaveName
	  def dummySlaveName
	  if (instanceIp != '') {
	
		println "Starting new Jenkins slave creation"
		slaveName = "spot_"+instanceIp
		dummySlaveName = "spot_${instanceIp}_dummy"
		println "instanceIp='${instanceIp}'"
		println "Slave name: '${slaveName}'"
		println "Dummy Slave name: '${dummySlaveName}'"
	
		def node = new DumbSlave(slaveName,"sfrId=${sfrId}","C:\\Tools\\Jenkins",slaveExecutorsCount,Node.Mode.NORMAL,slaveLabel,new JNLPLauncher(),new RetentionStrategy.Always(),new LinkedList())
		def dummyNode = new DumbSlave(dummySlaveName,"sfrId=${sfrId}","C:\\Tools\\Jenkins",slaveExecutorsCount,Node.Mode.EXCLUSIVE,dummySlaveLabel,new JNLPLauncher(),new RetentionStrategy.Always(),new LinkedList())
		Jenkins.instance.addNode(node)
		Jenkins.instance.addNode(dummyNode)
	
	  } else {
		stopSpotFleet(sfrId)
		//println "Slave was not created"
		slaveName = "Slave was not created."
	  }
	
	  File propFile = new File("C:\\Tools\\Jenkins\\jobs\\startSpotInstance\\builds\\${build.getNumber()}\\nodeInfo.properties")
	  propFile.write("NodeName=${slaveName}\n")
	  propFile.append("dummyNodeName=${dummySlaveName}\n")
	  propFile.append("instanceIp=${instanceIp}\n")
	  propFile.append("instanceRequest=${instanceRequest}\n")
	  propFile.append("sfrId=${sfrId}")
	  
	} else {
	  println "Instance was not started.\n"
	}
	  
	}

}

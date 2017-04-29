import jenkins.model.*
import hudson.model.*
import hudson.slaves.*

//Might have compiliation errors due to hudson.jar or rleated jars not available

def stopSlave(slaveName) {
  def job = Hudson.instance.getJob('stopSpotInstance')
  def anotherBuild
  try {
	  def params = [
		new StringParameterValue('NodeName', slaveName),
		new BooleanParameterValue('analyzeUptime', true),
		new StringParameterValue('minUptime', "45"),
	  ]
	  def future = job.scheduleBuild2(0, new Cause.LegacyCodeCause(), new ParametersAction(params))
	  anotherBuild = future.get()
	  println ("Job was started. " + anotherBuild.getUrl())
	  println anotherBuild.getLog()
  } catch (Exception e) {
	  println ("Job was not started.")
  }
}

def countSpotSlaves() {
  def slaves = Jenkins.instance.getSlaves()
  def spotSlaves = []
  slaves.each() {
	if (it.getNodeName().contains("spot_") && !it.getNodeName().contains("dummy"))
  spotSlaves.add(it)
}
  return spotSlaves
}

def spotSlaves = countSpotSlaves()
println("Currently there are ${spotSlaves.size()} spots running.")
def minSpotInstanceCount = build.getBuildVariables()['minSpotInstanceCount'].toInteger()

def spotSlavesCount = spotSlaves.size()
if (spotSlaves.size() <= minSpotInstanceCount) {
  println ("Skipping stop operation as number of running spot instances no more than ${minSpotInstanceCount}.")
} else {
  spotSlaves.each() {
	spotSlavesCount = countSpotSlaves().size()
	if (spotSlavesCount > minSpotInstanceCount) {
	  println("")
	  stopSlave(it.getNodeName())
	} else {
	  println ("Skipping stop operation as number of running spot instances no more than ${minSpotInstanceCount}.")
	}
  }
}

return null
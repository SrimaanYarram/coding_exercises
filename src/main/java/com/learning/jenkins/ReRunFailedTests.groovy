package com.learning.jenkins
import hudson.model.*

//Compilation error exists as you need to add hudson related jars to your class path example hudson, StringParameterValue, ParametersAction etc


class ReRunFailedTests {
	
 static void main(String... arg){
	
	for(item in hudson.model.Hudson.instance.getView('PurchaseFinance_YTS').items){
	  if(item.getLastBuild()!=null && item.getLastBuild().getResult() == hudson.model.Result.FAILURE){
		if(!item.getDisplayName().contains("regression_cron_") && !item.getDisplayName().contains("YTS_UI_CrossBrowser")) {
		   def cause = item.getLastBuild().getCauses()[0];
		  def buildVariablesMap = item.getLastBuild().getBuildVariables();
		  def allBuildParams = [];
		  println "---------------------------- Failed Test Suite = " + item.getDisplayName() + "----------------------------";
		  buildVariablesMap.each {
			println it.key + " = " + it.value;
			if(it.key=='rerun_failures'){
			it.value='true';
			allBuildParams.add(new StringParameterValue(it.key, it.value));
			}
			else{
			allBuildParams.add(new StringParameterValue(it.key, it.value));
		   }
		  }
		  item.scheduleBuild2(0, cause, new ParametersAction(allBuildParams));
		  println "" ;
		}
	  }
	}
   
}
	  

}

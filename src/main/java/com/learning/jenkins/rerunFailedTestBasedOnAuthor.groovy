import jenkins.model.*
import hudson.model.StringParameterValue
import hudson.model.ParametersAction
import groovy.sql.Sql
import groovy.sql.GroovyRowResult

def rerunJobs(jobName, build) {
  activeJobs = hudson.model.Hudson.instance.items.findAll{job -> job.isBuildable()}
  failedJob = activeJobs.find{job -> job.getName() == jobName}

  def failedRun = failedJob.getBuild(build)
  println("Failed run '${failedRun}' is found")
  if (failedRun != null) {
	def cause = failedRun.getCauses()[0]

	def vars = failedRun.getBuildVariables()
	println "Variables that are used for the build are:"
	println vars

	def params = []
	vars.each() {key, value ->
	  println "${key} = ${value}"
	  def param = new StringParameterValue(key, value)
	  params.add(param)
	}

	def future = failedJob.scheduleBuild2(0, cause, new ParametersAction(params))
	
  } else {
	println("Failed run is null! Skipping its execution. Be sure this run exist!")
  }
}

Boolean doRestart = build.getBuildVariables()['doRestart'].toBoolean()
String methodOwnerName = build.getBuildVariables()['methodOwnerName'].toString()
String env = build.getBuildVariables()['env'].toString()
println 'doRestart=' + doRestart
println 'methodOwnerName=' + methodOwnerName
println 'env=' + env

def dbUrl      = build.getEnvironment(listener).get('gv_ZAFIRA_DB_URL')
def dbUser     = build.getEnvironment(listener).get('gv_ZAFIRA_DB_USER')
def dbPassword = build.getEnvironment(listener).get('gv_ZAFIRA_DB_PWD')
def dbDriver   = "org.postgresql.Driver"

def sql = Sql.newInstance(dbUrl, dbUser, dbPassword, dbDriver)

sqlString1 = "set schema 'zafira'"

sqlString2 = "SELECT USERS.USERNAME AS OWNER, TEST_RUNS.STATUS as STATUS, " +
	"sum( case when TESTS.STATUS = 'FAILED' then 1 else 0 end ) AS \"FAILED TESTS\", " +
	"'[' || AA.JOB_URL  || CAST(TEST_RUNS.BUILD_NUMBER AS text) || ']' AS JOB_URL, " +
	"TEST_RUNS.CREATED_AT AS STARTED_DATE " +
"FROM TEST_RUNS INNER JOIN " +
	"TESTS ON TEST_RUNS.ID=TESTS.TEST_RUN_ID INNER JOIN " +
	"TEST_CASES ON TESTS.TEST_CASE_ID=TEST_CASES.ID INNER JOIN " +
	"USERS ON TEST_CASES.USER_ID=USERS.ID INNER JOIN " +
	"(SELECT UPSTREAMJOBS.NAME as UPSTREAM_JOB, JOBS.NAME as JOB, TEST_RUNS.ID as RUN_ID,	" +
	"JOBS.JOB_URL as JOB_URL " +
	"FROM TEST_RUNS INNER JOIN JOBS ON TEST_RUNS.JOB_ID = JOBS.ID LEFT JOIN " +
		"JOBS UPSTREAMJOBS ON TEST_RUNS.UPSTREAM_JOB_ID = UPSTREAMJOBS.ID " +
	"WHERE (date(TEST_RUNS.CREATED_AT)) >= (current_date-1) and UPSTREAMJOBS.NAME like 'MASTER_CRON_${env}%') AA ON AA.RUN_ID = TEST_RUNS.ID " +
"WHERE TESTS.STATUS='FAILED' and TEST_RUNS.STATUS <> 'IN_PROGRESS' and USERS.USERNAME in (${methodOwnerName}) " +
"GROUP BY OWNER, AA.JOB_URL, TEST_RUNS.CREATED_AT, TEST_RUNS.STATUS, TEST_RUNS.BUILD_NUMBER ORDER BY \"FAILED TESTS\" DESC "
//println(sqlString2)
sql.execute(sqlString1)

println "===================================="
  
List<GroovyRowResult> resRows = sql.rows(sqlString2)
resRows.each() { row->
println row
  def jobName = row.job_url.split('/')[4]
  def jobBuild = row.job_url.split('/')[5].split(']')[0]
  println 'jobName = ' + jobName
  println "build = " + jobBuild

  if (doRestart) {
	println 'Starting rebuild of failed jobs.'
	rerunJobs(jobName, jobBuild)
  } else {
	println 'Skipping rebuild as doRebuild parameter is not set.'
  }
  println "===================================="
}
sql.close()

//return null
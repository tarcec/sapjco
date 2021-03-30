package cl.tarce.sap.defs.tables.basis.jobs;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class Job {
	@BapiParameter(name = "JOBNAME", type = ParameterType.SCALAR)
	private String jobName;
	@BapiParameter(name = "JOBCOUNT", type = ParameterType.SCALAR)
	private String jobCount;
	
	public String getJobName() {
		return jobName;
	}
	public void setJobName(String jobName) {
		this.jobName = jobName;
	}
	public String getJobCount() {
		return jobCount;
	}
	public void setJobCount(String jobCount) {
		this.jobCount = jobCount;
	}
	
	
}

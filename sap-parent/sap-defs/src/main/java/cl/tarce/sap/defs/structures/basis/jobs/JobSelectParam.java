package cl.tarce.sap.defs.structures.basis.jobs;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class JobSelectParam {
	@BapiParameter(name = "USERNAME", type = ParameterType.SCALAR)
	private String username;
	@BapiParameter(name = "JOBNAME", type = ParameterType.SCALAR)
	private String jobName;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}	
	
	
}

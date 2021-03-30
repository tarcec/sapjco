package cl.tarce.sap.defs.tables.basis.jobs;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class XMIVersions {
	@BapiParameter(name = "INTERFACE", type = ParameterType.SCALAR)
	private String interf;
	
	@BapiParameter(name = "VERSION", type = ParameterType.SCALAR)
	private String version;

	public String getInterf() {
		return interf;
	}

	public void setInterf(String interf) {
		this.interf = interf;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	
}

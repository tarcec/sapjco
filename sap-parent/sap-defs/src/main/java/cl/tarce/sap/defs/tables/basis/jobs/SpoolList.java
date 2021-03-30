package cl.tarce.sap.defs.tables.basis.jobs;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class SpoolList {
	@BapiParameter(name = "LINE", type = ParameterType.SCALAR)
	private String line;

	public String getLine() {
		return line;
	}

	public void setLine(String line) {
		this.line = line;
	}
	
}

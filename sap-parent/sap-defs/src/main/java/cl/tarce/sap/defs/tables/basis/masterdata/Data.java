package cl.tarce.sap.defs.tables.basis.masterdata;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class Data {
	@BapiParameter(name = "WA", type = ParameterType.SCALAR)
	private String data;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}	
}

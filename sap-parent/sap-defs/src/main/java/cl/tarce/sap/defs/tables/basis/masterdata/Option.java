package cl.tarce.sap.defs.tables.basis.masterdata;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class Option {
	@BapiParameter(name = "TEXT", type = ParameterType.SCALAR)
	private String text;
	
	public Option(String text){
		this.text = text;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
}

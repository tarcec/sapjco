package cl.tarce.sap.defs.tables.basis.dcm;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class DocumentCharacteristicsValues {
	@BapiParameter(name = "CLASSTYPE", type = ParameterType.SCALAR)
	private String classType;
	
	@BapiParameter(name = "CLASSNAME", type = ParameterType.SCALAR)
	private String className;
	
	@BapiParameter(name = "CHARNAME", type = ParameterType.SCALAR)
	private String charName;
	
	@BapiParameter(name = "CHARVALUE", type = ParameterType.SCALAR)
	private String charValue;
	
	@BapiParameter(name = "DELETEVALUE", type = ParameterType.SCALAR)
	private String deleteValue;

	public String getClassType() {
		return classType;
	}

	public void setClassType(String classType) {
		this.classType = classType;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public String getCharName() {
		return charName;
	}

	public void setCharName(String charName) {
		this.charName = charName;
	}

	public String getCharValue() {
		return charValue;
	}

	public void setCharValue(String charValue) {
		this.charValue = charValue;
	}

	public String getDeleteValue() {
		return deleteValue;
	}

	public void setDeleteValue(String deleteValue) {
		this.deleteValue = deleteValue;
	}
	
	
}

package cl.tarce.sap.defs.structures.basis.jobs;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class JobArchive {
	@BapiParameter(name = "SAPOBJECT", type = ParameterType.SCALAR)
	private String sapObject;
	@BapiParameter(name = "OBJECT", type = ParameterType.SCALAR)
	private String object;
	@BapiParameter(name = "INFO", type = ParameterType.SCALAR)
	private String info;
	public String getSapObject() {
		return sapObject;
	}
	public void setSapObject(String sapObject) {
		this.sapObject = sapObject;
	}
	public String getObject() {
		return object;
	}
	public void setObject(String object) {
		this.object = object;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	
	
}

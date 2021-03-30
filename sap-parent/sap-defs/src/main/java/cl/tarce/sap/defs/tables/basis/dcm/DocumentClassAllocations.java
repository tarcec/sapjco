package cl.tarce.sap.defs.tables.basis.dcm;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class DocumentClassAllocations {
	@BapiParameter(name = "CLASSTYPE", type = ParameterType.SCALAR)
	private String classType;
	
	@BapiParameter(name = "CLASSNAME", type = ParameterType.SCALAR)
	private String className;
	
	@BapiParameter(name = "STATUS", type = ParameterType.SCALAR)
	private String status;
	
	@BapiParameter(name = "STANDARDCLASS", type = ParameterType.SCALAR)
	private String standardClass;
	
	@BapiParameter(name = "DELETEALLOCATION", type = ParameterType.SCALAR)
	private String deleteAllocation;
	
	@BapiParameter(name = "ECNUMBER", type = ParameterType.SCALAR)
	private String ecNumber;

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

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getStandardClass() {
		return standardClass;
	}

	public void setStandardClass(String standardClass) {
		this.standardClass = standardClass;
	}

	public String getDeleteAllocation() {
		return deleteAllocation;
	}

	public void setDeleteAllocation(String deleteAllocation) {
		this.deleteAllocation = deleteAllocation;
	}

	public String getEcNumber() {
		return ecNumber;
	}

	public void setEcNumber(String ecNumber) {
		this.ecNumber = ecNumber;
	}
	
	
	
}

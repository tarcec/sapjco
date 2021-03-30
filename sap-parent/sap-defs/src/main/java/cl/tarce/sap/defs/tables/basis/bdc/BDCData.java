package cl.tarce.sap.defs.tables.basis.bdc;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class BDCData {
	public BDCData(String program,
			Integer dynPro,
			String dynBegin,
			String fNam,
			String fVal
			){
		this.program = program;
		this.dynPro = dynPro;
		this.dynBegin = dynBegin;
		this.fNam = fNam;
		this.fVal = fVal;		
	}
	
	public BDCData(){
		
	}
	
	@BapiParameter(name = "PROGRAM", type = ParameterType.SCALAR)
	private String program;
	
	@BapiParameter(name = "DYNPRO", type = ParameterType.SCALAR)
	private Integer dynPro;
	
	@BapiParameter(name = "DYNBEGIN", type = ParameterType.SCALAR)
	private String dynBegin;
	
	@BapiParameter(name = "FNAM", type = ParameterType.SCALAR)
	private String fNam;
	
	@BapiParameter(name = "FVAL", type = ParameterType.SCALAR)
	private String fVal;

	public String getProgram() {
		return program;
	}

	public void setProgram(String program) {
		this.program = program;
	}

	public Integer getDynPro() {
		return dynPro;
	}

	public void setDynPro(Integer dynPro) {
		this.dynPro = dynPro;
	}

	public String getDynBegin() {
		return dynBegin;
	}

	public void setDynBegin(String dynBegin) {
		this.dynBegin = dynBegin;
	}

	public String getfNam() {
		return fNam;
	}

	public void setfNam(String fNam) {
		this.fNam = fNam;
	}

	public String getfVal() {
		return fVal;
	}

	public void setfVal(String fVal) {
		this.fVal = fVal;
	}
	
	
}

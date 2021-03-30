package cl.tarce.sap.defs.structures.basis.bdc;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class CTUParams {
	@BapiParameter(name = "DISMODE", type = ParameterType.SCALAR)
	private String disMode;
	
	@BapiParameter(name = "UPDMODE", type = ParameterType.SCALAR)
	private String updMode;
	
	@BapiParameter(name = "CATTMODE", type = ParameterType.SCALAR)
	private String cattMode;
	
	@BapiParameter(name = "DEFSIZE", type = ParameterType.SCALAR)
	private String defSize;
	
	@BapiParameter(name = "RACOMMIT", type = ParameterType.SCALAR)
	private String raCommit;
	
	@BapiParameter(name = "NOBINPT", type = ParameterType.SCALAR)
	private String noBInpt;
	
	@BapiParameter(name = "NOBIEND", type = ParameterType.SCALAR)
	private String noBIEnd;

	public String getDisMode() {
		return disMode;
	}

	public void setDisMode(String disMode) {
		this.disMode = disMode;
	}

	public String getUpdMode() {
		return updMode;
	}

	public void setUpdMode(String updMode) {
		this.updMode = updMode;
	}

	public String getCattMode() {
		return cattMode;
	}

	public void setCattMode(String cattMode) {
		this.cattMode = cattMode;
	}

	public String getDefSize() {
		return defSize;
	}

	public void setDefSize(String defSize) {
		this.defSize = defSize;
	}

	public String getRaCommit() {
		return raCommit;
	}

	public void setRaCommit(String raCommit) {
		this.raCommit = raCommit;
	}

	public String getNoBInpt() {
		return noBInpt;
	}

	public void setNoBInpt(String noBInpt) {
		this.noBInpt = noBInpt;
	}

	public String getNoBIEnd() {
		return noBIEnd;
	}

	public void setNoBIEnd(String noBIEnd) {
		this.noBIEnd = noBIEnd;
	}
	
	
}

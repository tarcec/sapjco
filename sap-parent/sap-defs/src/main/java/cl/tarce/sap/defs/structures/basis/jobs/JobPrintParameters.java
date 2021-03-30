package cl.tarce.sap.defs.structures.basis.jobs;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class JobPrintParameters {
	@BapiParameter(name = "DESTIN", type = ParameterType.SCALAR)
	private String dest;
	@BapiParameter(name = "PRINTIMM", type = ParameterType.SCALAR)
	private String printImmediatly;
	@BapiParameter(name = "RELEASE", type = ParameterType.SCALAR)
	private String release;
	@BapiParameter(name = "COPIES", type = ParameterType.SCALAR)
	private Integer copies;
	@BapiParameter(name = "PRIARMODE", type = ParameterType.SCALAR)
	private String printAsArchiveMode;
	@BapiParameter(name = "SHOWPASSWD", type = ParameterType.SCALAR)
	private String showPassword;
	@BapiParameter(name = "SAPBANNER", type = ParameterType.SCALAR)
	private String sapBanner;
	@BapiParameter(name = "BANNERPAGE", type = ParameterType.SCALAR)
	private String bannerPage;
	@BapiParameter(name = "EXPIRATION", type = ParameterType.SCALAR)
	private Integer expiration;
	@BapiParameter(name = "PRINTRECIP", type = ParameterType.SCALAR)
	private String printReceipt;
	@BapiParameter(name = "NUMLINES", type = ParameterType.SCALAR)
	private Integer numLines;
	@BapiParameter(name = "NUMCOLUMNS", type = ParameterType.SCALAR)
	private Integer numColumns;
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getPrintImmediatly() {
		return printImmediatly;
	}
	public void setPrintImmediatly(String printImmediatly) {
		this.printImmediatly = printImmediatly;
	}
	public String getRelease() {
		return release;
	}
	public void setRelease(String release) {
		this.release = release;
	}
	public Integer getCopies() {
		return copies;
	}
	public void setCopies(Integer copies) {
		this.copies = copies;
	}
	public String getPrintAsArchiveMode() {
		return printAsArchiveMode;
	}
	public void setPrintAsArchiveMode(String printAsArchiveMode) {
		this.printAsArchiveMode = printAsArchiveMode;
	}
	public String getShowPassword() {
		return showPassword;
	}
	public void setShowPassword(String showPassword) {
		this.showPassword = showPassword;
	}
	public String getSapBanner() {
		return sapBanner;
	}
	public void setSapBanner(String sapBanner) {
		this.sapBanner = sapBanner;
	}
	public String getBannerPage() {
		return bannerPage;
	}
	public void setBannerPage(String bannerPage) {
		this.bannerPage = bannerPage;
	}
	public Integer getExpiration() {
		return expiration;
	}
	public void setExpiration(Integer expiration) {
		this.expiration = expiration;
	}
	public String getPrintReceipt() {
		return printReceipt;
	}
	public void setPrintReceipt(String printReceipt) {
		this.printReceipt = printReceipt;
	}
	public Integer getNumLines() {
		return numLines;
	}
	public void setNumLines(Integer numLines) {
		this.numLines = numLines;
	}
	public Integer getNumColumns() {
		return numColumns;
	}
	public void setNumColumns(Integer numColumns) {
		this.numColumns = numColumns;
	}
	
	
}

package cl.tarce.sap.defs.structures.basis.dcm;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class DocumentData {
	
	@BapiParameter(name = "DOCUMENTTYPE", type = ParameterType.SCALAR)
	private String documentType;
	
	@BapiParameter(name = "DOCUMENTNUMBER", type = ParameterType.SCALAR)
	private String documentNumber;
	
	@BapiParameter(name = "DOCUMENTVERSION", type = ParameterType.SCALAR)
	private String documentVersion;
	
	@BapiParameter(name = "DOCUMENTPART", type = ParameterType.SCALAR)
	private String documentPart;
	
	@BapiParameter(name = "DESCRIPTION", type = ParameterType.SCALAR)
	private String description;
	
	@BapiParameter(name = "USERNAME", type = ParameterType.SCALAR)
	private String username;
	
	@BapiParameter(name = "STATUSEXTERN", type = ParameterType.SCALAR)
	private String statusExtern;
	
	@BapiParameter(name = "STATUSINTERN", type = ParameterType.SCALAR)
	private String statusIntern;
	
	@BapiParameter(name = "STATUSLOG", type = ParameterType.SCALAR)
	private String statusLog;
	
	@BapiParameter(name = "LABORATORY", type = ParameterType.SCALAR)
	private String laboratory;
	
	@BapiParameter(name = "ECNUMBER", type = ParameterType.SCALAR)
	private String ecNumber;
	
	@BapiParameter(name = "VALIDFROMDATE", type = ParameterType.SCALAR)
	private String validFromDate;
	
	@BapiParameter(name = "DELETEINDICATOR", type = ParameterType.SCALAR)
	private String deleteIndicator;
	
	@BapiParameter(name = "CADINDICATOR", type = ParameterType.SCALAR)
	private String cadIndicator;
	
	@BapiParameter(name = "STRUCTUREINDICATOR", type = ParameterType.SCALAR)
	private String structureIndicator;
	
	@BapiParameter(name = "PREDOCUMENTNUMBER", type = ParameterType.SCALAR)
	private String preDocumentNumber;
	
	@BapiParameter(name = "PREDOCUMENTVERSION", type = ParameterType.SCALAR)
	private String preDocumentVersion; 
	
	@BapiParameter(name = "PREDOCUMENTPART", type = ParameterType.SCALAR)
	private String preDocumentPart;
	
	@BapiParameter(name = "PREDOCUMENTTYPE", type = ParameterType.SCALAR)
	private String preDocumentType;
	
	@BapiParameter(name = "AUTHORITYGROUP", type = ParameterType.SCALAR)
	private String authorityGroup;
	
	@BapiParameter(name = "DOCFILE1", type = ParameterType.SCALAR)
	private String docFile1;
	
	@BapiParameter(name = "DATACARRIER1", type = ParameterType.SCALAR)
	private String dataCarrier1;
	
	@BapiParameter(name = "WSAPPLICATION1", type = ParameterType.SCALAR)
	private String wsApplication1;
	
	@BapiParameter(name = "DOCFILE2", type = ParameterType.SCALAR)
	private String docFile2;
	
	@BapiParameter(name = "DATACARRIER2", type = ParameterType.SCALAR)
	private String dataCarrier2;
	
	@BapiParameter(name = "WSAPPLICATION2", type = ParameterType.SCALAR)
	private String wsApplication2;
	
	@BapiParameter(name = "VRLDAT", type = ParameterType.SCALAR)
	private String voidDate;
	
	@BapiParameter(name = "USERDEFINED1", type = ParameterType.SCALAR)
	private String userDefined1;
	
	@BapiParameter(name = "USERDEFINED2", type = ParameterType.SCALAR)
	private String userDefined2;
	
	@BapiParameter(name = "USERDEFINED3", type = ParameterType.SCALAR)
	private String userDefined3;
	
	@BapiParameter(name = "USERDEFINED4", type = ParameterType.SCALAR)
	private String userDefined4;
	
	@BapiParameter(name = "SAVEDOCFILE1", type = ParameterType.SCALAR)
	private String saveDocFile1;
	
	@BapiParameter(name = "SAVEDATACARRIER1", type = ParameterType.SCALAR)
	private String saveDataCarrier1;
	
	@BapiParameter(name = "SAVEDOCFILE2", type = ParameterType.SCALAR)
	private String saveDocFile2;
	
	@BapiParameter(name = "SAVEDATACARRIER2", type = ParameterType.SCALAR)
	private String saveDataCarrier2;
	
	@BapiParameter(name = "CREATEDATE", type = ParameterType.SCALAR)
	private String createDate;
	
	@BapiParameter(name = "REFDOCUMENTNUMBER", type = ParameterType.SCALAR)
	private String refDocumentNumber;
	
	@BapiParameter(name = "REFDOCUMENTPART", type = ParameterType.SCALAR)
	private String refDocumentPart;
	
	@BapiParameter(name = "REFDOCUMENTVERSION", type = ParameterType.SCALAR)
	private String refDocumentVersion;
	
	@BapiParameter(name = "FILESIZE1", type = ParameterType.SCALAR)
	private String fileSize1;
	
	@BapiParameter(name = "FILESIZE2", type = ParameterType.SCALAR)
	private String fileSize2;

	public String getDocumentType() {
		return documentType;
	}

	public void setDocumentType(String documentType) {
		this.documentType = documentType;
	}

	public String getDocumentNumber() {
		return documentNumber;
	}

	public void setDocumentNumber(String documentNumber) {
		this.documentNumber = documentNumber;
	}

	public String getDocumentVersion() {
		return documentVersion;
	}

	public void setDocumentVersion(String documentVersion) {
		this.documentVersion = documentVersion;
	}

	public String getDocumentPart() {
		return documentPart;
	}

	public void setDocumentPart(String documentPart) {
		this.documentPart = documentPart;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getStatusExtern() {
		return statusExtern;
	}

	public void setStatusExtern(String statusExtern) {
		this.statusExtern = statusExtern;
	}

	public String getStatusIntern() {
		return statusIntern;
	}

	public void setStatusIntern(String statusIntern) {
		this.statusIntern = statusIntern;
	}

	public String getStatusLog() {
		return statusLog;
	}

	public void setStatusLog(String statusLog) {
		this.statusLog = statusLog;
	}

	public String getLaboratory() {
		return laboratory;
	}

	public void setLaboratory(String laboratory) {
		this.laboratory = laboratory;
	}

	public String getEcNumber() {
		return ecNumber;
	}

	public void setEcNumber(String ecNumber) {
		this.ecNumber = ecNumber;
	}

	public String getValidFromDate() {
		return validFromDate;
	}

	public void setValidFromDate(String validFromDate) {
		this.validFromDate = validFromDate;
	}

	public String getDeleteIndicator() {
		return deleteIndicator;
	}

	public void setDeleteIndicator(String deleteIndicator) {
		this.deleteIndicator = deleteIndicator;
	}

	public String getCadIndicator() {
		return cadIndicator;
	}

	public void setCadIndicator(String cadIndicator) {
		this.cadIndicator = cadIndicator;
	}

	public String getStructureIndicator() {
		return structureIndicator;
	}

	public void setStructureIndicator(String structureIndicator) {
		this.structureIndicator = structureIndicator;
	}

	public String getPreDocumentNumber() {
		return preDocumentNumber;
	}

	public void setPreDocumentNumber(String preDocumentNumber) {
		this.preDocumentNumber = preDocumentNumber;
	}

	public String getPreDocumentVersion() {
		return preDocumentVersion;
	}

	public void setPreDocumentVersion(String preDocumentVersion) {
		this.preDocumentVersion = preDocumentVersion;
	}

	public String getPreDocumentPart() {
		return preDocumentPart;
	}

	public void setPreDocumentPart(String preDocumentPart) {
		this.preDocumentPart = preDocumentPart;
	}

	public String getPreDocumentType() {
		return preDocumentType;
	}

	public void setPreDocumentType(String preDocumentType) {
		this.preDocumentType = preDocumentType;
	}

	public String getAuthorityGroup() {
		return authorityGroup;
	}

	public void setAuthorityGroup(String authorityGroup) {
		this.authorityGroup = authorityGroup;
	}

	public String getDocFile1() {
		return docFile1;
	}

	public void setDocFile1(String docFile1) {
		this.docFile1 = docFile1;
	}

	public String getDataCarrier1() {
		return dataCarrier1;
	}

	public void setDataCarrier1(String dataCarrier1) {
		this.dataCarrier1 = dataCarrier1;
	}

	public String getWsApplication1() {
		return wsApplication1;
	}

	public void setWsApplication1(String wsApplication1) {
		this.wsApplication1 = wsApplication1;
	}

	public String getDocFile2() {
		return docFile2;
	}

	public void setDocFile2(String docFile2) {
		this.docFile2 = docFile2;
	}

	public String getDataCarrier2() {
		return dataCarrier2;
	}

	public void setDataCarrier2(String dataCarrier2) {
		this.dataCarrier2 = dataCarrier2;
	}

	public String getWsApplication2() {
		return wsApplication2;
	}

	public void setWsApplication2(String wsApplication2) {
		this.wsApplication2 = wsApplication2;
	}

	public String getVoidDate() {
		return voidDate;
	}

	public void setVoidDate(String voidDate) {
		this.voidDate = voidDate;
	}

	public String getUserDefined1() {
		return userDefined1;
	}

	public void setUserDefined1(String userDefined1) {
		this.userDefined1 = userDefined1;
	}

	public String getUserDefined2() {
		return userDefined2;
	}

	public void setUserDefined2(String userDefined2) {
		this.userDefined2 = userDefined2;
	}

	public String getUserDefined3() {
		return userDefined3;
	}

	public void setUserDefined3(String userDefined3) {
		this.userDefined3 = userDefined3;
	}

	public String getUserDefined4() {
		return userDefined4;
	}

	public void setUserDefined4(String userDefined4) {
		this.userDefined4 = userDefined4;
	}

	public String getSaveDocFile1() {
		return saveDocFile1;
	}

	public void setSaveDocFile1(String saveDocFile1) {
		this.saveDocFile1 = saveDocFile1;
	}

	public String getSaveDataCarrier1() {
		return saveDataCarrier1;
	}

	public void setSaveDataCarrier1(String saveDataCarrier1) {
		this.saveDataCarrier1 = saveDataCarrier1;
	}

	public String getSaveDocFile2() {
		return saveDocFile2;
	}

	public void setSaveDocFile2(String saveDocFile2) {
		this.saveDocFile2 = saveDocFile2;
	}

	public String getSaveDataCarrier2() {
		return saveDataCarrier2;
	}

	public void setSaveDataCarrier2(String saveDataCarrier2) {
		this.saveDataCarrier2 = saveDataCarrier2;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getRefDocumentNumber() {
		return refDocumentNumber;
	}

	public void setRefDocumentNumber(String refDocumentNumber) {
		this.refDocumentNumber = refDocumentNumber;
	}

	public String getRefDocumentPart() {
		return refDocumentPart;
	}

	public void setRefDocumentPart(String refDocumentPart) {
		this.refDocumentPart = refDocumentPart;
	}

	public String getRefDocumentVersion() {
		return refDocumentVersion;
	}

	public void setRefDocumentVersion(String refDocumentVersion) {
		this.refDocumentVersion = refDocumentVersion;
	}

	public String getFileSize1() {
		return fileSize1;
	}

	public void setFileSize1(String fileSize1) {
		this.fileSize1 = fileSize1;
	}

	public String getFileSize2() {
		return fileSize2;
	}

	public void setFileSize2(String fileSize2) {
		this.fileSize2 = fileSize2;
	}
	
	
}

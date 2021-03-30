package cl.tarce.sap.defs.tables.basis.dcm;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class DocumentFiles {
	
	@BapiParameter(name = "DELETEVALUE", type = ParameterType.SCALAR)
	private String deleteValue;
	
	@BapiParameter(name = "DOCUMENTTYPE", type = ParameterType.SCALAR)
	private String documentType;
	
	@BapiParameter(name = "DOCUMENTNUMBER", type = ParameterType.SCALAR)
	private String documentNumber;
	
	@BapiParameter(name = "DOCUMENTPART", type = ParameterType.SCALAR)
	private String documentPart;
	
	@BapiParameter(name = "DOCUMENTVERSION", type = ParameterType.SCALAR)
	private String documentVersion;
	
	@BapiParameter(name = "ORIGINALTYPE", type = ParameterType.SCALAR)
	private String originalType;
	
	@BapiParameter(name = "SOURCEDATACARRIER", type = ParameterType.SCALAR)
	private String sourceDataCarrier;
	
	@BapiParameter(name = "STORAGECATEGORY", type = ParameterType.SCALAR)
	private String storageCategory;
	
	@BapiParameter(name = "WSAPPLICATION", type = ParameterType.SCALAR)
	private String wsApplication;
	
	@BapiParameter(name = "DOCPATH", type = ParameterType.SCALAR)
	private String docPath;
	
	@BapiParameter(name = "DOCFILE", type = ParameterType.SCALAR)
	private String docFile;
	
	@BapiParameter(name = "STATUSINTERN", type = ParameterType.SCALAR)
	private String statusIntern;
	
	@BapiParameter(name = "STATUSEXTERN", type = ParameterType.SCALAR)
	private String statusExtern;
	
	@BapiParameter(name = "STATUSLOG", type = ParameterType.SCALAR)
	private String statusLog;
	
	@BapiParameter(name = "APPLICATION_ID", type = ParameterType.SCALAR)
	private String applicationId;
	
	@BapiParameter(name = "FILE_ID", type = ParameterType.SCALAR)
	private String fieldId;
	
	@BapiParameter(name = "DESCRIPTION", type = ParameterType.SCALAR)
	private String description;
	
	@BapiParameter(name = "LANGUAGE", type = ParameterType.SCALAR)
	private String language;
	
	@BapiParameter(name = "CHECKEDIN", type = ParameterType.SCALAR)
	private String checkedIndicator;
	
	@BapiParameter(name = "ACTIVE_VERSION", type = ParameterType.SCALAR)
	private String activeVersion;
	
	@BapiParameter(name = "CREATED_AT", type = ParameterType.SCALAR)
	private Integer createdAt;
	
	@BapiParameter(name = "CHANGED_AT", type = ParameterType.SCALAR)
	private Integer changedAt;
	
	@BapiParameter(name = "CREATED_BY", type = ParameterType.SCALAR)
	private String createdBy;
	
	@BapiParameter(name = "CHANGED_BY", type = ParameterType.SCALAR)
	private String changedBy;
	
	@BapiParameter(name = "CONTENT_DESCRIPTION", type = ParameterType.SCALAR)
	private String contentDescription;

	public String getDeleteValue() {
		return deleteValue;
	}

	public void setDeleteValue(String deleteValue) {
		this.deleteValue = deleteValue;
	}

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

	public String getDocumentPart() {
		return documentPart;
	}

	public void setDocumentPart(String documentPart) {
		this.documentPart = documentPart;
	}

	public String getDocumentVersion() {
		return documentVersion;
	}

	public void setDocumentVersion(String documentVersion) {
		this.documentVersion = documentVersion;
	}

	public String getOriginalType() {
		return originalType;
	}

	public void setOriginalType(String originalType) {
		this.originalType = originalType;
	}

	public String getSourceDataCarrier() {
		return sourceDataCarrier;
	}

	public void setSourceDataCarrier(String sourceDataCarrier) {
		this.sourceDataCarrier = sourceDataCarrier;
	}

	public String getStorageCategory() {
		return storageCategory;
	}

	public void setStorageCategory(String storageCategory) {
		this.storageCategory = storageCategory;
	}

	public String getWsApplication() {
		return wsApplication;
	}

	public void setWsApplication(String wsApplication) {
		this.wsApplication = wsApplication;
	}

	public String getDocPath() {
		return docPath;
	}

	public void setDocPath(String docPath) {
		this.docPath = docPath;
	}

	public String getDocFile() {
		return docFile;
	}

	public void setDocFile(String docFile) {
		this.docFile = docFile;
	}

	public String getStatusIntern() {
		return statusIntern;
	}

	public void setStatusIntern(String statusIntern) {
		this.statusIntern = statusIntern;
	}

	public String getStatusExtern() {
		return statusExtern;
	}

	public void setStatusExtern(String statusExtern) {
		this.statusExtern = statusExtern;
	}

	public String getStatusLog() {
		return statusLog;
	}

	public void setStatusLog(String statusLog) {
		this.statusLog = statusLog;
	}

	public String getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(String applicationId) {
		this.applicationId = applicationId;
	}

	public String getFieldId() {
		return fieldId;
	}

	public void setFieldId(String fieldId) {
		this.fieldId = fieldId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getCheckedIndicator() {
		return checkedIndicator;
	}

	public void setCheckedIndicator(String checkedIndicator) {
		this.checkedIndicator = checkedIndicator;
	}

	public String getActiveVersion() {
		return activeVersion;
	}

	public void setActiveVersion(String activeVersion) {
		this.activeVersion = activeVersion;
	}

	public Integer getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Integer createdAt) {
		this.createdAt = createdAt;
	}

	public Integer getChangedAt() {
		return changedAt;
	}

	public void setChangedAt(Integer changedAt) {
		this.changedAt = changedAt;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getChangedBy() {
		return changedBy;
	}

	public void setChangedBy(String changedBy) {
		this.changedBy = changedBy;
	}

	public String getContentDescription() {
		return contentDescription;
	}

	public void setContentDescription(String contentDescription) {
		this.contentDescription = contentDescription;
	}
	
	
	
}

package cl.tarce.sap.defs.tables.mm;

import java.util.Date;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class InvoiceItemData {
	@BapiParameter(name = "INVOICE_DOC_ITEM", type = ParameterType.SCALAR)
	private Integer invoiceDocumentItem;
	@BapiParameter(name = "PO_NUMBER", type = ParameterType.SCALAR)
	private String purchaseOrderNumber;
	@BapiParameter(name = "PO_ITEM", type = ParameterType.SCALAR)
	private Integer purchaseOrderItem;
	@BapiParameter(name = "REF_DOC", type = ParameterType.SCALAR)
	private String referenceDoucment;
	@BapiParameter(name = "REF_DOC_YEAR", type = ParameterType.SCALAR)
	private Integer referenceDocumentYear;
	@BapiParameter(name = "REF_DOC_IT", type = ParameterType.SCALAR)
	private Integer referenceDocumentItem;
	@BapiParameter(name = "DE_CRE_IND", type = ParameterType.SCALAR)
	private String deCreInd;
	@BapiParameter(name = "TAX_CODE", type = ParameterType.SCALAR)
	private String taxCode;
	@BapiParameter(name = "TAXJURCODE", type = ParameterType.SCALAR)
	private String taxJurisdictionCode;
	@BapiParameter(name = "ITEM_AMOUNT", type = ParameterType.SCALAR)
	private Double itemAmount;
	@BapiParameter(name = "QUANTITY", type = ParameterType.SCALAR)
	private Double quantity;
	@BapiParameter(name = "PO_UNIT", type = ParameterType.SCALAR)
	private String purchaseOrderUnitOfMeasure;
	@BapiParameter(name = "PO_UNIT_ISO", type = ParameterType.SCALAR)
	private String purchaseOrderUnitOfMeasureISO;
	@BapiParameter(name = "PO_PR_QNT", type = ParameterType.SCALAR)
	private Double purchaseOrderPurchaseQuantity;
	@BapiParameter(name = "PO_PR_UOM", type = ParameterType.SCALAR)
	private String purchaseOrderPurchaseUnitOfMeasure;
	@BapiParameter(name = "PO_PR_UOM_ISO", type = ParameterType.SCALAR)
	private String purchaseOrderPurchaseUnitOfMeasureISO; 
	@BapiParameter(name = "COND_TYPE", type = ParameterType.SCALAR)
	private String conditionType;
	@BapiParameter(name = "COND_ST_NO", type = ParameterType.SCALAR)
	private Integer conditionStageNumber;
	@BapiParameter(name = "COND_COUNT", type = ParameterType.SCALAR)
	private Integer conditionCount;
	@BapiParameter(name = "SHEET_NO", type = ParameterType.SCALAR)
	private String sheetNumber;
	@BapiParameter(name = "ITEM_TEXT", type = ParameterType.SCALAR)
	private String itemText;
	@BapiParameter(name = "FINAL_INV", type = ParameterType.SCALAR)
	private String finalInvoice;
	@BapiParameter(name = "SHEET_ITEM", type = ParameterType.SCALAR)
	private Integer sheetItem;
	@BapiParameter(name = "GRIR_CLEAR_SRV", type = ParameterType.SCALAR)
	private String grIrClearSrv;
	@BapiParameter(name = "FREIGHT_VEN", type = ParameterType.SCALAR)
	private String freightVendor;
	@BapiParameter(name = "CSHDIS_IND", type = ParameterType.SCALAR)
	private String cshdisInd;
	@BapiParameter(name = "RETENTION_DOCU_CURRENCY", type = ParameterType.SCALAR)
	private Double retentionDocumentCurrency;
	@BapiParameter(name = "RETENTION_PERCENTAGE", type = ParameterType.SCALAR)
	private Double retentionPercentage;
	@BapiParameter(name = "RETENTION_DUE_DATE", type = ParameterType.SCALAR)
	private String retentioDueDate;
	@BapiParameter(name = "NO_RETENTION", type = ParameterType.SCALAR)
	private String noRetention;
	@BapiParameter(name = "VALUATION_TYPE", type = ParameterType.SCALAR)
	private String valuationType;
	@BapiParameter(name = "INV_RELATION", type = ParameterType.SCALAR)
	private Integer invoiceRelation;
	@BapiParameter(name = "INV_ITM_ORIGIN", type = ParameterType.SCALAR)
	private String invoiceItemOrigin;
	public Integer getInvoiceDocumentItem() {
		return invoiceDocumentItem;
	}
	public void setInvoiceDocumentItem(Integer invoiceDocumentItem) {
		this.invoiceDocumentItem = invoiceDocumentItem;
	}
	public String getPurchaseOrderNumber() {
		return purchaseOrderNumber;
	}
	public void setPurchaseOrderNumber(String purchaseOrderNumber) {
		this.purchaseOrderNumber = purchaseOrderNumber;
	}
	public Integer getPurchaseOrderItem() {
		return purchaseOrderItem;
	}
	public void setPurchaseOrderItem(Integer purchaseOrderItem) {
		this.purchaseOrderItem = purchaseOrderItem;
	}
	public String getReferenceDoucment() {
		return referenceDoucment;
	}
	public void setReferenceDoucment(String referenceDoucment) {
		this.referenceDoucment = referenceDoucment;
	}
	public Integer getReferenceDocumentYear() {
		return referenceDocumentYear;
	}
	public void setReferenceDocumentYear(Integer referenceDocumentYear) {
		this.referenceDocumentYear = referenceDocumentYear;
	}
	public Integer getReferenceDocumentItem() {
		return referenceDocumentItem;
	}
	public void setReferenceDocumentItem(Integer referenceDocumentItem) {
		this.referenceDocumentItem = referenceDocumentItem;
	}
	public String getDeCreInd() {
		return deCreInd;
	}
	public void setDeCreInd(String deCreInd) {
		this.deCreInd = deCreInd;
	}
	public String getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(String taxCode) {
		this.taxCode = taxCode;
	}
	public String getTaxJurisdictionCode() {
		return taxJurisdictionCode;
	}
	public void setTaxJurisdictionCode(String taxJurisdictionCode) {
		this.taxJurisdictionCode = taxJurisdictionCode;
	}
	public Double getItemAmount() {
		return itemAmount;
	}
	public void setItemAmount(Double itemAmount) {
		this.itemAmount = itemAmount;
	}
	public Double getQuantity() {
		return quantity;
	}
	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}
	public String getPurchaseOrderUnitOfMeasure() {
		return purchaseOrderUnitOfMeasure;
	}
	public void setPurchaseOrderUnitOfMeasure(String purchaseOrderUnitOfMeasure) {
		this.purchaseOrderUnitOfMeasure = purchaseOrderUnitOfMeasure;
	}
	public String getPurchaseOrderUnitOfMeasureISO() {
		return purchaseOrderUnitOfMeasureISO;
	}
	public void setPurchaseOrderUnitOfMeasureISO(
			String purchaseOrderUnitOfMeasureISO) {
		this.purchaseOrderUnitOfMeasureISO = purchaseOrderUnitOfMeasureISO;
	}
	public Double getPurchaseOrderPurchaseQuantity() {
		return purchaseOrderPurchaseQuantity;
	}
	public void setPurchaseOrderPurchaseQuantity(
			Double purchaseOrderPurchaseQuantity) {
		this.purchaseOrderPurchaseQuantity = purchaseOrderPurchaseQuantity;
	}
	public String getPurchaseOrderPurchaseUnitOfMeasure() {
		return purchaseOrderPurchaseUnitOfMeasure;
	}
	public void setPurchaseOrderPurchaseUnitOfMeasure(
			String purchaseOrderPurchaseUnitOfMeasure) {
		this.purchaseOrderPurchaseUnitOfMeasure = purchaseOrderPurchaseUnitOfMeasure;
	}
	public String getPurchaseOrderPurchaseUnitOfMeasureISO() {
		return purchaseOrderPurchaseUnitOfMeasureISO;
	}
	public void setPurchaseOrderPurchaseUnitOfMeasureISO(
			String purchaseOrderPurchaseUnitOfMeasureISO) {
		this.purchaseOrderPurchaseUnitOfMeasureISO = purchaseOrderPurchaseUnitOfMeasureISO;
	}
	public String getConditionType() {
		return conditionType;
	}
	public void setConditionType(String conditionType) {
		this.conditionType = conditionType;
	}
	public Integer getConditionStageNumber() {
		return conditionStageNumber;
	}
	public void setConditionStageNumber(Integer conditionStageNumber) {
		this.conditionStageNumber = conditionStageNumber;
	}
	public Integer getConditionCount() {
		return conditionCount;
	}
	public void setConditionCount(Integer conditionCount) {
		this.conditionCount = conditionCount;
	}
	public String getSheetNumber() {
		return sheetNumber;
	}
	public void setSheetNumber(String sheetNumber) {
		this.sheetNumber = sheetNumber;
	}
	public String getItemText() {
		return itemText;
	}
	public void setItemText(String itemText) {
		this.itemText = itemText;
	}
	public String getFinalInvoice() {
		return finalInvoice;
	}
	public void setFinalInvoice(String finalInvoice) {
		this.finalInvoice = finalInvoice;
	}
	public Integer getSheetItem() {
		return sheetItem;
	}
	public void setSheetItem(Integer sheetItem) {
		this.sheetItem = sheetItem;
	}
	public String getGrIrClearSrv() {
		return grIrClearSrv;
	}
	public void setGrIrClearSrv(String grIrClearSrv) {
		this.grIrClearSrv = grIrClearSrv;
	}
	public String getFreightVendor() {
		return freightVendor;
	}
	public void setFreightVendor(String freightVendor) {
		this.freightVendor = freightVendor;
	}
	public String getCshdisInd() {
		return cshdisInd;
	}
	public void setCshdisInd(String cshdisInd) {
		this.cshdisInd = cshdisInd;
	}
	public Double getRetentionDocumentCurrency() {
		return retentionDocumentCurrency;
	}
	public void setRetentionDocumentCurrency(Double retentionDocumentCurrency) {
		this.retentionDocumentCurrency = retentionDocumentCurrency;
	}
	public Double getRetentionPercentage() {
		return retentionPercentage;
	}
	public void setRetentionPercentage(Double retentionPercentage) {
		this.retentionPercentage = retentionPercentage;
	}
	public String getRetentioDueDate() {
		return retentioDueDate;
	}
	public void setRetentioDueDate(String retentioDueDate) {
		this.retentioDueDate = retentioDueDate;
	}
	public String getNoRetention() {
		return noRetention;
	}
	public void setNoRetention(String noRetention) {
		this.noRetention = noRetention;
	}
	public String getValuationType() {
		return valuationType;
	}
	public void setValuationType(String valuationType) {
		this.valuationType = valuationType;
	}
	public Integer getInvoiceRelation() {
		return invoiceRelation;
	}
	public void setInvoiceRelation(Integer invoiceRelation) {
		this.invoiceRelation = invoiceRelation;
	}
	public String getInvoiceItemOrigin() {
		return invoiceItemOrigin;
	}
	public void setInvoiceItemOrigin(String invoiceItemOrigin) {
		this.invoiceItemOrigin = invoiceItemOrigin;
	}
	
	
}

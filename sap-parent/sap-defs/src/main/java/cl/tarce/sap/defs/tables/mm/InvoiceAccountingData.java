package cl.tarce.sap.defs.tables.mm;

import java.util.Date;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class InvoiceAccountingData {
	@BapiParameter(name = "INVOICE_DOC_ITEM", type = ParameterType.SCALAR)
	private Integer invoiceDocumentItem;
	@BapiParameter(name = "XUNPL", type = ParameterType.SCALAR)
	private String xUnplanif;
	@BapiParameter(name = "SERIAL_NO", type = ParameterType.SCALAR)
	private Integer serialNumber;
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
	@BapiParameter(name = "GL_ACCOUNT", type = ParameterType.SCALAR)
	private String glAccount;
	@BapiParameter(name = "COSTCENTER", type = ParameterType.SCALAR)
	private String costCenter;
	@BapiParameter(name = "SD_DOC", type = ParameterType.SCALAR)
	private String sdDocument;
	@BapiParameter(name = "SDOC_ITEM", type = ParameterType.SCALAR)
	private Integer sdDocumentItem;
	@BapiParameter(name = "ASSET_NO", type = ParameterType.SCALAR)
	private String assetNumber;
	@BapiParameter(name = "SUB_NUMBER", type = ParameterType.SCALAR)
	private String assetSubNumber;
	@BapiParameter(name = "ORDERID", type = ParameterType.SCALAR)
	private String orderId;
	@BapiParameter(name = "REF_DATE", type = ParameterType.SCALAR)
	private String referenceDate;
	@BapiParameter(name = "CMMT_ITEM", type = ParameterType.SCALAR)
	private String cmmtItem;
	@BapiParameter(name = "FUNDS_CTR", type = ParameterType.SCALAR)
	private String fundsCenter;
	@BapiParameter(name = "FUNC_AREA", type = ParameterType.SCALAR)
	private String functionalArea;
	@BapiParameter(name = "FUND", type = ParameterType.SCALAR)
	private String fund;
	@BapiParameter(name = "BUS_AREA", type = ParameterType.SCALAR)
	private String businessArea;
	@BapiParameter(name = "RL_EST_KEY", type = ParameterType.SCALAR)
	private String realEstateKey;
	@BapiParameter(name = "CO_AREA", type = ParameterType.SCALAR)
	private String controllingArea;
	@BapiParameter(name = "COSTOBJECT", type = ParameterType.SCALAR)
	private String costingObject;
	@BapiParameter(name = "NETWORK", type = ParameterType.SCALAR)
	private String network;
	@BapiParameter(name = "ACTIVITY", type = ParameterType.SCALAR)
	private String activity;
	@BapiParameter(name = "PROFIT_SEGM_NO", type = ParameterType.SCALAR)
	private Integer profitSegmentNumber;
	@BapiParameter(name = "PROFIT_CTR", type = ParameterType.SCALAR)
	private String profitCenter;
	@BapiParameter(name = "WBS_ELEM", type = ParameterType.SCALAR)
	private Integer wbsElement;
	@BapiParameter(name = "GRANT_NBR", type = ParameterType.SCALAR)
	private String grantNumber;
	@BapiParameter(name = "CMMT_ITEM_LONG", type = ParameterType.SCALAR)
	private String cmmtItemLong;
	@BapiParameter(name = "FUNC_AREA_LONG", type = ParameterType.SCALAR)
	private String functionalAreaLong;
	@BapiParameter(name = "BUDGET_PERIOD", type = ParameterType.SCALAR)
	private String buggetPeriod;
	@BapiParameter(name = "DEL_CREATE_DATE", type = ParameterType.SCALAR)
	private String deliveryCreateDate;
	public Integer getInvoiceDocumentItem() {
		return invoiceDocumentItem;
	}
	public void setInvoiceDocumentItem(Integer invoiceDocumentItem) {
		this.invoiceDocumentItem = invoiceDocumentItem;
	}
	public String getxUnplanif() {
		return xUnplanif;
	}
	public void setxUnplanif(String xUnplanif) {
		this.xUnplanif = xUnplanif;
	}
	public Integer getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(Integer serialNumber) {
		this.serialNumber = serialNumber;
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
	public String getGlAccount() {
		return glAccount;
	}
	public void setGlAccount(String glAccount) {
		this.glAccount = glAccount;
	}
	public String getCostCenter() {
		return costCenter;
	}
	public void setCostCenter(String costCenter) {
		this.costCenter = costCenter;
	}
	public String getSdDocument() {
		return sdDocument;
	}
	public void setSdDocument(String sdDocument) {
		this.sdDocument = sdDocument;
	}
	public Integer getSdDocumentItem() {
		return sdDocumentItem;
	}
	public void setSdDocumentItem(Integer sdDocumentItem) {
		this.sdDocumentItem = sdDocumentItem;
	}
	public String getAssetNumber() {
		return assetNumber;
	}
	public void setAssetNumber(String assetNumber) {
		this.assetNumber = assetNumber;
	}
	public String getAssetSubNumber() {
		return assetSubNumber;
	}
	public void setAssetSubNumber(String assetSubNumber) {
		this.assetSubNumber = assetSubNumber;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	public String getReferenceDate() {
		return referenceDate;
	}
	public void setReferenceDate(String referenceDate) {
		this.referenceDate = referenceDate;
	}
	public String getCmmtItem() {
		return cmmtItem;
	}
	public void setCmmtItem(String cmmtItem) {
		this.cmmtItem = cmmtItem;
	}
	public String getFundsCenter() {
		return fundsCenter;
	}
	public void setFundsCenter(String fundsCenter) {
		this.fundsCenter = fundsCenter;
	}
	public String getFunctionalArea() {
		return functionalArea;
	}
	public void setFunctionalArea(String functionalArea) {
		this.functionalArea = functionalArea;
	}
	public String getFund() {
		return fund;
	}
	public void setFund(String fund) {
		this.fund = fund;
	}
	public String getBusinessArea() {
		return businessArea;
	}
	public void setBusinessArea(String businessArea) {
		this.businessArea = businessArea;
	}
	public String getRealEstateKey() {
		return realEstateKey;
	}
	public void setRealEstateKey(String realEstateKey) {
		this.realEstateKey = realEstateKey;
	}
	public String getControllingArea() {
		return controllingArea;
	}
	public void setControllingArea(String controllingArea) {
		this.controllingArea = controllingArea;
	}
	public String getCostingObject() {
		return costingObject;
	}
	public void setCostingObject(String costingObject) {
		this.costingObject = costingObject;
	}
	public String getNetwork() {
		return network;
	}
	public void setNetwork(String network) {
		this.network = network;
	}
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public Integer getProfitSegmentNumber() {
		return profitSegmentNumber;
	}
	public void setProfitSegmentNumber(Integer profitSegmentNumber) {
		this.profitSegmentNumber = profitSegmentNumber;
	}
	public String getProfitCenter() {
		return profitCenter;
	}
	public void setProfitCenter(String profitCenter) {
		this.profitCenter = profitCenter;
	}
	public Integer getWbsElement() {
		return wbsElement;
	}
	public void setWbsElement(Integer wbsElement) {
		this.wbsElement = wbsElement;
	}
	public String getGrantNumber() {
		return grantNumber;
	}
	public void setGrantNumber(String grantNumber) {
		this.grantNumber = grantNumber;
	}
	public String getCmmtItemLong() {
		return cmmtItemLong;
	}
	public void setCmmtItemLong(String cmmtItemLong) {
		this.cmmtItemLong = cmmtItemLong;
	}
	public String getFunctionalAreaLong() {
		return functionalAreaLong;
	}
	public void setFunctionalAreaLong(String functionalAreaLong) {
		this.functionalAreaLong = functionalAreaLong;
	}
	public String getBuggetPeriod() {
		return buggetPeriod;
	}
	public void setBuggetPeriod(String buggetPeriod) {
		this.buggetPeriod = buggetPeriod;
	}
	public String getDeliveryCreateDate() {
		return deliveryCreateDate;
	}
	public void setDeliveryCreateDate(String deliveryCreateDate) {
		this.deliveryCreateDate = deliveryCreateDate;
	}
	
	
}

package cl.tarce.sap.defs.tables.mm;

import java.util.Date;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class InvoiceGLAccountData {
	@BapiParameter(name = "INVOICE_DOC_ITEM", type = ParameterType.SCALAR)
	private Integer invoiceDocumentItem;
	@BapiParameter(name = "GL_ACCOUNT", type = ParameterType.SCALAR)
	private String glAccount;
	@BapiParameter(name = "ITEM_AMOUNT", type = ParameterType.SCALAR)
	private Double itemAmount;
	@BapiParameter(name = "DB_CR_IND", type = ParameterType.SCALAR)
	private String debitCreditIndicator;
	@BapiParameter(name = "NEG_POSTNG", type = ParameterType.SCALAR)
	private String negativePosting;
	@BapiParameter(name = "COMP_CODE", type = ParameterType.SCALAR)
	private String taxCode;
	@BapiParameter(name = "TAXJURCODE", type = ParameterType.SCALAR)
	private String taxJurisdictionCode;
	@BapiParameter(name = "ITEM_TEXT", type = ParameterType.SCALAR)
	private String itemText;
	@BapiParameter(name = "COSTCENTER", type = ParameterType.SCALAR)
	private String costCenter;
	@BapiParameter(name = "SD_DOC", type = ParameterType.SCALAR)
	private String sdDocument;
	@BapiParameter(name = "SDOC_ITEM", type = ParameterType.SCALAR)
	private Integer sdDocumentItem;
	@BapiParameter(name = "ORDERID", type = ParameterType.SCALAR)
	private String orderId;
	@BapiParameter(name = "REF_DATE", type = ParameterType.SCALAR)
	private Date referenceDate;
	@BapiParameter(name = "CMMT_ITEM", type = ParameterType.SCALAR)
	private String cmmtItem;
	@BapiParameter(name = "FUNDS_CTR", type = ParameterType.SCALAR)
	private String fundsCenter;
	@BapiParameter(name = "FUNC_AREA", type = ParameterType.SCALAR)
	private String functionalArea;
	@BapiParameter(name = "PROFIT_CTR", type = ParameterType.SCALAR)
	private String profitCenter;
	@BapiParameter(name = "FUND", type = ParameterType.SCALAR)
	private String fund;
	@BapiParameter(name = "BUS_AREA", type = ParameterType.SCALAR)
	private String businessArea;
	@BapiParameter(name = "TR_PART_BA", type = ParameterType.SCALAR)
	private String tradePartnerBusinessArea;
	@BapiParameter(name = "COSTOBJECT", type = ParameterType.SCALAR)
	private String costingObject;
	@BapiParameter(name = "NETWORK", type = ParameterType.SCALAR)
	private String network;
	@BapiParameter(name = "ACTIVITY", type = ParameterType.SCALAR)
	private String activity;
	@BapiParameter(name = "WBS_ELEM", type = ParameterType.SCALAR)
	private Integer wbsElement;
	@BapiParameter(name = "ACTTYPE", type = ParameterType.SCALAR)
	private String activityType;
	@BapiParameter(name = "RL_EST_KEY", type = ParameterType.SCALAR)
	private String realEstateKey;
	@BapiParameter(name = "PERSON_NO", type = ParameterType.SCALAR)
	private Integer personalNumber;
	@BapiParameter(name = "CO_BUSPROC", type = ParameterType.SCALAR)
	private String coBusinessProcess;
	@BapiParameter(name = "GRANT_NBR", type = ParameterType.SCALAR)
	private String grantNumber;
	@BapiParameter(name = "CMMT_ITEM_LONG", type = ParameterType.SCALAR)
	private String cmmtItemLong;
	@BapiParameter(name = "FUNC_AREA_LONG", type = ParameterType.SCALAR)
	private String functionalAreaLong;
	@BapiParameter(name = "QUANTITY", type = ParameterType.SCALAR)
	private Double quantity;
	@BapiParameter(name = "BASE_UOM", type = ParameterType.SCALAR)
	private String baseUnitOfMeasure;
	@BapiParameter(name = "ALLOC_NMBR", type = ParameterType.SCALAR)
	private String allocNumber;
	@BapiParameter(name = "CSHDIS_IND", type = ParameterType.SCALAR)
	private String cshdisInd;
	@BapiParameter(name = "TAX_BASE_AMOUNT", type = ParameterType.SCALAR)
	private Double taxBaseAmount;
	@BapiParameter(name = "PROFIT_SEGM_NO", type = ParameterType.SCALAR)
	private Integer profitSegmentNumber;
	@BapiParameter(name = "PLANT", type = ParameterType.SCALAR)
	private String plant;
	@BapiParameter(name = "BUDGET_PERIOD", type = ParameterType.SCALAR)
	private String buggetPeriod;

}

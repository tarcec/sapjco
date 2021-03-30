package cl.tarce.sap.defs.tables.basis.bdc;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class BDCMsgColl {
	@BapiParameter(name = "TCODE", type = ParameterType.SCALAR)
	private String tCode;
	
	@BapiParameter(name = "DYNAME", type = ParameterType.SCALAR)
	private String dyName;
	
	@BapiParameter(name = "DYNUMB", type = ParameterType.SCALAR)
	private String dyNumber;
	
	@BapiParameter(name = "MSGTYP", type = ParameterType.SCALAR)
	private String msgType;
	
	@BapiParameter(name = "MSGSPRA", type = ParameterType.SCALAR)
	private String msgLanguage;
	
	@BapiParameter(name = "MSGID", type = ParameterType.SCALAR)
	private String msgId;
	
	@BapiParameter(name = "MSGNR", type = ParameterType.SCALAR)
	private String msgNumber;
	
	@BapiParameter(name = "MSGV1", type = ParameterType.SCALAR)
	private String msgV1;
	
	@BapiParameter(name = "MSGV2", type = ParameterType.SCALAR)
	private String msgV2;
	
	@BapiParameter(name = "MSGV3", type = ParameterType.SCALAR)
	private String msgV3;
	
	@BapiParameter(name = "MSGV4", type = ParameterType.SCALAR)
	private String msgV4;
	
	@BapiParameter(name = "ENV", type = ParameterType.SCALAR)
	private String envirorment;
	
	@BapiParameter(name = "FLDNAME", type = ParameterType.SCALAR)
	private String fieldName;

	public String gettCode() {
		return tCode;
	}

	public void settCode(String tCode) {
		this.tCode = tCode;
	}

	public String getDyName() {
		return dyName;
	}

	public void setDyName(String dyName) {
		this.dyName = dyName;
	}

	public String getDyNumber() {
		return dyNumber;
	}

	public void setDyNumber(String dyNumber) {
		this.dyNumber = dyNumber;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMsgLanguage() {
		return msgLanguage;
	}

	public void setMsgLanguage(String msgLanguage) {
		this.msgLanguage = msgLanguage;
	}

	public String getMsgId() {
		return msgId;
	}

	public void setMsgId(String msgId) {
		this.msgId = msgId;
	}

	public String getMsgNumber() {
		return msgNumber;
	}

	public void setMsgNumber(String msgNumber) {
		this.msgNumber = msgNumber;
	}

	public String getMsgV1() {
		return msgV1;
	}

	public void setMsgV1(String msgV1) {
		this.msgV1 = msgV1;
	}

	public String getMsgV2() {
		return msgV2;
	}

	public void setMsgV2(String msgV2) {
		this.msgV2 = msgV2;
	}

	public String getMsgV3() {
		return msgV3;
	}

	public void setMsgV3(String msgV3) {
		this.msgV3 = msgV3;
	}

	public String getMsgV4() {
		return msgV4;
	}

	public void setMsgV4(String msgV4) {
		this.msgV4 = msgV4;
	}

	public String getEnvirorment() {
		return envirorment;
	}

	public void setEnvirorment(String envirorment) {
		this.envirorment = envirorment;
	}

	public String getFieldName() {
		return fieldName;
	}

	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	
	
}

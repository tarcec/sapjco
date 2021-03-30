package cl.tarce.sap.defs.structures.commons;

import java.io.Serializable;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

/**
 * 
 * @author tarce
 *
 */
public class BapiReturn2 implements Serializable{
	private static final long serialVersionUID = 1L;
	@BapiParameter(name = "TYPE", type = ParameterType.SCALAR)
	private String type;
	@BapiParameter(name = "ID", type = ParameterType.SCALAR)
	private String id;
	@BapiParameter(name = "NUMBER", type = ParameterType.SCALAR)
	private Integer number;
	@BapiParameter(name = "MESSAGE", type = ParameterType.SCALAR)
	private String message;
	@BapiParameter(name = "LOG_NO", type = ParameterType.SCALAR)
	private String logNumber;
	@BapiParameter(name = "LOG_MSG_NO", type = ParameterType.SCALAR)
	private Integer logMessageNumber;
	@BapiParameter(name = "MESSAGE_V1", type = ParameterType.SCALAR)
	private String messageV1;
	@BapiParameter(name = "MESSAGE_V2", type = ParameterType.SCALAR)
	private String messageV2;
	@BapiParameter(name = "MESSAGE_V3", type = ParameterType.SCALAR)
	private String messageV3;
	@BapiParameter(name = "MESSAGE_V4", type = ParameterType.SCALAR)
	private String messageV4;
	@BapiParameter(name = "ROW", type = ParameterType.SCALAR)
	private Integer row;
	@BapiParameter(name = "FIELD", type = ParameterType.SCALAR)
	private String field;
	@BapiParameter(name = "SYSTEM", type = ParameterType.SCALAR)
	private String system;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getLogNumber() {
		return logNumber;
	}
	public void setLogNumber(String logNumber) {
		this.logNumber = logNumber;
	}
	public Integer getLogMessageNumber() {
		return logMessageNumber;
	}
	public void setLogMessageNumber(Integer logMessageNumber) {
		this.logMessageNumber = logMessageNumber;
	}
	public String getMessageV1() {
		return messageV1;
	}
	public void setMessageV1(String messageV1) {
		this.messageV1 = messageV1;
	}
	public String getMessageV2() {
		return messageV2;
	}
	public void setMessageV2(String messageV2) {
		this.messageV2 = messageV2;
	}
	public String getMessageV3() {
		return messageV3;
	}
	public void setMessageV3(String messageV3) {
		this.messageV3 = messageV3;
	}
	public String getMessageV4() {
		return messageV4;
	}
	public void setMessageV4(String messageV4) {
		this.messageV4 = messageV4;
	}
	public Integer getRow() {
		return row;
	}
	public void setRow(Integer row) {
		this.row = row;
	}
	public String getField() {
		return field;
	}
	public void setField(String field) {
		this.field = field;
	}
	public String getSystem() {
		return system;
	}
	public void setSystem(String system) {
		this.system = system;
	}

	
}

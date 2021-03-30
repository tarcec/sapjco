package cl.tarce.sap.defs.tables.commons;

import cl.tarce.sap.core.annotations.BapiParameter;
import cl.tarce.sap.core.annotations.ParameterType;

public class BapiRet2 {
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
	@BapiParameter(name = "PARAMETER", type = ParameterType.SCALAR)
	private String parameter;	
	@BapiParameter(name = "ROW", type = ParameterType.SCALAR)
	private Integer row;
	@BapiParameter(name = "FIELD", type = ParameterType.SCALAR)
	private String field;
	@BapiParameter(name = "SYSTEM", type = ParameterType.SCALAR)
	private String system;

	
	
}

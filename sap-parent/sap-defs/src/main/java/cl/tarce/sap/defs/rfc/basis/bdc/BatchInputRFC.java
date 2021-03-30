package cl.tarce.sap.defs.rfc.basis.bdc;

import java.util.List;

import cl.tarce.sap.core.annotations.BapiClass;
import cl.tarce.sap.core.annotations.BapiInParameter;
import cl.tarce.sap.core.annotations.BapiMethod;
import cl.tarce.sap.core.annotations.BapiOutParameter;
import cl.tarce.sap.core.annotations.ImplType;
import cl.tarce.sap.core.annotations.ParameterType;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.structures.basis.bdc.CTUParams;
import cl.tarce.sap.defs.tables.basis.bdc.BDCData;
import cl.tarce.sap.defs.tables.basis.bdc.BDCMsgColl;

@BapiClass(implType = ImplType.JCO)
public interface BatchInputRFC {
	
	@BapiMethod(method="RFC_CALL_TRANSACTION_USING")
	public void callTransactionUsing(
		@BapiInParameter(name="TCODE", type = ParameterType.SCALAR)
		BapiScalar tCode,
		
		@BapiInParameter(name="MODE", type = ParameterType.SCALAR)
		BapiScalar mode,
		
		@BapiInParameter(name="BT_DATA", type = ParameterType.TABLE, mappingClass = BDCData.class)
		List<BDCData> BDCDataList,
		
		@BapiOutParameter(name="SUBRC", type = ParameterType.SCALAR)
		BapiScalar subRC,
		
		@BapiOutParameter(name="L_ERRORS", type = ParameterType.TABLE, mappingClass = BDCMsgColl.class)
		List<BDCMsgColl> LErrorsList
		);
	
	@BapiMethod(method="ABAP4_CALL_TRANSACTION")
	public void abap4CallTransaction(
		@BapiInParameter(name="TCODE", type = ParameterType.SCALAR)
		BapiScalar tCode,
		
		@BapiInParameter(name="SKIP_SCREEN", type = ParameterType.SCALAR)
		BapiScalar skipScreen,
		
		@BapiInParameter(name="MODE_VAL", type = ParameterType.SCALAR)
		BapiScalar modeVal,
		
		@BapiInParameter(name="UPDATE_VAL", type = ParameterType.SCALAR)
		BapiScalar updateVal,
		
		@BapiInParameter(name="USING_TAB", type = ParameterType.TABLE, mappingClass = BDCData.class)
		List<BDCData> usingTabList,
		
		@BapiOutParameter(name="SUBRC", type = ParameterType.SCALAR)
		BapiScalar subRC,
		
		@BapiOutParameter(name="MESS_TAB", type = ParameterType.TABLE, mappingClass = BDCMsgColl.class)
		List<BDCMsgColl> messageTabList
		);
	
	@BapiMethod(method="/ISDFPS/CALL_TRANSACTION")
	public void isdfpsCallTransaction(
		@BapiInParameter(name="IF_TCODE", type = ParameterType.SCALAR)
		BapiScalar tCode,
		
		@BapiInParameter(name="IF_SKIP_FIRST_SCREEN", type = ParameterType.SCALAR)
		BapiScalar skipScreen,
		
		@BapiInParameter(name="IT_BDCDATA", type = ParameterType.TABLE_AS_PARAM, mappingClass = BDCData.class)
		List<BDCData> bdcDataList,
		
		@BapiInParameter(name="IS_OPTIONS", type = ParameterType.STRUCTURE)
		CTUParams optionsStructure,
		
		@BapiOutParameter(name="ET_MSG", type = ParameterType.TABLE_AS_PARAM, mappingClass = BDCMsgColl.class)
		List<BDCMsgColl> messageTabList
		);
	
	@BapiMethod(method="BDC_RECORD_TRANSACTION")
	public void recordTransaction(
		@BapiInParameter(name="TCODE", type = ParameterType.SCALAR)
		BapiScalar tCode,
		
		@BapiInParameter(name="AUTHORITY_CHECK", type = ParameterType.SCALAR)
		BapiScalar skipScreen,
		
		@BapiInParameter(name="OPTIONS", type = ParameterType.SCALAR)
		BapiScalar modeVal,
		
		@BapiInParameter(name="MODE", type = ParameterType.SCALAR)
		BapiScalar mode,
		
		@BapiInParameter(name="UPDATE", type = ParameterType.SCALAR)
		BapiScalar updateVal,
		
		@BapiOutParameter(name="DYNPROTAB", type = ParameterType.TABLE, mappingClass = BDCData.class)
		List<BDCData> BDCDataList,
		
		@BapiOutParameter(name="MESSTAB", type = ParameterType.TABLE, mappingClass = BDCMsgColl.class)
		List<BDCMsgColl> BDCMessageList
		);
}

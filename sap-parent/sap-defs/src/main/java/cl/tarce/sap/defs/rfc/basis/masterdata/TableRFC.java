package cl.tarce.sap.defs.rfc.basis.masterdata;

import java.util.List;

import cl.tarce.sap.core.annotations.BapiClass;
import cl.tarce.sap.core.annotations.BapiInParameter;
import cl.tarce.sap.core.annotations.BapiMethod;
import cl.tarce.sap.core.annotations.BapiOutParameter;
import cl.tarce.sap.core.annotations.ImplType;
import cl.tarce.sap.core.annotations.ParameterType;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.tables.basis.masterdata.Data;
import cl.tarce.sap.defs.tables.basis.masterdata.Field;
import cl.tarce.sap.defs.tables.basis.masterdata.Option;

@BapiClass(implType = ImplType.JCO)
public interface TableRFC {
	
	@BapiMethod(method="RFC_READ_TABLE")
	public void readTable(
		@BapiInParameter(name="QUERY_TABLE", type = ParameterType.SCALAR)
		BapiScalar queryTable,
		
		@BapiInParameter(name="DELIMITER", type = ParameterType.SCALAR)
		BapiScalar delimiter,
		
		@BapiInParameter(name="NO_DATA", type = ParameterType.SCALAR)
		BapiScalar noData,
		
		@BapiInParameter(name="ROWSKIPS", type = ParameterType.SCALAR)
		BapiScalar rowSkips,
		
		@BapiInParameter(name="ROWCOUNT", type = ParameterType.SCALAR)
		BapiScalar rowCount,
		
		@BapiInParameter(name="OPTIONS", type = ParameterType.TABLE, mappingClass = Option.class)
		List<Option> optionsList,
		
		@BapiInParameter(name="FIELDS", type = ParameterType.TABLE, mappingClass = Field.class)
		List<Field> fieldsList,
		
		@BapiOutParameter(name="DATA", type = ParameterType.TABLE, mappingClass = Data.class)
		List<Data> dataList			
	);
}

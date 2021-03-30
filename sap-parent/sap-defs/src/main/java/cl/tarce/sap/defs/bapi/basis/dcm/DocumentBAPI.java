package cl.tarce.sap.defs.bapi.basis.dcm;

import java.util.List;

import cl.tarce.sap.core.annotations.BapiClass;
import cl.tarce.sap.core.annotations.BapiInParameter;
import cl.tarce.sap.core.annotations.BapiMethod;
import cl.tarce.sap.core.annotations.BapiOutParameter;
import cl.tarce.sap.core.annotations.ImplType;
import cl.tarce.sap.core.annotations.ParameterType;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.structures.basis.dcm.DocumentData;
import cl.tarce.sap.defs.structures.commons.BapiReturn2;
import cl.tarce.sap.defs.tables.basis.dcm.DocumentCharacteristicsValues;
import cl.tarce.sap.defs.tables.basis.dcm.DocumentClassAllocations;
import cl.tarce.sap.defs.tables.basis.dcm.DocumentDescriptions;
import cl.tarce.sap.defs.tables.basis.dcm.DocumentFiles;
import cl.tarce.sap.defs.tables.basis.dcm.DocumentTexts;

@BapiClass(implType = ImplType.JCO)
public interface DocumentBAPI {
	@BapiMethod(method="BAPI_DOCUMENT_CREATE2")
	public void createDocument(
			
			@BapiInParameter(name="DOCUMENTDATA", type = ParameterType.STRUCTURE)
			DocumentData documentData,
			
			@BapiInParameter(name="HOSTNAME", type = ParameterType.SCALAR)
			BapiScalar hostName,
			
			@BapiInParameter(name="DOCBOMCHANGENUMBER", type = ParameterType.SCALAR)
			BapiScalar docBOMChangeNumber,
			
			@BapiInParameter(name="DOCBOMVALIDFROM", type = ParameterType.SCALAR)
			BapiScalar docBOMValidFrom,
			
			@BapiInParameter(name="DOCBOMREVISIONLEVEL", type = ParameterType.SCALAR)
			BapiScalar docBOMVersionLevel,
			
			@BapiInParameter(name="CAD_MODE", type = ParameterType.SCALAR)
			BapiScalar cadMode,
			
			@BapiInParameter(name="PF_FTP_DEST", type = ParameterType.SCALAR)
			BapiScalar ftpDest,
			
			@BapiInParameter(name="PF_HTTP_DEST", type = ParameterType.SCALAR)
			BapiScalar httpDest,
			
			@BapiInParameter(name="DEFAULTCLASS", type = ParameterType.SCALAR)
			BapiScalar defaultClass,
			
			@BapiInParameter(name="CHARACTERISTICVALUES", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.basis.dcm.DocumentCharacteristicsValues.class)
			List<DocumentCharacteristicsValues> documentCharacteristicsValues,
			
			@BapiInParameter(name="CLASSALLOCATIONS", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.basis.dcm.DocumentClassAllocations.class)
			List<DocumentClassAllocations> documentClassAllocations,
			
			@BapiInParameter(name="DOCUMENTDESCRIPTIONS", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.basis.dcm.DocumentDescriptions.class)
			List<DocumentDescriptions> documentDescriptions,
			
			@BapiInParameter(name="DOCUMENTFILES", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.basis.dcm.DocumentFiles.class)
			List<DocumentFiles> documentFiles,
			
			@BapiInParameter(name="LONGTEXTS", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.basis.dcm.DocumentTexts.class)
			List<DocumentTexts> documentTexts,
			
			@BapiOutParameter(name="DOCUMENTTYPE", type = ParameterType.SCALAR)
			BapiScalar documentType,
			
			@BapiOutParameter(name="DOCUMENTNUMBER", type = ParameterType.SCALAR)
			BapiScalar documentNumber,
			
			@BapiOutParameter(name="DOCUMENTPART", type = ParameterType.SCALAR)
			BapiScalar documentPart,
			
			@BapiOutParameter(name="DOCUMENTVERSION", type = ParameterType.SCALAR)
			BapiScalar documentVersion,
			
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2		
			);
	
	@BapiMethod(method="BAPI_DOCUMENT_SETCOMMITMODE")
	public void setCommitMode(			
			@BapiInParameter(name="AUTO_COMMIT", type = ParameterType.SCALAR)
			BapiScalar autoCommit
	);
	
}

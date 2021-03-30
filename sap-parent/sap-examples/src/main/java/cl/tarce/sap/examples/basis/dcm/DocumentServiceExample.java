package cl.tarce.sap.examples.basis.dcm;

import java.util.ArrayList;
import java.util.List;

import cl.tarce.sap.core.conn.BapiConnection;
import cl.tarce.sap.core.execution.BapiExecutor;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.bapi.basis.dcm.DocumentBAPI;
import cl.tarce.sap.defs.structures.basis.dcm.DocumentData;
import cl.tarce.sap.defs.structures.commons.BapiReturn2;
import cl.tarce.sap.defs.tables.basis.dcm.DocumentCharacteristicsValues;
import cl.tarce.sap.defs.tables.basis.dcm.DocumentClassAllocations;
import cl.tarce.sap.defs.tables.basis.dcm.DocumentDescriptions;
import cl.tarce.sap.defs.tables.basis.dcm.DocumentFiles;
import cl.tarce.sap.defs.tables.basis.dcm.DocumentTexts;

public class DocumentServiceExample{
	public void uploadFile() throws Exception{
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
		
		BapiExecutor.initTransaction(bapiConnection);
		
		BapiScalar autoCommit = new BapiScalar("X");
		BapiExecutor.executeFunction(DocumentBAPI.class, 
				"setCommitMode", 
				new Object[]{
					autoCommit
		});
				
		//IN
		DocumentData documentData = new DocumentData();
		documentData.setDocumentType("DMO");
		documentData.setDocumentVersion("00");
		documentData.setDocumentPart("000");
		documentData.setStatusExtern("WR");
		
		BapiScalar hostName = new BapiScalar("corpesqas");
		BapiScalar docBOMChangeNumber = null;
		BapiScalar docBOMValidFrom = null;
		BapiScalar docBOMVersionLevel = null;
		BapiScalar cadMode = null;
		BapiScalar ftpDest = new BapiScalar("SAPFTP");
		BapiScalar httpDest = new BapiScalar("SAPHTTP");
		BapiScalar defaultClass = null;
		
		List<DocumentCharacteristicsValues> documentCharacteristicsValues = null;
		List<DocumentClassAllocations> documentClassAllocations = null;
		
		List<DocumentDescriptions> documentDescriptions = new ArrayList<DocumentDescriptions>();
		DocumentDescriptions documentDescription = new DocumentDescriptions();
		documentDescription.setLanguage("EN");
		documentDescription.setDescription("Test");
		documentDescriptions.add(documentDescription);
		
		List<DocumentFiles> documentFiles = new ArrayList<DocumentFiles>();
		DocumentFiles documentFile = new DocumentFiles();
		documentFile.setDocumentType("DMO");
		documentFile.setDocumentVersion("00");
		documentFile.setDocumentPart("000");
		documentFile.setStatusExtern("WR");
		documentFile.setStorageCategory("DMS_C1_ST");
		documentFile.setDocFile("C:test.txt");
		documentFile.setWsApplication("TXT");
		documentFiles.add(documentFile);
		
		List<DocumentTexts> documentTexts = null;
				
		//OUT
		BapiScalar documentType = new BapiScalar(); 
		BapiScalar documentNumber = new BapiScalar(); 
		BapiScalar documentPart = new BapiScalar(); 
		BapiScalar documentVersion = new BapiScalar(); 
		BapiReturn2 bapiReturn2 = new BapiReturn2(); 	
		
		BapiExecutor.executeFunction(DocumentBAPI.class, 
				"createDocument", 
				new Object[]{
					documentData,
					hostName,
					docBOMChangeNumber,
					docBOMValidFrom,
					docBOMVersionLevel,
					cadMode,
					ftpDest,
					httpDest,
					defaultClass,
					documentCharacteristicsValues,
					documentClassAllocations,
					documentDescriptions,
					documentFiles, 
					documentTexts,
					documentType,
					documentNumber,
					documentPart,
					documentVersion,
					bapiReturn2
		});
		
		BapiExecutor.endTransactionWithCommit();
		
		System.out.println(bapiReturn2);
		
		String a = "2";
	}
	
	public static void main(String args[]) throws Exception{
		DocumentServiceExample documentServiceExample = new DocumentServiceExample();
		documentServiceExample.uploadFile();
	}
}

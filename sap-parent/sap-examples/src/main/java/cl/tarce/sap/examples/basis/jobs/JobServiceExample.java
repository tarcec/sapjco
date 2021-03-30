package cl.tarce.sap.examples.basis.jobs;

import java.util.ArrayList;
import java.util.List;

import cl.tarce.sap.core.conn.BapiConnection;
import cl.tarce.sap.core.execution.BapiExecutor;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.bapi.basis.jobs.JobBAPI;
import cl.tarce.sap.defs.bapi.fi.AccountingDocumentBAPI;
import cl.tarce.sap.defs.structures.basis.jobs.JobArchive;
import cl.tarce.sap.defs.structures.basis.jobs.JobPrintParameters;
import cl.tarce.sap.defs.structures.commons.BapiReturn2;
import cl.tarce.sap.defs.tables.basis.jobs.SpoolList;

public class JobServiceExample {
	public void jobAbastible() throws Exception{
		final BapiScalar ENTERPRISE = new BapiScalar("RTG");
		final BapiScalar PRODUCT = new BapiScalar("CADTE");
		final BapiScalar INTERFACE = new BapiScalar("XBP");
		final BapiScalar VERSION = new BapiScalar("3.0");
				
		//CORPESCA
		BapiConnection bapiConnection = new BapiConnection();
		bapiConnection.setJcoASHost("192.168.0.1");
		bapiConnection.setJcoSYSNr("00");
		bapiConnection.setJcoClient("300");
		bapiConnection.setJcoUser("FOOUSER");
		bapiConnection.setJcoPassword("FOOPASS");
		bapiConnection.setJcoLang("EN");
		
		BapiExecutor.initTransaction(bapiConnection);
		
		BapiScalar sessionID = new BapiScalar();
		BapiReturn2 bapiReturn2 = new BapiReturn2();
		
		//BAPI_XMI_LOGON
		BapiExecutor.executeFunction(JobBAPI.class,
				"xmiLogon", 
				new Object[]{
					ENTERPRISE, 
					PRODUCT, 
					INTERFACE, 
					VERSION,
					sessionID, 
					bapiReturn2
				});
		
		//BAPI_XBP_JOB_OPEN
		BapiScalar jobName 			= new BapiScalar("SAPLSE16N");
		BapiScalar externalUserName = new BapiScalar("DPACHECO");
		
		BapiScalar jobCount = new BapiScalar();
		BapiExecutor.executeFunction(JobBAPI.class,
				"openJob", 
				new Object[]{
					jobName,
					externalUserName,
					jobCount, 
					bapiReturn2
				});
		
		
		//BAPI_XBP_JOB_ADD_ABAP_STEP
		BapiScalar abapProgramName		= new BapiScalar("SAPLSE16N");
		BapiScalar abapVariantName		= new BapiScalar("VTACT001");
		BapiScalar sapUserName			= new BapiScalar("DPACHECO");
		BapiScalar language				= null;
		JobPrintParameters jobPrintParameters	= null;
		JobArchive jobArchive					= null;		
		
		BapiScalar stepNumber = new BapiScalar();
		BapiExecutor.executeFunction(JobBAPI.class,
				"addABAPStepForJob", 
				new Object[]{
					jobName,
					jobCount,
					externalUserName,
					abapProgramName,
					abapVariantName,
					sapUserName,
					language,
					jobPrintParameters,
					jobArchive,
					stepNumber,
					bapiReturn2
				});
		
		
		//BAPI_XBP_JOB_CLOSE
		BapiExecutor.executeFunction(JobBAPI.class,
				"closeJob", 
				new Object[]{
					jobName,
					jobCount,
					externalUserName,
					bapiReturn2
				});	
				
		//BAPI_XBP_JOB_START_IMMEDIATELY
		BapiScalar targetServer 		= new BapiScalar("corperqas_CEQ_00");
		BapiScalar targetGroup 			= null;
		
		BapiExecutor.executeFunction(JobBAPI.class,
				"startJobInmediately", 
				new Object[]{
					jobName,
					jobCount,
					externalUserName,
					targetServer,
					targetGroup,
					bapiReturn2
				});	
		
		//VERIFICAR TERMINO DEL JOB
		Integer flag = 0;
		while(flag == 0){
			//BAPI_XBP_JOB_STATUS_GET
			BapiScalar status = new BapiScalar();
			BapiExecutor.executeFunction(JobBAPI.class,
					"getJobStatus", 
					new Object[]{
						jobName,
						jobCount,
						externalUserName,
						status,
						bapiReturn2
					});
			
			
			if(status.getStringValue().equals("F")){
				flag = 1;
			}
		}
		
		//BAPI_XBP_JOB_SPOOLLIST_READ
		List<SpoolList> spoolList = new ArrayList<SpoolList>();
		BapiExecutor.executeFunction(JobBAPI.class,
				"jobSpoolListRead", 
				new Object[]{
					jobName, //JOBNAME
					jobCount, //JOBCOUNT
					externalUserName, //EXTERNALUSENAME
					stepNumber,  //STEPNUMBER
					bapiReturn2,
					spoolList
				});	
		
		for(SpoolList line: spoolList)
			System.out.println(line.getLine());
				
		//BAPI_XMI_LOGOFF
		BapiExecutor.executeFunction(JobBAPI.class,
				"xmiLogoff", 
				new Object[]{
					INTERFACE,
					bapiReturn2
				});	
	
		String a = "2";
		a = "2"; 
	}
	
	
	public static void main(String args[]) throws Exception{
		JobServiceExample jobServiceExample = new JobServiceExample();
		jobServiceExample.jobAbastible();
	}
}

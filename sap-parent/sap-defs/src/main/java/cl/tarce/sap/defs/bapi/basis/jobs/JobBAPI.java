package cl.tarce.sap.defs.bapi.basis.jobs;

import java.util.List;

import cl.tarce.sap.core.annotations.BapiClass;
import cl.tarce.sap.core.annotations.BapiInParameter;
import cl.tarce.sap.core.annotations.BapiMethod;
import cl.tarce.sap.core.annotations.BapiOutParameter;
import cl.tarce.sap.core.annotations.ImplType;
import cl.tarce.sap.core.annotations.ParameterType;
import cl.tarce.sap.core.scalars.BapiScalar;
import cl.tarce.sap.defs.structures.basis.jobs.JobArchive;
import cl.tarce.sap.defs.structures.basis.jobs.JobPrintParameters;
import cl.tarce.sap.defs.structures.basis.jobs.JobSelectParam;
import cl.tarce.sap.defs.structures.commons.BapiReturn2;
import cl.tarce.sap.defs.tables.basis.jobs.Job;
import cl.tarce.sap.defs.tables.basis.jobs.SpoolList;
import cl.tarce.sap.defs.tables.basis.jobs.XMIVersions;

/**
 * 
 * @author tarce
 *
 */
@BapiClass(implType = ImplType.JCO)
public interface JobBAPI{
	
	@BapiMethod(method="BAPI_XMI_LOGON")
	public void xmiLogon(
			@BapiInParameter(name="EXTCOMPANY", type = ParameterType.SCALAR)
			BapiScalar extCompany,
			@BapiInParameter(name="EXTPRODUCT", type = ParameterType.SCALAR)
			BapiScalar extProduct,
			@BapiInParameter(name="INTERFACE", type = ParameterType.SCALAR)
			BapiScalar interf,
			@BapiInParameter(name="VERSION", type = ParameterType.SCALAR)
			BapiScalar version,
			@BapiOutParameter(name="SESSIONID", type = ParameterType.SCALAR)
			BapiScalar sessionID,
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2			
			);
	
	@BapiMethod(method="BAPI_XMI_LOGOFF")
	public void xmiLogoff(
			@BapiInParameter(name="INTERFACE", type = ParameterType.SCALAR)
			BapiScalar interf,
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2);
	
	@BapiMethod(method="BAPI_XMI_GET_VERSIONS")
	public void xmiGetVersions(
			@BapiInParameter(name="INTERFACE", type = ParameterType.SCALAR)
			BapiScalar interf,
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2,
			@BapiOutParameter(name="VERSIONS", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.basis.jobs.XMIVersions.class)
			List<XMIVersions> xmiVersionsList	
			);
				
	@BapiMethod(method="BAPI_XBP_JOB_SPOOLLIST_READ")
	public void jobSpoolListRead(
			@BapiInParameter(name="JOBNAME", type = ParameterType.SCALAR)
			BapiScalar jobName,
			@BapiInParameter(name="JOBCOUNT", type = ParameterType.SCALAR)
			BapiScalar jobCount,
			@BapiInParameter(name="EXTERNAL_USER_NAME", type = ParameterType.SCALAR)
			BapiScalar externalUserName,
			@BapiInParameter(name="STEP_NUMBER", type = ParameterType.SCALAR)
			BapiScalar stepNumber,
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2,
			@BapiOutParameter(name="SPOOL_LIST", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.basis.jobs.SpoolList.class)
			List<SpoolList> spoolList			
			);
	
	@BapiMethod(method="BAPI_XBP_JOB_SELECT")
	public void selectJobs(
			@BapiInParameter(name="EXTERNAL_USER_NAME", type = ParameterType.SCALAR)
			BapiScalar username,
			@BapiInParameter(name="JOB_SELECT_PARAM", type = ParameterType.STRUCTURE)
			JobSelectParam jobSelectParam,
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2,
			@BapiOutParameter(name="SELECTED_JOBS", type = ParameterType.TABLE, mappingClass = cl.tarce.sap.defs.tables.basis.jobs.Job.class)
			List<Job> jobList
			);
	
	@BapiMethod(method="BAPI_XBP_JOB_OPEN")
	public void openJob(
			@BapiInParameter(name="JOBNAME", type = ParameterType.SCALAR)
			BapiScalar jobName,
			@BapiInParameter(name="EXTERNAL_USER_NAME", type = ParameterType.SCALAR)
			BapiScalar externalUserName,
			@BapiOutParameter(name="JOBCOUNT", type = ParameterType.SCALAR)
			BapiScalar jobCount,
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2
			);
	
	@BapiMethod(method="BAPI_XBP_JOB_ADD_ABAP_STEP")
	public void addABAPStepForJob(
			@BapiInParameter(name="JOBNAME", type = ParameterType.SCALAR)
			BapiScalar jobName,
			@BapiInParameter(name="JOBCOUNT", type = ParameterType.SCALAR)
			BapiScalar jobCount,
			@BapiInParameter(name="EXTERNAL_USER_NAME", type = ParameterType.SCALAR)
			BapiScalar externalUserName,
			@BapiInParameter(name="ABAP_PROGRAM_NAME", type = ParameterType.SCALAR)
			BapiScalar abapProgramName,
			@BapiInParameter(name="ABAP_VARIANT_NAME", type = ParameterType.SCALAR)
			BapiScalar abapVariantName,
			@BapiInParameter(name="SAP_USER_NAME", type = ParameterType.SCALAR)
			BapiScalar sapUserName,
			@BapiInParameter(name="LANGUAGE", type = ParameterType.SCALAR)
			BapiScalar language,
			@BapiInParameter(name="PRINT_PARAMETERS", type = ParameterType.STRUCTURE)
			JobPrintParameters jobPrintParameters,
			@BapiInParameter(name="ARCHIVE_PARAMETERS", type = ParameterType.STRUCTURE)
			JobArchive jobArchive,			
			@BapiOutParameter(name="STEP_NUMBER", type = ParameterType.SCALAR)
			BapiScalar stepNumber,
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2			
			);
	
	@BapiMethod(method="BAPI_XBP_JOB_CLOSE")
	public void closeJob(
			@BapiInParameter(name="JOBNAME", type = ParameterType.SCALAR)
			BapiScalar jobName,
			@BapiInParameter(name="JOBCOUNT", type = ParameterType.SCALAR)
			BapiScalar jobCount,
			@BapiInParameter(name="EXTERNAL_USER_NAME", type = ParameterType.SCALAR)
			BapiScalar externalUserName,
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2		
			);
	
	@BapiMethod(method="BAPI_XBP_JOB_START_IMMEDIATELY")
	public void startJobInmediately(
			@BapiInParameter(name="JOBNAME", type = ParameterType.SCALAR)
			BapiScalar jobName,
			@BapiInParameter(name="JOBCOUNT", type = ParameterType.SCALAR)
			BapiScalar jobCount,
			@BapiInParameter(name="EXTERNAL_USER_NAME", type = ParameterType.SCALAR)
			BapiScalar externalUserName,
			@BapiInParameter(name="TARGET_SERVER", type = ParameterType.SCALAR)
			BapiScalar targetServer,
			@BapiInParameter(name="TARGET_GROUP", type = ParameterType.SCALAR)
			BapiScalar targetGroup,
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2
			);
	
	@BapiMethod(method="BAPI_XBP_JOB_STATUS_GET")
	public void getJobStatus(
			@BapiInParameter(name="JOBNAME", type = ParameterType.SCALAR)
			BapiScalar jobName,
			@BapiInParameter(name="JOBCOUNT", type = ParameterType.SCALAR)
			BapiScalar jobCount,
			@BapiInParameter(name="EXTERNAL_USER_NAME", type = ParameterType.SCALAR)
			BapiScalar externalUserName,
			@BapiOutParameter(name="STATUS", type = ParameterType.SCALAR)
			BapiScalar status,
			@BapiOutParameter(name="RETURN", type = ParameterType.STRUCTURE)
			BapiReturn2 bapiReturn2
			);
	
}

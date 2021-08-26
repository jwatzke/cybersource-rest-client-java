/*
 * CyberSource Merged Spec
 * All CyberSource API specs merged together. These are available at https://developer.cybersource.com/api/reference/api-reference.html
 *
 * OpenAPI spec version: 0.0.1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package Api;

import Invokers.ApiCallback;
import Invokers.ApiClient;
import Invokers.ApiException;
import Invokers.ApiResponse;
import Invokers.Configuration;
import Invokers.Pair;
import Invokers.ProgressRequestBody;
import Invokers.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;
import java.io.InputStream;


import Model.CreateAdhocReportRequest;
import org.joda.time.DateTime;
import Model.ReportingV3ReportsGet200Response;
import Model.ReportingV3ReportsIdGet200Response;
import Model.Reportingv3ReportDownloadsGet400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReportsApi {
    private static Logger logger = LogManager.getLogger(ReportsApi.class);
    
    private ApiClient apiClient;

    public ReportsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReportsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for createReport
     * @param createAdhocReportRequest Report subscription request payload (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call createReportCall(CreateAdhocReportRequest createAdhocReportRequest, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = createAdhocReportRequest;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/reports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call createReportValidateBeforeCall(CreateAdhocReportRequest createAdhocReportRequest, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'createAdhocReportRequest' is set
        if (createAdhocReportRequest == null) {
        	logger.error("Missing the required parameter 'createAdhocReportRequest' when calling createReport(Async)");
            throw new ApiException("Missing the required parameter 'createAdhocReportRequest' when calling createReport(Async)");
        }
        
        
        okhttp3.Call call = createReportCall(createAdhocReportRequest, organizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Create Adhoc Report
     * Create a one-time report. You must specify the type of report in reportDefinitionName. For a list of values for reportDefinitionName, see the [Reporting Developer Guide](https://www.cybersource.com/developers/documentation/reporting_and_reconciliation) 
     * @param createAdhocReportRequest Report subscription request payload (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void createReport(CreateAdhocReportRequest createAdhocReportRequest, String organizationId) throws ApiException {
    	logger.info("CALL TO METHOD 'createReport' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        createReportWithHttpInfo(createAdhocReportRequest, organizationId);
    }

    /**
     * Create Adhoc Report
     * Create a one-time report. You must specify the type of report in reportDefinitionName. For a list of values for reportDefinitionName, see the [Reporting Developer Guide](https://www.cybersource.com/developers/documentation/reporting_and_reconciliation) 
     * @param createAdhocReportRequest Report subscription request payload (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<Void> createReportWithHttpInfo(CreateAdhocReportRequest createAdhocReportRequest, String organizationId) throws ApiException {
        okhttp3.Call call = createReportValidateBeforeCall(createAdhocReportRequest, organizationId, null, null);
        return apiClient.execute(call);
    }

    /**
     * Create Adhoc Report (asynchronously)
     * Create a one-time report. You must specify the type of report in reportDefinitionName. For a list of values for reportDefinitionName, see the [Reporting Developer Guide](https://www.cybersource.com/developers/documentation/reporting_and_reconciliation) 
     * @param createAdhocReportRequest Report subscription request payload (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call createReportAsync(CreateAdhocReportRequest createAdhocReportRequest, String organizationId, final ApiCallback<Void> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = createReportValidateBeforeCall(createAdhocReportRequest, organizationId, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getReportByReportId
     * @param reportId Valid Report Id (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getReportByReportIdCall(String reportId, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/reports/{reportId}"
            .replaceAll("\\{" + "reportId" + "\\}", apiClient.escapeString(reportId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json", "application/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call getReportByReportIdValidateBeforeCall(String reportId, String organizationId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'reportId' is set
        if (reportId == null) {
        	logger.error("Missing the required parameter 'reportId' when calling getReportByReportId(Async)");
            throw new ApiException("Missing the required parameter 'reportId' when calling getReportByReportId(Async)");
        }
        
        
        okhttp3.Call call = getReportByReportIdCall(reportId, organizationId, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Report Based on Report Id
     * Download a report using the reportId value. If you don’t already know this value, you can obtain it using the Retrieve available reports call. 
     * @param reportId Valid Report Id (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @return ReportingV3ReportsIdGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReportingV3ReportsIdGet200Response getReportByReportId(String reportId, String organizationId) throws ApiException {
    	logger.info("CALL TO METHOD 'getReportByReportId' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<ReportingV3ReportsIdGet200Response> resp = getReportByReportIdWithHttpInfo(reportId, organizationId);
        logger.info("CALL TO METHOD 'getReportByReportId' ENDED");
        if(resp != null)
        {
            return resp.getData();
        }
        else 
        {
            logger.error("CALL TO METHOD 'getReportByReportId' FAILED DUE TO AN EXCEPTION");
            return null;
        }
    }

    /**
     * Get Report Based on Report Id
     * Download a report using the reportId value. If you don’t already know this value, you can obtain it using the Retrieve available reports call. 
     * @param reportId Valid Report Id (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @return ApiResponse&lt;ReportingV3ReportsIdGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReportingV3ReportsIdGet200Response> getReportByReportIdWithHttpInfo(String reportId, String organizationId) throws ApiException {
        okhttp3.Call call = getReportByReportIdValidateBeforeCall(reportId, organizationId, null, null);
        Type localVarReturnType = new TypeToken<ReportingV3ReportsIdGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Report Based on Report Id (asynchronously)
     * Download a report using the reportId value. If you don’t already know this value, you can obtain it using the Retrieve available reports call. 
     * @param reportId Valid Report Id (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getReportByReportIdAsync(String reportId, String organizationId, final ApiCallback<ReportingV3ReportsIdGet200Response> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = getReportByReportIdValidateBeforeCall(reportId, organizationId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReportingV3ReportsIdGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for searchReports
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param timeQueryType Specify time you would like to search  Valid values: - reportTimeFrame - executedTime  (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param reportMimeType Valid Report Format  Valid values: - application/xml - text/csv  (optional)
     * @param reportFrequency Valid Report Frequency  Valid values: - DAILY - WEEKLY - MONTHLY - USER_DEFINED - ADHOC  (optional)
     * @param reportName Valid Report Name (optional)
     * @param reportDefinitionId Valid Report Definition Id (optional)
     * @param reportStatus Valid Report Status  Valid values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call searchReportsCall(DateTime startTime, DateTime endTime, String timeQueryType, String organizationId, String reportMimeType, String reportFrequency, String reportName, Integer reportDefinitionId, String reportStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/reporting/v3/reports";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (organizationId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "organizationId", organizationId));
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));
        if (timeQueryType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "timeQueryType", timeQueryType));
        if (reportMimeType != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportMimeType", reportMimeType));
        if (reportFrequency != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportFrequency", reportFrequency));
        if (reportName != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportName", reportName));
        if (reportDefinitionId != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportDefinitionId", reportDefinitionId));
        if (reportStatus != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "reportStatus", reportStatus));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json;charset=utf-8"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().newBuilder().addNetworkInterceptor(new okhttp3.Interceptor() {
                @Override
                public okhttp3.Response intercept(okhttp3.Interceptor.Chain chain) throws IOException {
                    okhttp3.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call searchReportsValidateBeforeCall(DateTime startTime, DateTime endTime, String timeQueryType, String organizationId, String reportMimeType, String reportFrequency, String reportName, Integer reportDefinitionId, String reportStatus, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'startTime' is set
        if (startTime == null) {
        	logger.error("Missing the required parameter 'startTime' when calling searchReports(Async)");
            throw new ApiException("Missing the required parameter 'startTime' when calling searchReports(Async)");
        }
        
        // verify the required parameter 'endTime' is set
        if (endTime == null) {
        	logger.error("Missing the required parameter 'endTime' when calling searchReports(Async)");
            throw new ApiException("Missing the required parameter 'endTime' when calling searchReports(Async)");
        }
        
        // verify the required parameter 'timeQueryType' is set
        if (timeQueryType == null) {
        	logger.error("Missing the required parameter 'timeQueryType' when calling searchReports(Async)");
            throw new ApiException("Missing the required parameter 'timeQueryType' when calling searchReports(Async)");
        }
        
        
        okhttp3.Call call = searchReportsCall(startTime, endTime, timeQueryType, organizationId, reportMimeType, reportFrequency, reportName, reportDefinitionId, reportStatus, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Retrieve Available Reports
     * Retrieve a list of the available reports to which you are subscribed. This will also give you the reportId value, which you can also use to download a report. 
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param timeQueryType Specify time you would like to search  Valid values: - reportTimeFrame - executedTime  (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param reportMimeType Valid Report Format  Valid values: - application/xml - text/csv  (optional)
     * @param reportFrequency Valid Report Frequency  Valid values: - DAILY - WEEKLY - MONTHLY - USER_DEFINED - ADHOC  (optional)
     * @param reportName Valid Report Name (optional)
     * @param reportDefinitionId Valid Report Definition Id (optional)
     * @param reportStatus Valid Report Status  Valid values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA  (optional)
     * @return ReportingV3ReportsGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ReportingV3ReportsGet200Response searchReports(DateTime startTime, DateTime endTime, String timeQueryType, String organizationId, String reportMimeType, String reportFrequency, String reportName, Integer reportDefinitionId, String reportStatus) throws ApiException {
    	logger.info("CALL TO METHOD 'searchReports' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<ReportingV3ReportsGet200Response> resp = searchReportsWithHttpInfo(startTime, endTime, timeQueryType, organizationId, reportMimeType, reportFrequency, reportName, reportDefinitionId, reportStatus);
        logger.info("CALL TO METHOD 'searchReports' ENDED");
        if(resp != null)
        {
            return resp.getData();
        }
        else 
        {
            logger.error("CALL TO METHOD 'searchReports' FAILED DUE TO AN EXCEPTION");
            return null;
        }
    }

    /**
     * Retrieve Available Reports
     * Retrieve a list of the available reports to which you are subscribed. This will also give you the reportId value, which you can also use to download a report. 
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param timeQueryType Specify time you would like to search  Valid values: - reportTimeFrame - executedTime  (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param reportMimeType Valid Report Format  Valid values: - application/xml - text/csv  (optional)
     * @param reportFrequency Valid Report Frequency  Valid values: - DAILY - WEEKLY - MONTHLY - USER_DEFINED - ADHOC  (optional)
     * @param reportName Valid Report Name (optional)
     * @param reportDefinitionId Valid Report Definition Id (optional)
     * @param reportStatus Valid Report Status  Valid values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA  (optional)
     * @return ApiResponse&lt;ReportingV3ReportsGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<ReportingV3ReportsGet200Response> searchReportsWithHttpInfo(DateTime startTime, DateTime endTime, String timeQueryType, String organizationId, String reportMimeType, String reportFrequency, String reportName, Integer reportDefinitionId, String reportStatus) throws ApiException {
        okhttp3.Call call = searchReportsValidateBeforeCall(startTime, endTime, timeQueryType, organizationId, reportMimeType, reportFrequency, reportName, reportDefinitionId, reportStatus, null, null);
        Type localVarReturnType = new TypeToken<ReportingV3ReportsGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Retrieve Available Reports (asynchronously)
     * Retrieve a list of the available reports to which you are subscribed. This will also give you the reportId value, which you can also use to download a report. 
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)  **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ (e.g. 2018-01-01T00:00:00.000Z)  (required)
     * @param timeQueryType Specify time you would like to search  Valid values: - reportTimeFrame - executedTime  (required)
     * @param organizationId Valid Cybersource Organization Id (optional)
     * @param reportMimeType Valid Report Format  Valid values: - application/xml - text/csv  (optional)
     * @param reportFrequency Valid Report Frequency  Valid values: - DAILY - WEEKLY - MONTHLY - USER_DEFINED - ADHOC  (optional)
     * @param reportName Valid Report Name (optional)
     * @param reportDefinitionId Valid Report Definition Id (optional)
     * @param reportStatus Valid Report Status  Valid values: - COMPLETED - PENDING - QUEUED - RUNNING - ERROR - NO_DATA  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call searchReportsAsync(DateTime startTime, DateTime endTime, String timeQueryType, String organizationId, String reportMimeType, String reportFrequency, String reportName, Integer reportDefinitionId, String reportStatus, final ApiCallback<ReportingV3ReportsGet200Response> callback) throws ApiException {

        this.apiClient.setComputationStartTime(System.nanoTime());
        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        okhttp3.Call call = searchReportsValidateBeforeCall(startTime, endTime, timeQueryType, organizationId, reportMimeType, reportFrequency, reportName, reportDefinitionId, reportStatus, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<ReportingV3ReportsGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

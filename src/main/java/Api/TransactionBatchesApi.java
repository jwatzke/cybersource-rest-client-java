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


import org.joda.time.DateTime;
import org.joda.time.LocalDate;
import Model.PtsV1TransactionBatchesGet200Response;
import Model.PtsV1TransactionBatchesGet400Response;
import Model.PtsV1TransactionBatchesGet500Response;
import Model.PtsV1TransactionBatchesIdGet200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TransactionBatchesApi {
    private static Logger logger = LogManager.getLogger(TransactionBatchesApi.class);
    
    private ApiClient apiClient;

    public TransactionBatchesApi() {
        this(Configuration.getDefaultApiClient());
    }

    public TransactionBatchesApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getTransactionBatchDetails
     * @param id The batch id assigned for the template. (required)
     * @param uploadDate Date in which the original batch file was uploaded. Date must be in ISO-8601 format. Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14) **Example date format:**  - yyyy-MM-dd  (optional)
     * @param status Allows you to filter by rejected response.  Valid values: - Rejected  (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getTransactionBatchDetailsCall(String id, LocalDate uploadDate, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/pts/v1/transaction-batch-details/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (uploadDate != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "uploadDate", uploadDate));
        if (status != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "status", status));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "text/csv", "application/xml", "text/vnd.cybersource.map-csv"
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
    private okhttp3.Call getTransactionBatchDetailsValidateBeforeCall(String id, LocalDate uploadDate, String status, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
        	logger.error("Missing the required parameter 'id' when calling getTransactionBatchDetails(Async)");
            throw new ApiException("Missing the required parameter 'id' when calling getTransactionBatchDetails(Async)");
        }
        
        
        okhttp3.Call call = getTransactionBatchDetailsCall(id, uploadDate, status, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Transaction Details for a given Batch Id
     * Provides real-time detailed status information about the transactions that you previously uploaded in the Business Center or processed with the Offline Transaction File Submission service. 
     * @param id The batch id assigned for the template. (required)
     * @param uploadDate Date in which the original batch file was uploaded. Date must be in ISO-8601 format. Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14) **Example date format:**  - yyyy-MM-dd  (optional)
     * @param status Allows you to filter by rejected response.  Valid values: - Rejected  (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public void getTransactionBatchDetails(String id, LocalDate uploadDate, String status) throws ApiException {
    	logger.info("CALL TO METHOD 'getTransactionBatchDetails' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        getTransactionBatchDetailsWithHttpInfo(id, uploadDate, status);

    }

    /**
     * Get Transaction Details for a given Batch Id
     * Provides real-time detailed status information about the transactions that you previously uploaded in the Business Center or processed with the Offline Transaction File Submission service. 
     * @param id The batch id assigned for the template. (required)
     * @param uploadDate Date in which the original batch file was uploaded. Date must be in ISO-8601 format. Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14) **Example date format:**  - yyyy-MM-dd  (optional)
     * @param status Allows you to filter by rejected response.  Valid values: - Rejected  (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InputStream> getTransactionBatchDetailsWithHttpInfo(String id, LocalDate uploadDate, String status) throws ApiException {
        okhttp3.Call call = getTransactionBatchDetailsValidateBeforeCall(id, uploadDate, status, null, null);
        return apiClient.execute(call);
    }

    /**
     * Get Transaction Details for a given Batch Id (asynchronously)
     * Provides real-time detailed status information about the transactions that you previously uploaded in the Business Center or processed with the Offline Transaction File Submission service. 
     * @param id The batch id assigned for the template. (required)
     * @param uploadDate Date in which the original batch file was uploaded. Date must be in ISO-8601 format. Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14) **Example date format:**  - yyyy-MM-dd  (optional)
     * @param status Allows you to filter by rejected response.  Valid values: - Rejected  (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getTransactionBatchDetailsAsync(String id, LocalDate uploadDate, String status, final ApiCallback<Void> callback) throws ApiException {

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

        okhttp3.Call call = getTransactionBatchDetailsValidateBeforeCall(id, uploadDate, status, progressListener, progressRequestListener);
        apiClient.executeAsync(call, callback);
        return call;
    }
    /**
     * Build call for getTransactionBatchId
     * @param id The batch id assigned for the template. (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getTransactionBatchIdCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/pts/v1/transaction-batches/{id}"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

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
    private okhttp3.Call getTransactionBatchIdValidateBeforeCall(String id, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
        	logger.error("Missing the required parameter 'id' when calling getTransactionBatchId(Async)");
            throw new ApiException("Missing the required parameter 'id' when calling getTransactionBatchId(Async)");
        }
        
        
        okhttp3.Call call = getTransactionBatchIdCall(id, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get Individual Batch File
     * Provide the search range
     * @param id The batch id assigned for the template. (required)
     * @return PtsV1TransactionBatchesIdGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV1TransactionBatchesIdGet200Response getTransactionBatchId(String id) throws ApiException {
    	logger.info("CALL TO METHOD 'getTransactionBatchId' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<PtsV1TransactionBatchesIdGet200Response> resp = getTransactionBatchIdWithHttpInfo(id);
        logger.info("CALL TO METHOD 'getTransactionBatchId' ENDED");
        return resp.getData();
    }

    /**
     * Get Individual Batch File
     * Provide the search range
     * @param id The batch id assigned for the template. (required)
     * @return ApiResponse&lt;PtsV1TransactionBatchesIdGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV1TransactionBatchesIdGet200Response> getTransactionBatchIdWithHttpInfo(String id) throws ApiException {
        okhttp3.Call call = getTransactionBatchIdValidateBeforeCall(id, null, null);
        Type localVarReturnType = new TypeToken<PtsV1TransactionBatchesIdGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get Individual Batch File (asynchronously)
     * Provide the search range
     * @param id The batch id assigned for the template. (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getTransactionBatchIdAsync(String id, final ApiCallback<PtsV1TransactionBatchesIdGet200Response> callback) throws ApiException {

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

        okhttp3.Call call = getTransactionBatchIdValidateBeforeCall(id, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV1TransactionBatchesIdGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for getTransactionBatches
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call getTransactionBatchesCall(DateTime startTime, DateTime endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;
        
        // create path and map variables
        String localVarPath = "/pts/v1/transaction-batches";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        if (startTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "startTime", startTime));
        if (endTime != null)
        localVarQueryParams.addAll(apiClient.parameterToPairs("", "endTime", endTime));

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
    private okhttp3.Call getTransactionBatchesValidateBeforeCall(DateTime startTime, DateTime endTime, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'startTime' is set
        if (startTime == null) {
        	logger.error("Missing the required parameter 'startTime' when calling getTransactionBatches(Async)");
            throw new ApiException("Missing the required parameter 'startTime' when calling getTransactionBatches(Async)");
        }
        
        // verify the required parameter 'endTime' is set
        if (endTime == null) {
        	logger.error("Missing the required parameter 'endTime' when calling getTransactionBatches(Async)");
            throw new ApiException("Missing the required parameter 'endTime' when calling getTransactionBatches(Async)");
        }
        
        
        okhttp3.Call call = getTransactionBatchesCall(startTime, endTime, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Get a List of Batch Files
     * Provide the search range
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @return PtsV1TransactionBatchesGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV1TransactionBatchesGet200Response getTransactionBatches(DateTime startTime, DateTime endTime) throws ApiException {
    	logger.info("CALL TO METHOD 'getTransactionBatches' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<PtsV1TransactionBatchesGet200Response> resp = getTransactionBatchesWithHttpInfo(startTime, endTime);
        logger.info("CALL TO METHOD 'getTransactionBatches' ENDED");
        return resp.getData();
    }

    /**
     * Get a List of Batch Files
     * Provide the search range
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @return ApiResponse&lt;PtsV1TransactionBatchesGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV1TransactionBatchesGet200Response> getTransactionBatchesWithHttpInfo(DateTime startTime, DateTime endTime) throws ApiException {
        okhttp3.Call call = getTransactionBatchesValidateBeforeCall(startTime, endTime, null, null);
        Type localVarReturnType = new TypeToken<PtsV1TransactionBatchesGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Get a List of Batch Files (asynchronously)
     * Provide the search range
     * @param startTime Valid report Start Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param endTime Valid report End Time in **ISO 8601 format** Please refer the following link to know more about ISO 8601 format.[Rfc Date Format](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14)   **Example date format:**   - yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZZ  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call getTransactionBatchesAsync(DateTime startTime, DateTime endTime, final ApiCallback<PtsV1TransactionBatchesGet200Response> callback) throws ApiException {

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

        okhttp3.Call call = getTransactionBatchesValidateBeforeCall(startTime, endTime, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV1TransactionBatchesGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

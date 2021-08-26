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


import Model.AuthReversalRequest;
import Model.MitReversalRequest;
import Model.PtsV2PaymentsPost502Response;
import Model.PtsV2PaymentsReversalsPost201Response;
import Model.PtsV2PaymentsReversalsPost400Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ReversalApi {
    private static Logger logger = LogManager.getLogger(ReversalApi.class);
    
    private ApiClient apiClient;

    public ReversalApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ReversalApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for authReversal
     * @param id The payment ID returned from a previous payment request. (required)
     * @param authReversalRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call authReversalCall(String id, AuthReversalRequest authReversalRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = authReversalRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/payments/{id}/reversals"
            .replaceAll("\\{" + "id" + "\\}", apiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call authReversalValidateBeforeCall(String id, AuthReversalRequest authReversalRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'id' is set
        if (id == null) {
        	logger.error("Missing the required parameter 'id' when calling authReversal(Async)");
            throw new ApiException("Missing the required parameter 'id' when calling authReversal(Async)");
        }
        
        // verify the required parameter 'authReversalRequest' is set
        if (authReversalRequest == null) {
        	logger.error("Missing the required parameter 'authReversalRequest' when calling authReversal(Async)");
            throw new ApiException("Missing the required parameter 'authReversalRequest' when calling authReversal(Async)");
        }
        
        
        okhttp3.Call call = authReversalCall(id, authReversalRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Process an Authorization Reversal
     * Include the payment ID in the POST request to reverse the payment amount.
     * @param id The payment ID returned from a previous payment request. (required)
     * @param authReversalRequest  (required)
     * @return PtsV2PaymentsReversalsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsReversalsPost201Response authReversal(String id, AuthReversalRequest authReversalRequest) throws ApiException {
    	logger.info("CALL TO METHOD 'authReversal' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<PtsV2PaymentsReversalsPost201Response> resp = authReversalWithHttpInfo(id, authReversalRequest);
        logger.info("CALL TO METHOD 'authReversal' ENDED");
        if(resp != null)
        {
            return resp.getData();
        }
        else 
        {
            logger.error("CALL TO METHOD 'authReversal' FAILED DUE TO AN EXCEPTION");
            return null;
        }
    }

    /**
     * Process an Authorization Reversal
     * Include the payment ID in the POST request to reverse the payment amount.
     * @param id The payment ID returned from a previous payment request. (required)
     * @param authReversalRequest  (required)
     * @return ApiResponse&lt;PtsV2PaymentsReversalsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsReversalsPost201Response> authReversalWithHttpInfo(String id, AuthReversalRequest authReversalRequest) throws ApiException {
        okhttp3.Call call = authReversalValidateBeforeCall(id, authReversalRequest, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsReversalsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Process an Authorization Reversal (asynchronously)
     * Include the payment ID in the POST request to reverse the payment amount.
     * @param id The payment ID returned from a previous payment request. (required)
     * @param authReversalRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call authReversalAsync(String id, AuthReversalRequest authReversalRequest, final ApiCallback<PtsV2PaymentsReversalsPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = authReversalValidateBeforeCall(id, authReversalRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsReversalsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for mitReversal
     * @param mitReversalRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call mitReversalCall(MitReversalRequest mitReversalRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = mitReversalRequest;
        
        // create path and map variables
        String localVarPath = "/pts/v2/reversals/";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
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
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }
    
    @SuppressWarnings("rawtypes")
    private okhttp3.Call mitReversalValidateBeforeCall(MitReversalRequest mitReversalRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'mitReversalRequest' is set
        if (mitReversalRequest == null) {
        	logger.error("Missing the required parameter 'mitReversalRequest' when calling mitReversal(Async)");
            throw new ApiException("Missing the required parameter 'mitReversalRequest' when calling mitReversal(Async)");
        }
        
        
        okhttp3.Call call = mitReversalCall(mitReversalRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Timeout Reversal
     * This is to reverse a previous payment that merchant does not receive a reply(Mostly due to Timeout). To use this feature/API, make sure to pass unique value to field - clientReferenceInformation -&gt; transactionId in [/pts/v2/payments](https://developer.cybersource.com/api-reference-assets/index.html#payments_payments) API call and use same transactionId in this API request payload to reverse the payment.
     * @param mitReversalRequest  (required)
     * @return PtsV2PaymentsReversalsPost201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public PtsV2PaymentsReversalsPost201Response mitReversal(MitReversalRequest mitReversalRequest) throws ApiException {
    	logger.info("CALL TO METHOD 'mitReversal' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<PtsV2PaymentsReversalsPost201Response> resp = mitReversalWithHttpInfo(mitReversalRequest);
        logger.info("CALL TO METHOD 'mitReversal' ENDED");
        if(resp != null)
        {
            return resp.getData();
        }
        else 
        {
            logger.error("CALL TO METHOD 'mitReversal' FAILED DUE TO AN EXCEPTION");
            return null;
        }
    }

    /**
     * Timeout Reversal
     * This is to reverse a previous payment that merchant does not receive a reply(Mostly due to Timeout). To use this feature/API, make sure to pass unique value to field - clientReferenceInformation -&gt; transactionId in [/pts/v2/payments](https://developer.cybersource.com/api-reference-assets/index.html#payments_payments) API call and use same transactionId in this API request payload to reverse the payment.
     * @param mitReversalRequest  (required)
     * @return ApiResponse&lt;PtsV2PaymentsReversalsPost201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<PtsV2PaymentsReversalsPost201Response> mitReversalWithHttpInfo(MitReversalRequest mitReversalRequest) throws ApiException {
        okhttp3.Call call = mitReversalValidateBeforeCall(mitReversalRequest, null, null);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsReversalsPost201Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Timeout Reversal (asynchronously)
     * This is to reverse a previous payment that merchant does not receive a reply(Mostly due to Timeout). To use this feature/API, make sure to pass unique value to field - clientReferenceInformation -&gt; transactionId in [/pts/v2/payments](https://developer.cybersource.com/api-reference-assets/index.html#payments_payments) API call and use same transactionId in this API request payload to reverse the payment.
     * @param mitReversalRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call mitReversalAsync(MitReversalRequest mitReversalRequest, final ApiCallback<PtsV2PaymentsReversalsPost201Response> callback) throws ApiException {

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

        okhttp3.Call call = mitReversalValidateBeforeCall(mitReversalRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<PtsV2PaymentsReversalsPost201Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

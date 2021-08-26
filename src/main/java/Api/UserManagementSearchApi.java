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


import Model.PtsV2PaymentsRefundPost400Response;
import Model.SearchRequest;
import Model.UmsV1UsersGet200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UserManagementSearchApi {
    private static Logger logger = LogManager.getLogger(UserManagementSearchApi.class);
    
    private ApiClient apiClient;

    public UserManagementSearchApi() {
        this(Configuration.getDefaultApiClient());
    }

    public UserManagementSearchApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for searchUsers
     * @param searchRequest  (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public okhttp3.Call searchUsersCall(SearchRequest searchRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = searchRequest;
        
        // create path and map variables
        String localVarPath = "/ums/v1/users/search";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/hal+json;charset=utf-8"
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
    private okhttp3.Call searchUsersValidateBeforeCall(SearchRequest searchRequest, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'searchRequest' is set
        if (searchRequest == null) {
        	logger.error("Missing the required parameter 'searchRequest' when calling searchUsers(Async)");
            throw new ApiException("Missing the required parameter 'searchRequest' when calling searchUsers(Async)");
        }
        
        
        okhttp3.Call call = searchUsersCall(searchRequest, progressListener, progressRequestListener);
        return call;

        
        
        
        
    }

    /**
     * Search User Information
     * This endpoint is to get all the user information depending on the filter criteria passed in request body.
     * @param searchRequest  (required)
     * @return UmsV1UsersGet200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public UmsV1UsersGet200Response searchUsers(SearchRequest searchRequest) throws ApiException {
    	logger.info("CALL TO METHOD 'searchUsers' STARTED");
        this.apiClient.setComputationStartTime(System.nanoTime());
        ApiResponse<UmsV1UsersGet200Response> resp = searchUsersWithHttpInfo(searchRequest);
        logger.info("CALL TO METHOD 'searchUsers' ENDED");
        if(resp != null)
        {
            return resp.getData();
        }
        else 
        {
            logger.error("CALL TO METHOD 'searchUsers' FAILED DUE TO AN EXCEPTION");
            return null;
        }
    }

    /**
     * Search User Information
     * This endpoint is to get all the user information depending on the filter criteria passed in request body.
     * @param searchRequest  (required)
     * @return ApiResponse&lt;UmsV1UsersGet200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<UmsV1UsersGet200Response> searchUsersWithHttpInfo(SearchRequest searchRequest) throws ApiException {
        okhttp3.Call call = searchUsersValidateBeforeCall(searchRequest, null, null);
        Type localVarReturnType = new TypeToken<UmsV1UsersGet200Response>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * Search User Information (asynchronously)
     * This endpoint is to get all the user information depending on the filter criteria passed in request body.
     * @param searchRequest  (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public okhttp3.Call searchUsersAsync(SearchRequest searchRequest, final ApiCallback<UmsV1UsersGet200Response> callback) throws ApiException {

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

        okhttp3.Call call = searchUsersValidateBeforeCall(searchRequest, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<UmsV1UsersGet200Response>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}

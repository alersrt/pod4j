/*
 * supports a RESTful API for the Libpod library
 * This documentation describes the Podman v2.x+ RESTful API. It consists of a Docker-compatible API and a Libpod API providing support for Podman’s unique features such as pods.  To start the service and keep it running for 5,000 seconds (-t 0 runs forever):  podman system service -t 5000 &  You can then use cURL on the socket using requests documented below.  NOTE: if you install the package podman-docker, it will create a symbolic link for /run/docker.sock to /run/podman/podman.sock  NOTE: Some fields in the API response JSON are encoded as omitempty, which means that if said field has a zero value, they will not be encoded in the API response. This is a feature to help reduce the size of the JSON responses returned via the API.  NOTE: Due to the limitations of [go-swagger](https://github.com/go-swagger/go-swagger), some field values that have a complex type show up as null in the docs as well as in the API responses. This is because the zero value for the field type is null. The field description in the docs will state what type the field is expected to be for such cases.  See podman-system-service(1) for more information.  Quick Examples:  'podman info'  curl --unix-socket /run/podman/podman.sock http://d/v5.0.0/libpod/info  'podman pull quay.io/containers/podman'  curl -XPOST --unix-socket /run/podman/podman.sock -v 'http://d/v5.0.0/images/create?fromImage=quay.io%2Fcontainers%2Fpodman'  'podman list images'  curl --unix-socket /run/podman/podman.sock -v 'http://d/v5.0.0/libpod/images/json' | jq
 *
 * The version of the OpenAPI document: 5.0.0
 * Contact: podman@lists.podman.io
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.alersrt.pod4j.openapi.api;

import io.github.alersrt.pod4j.openapi.ApiCallback;
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.Pair;
import io.github.alersrt.pod4j.openapi.ProgressRequestBody;
import io.github.alersrt.pod4j.openapi.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.github.alersrt.pod4j.openapi.model.ContainerExecRequest;
import io.github.alersrt.pod4j.openapi.model.ErrorModel;
import io.github.alersrt.pod4j.openapi.model.ExecStartRequest;
import io.github.alersrt.pod4j.openapi.model.InspectExecSession;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExecCompatApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ExecCompatApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ExecCompatApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for containerExec
     * @param name name of container (required)
     * @param control Attributes for create (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such container </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is paused </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call containerExecCall(String name, ContainerExecRequest control, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = control;

        // create path and map variables
        String localVarPath = "/containers/{name}/exec"
            .replace("{" + "name" + "}", localVarApiClient.escapeString(name.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/x-tar"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call containerExecValidateBeforeCall(String name, ContainerExecRequest control, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'name' is set
        if (name == null) {
            throw new ApiException("Missing the required parameter 'name' when calling containerExec(Async)");
        }

        return containerExecCall(name, control, _callback);

    }

    /**
     * Create an exec instance
     * Create an exec session to run a command inside a running container. Exec sessions will be automatically removed 5 minutes after they exit.
     * @param name name of container (required)
     * @param control Attributes for create (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such container </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is paused </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public void containerExec(String name, ContainerExecRequest control) throws ApiException {
        containerExecWithHttpInfo(name, control);
    }

    /**
     * Create an exec instance
     * Create an exec session to run a command inside a running container. Exec sessions will be automatically removed 5 minutes after they exit.
     * @param name name of container (required)
     * @param control Attributes for create (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such container </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is paused </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> containerExecWithHttpInfo(String name, ContainerExecRequest control) throws ApiException {
        okhttp3.Call localVarCall = containerExecValidateBeforeCall(name, control, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Create an exec instance (asynchronously)
     * Create an exec session to run a command inside a running container. Exec sessions will be automatically removed 5 minutes after they exit.
     * @param name name of container (required)
     * @param control Attributes for create (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such container </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is paused </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call containerExecAsync(String name, ContainerExecRequest control, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = containerExecValidateBeforeCall(name, control, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for execInspect
     * @param id Exec instance ID (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Exec Session Inspect </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execInspectCall(String id, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/exec/{id}/json"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call execInspectValidateBeforeCall(String id, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling execInspect(Async)");
        }

        return execInspectCall(id, _callback);

    }

    /**
     * Inspect an exec instance
     * Return low-level information about an exec instance.
     * @param id Exec instance ID (required)
     * @return InspectExecSession
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Exec Session Inspect </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public InspectExecSession execInspect(String id) throws ApiException {
        ApiResponse<InspectExecSession> localVarResp = execInspectWithHttpInfo(id);
        return localVarResp.getData();
    }

    /**
     * Inspect an exec instance
     * Return low-level information about an exec instance.
     * @param id Exec instance ID (required)
     * @return ApiResponse&lt;InspectExecSession&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Exec Session Inspect </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<InspectExecSession> execInspectWithHttpInfo(String id) throws ApiException {
        okhttp3.Call localVarCall = execInspectValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<InspectExecSession>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Inspect an exec instance (asynchronously)
     * Return low-level information about an exec instance.
     * @param id Exec instance ID (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Exec Session Inspect </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execInspectAsync(String id, final ApiCallback<InspectExecSession> _callback) throws ApiException {

        okhttp3.Call localVarCall = execInspectValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<InspectExecSession>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for execResize
     * @param id Exec instance ID (required)
     * @param h Height of the TTY session in characters (optional)
     * @param w Width of the TTY session in characters (optional)
     * @param running Ignore containers not running errors (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execResizeCall(String id, Integer h, Integer w, Boolean running, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/exec/{id}/resize"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (h != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("h", h));
        }

        if (w != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("w", w));
        }

        if (running != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("running", running));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call execResizeValidateBeforeCall(String id, Integer h, Integer w, Boolean running, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling execResize(Async)");
        }

        return execResizeCall(id, h, w, running, _callback);

    }

    /**
     * Resize an exec instance
     * Resize the TTY session used by an exec instance. This endpoint only works if tty was specified as part of creating and starting the exec instance. 
     * @param id Exec instance ID (required)
     * @param h Height of the TTY session in characters (optional)
     * @param w Width of the TTY session in characters (optional)
     * @param running Ignore containers not running errors (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public void execResize(String id, Integer h, Integer w, Boolean running) throws ApiException {
        execResizeWithHttpInfo(id, h, w, running);
    }

    /**
     * Resize an exec instance
     * Resize the TTY session used by an exec instance. This endpoint only works if tty was specified as part of creating and starting the exec instance. 
     * @param id Exec instance ID (required)
     * @param h Height of the TTY session in characters (optional)
     * @param w Width of the TTY session in characters (optional)
     * @param running Ignore containers not running errors (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> execResizeWithHttpInfo(String id, Integer h, Integer w, Boolean running) throws ApiException {
        okhttp3.Call localVarCall = execResizeValidateBeforeCall(id, h, w, running, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Resize an exec instance (asynchronously)
     * Resize the TTY session used by an exec instance. This endpoint only works if tty was specified as part of creating and starting the exec instance. 
     * @param id Exec instance ID (required)
     * @param h Height of the TTY session in characters (optional)
     * @param w Width of the TTY session in characters (optional)
     * @param running Ignore containers not running errors (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execResizeAsync(String id, Integer h, Integer w, Boolean running, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = execResizeValidateBeforeCall(id, h, w, running, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for execStart
     * @param id Exec instance ID (required)
     * @param control Attributes for start (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is not running </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execStartCall(String id, ExecStartRequest control, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = control;

        // create path and map variables
        String localVarPath = "/exec/{id}/start"
            .replace("{" + "id" + "}", localVarApiClient.escapeString(id.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json",
            "application/x-tar"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call execStartValidateBeforeCall(String id, ExecStartRequest control, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'id' is set
        if (id == null) {
            throw new ApiException("Missing the required parameter 'id' when calling execStart(Async)");
        }

        return execStartCall(id, control, _callback);

    }

    /**
     * Start an exec instance
     * Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command.
     * @param id Exec instance ID (required)
     * @param control Attributes for start (optional)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is not running </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public void execStart(String id, ExecStartRequest control) throws ApiException {
        execStartWithHttpInfo(id, control);
    }

    /**
     * Start an exec instance
     * Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command.
     * @param id Exec instance ID (required)
     * @param control Attributes for start (optional)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is not running </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> execStartWithHttpInfo(String id, ExecStartRequest control) throws ApiException {
        okhttp3.Call localVarCall = execStartValidateBeforeCall(id, control, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Start an exec instance (asynchronously)
     * Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command.
     * @param id Exec instance ID (required)
     * @param control Attributes for start (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is not running </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call execStartAsync(String id, ExecStartRequest control, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = execStartValidateBeforeCall(id, control, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
}
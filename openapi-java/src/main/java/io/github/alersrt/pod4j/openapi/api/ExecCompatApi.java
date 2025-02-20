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

import javax.validation.constraints.*;

import io.github.alersrt.pod4j.openapi.model.ContainerExecRequest;
import io.github.alersrt.pod4j.openapi.model.ErrorModel;
import io.github.alersrt.pod4j.openapi.model.ExecStartRequest;
import io.github.alersrt.pod4j.openapi.model.InspectExecSession;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

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

    private okhttp3.Call containerExecCall(String name, ContainerExecRequest control, final ApiCallback _callback) throws ApiException {
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
                .replaceAll("\\{" + "name" + "\\}", localVarApiClient.escapeString(name.toString()));

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
                "application/json", "application/x-tar"
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


        okhttp3.Call localVarCall = containerExecCall(name, control, _callback);
        return localVarCall;

    }


    private ApiResponse<Void> containerExecWithHttpInfo( @NotNull String name, ContainerExecRequest control) throws ApiException {
        okhttp3.Call localVarCall = containerExecValidateBeforeCall(name, control, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call containerExecAsync(String name, ContainerExecRequest control, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = containerExecValidateBeforeCall(name, control, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIcontainerExecRequest {
        private final String name;
        private ContainerExecRequest control;

        private APIcontainerExecRequest(String name) {
            this.name = name;
        }

        /**
         * Set control
         * @param control Attributes for create (optional)
         * @return APIcontainerExecRequest
         */
        public APIcontainerExecRequest control(ContainerExecRequest control) {
            this.control = control;
            return this;
        }

        /**
         * Build call for containerExec
         * @param _callback ApiCallback API callback
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
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return containerExecCall(name, control, _callback);
        }

        /**
         * Execute containerExec request
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
        public void execute() throws ApiException {
            containerExecWithHttpInfo(name, control);
        }

        /**
         * Execute containerExec request with HTTP info returned
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
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return containerExecWithHttpInfo(name, control);
        }

        /**
         * Execute containerExec request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return containerExecAsync(name, control, _callback);
        }
    }

    /**
     * Create an exec instance
     * Create an exec session to run a command inside a running container. Exec sessions will be automatically removed 5 minutes after they exit.
     * @param name name of container (required)
     * @return APIcontainerExecRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such container </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is paused </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIcontainerExecRequest containerExec(String name) {
        return new APIcontainerExecRequest(name);
    }
    private okhttp3.Call execInspectCall(String id, final ApiCallback _callback) throws ApiException {
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
                .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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


        okhttp3.Call localVarCall = execInspectCall(id, _callback);
        return localVarCall;

    }


    private ApiResponse<InspectExecSession> execInspectWithHttpInfo( @NotNull String id) throws ApiException {
        okhttp3.Call localVarCall = execInspectValidateBeforeCall(id, null);
        Type localVarReturnType = new TypeToken<InspectExecSession>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call execInspectAsync(String id, final ApiCallback<InspectExecSession> _callback) throws ApiException {

        okhttp3.Call localVarCall = execInspectValidateBeforeCall(id, _callback);
        Type localVarReturnType = new TypeToken<InspectExecSession>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class APIexecInspectRequest {
        private final String id;

        private APIexecInspectRequest(String id) {
            this.id = id;
        }

        /**
         * Build call for execInspect
         * @param _callback ApiCallback API callback
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
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return execInspectCall(id, _callback);
        }

        /**
         * Execute execInspect request
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
        public InspectExecSession execute() throws ApiException {
            ApiResponse<InspectExecSession> localVarResp = execInspectWithHttpInfo(id);
            return localVarResp.getData();
        }

        /**
         * Execute execInspect request with HTTP info returned
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
        public ApiResponse<InspectExecSession> executeWithHttpInfo() throws ApiException {
            return execInspectWithHttpInfo(id);
        }

        /**
         * Execute execInspect request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<InspectExecSession> _callback) throws ApiException {
            return execInspectAsync(id, _callback);
        }
    }

    /**
     * Inspect an exec instance
     * Return low-level information about an exec instance.
     * @param id Exec instance ID (required)
     * @return APIexecInspectRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Exec Session Inspect </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIexecInspectRequest execInspect(String id) {
        return new APIexecInspectRequest(id);
    }
    private okhttp3.Call execResizeCall(String id, Integer h, Integer w, Boolean running, final ApiCallback _callback) throws ApiException {
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
                .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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


        okhttp3.Call localVarCall = execResizeCall(id, h, w, running, _callback);
        return localVarCall;

    }


    private ApiResponse<Void> execResizeWithHttpInfo( @NotNull String id, Integer h, Integer w, Boolean running) throws ApiException {
        okhttp3.Call localVarCall = execResizeValidateBeforeCall(id, h, w, running, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call execResizeAsync(String id, Integer h, Integer w, Boolean running, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = execResizeValidateBeforeCall(id, h, w, running, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIexecResizeRequest {
        private final String id;
        private Integer h;
        private Integer w;
        private Boolean running;

        private APIexecResizeRequest(String id) {
            this.id = id;
        }

        /**
         * Set h
         * @param h Height of the TTY session in characters (optional)
         * @return APIexecResizeRequest
         */
        public APIexecResizeRequest h(Integer h) {
            this.h = h;
            return this;
        }

        /**
         * Set w
         * @param w Width of the TTY session in characters (optional)
         * @return APIexecResizeRequest
         */
        public APIexecResizeRequest w(Integer w) {
            this.w = w;
            return this;
        }

        /**
         * Set running
         * @param running Ignore containers not running errors (optional)
         * @return APIexecResizeRequest
         */
        public APIexecResizeRequest running(Boolean running) {
            this.running = running;
            return this;
        }

        /**
         * Build call for execResize
         * @param _callback ApiCallback API callback
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
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return execResizeCall(id, h, w, running, _callback);
        }

        /**
         * Execute execResize request
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
            <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
            <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
         </table>
         */
        public void execute() throws ApiException {
            execResizeWithHttpInfo(id, h, w, running);
        }

        /**
         * Execute execResize request with HTTP info returned
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
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return execResizeWithHttpInfo(id, h, w, running);
        }

        /**
         * Execute execResize request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return execResizeAsync(id, h, w, running, _callback);
        }
    }

    /**
     * Resize an exec instance
     * Resize the TTY session used by an exec instance. This endpoint only works if tty was specified as part of creating and starting the exec instance. 
     * @param id Exec instance ID (required)
     * @return APIexecResizeRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIexecResizeRequest execResize(String id) {
        return new APIexecResizeRequest(id);
    }
    private okhttp3.Call execStartCall(String id, ExecStartRequest control, final ApiCallback _callback) throws ApiException {
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
                .replaceAll("\\{" + "id" + "\\}", localVarApiClient.escapeString(id.toString()));

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
                "application/json", "application/x-tar"
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


        okhttp3.Call localVarCall = execStartCall(id, control, _callback);
        return localVarCall;

    }


    private ApiResponse<Void> execStartWithHttpInfo( @NotNull String id, ExecStartRequest control) throws ApiException {
        okhttp3.Call localVarCall = execStartValidateBeforeCall(id, control, null);
        return localVarApiClient.execute(localVarCall);
    }

    private okhttp3.Call execStartAsync(String id, ExecStartRequest control, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = execStartValidateBeforeCall(id, control, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }

    public class APIexecStartRequest {
        private final String id;
        private ExecStartRequest control;

        private APIexecStartRequest(String id) {
            this.id = id;
        }

        /**
         * Set control
         * @param control Attributes for start (optional)
         * @return APIexecStartRequest
         */
        public APIexecStartRequest control(ExecStartRequest control) {
            this.control = control;
            return this;
        }

        /**
         * Build call for execStart
         * @param _callback ApiCallback API callback
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
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return execStartCall(id, control, _callback);
        }

        /**
         * Execute execStart request
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
        public void execute() throws ApiException {
            execStartWithHttpInfo(id, control);
        }

        /**
         * Execute execStart request with HTTP info returned
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
        public ApiResponse<Void> executeWithHttpInfo() throws ApiException {
            return execStartWithHttpInfo(id, control);
        }

        /**
         * Execute execStart request (asynchronously)
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
        public okhttp3.Call executeAsync(final ApiCallback<Void> _callback) throws ApiException {
            return execStartAsync(id, control, _callback);
        }
    }

    /**
     * Start an exec instance
     * Starts a previously set up exec instance. If detach is true, this endpoint returns immediately after starting the command. Otherwise, it sets up an interactive session with the command.
     * @param id Exec instance ID (required)
     * @return APIexecStartRequest
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> no error </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> No such exec instance </td><td>  -  </td></tr>
        <tr><td> 409 </td><td> container is not running </td><td>  -  </td></tr>
        <tr><td> 500 </td><td> Internal server error </td><td>  -  </td></tr>
     </table>
     */
    public APIexecStartRequest execStart(String id) {
        return new APIexecStartRequest(id);
    }
}

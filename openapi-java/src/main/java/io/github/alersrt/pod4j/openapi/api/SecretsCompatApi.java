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

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Pair;
import io.github.alersrt.pod4j.openapi.model.SecretCreate;
import io.github.alersrt.pod4j.openapi.model.SecretCreateLibpod201Response;
import io.github.alersrt.pod4j.openapi.model.SecretInfoReportCompat;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.StringJoiner;
import java.util.function.Consumer;

@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class SecretsCompatApi {
  private final HttpClient memberVarHttpClient;
  private final ObjectMapper memberVarObjectMapper;
  private final String memberVarBaseUri;
  private final Consumer<HttpRequest.Builder> memberVarInterceptor;
  private final Duration memberVarReadTimeout;
  private final Consumer<HttpResponse<InputStream>> memberVarResponseInterceptor;
  private final Consumer<HttpResponse<String>> memberVarAsyncResponseInterceptor;

  public SecretsCompatApi() {
    this(new ApiClient());
  }

  public SecretsCompatApi(ApiClient apiClient) {
    memberVarHttpClient = apiClient.getHttpClient();
    memberVarObjectMapper = apiClient.getObjectMapper();
    memberVarBaseUri = apiClient.getBaseUri();
    memberVarInterceptor = apiClient.getRequestInterceptor();
    memberVarReadTimeout = apiClient.getReadTimeout();
    memberVarResponseInterceptor = apiClient.getResponseInterceptor();
    memberVarAsyncResponseInterceptor = apiClient.getAsyncResponseInterceptor();
  }

  protected ApiException getApiException(String operationId, HttpResponse<InputStream> response) throws IOException {
    String body = response.body() == null ? null : new String(response.body().readAllBytes());
    String message = formatExceptionMessage(operationId, response.statusCode(), body);
    return new ApiException(response.statusCode(), message, response.headers(), body);
  }

  private String formatExceptionMessage(String operationId, int statusCode, String body) {
    if (body == null || body.isEmpty()) {
      body = "[no body]";
    }
    return operationId + " call failed with: " + statusCode + " - " + body;
  }

  /**
   * Create a secret
   * 
   * @param create attributes for creating a secret  (optional)
   * @return SecretCreateLibpod201Response
   * @throws ApiException if fails to make API call
   */
  public SecretCreateLibpod201Response secretCreate(SecretCreate create) throws ApiException {
    ApiResponse<SecretCreateLibpod201Response> localVarResponse = secretCreateWithHttpInfo(create);
    return localVarResponse.getData();
  }

  /**
   * Create a secret
   * 
   * @param create attributes for creating a secret  (optional)
   * @return ApiResponse&lt;SecretCreateLibpod201Response&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SecretCreateLibpod201Response> secretCreateWithHttpInfo(SecretCreate create) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = secretCreateRequestBuilder(create);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("secretCreate", localVarResponse);
        }
        return new ApiResponse<SecretCreateLibpod201Response>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SecretCreateLibpod201Response>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder secretCreateRequestBuilder(SecretCreate create) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/secrets/create";

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Content-Type", "application/json");
    localVarRequestBuilder.header("Accept", "application/json");

    try {
      byte[] localVarPostBody = memberVarObjectMapper.writeValueAsBytes(create);
      localVarRequestBuilder.method("POST", HttpRequest.BodyPublishers.ofByteArray(localVarPostBody));
    } catch (IOException e) {
      throw new ApiException(e);
    }
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Remove secret
   * 
   * @param name the name or ID of the secret (required)
   * @throws ApiException if fails to make API call
   */
  public void secretDelete(String name) throws ApiException {
    secretDeleteWithHttpInfo(name);
  }

  /**
   * Remove secret
   * 
   * @param name the name or ID of the secret (required)
   * @return ApiResponse&lt;Void&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<Void> secretDeleteWithHttpInfo(String name) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = secretDeleteRequestBuilder(name);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("secretDelete", localVarResponse);
        }
        return new ApiResponse<Void>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          null
        );
      } finally {
        // Drain the InputStream
        while (localVarResponse.body().read() != -1) {
            // Ignore
        }
        localVarResponse.body().close();
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder secretDeleteRequestBuilder(String name) throws ApiException {
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling secretDelete");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/secrets/{name}"
        .replace("{name}", ApiClient.urlEncode(name.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("DELETE", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * Inspect secret
   * 
   * @param name the name or ID of the secret (required)
   * @return SecretInfoReportCompat
   * @throws ApiException if fails to make API call
   */
  public SecretInfoReportCompat secretInspect(String name) throws ApiException {
    ApiResponse<SecretInfoReportCompat> localVarResponse = secretInspectWithHttpInfo(name);
    return localVarResponse.getData();
  }

  /**
   * Inspect secret
   * 
   * @param name the name or ID of the secret (required)
   * @return ApiResponse&lt;SecretInfoReportCompat&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<SecretInfoReportCompat> secretInspectWithHttpInfo(String name) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = secretInspectRequestBuilder(name);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("secretInspect", localVarResponse);
        }
        return new ApiResponse<SecretInfoReportCompat>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<SecretInfoReportCompat>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder secretInspectRequestBuilder(String name) throws ApiException {
    // verify the required parameter 'name' is set
    if (name == null) {
      throw new ApiException(400, "Missing the required parameter 'name' when calling secretInspect");
    }

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/secrets/{name}"
        .replace("{name}", ApiClient.urlEncode(name.toString()));

    localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

  /**
   * List secrets
   * Returns a list of secrets
   * @param filters JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the secrets list. Currently available filters:   - &#x60;name&#x3D;[name]&#x60; Matches secrets name (accepts regex).   - &#x60;id&#x3D;[id]&#x60; Matches for full or partial ID.  (optional)
   * @return List&lt;SecretInfoReportCompat&gt;
   * @throws ApiException if fails to make API call
   */
  public List<SecretInfoReportCompat> secretList(String filters) throws ApiException {
    ApiResponse<List<SecretInfoReportCompat>> localVarResponse = secretListWithHttpInfo(filters);
    return localVarResponse.getData();
  }

  /**
   * List secrets
   * Returns a list of secrets
   * @param filters JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the secrets list. Currently available filters:   - &#x60;name&#x3D;[name]&#x60; Matches secrets name (accepts regex).   - &#x60;id&#x3D;[id]&#x60; Matches for full or partial ID.  (optional)
   * @return ApiResponse&lt;List&lt;SecretInfoReportCompat&gt;&gt;
   * @throws ApiException if fails to make API call
   */
  public ApiResponse<List<SecretInfoReportCompat>> secretListWithHttpInfo(String filters) throws ApiException {
    HttpRequest.Builder localVarRequestBuilder = secretListRequestBuilder(filters);
    try {
      HttpResponse<InputStream> localVarResponse = memberVarHttpClient.send(
          localVarRequestBuilder.build(),
          HttpResponse.BodyHandlers.ofInputStream());
      if (memberVarResponseInterceptor != null) {
        memberVarResponseInterceptor.accept(localVarResponse);
      }
      try {
        if (localVarResponse.statusCode()/ 100 != 2) {
          throw getApiException("secretList", localVarResponse);
        }
        return new ApiResponse<List<SecretInfoReportCompat>>(
          localVarResponse.statusCode(),
          localVarResponse.headers().map(),
          localVarResponse.body() == null ? null : memberVarObjectMapper.readValue(localVarResponse.body(), new TypeReference<List<SecretInfoReportCompat>>() {}) // closes the InputStream
        );
      } finally {
      }
    } catch (IOException e) {
      throw new ApiException(e);
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new ApiException(e);
    }
  }

  private HttpRequest.Builder secretListRequestBuilder(String filters) throws ApiException {

    HttpRequest.Builder localVarRequestBuilder = HttpRequest.newBuilder();

    String localVarPath = "/secrets";

    List<Pair> localVarQueryParams = new ArrayList<>();
    StringJoiner localVarQueryStringJoiner = new StringJoiner("&");
    String localVarQueryParameterBaseName;
    localVarQueryParameterBaseName = "filters";
    localVarQueryParams.addAll(ApiClient.parameterToPairs("filters", filters));

    if (!localVarQueryParams.isEmpty() || localVarQueryStringJoiner.length() != 0) {
      StringJoiner queryJoiner = new StringJoiner("&");
      localVarQueryParams.forEach(p -> queryJoiner.add(p.getName() + '=' + p.getValue()));
      if (localVarQueryStringJoiner.length() != 0) {
        queryJoiner.add(localVarQueryStringJoiner.toString());
      }
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath + '?' + queryJoiner.toString()));
    } else {
      localVarRequestBuilder.uri(URI.create(memberVarBaseUri + localVarPath));
    }

    localVarRequestBuilder.header("Accept", "application/json");

    localVarRequestBuilder.method("GET", HttpRequest.BodyPublishers.noBody());
    if (memberVarReadTimeout != null) {
      localVarRequestBuilder.timeout(memberVarReadTimeout);
    }
    if (memberVarInterceptor != null) {
      memberVarInterceptor.accept(localVarRequestBuilder);
    }
    return localVarRequestBuilder;
  }

}

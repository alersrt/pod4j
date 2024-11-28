# SecretsApi

All URIs are relative to *http://podman.io*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**secretCreateLibpod**](SecretsApi.md#secretCreateLibpod) | **POST** /libpod/secrets/create | Create a secret |
| [**secretCreateLibpodWithHttpInfo**](SecretsApi.md#secretCreateLibpodWithHttpInfo) | **POST** /libpod/secrets/create | Create a secret |
| [**secretDeleteLibpod**](SecretsApi.md#secretDeleteLibpod) | **DELETE** /libpod/secrets/{name} | Remove secret |
| [**secretDeleteLibpodWithHttpInfo**](SecretsApi.md#secretDeleteLibpodWithHttpInfo) | **DELETE** /libpod/secrets/{name} | Remove secret |
| [**secretExistsLibpod**](SecretsApi.md#secretExistsLibpod) | **GET** /libpod/secrets/{name}/exists | Secret exists |
| [**secretExistsLibpodWithHttpInfo**](SecretsApi.md#secretExistsLibpodWithHttpInfo) | **GET** /libpod/secrets/{name}/exists | Secret exists |
| [**secretInspectLibpod**](SecretsApi.md#secretInspectLibpod) | **GET** /libpod/secrets/{name}/json | Inspect secret |
| [**secretInspectLibpodWithHttpInfo**](SecretsApi.md#secretInspectLibpodWithHttpInfo) | **GET** /libpod/secrets/{name}/json | Inspect secret |
| [**secretListLibpod**](SecretsApi.md#secretListLibpod) | **GET** /libpod/secrets/json | List secrets |
| [**secretListLibpodWithHttpInfo**](SecretsApi.md#secretListLibpodWithHttpInfo) | **GET** /libpod/secrets/json | List secrets |



## secretCreateLibpod

> SecretCreateLibpod201Response secretCreateLibpod(name, driver, driveropts, labels, request)

Create a secret

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.SecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        SecretsApi apiInstance = new SecretsApi(defaultClient);
        String name = "name_example"; // String | User-defined name of the secret.
        String driver = "file"; // String | Secret driver
        String driveropts = "driveropts_example"; // String | Secret driver options
        String labels = "labels_example"; // String | Labels on the secret
        String request = "request_example"; // String | Secret
        try {
            SecretCreateLibpod201Response result = apiInstance.secretCreateLibpod(name, driver, driveropts, labels, request);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretsApi#secretCreateLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| User-defined name of the secret. | |
| **driver** | **String**| Secret driver | [optional] [default to file] |
| **driveropts** | **String**| Secret driver options | [optional] |
| **labels** | **String**| Labels on the secret | [optional] |
| **request** | **String**| Secret | [optional] |

### Return type

[**SecretCreateLibpod201Response**](SecretCreateLibpod201Response.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Secret create response |  -  |
| **500** | Internal server error |  -  |

## secretCreateLibpodWithHttpInfo

> ApiResponse<SecretCreateLibpod201Response> secretCreateLibpod secretCreateLibpodWithHttpInfo(name, driver, driveropts, labels, request)

Create a secret

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.SecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        SecretsApi apiInstance = new SecretsApi(defaultClient);
        String name = "name_example"; // String | User-defined name of the secret.
        String driver = "file"; // String | Secret driver
        String driveropts = "driveropts_example"; // String | Secret driver options
        String labels = "labels_example"; // String | Labels on the secret
        String request = "request_example"; // String | Secret
        try {
            ApiResponse<SecretCreateLibpod201Response> response = apiInstance.secretCreateLibpodWithHttpInfo(name, driver, driveropts, labels, request);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretsApi#secretCreateLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| User-defined name of the secret. | |
| **driver** | **String**| Secret driver | [optional] [default to file] |
| **driveropts** | **String**| Secret driver options | [optional] |
| **labels** | **String**| Labels on the secret | [optional] |
| **request** | **String**| Secret | [optional] |

### Return type

ApiResponse<[**SecretCreateLibpod201Response**](SecretCreateLibpod201Response.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/x-tar
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Secret create response |  -  |
| **500** | Internal server error |  -  |


## secretDeleteLibpod

> void secretDeleteLibpod(name, all)

Remove secret

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.SecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        SecretsApi apiInstance = new SecretsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the secret
        Boolean all = false; // Boolean | Remove all secrets
        try {
            apiInstance.secretDeleteLibpod(name, all);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretsApi#secretDeleteLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the secret | |
| **all** | **Boolean**| Remove all secrets | [optional] [default to false] |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such secret |  -  |
| **500** | Internal server error |  -  |

## secretDeleteLibpodWithHttpInfo

> ApiResponse<Void> secretDeleteLibpod secretDeleteLibpodWithHttpInfo(name, all)

Remove secret

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.SecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        SecretsApi apiInstance = new SecretsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the secret
        Boolean all = false; // Boolean | Remove all secrets
        try {
            ApiResponse<Void> response = apiInstance.secretDeleteLibpodWithHttpInfo(name, all);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretsApi#secretDeleteLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the secret | |
| **all** | **Boolean**| Remove all secrets | [optional] [default to false] |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | no error |  -  |
| **404** | No such secret |  -  |
| **500** | Internal server error |  -  |


## secretExistsLibpod

> void secretExistsLibpod(name)

Secret exists

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.SecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        SecretsApi apiInstance = new SecretsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the secret
        try {
            apiInstance.secretExistsLibpod(name);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretsApi#secretExistsLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the secret | |

### Return type


null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | secret exists |  -  |
| **404** | No such secret |  -  |
| **500** | Internal server error |  -  |

## secretExistsLibpodWithHttpInfo

> ApiResponse<Void> secretExistsLibpod secretExistsLibpodWithHttpInfo(name)

Secret exists

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.SecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        SecretsApi apiInstance = new SecretsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the secret
        try {
            ApiResponse<Void> response = apiInstance.secretExistsLibpodWithHttpInfo(name);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretsApi#secretExistsLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the secret | |

### Return type


ApiResponse<Void>

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | secret exists |  -  |
| **404** | No such secret |  -  |
| **500** | Internal server error |  -  |


## secretInspectLibpod

> SecretInfoReport secretInspectLibpod(name, showsecret)

Inspect secret

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.SecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        SecretsApi apiInstance = new SecretsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the secret
        Boolean showsecret = false; // Boolean | Display Secret
        try {
            SecretInfoReport result = apiInstance.secretInspectLibpod(name, showsecret);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretsApi#secretInspectLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the secret | |
| **showsecret** | **Boolean**| Display Secret | [optional] [default to false] |

### Return type

[**SecretInfoReport**](SecretInfoReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secret inspect response |  -  |
| **404** | No such secret |  -  |
| **500** | Internal server error |  -  |

## secretInspectLibpodWithHttpInfo

> ApiResponse<SecretInfoReport> secretInspectLibpod secretInspectLibpodWithHttpInfo(name, showsecret)

Inspect secret

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.SecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        SecretsApi apiInstance = new SecretsApi(defaultClient);
        String name = "name_example"; // String | the name or ID of the secret
        Boolean showsecret = false; // Boolean | Display Secret
        try {
            ApiResponse<SecretInfoReport> response = apiInstance.secretInspectLibpodWithHttpInfo(name, showsecret);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretsApi#secretInspectLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| the name or ID of the secret | |
| **showsecret** | **Boolean**| Display Secret | [optional] [default to false] |

### Return type

ApiResponse<[**SecretInfoReport**](SecretInfoReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secret inspect response |  -  |
| **404** | No such secret |  -  |
| **500** | Internal server error |  -  |


## secretListLibpod

> List<SecretInfoReport> secretListLibpod(filters)

List secrets

Returns a list of secrets

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.SecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        SecretsApi apiInstance = new SecretsApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of the filters (a `map[string][]string`) to process on the secrets list. Currently available filters:   - `name=[name]` Matches secrets name (accepts regex).   - `id=[id]` Matches for full or partial ID. 
        try {
            List<SecretInfoReport> result = apiInstance.secretListLibpod(filters);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretsApi#secretListLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filters** | **String**| JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the secrets list. Currently available filters:   - &#x60;name&#x3D;[name]&#x60; Matches secrets name (accepts regex).   - &#x60;id&#x3D;[id]&#x60; Matches for full or partial ID.  | [optional] |

### Return type

[**List&lt;SecretInfoReport&gt;**](SecretInfoReport.md)


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secret list response |  -  |
| **500** | Internal server error |  -  |

## secretListLibpodWithHttpInfo

> ApiResponse<List<SecretInfoReport>> secretListLibpod secretListLibpodWithHttpInfo(filters)

List secrets

Returns a list of secrets

### Example

```java
// Import classes:
import io.github.alersrt.pod4j.openapi.ApiClient;
import io.github.alersrt.pod4j.openapi.ApiException;
import io.github.alersrt.pod4j.openapi.ApiResponse;
import io.github.alersrt.pod4j.openapi.Configuration;
import io.github.alersrt.pod4j.openapi.models.*;
import io.github.alersrt.pod4j.openapi.api.SecretsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://podman.io");

        SecretsApi apiInstance = new SecretsApi(defaultClient);
        String filters = "filters_example"; // String | JSON encoded value of the filters (a `map[string][]string`) to process on the secrets list. Currently available filters:   - `name=[name]` Matches secrets name (accepts regex).   - `id=[id]` Matches for full or partial ID. 
        try {
            ApiResponse<List<SecretInfoReport>> response = apiInstance.secretListLibpodWithHttpInfo(filters);
            System.out.println("Status code: " + response.getStatusCode());
            System.out.println("Response headers: " + response.getHeaders());
            System.out.println("Response body: " + response.getData());
        } catch (ApiException e) {
            System.err.println("Exception when calling SecretsApi#secretListLibpod");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Response headers: " + e.getResponseHeaders());
            System.err.println("Reason: " + e.getResponseBody());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **filters** | **String**| JSON encoded value of the filters (a &#x60;map[string][]string&#x60;) to process on the secrets list. Currently available filters:   - &#x60;name&#x3D;[name]&#x60; Matches secrets name (accepts regex).   - &#x60;id&#x3D;[id]&#x60; Matches for full or partial ID.  | [optional] |

### Return type

ApiResponse<[**List&lt;SecretInfoReport&gt;**](SecretInfoReport.md)>


### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Secret list response |  -  |
| **500** | Internal server error |  -  |


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


package io.github.alersrt.pod4j.openapi.model;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.JSON;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/**
 * HealthcheckConfig
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-29T01:29:49.168634544+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class HealthcheckConfig {
    public static final String SERIALIZED_NAME_INTERVAL = "Interval";
    public static final String SERIALIZED_NAME_RETRIES = "Retries";
    public static final String SERIALIZED_NAME_START_INTERVAL = "StartInterval";
    public static final String SERIALIZED_NAME_START_PERIOD = "StartPeriod";
    public static final String SERIALIZED_NAME_TEST = "Test";
    public static final String SERIALIZED_NAME_TIMEOUT = "Timeout";
    public static HashSet<String> openapiFields;
    public static HashSet<String> openapiRequiredFields;

    static {
        // a set of all properties/fields (JSON key names)
        openapiFields = new HashSet<String>();
        openapiFields.add("Interval");
        openapiFields.add("Retries");
        openapiFields.add("StartInterval");
        openapiFields.add("StartPeriod");
        openapiFields.add("Test");
        openapiFields.add("Timeout");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    @SerializedName(SERIALIZED_NAME_INTERVAL)
    private Long interval;
    @SerializedName(SERIALIZED_NAME_RETRIES)
    private Long retries;
    @SerializedName(SERIALIZED_NAME_START_INTERVAL)
    private Long startInterval;
    @SerializedName(SERIALIZED_NAME_START_PERIOD)
    private Long startPeriod;
    @SerializedName(SERIALIZED_NAME_TEST)
    private List<String> test = new ArrayList<>();
    @SerializedName(SERIALIZED_NAME_TIMEOUT)
    private Long timeout;

    public HealthcheckConfig() {
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to HealthcheckConfig
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!HealthcheckConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(String.format("The required field(s) %s in HealthcheckConfig is not found in the empty JSON string", HealthcheckConfig.openapiRequiredFields));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!HealthcheckConfig.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HealthcheckConfig` properties. JSON: %s", entry.getKey(), jsonElement));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("Test") != null && !jsonObj.get("Test").isJsonNull() && !jsonObj.get("Test").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Test` to be an array in the JSON string but got `%s`", jsonObj.get("Test").toString()));
        }
    }

    /**
     * Create an instance of HealthcheckConfig given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of HealthcheckConfig
     * @throws IOException if the JSON string is invalid with respect to HealthcheckConfig
     */
    public static HealthcheckConfig fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, HealthcheckConfig.class);
    }

    public HealthcheckConfig interval(Long interval) {
        this.interval = interval;
        return this;
    }

    /**
     * A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.
     *
     * @return interval
     */
    @jakarta.annotation.Nullable

    public Long getInterval() {
        return interval;
    }

    public void setInterval(Long interval) {
        this.interval = interval;
    }

    public HealthcheckConfig retries(Long retries) {
        this.retries = retries;
        return this;
    }

    /**
     * Retries is the number of consecutive failures needed to consider a container as unhealthy. Zero means inherit.
     *
     * @return retries
     */
    @jakarta.annotation.Nullable

    public Long getRetries() {
        return retries;
    }

    public void setRetries(Long retries) {
        this.retries = retries;
    }

    public HealthcheckConfig startInterval(Long startInterval) {
        this.startInterval = startInterval;
        return this;
    }

    /**
     * A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.
     *
     * @return startInterval
     */
    @jakarta.annotation.Nullable

    public Long getStartInterval() {
        return startInterval;
    }

    public void setStartInterval(Long startInterval) {
        this.startInterval = startInterval;
    }

    public HealthcheckConfig startPeriod(Long startPeriod) {
        this.startPeriod = startPeriod;
        return this;
    }

    /**
     * A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.
     *
     * @return startPeriod
     */
    @jakarta.annotation.Nullable

    public Long getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(Long startPeriod) {
        this.startPeriod = startPeriod;
    }

    public HealthcheckConfig test(List<String> test) {
        this.test = test;
        return this;
    }

    public HealthcheckConfig addTestItem(String testItem) {
        if (this.test == null) {
            this.test = new ArrayList<>();
        }
        this.test.add(testItem);
        return this;
    }

    /**
     * Test is the test to perform to check that the container is healthy. An empty slice means to inherit the default. The options are: {} : inherit healthcheck {\&quot;NONE\&quot;} : disable healthcheck {\&quot;CMD\&quot;, args...} : exec arguments directly {\&quot;CMD-SHELL\&quot;, command} : run command with system&#39;s default shell
     *
     * @return test
     */
    @jakarta.annotation.Nullable

    public List<String> getTest() {
        return test;
    }

    public void setTest(List<String> test) {
        this.test = test;
    }

    public HealthcheckConfig timeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }

    /**
     * A Duration represents the elapsed time between two instants as an int64 nanosecond count. The representation limits the largest representable duration to approximately 290 years.
     *
     * @return timeout
     */
    @jakarta.annotation.Nullable

    public Long getTimeout() {
        return timeout;
    }

    public void setTimeout(Long timeout) {
        this.timeout = timeout;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        HealthcheckConfig healthcheckConfig = (HealthcheckConfig) o;
        return Objects.equals(this.interval, healthcheckConfig.interval) &&
                Objects.equals(this.retries, healthcheckConfig.retries) &&
                Objects.equals(this.startInterval, healthcheckConfig.startInterval) &&
                Objects.equals(this.startPeriod, healthcheckConfig.startPeriod) &&
                Objects.equals(this.test, healthcheckConfig.test) &&
                Objects.equals(this.timeout, healthcheckConfig.timeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(interval, retries, startInterval, startPeriod, test, timeout);
    }

    @Override
    public String toString() {
        String sb = "class HealthcheckConfig {\n" +
                "    interval: " + toIndentedString(interval) + "\n" +
                "    retries: " + toIndentedString(retries) + "\n" +
                "    startInterval: " + toIndentedString(startInterval) + "\n" +
                "    startPeriod: " + toIndentedString(startPeriod) + "\n" +
                "    test: " + toIndentedString(test) + "\n" +
                "    timeout: " + toIndentedString(timeout) + "\n" +
                "}";
        return sb;
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

    /**
     * Convert an instance of HealthcheckConfig to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!HealthcheckConfig.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'HealthcheckConfig' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<HealthcheckConfig> thisAdapter
                    = gson.getDelegateAdapter(this, TypeToken.get(HealthcheckConfig.class));

            return (TypeAdapter<T>) new TypeAdapter<HealthcheckConfig>() {
                @Override
                public void write(JsonWriter out, HealthcheckConfig value) throws IOException {
                    JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                    elementAdapter.write(out, obj);
                }

                @Override
                public HealthcheckConfig read(JsonReader in) throws IOException {
                    JsonElement jsonElement = elementAdapter.read(in);
                    validateJsonElement(jsonElement);
                    return thisAdapter.fromJsonTree(jsonElement);
                }

            }.nullSafe();
        }
    }
}


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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.model.HealthCheckLog;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.Serializable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.alersrt.pod4j.openapi.JSON;

/**
 * HealthCheckResults describes the results/logs from a healthcheck
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class HealthCheckResults implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_FAILING_STREAK = "FailingStreak";
  @SerializedName(SERIALIZED_NAME_FAILING_STREAK)
  private Long failingStreak;

  public static final String SERIALIZED_NAME_LOG = "Log";
  @SerializedName(SERIALIZED_NAME_LOG)
  private List<@Valid HealthCheckLog> log = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public HealthCheckResults() {
  }

  public HealthCheckResults failingStreak(Long failingStreak) {
    this.failingStreak = failingStreak;
    return this;
  }

  /**
   * FailingStreak is the number of consecutive failed healthchecks
   * @return failingStreak
   */
  @jakarta.annotation.Nullable

  public Long getFailingStreak() {
    return failingStreak;
  }

  public void setFailingStreak(Long failingStreak) {
    this.failingStreak = failingStreak;
  }


  public HealthCheckResults log(List<@Valid HealthCheckLog> log) {
    this.log = log;
    return this;
  }

  public HealthCheckResults addLogItem(HealthCheckLog logItem) {
    if (this.log == null) {
      this.log = new ArrayList<>();
    }
    this.log.add(logItem);
    return this;
  }

  /**
   * Log describes healthcheck attempts and results
   * @return log
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid HealthCheckLog> getLog() {
    return log;
  }

  public void setLog(List<@Valid HealthCheckLog> log) {
    this.log = log;
  }


  public HealthCheckResults status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status starting, healthy or unhealthy
   * @return status
   */
  @jakarta.annotation.Nullable

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckResults healthCheckResults = (HealthCheckResults) o;
    return Objects.equals(this.failingStreak, healthCheckResults.failingStreak) &&
        Objects.equals(this.log, healthCheckResults.log) &&
        Objects.equals(this.status, healthCheckResults.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(failingStreak, log, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckResults {\n");
    sb.append("    failingStreak: ").append(toIndentedString(failingStreak)).append("\n");
    sb.append("    log: ").append(toIndentedString(log)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("}");
    return sb.toString();
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("FailingStreak");
    openapiFields.add("Log");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HealthCheckResults
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HealthCheckResults.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HealthCheckResults is not found in the empty JSON string", HealthCheckResults.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HealthCheckResults.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HealthCheckResults` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Log") != null && !jsonObj.get("Log").isJsonNull()) {
        JsonArray jsonArraylog = jsonObj.getAsJsonArray("Log");
        if (jsonArraylog != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Log").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Log` to be an array in the JSON string but got `%s`", jsonObj.get("Log").toString()));
          }

          // validate the optional field `Log` (array)
          for (int i = 0; i < jsonArraylog.size(); i++) {
            HealthCheckLog.validateJsonElement(jsonArraylog.get(i));
          };
        }
      }
      if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HealthCheckResults.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HealthCheckResults' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HealthCheckResults> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HealthCheckResults.class));

       return (TypeAdapter<T>) new TypeAdapter<HealthCheckResults>() {
           @Override
           public void write(JsonWriter out, HealthCheckResults value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HealthCheckResults read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HealthCheckResults given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HealthCheckResults
   * @throws IOException if the JSON string is invalid with respect to HealthCheckResults
   */
  public static HealthCheckResults fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HealthCheckResults.class);
  }

  /**
   * Convert an instance of HealthCheckResults to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


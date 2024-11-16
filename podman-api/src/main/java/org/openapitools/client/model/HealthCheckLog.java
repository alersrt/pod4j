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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * HealthCheckLog describes the results of a single healthcheck
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T18:07:05.610979114+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class HealthCheckLog {
  public static final String SERIALIZED_NAME_END = "End";
  @SerializedName(SERIALIZED_NAME_END)
  private String end;

  public static final String SERIALIZED_NAME_EXIT_CODE = "ExitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private Long exitCode;

  public static final String SERIALIZED_NAME_OUTPUT = "Output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private String output;

  public static final String SERIALIZED_NAME_START = "Start";
  @SerializedName(SERIALIZED_NAME_START)
  private String start;

  public HealthCheckLog() {
  }

  public HealthCheckLog end(String end) {
    this.end = end;
    return this;
  }

  /**
   * End time as a string
   * @return end
   */
  @javax.annotation.Nullable
  public String getEnd() {
    return end;
  }

  public void setEnd(String end) {
    this.end = end;
  }


  public HealthCheckLog exitCode(Long exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Exitcode is 0 or 1
   * @return exitCode
   */
  @javax.annotation.Nullable
  public Long getExitCode() {
    return exitCode;
  }

  public void setExitCode(Long exitCode) {
    this.exitCode = exitCode;
  }


  public HealthCheckLog output(String output) {
    this.output = output;
    return this;
  }

  /**
   * Output is the stdout/stderr from the healthcheck command
   * @return output
   */
  @javax.annotation.Nullable
  public String getOutput() {
    return output;
  }

  public void setOutput(String output) {
    this.output = output;
  }


  public HealthCheckLog start(String start) {
    this.start = start;
    return this;
  }

  /**
   * Start time as string
   * @return start
   */
  @javax.annotation.Nullable
  public String getStart() {
    return start;
  }

  public void setStart(String start) {
    this.start = start;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HealthCheckLog healthCheckLog = (HealthCheckLog) o;
    return Objects.equals(this.end, healthCheckLog.end) &&
        Objects.equals(this.exitCode, healthCheckLog.exitCode) &&
        Objects.equals(this.output, healthCheckLog.output) &&
        Objects.equals(this.start, healthCheckLog.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, exitCode, output, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthCheckLog {\n");
    sb.append("    end: ").append(toIndentedString(end)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    output: ").append(toIndentedString(output)).append("\n");
    sb.append("    start: ").append(toIndentedString(start)).append("\n");
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
    openapiFields.add("End");
    openapiFields.add("ExitCode");
    openapiFields.add("Output");
    openapiFields.add("Start");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to HealthCheckLog
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!HealthCheckLog.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in HealthCheckLog is not found in the empty JSON string", HealthCheckLog.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!HealthCheckLog.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HealthCheckLog` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("End") != null && !jsonObj.get("End").isJsonNull()) && !jsonObj.get("End").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `End` to be a primitive type in the JSON string but got `%s`", jsonObj.get("End").toString()));
      }
      if ((jsonObj.get("Output") != null && !jsonObj.get("Output").isJsonNull()) && !jsonObj.get("Output").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Output` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Output").toString()));
      }
      if ((jsonObj.get("Start") != null && !jsonObj.get("Start").isJsonNull()) && !jsonObj.get("Start").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Start` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Start").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HealthCheckLog.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HealthCheckLog' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HealthCheckLog> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HealthCheckLog.class));

       return (TypeAdapter<T>) new TypeAdapter<HealthCheckLog>() {
           @Override
           public void write(JsonWriter out, HealthCheckLog value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HealthCheckLog read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of HealthCheckLog given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of HealthCheckLog
   * @throws IOException if the JSON string is invalid with respect to HealthCheckLog
   */
  public static HealthCheckLog fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HealthCheckLog.class);
  }

  /**
   * Convert an instance of HealthCheckLog to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.alersrt.pod4j.openapi.JSON;

/**
 * HealthcheckResult stores information about a single run of a healthcheck probe
 */
@ApiModel(description = "HealthcheckResult stores information about a single run of a healthcheck probe")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class HealthcheckResult implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_END = "End";
  @SerializedName(SERIALIZED_NAME_END)
  private OffsetDateTime end;

  public static final String SERIALIZED_NAME_EXIT_CODE = "ExitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private Long exitCode;

  public static final String SERIALIZED_NAME_OUTPUT = "Output";
  @SerializedName(SERIALIZED_NAME_OUTPUT)
  private String output;

  public static final String SERIALIZED_NAME_START = "Start";
  @SerializedName(SERIALIZED_NAME_START)
  private OffsetDateTime start;

  public HealthcheckResult() {
  }

  public HealthcheckResult end(OffsetDateTime end) {

      this.end = end;
    return this;
  }

    /**
   * Get end
   * @return end
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public OffsetDateTime getEnd() {
    return end;
  }


  public void setEnd(OffsetDateTime end) {
    this.end = end;
  }


  public HealthcheckResult exitCode(Long exitCode) {

      this.exitCode = exitCode;
    return this;
  }

    /**
   * Get exitCode
   * @return exitCode
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public Long getExitCode() {
    return exitCode;
  }


  public void setExitCode(Long exitCode) {
    this.exitCode = exitCode;
  }


  public HealthcheckResult output(String output) {

      this.output = output;
    return this;
  }

    /**
   * Get output
   * @return output
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public String getOutput() {
    return output;
  }


  public void setOutput(String output) {
    this.output = output;
  }


  public HealthcheckResult start(OffsetDateTime start) {

      this.start = start;
    return this;
  }

    /**
   * Get start
   * @return start
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public OffsetDateTime getStart() {
    return start;
  }


  public void setStart(OffsetDateTime start) {
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
    HealthcheckResult healthcheckResult = (HealthcheckResult) o;
    return Objects.equals(this.end, healthcheckResult.end) &&
        Objects.equals(this.exitCode, healthcheckResult.exitCode) &&
        Objects.equals(this.output, healthcheckResult.output) &&
        Objects.equals(this.start, healthcheckResult.start);
  }

  @Override
  public int hashCode() {
    return Objects.hash(end, exitCode, output, start);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HealthcheckResult {\n");
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
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to HealthcheckResult
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (HealthcheckResult.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in HealthcheckResult is not found in the empty JSON string", HealthcheckResult.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!HealthcheckResult.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `HealthcheckResult` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Output") != null && !jsonObj.get("Output").isJsonNull()) && !jsonObj.get("Output").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Output` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Output").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!HealthcheckResult.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'HealthcheckResult' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<HealthcheckResult> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(HealthcheckResult.class));

       return (TypeAdapter<T>) new TypeAdapter<HealthcheckResult>() {
           @Override
           public void write(JsonWriter out, HealthcheckResult value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public HealthcheckResult read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of HealthcheckResult given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of HealthcheckResult
     * @throws IOException if the JSON string is invalid with respect to HealthcheckResult
  */
  public static HealthcheckResult fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, HealthcheckResult.class);
  }

    /**
     * Convert an instance of HealthcheckResult to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


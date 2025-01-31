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
import io.github.alersrt.pod4j.openapi.model.Schema2HealthConfig;
import io.github.alersrt.pod4j.openapi.model.StartupHealthCheck;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * ContainerHealthCheckConfig describes a container healthcheck with attributes like command, retries, interval, start period, and timeout.
 */
@ApiModel(description = "ContainerHealthCheckConfig describes a container healthcheck with attributes like command, retries, interval, start period, and timeout.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContainerHealthCheckConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_HEALTH_CHECK_ON_FAILURE_ACTION = "health_check_on_failure_action";
  @SerializedName(SERIALIZED_NAME_HEALTH_CHECK_ON_FAILURE_ACTION)
  private Long healthCheckOnFailureAction;

  public static final String SERIALIZED_NAME_HEALTH_LOG_DESTINATION = "healthLogDestination";
  @SerializedName(SERIALIZED_NAME_HEALTH_LOG_DESTINATION)
  private String healthLogDestination;

  public static final String SERIALIZED_NAME_HEALTH_MAX_LOG_COUNT = "healthMaxLogCount";
  @SerializedName(SERIALIZED_NAME_HEALTH_MAX_LOG_COUNT)
  private Integer healthMaxLogCount;

  public static final String SERIALIZED_NAME_HEALTH_MAX_LOG_SIZE = "healthMaxLogSize";
  @SerializedName(SERIALIZED_NAME_HEALTH_MAX_LOG_SIZE)
  private Integer healthMaxLogSize;

  public static final String SERIALIZED_NAME_HEALTHCONFIG = "healthconfig";
  @SerializedName(SERIALIZED_NAME_HEALTHCONFIG)
  private Schema2HealthConfig healthconfig;

  public static final String SERIALIZED_NAME_STARTUP_HEALTH_CONFIG = "startupHealthConfig";
  @SerializedName(SERIALIZED_NAME_STARTUP_HEALTH_CONFIG)
  private StartupHealthCheck startupHealthConfig;

  public ContainerHealthCheckConfig() {
  }

  public ContainerHealthCheckConfig healthCheckOnFailureAction(Long healthCheckOnFailureAction) {

      this.healthCheckOnFailureAction = healthCheckOnFailureAction;
    return this;
  }

    /**
   * HealthCheckOnFailureAction defines how Podman reacts when a container&#39;s health status turns unhealthy.
   * @return healthCheckOnFailureAction
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "HealthCheckOnFailureAction defines how Podman reacts when a container's health status turns unhealthy.")

  public Long getHealthCheckOnFailureAction() {
    return healthCheckOnFailureAction;
  }


  public void setHealthCheckOnFailureAction(Long healthCheckOnFailureAction) {
    this.healthCheckOnFailureAction = healthCheckOnFailureAction;
  }


  public ContainerHealthCheckConfig healthLogDestination(String healthLogDestination) {

      this.healthLogDestination = healthLogDestination;
    return this;
  }

    /**
   * HealthLogDestination defines the destination where the log is stored
   * @return healthLogDestination
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "HealthLogDestination defines the destination where the log is stored")

  public String getHealthLogDestination() {
    return healthLogDestination;
  }


  public void setHealthLogDestination(String healthLogDestination) {
    this.healthLogDestination = healthLogDestination;
  }


  public ContainerHealthCheckConfig healthMaxLogCount(Integer healthMaxLogCount) {

      this.healthMaxLogCount = healthMaxLogCount;
    return this;
  }

    /**
   * HealthMaxLogCount is maximum number of attempts in the HealthCheck log file. (&#39;0&#39; value means an infinite number of attempts in the log file)
   * @return healthMaxLogCount
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "HealthMaxLogCount is maximum number of attempts in the HealthCheck log file. ('0' value means an infinite number of attempts in the log file)")

  public Integer getHealthMaxLogCount() {
    return healthMaxLogCount;
  }


  public void setHealthMaxLogCount(Integer healthMaxLogCount) {
    this.healthMaxLogCount = healthMaxLogCount;
  }


  public ContainerHealthCheckConfig healthMaxLogSize(Integer healthMaxLogSize) {

      this.healthMaxLogSize = healthMaxLogSize;
    return this;
  }

    /**
   * HealthMaxLogSize is the maximum length in characters of stored HealthCheck log (\&quot;0\&quot; value means an infinite log length)
   * @return healthMaxLogSize
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "HealthMaxLogSize is the maximum length in characters of stored HealthCheck log (\"0\" value means an infinite log length)")

  public Integer getHealthMaxLogSize() {
    return healthMaxLogSize;
  }


  public void setHealthMaxLogSize(Integer healthMaxLogSize) {
    this.healthMaxLogSize = healthMaxLogSize;
  }


  public ContainerHealthCheckConfig healthconfig(Schema2HealthConfig healthconfig) {

      this.healthconfig = healthconfig;
    return this;
  }

    /**
   * Get healthconfig
   * @return healthconfig
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public Schema2HealthConfig getHealthconfig() {
    return healthconfig;
  }


  public void setHealthconfig(Schema2HealthConfig healthconfig) {
    this.healthconfig = healthconfig;
  }


  public ContainerHealthCheckConfig startupHealthConfig(StartupHealthCheck startupHealthConfig) {

      this.startupHealthConfig = startupHealthConfig;
    return this;
  }

    /**
   * Get startupHealthConfig
   * @return startupHealthConfig
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public StartupHealthCheck getStartupHealthConfig() {
    return startupHealthConfig;
  }


  public void setStartupHealthConfig(StartupHealthCheck startupHealthConfig) {
    this.startupHealthConfig = startupHealthConfig;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerHealthCheckConfig containerHealthCheckConfig = (ContainerHealthCheckConfig) o;
    return Objects.equals(this.healthCheckOnFailureAction, containerHealthCheckConfig.healthCheckOnFailureAction) &&
        Objects.equals(this.healthLogDestination, containerHealthCheckConfig.healthLogDestination) &&
        Objects.equals(this.healthMaxLogCount, containerHealthCheckConfig.healthMaxLogCount) &&
        Objects.equals(this.healthMaxLogSize, containerHealthCheckConfig.healthMaxLogSize) &&
        Objects.equals(this.healthconfig, containerHealthCheckConfig.healthconfig) &&
        Objects.equals(this.startupHealthConfig, containerHealthCheckConfig.startupHealthConfig);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthCheckOnFailureAction, healthLogDestination, healthMaxLogCount, healthMaxLogSize, healthconfig, startupHealthConfig);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerHealthCheckConfig {\n");
    sb.append("    healthCheckOnFailureAction: ").append(toIndentedString(healthCheckOnFailureAction)).append("\n");
    sb.append("    healthLogDestination: ").append(toIndentedString(healthLogDestination)).append("\n");
    sb.append("    healthMaxLogCount: ").append(toIndentedString(healthMaxLogCount)).append("\n");
    sb.append("    healthMaxLogSize: ").append(toIndentedString(healthMaxLogSize)).append("\n");
    sb.append("    healthconfig: ").append(toIndentedString(healthconfig)).append("\n");
    sb.append("    startupHealthConfig: ").append(toIndentedString(startupHealthConfig)).append("\n");
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
    openapiFields.add("health_check_on_failure_action");
    openapiFields.add("healthLogDestination");
    openapiFields.add("healthMaxLogCount");
    openapiFields.add("healthMaxLogSize");
    openapiFields.add("healthconfig");
    openapiFields.add("startupHealthConfig");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ContainerHealthCheckConfig
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (ContainerHealthCheckConfig.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerHealthCheckConfig is not found in the empty JSON string", ContainerHealthCheckConfig.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!ContainerHealthCheckConfig.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerHealthCheckConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("healthLogDestination") != null && !jsonObj.get("healthLogDestination").isJsonNull()) && !jsonObj.get("healthLogDestination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `healthLogDestination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("healthLogDestination").toString()));
      }
      // validate the optional field `healthconfig`
      if (jsonObj.get("healthconfig") != null && !jsonObj.get("healthconfig").isJsonNull()) {
          Schema2HealthConfig.validateJsonObject(jsonObj.getAsJsonObject("healthconfig"));
      }
      // validate the optional field `startupHealthConfig`
      if (jsonObj.get("startupHealthConfig") != null && !jsonObj.get("startupHealthConfig").isJsonNull()) {
          StartupHealthCheck.validateJsonObject(jsonObj.getAsJsonObject("startupHealthConfig"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerHealthCheckConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerHealthCheckConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerHealthCheckConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerHealthCheckConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerHealthCheckConfig>() {
           @Override
           public void write(JsonWriter out, ContainerHealthCheckConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerHealthCheckConfig read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of ContainerHealthCheckConfig given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ContainerHealthCheckConfig
     * @throws IOException if the JSON string is invalid with respect to ContainerHealthCheckConfig
     */
  public static ContainerHealthCheckConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerHealthCheckConfig.class);
  }

    /**
     * Convert an instance of ContainerHealthCheckConfig to an JSON string
     *
     * @return JSON string
     */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import java.io.IOException;
import java.util.Arrays;
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
 * UpdateHealthCheckConfig
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T02:16:23.826374396+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class UpdateHealthCheckConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_HEALTH_CMD = "health_cmd";
  @SerializedName(SERIALIZED_NAME_HEALTH_CMD)
  private String healthCmd;

  public static final String SERIALIZED_NAME_HEALTH_INTERVAL = "health_interval";
  @SerializedName(SERIALIZED_NAME_HEALTH_INTERVAL)
  private String healthInterval;

  public static final String SERIALIZED_NAME_HEALTH_LOG_DESTINATION = "health_log_destination";
  @SerializedName(SERIALIZED_NAME_HEALTH_LOG_DESTINATION)
  private String healthLogDestination;

  public static final String SERIALIZED_NAME_HEALTH_MAX_LOG_COUNT = "health_max_log_count";
  @SerializedName(SERIALIZED_NAME_HEALTH_MAX_LOG_COUNT)
  private Integer healthMaxLogCount;

  public static final String SERIALIZED_NAME_HEALTH_MAX_LOG_SIZE = "health_max_log_size";
  @SerializedName(SERIALIZED_NAME_HEALTH_MAX_LOG_SIZE)
  private Integer healthMaxLogSize;

  public static final String SERIALIZED_NAME_HEALTH_ON_FAILURE = "health_on_failure";
  @SerializedName(SERIALIZED_NAME_HEALTH_ON_FAILURE)
  private String healthOnFailure;

  public static final String SERIALIZED_NAME_HEALTH_RETRIES = "health_retries";
  @SerializedName(SERIALIZED_NAME_HEALTH_RETRIES)
  private Integer healthRetries;

  public static final String SERIALIZED_NAME_HEALTH_START_PERIOD = "health_start_period";
  @SerializedName(SERIALIZED_NAME_HEALTH_START_PERIOD)
  private String healthStartPeriod;

  public static final String SERIALIZED_NAME_HEALTH_STARTUP_CMD = "health_startup_cmd";
  @SerializedName(SERIALIZED_NAME_HEALTH_STARTUP_CMD)
  private String healthStartupCmd;

  public static final String SERIALIZED_NAME_HEALTH_STARTUP_INTERVAL = "health_startup_interval";
  @SerializedName(SERIALIZED_NAME_HEALTH_STARTUP_INTERVAL)
  private String healthStartupInterval;

  public static final String SERIALIZED_NAME_HEALTH_STARTUP_RETRIES = "health_startup_retries";
  @SerializedName(SERIALIZED_NAME_HEALTH_STARTUP_RETRIES)
  private Integer healthStartupRetries;

  public static final String SERIALIZED_NAME_HEALTH_STARTUP_SUCCESS = "health_startup_success";
  @SerializedName(SERIALIZED_NAME_HEALTH_STARTUP_SUCCESS)
  private Integer healthStartupSuccess;

  public static final String SERIALIZED_NAME_HEALTH_STARTUP_TIMEOUT = "health_startup_timeout";
  @SerializedName(SERIALIZED_NAME_HEALTH_STARTUP_TIMEOUT)
  private String healthStartupTimeout;

  public static final String SERIALIZED_NAME_HEALTH_TIMEOUT = "health_timeout";
  @SerializedName(SERIALIZED_NAME_HEALTH_TIMEOUT)
  private String healthTimeout;

  public static final String SERIALIZED_NAME_NO_HEALTHCHECK = "no_healthcheck";
  @SerializedName(SERIALIZED_NAME_NO_HEALTHCHECK)
  private Boolean noHealthcheck;

  public UpdateHealthCheckConfig() {
  }

  public UpdateHealthCheckConfig healthCmd(String healthCmd) {
    this.healthCmd = healthCmd;
    return this;
  }

  /**
   * HealthCmd set a healthcheck command for the container. (&#39;none&#39; disables the existing healthcheck)
   * @return healthCmd
   */
  @jakarta.annotation.Nullable

  public String getHealthCmd() {
    return healthCmd;
  }

  public void setHealthCmd(String healthCmd) {
    this.healthCmd = healthCmd;
  }


  public UpdateHealthCheckConfig healthInterval(String healthInterval) {
    this.healthInterval = healthInterval;
    return this;
  }

  /**
   * HealthInterval set an interval for the healthcheck. (a value of disable results in no automatic timer setup) Changing this setting resets timer.
   * @return healthInterval
   */
  @jakarta.annotation.Nullable

  public String getHealthInterval() {
    return healthInterval;
  }

  public void setHealthInterval(String healthInterval) {
    this.healthInterval = healthInterval;
  }


  public UpdateHealthCheckConfig healthLogDestination(String healthLogDestination) {
    this.healthLogDestination = healthLogDestination;
    return this;
  }

  /**
   * HealthLogDestination set the destination of the HealthCheck log. Directory path, local or events_logger (local use container state file) Warning: Changing this setting may cause the loss of previous logs!
   * @return healthLogDestination
   */
  @jakarta.annotation.Nullable

  public String getHealthLogDestination() {
    return healthLogDestination;
  }

  public void setHealthLogDestination(String healthLogDestination) {
    this.healthLogDestination = healthLogDestination;
  }


  public UpdateHealthCheckConfig healthMaxLogCount(Integer healthMaxLogCount) {
    this.healthMaxLogCount = healthMaxLogCount;
    return this;
  }

  /**
   * HealthMaxLogCount set maximum number of attempts in the HealthCheck log file. (&#39;0&#39; value means an infinite number of attempts in the log file)
   * @return healthMaxLogCount
   */
  @jakarta.annotation.Nullable

  public Integer getHealthMaxLogCount() {
    return healthMaxLogCount;
  }

  public void setHealthMaxLogCount(Integer healthMaxLogCount) {
    this.healthMaxLogCount = healthMaxLogCount;
  }


  public UpdateHealthCheckConfig healthMaxLogSize(Integer healthMaxLogSize) {
    this.healthMaxLogSize = healthMaxLogSize;
    return this;
  }

  /**
   * HealthMaxLogSize set maximum length in characters of stored HealthCheck log. (&#39;0&#39; value means an infinite log length)
   * @return healthMaxLogSize
   */
  @jakarta.annotation.Nullable

  public Integer getHealthMaxLogSize() {
    return healthMaxLogSize;
  }

  public void setHealthMaxLogSize(Integer healthMaxLogSize) {
    this.healthMaxLogSize = healthMaxLogSize;
  }


  public UpdateHealthCheckConfig healthOnFailure(String healthOnFailure) {
    this.healthOnFailure = healthOnFailure;
    return this;
  }

  /**
   * HealthOnFailure set the action to take once the container turns unhealthy.
   * @return healthOnFailure
   */
  @jakarta.annotation.Nullable

  public String getHealthOnFailure() {
    return healthOnFailure;
  }

  public void setHealthOnFailure(String healthOnFailure) {
    this.healthOnFailure = healthOnFailure;
  }


  public UpdateHealthCheckConfig healthRetries(Integer healthRetries) {
    this.healthRetries = healthRetries;
    return this;
  }

  /**
   * HealthRetries set the number of retries allowed before a healthcheck is considered to be unhealthy.
   * @return healthRetries
   */
  @jakarta.annotation.Nullable

  public Integer getHealthRetries() {
    return healthRetries;
  }

  public void setHealthRetries(Integer healthRetries) {
    this.healthRetries = healthRetries;
  }


  public UpdateHealthCheckConfig healthStartPeriod(String healthStartPeriod) {
    this.healthStartPeriod = healthStartPeriod;
    return this;
  }

  /**
   * HealthStartPeriod set the initialization time needed for a container to bootstrap.
   * @return healthStartPeriod
   */
  @jakarta.annotation.Nullable

  public String getHealthStartPeriod() {
    return healthStartPeriod;
  }

  public void setHealthStartPeriod(String healthStartPeriod) {
    this.healthStartPeriod = healthStartPeriod;
  }


  public UpdateHealthCheckConfig healthStartupCmd(String healthStartupCmd) {
    this.healthStartupCmd = healthStartupCmd;
    return this;
  }

  /**
   * HealthStartupCmd set a startup healthcheck command for the container.
   * @return healthStartupCmd
   */
  @jakarta.annotation.Nullable

  public String getHealthStartupCmd() {
    return healthStartupCmd;
  }

  public void setHealthStartupCmd(String healthStartupCmd) {
    this.healthStartupCmd = healthStartupCmd;
  }


  public UpdateHealthCheckConfig healthStartupInterval(String healthStartupInterval) {
    this.healthStartupInterval = healthStartupInterval;
    return this;
  }

  /**
   * HealthStartupInterval set an interval for the startup healthcheck. Changing this setting resets the timer, depending on the state of the container.
   * @return healthStartupInterval
   */
  @jakarta.annotation.Nullable

  public String getHealthStartupInterval() {
    return healthStartupInterval;
  }

  public void setHealthStartupInterval(String healthStartupInterval) {
    this.healthStartupInterval = healthStartupInterval;
  }


  public UpdateHealthCheckConfig healthStartupRetries(Integer healthStartupRetries) {
    this.healthStartupRetries = healthStartupRetries;
    return this;
  }

  /**
   * HealthStartupRetries set the maximum number of retries before the startup healthcheck will restart the container.
   * @return healthStartupRetries
   */
  @jakarta.annotation.Nullable

  public Integer getHealthStartupRetries() {
    return healthStartupRetries;
  }

  public void setHealthStartupRetries(Integer healthStartupRetries) {
    this.healthStartupRetries = healthStartupRetries;
  }


  public UpdateHealthCheckConfig healthStartupSuccess(Integer healthStartupSuccess) {
    this.healthStartupSuccess = healthStartupSuccess;
    return this;
  }

  /**
   * HealthStartupSuccess set the number of consecutive successes before the startup healthcheck is marked as successful and the normal healthcheck begins (0 indicates any success will start the regular healthcheck)
   * @return healthStartupSuccess
   */
  @jakarta.annotation.Nullable

  public Integer getHealthStartupSuccess() {
    return healthStartupSuccess;
  }

  public void setHealthStartupSuccess(Integer healthStartupSuccess) {
    this.healthStartupSuccess = healthStartupSuccess;
  }


  public UpdateHealthCheckConfig healthStartupTimeout(String healthStartupTimeout) {
    this.healthStartupTimeout = healthStartupTimeout;
    return this;
  }

  /**
   * HealthStartupTimeout set the maximum amount of time that the startup healthcheck may take before it is considered failed.
   * @return healthStartupTimeout
   */
  @jakarta.annotation.Nullable

  public String getHealthStartupTimeout() {
    return healthStartupTimeout;
  }

  public void setHealthStartupTimeout(String healthStartupTimeout) {
    this.healthStartupTimeout = healthStartupTimeout;
  }


  public UpdateHealthCheckConfig healthTimeout(String healthTimeout) {
    this.healthTimeout = healthTimeout;
    return this;
  }

  /**
   * HealthTimeout set the maximum time allowed to complete the healthcheck before an interval is considered failed.
   * @return healthTimeout
   */
  @jakarta.annotation.Nullable

  public String getHealthTimeout() {
    return healthTimeout;
  }

  public void setHealthTimeout(String healthTimeout) {
    this.healthTimeout = healthTimeout;
  }


  public UpdateHealthCheckConfig noHealthcheck(Boolean noHealthcheck) {
    this.noHealthcheck = noHealthcheck;
    return this;
  }

  /**
   * Disable healthchecks on container.
   * @return noHealthcheck
   */
  @jakarta.annotation.Nullable

  public Boolean getNoHealthcheck() {
    return noHealthcheck;
  }

  public void setNoHealthcheck(Boolean noHealthcheck) {
    this.noHealthcheck = noHealthcheck;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UpdateHealthCheckConfig updateHealthCheckConfig = (UpdateHealthCheckConfig) o;
    return Objects.equals(this.healthCmd, updateHealthCheckConfig.healthCmd) &&
        Objects.equals(this.healthInterval, updateHealthCheckConfig.healthInterval) &&
        Objects.equals(this.healthLogDestination, updateHealthCheckConfig.healthLogDestination) &&
        Objects.equals(this.healthMaxLogCount, updateHealthCheckConfig.healthMaxLogCount) &&
        Objects.equals(this.healthMaxLogSize, updateHealthCheckConfig.healthMaxLogSize) &&
        Objects.equals(this.healthOnFailure, updateHealthCheckConfig.healthOnFailure) &&
        Objects.equals(this.healthRetries, updateHealthCheckConfig.healthRetries) &&
        Objects.equals(this.healthStartPeriod, updateHealthCheckConfig.healthStartPeriod) &&
        Objects.equals(this.healthStartupCmd, updateHealthCheckConfig.healthStartupCmd) &&
        Objects.equals(this.healthStartupInterval, updateHealthCheckConfig.healthStartupInterval) &&
        Objects.equals(this.healthStartupRetries, updateHealthCheckConfig.healthStartupRetries) &&
        Objects.equals(this.healthStartupSuccess, updateHealthCheckConfig.healthStartupSuccess) &&
        Objects.equals(this.healthStartupTimeout, updateHealthCheckConfig.healthStartupTimeout) &&
        Objects.equals(this.healthTimeout, updateHealthCheckConfig.healthTimeout) &&
        Objects.equals(this.noHealthcheck, updateHealthCheckConfig.noHealthcheck);
  }

  @Override
  public int hashCode() {
    return Objects.hash(healthCmd, healthInterval, healthLogDestination, healthMaxLogCount, healthMaxLogSize, healthOnFailure, healthRetries, healthStartPeriod, healthStartupCmd, healthStartupInterval, healthStartupRetries, healthStartupSuccess, healthStartupTimeout, healthTimeout, noHealthcheck);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateHealthCheckConfig {\n");
    sb.append("    healthCmd: ").append(toIndentedString(healthCmd)).append("\n");
    sb.append("    healthInterval: ").append(toIndentedString(healthInterval)).append("\n");
    sb.append("    healthLogDestination: ").append(toIndentedString(healthLogDestination)).append("\n");
    sb.append("    healthMaxLogCount: ").append(toIndentedString(healthMaxLogCount)).append("\n");
    sb.append("    healthMaxLogSize: ").append(toIndentedString(healthMaxLogSize)).append("\n");
    sb.append("    healthOnFailure: ").append(toIndentedString(healthOnFailure)).append("\n");
    sb.append("    healthRetries: ").append(toIndentedString(healthRetries)).append("\n");
    sb.append("    healthStartPeriod: ").append(toIndentedString(healthStartPeriod)).append("\n");
    sb.append("    healthStartupCmd: ").append(toIndentedString(healthStartupCmd)).append("\n");
    sb.append("    healthStartupInterval: ").append(toIndentedString(healthStartupInterval)).append("\n");
    sb.append("    healthStartupRetries: ").append(toIndentedString(healthStartupRetries)).append("\n");
    sb.append("    healthStartupSuccess: ").append(toIndentedString(healthStartupSuccess)).append("\n");
    sb.append("    healthStartupTimeout: ").append(toIndentedString(healthStartupTimeout)).append("\n");
    sb.append("    healthTimeout: ").append(toIndentedString(healthTimeout)).append("\n");
    sb.append("    noHealthcheck: ").append(toIndentedString(noHealthcheck)).append("\n");
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
    openapiFields.add("health_cmd");
    openapiFields.add("health_interval");
    openapiFields.add("health_log_destination");
    openapiFields.add("health_max_log_count");
    openapiFields.add("health_max_log_size");
    openapiFields.add("health_on_failure");
    openapiFields.add("health_retries");
    openapiFields.add("health_start_period");
    openapiFields.add("health_startup_cmd");
    openapiFields.add("health_startup_interval");
    openapiFields.add("health_startup_retries");
    openapiFields.add("health_startup_success");
    openapiFields.add("health_startup_timeout");
    openapiFields.add("health_timeout");
    openapiFields.add("no_healthcheck");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to UpdateHealthCheckConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!UpdateHealthCheckConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UpdateHealthCheckConfig is not found in the empty JSON string", UpdateHealthCheckConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!UpdateHealthCheckConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UpdateHealthCheckConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("health_cmd") != null && !jsonObj.get("health_cmd").isJsonNull()) && !jsonObj.get("health_cmd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_cmd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_cmd").toString()));
      }
      if ((jsonObj.get("health_interval") != null && !jsonObj.get("health_interval").isJsonNull()) && !jsonObj.get("health_interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_interval").toString()));
      }
      if ((jsonObj.get("health_log_destination") != null && !jsonObj.get("health_log_destination").isJsonNull()) && !jsonObj.get("health_log_destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_log_destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_log_destination").toString()));
      }
      if ((jsonObj.get("health_on_failure") != null && !jsonObj.get("health_on_failure").isJsonNull()) && !jsonObj.get("health_on_failure").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_on_failure` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_on_failure").toString()));
      }
      if ((jsonObj.get("health_start_period") != null && !jsonObj.get("health_start_period").isJsonNull()) && !jsonObj.get("health_start_period").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_start_period` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_start_period").toString()));
      }
      if ((jsonObj.get("health_startup_cmd") != null && !jsonObj.get("health_startup_cmd").isJsonNull()) && !jsonObj.get("health_startup_cmd").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_startup_cmd` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_startup_cmd").toString()));
      }
      if ((jsonObj.get("health_startup_interval") != null && !jsonObj.get("health_startup_interval").isJsonNull()) && !jsonObj.get("health_startup_interval").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_startup_interval` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_startup_interval").toString()));
      }
      if ((jsonObj.get("health_startup_timeout") != null && !jsonObj.get("health_startup_timeout").isJsonNull()) && !jsonObj.get("health_startup_timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_startup_timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_startup_timeout").toString()));
      }
      if ((jsonObj.get("health_timeout") != null && !jsonObj.get("health_timeout").isJsonNull()) && !jsonObj.get("health_timeout").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `health_timeout` to be a primitive type in the JSON string but got `%s`", jsonObj.get("health_timeout").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UpdateHealthCheckConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UpdateHealthCheckConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UpdateHealthCheckConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UpdateHealthCheckConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<UpdateHealthCheckConfig>() {
           @Override
           public void write(JsonWriter out, UpdateHealthCheckConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UpdateHealthCheckConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of UpdateHealthCheckConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of UpdateHealthCheckConfig
   * @throws IOException if the JSON string is invalid with respect to UpdateHealthCheckConfig
   */
  public static UpdateHealthCheckConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UpdateHealthCheckConfig.class);
  }

  /**
   * Convert an instance of UpdateHealthCheckConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


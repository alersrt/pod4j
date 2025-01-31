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
import io.github.alersrt.pod4j.openapi.model.Health;
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
 * ContainerState stores container&#39;s running state it&#39;s part of ContainerJSONBase and will return by \&quot;inspect\&quot; command
 */
@ApiModel(description = "ContainerState stores container's running state it's part of ContainerJSONBase and will return by \"inspect\" command")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ContainerState implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DEAD = "Dead";
  @SerializedName(SERIALIZED_NAME_DEAD)
  private Boolean dead;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_EXIT_CODE = "ExitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private Long exitCode;

  public static final String SERIALIZED_NAME_FINISHED_AT = "FinishedAt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private String finishedAt;

  public static final String SERIALIZED_NAME_HEALTH = "Health";
  @SerializedName(SERIALIZED_NAME_HEALTH)
  private Health health;

  public static final String SERIALIZED_NAME_OO_M_KILLED = "OOMKilled";
  @SerializedName(SERIALIZED_NAME_OO_M_KILLED)
  private Boolean ooMKilled;

  public static final String SERIALIZED_NAME_PAUSED = "Paused";
  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_PID = "Pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private Long pid;

  public static final String SERIALIZED_NAME_RESTARTING = "Restarting";
  @SerializedName(SERIALIZED_NAME_RESTARTING)
  private Boolean restarting;

  public static final String SERIALIZED_NAME_RUNNING = "Running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  private Boolean running;

  public static final String SERIALIZED_NAME_STARTED_AT = "StartedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private String startedAt;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ContainerState() {
  }

  public ContainerState dead(Boolean dead) {

      this.dead = dead;
    return this;
  }

    /**
   * Get dead
   * @return dead
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public Boolean getDead() {
    return dead;
  }


  public void setDead(Boolean dead) {
    this.dead = dead;
  }


  public ContainerState error(String error) {

      this.error = error;
    return this;
  }

    /**
   * Get error
   * @return error
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public String getError() {
    return error;
  }


  public void setError(String error) {
    this.error = error;
  }


  public ContainerState exitCode(Long exitCode) {

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


  public ContainerState finishedAt(String finishedAt) {

      this.finishedAt = finishedAt;
    return this;
  }

    /**
   * Get finishedAt
   * @return finishedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public String getFinishedAt() {
    return finishedAt;
  }


  public void setFinishedAt(String finishedAt) {
    this.finishedAt = finishedAt;
  }


  public ContainerState health(Health health) {

      this.health = health;
    return this;
  }

    /**
   * Get health
   * @return health
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public Health getHealth() {
    return health;
  }


  public void setHealth(Health health) {
    this.health = health;
  }


  public ContainerState ooMKilled(Boolean ooMKilled) {

      this.ooMKilled = ooMKilled;
    return this;
  }

    /**
   * Get ooMKilled
   * @return ooMKilled
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public Boolean getOoMKilled() {
    return ooMKilled;
  }


  public void setOoMKilled(Boolean ooMKilled) {
    this.ooMKilled = ooMKilled;
  }


  public ContainerState paused(Boolean paused) {

      this.paused = paused;
    return this;
  }

    /**
   * Get paused
   * @return paused
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public Boolean getPaused() {
    return paused;
  }


  public void setPaused(Boolean paused) {
    this.paused = paused;
  }


  public ContainerState pid(Long pid) {

      this.pid = pid;
    return this;
  }

    /**
   * Get pid
   * @return pid
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public Long getPid() {
    return pid;
  }


  public void setPid(Long pid) {
    this.pid = pid;
  }


  public ContainerState restarting(Boolean restarting) {

      this.restarting = restarting;
    return this;
  }

    /**
   * Get restarting
   * @return restarting
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public Boolean getRestarting() {
    return restarting;
  }


  public void setRestarting(Boolean restarting) {
    this.restarting = restarting;
  }


  public ContainerState running(Boolean running) {

      this.running = running;
    return this;
  }

    /**
   * Get running
   * @return running
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public Boolean getRunning() {
    return running;
  }


  public void setRunning(Boolean running) {
    this.running = running;
  }


  public ContainerState startedAt(String startedAt) {

      this.startedAt = startedAt;
    return this;
  }

    /**
   * Get startedAt
   * @return startedAt
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

  public String getStartedAt() {
    return startedAt;
  }


  public void setStartedAt(String startedAt) {
    this.startedAt = startedAt;
  }


  public ContainerState status(String status) {

      this.status = status;
    return this;
  }

    /**
   * Get status
   * @return status
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "")

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
    ContainerState containerState = (ContainerState) o;
    return Objects.equals(this.dead, containerState.dead) &&
        Objects.equals(this.error, containerState.error) &&
        Objects.equals(this.exitCode, containerState.exitCode) &&
        Objects.equals(this.finishedAt, containerState.finishedAt) &&
        Objects.equals(this.health, containerState.health) &&
        Objects.equals(this.ooMKilled, containerState.ooMKilled) &&
        Objects.equals(this.paused, containerState.paused) &&
        Objects.equals(this.pid, containerState.pid) &&
        Objects.equals(this.restarting, containerState.restarting) &&
        Objects.equals(this.running, containerState.running) &&
        Objects.equals(this.startedAt, containerState.startedAt) &&
        Objects.equals(this.status, containerState.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dead, error, exitCode, finishedAt, health, ooMKilled, paused, pid, restarting, running, startedAt, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerState {\n");
    sb.append("    dead: ").append(toIndentedString(dead)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    ooMKilled: ").append(toIndentedString(ooMKilled)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    restarting: ").append(toIndentedString(restarting)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
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
    openapiFields.add("Dead");
    openapiFields.add("Error");
    openapiFields.add("ExitCode");
    openapiFields.add("FinishedAt");
    openapiFields.add("Health");
    openapiFields.add("OOMKilled");
    openapiFields.add("Paused");
    openapiFields.add("Pid");
    openapiFields.add("Restarting");
    openapiFields.add("Running");
    openapiFields.add("StartedAt");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ContainerState
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (ContainerState.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerState is not found in the empty JSON string", ContainerState.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!ContainerState.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerState` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Error") != null && !jsonObj.get("Error").isJsonNull()) && !jsonObj.get("Error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Error").toString()));
      }
      if ((jsonObj.get("FinishedAt") != null && !jsonObj.get("FinishedAt").isJsonNull()) && !jsonObj.get("FinishedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `FinishedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("FinishedAt").toString()));
      }
      // validate the optional field `Health`
      if (jsonObj.get("Health") != null && !jsonObj.get("Health").isJsonNull()) {
          Health.validateJsonObject(jsonObj.getAsJsonObject("Health"));
      }
      if ((jsonObj.get("StartedAt") != null && !jsonObj.get("StartedAt").isJsonNull()) && !jsonObj.get("StartedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `StartedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("StartedAt").toString()));
      }
      if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerState.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerState>() {
           @Override
           public void write(JsonWriter out, ContainerState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerState read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of ContainerState given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ContainerState
     * @throws IOException if the JSON string is invalid with respect to ContainerState
     */
  public static ContainerState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerState.class);
  }

    /**
     * Convert an instance of ContainerState to an JSON string
     *
     * @return JSON string
     */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


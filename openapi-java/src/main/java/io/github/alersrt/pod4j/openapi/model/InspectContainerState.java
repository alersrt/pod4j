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
import io.github.alersrt.pod4j.openapi.model.HealthCheckResults;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * InspectContainerState provides a detailed record of a container&#39;s current state. It is returned as part of InspectContainerData. As with InspectContainerData, many portions of this struct are matched to Docker, but here we see more fields that are unused (nonsensical in the context of Libpod).
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T23:04:06.361421791+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class InspectContainerState implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CGROUP_PATH = "CgroupPath";
  @SerializedName(SERIALIZED_NAME_CGROUP_PATH)
  private String cgroupPath;

  public static final String SERIALIZED_NAME_CHECKPOINT_LOG = "CheckpointLog";
  @SerializedName(SERIALIZED_NAME_CHECKPOINT_LOG)
  private String checkpointLog;

  public static final String SERIALIZED_NAME_CHECKPOINT_PATH = "CheckpointPath";
  @SerializedName(SERIALIZED_NAME_CHECKPOINT_PATH)
  private String checkpointPath;

  public static final String SERIALIZED_NAME_CHECKPOINTED = "Checkpointed";
  @SerializedName(SERIALIZED_NAME_CHECKPOINTED)
  private Boolean checkpointed;

  public static final String SERIALIZED_NAME_CHECKPOINTED_AT = "CheckpointedAt";
  @SerializedName(SERIALIZED_NAME_CHECKPOINTED_AT)
  private OffsetDateTime checkpointedAt;

  public static final String SERIALIZED_NAME_CONMON_PID = "ConmonPid";
  @SerializedName(SERIALIZED_NAME_CONMON_PID)
  private Long conmonPid;

  public static final String SERIALIZED_NAME_DEAD = "Dead";
  @SerializedName(SERIALIZED_NAME_DEAD)
  private Boolean dead;

  public static final String SERIALIZED_NAME_ERROR = "Error";
  @SerializedName(SERIALIZED_NAME_ERROR)
  private String error;

  public static final String SERIALIZED_NAME_EXIT_CODE = "ExitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private Integer exitCode;

  public static final String SERIALIZED_NAME_FINISHED_AT = "FinishedAt";
  @SerializedName(SERIALIZED_NAME_FINISHED_AT)
  private OffsetDateTime finishedAt;

  public static final String SERIALIZED_NAME_HEALTH = "Health";
  @SerializedName(SERIALIZED_NAME_HEALTH)
  private HealthCheckResults health;

  public static final String SERIALIZED_NAME_OO_M_KILLED = "OOMKilled";
  @SerializedName(SERIALIZED_NAME_OO_M_KILLED)
  private Boolean ooMKilled;

  public static final String SERIALIZED_NAME_OCI_VERSION = "OciVersion";
  @SerializedName(SERIALIZED_NAME_OCI_VERSION)
  private String ociVersion;

  public static final String SERIALIZED_NAME_PAUSED = "Paused";
  @SerializedName(SERIALIZED_NAME_PAUSED)
  private Boolean paused;

  public static final String SERIALIZED_NAME_PID = "Pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private Long pid;

  public static final String SERIALIZED_NAME_RESTARTING = "Restarting";
  @SerializedName(SERIALIZED_NAME_RESTARTING)
  private Boolean restarting;

  public static final String SERIALIZED_NAME_RESTORE_LOG = "RestoreLog";
  @SerializedName(SERIALIZED_NAME_RESTORE_LOG)
  private String restoreLog;

  public static final String SERIALIZED_NAME_RESTORED = "Restored";
  @SerializedName(SERIALIZED_NAME_RESTORED)
  private Boolean restored;

  public static final String SERIALIZED_NAME_RESTORED_AT = "RestoredAt";
  @SerializedName(SERIALIZED_NAME_RESTORED_AT)
  private OffsetDateTime restoredAt;

  public static final String SERIALIZED_NAME_RUNNING = "Running";
  @SerializedName(SERIALIZED_NAME_RUNNING)
  private Boolean running;

  public static final String SERIALIZED_NAME_STARTED_AT = "StartedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private OffsetDateTime startedAt;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_STOPPED_BY_USER = "StoppedByUser";
  @SerializedName(SERIALIZED_NAME_STOPPED_BY_USER)
  private Boolean stoppedByUser;

  public InspectContainerState() {
  }

  public InspectContainerState cgroupPath(String cgroupPath) {
    this.cgroupPath = cgroupPath;
    return this;
  }

  /**
   * Get cgroupPath
   * @return cgroupPath
   */
  @jakarta.annotation.Nullable

  public String getCgroupPath() {
    return cgroupPath;
  }

  public void setCgroupPath(String cgroupPath) {
    this.cgroupPath = cgroupPath;
  }


  public InspectContainerState checkpointLog(String checkpointLog) {
    this.checkpointLog = checkpointLog;
    return this;
  }

  /**
   * Get checkpointLog
   * @return checkpointLog
   */
  @jakarta.annotation.Nullable

  public String getCheckpointLog() {
    return checkpointLog;
  }

  public void setCheckpointLog(String checkpointLog) {
    this.checkpointLog = checkpointLog;
  }


  public InspectContainerState checkpointPath(String checkpointPath) {
    this.checkpointPath = checkpointPath;
    return this;
  }

  /**
   * Get checkpointPath
   * @return checkpointPath
   */
  @jakarta.annotation.Nullable

  public String getCheckpointPath() {
    return checkpointPath;
  }

  public void setCheckpointPath(String checkpointPath) {
    this.checkpointPath = checkpointPath;
  }


  public InspectContainerState checkpointed(Boolean checkpointed) {
    this.checkpointed = checkpointed;
    return this;
  }

  /**
   * Get checkpointed
   * @return checkpointed
   */
  @jakarta.annotation.Nullable

  public Boolean getCheckpointed() {
    return checkpointed;
  }

  public void setCheckpointed(Boolean checkpointed) {
    this.checkpointed = checkpointed;
  }


  public InspectContainerState checkpointedAt(OffsetDateTime checkpointedAt) {
    this.checkpointedAt = checkpointedAt;
    return this;
  }

  /**
   * Get checkpointedAt
   * @return checkpointedAt
   */
  @jakarta.annotation.Nullable
  @Valid

  public OffsetDateTime getCheckpointedAt() {
    return checkpointedAt;
  }

  public void setCheckpointedAt(OffsetDateTime checkpointedAt) {
    this.checkpointedAt = checkpointedAt;
  }


  public InspectContainerState conmonPid(Long conmonPid) {
    this.conmonPid = conmonPid;
    return this;
  }

  /**
   * Get conmonPid
   * @return conmonPid
   */
  @jakarta.annotation.Nullable

  public Long getConmonPid() {
    return conmonPid;
  }

  public void setConmonPid(Long conmonPid) {
    this.conmonPid = conmonPid;
  }


  public InspectContainerState dead(Boolean dead) {
    this.dead = dead;
    return this;
  }

  /**
   * Get dead
   * @return dead
   */
  @jakarta.annotation.Nullable

  public Boolean getDead() {
    return dead;
  }

  public void setDead(Boolean dead) {
    this.dead = dead;
  }


  public InspectContainerState error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @jakarta.annotation.Nullable

  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }


  public InspectContainerState exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Get exitCode
   * @return exitCode
   */
  @jakarta.annotation.Nullable

  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }


  public InspectContainerState finishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
    return this;
  }

  /**
   * Get finishedAt
   * @return finishedAt
   */
  @jakarta.annotation.Nullable
  @Valid

  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }

  public void setFinishedAt(OffsetDateTime finishedAt) {
    this.finishedAt = finishedAt;
  }


  public InspectContainerState health(HealthCheckResults health) {
    this.health = health;
    return this;
  }

  /**
   * Get health
   * @return health
   */
  @jakarta.annotation.Nullable
  @Valid

  public HealthCheckResults getHealth() {
    return health;
  }

  public void setHealth(HealthCheckResults health) {
    this.health = health;
  }


  public InspectContainerState ooMKilled(Boolean ooMKilled) {
    this.ooMKilled = ooMKilled;
    return this;
  }

  /**
   * Get ooMKilled
   * @return ooMKilled
   */
  @jakarta.annotation.Nullable

  public Boolean getOoMKilled() {
    return ooMKilled;
  }

  public void setOoMKilled(Boolean ooMKilled) {
    this.ooMKilled = ooMKilled;
  }


  public InspectContainerState ociVersion(String ociVersion) {
    this.ociVersion = ociVersion;
    return this;
  }

  /**
   * Get ociVersion
   * @return ociVersion
   */
  @jakarta.annotation.Nullable

  public String getOciVersion() {
    return ociVersion;
  }

  public void setOciVersion(String ociVersion) {
    this.ociVersion = ociVersion;
  }


  public InspectContainerState paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

  /**
   * Get paused
   * @return paused
   */
  @jakarta.annotation.Nullable

  public Boolean getPaused() {
    return paused;
  }

  public void setPaused(Boolean paused) {
    this.paused = paused;
  }


  public InspectContainerState pid(Long pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  @jakarta.annotation.Nullable

  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }


  public InspectContainerState restarting(Boolean restarting) {
    this.restarting = restarting;
    return this;
  }

  /**
   * Get restarting
   * @return restarting
   */
  @jakarta.annotation.Nullable

  public Boolean getRestarting() {
    return restarting;
  }

  public void setRestarting(Boolean restarting) {
    this.restarting = restarting;
  }


  public InspectContainerState restoreLog(String restoreLog) {
    this.restoreLog = restoreLog;
    return this;
  }

  /**
   * Get restoreLog
   * @return restoreLog
   */
  @jakarta.annotation.Nullable

  public String getRestoreLog() {
    return restoreLog;
  }

  public void setRestoreLog(String restoreLog) {
    this.restoreLog = restoreLog;
  }


  public InspectContainerState restored(Boolean restored) {
    this.restored = restored;
    return this;
  }

  /**
   * Get restored
   * @return restored
   */
  @jakarta.annotation.Nullable

  public Boolean getRestored() {
    return restored;
  }

  public void setRestored(Boolean restored) {
    this.restored = restored;
  }


  public InspectContainerState restoredAt(OffsetDateTime restoredAt) {
    this.restoredAt = restoredAt;
    return this;
  }

  /**
   * Get restoredAt
   * @return restoredAt
   */
  @jakarta.annotation.Nullable
  @Valid

  public OffsetDateTime getRestoredAt() {
    return restoredAt;
  }

  public void setRestoredAt(OffsetDateTime restoredAt) {
    this.restoredAt = restoredAt;
  }


  public InspectContainerState running(Boolean running) {
    this.running = running;
    return this;
  }

  /**
   * Get running
   * @return running
   */
  @jakarta.annotation.Nullable

  public Boolean getRunning() {
    return running;
  }

  public void setRunning(Boolean running) {
    this.running = running;
  }


  public InspectContainerState startedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
   */
  @jakarta.annotation.Nullable
  @Valid

  public OffsetDateTime getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(OffsetDateTime startedAt) {
    this.startedAt = startedAt;
  }


  public InspectContainerState status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @jakarta.annotation.Nullable

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  public InspectContainerState stoppedByUser(Boolean stoppedByUser) {
    this.stoppedByUser = stoppedByUser;
    return this;
  }

  /**
   * Get stoppedByUser
   * @return stoppedByUser
   */
  @jakarta.annotation.Nullable

  public Boolean getStoppedByUser() {
    return stoppedByUser;
  }

  public void setStoppedByUser(Boolean stoppedByUser) {
    this.stoppedByUser = stoppedByUser;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectContainerState inspectContainerState = (InspectContainerState) o;
    return Objects.equals(this.cgroupPath, inspectContainerState.cgroupPath) &&
        Objects.equals(this.checkpointLog, inspectContainerState.checkpointLog) &&
        Objects.equals(this.checkpointPath, inspectContainerState.checkpointPath) &&
        Objects.equals(this.checkpointed, inspectContainerState.checkpointed) &&
        Objects.equals(this.checkpointedAt, inspectContainerState.checkpointedAt) &&
        Objects.equals(this.conmonPid, inspectContainerState.conmonPid) &&
        Objects.equals(this.dead, inspectContainerState.dead) &&
        Objects.equals(this.error, inspectContainerState.error) &&
        Objects.equals(this.exitCode, inspectContainerState.exitCode) &&
        Objects.equals(this.finishedAt, inspectContainerState.finishedAt) &&
        Objects.equals(this.health, inspectContainerState.health) &&
        Objects.equals(this.ooMKilled, inspectContainerState.ooMKilled) &&
        Objects.equals(this.ociVersion, inspectContainerState.ociVersion) &&
        Objects.equals(this.paused, inspectContainerState.paused) &&
        Objects.equals(this.pid, inspectContainerState.pid) &&
        Objects.equals(this.restarting, inspectContainerState.restarting) &&
        Objects.equals(this.restoreLog, inspectContainerState.restoreLog) &&
        Objects.equals(this.restored, inspectContainerState.restored) &&
        Objects.equals(this.restoredAt, inspectContainerState.restoredAt) &&
        Objects.equals(this.running, inspectContainerState.running) &&
        Objects.equals(this.startedAt, inspectContainerState.startedAt) &&
        Objects.equals(this.status, inspectContainerState.status) &&
        Objects.equals(this.stoppedByUser, inspectContainerState.stoppedByUser);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cgroupPath, checkpointLog, checkpointPath, checkpointed, checkpointedAt, conmonPid, dead, error, exitCode, finishedAt, health, ooMKilled, ociVersion, paused, pid, restarting, restoreLog, restored, restoredAt, running, startedAt, status, stoppedByUser);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectContainerState {\n");
    sb.append("    cgroupPath: ").append(toIndentedString(cgroupPath)).append("\n");
    sb.append("    checkpointLog: ").append(toIndentedString(checkpointLog)).append("\n");
    sb.append("    checkpointPath: ").append(toIndentedString(checkpointPath)).append("\n");
    sb.append("    checkpointed: ").append(toIndentedString(checkpointed)).append("\n");
    sb.append("    checkpointedAt: ").append(toIndentedString(checkpointedAt)).append("\n");
    sb.append("    conmonPid: ").append(toIndentedString(conmonPid)).append("\n");
    sb.append("    dead: ").append(toIndentedString(dead)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    finishedAt: ").append(toIndentedString(finishedAt)).append("\n");
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
    sb.append("    ooMKilled: ").append(toIndentedString(ooMKilled)).append("\n");
    sb.append("    ociVersion: ").append(toIndentedString(ociVersion)).append("\n");
    sb.append("    paused: ").append(toIndentedString(paused)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    restarting: ").append(toIndentedString(restarting)).append("\n");
    sb.append("    restoreLog: ").append(toIndentedString(restoreLog)).append("\n");
    sb.append("    restored: ").append(toIndentedString(restored)).append("\n");
    sb.append("    restoredAt: ").append(toIndentedString(restoredAt)).append("\n");
    sb.append("    running: ").append(toIndentedString(running)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stoppedByUser: ").append(toIndentedString(stoppedByUser)).append("\n");
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
    openapiFields.add("CgroupPath");
    openapiFields.add("CheckpointLog");
    openapiFields.add("CheckpointPath");
    openapiFields.add("Checkpointed");
    openapiFields.add("CheckpointedAt");
    openapiFields.add("ConmonPid");
    openapiFields.add("Dead");
    openapiFields.add("Error");
    openapiFields.add("ExitCode");
    openapiFields.add("FinishedAt");
    openapiFields.add("Health");
    openapiFields.add("OOMKilled");
    openapiFields.add("OciVersion");
    openapiFields.add("Paused");
    openapiFields.add("Pid");
    openapiFields.add("Restarting");
    openapiFields.add("RestoreLog");
    openapiFields.add("Restored");
    openapiFields.add("RestoredAt");
    openapiFields.add("Running");
    openapiFields.add("StartedAt");
    openapiFields.add("Status");
    openapiFields.add("StoppedByUser");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InspectContainerState
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InspectContainerState.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectContainerState is not found in the empty JSON string", InspectContainerState.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InspectContainerState.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectContainerState` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CgroupPath") != null && !jsonObj.get("CgroupPath").isJsonNull()) && !jsonObj.get("CgroupPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CgroupPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CgroupPath").toString()));
      }
      if ((jsonObj.get("CheckpointLog") != null && !jsonObj.get("CheckpointLog").isJsonNull()) && !jsonObj.get("CheckpointLog").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CheckpointLog` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CheckpointLog").toString()));
      }
      if ((jsonObj.get("CheckpointPath") != null && !jsonObj.get("CheckpointPath").isJsonNull()) && !jsonObj.get("CheckpointPath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CheckpointPath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CheckpointPath").toString()));
      }
      if ((jsonObj.get("Error") != null && !jsonObj.get("Error").isJsonNull()) && !jsonObj.get("Error").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Error` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Error").toString()));
      }
      // validate the optional field `Health`
      if (jsonObj.get("Health") != null && !jsonObj.get("Health").isJsonNull()) {
        HealthCheckResults.validateJsonElement(jsonObj.get("Health"));
      }
      if ((jsonObj.get("OciVersion") != null && !jsonObj.get("OciVersion").isJsonNull()) && !jsonObj.get("OciVersion").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `OciVersion` to be a primitive type in the JSON string but got `%s`", jsonObj.get("OciVersion").toString()));
      }
      if ((jsonObj.get("RestoreLog") != null && !jsonObj.get("RestoreLog").isJsonNull()) && !jsonObj.get("RestoreLog").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `RestoreLog` to be a primitive type in the JSON string but got `%s`", jsonObj.get("RestoreLog").toString()));
      }
      if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectContainerState.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectContainerState' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectContainerState> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectContainerState.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectContainerState>() {
           @Override
           public void write(JsonWriter out, InspectContainerState value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectContainerState read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InspectContainerState given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InspectContainerState
   * @throws IOException if the JSON string is invalid with respect to InspectContainerState
   */
  public static InspectContainerState fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectContainerState.class);
  }

  /**
   * Convert an instance of InspectContainerState to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


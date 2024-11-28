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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.alersrt.pod4j.openapi.model.HealthCheckResults;
import java.time.OffsetDateTime;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * InspectContainerState provides a detailed record of a container&#39;s current state. It is returned as part of InspectContainerData. As with InspectContainerData, many portions of this struct are matched to Docker, but here we see more fields that are unused (nonsensical in the context of Libpod).
 */
@JsonPropertyOrder({
  InspectContainerState.JSON_PROPERTY_CGROUP_PATH,
  InspectContainerState.JSON_PROPERTY_CHECKPOINT_LOG,
  InspectContainerState.JSON_PROPERTY_CHECKPOINT_PATH,
  InspectContainerState.JSON_PROPERTY_CHECKPOINTED,
  InspectContainerState.JSON_PROPERTY_CHECKPOINTED_AT,
  InspectContainerState.JSON_PROPERTY_CONMON_PID,
  InspectContainerState.JSON_PROPERTY_DEAD,
  InspectContainerState.JSON_PROPERTY_ERROR,
  InspectContainerState.JSON_PROPERTY_EXIT_CODE,
  InspectContainerState.JSON_PROPERTY_FINISHED_AT,
  InspectContainerState.JSON_PROPERTY_HEALTH,
  InspectContainerState.JSON_PROPERTY_OO_M_KILLED,
  InspectContainerState.JSON_PROPERTY_OCI_VERSION,
  InspectContainerState.JSON_PROPERTY_PAUSED,
  InspectContainerState.JSON_PROPERTY_PID,
  InspectContainerState.JSON_PROPERTY_RESTARTING,
  InspectContainerState.JSON_PROPERTY_RESTORE_LOG,
  InspectContainerState.JSON_PROPERTY_RESTORED,
  InspectContainerState.JSON_PROPERTY_RESTORED_AT,
  InspectContainerState.JSON_PROPERTY_RUNNING,
  InspectContainerState.JSON_PROPERTY_STARTED_AT,
  InspectContainerState.JSON_PROPERTY_STATUS,
  InspectContainerState.JSON_PROPERTY_STOPPED_BY_USER
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class InspectContainerState {
  public static final String JSON_PROPERTY_CGROUP_PATH = "CgroupPath";
  private String cgroupPath;

  public static final String JSON_PROPERTY_CHECKPOINT_LOG = "CheckpointLog";
  private String checkpointLog;

  public static final String JSON_PROPERTY_CHECKPOINT_PATH = "CheckpointPath";
  private String checkpointPath;

  public static final String JSON_PROPERTY_CHECKPOINTED = "Checkpointed";
  private Boolean checkpointed;

  public static final String JSON_PROPERTY_CHECKPOINTED_AT = "CheckpointedAt";
  private OffsetDateTime checkpointedAt;

  public static final String JSON_PROPERTY_CONMON_PID = "ConmonPid";
  private Long conmonPid;

  public static final String JSON_PROPERTY_DEAD = "Dead";
  private Boolean dead;

  public static final String JSON_PROPERTY_ERROR = "Error";
  private String error;

  public static final String JSON_PROPERTY_EXIT_CODE = "ExitCode";
  private Integer exitCode;

  public static final String JSON_PROPERTY_FINISHED_AT = "FinishedAt";
  private OffsetDateTime finishedAt;

  public static final String JSON_PROPERTY_HEALTH = "Health";
  private HealthCheckResults health;

  public static final String JSON_PROPERTY_OO_M_KILLED = "OOMKilled";
  private Boolean ooMKilled;

  public static final String JSON_PROPERTY_OCI_VERSION = "OciVersion";
  private String ociVersion;

  public static final String JSON_PROPERTY_PAUSED = "Paused";
  private Boolean paused;

  public static final String JSON_PROPERTY_PID = "Pid";
  private Long pid;

  public static final String JSON_PROPERTY_RESTARTING = "Restarting";
  private Boolean restarting;

  public static final String JSON_PROPERTY_RESTORE_LOG = "RestoreLog";
  private String restoreLog;

  public static final String JSON_PROPERTY_RESTORED = "Restored";
  private Boolean restored;

  public static final String JSON_PROPERTY_RESTORED_AT = "RestoredAt";
  private OffsetDateTime restoredAt;

  public static final String JSON_PROPERTY_RUNNING = "Running";
  private Boolean running;

  public static final String JSON_PROPERTY_STARTED_AT = "StartedAt";
  private OffsetDateTime startedAt;

  public static final String JSON_PROPERTY_STATUS = "Status";
  private String status;

  public static final String JSON_PROPERTY_STOPPED_BY_USER = "StoppedByUser";
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CGROUP_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCgroupPath() {
    return cgroupPath;
  }


  @JsonProperty(JSON_PROPERTY_CGROUP_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CHECKPOINT_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCheckpointLog() {
    return checkpointLog;
  }


  @JsonProperty(JSON_PROPERTY_CHECKPOINT_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CHECKPOINT_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCheckpointPath() {
    return checkpointPath;
  }


  @JsonProperty(JSON_PROPERTY_CHECKPOINT_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CHECKPOINTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCheckpointed() {
    return checkpointed;
  }


  @JsonProperty(JSON_PROPERTY_CHECKPOINTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_CHECKPOINTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getCheckpointedAt() {
    return checkpointedAt;
  }


  @JsonProperty(JSON_PROPERTY_CHECKPOINTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CONMON_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getConmonPid() {
    return conmonPid;
  }


  @JsonProperty(JSON_PROPERTY_CONMON_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_DEAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getDead() {
    return dead;
  }


  @JsonProperty(JSON_PROPERTY_DEAD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getError() {
    return error;
  }


  @JsonProperty(JSON_PROPERTY_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_EXIT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getExitCode() {
    return exitCode;
  }


  @JsonProperty(JSON_PROPERTY_EXIT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getFinishedAt() {
    return finishedAt;
  }


  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_HEALTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public HealthCheckResults getHealth() {
    return health;
  }


  @JsonProperty(JSON_PROPERTY_HEALTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OO_M_KILLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getOoMKilled() {
    return ooMKilled;
  }


  @JsonProperty(JSON_PROPERTY_OO_M_KILLED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OCI_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOciVersion() {
    return ociVersion;
  }


  @JsonProperty(JSON_PROPERTY_OCI_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PAUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPaused() {
    return paused;
  }


  @JsonProperty(JSON_PROPERTY_PAUSED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getPid() {
    return pid;
  }


  @JsonProperty(JSON_PROPERTY_PID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RESTARTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRestarting() {
    return restarting;
  }


  @JsonProperty(JSON_PROPERTY_RESTARTING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RESTORE_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getRestoreLog() {
    return restoreLog;
  }


  @JsonProperty(JSON_PROPERTY_RESTORE_LOG)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RESTORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRestored() {
    return restored;
  }


  @JsonProperty(JSON_PROPERTY_RESTORED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_RESTORED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getRestoredAt() {
    return restoredAt;
  }


  @JsonProperty(JSON_PROPERTY_RESTORED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RUNNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getRunning() {
    return running;
  }


  @JsonProperty(JSON_PROPERTY_RUNNING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public OffsetDateTime getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_STOPPED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getStoppedByUser() {
    return stoppedByUser;
  }


  @JsonProperty(JSON_PROPERTY_STOPPED_BY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStoppedByUser(Boolean stoppedByUser) {
    this.stoppedByUser = stoppedByUser;
  }


  /**
   * Return true if this InspectContainerState object is equal to o.
   */
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `CgroupPath` to the URL query string
    if (getCgroupPath() != null) {
      joiner.add(String.format("%sCgroupPath%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCgroupPath()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `CheckpointLog` to the URL query string
    if (getCheckpointLog() != null) {
      joiner.add(String.format("%sCheckpointLog%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCheckpointLog()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `CheckpointPath` to the URL query string
    if (getCheckpointPath() != null) {
      joiner.add(String.format("%sCheckpointPath%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCheckpointPath()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Checkpointed` to the URL query string
    if (getCheckpointed() != null) {
      joiner.add(String.format("%sCheckpointed%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCheckpointed()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `CheckpointedAt` to the URL query string
    if (getCheckpointedAt() != null) {
      joiner.add(String.format("%sCheckpointedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCheckpointedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ConmonPid` to the URL query string
    if (getConmonPid() != null) {
      joiner.add(String.format("%sConmonPid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getConmonPid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Dead` to the URL query string
    if (getDead() != null) {
      joiner.add(String.format("%sDead%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getDead()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Error` to the URL query string
    if (getError() != null) {
      joiner.add(String.format("%sError%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getError()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ExitCode` to the URL query string
    if (getExitCode() != null) {
      joiner.add(String.format("%sExitCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExitCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `FinishedAt` to the URL query string
    if (getFinishedAt() != null) {
      joiner.add(String.format("%sFinishedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getFinishedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Health` to the URL query string
    if (getHealth() != null) {
      joiner.add(getHealth().toUrlQueryString(prefix + "Health" + suffix));
    }

    // add `OOMKilled` to the URL query string
    if (getOoMKilled() != null) {
      joiner.add(String.format("%sOOMKilled%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOoMKilled()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `OciVersion` to the URL query string
    if (getOciVersion() != null) {
      joiner.add(String.format("%sOciVersion%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOciVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Paused` to the URL query string
    if (getPaused() != null) {
      joiner.add(String.format("%sPaused%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPaused()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Pid` to the URL query string
    if (getPid() != null) {
      joiner.add(String.format("%sPid%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPid()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Restarting` to the URL query string
    if (getRestarting() != null) {
      joiner.add(String.format("%sRestarting%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRestarting()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `RestoreLog` to the URL query string
    if (getRestoreLog() != null) {
      joiner.add(String.format("%sRestoreLog%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRestoreLog()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Restored` to the URL query string
    if (getRestored() != null) {
      joiner.add(String.format("%sRestored%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRestored()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `RestoredAt` to the URL query string
    if (getRestoredAt() != null) {
      joiner.add(String.format("%sRestoredAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRestoredAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Running` to the URL query string
    if (getRunning() != null) {
      joiner.add(String.format("%sRunning%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRunning()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `StartedAt` to the URL query string
    if (getStartedAt() != null) {
      joiner.add(String.format("%sStartedAt%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStartedAt()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Status` to the URL query string
    if (getStatus() != null) {
      joiner.add(String.format("%sStatus%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStatus()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `StoppedByUser` to the URL query string
    if (getStoppedByUser() != null) {
      joiner.add(String.format("%sStoppedByUser%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStoppedByUser()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


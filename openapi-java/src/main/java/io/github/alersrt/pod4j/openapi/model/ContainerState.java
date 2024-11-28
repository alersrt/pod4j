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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.alersrt.pod4j.openapi.ApiClient;
import jakarta.validation.Valid;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;
/**
 * ContainerState stores container&#39;s running state it&#39;s part of ContainerJSONBase and will return by \&quot;inspect\&quot; command
 */
@JsonPropertyOrder({
  ContainerState.JSON_PROPERTY_DEAD,
  ContainerState.JSON_PROPERTY_ERROR,
  ContainerState.JSON_PROPERTY_EXIT_CODE,
  ContainerState.JSON_PROPERTY_FINISHED_AT,
  ContainerState.JSON_PROPERTY_HEALTH,
  ContainerState.JSON_PROPERTY_OO_M_KILLED,
  ContainerState.JSON_PROPERTY_PAUSED,
  ContainerState.JSON_PROPERTY_PID,
  ContainerState.JSON_PROPERTY_RESTARTING,
  ContainerState.JSON_PROPERTY_RUNNING,
  ContainerState.JSON_PROPERTY_STARTED_AT,
  ContainerState.JSON_PROPERTY_STATUS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ContainerState {
  public static final String JSON_PROPERTY_DEAD = "Dead";
  private Boolean dead;

  public static final String JSON_PROPERTY_ERROR = "Error";
  private String error;

  public static final String JSON_PROPERTY_EXIT_CODE = "ExitCode";
  private Long exitCode;

  public static final String JSON_PROPERTY_FINISHED_AT = "FinishedAt";
  private String finishedAt;

  public static final String JSON_PROPERTY_HEALTH = "Health";
  private Health health;

  public static final String JSON_PROPERTY_OO_M_KILLED = "OOMKilled";
  private Boolean ooMKilled;

  public static final String JSON_PROPERTY_PAUSED = "Paused";
  private Boolean paused;

  public static final String JSON_PROPERTY_PID = "Pid";
  private Long pid;

  public static final String JSON_PROPERTY_RESTARTING = "Restarting";
  private Boolean restarting;

  public static final String JSON_PROPERTY_RUNNING = "Running";
  private Boolean running;

  public static final String JSON_PROPERTY_STARTED_AT = "StartedAt";
  private String startedAt;

  public static final String JSON_PROPERTY_STATUS = "Status";
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
   */
  @jakarta.annotation.Nullable

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


  public ContainerState error(String error) {
    this.error = error;
    return this;
  }

  /**
   * Get error
   * @return error
   */
  @jakarta.annotation.Nullable

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


  public ContainerState exitCode(Long exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * Get exitCode
   * @return exitCode
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_EXIT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getExitCode() {
    return exitCode;
  }


  @JsonProperty(JSON_PROPERTY_EXIT_CODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getFinishedAt() {
    return finishedAt;
  }


  @JsonProperty(JSON_PROPERTY_FINISHED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_HEALTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Health getHealth() {
    return health;
  }


  @JsonProperty(JSON_PROPERTY_HEALTH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable

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


  public ContainerState paused(Boolean paused) {
    this.paused = paused;
    return this;
  }

  /**
   * Get paused
   * @return paused
   */
  @jakarta.annotation.Nullable

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


  public ContainerState pid(Long pid) {
    this.pid = pid;
    return this;
  }

  /**
   * Get pid
   * @return pid
   */
  @jakarta.annotation.Nullable

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


  public ContainerState restarting(Boolean restarting) {
    this.restarting = restarting;
    return this;
  }

  /**
   * Get restarting
   * @return restarting
   */
  @jakarta.annotation.Nullable

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


  public ContainerState running(Boolean running) {
    this.running = running;
    return this;
  }

  /**
   * Get running
   * @return running
   */
  @jakarta.annotation.Nullable

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


  public ContainerState startedAt(String startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Get startedAt
   * @return startedAt
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStartedAt() {
    return startedAt;
  }


  @JsonProperty(JSON_PROPERTY_STARTED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
   */
  @jakarta.annotation.Nullable

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


  /**
   * Return true if this ContainerState object is equal to o.
   */
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

    return joiner.toString();
  }
}


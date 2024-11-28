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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Objects;
import java.util.StringJoiner;
/**
 * HealthCheckLog describes the results of a single healthcheck
 */
@JsonPropertyOrder({
  HealthCheckLog.JSON_PROPERTY_END,
  HealthCheckLog.JSON_PROPERTY_EXIT_CODE,
  HealthCheckLog.JSON_PROPERTY_OUTPUT,
  HealthCheckLog.JSON_PROPERTY_START
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class HealthCheckLog {
  public static final String JSON_PROPERTY_END = "End";
  private String end;

  public static final String JSON_PROPERTY_EXIT_CODE = "ExitCode";
  private Long exitCode;

  public static final String JSON_PROPERTY_OUTPUT = "Output";
  private String output;

  public static final String JSON_PROPERTY_START = "Start";
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
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEnd() {
    return end;
  }


  @JsonProperty(JSON_PROPERTY_END)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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


  public HealthCheckLog output(String output) {
    this.output = output;
    return this;
  }

  /**
   * Output is the stdout/stderr from the healthcheck command
   * @return output
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getOutput() {
    return output;
  }


  @JsonProperty(JSON_PROPERTY_OUTPUT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getStart() {
    return start;
  }


  @JsonProperty(JSON_PROPERTY_START)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStart(String start) {
    this.start = start;
  }


  /**
   * Return true if this HealthCheckLog object is equal to o.
   */
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

    // add `End` to the URL query string
    if (getEnd() != null) {
      joiner.add(String.format("%sEnd%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEnd()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ExitCode` to the URL query string
    if (getExitCode() != null) {
      joiner.add(String.format("%sExitCode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExitCode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Output` to the URL query string
    if (getOutput() != null) {
      joiner.add(String.format("%sOutput%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getOutput()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Start` to the URL query string
    if (getStart() != null) {
      joiner.add(String.format("%sStart%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getStart()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


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
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * PastaInfo describes the pasta executable that is being used
 */
@JsonPropertyOrder({
  PastaInfo.JSON_PROPERTY_EXECUTABLE,
  PastaInfo.JSON_PROPERTY_PACKAGE,
  PastaInfo.JSON_PROPERTY_VERSION
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class PastaInfo {
  public static final String JSON_PROPERTY_EXECUTABLE = "executable";
  private String executable;

  public static final String JSON_PROPERTY_PACKAGE = "package";
  private String _package;

  public static final String JSON_PROPERTY_VERSION = "version";
  private String version;

  public PastaInfo() { 
  }

  public PastaInfo executable(String executable) {
    this.executable = executable;
    return this;
  }

  /**
   * Get executable
   * @return executable
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_EXECUTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getExecutable() {
    return executable;
  }


  @JsonProperty(JSON_PROPERTY_EXECUTABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setExecutable(String executable) {
    this.executable = executable;
  }


  public PastaInfo _package(String _package) {
    this._package = _package;
    return this;
  }

  /**
   * Get _package
   * @return _package
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPackage() {
    return _package;
  }


  @JsonProperty(JSON_PROPERTY_PACKAGE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPackage(String _package) {
    this._package = _package;
  }


  public PastaInfo version(String version) {
    this.version = version;
    return this;
  }

  /**
   * Get version
   * @return version
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVersion() {
    return version;
  }


  @JsonProperty(JSON_PROPERTY_VERSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVersion(String version) {
    this.version = version;
  }


  /**
   * Return true if this PastaInfo object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PastaInfo pastaInfo = (PastaInfo) o;
    return Objects.equals(this.executable, pastaInfo.executable) &&
        Objects.equals(this._package, pastaInfo._package) &&
        Objects.equals(this.version, pastaInfo.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(executable, _package, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PastaInfo {\n");
    sb.append("    executable: ").append(toIndentedString(executable)).append("\n");
    sb.append("    _package: ").append(toIndentedString(_package)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

    // add `executable` to the URL query string
    if (getExecutable() != null) {
      joiner.add(String.format("%sexecutable%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getExecutable()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `package` to the URL query string
    if (getPackage() != null) {
      joiner.add(String.format("%spackage%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPackage()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `version` to the URL query string
    if (getVersion() != null) {
      joiner.add(String.format("%sversion%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getVersion()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


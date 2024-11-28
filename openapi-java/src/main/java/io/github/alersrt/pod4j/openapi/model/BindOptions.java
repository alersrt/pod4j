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
 * BindOptions
 */
@JsonPropertyOrder({
  BindOptions.JSON_PROPERTY_CREATE_MOUNTPOINT,
  BindOptions.JSON_PROPERTY_NON_RECURSIVE,
  BindOptions.JSON_PROPERTY_PROPAGATION,
  BindOptions.JSON_PROPERTY_READ_ONLY_FORCE_RECURSIVE,
  BindOptions.JSON_PROPERTY_READ_ONLY_NON_RECURSIVE
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class BindOptions {
  public static final String JSON_PROPERTY_CREATE_MOUNTPOINT = "CreateMountpoint";
  private Boolean createMountpoint;

  public static final String JSON_PROPERTY_NON_RECURSIVE = "NonRecursive";
  private Boolean nonRecursive;

  public static final String JSON_PROPERTY_PROPAGATION = "Propagation";
  private String propagation;

  public static final String JSON_PROPERTY_READ_ONLY_FORCE_RECURSIVE = "ReadOnlyForceRecursive";
  private Boolean readOnlyForceRecursive;

  public static final String JSON_PROPERTY_READ_ONLY_NON_RECURSIVE = "ReadOnlyNonRecursive";
  private Boolean readOnlyNonRecursive;

  public BindOptions() { 
  }

  public BindOptions createMountpoint(Boolean createMountpoint) {
    this.createMountpoint = createMountpoint;
    return this;
  }

  /**
   * Get createMountpoint
   * @return createMountpoint
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CREATE_MOUNTPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getCreateMountpoint() {
    return createMountpoint;
  }


  @JsonProperty(JSON_PROPERTY_CREATE_MOUNTPOINT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreateMountpoint(Boolean createMountpoint) {
    this.createMountpoint = createMountpoint;
  }


  public BindOptions nonRecursive(Boolean nonRecursive) {
    this.nonRecursive = nonRecursive;
    return this;
  }

  /**
   * Get nonRecursive
   * @return nonRecursive
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NON_RECURSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNonRecursive() {
    return nonRecursive;
  }


  @JsonProperty(JSON_PROPERTY_NON_RECURSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNonRecursive(Boolean nonRecursive) {
    this.nonRecursive = nonRecursive;
  }


  public BindOptions propagation(String propagation) {
    this.propagation = propagation;
    return this;
  }

  /**
   * Get propagation
   * @return propagation
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PROPAGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getPropagation() {
    return propagation;
  }


  @JsonProperty(JSON_PROPERTY_PROPAGATION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPropagation(String propagation) {
    this.propagation = propagation;
  }


  public BindOptions readOnlyForceRecursive(Boolean readOnlyForceRecursive) {
    this.readOnlyForceRecursive = readOnlyForceRecursive;
    return this;
  }

  /**
   * ReadOnlyForceRecursive raises an error if the mount cannot be made recursively read-only.
   * @return readOnlyForceRecursive
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_READ_ONLY_FORCE_RECURSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReadOnlyForceRecursive() {
    return readOnlyForceRecursive;
  }


  @JsonProperty(JSON_PROPERTY_READ_ONLY_FORCE_RECURSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnlyForceRecursive(Boolean readOnlyForceRecursive) {
    this.readOnlyForceRecursive = readOnlyForceRecursive;
  }


  public BindOptions readOnlyNonRecursive(Boolean readOnlyNonRecursive) {
    this.readOnlyNonRecursive = readOnlyNonRecursive;
    return this;
  }

  /**
   * ReadOnlyNonRecursive makes the mount non-recursively read-only, but still leaves the mount recursive (unless NonRecursive is set to true in conjunction).
   * @return readOnlyNonRecursive
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_READ_ONLY_NON_RECURSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReadOnlyNonRecursive() {
    return readOnlyNonRecursive;
  }


  @JsonProperty(JSON_PROPERTY_READ_ONLY_NON_RECURSIVE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnlyNonRecursive(Boolean readOnlyNonRecursive) {
    this.readOnlyNonRecursive = readOnlyNonRecursive;
  }


  /**
   * Return true if this BindOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BindOptions bindOptions = (BindOptions) o;
    return Objects.equals(this.createMountpoint, bindOptions.createMountpoint) &&
        Objects.equals(this.nonRecursive, bindOptions.nonRecursive) &&
        Objects.equals(this.propagation, bindOptions.propagation) &&
        Objects.equals(this.readOnlyForceRecursive, bindOptions.readOnlyForceRecursive) &&
        Objects.equals(this.readOnlyNonRecursive, bindOptions.readOnlyNonRecursive);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createMountpoint, nonRecursive, propagation, readOnlyForceRecursive, readOnlyNonRecursive);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BindOptions {\n");
    sb.append("    createMountpoint: ").append(toIndentedString(createMountpoint)).append("\n");
    sb.append("    nonRecursive: ").append(toIndentedString(nonRecursive)).append("\n");
    sb.append("    propagation: ").append(toIndentedString(propagation)).append("\n");
    sb.append("    readOnlyForceRecursive: ").append(toIndentedString(readOnlyForceRecursive)).append("\n");
    sb.append("    readOnlyNonRecursive: ").append(toIndentedString(readOnlyNonRecursive)).append("\n");
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

    // add `CreateMountpoint` to the URL query string
    if (getCreateMountpoint() != null) {
      joiner.add(String.format("%sCreateMountpoint%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCreateMountpoint()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `NonRecursive` to the URL query string
    if (getNonRecursive() != null) {
      joiner.add(String.format("%sNonRecursive%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNonRecursive()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Propagation` to the URL query string
    if (getPropagation() != null) {
      joiner.add(String.format("%sPropagation%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPropagation()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ReadOnlyForceRecursive` to the URL query string
    if (getReadOnlyForceRecursive() != null) {
      joiner.add(String.format("%sReadOnlyForceRecursive%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReadOnlyForceRecursive()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ReadOnlyNonRecursive` to the URL query string
    if (getReadOnlyNonRecursive() != null) {
      joiner.add(String.format("%sReadOnlyNonRecursive%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReadOnlyNonRecursive()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


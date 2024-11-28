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
 * SystemDfVolumeReport describes a volume and its size
 */
@JsonPropertyOrder({
  SystemDfVolumeReport.JSON_PROPERTY_LINKS,
  SystemDfVolumeReport.JSON_PROPERTY_RECLAIMABLE_SIZE,
  SystemDfVolumeReport.JSON_PROPERTY_SIZE,
  SystemDfVolumeReport.JSON_PROPERTY_VOLUME_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class SystemDfVolumeReport {
  public static final String JSON_PROPERTY_LINKS = "Links";
  private Long links;

  public static final String JSON_PROPERTY_RECLAIMABLE_SIZE = "ReclaimableSize";
  private Long reclaimableSize;

  public static final String JSON_PROPERTY_SIZE = "Size";
  private Long size;

  public static final String JSON_PROPERTY_VOLUME_NAME = "VolumeName";
  private String volumeName;

  public SystemDfVolumeReport() { 
  }

  public SystemDfVolumeReport links(Long links) {
    this.links = links;
    return this;
  }

  /**
   * Get links
   * @return links
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getLinks() {
    return links;
  }


  @JsonProperty(JSON_PROPERTY_LINKS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinks(Long links) {
    this.links = links;
  }


  public SystemDfVolumeReport reclaimableSize(Long reclaimableSize) {
    this.reclaimableSize = reclaimableSize;
    return this;
  }

  /**
   * Get reclaimableSize
   * @return reclaimableSize
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RECLAIMABLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getReclaimableSize() {
    return reclaimableSize;
  }


  @JsonProperty(JSON_PROPERTY_RECLAIMABLE_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReclaimableSize(Long reclaimableSize) {
    this.reclaimableSize = reclaimableSize;
  }


  public SystemDfVolumeReport size(Long size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getSize() {
    return size;
  }


  @JsonProperty(JSON_PROPERTY_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSize(Long size) {
    this.size = size;
  }


  public SystemDfVolumeReport volumeName(String volumeName) {
    this.volumeName = volumeName;
    return this;
  }

  /**
   * Get volumeName
   * @return volumeName
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_VOLUME_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getVolumeName() {
    return volumeName;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  /**
   * Return true if this SystemDfVolumeReport object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemDfVolumeReport systemDfVolumeReport = (SystemDfVolumeReport) o;
    return Objects.equals(this.links, systemDfVolumeReport.links) &&
        Objects.equals(this.reclaimableSize, systemDfVolumeReport.reclaimableSize) &&
        Objects.equals(this.size, systemDfVolumeReport.size) &&
        Objects.equals(this.volumeName, systemDfVolumeReport.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, reclaimableSize, size, volumeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemDfVolumeReport {\n");
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    reclaimableSize: ").append(toIndentedString(reclaimableSize)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

    // add `Links` to the URL query string
    if (getLinks() != null) {
      joiner.add(String.format("%sLinks%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLinks()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `ReclaimableSize` to the URL query string
    if (getReclaimableSize() != null) {
      joiner.add(String.format("%sReclaimableSize%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReclaimableSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Size` to the URL query string
    if (getSize() != null) {
      joiner.add(String.format("%sSize%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `VolumeName` to the URL query string
    if (getVolumeName() != null) {
      joiner.add(String.format("%sVolumeName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getVolumeName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


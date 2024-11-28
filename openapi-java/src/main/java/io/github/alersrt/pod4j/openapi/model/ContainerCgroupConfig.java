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
 * ContainerCgroupConfig contains configuration information about a container&#39;s cgroups.
 */
@JsonPropertyOrder({
  ContainerCgroupConfig.JSON_PROPERTY_CGROUP_PARENT,
  ContainerCgroupConfig.JSON_PROPERTY_CGROUPNS,
  ContainerCgroupConfig.JSON_PROPERTY_CGROUPS_MODE
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ContainerCgroupConfig {
  public static final String JSON_PROPERTY_CGROUP_PARENT = "cgroup_parent";
  private String cgroupParent;

  public static final String JSON_PROPERTY_CGROUPNS = "cgroupns";
  private Namespace cgroupns;

  public static final String JSON_PROPERTY_CGROUPS_MODE = "cgroups_mode";
  private String cgroupsMode;

  public ContainerCgroupConfig() { 
  }

  public ContainerCgroupConfig cgroupParent(String cgroupParent) {
    this.cgroupParent = cgroupParent;
    return this;
  }

  /**
   * CgroupParent is the container&#39;s Cgroup parent. If not set, the default for the current cgroup driver will be used. Optional.
   * @return cgroupParent
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CGROUP_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCgroupParent() {
    return cgroupParent;
  }


  @JsonProperty(JSON_PROPERTY_CGROUP_PARENT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCgroupParent(String cgroupParent) {
    this.cgroupParent = cgroupParent;
  }


  public ContainerCgroupConfig cgroupns(Namespace cgroupns) {
    this.cgroupns = cgroupns;
    return this;
  }

  /**
   * Get cgroupns
   * @return cgroupns
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_CGROUPNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Namespace getCgroupns() {
    return cgroupns;
  }


  @JsonProperty(JSON_PROPERTY_CGROUPNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCgroupns(Namespace cgroupns) {
    this.cgroupns = cgroupns;
  }


  public ContainerCgroupConfig cgroupsMode(String cgroupsMode) {
    this.cgroupsMode = cgroupsMode;
    return this;
  }

  /**
   * CgroupsMode sets a policy for how cgroups will be created for the container, including the ability to disable creation entirely. Optional.
   * @return cgroupsMode
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CGROUPS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getCgroupsMode() {
    return cgroupsMode;
  }


  @JsonProperty(JSON_PROPERTY_CGROUPS_MODE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCgroupsMode(String cgroupsMode) {
    this.cgroupsMode = cgroupsMode;
  }


  /**
   * Return true if this ContainerCgroupConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerCgroupConfig containerCgroupConfig = (ContainerCgroupConfig) o;
    return Objects.equals(this.cgroupParent, containerCgroupConfig.cgroupParent) &&
        Objects.equals(this.cgroupns, containerCgroupConfig.cgroupns) &&
        Objects.equals(this.cgroupsMode, containerCgroupConfig.cgroupsMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cgroupParent, cgroupns, cgroupsMode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerCgroupConfig {\n");
    sb.append("    cgroupParent: ").append(toIndentedString(cgroupParent)).append("\n");
    sb.append("    cgroupns: ").append(toIndentedString(cgroupns)).append("\n");
    sb.append("    cgroupsMode: ").append(toIndentedString(cgroupsMode)).append("\n");
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

    // add `cgroup_parent` to the URL query string
    if (getCgroupParent() != null) {
      joiner.add(String.format("%scgroup_parent%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCgroupParent()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cgroupns` to the URL query string
    if (getCgroupns() != null) {
      joiner.add(getCgroupns().toUrlQueryString(prefix + "cgroupns" + suffix));
    }

    // add `cgroups_mode` to the URL query string
    if (getCgroupsMode() != null) {
      joiner.add(String.format("%scgroups_mode%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getCgroupsMode()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


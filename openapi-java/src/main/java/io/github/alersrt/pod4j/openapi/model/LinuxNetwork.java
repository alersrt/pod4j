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
import io.github.alersrt.pod4j.openapi.model.LinuxInterfacePriority;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * LinuxNetwork identification and priority configuration
 */
@JsonPropertyOrder({
  LinuxNetwork.JSON_PROPERTY_CLASS_I_D,
  LinuxNetwork.JSON_PROPERTY_PRIORITIES
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class LinuxNetwork {
  public static final String JSON_PROPERTY_CLASS_I_D = "classID";
  private Integer classID;

  public static final String JSON_PROPERTY_PRIORITIES = "priorities";
  private List<@Valid LinuxInterfacePriority> priorities = new ArrayList<>();

  public LinuxNetwork() { 
  }

  public LinuxNetwork classID(Integer classID) {
    this.classID = classID;
    return this;
  }

  /**
   * Set class identifier for container&#39;s network packets
   * @return classID
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CLASS_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getClassID() {
    return classID;
  }


  @JsonProperty(JSON_PROPERTY_CLASS_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setClassID(Integer classID) {
    this.classID = classID;
  }


  public LinuxNetwork priorities(List<@Valid LinuxInterfacePriority> priorities) {
    this.priorities = priorities;
    return this;
  }

  public LinuxNetwork addPrioritiesItem(LinuxInterfacePriority prioritiesItem) {
    if (this.priorities == null) {
      this.priorities = new ArrayList<>();
    }
    this.priorities.add(prioritiesItem);
    return this;
  }

  /**
   * Set priority of network traffic for container
   * @return priorities
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_PRIORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid LinuxInterfacePriority> getPriorities() {
    return priorities;
  }


  @JsonProperty(JSON_PROPERTY_PRIORITIES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPriorities(List<@Valid LinuxInterfacePriority> priorities) {
    this.priorities = priorities;
  }


  /**
   * Return true if this LinuxNetwork object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LinuxNetwork linuxNetwork = (LinuxNetwork) o;
    return Objects.equals(this.classID, linuxNetwork.classID) &&
        Objects.equals(this.priorities, linuxNetwork.priorities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(classID, priorities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LinuxNetwork {\n");
    sb.append("    classID: ").append(toIndentedString(classID)).append("\n");
    sb.append("    priorities: ").append(toIndentedString(priorities)).append("\n");
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

    // add `classID` to the URL query string
    if (getClassID() != null) {
      joiner.add(String.format("%sclassID%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getClassID()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `priorities` to the URL query string
    if (getPriorities() != null) {
      for (int i = 0; i < getPriorities().size(); i++) {
        if (getPriorities().get(i) != null) {
          joiner.add(getPriorities().get(i).toUrlQueryString(String.format("%spriorities%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}


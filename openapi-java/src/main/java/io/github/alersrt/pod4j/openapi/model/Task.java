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
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * Task carries the information about one backend task
 */
@JsonPropertyOrder({
  Task.JSON_PROPERTY_ENDPOINT_I_D,
  Task.JSON_PROPERTY_ENDPOINT_I_P,
  Task.JSON_PROPERTY_INFO,
  Task.JSON_PROPERTY_NAME
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Task {
  public static final String JSON_PROPERTY_ENDPOINT_I_D = "EndpointID";
  private String endpointID;

  public static final String JSON_PROPERTY_ENDPOINT_I_P = "EndpointIP";
  private String endpointIP;

  public static final String JSON_PROPERTY_INFO = "Info";
  private Map<String, String> info = new HashMap<>();

  public static final String JSON_PROPERTY_NAME = "Name";
  private String name;

  public Task() { 
  }

  public Task endpointID(String endpointID) {
    this.endpointID = endpointID;
    return this;
  }

  /**
   * Get endpointID
   * @return endpointID
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ENDPOINT_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndpointID() {
    return endpointID;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_I_D)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }


  public Task endpointIP(String endpointIP) {
    this.endpointIP = endpointIP;
    return this;
  }

  /**
   * Get endpointIP
   * @return endpointIP
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_ENDPOINT_I_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getEndpointIP() {
    return endpointIP;
  }


  @JsonProperty(JSON_PROPERTY_ENDPOINT_I_P)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setEndpointIP(String endpointIP) {
    this.endpointIP = endpointIP;
  }


  public Task info(Map<String, String> info) {
    this.info = info;
    return this;
  }

  public Task putInfoItem(String key, String infoItem) {
    if (this.info == null) {
      this.info = new HashMap<>();
    }
    this.info.put(key, infoItem);
    return this;
  }

  /**
   * Get info
   * @return info
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Map<String, String> getInfo() {
    return info;
  }


  @JsonProperty(JSON_PROPERTY_INFO)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setInfo(Map<String, String> info) {
    this.info = info;
  }


  public Task name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  /**
   * Return true if this Task object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Task task = (Task) o;
    return Objects.equals(this.endpointID, task.endpointID) &&
        Objects.equals(this.endpointIP, task.endpointIP) &&
        Objects.equals(this.info, task.info) &&
        Objects.equals(this.name, task.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointID, endpointIP, info, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Task {\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    endpointIP: ").append(toIndentedString(endpointIP)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

    // add `EndpointID` to the URL query string
    if (getEndpointID() != null) {
      joiner.add(String.format("%sEndpointID%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEndpointID()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `EndpointIP` to the URL query string
    if (getEndpointIP() != null) {
      joiner.add(String.format("%sEndpointIP%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getEndpointIP()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `Info` to the URL query string
    if (getInfo() != null) {
      for (String _key : getInfo().keySet()) {
        joiner.add(String.format("%sInfo%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, _key, containerSuffix),
            getInfo().get(_key), URLEncoder.encode(ApiClient.valueToString(getInfo().get(_key)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `Name` to the URL query string
    if (getName() != null) {
      joiner.add(String.format("%sName%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getName()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


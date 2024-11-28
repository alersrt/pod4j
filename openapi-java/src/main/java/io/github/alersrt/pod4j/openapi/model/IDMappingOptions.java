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
import io.github.alersrt.pod4j.openapi.model.AutoUserNsOptions;
import io.github.alersrt.pod4j.openapi.model.IDMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * IDMappingOptions are used for specifying how ID mapping should be set up for a layer or container.
 */
@JsonPropertyOrder({
  IDMappingOptions.JSON_PROPERTY_AUTO_USER_NS,
  IDMappingOptions.JSON_PROPERTY_AUTO_USER_NS_OPTS,
  IDMappingOptions.JSON_PROPERTY_GI_D_MAP,
  IDMappingOptions.JSON_PROPERTY_HOST_G_I_D_MAPPING,
  IDMappingOptions.JSON_PROPERTY_HOST_U_I_D_MAPPING,
  IDMappingOptions.JSON_PROPERTY_UI_D_MAP
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class IDMappingOptions {
  public static final String JSON_PROPERTY_AUTO_USER_NS = "AutoUserNs";
  private Boolean autoUserNs;

  public static final String JSON_PROPERTY_AUTO_USER_NS_OPTS = "AutoUserNsOpts";
  private AutoUserNsOptions autoUserNsOpts;

  public static final String JSON_PROPERTY_GI_D_MAP = "GIDMap";
  private List<@Valid IDMap> giDMap = new ArrayList<>();

  public static final String JSON_PROPERTY_HOST_G_I_D_MAPPING = "HostGIDMapping";
  private Boolean hostGIDMapping;

  public static final String JSON_PROPERTY_HOST_U_I_D_MAPPING = "HostUIDMapping";
  private Boolean hostUIDMapping;

  public static final String JSON_PROPERTY_UI_D_MAP = "UIDMap";
  private List<@Valid IDMap> uiDMap = new ArrayList<>();

  public IDMappingOptions() { 
  }

  public IDMappingOptions autoUserNs(Boolean autoUserNs) {
    this.autoUserNs = autoUserNs;
    return this;
  }

  /**
   * Get autoUserNs
   * @return autoUserNs
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_AUTO_USER_NS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getAutoUserNs() {
    return autoUserNs;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_USER_NS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoUserNs(Boolean autoUserNs) {
    this.autoUserNs = autoUserNs;
  }


  public IDMappingOptions autoUserNsOpts(AutoUserNsOptions autoUserNsOpts) {
    this.autoUserNsOpts = autoUserNsOpts;
    return this;
  }

  /**
   * Get autoUserNsOpts
   * @return autoUserNsOpts
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_AUTO_USER_NS_OPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public AutoUserNsOptions getAutoUserNsOpts() {
    return autoUserNsOpts;
  }


  @JsonProperty(JSON_PROPERTY_AUTO_USER_NS_OPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAutoUserNsOpts(AutoUserNsOptions autoUserNsOpts) {
    this.autoUserNsOpts = autoUserNsOpts;
  }


  public IDMappingOptions giDMap(List<@Valid IDMap> giDMap) {
    this.giDMap = giDMap;
    return this;
  }

  public IDMappingOptions addGiDMapItem(IDMap giDMapItem) {
    if (this.giDMap == null) {
      this.giDMap = new ArrayList<>();
    }
    this.giDMap.add(giDMapItem);
    return this;
  }

  /**
   * Get giDMap
   * @return giDMap
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_GI_D_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid IDMap> getGiDMap() {
    return giDMap;
  }


  @JsonProperty(JSON_PROPERTY_GI_D_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGiDMap(List<@Valid IDMap> giDMap) {
    this.giDMap = giDMap;
  }


  public IDMappingOptions hostGIDMapping(Boolean hostGIDMapping) {
    this.hostGIDMapping = hostGIDMapping;
    return this;
  }

  /**
   * Get hostGIDMapping
   * @return hostGIDMapping
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_HOST_G_I_D_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHostGIDMapping() {
    return hostGIDMapping;
  }


  @JsonProperty(JSON_PROPERTY_HOST_G_I_D_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostGIDMapping(Boolean hostGIDMapping) {
    this.hostGIDMapping = hostGIDMapping;
  }


  public IDMappingOptions hostUIDMapping(Boolean hostUIDMapping) {
    this.hostUIDMapping = hostUIDMapping;
    return this;
  }

  /**
   * UIDMap and GIDMap are used for setting up a layer&#39;s root filesystem for use inside of a user namespace where ID mapping is being used. If HostUIDMapping/HostGIDMapping is true, no mapping of the respective type will be used.  Otherwise, if UIDMap and/or GIDMap contain at least one mapping, one or both will be used.  By default, if neither of those conditions apply, if the layer has a parent layer, the parent layer&#39;s mapping will be used, and if it does not have a parent layer, the mapping which was passed to the Store object when it was initialized will be used.
   * @return hostUIDMapping
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_HOST_U_I_D_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getHostUIDMapping() {
    return hostUIDMapping;
  }


  @JsonProperty(JSON_PROPERTY_HOST_U_I_D_MAPPING)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setHostUIDMapping(Boolean hostUIDMapping) {
    this.hostUIDMapping = hostUIDMapping;
  }


  public IDMappingOptions uiDMap(List<@Valid IDMap> uiDMap) {
    this.uiDMap = uiDMap;
    return this;
  }

  public IDMappingOptions addUiDMapItem(IDMap uiDMapItem) {
    if (this.uiDMap == null) {
      this.uiDMap = new ArrayList<>();
    }
    this.uiDMap.add(uiDMapItem);
    return this;
  }

  /**
   * Get uiDMap
   * @return uiDMap
   */
  @javax.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_UI_D_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid IDMap> getUiDMap() {
    return uiDMap;
  }


  @JsonProperty(JSON_PROPERTY_UI_D_MAP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUiDMap(List<@Valid IDMap> uiDMap) {
    this.uiDMap = uiDMap;
  }


  /**
   * Return true if this IDMappingOptions object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IDMappingOptions idMappingOptions = (IDMappingOptions) o;
    return Objects.equals(this.autoUserNs, idMappingOptions.autoUserNs) &&
        Objects.equals(this.autoUserNsOpts, idMappingOptions.autoUserNsOpts) &&
        Objects.equals(this.giDMap, idMappingOptions.giDMap) &&
        Objects.equals(this.hostGIDMapping, idMappingOptions.hostGIDMapping) &&
        Objects.equals(this.hostUIDMapping, idMappingOptions.hostUIDMapping) &&
        Objects.equals(this.uiDMap, idMappingOptions.uiDMap);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoUserNs, autoUserNsOpts, giDMap, hostGIDMapping, hostUIDMapping, uiDMap);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IDMappingOptions {\n");
    sb.append("    autoUserNs: ").append(toIndentedString(autoUserNs)).append("\n");
    sb.append("    autoUserNsOpts: ").append(toIndentedString(autoUserNsOpts)).append("\n");
    sb.append("    giDMap: ").append(toIndentedString(giDMap)).append("\n");
    sb.append("    hostGIDMapping: ").append(toIndentedString(hostGIDMapping)).append("\n");
    sb.append("    hostUIDMapping: ").append(toIndentedString(hostUIDMapping)).append("\n");
    sb.append("    uiDMap: ").append(toIndentedString(uiDMap)).append("\n");
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

    // add `AutoUserNs` to the URL query string
    if (getAutoUserNs() != null) {
      joiner.add(String.format("%sAutoUserNs%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getAutoUserNs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `AutoUserNsOpts` to the URL query string
    if (getAutoUserNsOpts() != null) {
      joiner.add(getAutoUserNsOpts().toUrlQueryString(prefix + "AutoUserNsOpts" + suffix));
    }

    // add `GIDMap` to the URL query string
    if (getGiDMap() != null) {
      for (int i = 0; i < getGiDMap().size(); i++) {
        if (getGiDMap().get(i) != null) {
          joiner.add(getGiDMap().get(i).toUrlQueryString(String.format("%sGIDMap%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `HostGIDMapping` to the URL query string
    if (getHostGIDMapping() != null) {
      joiner.add(String.format("%sHostGIDMapping%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getHostGIDMapping()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `HostUIDMapping` to the URL query string
    if (getHostUIDMapping() != null) {
      joiner.add(String.format("%sHostUIDMapping%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getHostUIDMapping()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `UIDMap` to the URL query string
    if (getUiDMap() != null) {
      for (int i = 0; i < getUiDMap().size(); i++) {
        if (getUiDMap().get(i) != null) {
          joiner.add(getUiDMap().get(i).toUrlQueryString(String.format("%sUIDMap%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}


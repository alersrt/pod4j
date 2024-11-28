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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * EndpointIPAMConfig represents IPAM configurations for the endpoint
 */
@JsonPropertyOrder({
  EndpointIPAMConfig.JSON_PROPERTY_IPV4_ADDRESS,
  EndpointIPAMConfig.JSON_PROPERTY_IPV6_ADDRESS,
  EndpointIPAMConfig.JSON_PROPERTY_LINK_LOCAL_I_PS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class EndpointIPAMConfig {
  public static final String JSON_PROPERTY_IPV4_ADDRESS = "IPv4Address";
  private String ipv4Address;

  public static final String JSON_PROPERTY_IPV6_ADDRESS = "IPv6Address";
  private String ipv6Address;

  public static final String JSON_PROPERTY_LINK_LOCAL_I_PS = "LinkLocalIPs";
  private List<String> linkLocalIPs = new ArrayList<>();

  public EndpointIPAMConfig() { 
  }

  public EndpointIPAMConfig ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

  /**
   * Get ipv4Address
   * @return ipv4Address
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_IPV4_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIpv4Address() {
    return ipv4Address;
  }


  @JsonProperty(JSON_PROPERTY_IPV4_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }


  public EndpointIPAMConfig ipv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * Get ipv6Address
   * @return ipv6Address
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getIpv6Address() {
    return ipv6Address;
  }


  @JsonProperty(JSON_PROPERTY_IPV6_ADDRESS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }


  public EndpointIPAMConfig linkLocalIPs(List<String> linkLocalIPs) {
    this.linkLocalIPs = linkLocalIPs;
    return this;
  }

  public EndpointIPAMConfig addLinkLocalIPsItem(String linkLocalIPsItem) {
    if (this.linkLocalIPs == null) {
      this.linkLocalIPs = new ArrayList<>();
    }
    this.linkLocalIPs.add(linkLocalIPsItem);
    return this;
  }

  /**
   * Get linkLocalIPs
   * @return linkLocalIPs
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_LINK_LOCAL_I_PS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getLinkLocalIPs() {
    return linkLocalIPs;
  }


  @JsonProperty(JSON_PROPERTY_LINK_LOCAL_I_PS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLinkLocalIPs(List<String> linkLocalIPs) {
    this.linkLocalIPs = linkLocalIPs;
  }


  /**
   * Return true if this EndpointIPAMConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointIPAMConfig endpointIPAMConfig = (EndpointIPAMConfig) o;
    return Objects.equals(this.ipv4Address, endpointIPAMConfig.ipv4Address) &&
        Objects.equals(this.ipv6Address, endpointIPAMConfig.ipv6Address) &&
        Objects.equals(this.linkLocalIPs, endpointIPAMConfig.linkLocalIPs);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ipv4Address, ipv6Address, linkLocalIPs);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointIPAMConfig {\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    linkLocalIPs: ").append(toIndentedString(linkLocalIPs)).append("\n");
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

    // add `IPv4Address` to the URL query string
    if (getIpv4Address() != null) {
      joiner.add(String.format("%sIPv4Address%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIpv4Address()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `IPv6Address` to the URL query string
    if (getIpv6Address() != null) {
      joiner.add(String.format("%sIPv6Address%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getIpv6Address()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `LinkLocalIPs` to the URL query string
    if (getLinkLocalIPs() != null) {
      for (int i = 0; i < getLinkLocalIPs().size(); i++) {
        joiner.add(String.format("%sLinkLocalIPs%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getLinkLocalIPs().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}


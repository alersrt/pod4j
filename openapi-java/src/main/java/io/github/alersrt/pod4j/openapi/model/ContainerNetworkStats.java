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
 * Statistics for an individual container network interface
 */
@JsonPropertyOrder({
  ContainerNetworkStats.JSON_PROPERTY_RX_BYTES,
  ContainerNetworkStats.JSON_PROPERTY_RX_DROPPED,
  ContainerNetworkStats.JSON_PROPERTY_RX_ERRORS,
  ContainerNetworkStats.JSON_PROPERTY_RX_PACKETS,
  ContainerNetworkStats.JSON_PROPERTY_TX_BYTES,
  ContainerNetworkStats.JSON_PROPERTY_TX_DROPPED,
  ContainerNetworkStats.JSON_PROPERTY_TX_ERRORS,
  ContainerNetworkStats.JSON_PROPERTY_TX_PACKETS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T19:32:38.690938181+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ContainerNetworkStats {
  public static final String JSON_PROPERTY_RX_BYTES = "RxBytes";
  private Integer rxBytes;

  public static final String JSON_PROPERTY_RX_DROPPED = "RxDropped";
  private Integer rxDropped;

  public static final String JSON_PROPERTY_RX_ERRORS = "RxErrors";
  private Integer rxErrors;

  public static final String JSON_PROPERTY_RX_PACKETS = "RxPackets";
  private Integer rxPackets;

  public static final String JSON_PROPERTY_TX_BYTES = "TxBytes";
  private Integer txBytes;

  public static final String JSON_PROPERTY_TX_DROPPED = "TxDropped";
  private Integer txDropped;

  public static final String JSON_PROPERTY_TX_ERRORS = "TxErrors";
  private Integer txErrors;

  public static final String JSON_PROPERTY_TX_PACKETS = "TxPackets";
  private Integer txPackets;

  public ContainerNetworkStats() { 
  }

  public ContainerNetworkStats rxBytes(Integer rxBytes) {
    this.rxBytes = rxBytes;
    return this;
  }

  /**
   * Get rxBytes
   * @return rxBytes
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RX_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRxBytes() {
    return rxBytes;
  }


  @JsonProperty(JSON_PROPERTY_RX_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRxBytes(Integer rxBytes) {
    this.rxBytes = rxBytes;
  }


  public ContainerNetworkStats rxDropped(Integer rxDropped) {
    this.rxDropped = rxDropped;
    return this;
  }

  /**
   * Get rxDropped
   * @return rxDropped
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RX_DROPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRxDropped() {
    return rxDropped;
  }


  @JsonProperty(JSON_PROPERTY_RX_DROPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRxDropped(Integer rxDropped) {
    this.rxDropped = rxDropped;
  }


  public ContainerNetworkStats rxErrors(Integer rxErrors) {
    this.rxErrors = rxErrors;
    return this;
  }

  /**
   * Get rxErrors
   * @return rxErrors
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RX_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRxErrors() {
    return rxErrors;
  }


  @JsonProperty(JSON_PROPERTY_RX_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRxErrors(Integer rxErrors) {
    this.rxErrors = rxErrors;
  }


  public ContainerNetworkStats rxPackets(Integer rxPackets) {
    this.rxPackets = rxPackets;
    return this;
  }

  /**
   * Get rxPackets
   * @return rxPackets
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RX_PACKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getRxPackets() {
    return rxPackets;
  }


  @JsonProperty(JSON_PROPERTY_RX_PACKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setRxPackets(Integer rxPackets) {
    this.rxPackets = rxPackets;
  }


  public ContainerNetworkStats txBytes(Integer txBytes) {
    this.txBytes = txBytes;
    return this;
  }

  /**
   * Get txBytes
   * @return txBytes
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_TX_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTxBytes() {
    return txBytes;
  }


  @JsonProperty(JSON_PROPERTY_TX_BYTES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxBytes(Integer txBytes) {
    this.txBytes = txBytes;
  }


  public ContainerNetworkStats txDropped(Integer txDropped) {
    this.txDropped = txDropped;
    return this;
  }

  /**
   * Get txDropped
   * @return txDropped
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_TX_DROPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTxDropped() {
    return txDropped;
  }


  @JsonProperty(JSON_PROPERTY_TX_DROPPED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxDropped(Integer txDropped) {
    this.txDropped = txDropped;
  }


  public ContainerNetworkStats txErrors(Integer txErrors) {
    this.txErrors = txErrors;
    return this;
  }

  /**
   * Get txErrors
   * @return txErrors
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_TX_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTxErrors() {
    return txErrors;
  }


  @JsonProperty(JSON_PROPERTY_TX_ERRORS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxErrors(Integer txErrors) {
    this.txErrors = txErrors;
  }


  public ContainerNetworkStats txPackets(Integer txPackets) {
    this.txPackets = txPackets;
    return this;
  }

  /**
   * Get txPackets
   * @return txPackets
   */
  @javax.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_TX_PACKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getTxPackets() {
    return txPackets;
  }


  @JsonProperty(JSON_PROPERTY_TX_PACKETS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setTxPackets(Integer txPackets) {
    this.txPackets = txPackets;
  }


  /**
   * Return true if this ContainerNetworkStats object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerNetworkStats containerNetworkStats = (ContainerNetworkStats) o;
    return Objects.equals(this.rxBytes, containerNetworkStats.rxBytes) &&
        Objects.equals(this.rxDropped, containerNetworkStats.rxDropped) &&
        Objects.equals(this.rxErrors, containerNetworkStats.rxErrors) &&
        Objects.equals(this.rxPackets, containerNetworkStats.rxPackets) &&
        Objects.equals(this.txBytes, containerNetworkStats.txBytes) &&
        Objects.equals(this.txDropped, containerNetworkStats.txDropped) &&
        Objects.equals(this.txErrors, containerNetworkStats.txErrors) &&
        Objects.equals(this.txPackets, containerNetworkStats.txPackets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rxBytes, rxDropped, rxErrors, rxPackets, txBytes, txDropped, txErrors, txPackets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerNetworkStats {\n");
    sb.append("    rxBytes: ").append(toIndentedString(rxBytes)).append("\n");
    sb.append("    rxDropped: ").append(toIndentedString(rxDropped)).append("\n");
    sb.append("    rxErrors: ").append(toIndentedString(rxErrors)).append("\n");
    sb.append("    rxPackets: ").append(toIndentedString(rxPackets)).append("\n");
    sb.append("    txBytes: ").append(toIndentedString(txBytes)).append("\n");
    sb.append("    txDropped: ").append(toIndentedString(txDropped)).append("\n");
    sb.append("    txErrors: ").append(toIndentedString(txErrors)).append("\n");
    sb.append("    txPackets: ").append(toIndentedString(txPackets)).append("\n");
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

    // add `RxBytes` to the URL query string
    if (getRxBytes() != null) {
      joiner.add(String.format("%sRxBytes%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRxBytes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `RxDropped` to the URL query string
    if (getRxDropped() != null) {
      joiner.add(String.format("%sRxDropped%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRxDropped()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `RxErrors` to the URL query string
    if (getRxErrors() != null) {
      joiner.add(String.format("%sRxErrors%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRxErrors()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `RxPackets` to the URL query string
    if (getRxPackets() != null) {
      joiner.add(String.format("%sRxPackets%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getRxPackets()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `TxBytes` to the URL query string
    if (getTxBytes() != null) {
      joiner.add(String.format("%sTxBytes%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTxBytes()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `TxDropped` to the URL query string
    if (getTxDropped() != null) {
      joiner.add(String.format("%sTxDropped%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTxDropped()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `TxErrors` to the URL query string
    if (getTxErrors() != null) {
      joiner.add(String.format("%sTxErrors%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTxErrors()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `TxPackets` to the URL query string
    if (getTxPackets() != null) {
      joiner.add(String.format("%sTxPackets%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getTxPackets()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    return joiner.toString();
  }
}


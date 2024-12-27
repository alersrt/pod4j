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

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;
import java.io.Serializable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import io.github.alersrt.pod4j.openapi.JSON;

/**
 * Statistics for an individual container network interface
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T02:16:23.826374396+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ContainerNetworkStats implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_RX_BYTES = "RxBytes";
  @SerializedName(SERIALIZED_NAME_RX_BYTES)
  private Integer rxBytes;

  public static final String SERIALIZED_NAME_RX_DROPPED = "RxDropped";
  @SerializedName(SERIALIZED_NAME_RX_DROPPED)
  private Integer rxDropped;

  public static final String SERIALIZED_NAME_RX_ERRORS = "RxErrors";
  @SerializedName(SERIALIZED_NAME_RX_ERRORS)
  private Integer rxErrors;

  public static final String SERIALIZED_NAME_RX_PACKETS = "RxPackets";
  @SerializedName(SERIALIZED_NAME_RX_PACKETS)
  private Integer rxPackets;

  public static final String SERIALIZED_NAME_TX_BYTES = "TxBytes";
  @SerializedName(SERIALIZED_NAME_TX_BYTES)
  private Integer txBytes;

  public static final String SERIALIZED_NAME_TX_DROPPED = "TxDropped";
  @SerializedName(SERIALIZED_NAME_TX_DROPPED)
  private Integer txDropped;

  public static final String SERIALIZED_NAME_TX_ERRORS = "TxErrors";
  @SerializedName(SERIALIZED_NAME_TX_ERRORS)
  private Integer txErrors;

  public static final String SERIALIZED_NAME_TX_PACKETS = "TxPackets";
  @SerializedName(SERIALIZED_NAME_TX_PACKETS)
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
  @jakarta.annotation.Nullable

  public Integer getRxBytes() {
    return rxBytes;
  }

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
  @jakarta.annotation.Nullable

  public Integer getRxDropped() {
    return rxDropped;
  }

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
  @jakarta.annotation.Nullable

  public Integer getRxErrors() {
    return rxErrors;
  }

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
  @jakarta.annotation.Nullable

  public Integer getRxPackets() {
    return rxPackets;
  }

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
  @jakarta.annotation.Nullable

  public Integer getTxBytes() {
    return txBytes;
  }

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
  @jakarta.annotation.Nullable

  public Integer getTxDropped() {
    return txDropped;
  }

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
  @jakarta.annotation.Nullable

  public Integer getTxErrors() {
    return txErrors;
  }

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
  @jakarta.annotation.Nullable

  public Integer getTxPackets() {
    return txPackets;
  }

  public void setTxPackets(Integer txPackets) {
    this.txPackets = txPackets;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("RxBytes");
    openapiFields.add("RxDropped");
    openapiFields.add("RxErrors");
    openapiFields.add("RxPackets");
    openapiFields.add("TxBytes");
    openapiFields.add("TxDropped");
    openapiFields.add("TxErrors");
    openapiFields.add("TxPackets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerNetworkStats
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerNetworkStats.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerNetworkStats is not found in the empty JSON string", ContainerNetworkStats.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerNetworkStats.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerNetworkStats` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerNetworkStats.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerNetworkStats' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerNetworkStats> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerNetworkStats.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerNetworkStats>() {
           @Override
           public void write(JsonWriter out, ContainerNetworkStats value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerNetworkStats read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerNetworkStats given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerNetworkStats
   * @throws IOException if the JSON string is invalid with respect to ContainerNetworkStats
   */
  public static ContainerNetworkStats fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerNetworkStats.class);
  }

  /**
   * Convert an instance of ContainerNetworkStats to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


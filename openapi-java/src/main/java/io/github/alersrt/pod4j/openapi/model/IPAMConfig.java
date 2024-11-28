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
import java.util.HashMap;
import java.util.Map;

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
 * IPAMConfig represents IPAM configurations
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T15:23:24.636316917+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class IPAMConfig {
  public static final String SERIALIZED_NAME_AUXILIARY_ADDRESSES = "AuxiliaryAddresses";
  @SerializedName(SERIALIZED_NAME_AUXILIARY_ADDRESSES)
  private Map<String, String> auxiliaryAddresses = new HashMap<>();

  public static final String SERIALIZED_NAME_GATEWAY = "Gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_IP_RANGE = "IPRange";
  @SerializedName(SERIALIZED_NAME_IP_RANGE)
  private String ipRange;

  public static final String SERIALIZED_NAME_SUBNET = "Subnet";
  @SerializedName(SERIALIZED_NAME_SUBNET)
  private String subnet;

  public IPAMConfig() {
  }

  public IPAMConfig auxiliaryAddresses(Map<String, String> auxiliaryAddresses) {
    this.auxiliaryAddresses = auxiliaryAddresses;
    return this;
  }

  public IPAMConfig putAuxiliaryAddressesItem(String key, String auxiliaryAddressesItem) {
    if (this.auxiliaryAddresses == null) {
      this.auxiliaryAddresses = new HashMap<>();
    }
    this.auxiliaryAddresses.put(key, auxiliaryAddressesItem);
    return this;
  }

  /**
   * Get auxiliaryAddresses
   * @return auxiliaryAddresses
   */
  @javax.annotation.Nullable
  public Map<String, String> getAuxiliaryAddresses() {
    return auxiliaryAddresses;
  }

  public void setAuxiliaryAddresses(Map<String, String> auxiliaryAddresses) {
    this.auxiliaryAddresses = auxiliaryAddresses;
  }


  public IPAMConfig gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * Get gateway
   * @return gateway
   */
  @javax.annotation.Nullable
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public IPAMConfig ipRange(String ipRange) {
    this.ipRange = ipRange;
    return this;
  }

  /**
   * Get ipRange
   * @return ipRange
   */
  @javax.annotation.Nullable
  public String getIpRange() {
    return ipRange;
  }

  public void setIpRange(String ipRange) {
    this.ipRange = ipRange;
  }


  public IPAMConfig subnet(String subnet) {
    this.subnet = subnet;
    return this;
  }

  /**
   * Get subnet
   * @return subnet
   */
  @javax.annotation.Nullable
  public String getSubnet() {
    return subnet;
  }

  public void setSubnet(String subnet) {
    this.subnet = subnet;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IPAMConfig ipAMConfig = (IPAMConfig) o;
    return Objects.equals(this.auxiliaryAddresses, ipAMConfig.auxiliaryAddresses) &&
        Objects.equals(this.gateway, ipAMConfig.gateway) &&
        Objects.equals(this.ipRange, ipAMConfig.ipRange) &&
        Objects.equals(this.subnet, ipAMConfig.subnet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auxiliaryAddresses, gateway, ipRange, subnet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IPAMConfig {\n");
    sb.append("    auxiliaryAddresses: ").append(toIndentedString(auxiliaryAddresses)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    ipRange: ").append(toIndentedString(ipRange)).append("\n");
    sb.append("    subnet: ").append(toIndentedString(subnet)).append("\n");
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
    openapiFields.add("AuxiliaryAddresses");
    openapiFields.add("Gateway");
    openapiFields.add("IPRange");
    openapiFields.add("Subnet");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to IPAMConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!IPAMConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in IPAMConfig is not found in the empty JSON string", IPAMConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!IPAMConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `IPAMConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Gateway") != null && !jsonObj.get("Gateway").isJsonNull()) && !jsonObj.get("Gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Gateway").toString()));
      }
      if ((jsonObj.get("IPRange") != null && !jsonObj.get("IPRange").isJsonNull()) && !jsonObj.get("IPRange").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPRange` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPRange").toString()));
      }
      if ((jsonObj.get("Subnet") != null && !jsonObj.get("Subnet").isJsonNull()) && !jsonObj.get("Subnet").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Subnet` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Subnet").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!IPAMConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'IPAMConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<IPAMConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(IPAMConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<IPAMConfig>() {
           @Override
           public void write(JsonWriter out, IPAMConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public IPAMConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of IPAMConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of IPAMConfig
   * @throws IOException if the JSON string is invalid with respect to IPAMConfig
   */
  public static IPAMConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, IPAMConfig.class);
  }

  /**
   * Convert an instance of IPAMConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


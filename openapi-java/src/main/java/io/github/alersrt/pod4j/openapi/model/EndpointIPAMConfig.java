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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
 * EndpointIPAMConfig represents IPAM configurations for the endpoint
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T23:15:58.977038016+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class EndpointIPAMConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IPV4_ADDRESS = "IPv4Address";
  @SerializedName(SERIALIZED_NAME_IPV4_ADDRESS)
  private String ipv4Address;

  public static final String SERIALIZED_NAME_IPV6_ADDRESS = "IPv6Address";
  @SerializedName(SERIALIZED_NAME_IPV6_ADDRESS)
  private String ipv6Address;

  public static final String SERIALIZED_NAME_LINK_LOCAL_I_PS = "LinkLocalIPs";
  @SerializedName(SERIALIZED_NAME_LINK_LOCAL_I_PS)
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
  @jakarta.annotation.Nullable

  public String getIpv4Address() {
    return ipv4Address;
  }

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
  @jakarta.annotation.Nullable

  public String getIpv6Address() {
    return ipv6Address;
  }

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
  @jakarta.annotation.Nullable

  public List<String> getLinkLocalIPs() {
    return linkLocalIPs;
  }

  public void setLinkLocalIPs(List<String> linkLocalIPs) {
    this.linkLocalIPs = linkLocalIPs;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("IPv4Address");
    openapiFields.add("IPv6Address");
    openapiFields.add("LinkLocalIPs");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EndpointIPAMConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointIPAMConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointIPAMConfig is not found in the empty JSON string", EndpointIPAMConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointIPAMConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointIPAMConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("IPv4Address") != null && !jsonObj.get("IPv4Address").isJsonNull()) && !jsonObj.get("IPv4Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPv4Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPv4Address").toString()));
      }
      if ((jsonObj.get("IPv6Address") != null && !jsonObj.get("IPv6Address").isJsonNull()) && !jsonObj.get("IPv6Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPv6Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPv6Address").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("LinkLocalIPs") != null && !jsonObj.get("LinkLocalIPs").isJsonNull() && !jsonObj.get("LinkLocalIPs").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `LinkLocalIPs` to be an array in the JSON string but got `%s`", jsonObj.get("LinkLocalIPs").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointIPAMConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointIPAMConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointIPAMConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointIPAMConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointIPAMConfig>() {
           @Override
           public void write(JsonWriter out, EndpointIPAMConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointIPAMConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EndpointIPAMConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EndpointIPAMConfig
   * @throws IOException if the JSON string is invalid with respect to EndpointIPAMConfig
   */
  public static EndpointIPAMConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointIPAMConfig.class);
  }

  /**
   * Convert an instance of EndpointIPAMConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


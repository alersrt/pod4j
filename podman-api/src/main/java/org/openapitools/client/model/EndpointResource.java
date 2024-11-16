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


package org.openapitools.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openapitools.client.JSON;

/**
 * EndpointResource contains network resources allocated and used for a container in a network.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T18:07:05.610979114+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class EndpointResource {
  public static final String SERIALIZED_NAME_ENDPOINT_I_D = "EndpointID";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_I_D)
  private String endpointID;

  public static final String SERIALIZED_NAME_IPV4_ADDRESS = "IPv4Address";
  @SerializedName(SERIALIZED_NAME_IPV4_ADDRESS)
  private String ipv4Address;

  public static final String SERIALIZED_NAME_IPV6_ADDRESS = "IPv6Address";
  @SerializedName(SERIALIZED_NAME_IPV6_ADDRESS)
  private String ipv6Address;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "MacAddress";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public EndpointResource() {
  }

  public EndpointResource endpointID(String endpointID) {
    this.endpointID = endpointID;
    return this;
  }

  /**
   * Get endpointID
   * @return endpointID
   */
  @javax.annotation.Nullable
  public String getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }


  public EndpointResource ipv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
    return this;
  }

  /**
   * Get ipv4Address
   * @return ipv4Address
   */
  @javax.annotation.Nullable
  public String getIpv4Address() {
    return ipv4Address;
  }

  public void setIpv4Address(String ipv4Address) {
    this.ipv4Address = ipv4Address;
  }


  public EndpointResource ipv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
    return this;
  }

  /**
   * Get ipv6Address
   * @return ipv6Address
   */
  @javax.annotation.Nullable
  public String getIpv6Address() {
    return ipv6Address;
  }

  public void setIpv6Address(String ipv6Address) {
    this.ipv6Address = ipv6Address;
  }


  public EndpointResource macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * Get macAddress
   * @return macAddress
   */
  @javax.annotation.Nullable
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public EndpointResource name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EndpointResource endpointResource = (EndpointResource) o;
    return Objects.equals(this.endpointID, endpointResource.endpointID) &&
        Objects.equals(this.ipv4Address, endpointResource.ipv4Address) &&
        Objects.equals(this.ipv6Address, endpointResource.ipv6Address) &&
        Objects.equals(this.macAddress, endpointResource.macAddress) &&
        Objects.equals(this.name, endpointResource.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(endpointID, ipv4Address, ipv6Address, macAddress, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EndpointResource {\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    ipv4Address: ").append(toIndentedString(ipv4Address)).append("\n");
    sb.append("    ipv6Address: ").append(toIndentedString(ipv6Address)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("EndpointID");
    openapiFields.add("IPv4Address");
    openapiFields.add("IPv6Address");
    openapiFields.add("MacAddress");
    openapiFields.add("Name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to EndpointResource
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!EndpointResource.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in EndpointResource is not found in the empty JSON string", EndpointResource.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!EndpointResource.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `EndpointResource` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("EndpointID") != null && !jsonObj.get("EndpointID").isJsonNull()) && !jsonObj.get("EndpointID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EndpointID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EndpointID").toString()));
      }
      if ((jsonObj.get("IPv4Address") != null && !jsonObj.get("IPv4Address").isJsonNull()) && !jsonObj.get("IPv4Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPv4Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPv4Address").toString()));
      }
      if ((jsonObj.get("IPv6Address") != null && !jsonObj.get("IPv6Address").isJsonNull()) && !jsonObj.get("IPv6Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPv6Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPv6Address").toString()));
      }
      if ((jsonObj.get("MacAddress") != null && !jsonObj.get("MacAddress").isJsonNull()) && !jsonObj.get("MacAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MacAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MacAddress").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!EndpointResource.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'EndpointResource' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<EndpointResource> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(EndpointResource.class));

       return (TypeAdapter<T>) new TypeAdapter<EndpointResource>() {
           @Override
           public void write(JsonWriter out, EndpointResource value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public EndpointResource read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of EndpointResource given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of EndpointResource
   * @throws IOException if the JSON string is invalid with respect to EndpointResource
   */
  public static EndpointResource fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, EndpointResource.class);
  }

  /**
   * Convert an instance of EndpointResource to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


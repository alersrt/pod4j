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
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.client.model.PluginDevice;

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
 * PluginConfigLinux plugin config linux
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T18:07:05.610979114+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class PluginConfigLinux {
  public static final String SERIALIZED_NAME_ALLOW_ALL_DEVICES = "AllowAllDevices";
  @SerializedName(SERIALIZED_NAME_ALLOW_ALL_DEVICES)
  private Boolean allowAllDevices;

  public static final String SERIALIZED_NAME_CAPABILITIES = "Capabilities";
  @SerializedName(SERIALIZED_NAME_CAPABILITIES)
  private List<String> capabilities = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEVICES = "Devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<PluginDevice> devices = new ArrayList<>();

  public PluginConfigLinux() {
  }

  public PluginConfigLinux allowAllDevices(Boolean allowAllDevices) {
    this.allowAllDevices = allowAllDevices;
    return this;
  }

  /**
   * allow all devices
   * @return allowAllDevices
   */
  @javax.annotation.Nonnull
  public Boolean getAllowAllDevices() {
    return allowAllDevices;
  }

  public void setAllowAllDevices(Boolean allowAllDevices) {
    this.allowAllDevices = allowAllDevices;
  }


  public PluginConfigLinux capabilities(List<String> capabilities) {
    this.capabilities = capabilities;
    return this;
  }

  public PluginConfigLinux addCapabilitiesItem(String capabilitiesItem) {
    if (this.capabilities == null) {
      this.capabilities = new ArrayList<>();
    }
    this.capabilities.add(capabilitiesItem);
    return this;
  }

  /**
   * capabilities
   * @return capabilities
   */
  @javax.annotation.Nonnull
  public List<String> getCapabilities() {
    return capabilities;
  }

  public void setCapabilities(List<String> capabilities) {
    this.capabilities = capabilities;
  }


  public PluginConfigLinux devices(List<PluginDevice> devices) {
    this.devices = devices;
    return this;
  }

  public PluginConfigLinux addDevicesItem(PluginDevice devicesItem) {
    if (this.devices == null) {
      this.devices = new ArrayList<>();
    }
    this.devices.add(devicesItem);
    return this;
  }

  /**
   * devices
   * @return devices
   */
  @javax.annotation.Nonnull
  public List<PluginDevice> getDevices() {
    return devices;
  }

  public void setDevices(List<PluginDevice> devices) {
    this.devices = devices;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginConfigLinux pluginConfigLinux = (PluginConfigLinux) o;
    return Objects.equals(this.allowAllDevices, pluginConfigLinux.allowAllDevices) &&
        Objects.equals(this.capabilities, pluginConfigLinux.capabilities) &&
        Objects.equals(this.devices, pluginConfigLinux.devices);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowAllDevices, capabilities, devices);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginConfigLinux {\n");
    sb.append("    allowAllDevices: ").append(toIndentedString(allowAllDevices)).append("\n");
    sb.append("    capabilities: ").append(toIndentedString(capabilities)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
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
    openapiFields.add("AllowAllDevices");
    openapiFields.add("Capabilities");
    openapiFields.add("Devices");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("AllowAllDevices");
    openapiRequiredFields.add("Capabilities");
    openapiRequiredFields.add("Devices");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PluginConfigLinux
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PluginConfigLinux.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PluginConfigLinux is not found in the empty JSON string", PluginConfigLinux.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PluginConfigLinux.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PluginConfigLinux` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PluginConfigLinux.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("Capabilities") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Capabilities").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Capabilities` to be an array in the JSON string but got `%s`", jsonObj.get("Capabilities").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("Devices").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Devices` to be an array in the JSON string but got `%s`", jsonObj.get("Devices").toString()));
      }

      JsonArray jsonArraydevices = jsonObj.getAsJsonArray("Devices");
      // validate the required field `Devices` (array)
      for (int i = 0; i < jsonArraydevices.size(); i++) {
        PluginDevice.validateJsonElement(jsonArraydevices.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PluginConfigLinux.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PluginConfigLinux' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PluginConfigLinux> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PluginConfigLinux.class));

       return (TypeAdapter<T>) new TypeAdapter<PluginConfigLinux>() {
           @Override
           public void write(JsonWriter out, PluginConfigLinux value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PluginConfigLinux read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PluginConfigLinux given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PluginConfigLinux
   * @throws IOException if the JSON string is invalid with respect to PluginConfigLinux
   */
  public static PluginConfigLinux fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PluginConfigLinux.class);
  }

  /**
   * Convert an instance of PluginConfigLinux to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


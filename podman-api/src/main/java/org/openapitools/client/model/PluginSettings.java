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
import org.openapitools.client.model.PluginMount;

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
 * PluginSettings
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T16:02:35.210602253+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class PluginSettings {
  public static final String SERIALIZED_NAME_ARGS = "Args";
  @SerializedName(SERIALIZED_NAME_ARGS)
  private List<String> args = new ArrayList<>();

  public static final String SERIALIZED_NAME_DEVICES = "Devices";
  @SerializedName(SERIALIZED_NAME_DEVICES)
  private List<PluginDevice> devices = new ArrayList<>();

  public static final String SERIALIZED_NAME_ENV = "Env";
  @SerializedName(SERIALIZED_NAME_ENV)
  private List<String> env = new ArrayList<>();

  public static final String SERIALIZED_NAME_MOUNTS = "Mounts";
  @SerializedName(SERIALIZED_NAME_MOUNTS)
  private List<PluginMount> mounts = new ArrayList<>();

  public PluginSettings() {
  }

  public PluginSettings args(List<String> args) {
    this.args = args;
    return this;
  }

  public PluginSettings addArgsItem(String argsItem) {
    if (this.args == null) {
      this.args = new ArrayList<>();
    }
    this.args.add(argsItem);
    return this;
  }

  /**
   * args
   * @return args
   */
  @javax.annotation.Nonnull
  public List<String> getArgs() {
    return args;
  }

  public void setArgs(List<String> args) {
    this.args = args;
  }


  public PluginSettings devices(List<PluginDevice> devices) {
    this.devices = devices;
    return this;
  }

  public PluginSettings addDevicesItem(PluginDevice devicesItem) {
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


  public PluginSettings env(List<String> env) {
    this.env = env;
    return this;
  }

  public PluginSettings addEnvItem(String envItem) {
    if (this.env == null) {
      this.env = new ArrayList<>();
    }
    this.env.add(envItem);
    return this;
  }

  /**
   * env
   * @return env
   */
  @javax.annotation.Nonnull
  public List<String> getEnv() {
    return env;
  }

  public void setEnv(List<String> env) {
    this.env = env;
  }


  public PluginSettings mounts(List<PluginMount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public PluginSettings addMountsItem(PluginMount mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * mounts
   * @return mounts
   */
  @javax.annotation.Nonnull
  public List<PluginMount> getMounts() {
    return mounts;
  }

  public void setMounts(List<PluginMount> mounts) {
    this.mounts = mounts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PluginSettings pluginSettings = (PluginSettings) o;
    return Objects.equals(this.args, pluginSettings.args) &&
        Objects.equals(this.devices, pluginSettings.devices) &&
        Objects.equals(this.env, pluginSettings.env) &&
        Objects.equals(this.mounts, pluginSettings.mounts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(args, devices, env, mounts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PluginSettings {\n");
    sb.append("    args: ").append(toIndentedString(args)).append("\n");
    sb.append("    devices: ").append(toIndentedString(devices)).append("\n");
    sb.append("    env: ").append(toIndentedString(env)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
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
    openapiFields.add("Args");
    openapiFields.add("Devices");
    openapiFields.add("Env");
    openapiFields.add("Mounts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Args");
    openapiRequiredFields.add("Devices");
    openapiRequiredFields.add("Env");
    openapiRequiredFields.add("Mounts");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PluginSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PluginSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PluginSettings is not found in the empty JSON string", PluginSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PluginSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PluginSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PluginSettings.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the required json array is present
      if (jsonObj.get("Args") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Args").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Args` to be an array in the JSON string but got `%s`", jsonObj.get("Args").toString()));
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
      // ensure the required json array is present
      if (jsonObj.get("Env") == null) {
        throw new IllegalArgumentException("Expected the field `linkedContent` to be an array in the JSON string but got `null`");
      } else if (!jsonObj.get("Env").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Env` to be an array in the JSON string but got `%s`", jsonObj.get("Env").toString()));
      }
      // ensure the json data is an array
      if (!jsonObj.get("Mounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mounts` to be an array in the JSON string but got `%s`", jsonObj.get("Mounts").toString()));
      }

      JsonArray jsonArraymounts = jsonObj.getAsJsonArray("Mounts");
      // validate the required field `Mounts` (array)
      for (int i = 0; i < jsonArraymounts.size(); i++) {
        PluginMount.validateJsonElement(jsonArraymounts.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PluginSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PluginSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PluginSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PluginSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<PluginSettings>() {
           @Override
           public void write(JsonWriter out, PluginSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PluginSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PluginSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PluginSettings
   * @throws IOException if the JSON string is invalid with respect to PluginSettings
   */
  public static PluginSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PluginSettings.class);
  }

  /**
   * Convert an instance of PluginSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


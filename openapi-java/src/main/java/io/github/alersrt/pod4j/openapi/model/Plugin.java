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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

/**
 * Plugin A plugin for the Engine API
 */
@ApiModel(description = "Plugin A plugin for the Engine API")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class Plugin implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONFIG = "Config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private PluginConfig config;

  public static final String SERIALIZED_NAME_ENABLED = "Enabled";
  @SerializedName(SERIALIZED_NAME_ENABLED)
  private Boolean enabled;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SETTINGS = "Settings";
  @SerializedName(SERIALIZED_NAME_SETTINGS)
  private PluginSettings settings;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PLUGIN_REFERENCE = "PluginReference";
  @SerializedName(SERIALIZED_NAME_PLUGIN_REFERENCE)
  private String pluginReference;

  public Plugin() {
  }

  public Plugin config(PluginConfig config) {

      this.config = config;
    return this;
  }

    /**
   * Get config
   * @return config
     **/
    @javax.annotation.Nonnull
  @NotNull
  @Valid
    @ApiModelProperty(required = true, value = "")

  public PluginConfig getConfig() {
    return config;
  }


  public void setConfig(PluginConfig config) {
    this.config = config;
  }


  public Plugin enabled(Boolean enabled) {

      this.enabled = enabled;
    return this;
  }

    /**
   * True if the plugin is running. False if the plugin is not running, only installed.
   * @return enabled
     **/
    @javax.annotation.Nonnull
  @NotNull
    @ApiModelProperty(required = true, value = "True if the plugin is running. False if the plugin is not running, only installed.")

  public Boolean getEnabled() {
    return enabled;
  }


  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }


  public Plugin name(String name) {

      this.name = name;
    return this;
  }

    /**
   * name
   * @return name
     **/
    @javax.annotation.Nonnull
  @NotNull
    @ApiModelProperty(required = true, value = "name")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Plugin settings(PluginSettings settings) {

      this.settings = settings;
    return this;
  }

    /**
   * Get settings
   * @return settings
     **/
    @javax.annotation.Nonnull
  @NotNull
  @Valid
    @ApiModelProperty(required = true, value = "")

  public PluginSettings getSettings() {
    return settings;
  }


  public void setSettings(PluginSettings settings) {
    this.settings = settings;
  }


  public Plugin id(String id) {

      this.id = id;
    return this;
  }

    /**
   * Id
   * @return id
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Id")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public Plugin pluginReference(String pluginReference) {

      this.pluginReference = pluginReference;
    return this;
  }

    /**
   * plugin remote reference used to push/pull the plugin
   * @return pluginReference
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "plugin remote reference used to push/pull the plugin")

  public String getPluginReference() {
    return pluginReference;
  }


  public void setPluginReference(String pluginReference) {
    this.pluginReference = pluginReference;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Plugin plugin = (Plugin) o;
    return Objects.equals(this.config, plugin.config) &&
        Objects.equals(this.enabled, plugin.enabled) &&
        Objects.equals(this.name, plugin.name) &&
        Objects.equals(this.settings, plugin.settings) &&
        Objects.equals(this.id, plugin.id) &&
        Objects.equals(this.pluginReference, plugin.pluginReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(config, enabled, name, settings, id, pluginReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Plugin {\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pluginReference: ").append(toIndentedString(pluginReference)).append("\n");
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
    openapiFields.add("Config");
    openapiFields.add("Enabled");
    openapiFields.add("Name");
    openapiFields.add("Settings");
    openapiFields.add("Id");
    openapiFields.add("PluginReference");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Config");
    openapiRequiredFields.add("Enabled");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("Settings");
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to Plugin
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (Plugin.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Plugin is not found in the empty JSON string", Plugin.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!Plugin.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Plugin` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Plugin.openapiRequiredFields) {
          if (jsonObj.get(requiredField) == null) {
              throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
          }
      }
        // validate the optional field `Config`
        if (jsonObj.get("Config") != null && !jsonObj.get("Config").isJsonNull()) {
            PluginConfig.validateJsonObject(jsonObj.getAsJsonObject("Config"));
        }
        if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
        }
        // validate the optional field `Settings`
        if (jsonObj.get("Settings") != null && !jsonObj.get("Settings").isJsonNull()) {
            PluginSettings.validateJsonObject(jsonObj.getAsJsonObject("Settings"));
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if ((jsonObj.get("PluginReference") != null && !jsonObj.get("PluginReference").isJsonNull()) && !jsonObj.get("PluginReference").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PluginReference` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PluginReference").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Plugin.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Plugin' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Plugin> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Plugin.class));

       return (TypeAdapter<T>) new TypeAdapter<Plugin>() {
           @Override
           public void write(JsonWriter out, Plugin value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Plugin read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of Plugin given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of Plugin
     * @throws IOException if the JSON string is invalid with respect to Plugin
  */
  public static Plugin fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Plugin.class);
  }

    /**
     * Convert an instance of Plugin to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


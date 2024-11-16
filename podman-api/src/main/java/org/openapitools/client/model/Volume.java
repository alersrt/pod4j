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
import java.util.HashMap;
import java.util.Map;
import org.openapitools.client.model.ClusterVolume;
import org.openapitools.client.model.UsageData;

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
 * Volume volume
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-16T16:02:35.210602253+07:00[Asia/Barnaul]", comments = "Generator version: 7.8.0")
public class Volume {
  public static final String SERIALIZED_NAME_CLUSTER_VOLUME = "ClusterVolume";
  @SerializedName(SERIALIZED_NAME_CLUSTER_VOLUME)
  private ClusterVolume clusterVolume;

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_DRIVER = "Driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MOUNTPOINT = "Mountpoint";
  @SerializedName(SERIALIZED_NAME_MOUNTPOINT)
  private String mountpoint;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OPTIONS = "Options";
  @SerializedName(SERIALIZED_NAME_OPTIONS)
  private Map<String, String> options = new HashMap<>();

  public static final String SERIALIZED_NAME_SCOPE = "Scope";
  @SerializedName(SERIALIZED_NAME_SCOPE)
  private String scope;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private Map<String, Object> status = new HashMap<>();

  public static final String SERIALIZED_NAME_USAGE_DATA = "UsageData";
  @SerializedName(SERIALIZED_NAME_USAGE_DATA)
  private UsageData usageData;

  public Volume() {
  }

  public Volume clusterVolume(ClusterVolume clusterVolume) {
    this.clusterVolume = clusterVolume;
    return this;
  }

  /**
   * Get clusterVolume
   * @return clusterVolume
   */
  @javax.annotation.Nullable
  public ClusterVolume getClusterVolume() {
    return clusterVolume;
  }

  public void setClusterVolume(ClusterVolume clusterVolume) {
    this.clusterVolume = clusterVolume;
  }


  public Volume createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Date/Time the volume was created.
   * @return createdAt
   */
  @javax.annotation.Nullable
  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public Volume driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Name of the volume driver used by the volume.
   * @return driver
   */
  @javax.annotation.Nonnull
  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public Volume labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Volume putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * User-defined key/value metadata.
   * @return labels
   */
  @javax.annotation.Nonnull
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public Volume mountpoint(String mountpoint) {
    this.mountpoint = mountpoint;
    return this;
  }

  /**
   * Mount path of the volume on the host.
   * @return mountpoint
   */
  @javax.annotation.Nonnull
  public String getMountpoint() {
    return mountpoint;
  }

  public void setMountpoint(String mountpoint) {
    this.mountpoint = mountpoint;
  }


  public Volume name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name of the volume.
   * @return name
   */
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Volume options(Map<String, String> options) {
    this.options = options;
    return this;
  }

  public Volume putOptionsItem(String key, String optionsItem) {
    if (this.options == null) {
      this.options = new HashMap<>();
    }
    this.options.put(key, optionsItem);
    return this;
  }

  /**
   * The driver specific options used when creating the volume.
   * @return options
   */
  @javax.annotation.Nonnull
  public Map<String, String> getOptions() {
    return options;
  }

  public void setOptions(Map<String, String> options) {
    this.options = options;
  }


  public Volume scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The level at which the volume exists. Either &#x60;global&#x60; for cluster-wide, or &#x60;local&#x60; for machine level.
   * @return scope
   */
  @javax.annotation.Nonnull
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  public Volume status(Map<String, Object> status) {
    this.status = status;
    return this;
  }

  public Volume putStatusItem(String key, Object statusItem) {
    if (this.status == null) {
      this.status = new HashMap<>();
    }
    this.status.put(key, statusItem);
    return this;
  }

  /**
   * Low-level details about the volume, provided by the volume driver. Details are returned as a map with key/value pairs: &#x60;{\&quot;key\&quot;:\&quot;value\&quot;,\&quot;key2\&quot;:\&quot;value2\&quot;}&#x60;.  The &#x60;Status&#x60; field is optional, and is omitted if the volume driver does not support this feature.
   * @return status
   */
  @javax.annotation.Nullable
  public Map<String, Object> getStatus() {
    return status;
  }

  public void setStatus(Map<String, Object> status) {
    this.status = status;
  }


  public Volume usageData(UsageData usageData) {
    this.usageData = usageData;
    return this;
  }

  /**
   * Get usageData
   * @return usageData
   */
  @javax.annotation.Nullable
  public UsageData getUsageData() {
    return usageData;
  }

  public void setUsageData(UsageData usageData) {
    this.usageData = usageData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Volume volume = (Volume) o;
    return Objects.equals(this.clusterVolume, volume.clusterVolume) &&
        Objects.equals(this.createdAt, volume.createdAt) &&
        Objects.equals(this.driver, volume.driver) &&
        Objects.equals(this.labels, volume.labels) &&
        Objects.equals(this.mountpoint, volume.mountpoint) &&
        Objects.equals(this.name, volume.name) &&
        Objects.equals(this.options, volume.options) &&
        Objects.equals(this.scope, volume.scope) &&
        Objects.equals(this.status, volume.status) &&
        Objects.equals(this.usageData, volume.usageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clusterVolume, createdAt, driver, labels, mountpoint, name, options, scope, status, usageData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Volume {\n");
    sb.append("    clusterVolume: ").append(toIndentedString(clusterVolume)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mountpoint: ").append(toIndentedString(mountpoint)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    options: ").append(toIndentedString(options)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    usageData: ").append(toIndentedString(usageData)).append("\n");
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
    openapiFields.add("ClusterVolume");
    openapiFields.add("CreatedAt");
    openapiFields.add("Driver");
    openapiFields.add("Labels");
    openapiFields.add("Mountpoint");
    openapiFields.add("Name");
    openapiFields.add("Options");
    openapiFields.add("Scope");
    openapiFields.add("Status");
    openapiFields.add("UsageData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Driver");
    openapiRequiredFields.add("Labels");
    openapiRequiredFields.add("Mountpoint");
    openapiRequiredFields.add("Name");
    openapiRequiredFields.add("Options");
    openapiRequiredFields.add("Scope");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Volume
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Volume.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Volume is not found in the empty JSON string", Volume.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Volume.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Volume` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Volume.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `ClusterVolume`
      if (jsonObj.get("ClusterVolume") != null && !jsonObj.get("ClusterVolume").isJsonNull()) {
        ClusterVolume.validateJsonElement(jsonObj.get("ClusterVolume"));
      }
      if ((jsonObj.get("CreatedAt") != null && !jsonObj.get("CreatedAt").isJsonNull()) && !jsonObj.get("CreatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CreatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CreatedAt").toString()));
      }
      if (!jsonObj.get("Driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Driver").toString()));
      }
      if (!jsonObj.get("Mountpoint").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mountpoint` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Mountpoint").toString()));
      }
      if (!jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if (!jsonObj.get("Scope").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Scope` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Scope").toString()));
      }
      // validate the optional field `UsageData`
      if (jsonObj.get("UsageData") != null && !jsonObj.get("UsageData").isJsonNull()) {
        UsageData.validateJsonElement(jsonObj.get("UsageData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Volume.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Volume' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Volume> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Volume.class));

       return (TypeAdapter<T>) new TypeAdapter<Volume>() {
           @Override
           public void write(JsonWriter out, Volume value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Volume read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Volume given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Volume
   * @throws IOException if the JSON string is invalid with respect to Volume
   */
  public static Volume fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Volume.class);
  }

  /**
   * Convert an instance of Volume to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import io.github.alersrt.pod4j.openapi.model.Config;
import io.github.alersrt.pod4j.openapi.model.HostConfig;
import io.github.alersrt.pod4j.openapi.model.MountPoint;
import io.github.alersrt.pod4j.openapi.model.NetworkingConfig;
import io.github.alersrt.pod4j.openapi.model.Platform;
import io.github.alersrt.pod4j.openapi.model.Port;
import io.github.alersrt.pod4j.openapi.model.SummaryNetworkSettings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * Container
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T02:27:12.403969908+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Container implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_COMMAND = "Command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private String command;

  public static final String SERIALIZED_NAME_CONFIG = "Config";
  @SerializedName(SERIALIZED_NAME_CONFIG)
  private Config config;

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private Long created;

  public static final String SERIALIZED_NAME_DEFAULT_READ_ONLY_NON_RECURSIVE = "DefaultReadOnlyNonRecursive";
  @SerializedName(SERIALIZED_NAME_DEFAULT_READ_ONLY_NON_RECURSIVE)
  private Boolean defaultReadOnlyNonRecursive;

  public static final String SERIALIZED_NAME_HOST_CONFIG = "HostConfig";
  @SerializedName(SERIALIZED_NAME_HOST_CONFIG)
  private HostConfig hostConfig;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE = "Image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_I_D = "ImageID";
  @SerializedName(SERIALIZED_NAME_IMAGE_I_D)
  private String imageID;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MOUNTS = "Mounts";
  @SerializedName(SERIALIZED_NAME_MOUNTS)
  private List<@Valid MountPoint> mounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMES = "Names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<String> names = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETWORK_SETTINGS = "NetworkSettings";
  @SerializedName(SERIALIZED_NAME_NETWORK_SETTINGS)
  private SummaryNetworkSettings networkSettings;

  public static final String SERIALIZED_NAME_NETWORKING_CONFIG = "NetworkingConfig";
  @SerializedName(SERIALIZED_NAME_NETWORKING_CONFIG)
  private NetworkingConfig networkingConfig;

  public static final String SERIALIZED_NAME_PLATFORM = "Platform";
  @SerializedName(SERIALIZED_NAME_PLATFORM)
  private Platform platform;

  public static final String SERIALIZED_NAME_PORTS = "Ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<@Valid Port> ports = new ArrayList<>();

  public static final String SERIALIZED_NAME_SIZE_ROOT_FS = "SizeRootFs";
  @SerializedName(SERIALIZED_NAME_SIZE_ROOT_FS)
  private Long sizeRootFs;

  public static final String SERIALIZED_NAME_SIZE_RW = "SizeRw";
  @SerializedName(SERIALIZED_NAME_SIZE_RW)
  private Long sizeRw;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public Container() {
  }

  public Container command(String command) {
    this.command = command;
    return this;
  }

  /**
   * Get command
   * @return command
   */
  @jakarta.annotation.Nullable

  public String getCommand() {
    return command;
  }

  public void setCommand(String command) {
    this.command = command;
  }


  public Container config(Config config) {
    this.config = config;
    return this;
  }

  /**
   * Get config
   * @return config
   */
  @jakarta.annotation.Nullable
  @Valid

  public Config getConfig() {
    return config;
  }

  public void setConfig(Config config) {
    this.config = config;
  }


  public Container created(Long created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @jakarta.annotation.Nullable

  public Long getCreated() {
    return created;
  }

  public void setCreated(Long created) {
    this.created = created;
  }


  public Container defaultReadOnlyNonRecursive(Boolean defaultReadOnlyNonRecursive) {
    this.defaultReadOnlyNonRecursive = defaultReadOnlyNonRecursive;
    return this;
  }

  /**
   * Get defaultReadOnlyNonRecursive
   * @return defaultReadOnlyNonRecursive
   */
  @jakarta.annotation.Nullable

  public Boolean getDefaultReadOnlyNonRecursive() {
    return defaultReadOnlyNonRecursive;
  }

  public void setDefaultReadOnlyNonRecursive(Boolean defaultReadOnlyNonRecursive) {
    this.defaultReadOnlyNonRecursive = defaultReadOnlyNonRecursive;
  }


  public Container hostConfig(HostConfig hostConfig) {
    this.hostConfig = hostConfig;
    return this;
  }

  /**
   * Get hostConfig
   * @return hostConfig
   */
  @jakarta.annotation.Nullable
  @Valid

  public HostConfig getHostConfig() {
    return hostConfig;
  }

  public void setHostConfig(HostConfig hostConfig) {
    this.hostConfig = hostConfig;
  }


  public Container id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  @jakarta.annotation.Nullable

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public Container image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Get image
   * @return image
   */
  @jakarta.annotation.Nullable

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public Container imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

  /**
   * Get imageID
   * @return imageID
   */
  @jakarta.annotation.Nullable

  public String getImageID() {
    return imageID;
  }

  public void setImageID(String imageID) {
    this.imageID = imageID;
  }


  public Container labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public Container putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Get labels
   * @return labels
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public Container mounts(List<@Valid MountPoint> mounts) {
    this.mounts = mounts;
    return this;
  }

  public Container addMountsItem(MountPoint mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * Get mounts
   * @return mounts
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid MountPoint> getMounts() {
    return mounts;
  }

  public void setMounts(List<@Valid MountPoint> mounts) {
    this.mounts = mounts;
  }


  public Container name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @jakarta.annotation.Nullable

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public Container names(List<String> names) {
    this.names = names;
    return this;
  }

  public Container addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * Get names
   * @return names
   */
  @jakarta.annotation.Nullable

  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }


  public Container networkSettings(SummaryNetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
    return this;
  }

  /**
   * Get networkSettings
   * @return networkSettings
   */
  @jakarta.annotation.Nullable
  @Valid

  public SummaryNetworkSettings getNetworkSettings() {
    return networkSettings;
  }

  public void setNetworkSettings(SummaryNetworkSettings networkSettings) {
    this.networkSettings = networkSettings;
  }


  public Container networkingConfig(NetworkingConfig networkingConfig) {
    this.networkingConfig = networkingConfig;
    return this;
  }

  /**
   * Get networkingConfig
   * @return networkingConfig
   */
  @jakarta.annotation.Nullable
  @Valid

  public NetworkingConfig getNetworkingConfig() {
    return networkingConfig;
  }

  public void setNetworkingConfig(NetworkingConfig networkingConfig) {
    this.networkingConfig = networkingConfig;
  }


  public Container platform(Platform platform) {
    this.platform = platform;
    return this;
  }

  /**
   * Get platform
   * @return platform
   */
  @jakarta.annotation.Nullable
  @Valid

  public Platform getPlatform() {
    return platform;
  }

  public void setPlatform(Platform platform) {
    this.platform = platform;
  }


  public Container ports(List<@Valid Port> ports) {
    this.ports = ports;
    return this;
  }

  public Container addPortsItem(Port portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Get ports
   * @return ports
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid Port> getPorts() {
    return ports;
  }

  public void setPorts(List<@Valid Port> ports) {
    this.ports = ports;
  }


  public Container sizeRootFs(Long sizeRootFs) {
    this.sizeRootFs = sizeRootFs;
    return this;
  }

  /**
   * Get sizeRootFs
   * @return sizeRootFs
   */
  @jakarta.annotation.Nullable

  public Long getSizeRootFs() {
    return sizeRootFs;
  }

  public void setSizeRootFs(Long sizeRootFs) {
    this.sizeRootFs = sizeRootFs;
  }


  public Container sizeRw(Long sizeRw) {
    this.sizeRw = sizeRw;
    return this;
  }

  /**
   * Get sizeRw
   * @return sizeRw
   */
  @jakarta.annotation.Nullable

  public Long getSizeRw() {
    return sizeRw;
  }

  public void setSizeRw(Long sizeRw) {
    this.sizeRw = sizeRw;
  }


  public Container state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  @jakarta.annotation.Nullable

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public Container status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @jakarta.annotation.Nullable

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Container container = (Container) o;
    return Objects.equals(this.command, container.command) &&
        Objects.equals(this.config, container.config) &&
        Objects.equals(this.created, container.created) &&
        Objects.equals(this.defaultReadOnlyNonRecursive, container.defaultReadOnlyNonRecursive) &&
        Objects.equals(this.hostConfig, container.hostConfig) &&
        Objects.equals(this.id, container.id) &&
        Objects.equals(this.image, container.image) &&
        Objects.equals(this.imageID, container.imageID) &&
        Objects.equals(this.labels, container.labels) &&
        Objects.equals(this.mounts, container.mounts) &&
        Objects.equals(this.name, container.name) &&
        Objects.equals(this.names, container.names) &&
        Objects.equals(this.networkSettings, container.networkSettings) &&
        Objects.equals(this.networkingConfig, container.networkingConfig) &&
        Objects.equals(this.platform, container.platform) &&
        Objects.equals(this.ports, container.ports) &&
        Objects.equals(this.sizeRootFs, container.sizeRootFs) &&
        Objects.equals(this.sizeRw, container.sizeRw) &&
        Objects.equals(this.state, container.state) &&
        Objects.equals(this.status, container.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(command, config, created, defaultReadOnlyNonRecursive, hostConfig, id, image, imageID, labels, mounts, name, names, networkSettings, networkingConfig, platform, ports, sizeRootFs, sizeRw, state, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Container {\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    config: ").append(toIndentedString(config)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    defaultReadOnlyNonRecursive: ").append(toIndentedString(defaultReadOnlyNonRecursive)).append("\n");
    sb.append("    hostConfig: ").append(toIndentedString(hostConfig)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    networkSettings: ").append(toIndentedString(networkSettings)).append("\n");
    sb.append("    networkingConfig: ").append(toIndentedString(networkingConfig)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    sizeRootFs: ").append(toIndentedString(sizeRootFs)).append("\n");
    sb.append("    sizeRw: ").append(toIndentedString(sizeRw)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    openapiFields.add("Command");
    openapiFields.add("Config");
    openapiFields.add("Created");
    openapiFields.add("DefaultReadOnlyNonRecursive");
    openapiFields.add("HostConfig");
    openapiFields.add("Id");
    openapiFields.add("Image");
    openapiFields.add("ImageID");
    openapiFields.add("Labels");
    openapiFields.add("Mounts");
    openapiFields.add("Name");
    openapiFields.add("Names");
    openapiFields.add("NetworkSettings");
    openapiFields.add("NetworkingConfig");
    openapiFields.add("Platform");
    openapiFields.add("Ports");
    openapiFields.add("SizeRootFs");
    openapiFields.add("SizeRw");
    openapiFields.add("State");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Container
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Container.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Container is not found in the empty JSON string", Container.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Container.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Container` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Command") != null && !jsonObj.get("Command").isJsonNull()) && !jsonObj.get("Command").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Command` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Command").toString()));
      }
      // validate the optional field `Config`
      if (jsonObj.get("Config") != null && !jsonObj.get("Config").isJsonNull()) {
        Config.validateJsonElement(jsonObj.get("Config"));
      }
      // validate the optional field `HostConfig`
      if (jsonObj.get("HostConfig") != null && !jsonObj.get("HostConfig").isJsonNull()) {
        HostConfig.validateJsonElement(jsonObj.get("HostConfig"));
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if ((jsonObj.get("Image") != null && !jsonObj.get("Image").isJsonNull()) && !jsonObj.get("Image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Image").toString()));
      }
      if ((jsonObj.get("ImageID") != null && !jsonObj.get("ImageID").isJsonNull()) && !jsonObj.get("ImageID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ImageID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ImageID").toString()));
      }
      if (jsonObj.get("Mounts") != null && !jsonObj.get("Mounts").isJsonNull()) {
        JsonArray jsonArraymounts = jsonObj.getAsJsonArray("Mounts");
        if (jsonArraymounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Mounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Mounts` to be an array in the JSON string but got `%s`", jsonObj.get("Mounts").toString()));
          }

          // validate the optional field `Mounts` (array)
          for (int i = 0; i < jsonArraymounts.size(); i++) {
            MountPoint.validateJsonElement(jsonArraymounts.get(i));
          };
        }
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Names") != null && !jsonObj.get("Names").isJsonNull() && !jsonObj.get("Names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Names` to be an array in the JSON string but got `%s`", jsonObj.get("Names").toString()));
      }
      // validate the optional field `NetworkSettings`
      if (jsonObj.get("NetworkSettings") != null && !jsonObj.get("NetworkSettings").isJsonNull()) {
        SummaryNetworkSettings.validateJsonElement(jsonObj.get("NetworkSettings"));
      }
      // validate the optional field `NetworkingConfig`
      if (jsonObj.get("NetworkingConfig") != null && !jsonObj.get("NetworkingConfig").isJsonNull()) {
        NetworkingConfig.validateJsonElement(jsonObj.get("NetworkingConfig"));
      }
      // validate the optional field `Platform`
      if (jsonObj.get("Platform") != null && !jsonObj.get("Platform").isJsonNull()) {
        Platform.validateJsonElement(jsonObj.get("Platform"));
      }
      if (jsonObj.get("Ports") != null && !jsonObj.get("Ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("Ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Ports` to be an array in the JSON string but got `%s`", jsonObj.get("Ports").toString()));
          }

          // validate the optional field `Ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            Port.validateJsonElement(jsonArrayports.get(i));
          };
        }
      }
      if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) && !jsonObj.get("State").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `State` to be a primitive type in the JSON string but got `%s`", jsonObj.get("State").toString()));
      }
      if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Container.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Container' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Container> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Container.class));

       return (TypeAdapter<T>) new TypeAdapter<Container>() {
           @Override
           public void write(JsonWriter out, Container value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Container read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Container given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Container
   * @throws IOException if the JSON string is invalid with respect to Container
   */
  public static Container fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Container.class);
  }

  /**
   * Convert an instance of Container to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


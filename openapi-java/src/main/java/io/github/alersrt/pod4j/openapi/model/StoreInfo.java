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
import io.github.alersrt.pod4j.openapi.model.ContainerStore;
import io.github.alersrt.pod4j.openapi.model.ImageStore;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
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
 * StoreInfo describes the container storage and its attributes
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T02:16:23.826374396+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class StoreInfo implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONFIG_FILE = "configFile";
  @SerializedName(SERIALIZED_NAME_CONFIG_FILE)
  private String configFile;

  public static final String SERIALIZED_NAME_CONTAINER_STORE = "containerStore";
  @SerializedName(SERIALIZED_NAME_CONTAINER_STORE)
  private ContainerStore containerStore;

  public static final String SERIALIZED_NAME_GRAPH_DRIVER_NAME = "graphDriverName";
  @SerializedName(SERIALIZED_NAME_GRAPH_DRIVER_NAME)
  private String graphDriverName;

  public static final String SERIALIZED_NAME_GRAPH_OPTIONS = "graphOptions";
  @SerializedName(SERIALIZED_NAME_GRAPH_OPTIONS)
  private Map<String, Object> graphOptions = new HashMap<>();

  public static final String SERIALIZED_NAME_GRAPH_ROOT = "graphRoot";
  @SerializedName(SERIALIZED_NAME_GRAPH_ROOT)
  private String graphRoot;

  public static final String SERIALIZED_NAME_GRAPH_ROOT_ALLOCATED = "graphRootAllocated";
  @SerializedName(SERIALIZED_NAME_GRAPH_ROOT_ALLOCATED)
  private Integer graphRootAllocated;

  public static final String SERIALIZED_NAME_GRAPH_ROOT_USED = "graphRootUsed";
  @SerializedName(SERIALIZED_NAME_GRAPH_ROOT_USED)
  private Integer graphRootUsed;

  public static final String SERIALIZED_NAME_GRAPH_STATUS = "graphStatus";
  @SerializedName(SERIALIZED_NAME_GRAPH_STATUS)
  private Map<String, String> graphStatus = new HashMap<>();

  public static final String SERIALIZED_NAME_IMAGE_COPY_TMP_DIR = "imageCopyTmpDir";
  @SerializedName(SERIALIZED_NAME_IMAGE_COPY_TMP_DIR)
  private String imageCopyTmpDir;

  public static final String SERIALIZED_NAME_IMAGE_STORE = "imageStore";
  @SerializedName(SERIALIZED_NAME_IMAGE_STORE)
  private ImageStore imageStore;

  public static final String SERIALIZED_NAME_RUN_ROOT = "runRoot";
  @SerializedName(SERIALIZED_NAME_RUN_ROOT)
  private String runRoot;

  public static final String SERIALIZED_NAME_TRANSIENT_STORE = "transientStore";
  @SerializedName(SERIALIZED_NAME_TRANSIENT_STORE)
  private Boolean transientStore;

  public static final String SERIALIZED_NAME_VOLUME_PATH = "volumePath";
  @SerializedName(SERIALIZED_NAME_VOLUME_PATH)
  private String volumePath;

  public StoreInfo() {
  }

  public StoreInfo configFile(String configFile) {
    this.configFile = configFile;
    return this;
  }

  /**
   * Get configFile
   * @return configFile
   */
  @jakarta.annotation.Nullable

  public String getConfigFile() {
    return configFile;
  }

  public void setConfigFile(String configFile) {
    this.configFile = configFile;
  }


  public StoreInfo containerStore(ContainerStore containerStore) {
    this.containerStore = containerStore;
    return this;
  }

  /**
   * Get containerStore
   * @return containerStore
   */
  @jakarta.annotation.Nullable
  @Valid

  public ContainerStore getContainerStore() {
    return containerStore;
  }

  public void setContainerStore(ContainerStore containerStore) {
    this.containerStore = containerStore;
  }


  public StoreInfo graphDriverName(String graphDriverName) {
    this.graphDriverName = graphDriverName;
    return this;
  }

  /**
   * Get graphDriverName
   * @return graphDriverName
   */
  @jakarta.annotation.Nullable

  public String getGraphDriverName() {
    return graphDriverName;
  }

  public void setGraphDriverName(String graphDriverName) {
    this.graphDriverName = graphDriverName;
  }


  public StoreInfo graphOptions(Map<String, Object> graphOptions) {
    this.graphOptions = graphOptions;
    return this;
  }

  public StoreInfo putGraphOptionsItem(String key, Object graphOptionsItem) {
    if (this.graphOptions == null) {
      this.graphOptions = new HashMap<>();
    }
    this.graphOptions.put(key, graphOptionsItem);
    return this;
  }

  /**
   * Get graphOptions
   * @return graphOptions
   */
  @jakarta.annotation.Nullable

  public Map<String, Object> getGraphOptions() {
    return graphOptions;
  }

  public void setGraphOptions(Map<String, Object> graphOptions) {
    this.graphOptions = graphOptions;
  }


  public StoreInfo graphRoot(String graphRoot) {
    this.graphRoot = graphRoot;
    return this;
  }

  /**
   * Get graphRoot
   * @return graphRoot
   */
  @jakarta.annotation.Nullable

  public String getGraphRoot() {
    return graphRoot;
  }

  public void setGraphRoot(String graphRoot) {
    this.graphRoot = graphRoot;
  }


  public StoreInfo graphRootAllocated(Integer graphRootAllocated) {
    this.graphRootAllocated = graphRootAllocated;
    return this;
  }

  /**
   * GraphRootAllocated is how much space the graphroot has in bytes
   * @return graphRootAllocated
   */
  @jakarta.annotation.Nullable

  public Integer getGraphRootAllocated() {
    return graphRootAllocated;
  }

  public void setGraphRootAllocated(Integer graphRootAllocated) {
    this.graphRootAllocated = graphRootAllocated;
  }


  public StoreInfo graphRootUsed(Integer graphRootUsed) {
    this.graphRootUsed = graphRootUsed;
    return this;
  }

  /**
   * GraphRootUsed is how much of graphroot is used in bytes
   * @return graphRootUsed
   */
  @jakarta.annotation.Nullable

  public Integer getGraphRootUsed() {
    return graphRootUsed;
  }

  public void setGraphRootUsed(Integer graphRootUsed) {
    this.graphRootUsed = graphRootUsed;
  }


  public StoreInfo graphStatus(Map<String, String> graphStatus) {
    this.graphStatus = graphStatus;
    return this;
  }

  public StoreInfo putGraphStatusItem(String key, String graphStatusItem) {
    if (this.graphStatus == null) {
      this.graphStatus = new HashMap<>();
    }
    this.graphStatus.put(key, graphStatusItem);
    return this;
  }

  /**
   * Get graphStatus
   * @return graphStatus
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getGraphStatus() {
    return graphStatus;
  }

  public void setGraphStatus(Map<String, String> graphStatus) {
    this.graphStatus = graphStatus;
  }


  public StoreInfo imageCopyTmpDir(String imageCopyTmpDir) {
    this.imageCopyTmpDir = imageCopyTmpDir;
    return this;
  }

  /**
   * Get imageCopyTmpDir
   * @return imageCopyTmpDir
   */
  @jakarta.annotation.Nullable

  public String getImageCopyTmpDir() {
    return imageCopyTmpDir;
  }

  public void setImageCopyTmpDir(String imageCopyTmpDir) {
    this.imageCopyTmpDir = imageCopyTmpDir;
  }


  public StoreInfo imageStore(ImageStore imageStore) {
    this.imageStore = imageStore;
    return this;
  }

  /**
   * Get imageStore
   * @return imageStore
   */
  @jakarta.annotation.Nullable
  @Valid

  public ImageStore getImageStore() {
    return imageStore;
  }

  public void setImageStore(ImageStore imageStore) {
    this.imageStore = imageStore;
  }


  public StoreInfo runRoot(String runRoot) {
    this.runRoot = runRoot;
    return this;
  }

  /**
   * Get runRoot
   * @return runRoot
   */
  @jakarta.annotation.Nullable

  public String getRunRoot() {
    return runRoot;
  }

  public void setRunRoot(String runRoot) {
    this.runRoot = runRoot;
  }


  public StoreInfo transientStore(Boolean transientStore) {
    this.transientStore = transientStore;
    return this;
  }

  /**
   * Get transientStore
   * @return transientStore
   */
  @jakarta.annotation.Nullable

  public Boolean getTransientStore() {
    return transientStore;
  }

  public void setTransientStore(Boolean transientStore) {
    this.transientStore = transientStore;
  }


  public StoreInfo volumePath(String volumePath) {
    this.volumePath = volumePath;
    return this;
  }

  /**
   * Get volumePath
   * @return volumePath
   */
  @jakarta.annotation.Nullable

  public String getVolumePath() {
    return volumePath;
  }

  public void setVolumePath(String volumePath) {
    this.volumePath = volumePath;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StoreInfo storeInfo = (StoreInfo) o;
    return Objects.equals(this.configFile, storeInfo.configFile) &&
        Objects.equals(this.containerStore, storeInfo.containerStore) &&
        Objects.equals(this.graphDriverName, storeInfo.graphDriverName) &&
        Objects.equals(this.graphOptions, storeInfo.graphOptions) &&
        Objects.equals(this.graphRoot, storeInfo.graphRoot) &&
        Objects.equals(this.graphRootAllocated, storeInfo.graphRootAllocated) &&
        Objects.equals(this.graphRootUsed, storeInfo.graphRootUsed) &&
        Objects.equals(this.graphStatus, storeInfo.graphStatus) &&
        Objects.equals(this.imageCopyTmpDir, storeInfo.imageCopyTmpDir) &&
        Objects.equals(this.imageStore, storeInfo.imageStore) &&
        Objects.equals(this.runRoot, storeInfo.runRoot) &&
        Objects.equals(this.transientStore, storeInfo.transientStore) &&
        Objects.equals(this.volumePath, storeInfo.volumePath);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configFile, containerStore, graphDriverName, graphOptions, graphRoot, graphRootAllocated, graphRootUsed, graphStatus, imageCopyTmpDir, imageStore, runRoot, transientStore, volumePath);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StoreInfo {\n");
    sb.append("    configFile: ").append(toIndentedString(configFile)).append("\n");
    sb.append("    containerStore: ").append(toIndentedString(containerStore)).append("\n");
    sb.append("    graphDriverName: ").append(toIndentedString(graphDriverName)).append("\n");
    sb.append("    graphOptions: ").append(toIndentedString(graphOptions)).append("\n");
    sb.append("    graphRoot: ").append(toIndentedString(graphRoot)).append("\n");
    sb.append("    graphRootAllocated: ").append(toIndentedString(graphRootAllocated)).append("\n");
    sb.append("    graphRootUsed: ").append(toIndentedString(graphRootUsed)).append("\n");
    sb.append("    graphStatus: ").append(toIndentedString(graphStatus)).append("\n");
    sb.append("    imageCopyTmpDir: ").append(toIndentedString(imageCopyTmpDir)).append("\n");
    sb.append("    imageStore: ").append(toIndentedString(imageStore)).append("\n");
    sb.append("    runRoot: ").append(toIndentedString(runRoot)).append("\n");
    sb.append("    transientStore: ").append(toIndentedString(transientStore)).append("\n");
    sb.append("    volumePath: ").append(toIndentedString(volumePath)).append("\n");
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
    openapiFields.add("configFile");
    openapiFields.add("containerStore");
    openapiFields.add("graphDriverName");
    openapiFields.add("graphOptions");
    openapiFields.add("graphRoot");
    openapiFields.add("graphRootAllocated");
    openapiFields.add("graphRootUsed");
    openapiFields.add("graphStatus");
    openapiFields.add("imageCopyTmpDir");
    openapiFields.add("imageStore");
    openapiFields.add("runRoot");
    openapiFields.add("transientStore");
    openapiFields.add("volumePath");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to StoreInfo
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!StoreInfo.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in StoreInfo is not found in the empty JSON string", StoreInfo.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!StoreInfo.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StoreInfo` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("configFile") != null && !jsonObj.get("configFile").isJsonNull()) && !jsonObj.get("configFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `configFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("configFile").toString()));
      }
      // validate the optional field `containerStore`
      if (jsonObj.get("containerStore") != null && !jsonObj.get("containerStore").isJsonNull()) {
        ContainerStore.validateJsonElement(jsonObj.get("containerStore"));
      }
      if ((jsonObj.get("graphDriverName") != null && !jsonObj.get("graphDriverName").isJsonNull()) && !jsonObj.get("graphDriverName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `graphDriverName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("graphDriverName").toString()));
      }
      if ((jsonObj.get("graphRoot") != null && !jsonObj.get("graphRoot").isJsonNull()) && !jsonObj.get("graphRoot").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `graphRoot` to be a primitive type in the JSON string but got `%s`", jsonObj.get("graphRoot").toString()));
      }
      if ((jsonObj.get("imageCopyTmpDir") != null && !jsonObj.get("imageCopyTmpDir").isJsonNull()) && !jsonObj.get("imageCopyTmpDir").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `imageCopyTmpDir` to be a primitive type in the JSON string but got `%s`", jsonObj.get("imageCopyTmpDir").toString()));
      }
      // validate the optional field `imageStore`
      if (jsonObj.get("imageStore") != null && !jsonObj.get("imageStore").isJsonNull()) {
        ImageStore.validateJsonElement(jsonObj.get("imageStore"));
      }
      if ((jsonObj.get("runRoot") != null && !jsonObj.get("runRoot").isJsonNull()) && !jsonObj.get("runRoot").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `runRoot` to be a primitive type in the JSON string but got `%s`", jsonObj.get("runRoot").toString()));
      }
      if ((jsonObj.get("volumePath") != null && !jsonObj.get("volumePath").isJsonNull()) && !jsonObj.get("volumePath").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumePath` to be a primitive type in the JSON string but got `%s`", jsonObj.get("volumePath").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StoreInfo.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StoreInfo' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StoreInfo> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StoreInfo.class));

       return (TypeAdapter<T>) new TypeAdapter<StoreInfo>() {
           @Override
           public void write(JsonWriter out, StoreInfo value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StoreInfo read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of StoreInfo given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of StoreInfo
   * @throws IOException if the JSON string is invalid with respect to StoreInfo
   */
  public static StoreInfo fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StoreInfo.class);
  }

  /**
   * Convert an instance of StoreInfo to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


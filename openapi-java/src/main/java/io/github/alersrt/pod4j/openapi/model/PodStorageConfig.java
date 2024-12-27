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
import io.github.alersrt.pod4j.openapi.model.ImageVolume;
import io.github.alersrt.pod4j.openapi.model.Mount;
import io.github.alersrt.pod4j.openapi.model.NamedVolume;
import io.github.alersrt.pod4j.openapi.model.OverlayVolume;
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
 * PodStorageConfig
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T23:04:06.361421791+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class PodStorageConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IMAGE_VOLUMES = "image_volumes";
  @SerializedName(SERIALIZED_NAME_IMAGE_VOLUMES)
  private List<@Valid ImageVolume> imageVolumes = new ArrayList<>();

  public static final String SERIALIZED_NAME_MOUNTS = "mounts";
  @SerializedName(SERIALIZED_NAME_MOUNTS)
  private List<@Valid Mount> mounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_OVERLAY_VOLUMES = "overlay_volumes";
  @SerializedName(SERIALIZED_NAME_OVERLAY_VOLUMES)
  private List<@Valid OverlayVolume> overlayVolumes = new ArrayList<>();

  public static final String SERIALIZED_NAME_SHM_SIZE = "shm_size";
  @SerializedName(SERIALIZED_NAME_SHM_SIZE)
  private Long shmSize;

  public static final String SERIALIZED_NAME_SHM_SIZE_SYSTEMD = "shm_size_systemd";
  @SerializedName(SERIALIZED_NAME_SHM_SIZE_SYSTEMD)
  private Long shmSizeSystemd;

  public static final String SERIALIZED_NAME_VOLUMES = "volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<@Valid NamedVolume> volumes = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOLUMES_FROM = "volumes_from";
  @SerializedName(SERIALIZED_NAME_VOLUMES_FROM)
  private List<String> volumesFrom = new ArrayList<>();

  public PodStorageConfig() {
  }

  public PodStorageConfig imageVolumes(List<@Valid ImageVolume> imageVolumes) {
    this.imageVolumes = imageVolumes;
    return this;
  }

  public PodStorageConfig addImageVolumesItem(ImageVolume imageVolumesItem) {
    if (this.imageVolumes == null) {
      this.imageVolumes = new ArrayList<>();
    }
    this.imageVolumes.add(imageVolumesItem);
    return this;
  }

  /**
   * Image volumes bind-mount a container-image mount into the pod&#39;s infra container. Optional.
   * @return imageVolumes
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid ImageVolume> getImageVolumes() {
    return imageVolumes;
  }

  public void setImageVolumes(List<@Valid ImageVolume> imageVolumes) {
    this.imageVolumes = imageVolumes;
  }


  public PodStorageConfig mounts(List<@Valid Mount> mounts) {
    this.mounts = mounts;
    return this;
  }

  public PodStorageConfig addMountsItem(Mount mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * Mounts are mounts that will be added to the pod. These will supersede Image Volumes and VolumesFrom volumes where there are conflicts. Optional.
   * @return mounts
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid Mount> getMounts() {
    return mounts;
  }

  public void setMounts(List<@Valid Mount> mounts) {
    this.mounts = mounts;
  }


  public PodStorageConfig overlayVolumes(List<@Valid OverlayVolume> overlayVolumes) {
    this.overlayVolumes = overlayVolumes;
    return this;
  }

  public PodStorageConfig addOverlayVolumesItem(OverlayVolume overlayVolumesItem) {
    if (this.overlayVolumes == null) {
      this.overlayVolumes = new ArrayList<>();
    }
    this.overlayVolumes.add(overlayVolumesItem);
    return this;
  }

  /**
   * Overlay volumes are named volumes that will be added to the pod. Optional.
   * @return overlayVolumes
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid OverlayVolume> getOverlayVolumes() {
    return overlayVolumes;
  }

  public void setOverlayVolumes(List<@Valid OverlayVolume> overlayVolumes) {
    this.overlayVolumes = overlayVolumes;
  }


  public PodStorageConfig shmSize(Long shmSize) {
    this.shmSize = shmSize;
    return this;
  }

  /**
   * ShmSize is the size of the tmpfs to mount in at /dev/shm, in bytes. Conflicts with ShmSize if IpcNS is not private. Optional.
   * @return shmSize
   */
  @jakarta.annotation.Nullable

  public Long getShmSize() {
    return shmSize;
  }

  public void setShmSize(Long shmSize) {
    this.shmSize = shmSize;
  }


  public PodStorageConfig shmSizeSystemd(Long shmSizeSystemd) {
    this.shmSizeSystemd = shmSizeSystemd;
    return this;
  }

  /**
   * ShmSizeSystemd is the size of systemd-specific tmpfs mounts specifically /run, /run/lock, /var/log/journal and /tmp. Optional
   * @return shmSizeSystemd
   */
  @jakarta.annotation.Nullable

  public Long getShmSizeSystemd() {
    return shmSizeSystemd;
  }

  public void setShmSizeSystemd(Long shmSizeSystemd) {
    this.shmSizeSystemd = shmSizeSystemd;
  }


  public PodStorageConfig volumes(List<@Valid NamedVolume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public PodStorageConfig addVolumesItem(NamedVolume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * Volumes are named volumes that will be added to the pod. These will supersede Image Volumes and VolumesFrom  volumes where there are conflicts. Optional.
   * @return volumes
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid NamedVolume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<@Valid NamedVolume> volumes) {
    this.volumes = volumes;
  }


  public PodStorageConfig volumesFrom(List<String> volumesFrom) {
    this.volumesFrom = volumesFrom;
    return this;
  }

  public PodStorageConfig addVolumesFromItem(String volumesFromItem) {
    if (this.volumesFrom == null) {
      this.volumesFrom = new ArrayList<>();
    }
    this.volumesFrom.add(volumesFromItem);
    return this;
  }

  /**
   * VolumesFrom is a set of containers whose volumes will be added to this pod. The name or ID of the container must be provided, and may optionally be followed by a : and then one or more comma-separated options. Valid options are &#39;ro&#39;, &#39;rw&#39;, and &#39;z&#39;. Options will be used for all volumes sourced from the container.
   * @return volumesFrom
   */
  @jakarta.annotation.Nullable

  public List<String> getVolumesFrom() {
    return volumesFrom;
  }

  public void setVolumesFrom(List<String> volumesFrom) {
    this.volumesFrom = volumesFrom;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PodStorageConfig podStorageConfig = (PodStorageConfig) o;
    return Objects.equals(this.imageVolumes, podStorageConfig.imageVolumes) &&
        Objects.equals(this.mounts, podStorageConfig.mounts) &&
        Objects.equals(this.overlayVolumes, podStorageConfig.overlayVolumes) &&
        Objects.equals(this.shmSize, podStorageConfig.shmSize) &&
        Objects.equals(this.shmSizeSystemd, podStorageConfig.shmSizeSystemd) &&
        Objects.equals(this.volumes, podStorageConfig.volumes) &&
        Objects.equals(this.volumesFrom, podStorageConfig.volumesFrom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(imageVolumes, mounts, overlayVolumes, shmSize, shmSizeSystemd, volumes, volumesFrom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PodStorageConfig {\n");
    sb.append("    imageVolumes: ").append(toIndentedString(imageVolumes)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    overlayVolumes: ").append(toIndentedString(overlayVolumes)).append("\n");
    sb.append("    shmSize: ").append(toIndentedString(shmSize)).append("\n");
    sb.append("    shmSizeSystemd: ").append(toIndentedString(shmSizeSystemd)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
    sb.append("    volumesFrom: ").append(toIndentedString(volumesFrom)).append("\n");
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
    openapiFields.add("image_volumes");
    openapiFields.add("mounts");
    openapiFields.add("overlay_volumes");
    openapiFields.add("shm_size");
    openapiFields.add("shm_size_systemd");
    openapiFields.add("volumes");
    openapiFields.add("volumes_from");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PodStorageConfig
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PodStorageConfig.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PodStorageConfig is not found in the empty JSON string", PodStorageConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PodStorageConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PodStorageConfig` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("image_volumes") != null && !jsonObj.get("image_volumes").isJsonNull()) {
        JsonArray jsonArrayimageVolumes = jsonObj.getAsJsonArray("image_volumes");
        if (jsonArrayimageVolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("image_volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `image_volumes` to be an array in the JSON string but got `%s`", jsonObj.get("image_volumes").toString()));
          }

          // validate the optional field `image_volumes` (array)
          for (int i = 0; i < jsonArrayimageVolumes.size(); i++) {
            ImageVolume.validateJsonElement(jsonArrayimageVolumes.get(i));
          };
        }
      }
      if (jsonObj.get("mounts") != null && !jsonObj.get("mounts").isJsonNull()) {
        JsonArray jsonArraymounts = jsonObj.getAsJsonArray("mounts");
        if (jsonArraymounts != null) {
          // ensure the json data is an array
          if (!jsonObj.get("mounts").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `mounts` to be an array in the JSON string but got `%s`", jsonObj.get("mounts").toString()));
          }

          // validate the optional field `mounts` (array)
          for (int i = 0; i < jsonArraymounts.size(); i++) {
            Mount.validateJsonElement(jsonArraymounts.get(i));
          };
        }
      }
      if (jsonObj.get("overlay_volumes") != null && !jsonObj.get("overlay_volumes").isJsonNull()) {
        JsonArray jsonArrayoverlayVolumes = jsonObj.getAsJsonArray("overlay_volumes");
        if (jsonArrayoverlayVolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("overlay_volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `overlay_volumes` to be an array in the JSON string but got `%s`", jsonObj.get("overlay_volumes").toString()));
          }

          // validate the optional field `overlay_volumes` (array)
          for (int i = 0; i < jsonArrayoverlayVolumes.size(); i++) {
            OverlayVolume.validateJsonElement(jsonArrayoverlayVolumes.get(i));
          };
        }
      }
      if (jsonObj.get("volumes") != null && !jsonObj.get("volumes").isJsonNull()) {
        JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("volumes");
        if (jsonArrayvolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `volumes` to be an array in the JSON string but got `%s`", jsonObj.get("volumes").toString()));
          }

          // validate the optional field `volumes` (array)
          for (int i = 0; i < jsonArrayvolumes.size(); i++) {
            NamedVolume.validateJsonElement(jsonArrayvolumes.get(i));
          };
        }
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("volumes_from") != null && !jsonObj.get("volumes_from").isJsonNull() && !jsonObj.get("volumes_from").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `volumes_from` to be an array in the JSON string but got `%s`", jsonObj.get("volumes_from").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PodStorageConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PodStorageConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PodStorageConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PodStorageConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<PodStorageConfig>() {
           @Override
           public void write(JsonWriter out, PodStorageConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PodStorageConfig read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PodStorageConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PodStorageConfig
   * @throws IOException if the JSON string is invalid with respect to PodStorageConfig
   */
  public static PodStorageConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PodStorageConfig.class);
  }

  /**
   * Convert an instance of PodStorageConfig to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


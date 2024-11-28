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

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.StringJoiner;
import java.util.Objects;
import java.util.Map;
import java.util.HashMap;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.github.alersrt.pod4j.openapi.model.ImageVolume;
import io.github.alersrt.pod4j.openapi.model.Mount;
import io.github.alersrt.pod4j.openapi.model.NamedVolume;
import io.github.alersrt.pod4j.openapi.model.OverlayVolume;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * PodStorageConfig
 */
@JsonPropertyOrder({
  PodStorageConfig.JSON_PROPERTY_IMAGE_VOLUMES,
  PodStorageConfig.JSON_PROPERTY_MOUNTS,
  PodStorageConfig.JSON_PROPERTY_OVERLAY_VOLUMES,
  PodStorageConfig.JSON_PROPERTY_SHM_SIZE,
  PodStorageConfig.JSON_PROPERTY_SHM_SIZE_SYSTEMD,
  PodStorageConfig.JSON_PROPERTY_VOLUMES,
  PodStorageConfig.JSON_PROPERTY_VOLUMES_FROM
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class PodStorageConfig {
  public static final String JSON_PROPERTY_IMAGE_VOLUMES = "image_volumes";
  private List<@Valid ImageVolume> imageVolumes = new ArrayList<>();

  public static final String JSON_PROPERTY_MOUNTS = "mounts";
  private List<@Valid Mount> mounts = new ArrayList<>();

  public static final String JSON_PROPERTY_OVERLAY_VOLUMES = "overlay_volumes";
  private List<@Valid OverlayVolume> overlayVolumes = new ArrayList<>();

  public static final String JSON_PROPERTY_SHM_SIZE = "shm_size";
  private Long shmSize;

  public static final String JSON_PROPERTY_SHM_SIZE_SYSTEMD = "shm_size_systemd";
  private Long shmSizeSystemd;

  public static final String JSON_PROPERTY_VOLUMES = "volumes";
  private List<@Valid NamedVolume> volumes = new ArrayList<>();

  public static final String JSON_PROPERTY_VOLUMES_FROM = "volumes_from";
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

  @JsonProperty(JSON_PROPERTY_IMAGE_VOLUMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid ImageVolume> getImageVolumes() {
    return imageVolumes;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_VOLUMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

  @JsonProperty(JSON_PROPERTY_MOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid Mount> getMounts() {
    return mounts;
  }


  @JsonProperty(JSON_PROPERTY_MOUNTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

  @JsonProperty(JSON_PROPERTY_OVERLAY_VOLUMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid OverlayVolume> getOverlayVolumes() {
    return overlayVolumes;
  }


  @JsonProperty(JSON_PROPERTY_OVERLAY_VOLUMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

  @JsonProperty(JSON_PROPERTY_SHM_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getShmSize() {
    return shmSize;
  }


  @JsonProperty(JSON_PROPERTY_SHM_SIZE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

  @JsonProperty(JSON_PROPERTY_SHM_SIZE_SYSTEMD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Long getShmSizeSystemd() {
    return shmSizeSystemd;
  }


  @JsonProperty(JSON_PROPERTY_SHM_SIZE_SYSTEMD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

  @JsonProperty(JSON_PROPERTY_VOLUMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid NamedVolume> getVolumes() {
    return volumes;
  }


  @JsonProperty(JSON_PROPERTY_VOLUMES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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

  @JsonProperty(JSON_PROPERTY_VOLUMES_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getVolumesFrom() {
    return volumesFrom;
  }


  @JsonProperty(JSON_PROPERTY_VOLUMES_FROM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumesFrom(List<String> volumesFrom) {
    this.volumesFrom = volumesFrom;
  }


  /**
   * Return true if this PodStorageConfig object is equal to o.
   */
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `image_volumes` to the URL query string
    if (getImageVolumes() != null) {
      for (int i = 0; i < getImageVolumes().size(); i++) {
        if (getImageVolumes().get(i) != null) {
          joiner.add(getImageVolumes().get(i).toUrlQueryString(String.format("%simage_volumes%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `mounts` to the URL query string
    if (getMounts() != null) {
      for (int i = 0; i < getMounts().size(); i++) {
        if (getMounts().get(i) != null) {
          joiner.add(getMounts().get(i).toUrlQueryString(String.format("%smounts%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `overlay_volumes` to the URL query string
    if (getOverlayVolumes() != null) {
      for (int i = 0; i < getOverlayVolumes().size(); i++) {
        if (getOverlayVolumes().get(i) != null) {
          joiner.add(getOverlayVolumes().get(i).toUrlQueryString(String.format("%soverlay_volumes%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `shm_size` to the URL query string
    if (getShmSize() != null) {
      joiner.add(String.format("%sshm_size%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getShmSize()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `shm_size_systemd` to the URL query string
    if (getShmSizeSystemd() != null) {
      joiner.add(String.format("%sshm_size_systemd%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getShmSizeSystemd()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `volumes` to the URL query string
    if (getVolumes() != null) {
      for (int i = 0; i < getVolumes().size(); i++) {
        if (getVolumes().get(i) != null) {
          joiner.add(getVolumes().get(i).toUrlQueryString(String.format("%svolumes%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `volumes_from` to the URL query string
    if (getVolumesFrom() != null) {
      for (int i = 0; i < getVolumesFrom().size(); i++) {
        joiner.add(String.format("%svolumes_from%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getVolumesFrom().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    return joiner.toString();
  }
}


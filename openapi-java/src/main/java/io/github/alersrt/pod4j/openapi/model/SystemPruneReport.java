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
import io.github.alersrt.pod4j.openapi.model.NetworkPruneReport;
import io.github.alersrt.pod4j.openapi.model.PodPruneReport;
import io.github.alersrt.pod4j.openapi.model.PruneReport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


import io.github.alersrt.pod4j.openapi.ApiClient;
/**
 * SystemPruneReport
 */
@JsonPropertyOrder({
  SystemPruneReport.JSON_PROPERTY_CONTAINER_PRUNE_REPORTS,
  SystemPruneReport.JSON_PROPERTY_IMAGE_PRUNE_REPORTS,
  SystemPruneReport.JSON_PROPERTY_NETWORK_PRUNE_REPORTS,
  SystemPruneReport.JSON_PROPERTY_POD_PRUNE_REPORT,
  SystemPruneReport.JSON_PROPERTY_RECLAIMED_SPACE,
  SystemPruneReport.JSON_PROPERTY_VOLUME_PRUNE_REPORTS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class SystemPruneReport {
  public static final String JSON_PROPERTY_CONTAINER_PRUNE_REPORTS = "ContainerPruneReports";
  private List<@Valid PruneReport> containerPruneReports = new ArrayList<>();

  public static final String JSON_PROPERTY_IMAGE_PRUNE_REPORTS = "ImagePruneReports";
  private List<@Valid PruneReport> imagePruneReports = new ArrayList<>();

  public static final String JSON_PROPERTY_NETWORK_PRUNE_REPORTS = "NetworkPruneReports";
  private List<@Valid NetworkPruneReport> networkPruneReports = new ArrayList<>();

  public static final String JSON_PROPERTY_POD_PRUNE_REPORT = "PodPruneReport";
  private List<@Valid PodPruneReport> podPruneReport = new ArrayList<>();

  public static final String JSON_PROPERTY_RECLAIMED_SPACE = "ReclaimedSpace";
  private Integer reclaimedSpace;

  public static final String JSON_PROPERTY_VOLUME_PRUNE_REPORTS = "VolumePruneReports";
  private List<@Valid PruneReport> volumePruneReports = new ArrayList<>();

  public SystemPruneReport() { 
  }

  public SystemPruneReport containerPruneReports(List<@Valid PruneReport> containerPruneReports) {
    this.containerPruneReports = containerPruneReports;
    return this;
  }

  public SystemPruneReport addContainerPruneReportsItem(PruneReport containerPruneReportsItem) {
    if (this.containerPruneReports == null) {
      this.containerPruneReports = new ArrayList<>();
    }
    this.containerPruneReports.add(containerPruneReportsItem);
    return this;
  }

  /**
   * Get containerPruneReports
   * @return containerPruneReports
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_CONTAINER_PRUNE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid PruneReport> getContainerPruneReports() {
    return containerPruneReports;
  }


  @JsonProperty(JSON_PROPERTY_CONTAINER_PRUNE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setContainerPruneReports(List<@Valid PruneReport> containerPruneReports) {
    this.containerPruneReports = containerPruneReports;
  }


  public SystemPruneReport imagePruneReports(List<@Valid PruneReport> imagePruneReports) {
    this.imagePruneReports = imagePruneReports;
    return this;
  }

  public SystemPruneReport addImagePruneReportsItem(PruneReport imagePruneReportsItem) {
    if (this.imagePruneReports == null) {
      this.imagePruneReports = new ArrayList<>();
    }
    this.imagePruneReports.add(imagePruneReportsItem);
    return this;
  }

  /**
   * Get imagePruneReports
   * @return imagePruneReports
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_IMAGE_PRUNE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid PruneReport> getImagePruneReports() {
    return imagePruneReports;
  }


  @JsonProperty(JSON_PROPERTY_IMAGE_PRUNE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setImagePruneReports(List<@Valid PruneReport> imagePruneReports) {
    this.imagePruneReports = imagePruneReports;
  }


  public SystemPruneReport networkPruneReports(List<@Valid NetworkPruneReport> networkPruneReports) {
    this.networkPruneReports = networkPruneReports;
    return this;
  }

  public SystemPruneReport addNetworkPruneReportsItem(NetworkPruneReport networkPruneReportsItem) {
    if (this.networkPruneReports == null) {
      this.networkPruneReports = new ArrayList<>();
    }
    this.networkPruneReports.add(networkPruneReportsItem);
    return this;
  }

  /**
   * Get networkPruneReports
   * @return networkPruneReports
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_NETWORK_PRUNE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid NetworkPruneReport> getNetworkPruneReports() {
    return networkPruneReports;
  }


  @JsonProperty(JSON_PROPERTY_NETWORK_PRUNE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNetworkPruneReports(List<@Valid NetworkPruneReport> networkPruneReports) {
    this.networkPruneReports = networkPruneReports;
  }


  public SystemPruneReport podPruneReport(List<@Valid PodPruneReport> podPruneReport) {
    this.podPruneReport = podPruneReport;
    return this;
  }

  public SystemPruneReport addPodPruneReportItem(PodPruneReport podPruneReportItem) {
    if (this.podPruneReport == null) {
      this.podPruneReport = new ArrayList<>();
    }
    this.podPruneReport.add(podPruneReportItem);
    return this;
  }

  /**
   * Get podPruneReport
   * @return podPruneReport
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_POD_PRUNE_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid PodPruneReport> getPodPruneReport() {
    return podPruneReport;
  }


  @JsonProperty(JSON_PROPERTY_POD_PRUNE_REPORT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPodPruneReport(List<@Valid PodPruneReport> podPruneReport) {
    this.podPruneReport = podPruneReport;
  }


  public SystemPruneReport reclaimedSpace(Integer reclaimedSpace) {
    this.reclaimedSpace = reclaimedSpace;
    return this;
  }

  /**
   * Get reclaimedSpace
   * @return reclaimedSpace
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_RECLAIMED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Integer getReclaimedSpace() {
    return reclaimedSpace;
  }


  @JsonProperty(JSON_PROPERTY_RECLAIMED_SPACE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReclaimedSpace(Integer reclaimedSpace) {
    this.reclaimedSpace = reclaimedSpace;
  }


  public SystemPruneReport volumePruneReports(List<@Valid PruneReport> volumePruneReports) {
    this.volumePruneReports = volumePruneReports;
    return this;
  }

  public SystemPruneReport addVolumePruneReportsItem(PruneReport volumePruneReportsItem) {
    if (this.volumePruneReports == null) {
      this.volumePruneReports = new ArrayList<>();
    }
    this.volumePruneReports.add(volumePruneReportsItem);
    return this;
  }

  /**
   * Get volumePruneReports
   * @return volumePruneReports
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_VOLUME_PRUNE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<@Valid PruneReport> getVolumePruneReports() {
    return volumePruneReports;
  }


  @JsonProperty(JSON_PROPERTY_VOLUME_PRUNE_REPORTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setVolumePruneReports(List<@Valid PruneReport> volumePruneReports) {
    this.volumePruneReports = volumePruneReports;
  }


  /**
   * Return true if this SystemPruneReport object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SystemPruneReport systemPruneReport = (SystemPruneReport) o;
    return Objects.equals(this.containerPruneReports, systemPruneReport.containerPruneReports) &&
        Objects.equals(this.imagePruneReports, systemPruneReport.imagePruneReports) &&
        Objects.equals(this.networkPruneReports, systemPruneReport.networkPruneReports) &&
        Objects.equals(this.podPruneReport, systemPruneReport.podPruneReport) &&
        Objects.equals(this.reclaimedSpace, systemPruneReport.reclaimedSpace) &&
        Objects.equals(this.volumePruneReports, systemPruneReport.volumePruneReports);
  }

  @Override
  public int hashCode() {
    return Objects.hash(containerPruneReports, imagePruneReports, networkPruneReports, podPruneReport, reclaimedSpace, volumePruneReports);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SystemPruneReport {\n");
    sb.append("    containerPruneReports: ").append(toIndentedString(containerPruneReports)).append("\n");
    sb.append("    imagePruneReports: ").append(toIndentedString(imagePruneReports)).append("\n");
    sb.append("    networkPruneReports: ").append(toIndentedString(networkPruneReports)).append("\n");
    sb.append("    podPruneReport: ").append(toIndentedString(podPruneReport)).append("\n");
    sb.append("    reclaimedSpace: ").append(toIndentedString(reclaimedSpace)).append("\n");
    sb.append("    volumePruneReports: ").append(toIndentedString(volumePruneReports)).append("\n");
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

    // add `ContainerPruneReports` to the URL query string
    if (getContainerPruneReports() != null) {
      for (int i = 0; i < getContainerPruneReports().size(); i++) {
        if (getContainerPruneReports().get(i) != null) {
          joiner.add(getContainerPruneReports().get(i).toUrlQueryString(String.format("%sContainerPruneReports%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `ImagePruneReports` to the URL query string
    if (getImagePruneReports() != null) {
      for (int i = 0; i < getImagePruneReports().size(); i++) {
        if (getImagePruneReports().get(i) != null) {
          joiner.add(getImagePruneReports().get(i).toUrlQueryString(String.format("%sImagePruneReports%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `NetworkPruneReports` to the URL query string
    if (getNetworkPruneReports() != null) {
      for (int i = 0; i < getNetworkPruneReports().size(); i++) {
        if (getNetworkPruneReports().get(i) != null) {
          joiner.add(getNetworkPruneReports().get(i).toUrlQueryString(String.format("%sNetworkPruneReports%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `PodPruneReport` to the URL query string
    if (getPodPruneReport() != null) {
      for (int i = 0; i < getPodPruneReport().size(); i++) {
        if (getPodPruneReport().get(i) != null) {
          joiner.add(getPodPruneReport().get(i).toUrlQueryString(String.format("%sPodPruneReport%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    // add `ReclaimedSpace` to the URL query string
    if (getReclaimedSpace() != null) {
      joiner.add(String.format("%sReclaimedSpace%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReclaimedSpace()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `VolumePruneReports` to the URL query string
    if (getVolumePruneReports() != null) {
      for (int i = 0; i < getVolumePruneReports().size(); i++) {
        if (getVolumePruneReports().get(i) != null) {
          joiner.add(getVolumePruneReports().get(i).toUrlQueryString(String.format("%sVolumePruneReports%s%s", prefix, suffix,
          "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix))));
        }
      }
    }

    return joiner.toString();
  }
}


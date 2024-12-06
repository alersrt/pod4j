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
import io.github.alersrt.pod4j.openapi.model.NetworkPruneReport;
import io.github.alersrt.pod4j.openapi.model.PodPruneReport;
import io.github.alersrt.pod4j.openapi.model.PruneReport;
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
 * SystemPruneReport
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-06T22:01:10.352312929+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class SystemPruneReport implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CONTAINER_PRUNE_REPORTS = "ContainerPruneReports";
  @SerializedName(SERIALIZED_NAME_CONTAINER_PRUNE_REPORTS)
  private List<@Valid PruneReport> containerPruneReports = new ArrayList<>();

  public static final String SERIALIZED_NAME_IMAGE_PRUNE_REPORTS = "ImagePruneReports";
  @SerializedName(SERIALIZED_NAME_IMAGE_PRUNE_REPORTS)
  private List<@Valid PruneReport> imagePruneReports = new ArrayList<>();

  public static final String SERIALIZED_NAME_NETWORK_PRUNE_REPORTS = "NetworkPruneReports";
  @SerializedName(SERIALIZED_NAME_NETWORK_PRUNE_REPORTS)
  private List<@Valid NetworkPruneReport> networkPruneReports = new ArrayList<>();

  public static final String SERIALIZED_NAME_POD_PRUNE_REPORT = "PodPruneReport";
  @SerializedName(SERIALIZED_NAME_POD_PRUNE_REPORT)
  private List<@Valid PodPruneReport> podPruneReport = new ArrayList<>();

  public static final String SERIALIZED_NAME_RECLAIMED_SPACE = "ReclaimedSpace";
  @SerializedName(SERIALIZED_NAME_RECLAIMED_SPACE)
  private Integer reclaimedSpace;

  public static final String SERIALIZED_NAME_VOLUME_PRUNE_REPORTS = "VolumePruneReports";
  @SerializedName(SERIALIZED_NAME_VOLUME_PRUNE_REPORTS)
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

  public List<@Valid PruneReport> getContainerPruneReports() {
    return containerPruneReports;
  }

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

  public List<@Valid PruneReport> getImagePruneReports() {
    return imagePruneReports;
  }

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

  public List<@Valid NetworkPruneReport> getNetworkPruneReports() {
    return networkPruneReports;
  }

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

  public List<@Valid PodPruneReport> getPodPruneReport() {
    return podPruneReport;
  }

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

  public Integer getReclaimedSpace() {
    return reclaimedSpace;
  }

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

  public List<@Valid PruneReport> getVolumePruneReports() {
    return volumePruneReports;
  }

  public void setVolumePruneReports(List<@Valid PruneReport> volumePruneReports) {
    this.volumePruneReports = volumePruneReports;
  }



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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("ContainerPruneReports");
    openapiFields.add("ImagePruneReports");
    openapiFields.add("NetworkPruneReports");
    openapiFields.add("PodPruneReport");
    openapiFields.add("ReclaimedSpace");
    openapiFields.add("VolumePruneReports");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to SystemPruneReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!SystemPruneReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in SystemPruneReport is not found in the empty JSON string", SystemPruneReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!SystemPruneReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `SystemPruneReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("ContainerPruneReports") != null && !jsonObj.get("ContainerPruneReports").isJsonNull()) {
        JsonArray jsonArraycontainerPruneReports = jsonObj.getAsJsonArray("ContainerPruneReports");
        if (jsonArraycontainerPruneReports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ContainerPruneReports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ContainerPruneReports` to be an array in the JSON string but got `%s`", jsonObj.get("ContainerPruneReports").toString()));
          }

          // validate the optional field `ContainerPruneReports` (array)
          for (int i = 0; i < jsonArraycontainerPruneReports.size(); i++) {
            PruneReport.validateJsonElement(jsonArraycontainerPruneReports.get(i));
          };
        }
      }
      if (jsonObj.get("ImagePruneReports") != null && !jsonObj.get("ImagePruneReports").isJsonNull()) {
        JsonArray jsonArrayimagePruneReports = jsonObj.getAsJsonArray("ImagePruneReports");
        if (jsonArrayimagePruneReports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("ImagePruneReports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `ImagePruneReports` to be an array in the JSON string but got `%s`", jsonObj.get("ImagePruneReports").toString()));
          }

          // validate the optional field `ImagePruneReports` (array)
          for (int i = 0; i < jsonArrayimagePruneReports.size(); i++) {
            PruneReport.validateJsonElement(jsonArrayimagePruneReports.get(i));
          };
        }
      }
      if (jsonObj.get("NetworkPruneReports") != null && !jsonObj.get("NetworkPruneReports").isJsonNull()) {
        JsonArray jsonArraynetworkPruneReports = jsonObj.getAsJsonArray("NetworkPruneReports");
        if (jsonArraynetworkPruneReports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("NetworkPruneReports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `NetworkPruneReports` to be an array in the JSON string but got `%s`", jsonObj.get("NetworkPruneReports").toString()));
          }

          // validate the optional field `NetworkPruneReports` (array)
          for (int i = 0; i < jsonArraynetworkPruneReports.size(); i++) {
            NetworkPruneReport.validateJsonElement(jsonArraynetworkPruneReports.get(i));
          };
        }
      }
      if (jsonObj.get("PodPruneReport") != null && !jsonObj.get("PodPruneReport").isJsonNull()) {
        JsonArray jsonArraypodPruneReport = jsonObj.getAsJsonArray("PodPruneReport");
        if (jsonArraypodPruneReport != null) {
          // ensure the json data is an array
          if (!jsonObj.get("PodPruneReport").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `PodPruneReport` to be an array in the JSON string but got `%s`", jsonObj.get("PodPruneReport").toString()));
          }

          // validate the optional field `PodPruneReport` (array)
          for (int i = 0; i < jsonArraypodPruneReport.size(); i++) {
            PodPruneReport.validateJsonElement(jsonArraypodPruneReport.get(i));
          };
        }
      }
      if (jsonObj.get("VolumePruneReports") != null && !jsonObj.get("VolumePruneReports").isJsonNull()) {
        JsonArray jsonArrayvolumePruneReports = jsonObj.getAsJsonArray("VolumePruneReports");
        if (jsonArrayvolumePruneReports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("VolumePruneReports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `VolumePruneReports` to be an array in the JSON string but got `%s`", jsonObj.get("VolumePruneReports").toString()));
          }

          // validate the optional field `VolumePruneReports` (array)
          for (int i = 0; i < jsonArrayvolumePruneReports.size(); i++) {
            PruneReport.validateJsonElement(jsonArrayvolumePruneReports.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!SystemPruneReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'SystemPruneReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<SystemPruneReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(SystemPruneReport.class));

       return (TypeAdapter<T>) new TypeAdapter<SystemPruneReport>() {
           @Override
           public void write(JsonWriter out, SystemPruneReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public SystemPruneReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of SystemPruneReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of SystemPruneReport
   * @throws IOException if the JSON string is invalid with respect to SystemPruneReport
   */
  public static SystemPruneReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, SystemPruneReport.class);
  }

  /**
   * Convert an instance of SystemPruneReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


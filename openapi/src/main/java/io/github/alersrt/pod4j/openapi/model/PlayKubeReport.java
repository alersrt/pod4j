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
import io.github.alersrt.pod4j.openapi.model.PlayKubePod;
import io.github.alersrt.pod4j.openapi.model.PlayKubeVolume;
import io.github.alersrt.pod4j.openapi.model.PlaySecret;
import io.github.alersrt.pod4j.openapi.model.PodRmReport;
import io.github.alersrt.pod4j.openapi.model.PodStopReport;
import io.github.alersrt.pod4j.openapi.model.SecretRmReport;
import io.github.alersrt.pod4j.openapi.model.VolumeRmReport;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * PlayKubeReport
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T19:32:04.765618819+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class PlayKubeReport {
  public static final String SERIALIZED_NAME_EXIT_CODE = "ExitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private Integer exitCode;

  public static final String SERIALIZED_NAME_PODS = "Pods";
  @SerializedName(SERIALIZED_NAME_PODS)
  private List<PlayKubePod> pods = new ArrayList<>();

  public static final String SERIALIZED_NAME_RM_REPORT = "RmReport";
  @SerializedName(SERIALIZED_NAME_RM_REPORT)
  private List<PodRmReport> rmReport = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECRET_RM_REPORT = "SecretRmReport";
  @SerializedName(SERIALIZED_NAME_SECRET_RM_REPORT)
  private List<SecretRmReport> secretRmReport = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECRETS = "Secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<PlaySecret> secrets = new ArrayList<>();

  public static final String SERIALIZED_NAME_SERVICE_CONTAINER_I_D = "ServiceContainerID";
  @SerializedName(SERIALIZED_NAME_SERVICE_CONTAINER_I_D)
  private String serviceContainerID;

  public static final String SERIALIZED_NAME_STOP_REPORT = "StopReport";
  @SerializedName(SERIALIZED_NAME_STOP_REPORT)
  private List<PodStopReport> stopReport = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOLUME_RM_REPORT = "VolumeRmReport";
  @SerializedName(SERIALIZED_NAME_VOLUME_RM_REPORT)
  private List<VolumeRmReport> volumeRmReport = new ArrayList<>();

  public static final String SERIALIZED_NAME_VOLUMES = "Volumes";
  @SerializedName(SERIALIZED_NAME_VOLUMES)
  private List<PlayKubeVolume> volumes = new ArrayList<>();

  public PlayKubeReport() {
  }

  public PlayKubeReport exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * If set, exit with the specified exit code.
   * @return exitCode
   */
  @javax.annotation.Nullable
  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }


  public PlayKubeReport pods(List<PlayKubePod> pods) {
    this.pods = pods;
    return this;
  }

  public PlayKubeReport addPodsItem(PlayKubePod podsItem) {
    if (this.pods == null) {
      this.pods = new ArrayList<>();
    }
    this.pods.add(podsItem);
    return this;
  }

  /**
   * Pods - pods created by play kube.
   * @return pods
   */
  @javax.annotation.Nullable
  public List<PlayKubePod> getPods() {
    return pods;
  }

  public void setPods(List<PlayKubePod> pods) {
    this.pods = pods;
  }


  public PlayKubeReport rmReport(List<PodRmReport> rmReport) {
    this.rmReport = rmReport;
    return this;
  }

  public PlayKubeReport addRmReportItem(PodRmReport rmReportItem) {
    if (this.rmReport == null) {
      this.rmReport = new ArrayList<>();
    }
    this.rmReport.add(rmReportItem);
    return this;
  }

  /**
   * Get rmReport
   * @return rmReport
   */
  @javax.annotation.Nullable
  public List<PodRmReport> getRmReport() {
    return rmReport;
  }

  public void setRmReport(List<PodRmReport> rmReport) {
    this.rmReport = rmReport;
  }


  public PlayKubeReport secretRmReport(List<SecretRmReport> secretRmReport) {
    this.secretRmReport = secretRmReport;
    return this;
  }

  public PlayKubeReport addSecretRmReportItem(SecretRmReport secretRmReportItem) {
    if (this.secretRmReport == null) {
      this.secretRmReport = new ArrayList<>();
    }
    this.secretRmReport.add(secretRmReportItem);
    return this;
  }

  /**
   * Get secretRmReport
   * @return secretRmReport
   */
  @javax.annotation.Nullable
  public List<SecretRmReport> getSecretRmReport() {
    return secretRmReport;
  }

  public void setSecretRmReport(List<SecretRmReport> secretRmReport) {
    this.secretRmReport = secretRmReport;
  }


  public PlayKubeReport secrets(List<PlaySecret> secrets) {
    this.secrets = secrets;
    return this;
  }

  public PlayKubeReport addSecretsItem(PlaySecret secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

  /**
   * Secrets - secrets created by play kube
   * @return secrets
   */
  @javax.annotation.Nullable
  public List<PlaySecret> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<PlaySecret> secrets) {
    this.secrets = secrets;
  }


  public PlayKubeReport serviceContainerID(String serviceContainerID) {
    this.serviceContainerID = serviceContainerID;
    return this;
  }

  /**
   * ServiceContainerID - ID of the service container if one is created
   * @return serviceContainerID
   */
  @javax.annotation.Nullable
  public String getServiceContainerID() {
    return serviceContainerID;
  }

  public void setServiceContainerID(String serviceContainerID) {
    this.serviceContainerID = serviceContainerID;
  }


  public PlayKubeReport stopReport(List<PodStopReport> stopReport) {
    this.stopReport = stopReport;
    return this;
  }

  public PlayKubeReport addStopReportItem(PodStopReport stopReportItem) {
    if (this.stopReport == null) {
      this.stopReport = new ArrayList<>();
    }
    this.stopReport.add(stopReportItem);
    return this;
  }

  /**
   * Get stopReport
   * @return stopReport
   */
  @javax.annotation.Nullable
  public List<PodStopReport> getStopReport() {
    return stopReport;
  }

  public void setStopReport(List<PodStopReport> stopReport) {
    this.stopReport = stopReport;
  }


  public PlayKubeReport volumeRmReport(List<VolumeRmReport> volumeRmReport) {
    this.volumeRmReport = volumeRmReport;
    return this;
  }

  public PlayKubeReport addVolumeRmReportItem(VolumeRmReport volumeRmReportItem) {
    if (this.volumeRmReport == null) {
      this.volumeRmReport = new ArrayList<>();
    }
    this.volumeRmReport.add(volumeRmReportItem);
    return this;
  }

  /**
   * Get volumeRmReport
   * @return volumeRmReport
   */
  @javax.annotation.Nullable
  public List<VolumeRmReport> getVolumeRmReport() {
    return volumeRmReport;
  }

  public void setVolumeRmReport(List<VolumeRmReport> volumeRmReport) {
    this.volumeRmReport = volumeRmReport;
  }


  public PlayKubeReport volumes(List<PlayKubeVolume> volumes) {
    this.volumes = volumes;
    return this;
  }

  public PlayKubeReport addVolumesItem(PlayKubeVolume volumesItem) {
    if (this.volumes == null) {
      this.volumes = new ArrayList<>();
    }
    this.volumes.add(volumesItem);
    return this;
  }

  /**
   * Volumes - volumes created by play kube.
   * @return volumes
   */
  @javax.annotation.Nullable
  public List<PlayKubeVolume> getVolumes() {
    return volumes;
  }

  public void setVolumes(List<PlayKubeVolume> volumes) {
    this.volumes = volumes;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PlayKubeReport playKubeReport = (PlayKubeReport) o;
    return Objects.equals(this.exitCode, playKubeReport.exitCode) &&
        Objects.equals(this.pods, playKubeReport.pods) &&
        Objects.equals(this.rmReport, playKubeReport.rmReport) &&
        Objects.equals(this.secretRmReport, playKubeReport.secretRmReport) &&
        Objects.equals(this.secrets, playKubeReport.secrets) &&
        Objects.equals(this.serviceContainerID, playKubeReport.serviceContainerID) &&
        Objects.equals(this.stopReport, playKubeReport.stopReport) &&
        Objects.equals(this.volumeRmReport, playKubeReport.volumeRmReport) &&
        Objects.equals(this.volumes, playKubeReport.volumes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(exitCode, pods, rmReport, secretRmReport, secrets, serviceContainerID, stopReport, volumeRmReport, volumes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayKubeReport {\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    rmReport: ").append(toIndentedString(rmReport)).append("\n");
    sb.append("    secretRmReport: ").append(toIndentedString(secretRmReport)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
    sb.append("    serviceContainerID: ").append(toIndentedString(serviceContainerID)).append("\n");
    sb.append("    stopReport: ").append(toIndentedString(stopReport)).append("\n");
    sb.append("    volumeRmReport: ").append(toIndentedString(volumeRmReport)).append("\n");
    sb.append("    volumes: ").append(toIndentedString(volumes)).append("\n");
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
    openapiFields.add("ExitCode");
    openapiFields.add("Pods");
    openapiFields.add("RmReport");
    openapiFields.add("SecretRmReport");
    openapiFields.add("Secrets");
    openapiFields.add("ServiceContainerID");
    openapiFields.add("StopReport");
    openapiFields.add("VolumeRmReport");
    openapiFields.add("Volumes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to PlayKubeReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlayKubeReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayKubeReport is not found in the empty JSON string", PlayKubeReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!PlayKubeReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PlayKubeReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("Pods") != null && !jsonObj.get("Pods").isJsonNull()) {
        JsonArray jsonArraypods = jsonObj.getAsJsonArray("Pods");
        if (jsonArraypods != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Pods").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Pods` to be an array in the JSON string but got `%s`", jsonObj.get("Pods").toString()));
          }

          // validate the optional field `Pods` (array)
          for (int i = 0; i < jsonArraypods.size(); i++) {
            PlayKubePod.validateJsonElement(jsonArraypods.get(i));
          };
        }
      }
      if (jsonObj.get("RmReport") != null && !jsonObj.get("RmReport").isJsonNull()) {
        JsonArray jsonArrayrmReport = jsonObj.getAsJsonArray("RmReport");
        if (jsonArrayrmReport != null) {
          // ensure the json data is an array
          if (!jsonObj.get("RmReport").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `RmReport` to be an array in the JSON string but got `%s`", jsonObj.get("RmReport").toString()));
          }

          // validate the optional field `RmReport` (array)
          for (int i = 0; i < jsonArrayrmReport.size(); i++) {
            PodRmReport.validateJsonElement(jsonArrayrmReport.get(i));
          };
        }
      }
      if (jsonObj.get("SecretRmReport") != null && !jsonObj.get("SecretRmReport").isJsonNull()) {
        JsonArray jsonArraysecretRmReport = jsonObj.getAsJsonArray("SecretRmReport");
        if (jsonArraysecretRmReport != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SecretRmReport").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SecretRmReport` to be an array in the JSON string but got `%s`", jsonObj.get("SecretRmReport").toString()));
          }

          // validate the optional field `SecretRmReport` (array)
          for (int i = 0; i < jsonArraysecretRmReport.size(); i++) {
            SecretRmReport.validateJsonElement(jsonArraysecretRmReport.get(i));
          };
        }
      }
      if (jsonObj.get("Secrets") != null && !jsonObj.get("Secrets").isJsonNull()) {
        JsonArray jsonArraysecrets = jsonObj.getAsJsonArray("Secrets");
        if (jsonArraysecrets != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Secrets").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Secrets` to be an array in the JSON string but got `%s`", jsonObj.get("Secrets").toString()));
          }

          // validate the optional field `Secrets` (array)
          for (int i = 0; i < jsonArraysecrets.size(); i++) {
            PlaySecret.validateJsonElement(jsonArraysecrets.get(i));
          };
        }
      }
      if ((jsonObj.get("ServiceContainerID") != null && !jsonObj.get("ServiceContainerID").isJsonNull()) && !jsonObj.get("ServiceContainerID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ServiceContainerID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ServiceContainerID").toString()));
      }
      if (jsonObj.get("StopReport") != null && !jsonObj.get("StopReport").isJsonNull()) {
        JsonArray jsonArraystopReport = jsonObj.getAsJsonArray("StopReport");
        if (jsonArraystopReport != null) {
          // ensure the json data is an array
          if (!jsonObj.get("StopReport").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `StopReport` to be an array in the JSON string but got `%s`", jsonObj.get("StopReport").toString()));
          }

          // validate the optional field `StopReport` (array)
          for (int i = 0; i < jsonArraystopReport.size(); i++) {
            PodStopReport.validateJsonElement(jsonArraystopReport.get(i));
          };
        }
      }
      if (jsonObj.get("VolumeRmReport") != null && !jsonObj.get("VolumeRmReport").isJsonNull()) {
        JsonArray jsonArrayvolumeRmReport = jsonObj.getAsJsonArray("VolumeRmReport");
        if (jsonArrayvolumeRmReport != null) {
          // ensure the json data is an array
          if (!jsonObj.get("VolumeRmReport").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `VolumeRmReport` to be an array in the JSON string but got `%s`", jsonObj.get("VolumeRmReport").toString()));
          }

          // validate the optional field `VolumeRmReport` (array)
          for (int i = 0; i < jsonArrayvolumeRmReport.size(); i++) {
            VolumeRmReport.validateJsonElement(jsonArrayvolumeRmReport.get(i));
          };
        }
      }
      if (jsonObj.get("Volumes") != null && !jsonObj.get("Volumes").isJsonNull()) {
        JsonArray jsonArrayvolumes = jsonObj.getAsJsonArray("Volumes");
        if (jsonArrayvolumes != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Volumes").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Volumes` to be an array in the JSON string but got `%s`", jsonObj.get("Volumes").toString()));
          }

          // validate the optional field `Volumes` (array)
          for (int i = 0; i < jsonArrayvolumes.size(); i++) {
            PlayKubeVolume.validateJsonElement(jsonArrayvolumes.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayKubeReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayKubeReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayKubeReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayKubeReport.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayKubeReport>() {
           @Override
           public void write(JsonWriter out, PlayKubeReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PlayKubeReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PlayKubeReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PlayKubeReport
   * @throws IOException if the JSON string is invalid with respect to PlayKubeReport
   */
  public static PlayKubeReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayKubeReport.class);
  }

  /**
   * Convert an instance of PlayKubeReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

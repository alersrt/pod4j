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
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.model.ClusterVolumeSpec;
import io.github.alersrt.pod4j.openapi.model.Info;
import io.github.alersrt.pod4j.openapi.model.PublishStatus;
import io.github.alersrt.pod4j.openapi.model.Version;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import javax.validation.constraints.*;
import javax.validation.Valid;

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

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.alersrt.pod4j.openapi.JSON;

/**
 * ClusterVolume contains options and information specific to, and only present on, Swarm CSI cluster volumes.
 */
@ApiModel(description = "ClusterVolume contains options and information specific to, and only present on, Swarm CSI cluster volumes.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ClusterVolume implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_INFO = "Info";
  @SerializedName(SERIALIZED_NAME_INFO)
  private Info info;

  public static final String SERIALIZED_NAME_PUBLISH_STATUS = "PublishStatus";
  @SerializedName(SERIALIZED_NAME_PUBLISH_STATUS)
  private List<PublishStatus> publishStatus = null;

  public static final String SERIALIZED_NAME_SPEC = "Spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private ClusterVolumeSpec spec;

  public static final String SERIALIZED_NAME_UPDATED_AT = "UpdatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;

  public static final String SERIALIZED_NAME_VERSION = "Version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private Version version;

  public ClusterVolume() {
  }

  public ClusterVolume createdAt(OffsetDateTime createdAt) {

      this.createdAt = createdAt;
    return this;
  }

    /**
   * Get createdAt
   * @return createdAt
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public ClusterVolume ID(String ID) {

      this.ID = ID;
    return this;
  }

    /**
   * ID is the Swarm ID of the volume. Because cluster volumes are Swarm objects, they have an ID, unlike non-cluster volumes, which only have a Name. This ID can be used to refer to the cluster volume.
   * @return ID
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "ID is the Swarm ID of the volume. Because cluster volumes are Swarm objects, they have an ID, unlike non-cluster volumes, which only have a Name. This ID can be used to refer to the cluster volume.")

  public String getID() {
    return ID;
  }


  public void setID(String ID) {
    this.ID = ID;
  }


  public ClusterVolume info(Info info) {

      this.info = info;
    return this;
  }

    /**
   * Get info
   * @return info
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public Info getInfo() {
    return info;
  }


  public void setInfo(Info info) {
    this.info = info;
  }


    public ClusterVolume publishStatus(List<PublishStatus> publishStatus) {
    
    this.publishStatus = publishStatus;
    return this;
  }

  public ClusterVolume addPublishStatusItem(PublishStatus publishStatusItem) {
    if (this.publishStatus == null) {
      this.publishStatus = new ArrayList<>();
    }
    this.publishStatus.add(publishStatusItem);
    return this;
  }

    /**
   * PublishStatus contains the status of the volume as it pertains to its publishing on Nodes.
   * @return publishStatus
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "PublishStatus contains the status of the volume as it pertains to its publishing on Nodes.")

    public List<PublishStatus> getPublishStatus() {
    return publishStatus;
  }


    public void setPublishStatus(List<PublishStatus> publishStatus) {
    this.publishStatus = publishStatus;
  }


  public ClusterVolume spec(ClusterVolumeSpec spec) {

      this.spec = spec;
    return this;
  }

    /**
   * Get spec
   * @return spec
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public ClusterVolumeSpec getSpec() {
    return spec;
  }


  public void setSpec(ClusterVolumeSpec spec) {
    this.spec = spec;
  }


  public ClusterVolume updatedAt(OffsetDateTime updatedAt) {

      this.updatedAt = updatedAt;
    return this;
  }

    /**
   * Get updatedAt
   * @return updatedAt
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  public ClusterVolume version(Version version) {

      this.version = version;
    return this;
  }

    /**
   * Get version
   * @return version
     **/
    @javax.annotation.Nullable
  @Valid
    @ApiModelProperty(value = "")

  public Version getVersion() {
    return version;
  }


  public void setVersion(Version version) {
    this.version = version;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVolume clusterVolume = (ClusterVolume) o;
    return Objects.equals(this.createdAt, clusterVolume.createdAt) &&
        Objects.equals(this.ID, clusterVolume.ID) &&
        Objects.equals(this.info, clusterVolume.info) &&
        Objects.equals(this.publishStatus, clusterVolume.publishStatus) &&
        Objects.equals(this.spec, clusterVolume.spec) &&
        Objects.equals(this.updatedAt, clusterVolume.updatedAt) &&
        Objects.equals(this.version, clusterVolume.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createdAt, ID, info, publishStatus, spec, updatedAt, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVolume {\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    info: ").append(toIndentedString(info)).append("\n");
    sb.append("    publishStatus: ").append(toIndentedString(publishStatus)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
    openapiFields.add("CreatedAt");
    openapiFields.add("ID");
    openapiFields.add("Info");
    openapiFields.add("PublishStatus");
    openapiFields.add("Spec");
    openapiFields.add("UpdatedAt");
    openapiFields.add("Version");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ClusterVolume
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (ClusterVolume.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClusterVolume is not found in the empty JSON string", ClusterVolume.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!ClusterVolume.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClusterVolume` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("ID") != null && !jsonObj.get("ID").isJsonNull()) && !jsonObj.get("ID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ID").toString()));
      }
      // validate the optional field `Info`
      if (jsonObj.get("Info") != null && !jsonObj.get("Info").isJsonNull()) {
          Info.validateJsonObject(jsonObj.getAsJsonObject("Info"));
      }
      if (jsonObj.get("PublishStatus") != null && !jsonObj.get("PublishStatus").isJsonNull()) {
        JsonArray jsonArraypublishStatus = jsonObj.getAsJsonArray("PublishStatus");
        if (jsonArraypublishStatus != null) {
          // ensure the json data is an array
          if (!jsonObj.get("PublishStatus").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `PublishStatus` to be an array in the JSON string but got `%s`", jsonObj.get("PublishStatus").toString()));
          }

          // validate the optional field `PublishStatus` (array)
          for (int i = 0; i < jsonArraypublishStatus.size(); i++) {
              PublishStatus.validateJsonObject(jsonArraypublishStatus.get(i).getAsJsonObject());
          };
        }
      }
      // validate the optional field `Spec`
      if (jsonObj.get("Spec") != null && !jsonObj.get("Spec").isJsonNull()) {
          ClusterVolumeSpec.validateJsonObject(jsonObj.getAsJsonObject("Spec"));
      }
      // validate the optional field `Version`
      if (jsonObj.get("Version") != null && !jsonObj.get("Version").isJsonNull()) {
          Version.validateJsonObject(jsonObj.getAsJsonObject("Version"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClusterVolume.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClusterVolume' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClusterVolume> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClusterVolume.class));

       return (TypeAdapter<T>) new TypeAdapter<ClusterVolume>() {
           @Override
           public void write(JsonWriter out, ClusterVolume value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClusterVolume read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of ClusterVolume given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ClusterVolume
     * @throws IOException if the JSON string is invalid with respect to ClusterVolume
  */
  public static ClusterVolume fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClusterVolume.class);
  }

    /**
     * Convert an instance of ClusterVolume to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


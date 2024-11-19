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
import io.github.alersrt.pod4j.openapi.model.Topology;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
 * Info contains information about the Volume as a whole as provided by the CSI storage plugin.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-19T11:19:05.435500352+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class Info {
  public static final String SERIALIZED_NAME_ACCESSIBLE_TOPOLOGY = "AccessibleTopology";
  @SerializedName(SERIALIZED_NAME_ACCESSIBLE_TOPOLOGY)
  private List<Topology> accessibleTopology = new ArrayList<>();

  public static final String SERIALIZED_NAME_CAPACITY_BYTES = "CapacityBytes";
  @SerializedName(SERIALIZED_NAME_CAPACITY_BYTES)
  private Long capacityBytes;

  public static final String SERIALIZED_NAME_VOLUME_CONTEXT = "VolumeContext";
  @SerializedName(SERIALIZED_NAME_VOLUME_CONTEXT)
  private Map<String, String> volumeContext = new HashMap<>();

  public static final String SERIALIZED_NAME_VOLUME_I_D = "VolumeID";
  @SerializedName(SERIALIZED_NAME_VOLUME_I_D)
  private String volumeID;

  public Info() {
  }

  public Info accessibleTopology(List<Topology> accessibleTopology) {
    this.accessibleTopology = accessibleTopology;
    return this;
  }

  public Info addAccessibleTopologyItem(Topology accessibleTopologyItem) {
    if (this.accessibleTopology == null) {
      this.accessibleTopology = new ArrayList<>();
    }
    this.accessibleTopology.add(accessibleTopologyItem);
    return this;
  }

  /**
   * AccessibleTopology is the topology this volume is actually accessible from.
   * @return accessibleTopology
   */
  @javax.annotation.Nullable
  public List<Topology> getAccessibleTopology() {
    return accessibleTopology;
  }

  public void setAccessibleTopology(List<Topology> accessibleTopology) {
    this.accessibleTopology = accessibleTopology;
  }


  public Info capacityBytes(Long capacityBytes) {
    this.capacityBytes = capacityBytes;
    return this;
  }

  /**
   * CapacityBytes is the capacity of the volume in bytes. A value of 0 indicates that the capacity is unknown.
   * @return capacityBytes
   */
  @javax.annotation.Nullable
  public Long getCapacityBytes() {
    return capacityBytes;
  }

  public void setCapacityBytes(Long capacityBytes) {
    this.capacityBytes = capacityBytes;
  }


  public Info volumeContext(Map<String, String> volumeContext) {
    this.volumeContext = volumeContext;
    return this;
  }

  public Info putVolumeContextItem(String key, String volumeContextItem) {
    if (this.volumeContext == null) {
      this.volumeContext = new HashMap<>();
    }
    this.volumeContext.put(key, volumeContextItem);
    return this;
  }

  /**
   * VolumeContext is the context originating from the CSI storage plugin when the Volume is created.
   * @return volumeContext
   */
  @javax.annotation.Nullable
  public Map<String, String> getVolumeContext() {
    return volumeContext;
  }

  public void setVolumeContext(Map<String, String> volumeContext) {
    this.volumeContext = volumeContext;
  }


  public Info volumeID(String volumeID) {
    this.volumeID = volumeID;
    return this;
  }

  /**
   * VolumeID is the ID of the Volume as seen by the CSI storage plugin. This is distinct from the Volume&#39;s Swarm ID, which is the ID used by all of the Docker Engine to refer to the Volume. If this field is blank, then the Volume has not been successfully created yet.
   * @return volumeID
   */
  @javax.annotation.Nullable
  public String getVolumeID() {
    return volumeID;
  }

  public void setVolumeID(String volumeID) {
    this.volumeID = volumeID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Info info = (Info) o;
    return Objects.equals(this.accessibleTopology, info.accessibleTopology) &&
        Objects.equals(this.capacityBytes, info.capacityBytes) &&
        Objects.equals(this.volumeContext, info.volumeContext) &&
        Objects.equals(this.volumeID, info.volumeID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessibleTopology, capacityBytes, volumeContext, volumeID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Info {\n");
    sb.append("    accessibleTopology: ").append(toIndentedString(accessibleTopology)).append("\n");
    sb.append("    capacityBytes: ").append(toIndentedString(capacityBytes)).append("\n");
    sb.append("    volumeContext: ").append(toIndentedString(volumeContext)).append("\n");
    sb.append("    volumeID: ").append(toIndentedString(volumeID)).append("\n");
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
    openapiFields.add("AccessibleTopology");
    openapiFields.add("CapacityBytes");
    openapiFields.add("VolumeContext");
    openapiFields.add("VolumeID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to Info
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!Info.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in Info is not found in the empty JSON string", Info.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!Info.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Info` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (jsonObj.get("AccessibleTopology") != null && !jsonObj.get("AccessibleTopology").isJsonNull()) {
        JsonArray jsonArrayaccessibleTopology = jsonObj.getAsJsonArray("AccessibleTopology");
        if (jsonArrayaccessibleTopology != null) {
          // ensure the json data is an array
          if (!jsonObj.get("AccessibleTopology").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `AccessibleTopology` to be an array in the JSON string but got `%s`", jsonObj.get("AccessibleTopology").toString()));
          }

          // validate the optional field `AccessibleTopology` (array)
          for (int i = 0; i < jsonArrayaccessibleTopology.size(); i++) {
            Topology.validateJsonElement(jsonArrayaccessibleTopology.get(i));
          };
        }
      }
      if ((jsonObj.get("VolumeID") != null && !jsonObj.get("VolumeID").isJsonNull()) && !jsonObj.get("VolumeID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `VolumeID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("VolumeID").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Info.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Info' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Info> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Info.class));

       return (TypeAdapter<T>) new TypeAdapter<Info>() {
           @Override
           public void write(JsonWriter out, Info value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Info read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of Info given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of Info
   * @throws IOException if the JSON string is invalid with respect to Info
   */
  public static Info fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Info.class);
  }

  /**
   * Convert an instance of Info to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


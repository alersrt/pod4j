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
import io.github.alersrt.pod4j.openapi.model.AccessMode;
import io.github.alersrt.pod4j.openapi.model.CapacityRange;
import io.github.alersrt.pod4j.openapi.model.Secret;
import io.github.alersrt.pod4j.openapi.model.TopologyRequirement;
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
 * ClusterVolumeSpec
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T03:11:38.353612246+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ClusterVolumeSpec implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_ACCESS_MODE = "AccessMode";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODE)
  private AccessMode accessMode;

  public static final String SERIALIZED_NAME_ACCESSIBILITY_REQUIREMENTS = "AccessibilityRequirements";
  @SerializedName(SERIALIZED_NAME_ACCESSIBILITY_REQUIREMENTS)
  private TopologyRequirement accessibilityRequirements;

  public static final String SERIALIZED_NAME_AVAILABILITY = "Availability";
  @SerializedName(SERIALIZED_NAME_AVAILABILITY)
  private String availability;

  public static final String SERIALIZED_NAME_CAPACITY_RANGE = "CapacityRange";
  @SerializedName(SERIALIZED_NAME_CAPACITY_RANGE)
  private CapacityRange capacityRange;

  public static final String SERIALIZED_NAME_GROUP = "Group";
  @SerializedName(SERIALIZED_NAME_GROUP)
  private String group;

  public static final String SERIALIZED_NAME_SECRETS = "Secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<@Valid Secret> secrets = new ArrayList<>();

  public ClusterVolumeSpec() {
  }

  public ClusterVolumeSpec accessMode(AccessMode accessMode) {
    this.accessMode = accessMode;
    return this;
  }

  /**
   * Get accessMode
   * @return accessMode
   */
  @jakarta.annotation.Nullable
  @Valid

  public AccessMode getAccessMode() {
    return accessMode;
  }

  public void setAccessMode(AccessMode accessMode) {
    this.accessMode = accessMode;
  }


  public ClusterVolumeSpec accessibilityRequirements(TopologyRequirement accessibilityRequirements) {
    this.accessibilityRequirements = accessibilityRequirements;
    return this;
  }

  /**
   * Get accessibilityRequirements
   * @return accessibilityRequirements
   */
  @jakarta.annotation.Nullable
  @Valid

  public TopologyRequirement getAccessibilityRequirements() {
    return accessibilityRequirements;
  }

  public void setAccessibilityRequirements(TopologyRequirement accessibilityRequirements) {
    this.accessibilityRequirements = accessibilityRequirements;
  }


  public ClusterVolumeSpec availability(String availability) {
    this.availability = availability;
    return this;
  }

  /**
   * Get availability
   * @return availability
   */
  @jakarta.annotation.Nullable

  public String getAvailability() {
    return availability;
  }

  public void setAvailability(String availability) {
    this.availability = availability;
  }


  public ClusterVolumeSpec capacityRange(CapacityRange capacityRange) {
    this.capacityRange = capacityRange;
    return this;
  }

  /**
   * Get capacityRange
   * @return capacityRange
   */
  @jakarta.annotation.Nullable
  @Valid

  public CapacityRange getCapacityRange() {
    return capacityRange;
  }

  public void setCapacityRange(CapacityRange capacityRange) {
    this.capacityRange = capacityRange;
  }


  public ClusterVolumeSpec group(String group) {
    this.group = group;
    return this;
  }

  /**
   * Group defines the volume group of this volume. Volumes belonging to the same group can be referred to by group name when creating Services. Referring to a volume by group instructs swarm to treat volumes in that group interchangeably for the purpose of scheduling. Volumes with an empty string for a group technically all belong to the same, emptystring group.
   * @return group
   */
  @jakarta.annotation.Nullable

  public String getGroup() {
    return group;
  }

  public void setGroup(String group) {
    this.group = group;
  }


  public ClusterVolumeSpec secrets(List<@Valid Secret> secrets) {
    this.secrets = secrets;
    return this;
  }

  public ClusterVolumeSpec addSecretsItem(Secret secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

  /**
   * Secrets defines Swarm Secrets that are passed to the CSI storage plugin when operating on this volume.
   * @return secrets
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid Secret> getSecrets() {
    return secrets;
  }

  public void setSecrets(List<@Valid Secret> secrets) {
    this.secrets = secrets;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClusterVolumeSpec clusterVolumeSpec = (ClusterVolumeSpec) o;
    return Objects.equals(this.accessMode, clusterVolumeSpec.accessMode) &&
        Objects.equals(this.accessibilityRequirements, clusterVolumeSpec.accessibilityRequirements) &&
        Objects.equals(this.availability, clusterVolumeSpec.availability) &&
        Objects.equals(this.capacityRange, clusterVolumeSpec.capacityRange) &&
        Objects.equals(this.group, clusterVolumeSpec.group) &&
        Objects.equals(this.secrets, clusterVolumeSpec.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessMode, accessibilityRequirements, availability, capacityRange, group, secrets);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClusterVolumeSpec {\n");
    sb.append("    accessMode: ").append(toIndentedString(accessMode)).append("\n");
    sb.append("    accessibilityRequirements: ").append(toIndentedString(accessibilityRequirements)).append("\n");
    sb.append("    availability: ").append(toIndentedString(availability)).append("\n");
    sb.append("    capacityRange: ").append(toIndentedString(capacityRange)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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
    openapiFields.add("AccessMode");
    openapiFields.add("AccessibilityRequirements");
    openapiFields.add("Availability");
    openapiFields.add("CapacityRange");
    openapiFields.add("Group");
    openapiFields.add("Secrets");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ClusterVolumeSpec
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ClusterVolumeSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ClusterVolumeSpec is not found in the empty JSON string", ClusterVolumeSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ClusterVolumeSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ClusterVolumeSpec` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the optional field `AccessMode`
      if (jsonObj.get("AccessMode") != null && !jsonObj.get("AccessMode").isJsonNull()) {
        AccessMode.validateJsonElement(jsonObj.get("AccessMode"));
      }
      // validate the optional field `AccessibilityRequirements`
      if (jsonObj.get("AccessibilityRequirements") != null && !jsonObj.get("AccessibilityRequirements").isJsonNull()) {
        TopologyRequirement.validateJsonElement(jsonObj.get("AccessibilityRequirements"));
      }
      if ((jsonObj.get("Availability") != null && !jsonObj.get("Availability").isJsonNull()) && !jsonObj.get("Availability").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Availability` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Availability").toString()));
      }
      // validate the optional field `CapacityRange`
      if (jsonObj.get("CapacityRange") != null && !jsonObj.get("CapacityRange").isJsonNull()) {
        CapacityRange.validateJsonElement(jsonObj.get("CapacityRange"));
      }
      if ((jsonObj.get("Group") != null && !jsonObj.get("Group").isJsonNull()) && !jsonObj.get("Group").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Group` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Group").toString()));
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
            Secret.validateJsonElement(jsonArraysecrets.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ClusterVolumeSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ClusterVolumeSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ClusterVolumeSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ClusterVolumeSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<ClusterVolumeSpec>() {
           @Override
           public void write(JsonWriter out, ClusterVolumeSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ClusterVolumeSpec read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ClusterVolumeSpec given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ClusterVolumeSpec
   * @throws IOException if the JSON string is invalid with respect to ClusterVolumeSpec
   */
  public static ClusterVolumeSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ClusterVolumeSpec.class);
  }

  /**
   * Convert an instance of ClusterVolumeSpec to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
import io.github.alersrt.pod4j.openapi.model.ListPodContainer;
import java.io.IOException;
import java.time.OffsetDateTime;
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
 * ListPodsReport
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T02:16:23.826374396+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ListPodsReport implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CGROUP = "Cgroup";
  @SerializedName(SERIALIZED_NAME_CGROUP)
  private String cgroup;

  public static final String SERIALIZED_NAME_CONTAINERS = "Containers";
  @SerializedName(SERIALIZED_NAME_CONTAINERS)
  private List<@Valid ListPodContainer> containers = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_INFRA_ID = "InfraId";
  @SerializedName(SERIALIZED_NAME_INFRA_ID)
  private String infraId;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_NAMESPACE = "Namespace";
  @SerializedName(SERIALIZED_NAME_NAMESPACE)
  private String namespace;

  public static final String SERIALIZED_NAME_NETWORKS = "Networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private List<String> networks = new ArrayList<>();

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ListPodsReport() {
  }

  public ListPodsReport cgroup(String cgroup) {
    this.cgroup = cgroup;
    return this;
  }

  /**
   * Get cgroup
   * @return cgroup
   */
  @jakarta.annotation.Nullable

  public String getCgroup() {
    return cgroup;
  }

  public void setCgroup(String cgroup) {
    this.cgroup = cgroup;
  }


  public ListPodsReport containers(List<@Valid ListPodContainer> containers) {
    this.containers = containers;
    return this;
  }

  public ListPodsReport addContainersItem(ListPodContainer containersItem) {
    if (this.containers == null) {
      this.containers = new ArrayList<>();
    }
    this.containers.add(containersItem);
    return this;
  }

  /**
   * Get containers
   * @return containers
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid ListPodContainer> getContainers() {
    return containers;
  }

  public void setContainers(List<@Valid ListPodContainer> containers) {
    this.containers = containers;
  }


  public ListPodsReport created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Get created
   * @return created
   */
  @jakarta.annotation.Nullable
  @Valid

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public ListPodsReport id(String id) {
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


  public ListPodsReport infraId(String infraId) {
    this.infraId = infraId;
    return this;
  }

  /**
   * Get infraId
   * @return infraId
   */
  @jakarta.annotation.Nullable

  public String getInfraId() {
    return infraId;
  }

  public void setInfraId(String infraId) {
    this.infraId = infraId;
  }


  public ListPodsReport labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ListPodsReport putLabelsItem(String key, String labelsItem) {
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


  public ListPodsReport name(String name) {
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


  public ListPodsReport namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

  /**
   * Get namespace
   * @return namespace
   */
  @jakarta.annotation.Nullable

  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }


  public ListPodsReport networks(List<String> networks) {
    this.networks = networks;
    return this;
  }

  public ListPodsReport addNetworksItem(String networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<>();
    }
    this.networks.add(networksItem);
    return this;
  }

  /**
   * Network names connected to infra container
   * @return networks
   */
  @jakarta.annotation.Nullable

  public List<String> getNetworks() {
    return networks;
  }

  public void setNetworks(List<String> networks) {
    this.networks = networks;
  }


  public ListPodsReport status(String status) {
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
    ListPodsReport listPodsReport = (ListPodsReport) o;
    return Objects.equals(this.cgroup, listPodsReport.cgroup) &&
        Objects.equals(this.containers, listPodsReport.containers) &&
        Objects.equals(this.created, listPodsReport.created) &&
        Objects.equals(this.id, listPodsReport.id) &&
        Objects.equals(this.infraId, listPodsReport.infraId) &&
        Objects.equals(this.labels, listPodsReport.labels) &&
        Objects.equals(this.name, listPodsReport.name) &&
        Objects.equals(this.namespace, listPodsReport.namespace) &&
        Objects.equals(this.networks, listPodsReport.networks) &&
        Objects.equals(this.status, listPodsReport.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cgroup, containers, created, id, infraId, labels, name, namespace, networks, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListPodsReport {\n");
    sb.append("    cgroup: ").append(toIndentedString(cgroup)).append("\n");
    sb.append("    containers: ").append(toIndentedString(containers)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    infraId: ").append(toIndentedString(infraId)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    namespace: ").append(toIndentedString(namespace)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
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
    openapiFields.add("Cgroup");
    openapiFields.add("Containers");
    openapiFields.add("Created");
    openapiFields.add("Id");
    openapiFields.add("InfraId");
    openapiFields.add("Labels");
    openapiFields.add("Name");
    openapiFields.add("Namespace");
    openapiFields.add("Networks");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListPodsReport
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListPodsReport.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListPodsReport is not found in the empty JSON string", ListPodsReport.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListPodsReport.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListPodsReport` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Cgroup") != null && !jsonObj.get("Cgroup").isJsonNull()) && !jsonObj.get("Cgroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Cgroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Cgroup").toString()));
      }
      if (jsonObj.get("Containers") != null && !jsonObj.get("Containers").isJsonNull()) {
        JsonArray jsonArraycontainers = jsonObj.getAsJsonArray("Containers");
        if (jsonArraycontainers != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Containers").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Containers` to be an array in the JSON string but got `%s`", jsonObj.get("Containers").toString()));
          }

          // validate the optional field `Containers` (array)
          for (int i = 0; i < jsonArraycontainers.size(); i++) {
            ListPodContainer.validateJsonElement(jsonArraycontainers.get(i));
          };
        }
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if ((jsonObj.get("InfraId") != null && !jsonObj.get("InfraId").isJsonNull()) && !jsonObj.get("InfraId").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `InfraId` to be a primitive type in the JSON string but got `%s`", jsonObj.get("InfraId").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Namespace") != null && !jsonObj.get("Namespace").isJsonNull()) && !jsonObj.get("Namespace").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Namespace` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Namespace").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Networks") != null && !jsonObj.get("Networks").isJsonNull() && !jsonObj.get("Networks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Networks` to be an array in the JSON string but got `%s`", jsonObj.get("Networks").toString()));
      }
      if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListPodsReport.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListPodsReport' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListPodsReport> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListPodsReport.class));

       return (TypeAdapter<T>) new TypeAdapter<ListPodsReport>() {
           @Override
           public void write(JsonWriter out, ListPodsReport value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListPodsReport read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListPodsReport given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListPodsReport
   * @throws IOException if the JSON string is invalid with respect to ListPodsReport
   */
  public static ListPodsReport fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListPodsReport.class);
  }

  /**
   * Convert an instance of ListPodsReport to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


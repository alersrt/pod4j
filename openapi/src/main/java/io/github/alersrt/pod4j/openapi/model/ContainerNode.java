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
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
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
 * Deprecated: ContainerNode was used for the classic Docker Swarm standalone API. It will be removed in the next release.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T19:32:04.765618819+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ContainerNode {
  public static final String SERIALIZED_NAME_ADDR = "Addr";
  @SerializedName(SERIALIZED_NAME_ADDR)
  private String addr;

  public static final String SERIALIZED_NAME_CPUS = "Cpus";
  @SerializedName(SERIALIZED_NAME_CPUS)
  private Long cpus;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_I_P = "IP";
  @SerializedName(SERIALIZED_NAME_I_P)
  private String IP;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MEMORY = "Memory";
  @SerializedName(SERIALIZED_NAME_MEMORY)
  private Long memory;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public ContainerNode() {
  }

  public ContainerNode addr(String addr) {
    this.addr = addr;
    return this;
  }

  /**
   * Get addr
   * @return addr
   */
  @javax.annotation.Nullable
  public String getAddr() {
    return addr;
  }

  public void setAddr(String addr) {
    this.addr = addr;
  }


  public ContainerNode cpus(Long cpus) {
    this.cpus = cpus;
    return this;
  }

  /**
   * Get cpus
   * @return cpus
   */
  @javax.annotation.Nullable
  public Long getCpus() {
    return cpus;
  }

  public void setCpus(Long cpus) {
    this.cpus = cpus;
  }


  public ContainerNode ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * Get ID
   * @return ID
   */
  @javax.annotation.Nullable
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }


  public ContainerNode IP(String IP) {
    this.IP = IP;
    return this;
  }

  /**
   * Get IP
   * @return IP
   */
  @javax.annotation.Nullable
  public String getIP() {
    return IP;
  }

  public void setIP(String IP) {
    this.IP = IP;
  }


  public ContainerNode labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ContainerNode putLabelsItem(String key, String labelsItem) {
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
  @javax.annotation.Nullable
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public ContainerNode memory(Long memory) {
    this.memory = memory;
    return this;
  }

  /**
   * Get memory
   * @return memory
   */
  @javax.annotation.Nullable
  public Long getMemory() {
    return memory;
  }

  public void setMemory(Long memory) {
    this.memory = memory;
  }


  public ContainerNode name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Get name
   * @return name
   */
  @javax.annotation.Nullable
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerNode containerNode = (ContainerNode) o;
    return Objects.equals(this.addr, containerNode.addr) &&
        Objects.equals(this.cpus, containerNode.cpus) &&
        Objects.equals(this.ID, containerNode.ID) &&
        Objects.equals(this.IP, containerNode.IP) &&
        Objects.equals(this.labels, containerNode.labels) &&
        Objects.equals(this.memory, containerNode.memory) &&
        Objects.equals(this.name, containerNode.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(addr, cpus, ID, IP, labels, memory, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerNode {\n");
    sb.append("    addr: ").append(toIndentedString(addr)).append("\n");
    sb.append("    cpus: ").append(toIndentedString(cpus)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    IP: ").append(toIndentedString(IP)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    memory: ").append(toIndentedString(memory)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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
    openapiFields.add("Addr");
    openapiFields.add("Cpus");
    openapiFields.add("ID");
    openapiFields.add("IP");
    openapiFields.add("Labels");
    openapiFields.add("Memory");
    openapiFields.add("Name");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ContainerNode
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ContainerNode.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ContainerNode is not found in the empty JSON string", ContainerNode.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ContainerNode.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ContainerNode` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Addr") != null && !jsonObj.get("Addr").isJsonNull()) && !jsonObj.get("Addr").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Addr` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Addr").toString()));
      }
      if ((jsonObj.get("ID") != null && !jsonObj.get("ID").isJsonNull()) && !jsonObj.get("ID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ID").toString()));
      }
      if ((jsonObj.get("IP") != null && !jsonObj.get("IP").isJsonNull()) && !jsonObj.get("IP").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IP` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IP").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ContainerNode.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ContainerNode' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ContainerNode> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ContainerNode.class));

       return (TypeAdapter<T>) new TypeAdapter<ContainerNode>() {
           @Override
           public void write(JsonWriter out, ContainerNode value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ContainerNode read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ContainerNode given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ContainerNode
   * @throws IOException if the JSON string is invalid with respect to ContainerNode
   */
  public static ContainerNode fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ContainerNode.class);
  }

  /**
   * Convert an instance of ContainerNode to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


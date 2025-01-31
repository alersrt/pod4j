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

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.TypeAdapter;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.github.alersrt.pod4j.openapi.JSON;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.IOException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * PublishStatus represents the status of the volume as published to an individual node
 */
@ApiModel(description = "PublishStatus represents the status of the volume as published to an individual node")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PublishStatus implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_NODE_I_D = "NodeID";
  @SerializedName(SERIALIZED_NAME_NODE_I_D)
  private String nodeID;

  public static final String SERIALIZED_NAME_PUBLISH_CONTEXT = "PublishContext";
  @SerializedName(SERIALIZED_NAME_PUBLISH_CONTEXT)
  private Map<String, String> publishContext = null;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public PublishStatus() {
  }

  public PublishStatus nodeID(String nodeID) {

    this.nodeID = nodeID;
    return this;
  }

  /**
   * NodeID is the ID of the swarm node this Volume is published to.
   * @return nodeID
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "NodeID is the ID of the swarm node this Volume is published to.")

  public String getNodeID() {
    return nodeID;
  }


  public void setNodeID(String nodeID) {
    this.nodeID = nodeID;
  }


  public PublishStatus publishContext(Map<String, String> publishContext) {

    this.publishContext = publishContext;
    return this;
  }

  public PublishStatus putPublishContextItem(String key, String publishContextItem) {
    if (this.publishContext == null) {
      this.publishContext = new HashMap<>();
    }
    this.publishContext.put(key, publishContextItem);
    return this;
  }

  /**
   * PublishContext is the PublishContext returned by the CSI plugin when a volume is published.
   * @return publishContext
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PublishContext is the PublishContext returned by the CSI plugin when a volume is published.")

  public Map<String, String> getPublishContext() {
    return publishContext;
  }


  public void setPublishContext(Map<String, String> publishContext) {
    this.publishContext = publishContext;
  }


  public PublishStatus state(String state) {

    this.state = state;
    return this;
  }

  /**
   * PublishState represents the state of a Volume as it pertains to its use on a particular Node.
   * @return state
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "PublishState represents the state of a Volume as it pertains to its use on a particular Node.")

  public String getState() {
    return state;
  }


  public void setState(String state) {
    this.state = state;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PublishStatus publishStatus = (PublishStatus) o;
    return Objects.equals(this.nodeID, publishStatus.nodeID) &&
        Objects.equals(this.publishContext, publishStatus.publishContext) &&
        Objects.equals(this.state, publishStatus.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nodeID, publishContext, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PublishStatus {\n");
    sb.append("    nodeID: ").append(toIndentedString(nodeID)).append("\n");
    sb.append("    publishContext: ").append(toIndentedString(publishContext)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("NodeID");
    openapiFields.add("PublishContext");
    openapiFields.add("State");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to PublishStatus
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
    if (jsonObj == null) {
      if (PublishStatus.openapiRequiredFields.isEmpty()) {
        return;
      } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in PublishStatus is not found in the empty JSON string", PublishStatus.openapiRequiredFields.toString()));
      }
    }

    Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
    for (Entry<String, JsonElement> entry : entries) {
        if (!PublishStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PublishStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("NodeID") != null && !jsonObj.get("NodeID").isJsonNull()) && !jsonObj.get("NodeID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `NodeID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("NodeID").toString()));
      }
      if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) && !jsonObj.get("State").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `State` to be a primitive type in the JSON string but got `%s`", jsonObj.get("State").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PublishStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PublishStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PublishStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PublishStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<PublishStatus>() {
           @Override
           public void write(JsonWriter out, PublishStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PublishStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of PublishStatus given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of PublishStatus
   * @throws IOException if the JSON string is invalid with respect to PublishStatus
  */
  public static PublishStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PublishStatus.class);
  }

  /**
   * Convert an instance of PublishStatus to an JSON string
   *
   * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


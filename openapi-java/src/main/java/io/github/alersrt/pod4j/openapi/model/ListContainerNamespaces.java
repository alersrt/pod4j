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
 * ListContainerNamespaces contains the identifiers of the container&#39;s Linux namespaces
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T03:11:38.353612246+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ListContainerNamespaces implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_CGROUP = "Cgroup";
  @SerializedName(SERIALIZED_NAME_CGROUP)
  private String cgroup;

  public static final String SERIALIZED_NAME_IPC = "Ipc";
  @SerializedName(SERIALIZED_NAME_IPC)
  private String ipc;

  public static final String SERIALIZED_NAME_MNT = "Mnt";
  @SerializedName(SERIALIZED_NAME_MNT)
  private String mnt;

  public static final String SERIALIZED_NAME_NET = "Net";
  @SerializedName(SERIALIZED_NAME_NET)
  private String net;

  public static final String SERIALIZED_NAME_PIDNS = "Pidns";
  @SerializedName(SERIALIZED_NAME_PIDNS)
  private String pidns;

  public static final String SERIALIZED_NAME_USER = "User";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;

  public static final String SERIALIZED_NAME_UTS = "Uts";
  @SerializedName(SERIALIZED_NAME_UTS)
  private String uts;

  public ListContainerNamespaces() {
  }

  public ListContainerNamespaces cgroup(String cgroup) {
    this.cgroup = cgroup;
    return this;
  }

  /**
   * Cgroup namespace
   * @return cgroup
   */
  @jakarta.annotation.Nullable

  public String getCgroup() {
    return cgroup;
  }

  public void setCgroup(String cgroup) {
    this.cgroup = cgroup;
  }


  public ListContainerNamespaces ipc(String ipc) {
    this.ipc = ipc;
    return this;
  }

  /**
   * IPC namespace
   * @return ipc
   */
  @jakarta.annotation.Nullable

  public String getIpc() {
    return ipc;
  }

  public void setIpc(String ipc) {
    this.ipc = ipc;
  }


  public ListContainerNamespaces mnt(String mnt) {
    this.mnt = mnt;
    return this;
  }

  /**
   * Mount namespace
   * @return mnt
   */
  @jakarta.annotation.Nullable

  public String getMnt() {
    return mnt;
  }

  public void setMnt(String mnt) {
    this.mnt = mnt;
  }


  public ListContainerNamespaces net(String net) {
    this.net = net;
    return this;
  }

  /**
   * Network namespace
   * @return net
   */
  @jakarta.annotation.Nullable

  public String getNet() {
    return net;
  }

  public void setNet(String net) {
    this.net = net;
  }


  public ListContainerNamespaces pidns(String pidns) {
    this.pidns = pidns;
    return this;
  }

  /**
   * PID namespace
   * @return pidns
   */
  @jakarta.annotation.Nullable

  public String getPidns() {
    return pidns;
  }

  public void setPidns(String pidns) {
    this.pidns = pidns;
  }


  public ListContainerNamespaces user(String user) {
    this.user = user;
    return this;
  }

  /**
   * User namespace
   * @return user
   */
  @jakarta.annotation.Nullable

  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }


  public ListContainerNamespaces uts(String uts) {
    this.uts = uts;
    return this;
  }

  /**
   * UTS namespace
   * @return uts
   */
  @jakarta.annotation.Nullable

  public String getUts() {
    return uts;
  }

  public void setUts(String uts) {
    this.uts = uts;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ListContainerNamespaces listContainerNamespaces = (ListContainerNamespaces) o;
    return Objects.equals(this.cgroup, listContainerNamespaces.cgroup) &&
        Objects.equals(this.ipc, listContainerNamespaces.ipc) &&
        Objects.equals(this.mnt, listContainerNamespaces.mnt) &&
        Objects.equals(this.net, listContainerNamespaces.net) &&
        Objects.equals(this.pidns, listContainerNamespaces.pidns) &&
        Objects.equals(this.user, listContainerNamespaces.user) &&
        Objects.equals(this.uts, listContainerNamespaces.uts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cgroup, ipc, mnt, net, pidns, user, uts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListContainerNamespaces {\n");
    sb.append("    cgroup: ").append(toIndentedString(cgroup)).append("\n");
    sb.append("    ipc: ").append(toIndentedString(ipc)).append("\n");
    sb.append("    mnt: ").append(toIndentedString(mnt)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
    sb.append("    pidns: ").append(toIndentedString(pidns)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    uts: ").append(toIndentedString(uts)).append("\n");
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
    openapiFields.add("Ipc");
    openapiFields.add("Mnt");
    openapiFields.add("Net");
    openapiFields.add("Pidns");
    openapiFields.add("User");
    openapiFields.add("Uts");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListContainerNamespaces
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListContainerNamespaces.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListContainerNamespaces is not found in the empty JSON string", ListContainerNamespaces.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListContainerNamespaces.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListContainerNamespaces` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Cgroup") != null && !jsonObj.get("Cgroup").isJsonNull()) && !jsonObj.get("Cgroup").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Cgroup` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Cgroup").toString()));
      }
      if ((jsonObj.get("Ipc") != null && !jsonObj.get("Ipc").isJsonNull()) && !jsonObj.get("Ipc").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Ipc` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Ipc").toString()));
      }
      if ((jsonObj.get("Mnt") != null && !jsonObj.get("Mnt").isJsonNull()) && !jsonObj.get("Mnt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mnt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Mnt").toString()));
      }
      if ((jsonObj.get("Net") != null && !jsonObj.get("Net").isJsonNull()) && !jsonObj.get("Net").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Net` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Net").toString()));
      }
      if ((jsonObj.get("Pidns") != null && !jsonObj.get("Pidns").isJsonNull()) && !jsonObj.get("Pidns").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Pidns` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Pidns").toString()));
      }
      if ((jsonObj.get("User") != null && !jsonObj.get("User").isJsonNull()) && !jsonObj.get("User").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `User` to be a primitive type in the JSON string but got `%s`", jsonObj.get("User").toString()));
      }
      if ((jsonObj.get("Uts") != null && !jsonObj.get("Uts").isJsonNull()) && !jsonObj.get("Uts").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Uts` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Uts").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListContainerNamespaces.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListContainerNamespaces' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListContainerNamespaces> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListContainerNamespaces.class));

       return (TypeAdapter<T>) new TypeAdapter<ListContainerNamespaces>() {
           @Override
           public void write(JsonWriter out, ListContainerNamespaces value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListContainerNamespaces read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListContainerNamespaces given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListContainerNamespaces
   * @throws IOException if the JSON string is invalid with respect to ListContainerNamespaces
   */
  public static ListContainerNamespaces fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListContainerNamespaces.class);
  }

  /**
   * Convert an instance of ListContainerNamespaces to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


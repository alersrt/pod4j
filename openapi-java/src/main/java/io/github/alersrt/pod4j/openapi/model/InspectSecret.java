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
 * InspectSecret contains information on secrets mounted inside the container
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T22:50:27.482487554+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class InspectSecret implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_G_I_D = "GID";
  @SerializedName(SERIALIZED_NAME_G_I_D)
  private Integer GID;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_MODE = "Mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private Integer mode;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_U_I_D = "UID";
  @SerializedName(SERIALIZED_NAME_U_I_D)
  private Integer UID;

  public InspectSecret() {
  }

  public InspectSecret GID(Integer GID) {
    this.GID = GID;
    return this;
  }

  /**
   * ID is the GID of the mounted secret file
   * @return GID
   */
  @jakarta.annotation.Nullable

  public Integer getGID() {
    return GID;
  }

  public void setGID(Integer GID) {
    this.GID = GID;
  }


  public InspectSecret ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * ID is the ID of the secret
   * @return ID
   */
  @jakarta.annotation.Nullable

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }


  public InspectSecret mode(Integer mode) {
    this.mode = mode;
    return this;
  }

  /**
   * ID is the ID of the mode of the mounted secret file
   * @return mode
   */
  @jakarta.annotation.Nullable

  public Integer getMode() {
    return mode;
  }

  public void setMode(Integer mode) {
    this.mode = mode;
  }


  public InspectSecret name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the name of the secret
   * @return name
   */
  @jakarta.annotation.Nullable

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public InspectSecret UID(Integer UID) {
    this.UID = UID;
    return this;
  }

  /**
   * ID is the UID of the mounted secret file
   * @return UID
   */
  @jakarta.annotation.Nullable

  public Integer getUID() {
    return UID;
  }

  public void setUID(Integer UID) {
    this.UID = UID;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectSecret inspectSecret = (InspectSecret) o;
    return Objects.equals(this.GID, inspectSecret.GID) &&
        Objects.equals(this.ID, inspectSecret.ID) &&
        Objects.equals(this.mode, inspectSecret.mode) &&
        Objects.equals(this.name, inspectSecret.name) &&
        Objects.equals(this.UID, inspectSecret.UID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(GID, ID, mode, name, UID);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectSecret {\n");
    sb.append("    GID: ").append(toIndentedString(GID)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    UID: ").append(toIndentedString(UID)).append("\n");
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
    openapiFields.add("GID");
    openapiFields.add("ID");
    openapiFields.add("Mode");
    openapiFields.add("Name");
    openapiFields.add("UID");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InspectSecret
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InspectSecret.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectSecret is not found in the empty JSON string", InspectSecret.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InspectSecret.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectSecret` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("ID") != null && !jsonObj.get("ID").isJsonNull()) && !jsonObj.get("ID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ID").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectSecret.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectSecret' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectSecret> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectSecret.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectSecret>() {
           @Override
           public void write(JsonWriter out, InspectSecret value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectSecret read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InspectSecret given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InspectSecret
   * @throws IOException if the JSON string is invalid with respect to InspectSecret
   */
  public static InspectSecret fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectSecret.class);
  }

  /**
   * Convert an instance of InspectSecret to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


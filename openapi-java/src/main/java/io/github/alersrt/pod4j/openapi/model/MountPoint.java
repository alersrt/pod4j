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
 * This is used for reporting the mountpoints in use by a container.
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T02:27:12.403969908+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class MountPoint implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_DESTINATION = "Destination";
  @SerializedName(SERIALIZED_NAME_DESTINATION)
  private String destination;

  public static final String SERIALIZED_NAME_DRIVER = "Driver";
  @SerializedName(SERIALIZED_NAME_DRIVER)
  private String driver;

  public static final String SERIALIZED_NAME_MODE = "Mode";
  @SerializedName(SERIALIZED_NAME_MODE)
  private String mode;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PROPAGATION = "Propagation";
  @SerializedName(SERIALIZED_NAME_PROPAGATION)
  private String propagation;

  public static final String SERIALIZED_NAME_R_W = "RW";
  @SerializedName(SERIALIZED_NAME_R_W)
  private Boolean RW;

  public static final String SERIALIZED_NAME_SOURCE = "Source";
  @SerializedName(SERIALIZED_NAME_SOURCE)
  private String source;

  public static final String SERIALIZED_NAME_TYPE = "Type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public MountPoint() {
  }

  public MountPoint destination(String destination) {
    this.destination = destination;
    return this;
  }

  /**
   * Destination is the path relative to the container root (&#x60;/&#x60;) where the Source is mounted inside the container.
   * @return destination
   */
  @jakarta.annotation.Nullable

  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }


  public MountPoint driver(String driver) {
    this.driver = driver;
    return this;
  }

  /**
   * Driver is the volume driver used to create the volume (if it is a volume).
   * @return driver
   */
  @jakarta.annotation.Nullable

  public String getDriver() {
    return driver;
  }

  public void setDriver(String driver) {
    this.driver = driver;
  }


  public MountPoint mode(String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Mode is a comma separated list of options supplied by the user when creating the bind/volume mount.  The default is platform-specific (&#x60;\&quot;z\&quot;&#x60; on Linux, empty on Windows).
   * @return mode
   */
  @jakarta.annotation.Nullable

  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }


  public MountPoint name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Name is the name reference to the underlying data defined by &#x60;Source&#x60; e.g., the volume name.
   * @return name
   */
  @jakarta.annotation.Nullable

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public MountPoint propagation(String propagation) {
    this.propagation = propagation;
    return this;
  }

  /**
   * Get propagation
   * @return propagation
   */
  @jakarta.annotation.Nullable

  public String getPropagation() {
    return propagation;
  }

  public void setPropagation(String propagation) {
    this.propagation = propagation;
  }


  public MountPoint RW(Boolean RW) {
    this.RW = RW;
    return this;
  }

  /**
   * RW indicates whether the mount is mounted writable (read-write).
   * @return RW
   */
  @jakarta.annotation.Nullable

  public Boolean getRW() {
    return RW;
  }

  public void setRW(Boolean RW) {
    this.RW = RW;
  }


  public MountPoint source(String source) {
    this.source = source;
    return this;
  }

  /**
   * Source is the source location of the mount.  For volumes, this contains the storage location of the volume (within &#x60;/var/lib/docker/volumes/&#x60;). For bind-mounts, and &#x60;npipe&#x60;, this contains the source (host) part of the bind-mount. For &#x60;tmpfs&#x60; mount points, this field is empty.
   * @return source
   */
  @jakarta.annotation.Nullable

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }


  public MountPoint type(String type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @jakarta.annotation.Nullable

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MountPoint mountPoint = (MountPoint) o;
    return Objects.equals(this.destination, mountPoint.destination) &&
        Objects.equals(this.driver, mountPoint.driver) &&
        Objects.equals(this.mode, mountPoint.mode) &&
        Objects.equals(this.name, mountPoint.name) &&
        Objects.equals(this.propagation, mountPoint.propagation) &&
        Objects.equals(this.RW, mountPoint.RW) &&
        Objects.equals(this.source, mountPoint.source) &&
        Objects.equals(this.type, mountPoint.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, driver, mode, name, propagation, RW, source, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MountPoint {\n");
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    driver: ").append(toIndentedString(driver)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    propagation: ").append(toIndentedString(propagation)).append("\n");
    sb.append("    RW: ").append(toIndentedString(RW)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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
    openapiFields.add("Destination");
    openapiFields.add("Driver");
    openapiFields.add("Mode");
    openapiFields.add("Name");
    openapiFields.add("Propagation");
    openapiFields.add("RW");
    openapiFields.add("Source");
    openapiFields.add("Type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to MountPoint
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!MountPoint.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in MountPoint is not found in the empty JSON string", MountPoint.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!MountPoint.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MountPoint` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("Destination") != null && !jsonObj.get("Destination").isJsonNull()) && !jsonObj.get("Destination").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Destination` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Destination").toString()));
      }
      if ((jsonObj.get("Driver") != null && !jsonObj.get("Driver").isJsonNull()) && !jsonObj.get("Driver").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Driver` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Driver").toString()));
      }
      if ((jsonObj.get("Mode") != null && !jsonObj.get("Mode").isJsonNull()) && !jsonObj.get("Mode").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mode` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Mode").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Propagation") != null && !jsonObj.get("Propagation").isJsonNull()) && !jsonObj.get("Propagation").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Propagation` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Propagation").toString()));
      }
      if ((jsonObj.get("Source") != null && !jsonObj.get("Source").isJsonNull()) && !jsonObj.get("Source").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Source` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Source").toString()));
      }
      if ((jsonObj.get("Type") != null && !jsonObj.get("Type").isJsonNull()) && !jsonObj.get("Type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Type").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MountPoint.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MountPoint' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MountPoint> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MountPoint.class));

       return (TypeAdapter<T>) new TypeAdapter<MountPoint>() {
           @Override
           public void write(JsonWriter out, MountPoint value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MountPoint read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of MountPoint given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of MountPoint
   * @throws IOException if the JSON string is invalid with respect to MountPoint
   */
  public static MountPoint fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MountPoint.class);
  }

  /**
   * Convert an instance of MountPoint to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


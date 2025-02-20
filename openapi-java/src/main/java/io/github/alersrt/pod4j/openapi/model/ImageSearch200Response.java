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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
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
 * ImageSearch200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class ImageSearch200Response implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUTOMATED = "Automated";
  @SerializedName(SERIALIZED_NAME_AUTOMATED)
  private String automated;

  public static final String SERIALIZED_NAME_DESCRIPTION = "Description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_INDEX = "Index";
  @SerializedName(SERIALIZED_NAME_INDEX)
  private String index;

  public static final String SERIALIZED_NAME_NAME = "Name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_OFFICIAL = "Official";
  @SerializedName(SERIALIZED_NAME_OFFICIAL)
  private String official;

  public static final String SERIALIZED_NAME_STARS = "Stars";
  @SerializedName(SERIALIZED_NAME_STARS)
  private Long stars;

  public static final String SERIALIZED_NAME_TAG = "Tag";
  @SerializedName(SERIALIZED_NAME_TAG)
  private String tag;

  public ImageSearch200Response() {
  }

  public ImageSearch200Response automated(String automated) {

      this.automated = automated;
    return this;
  }

    /**
   * Automated indicates if the image was created by an automated build.
   * @return automated
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Automated indicates if the image was created by an automated build.")

  public String getAutomated() {
    return automated;
  }


  public void setAutomated(String automated) {
    this.automated = automated;
  }


  public ImageSearch200Response description(String description) {

      this.description = description;
    return this;
  }

    /**
   * Description of the image.
   * @return description
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Description of the image.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ImageSearch200Response index(String index) {

      this.index = index;
    return this;
  }

    /**
   * Index is the image index
   * @return index
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "quay.io", value = "Index is the image index")

  public String getIndex() {
    return index;
  }


  public void setIndex(String index) {
    this.index = index;
  }


  public ImageSearch200Response name(String name) {

      this.name = name;
    return this;
  }

    /**
   * Name is the canonical name of the image
   * @return name
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(example = "docker.io/library/alpine\"", value = "Name is the canonical name of the image")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ImageSearch200Response official(String official) {

      this.official = official;
    return this;
  }

    /**
   * Official indicates if it&#39;s an official image.
   * @return official
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Official indicates if it's an official image.")

  public String getOfficial() {
    return official;
  }


  public void setOfficial(String official) {
    this.official = official;
  }


  public ImageSearch200Response stars(Long stars) {

      this.stars = stars;
    return this;
  }

    /**
   * Stars is the number of stars of the image.
   * @return stars
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Stars is the number of stars of the image.")

  public Long getStars() {
    return stars;
  }


  public void setStars(Long stars) {
    this.stars = stars;
  }


  public ImageSearch200Response tag(String tag) {

      this.tag = tag;
    return this;
  }

    /**
   * Tag is the image tag
   * @return tag
     **/
    @javax.annotation.Nullable
    @ApiModelProperty(value = "Tag is the image tag")

  public String getTag() {
    return tag;
  }


  public void setTag(String tag) {
    this.tag = tag;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ImageSearch200Response imageSearch200Response = (ImageSearch200Response) o;
    return Objects.equals(this.automated, imageSearch200Response.automated) &&
        Objects.equals(this.description, imageSearch200Response.description) &&
        Objects.equals(this.index, imageSearch200Response.index) &&
        Objects.equals(this.name, imageSearch200Response.name) &&
        Objects.equals(this.official, imageSearch200Response.official) &&
        Objects.equals(this.stars, imageSearch200Response.stars) &&
        Objects.equals(this.tag, imageSearch200Response.tag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(automated, description, index, name, official, stars, tag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ImageSearch200Response {\n");
    sb.append("    automated: ").append(toIndentedString(automated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    official: ").append(toIndentedString(official)).append("\n");
    sb.append("    stars: ").append(toIndentedString(stars)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
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
    openapiFields.add("Automated");
    openapiFields.add("Description");
    openapiFields.add("Index");
    openapiFields.add("Name");
    openapiFields.add("Official");
    openapiFields.add("Stars");
    openapiFields.add("Tag");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

    /**
     * Validates the JSON Object and throws an exception if issues found
     *
     * @param jsonObj JSON Object
     * @throws IOException if the JSON Object is invalid with respect to ImageSearch200Response
     */
    public static void validateJsonObject(JsonObject jsonObj) throws IOException {
        if (jsonObj == null) {
            if (ImageSearch200Response.openapiRequiredFields.isEmpty()) {
                return;
            } else { // has required fields
                throw new IllegalArgumentException(String.format("The required field(s) %s in ImageSearch200Response is not found in the empty JSON string", ImageSearch200Response.openapiRequiredFields.toString()));
            }
        }

        Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
        for (Entry<String, JsonElement> entry : entries) {
        if (!ImageSearch200Response.openapiFields.contains(entry.getKey())) {
            throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ImageSearch200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("Automated") != null && !jsonObj.get("Automated").isJsonNull()) && !jsonObj.get("Automated").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Automated` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Automated").toString()));
      }
      if ((jsonObj.get("Description") != null && !jsonObj.get("Description").isJsonNull()) && !jsonObj.get("Description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Description").toString()));
      }
      if ((jsonObj.get("Index") != null && !jsonObj.get("Index").isJsonNull()) && !jsonObj.get("Index").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Index` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Index").toString()));
      }
      if ((jsonObj.get("Name") != null && !jsonObj.get("Name").isJsonNull()) && !jsonObj.get("Name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Name").toString()));
      }
      if ((jsonObj.get("Official") != null && !jsonObj.get("Official").isJsonNull()) && !jsonObj.get("Official").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Official` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Official").toString()));
      }
      if ((jsonObj.get("Tag") != null && !jsonObj.get("Tag").isJsonNull()) && !jsonObj.get("Tag").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Tag` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Tag").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ImageSearch200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ImageSearch200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ImageSearch200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ImageSearch200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<ImageSearch200Response>() {
           @Override
           public void write(JsonWriter out, ImageSearch200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ImageSearch200Response read(JsonReader in) throws IOException {
               JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
               validateJsonObject(jsonObj);
               return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

    /**
     * Create an instance of ImageSearch200Response given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ImageSearch200Response
     * @throws IOException if the JSON string is invalid with respect to ImageSearch200Response
  */
  public static ImageSearch200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ImageSearch200Response.class);
  }

    /**
     * Convert an instance of ImageSearch200Response to an JSON string
     *
     * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


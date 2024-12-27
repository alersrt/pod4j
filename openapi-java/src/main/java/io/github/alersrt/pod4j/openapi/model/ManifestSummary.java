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
import io.github.alersrt.pod4j.openapi.model.AttestationProperties;
import io.github.alersrt.pod4j.openapi.model.Descriptor;
import io.github.alersrt.pod4j.openapi.model.ImageProperties;
import io.github.alersrt.pod4j.openapi.model.ManifestSummarySize;
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
 * ManifestSummary
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-27T23:15:58.977038016+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ManifestSummary implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AVAILABLE = "Available";
  @SerializedName(SERIALIZED_NAME_AVAILABLE)
  private Boolean available;

  public static final String SERIALIZED_NAME_DESCRIPTOR = "Descriptor";
  @SerializedName(SERIALIZED_NAME_DESCRIPTOR)
  private Descriptor descriptor;

  public static final String SERIALIZED_NAME_I_D = "ID";
  @SerializedName(SERIALIZED_NAME_I_D)
  private String ID;

  public static final String SERIALIZED_NAME_KIND = "Kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private ManifestSummarySize size;

  public static final String SERIALIZED_NAME_ATTESTATION_DATA = "AttestationData";
  @SerializedName(SERIALIZED_NAME_ATTESTATION_DATA)
  private AttestationProperties attestationData;

  public static final String SERIALIZED_NAME_IMAGE_DATA = "ImageData";
  @SerializedName(SERIALIZED_NAME_IMAGE_DATA)
  private ImageProperties imageData;

  public ManifestSummary() {
  }

  public ManifestSummary available(Boolean available) {
    this.available = available;
    return this;
  }

  /**
   * Indicates whether all the child content (image config, layers) is fully available locally
   * @return available
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public Boolean getAvailable() {
    return available;
  }

  public void setAvailable(Boolean available) {
    this.available = available;
  }


  public ManifestSummary descriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
    return this;
  }

  /**
   * Get descriptor
   * @return descriptor
   */
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  public Descriptor getDescriptor() {
    return descriptor;
  }

  public void setDescriptor(Descriptor descriptor) {
    this.descriptor = descriptor;
  }


  public ManifestSummary ID(String ID) {
    this.ID = ID;
    return this;
  }

  /**
   * ID is the content-addressable ID of an image and is the same as the digest of the image manifest.
   * @return ID
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }


  public ManifestSummary kind(String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Get kind
   * @return kind
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public String getKind() {
    return kind;
  }

  public void setKind(String kind) {
    this.kind = kind;
  }


  public ManifestSummary size(ManifestSummarySize size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @jakarta.annotation.Nonnull
  @NotNull
  @Valid

  public ManifestSummarySize getSize() {
    return size;
  }

  public void setSize(ManifestSummarySize size) {
    this.size = size;
  }


  public ManifestSummary attestationData(AttestationProperties attestationData) {
    this.attestationData = attestationData;
    return this;
  }

  /**
   * Get attestationData
   * @return attestationData
   */
  @jakarta.annotation.Nullable
  @Valid

  public AttestationProperties getAttestationData() {
    return attestationData;
  }

  public void setAttestationData(AttestationProperties attestationData) {
    this.attestationData = attestationData;
  }


  public ManifestSummary imageData(ImageProperties imageData) {
    this.imageData = imageData;
    return this;
  }

  /**
   * Get imageData
   * @return imageData
   */
  @jakarta.annotation.Nullable
  @Valid

  public ImageProperties getImageData() {
    return imageData;
  }

  public void setImageData(ImageProperties imageData) {
    this.imageData = imageData;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ManifestSummary manifestSummary = (ManifestSummary) o;
    return Objects.equals(this.available, manifestSummary.available) &&
        Objects.equals(this.descriptor, manifestSummary.descriptor) &&
        Objects.equals(this.ID, manifestSummary.ID) &&
        Objects.equals(this.kind, manifestSummary.kind) &&
        Objects.equals(this.size, manifestSummary.size) &&
        Objects.equals(this.attestationData, manifestSummary.attestationData) &&
        Objects.equals(this.imageData, manifestSummary.imageData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(available, descriptor, ID, kind, size, attestationData, imageData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ManifestSummary {\n");
    sb.append("    available: ").append(toIndentedString(available)).append("\n");
    sb.append("    descriptor: ").append(toIndentedString(descriptor)).append("\n");
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    attestationData: ").append(toIndentedString(attestationData)).append("\n");
    sb.append("    imageData: ").append(toIndentedString(imageData)).append("\n");
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
    openapiFields.add("Available");
    openapiFields.add("Descriptor");
    openapiFields.add("ID");
    openapiFields.add("Kind");
    openapiFields.add("Size");
    openapiFields.add("AttestationData");
    openapiFields.add("ImageData");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("Available");
    openapiRequiredFields.add("Descriptor");
    openapiRequiredFields.add("ID");
    openapiRequiredFields.add("Kind");
    openapiRequiredFields.add("Size");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ManifestSummary
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ManifestSummary.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ManifestSummary is not found in the empty JSON string", ManifestSummary.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ManifestSummary.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ManifestSummary` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ManifestSummary.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `Descriptor`
      Descriptor.validateJsonElement(jsonObj.get("Descriptor"));
      if (!jsonObj.get("ID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ID").toString()));
      }
      if (!jsonObj.get("Kind").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Kind` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Kind").toString()));
      }
      // validate the required field `Size`
      ManifestSummarySize.validateJsonElement(jsonObj.get("Size"));
      // validate the optional field `AttestationData`
      if (jsonObj.get("AttestationData") != null && !jsonObj.get("AttestationData").isJsonNull()) {
        AttestationProperties.validateJsonElement(jsonObj.get("AttestationData"));
      }
      // validate the optional field `ImageData`
      if (jsonObj.get("ImageData") != null && !jsonObj.get("ImageData").isJsonNull()) {
        ImageProperties.validateJsonElement(jsonObj.get("ImageData"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ManifestSummary.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ManifestSummary' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ManifestSummary> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ManifestSummary.class));

       return (TypeAdapter<T>) new TypeAdapter<ManifestSummary>() {
           @Override
           public void write(JsonWriter out, ManifestSummary value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ManifestSummary read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ManifestSummary given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ManifestSummary
   * @throws IOException if the JSON string is invalid with respect to ManifestSummary
   */
  public static ManifestSummary fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ManifestSummary.class);
  }

  /**
   * Convert an instance of ManifestSummary to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


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
 * AuthenticateOKBody authenticate o k body
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-12-28T02:16:23.826374396+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class AuthenticateOKBody implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_IDENTITY_TOKEN = "IdentityToken";
  @SerializedName(SERIALIZED_NAME_IDENTITY_TOKEN)
  private String identityToken;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public AuthenticateOKBody() {
  }

  public AuthenticateOKBody identityToken(String identityToken) {
    this.identityToken = identityToken;
    return this;
  }

  /**
   * An opaque token used to authenticate a user after a successful login
   * @return identityToken
   */
  @jakarta.annotation.Nonnull
  @NotNull

  public String getIdentityToken() {
    return identityToken;
  }

  public void setIdentityToken(String identityToken) {
    this.identityToken = identityToken;
  }


  public AuthenticateOKBody status(String status) {
    this.status = status;
    return this;
  }

  /**
   * The status of the authentication
   * @return status
   */
  @jakarta.annotation.Nonnull
  @NotNull

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
    AuthenticateOKBody authenticateOKBody = (AuthenticateOKBody) o;
    return Objects.equals(this.identityToken, authenticateOKBody.identityToken) &&
        Objects.equals(this.status, authenticateOKBody.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identityToken, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthenticateOKBody {\n");
    sb.append("    identityToken: ").append(toIndentedString(identityToken)).append("\n");
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
    openapiFields.add("IdentityToken");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("IdentityToken");
    openapiRequiredFields.add("Status");
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to AuthenticateOKBody
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!AuthenticateOKBody.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthenticateOKBody is not found in the empty JSON string", AuthenticateOKBody.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!AuthenticateOKBody.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthenticateOKBody` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : AuthenticateOKBody.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("IdentityToken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IdentityToken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IdentityToken").toString()));
      }
      if (!jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthenticateOKBody.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthenticateOKBody' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthenticateOKBody> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthenticateOKBody.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthenticateOKBody>() {
           @Override
           public void write(JsonWriter out, AuthenticateOKBody value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthenticateOKBody read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthenticateOKBody given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthenticateOKBody
   * @throws IOException if the JSON string is invalid with respect to AuthenticateOKBody
   */
  public static AuthenticateOKBody fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthenticateOKBody.class);
  }

  /**
   * Convert an instance of AuthenticateOKBody to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


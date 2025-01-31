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
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Objects;
import java.util.Set;

/**
 * AuthConfig contains authorization information for connecting to a Registry
 */
@ApiModel(description = "AuthConfig contains authorization information for connecting to a Registry")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class AuthConfig implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUTH = "auth";
  @SerializedName(SERIALIZED_NAME_AUTH)
  private String auth;

  public static final String SERIALIZED_NAME_EMAIL = "email";
  @SerializedName(SERIALIZED_NAME_EMAIL)
  private String email;

  public static final String SERIALIZED_NAME_IDENTITYTOKEN = "identitytoken";
  @SerializedName(SERIALIZED_NAME_IDENTITYTOKEN)
  private String identitytoken;

  public static final String SERIALIZED_NAME_PASSWORD = "password";
  @SerializedName(SERIALIZED_NAME_PASSWORD)
  private String password;

  public static final String SERIALIZED_NAME_REGISTRYTOKEN = "registrytoken";
  @SerializedName(SERIALIZED_NAME_REGISTRYTOKEN)
  private String registrytoken;

  public static final String SERIALIZED_NAME_SERVERADDRESS = "serveraddress";
  @SerializedName(SERIALIZED_NAME_SERVERADDRESS)
  private String serveraddress;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;

  public AuthConfig() {
  }

  public AuthConfig auth(String auth) {

    this.auth = auth;
    return this;
  }

  /**
   * Get auth
   * @return auth
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getAuth() {
    return auth;
  }


  public void setAuth(String auth) {
    this.auth = auth;
  }


  public AuthConfig email(String email) {

    this.email = email;
    return this;
  }

  /**
   * Email is an optional value associated with the username. This field is deprecated and will be removed in a later version of docker.
   * @return email
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Email is an optional value associated with the username. This field is deprecated and will be removed in a later version of docker.")

  public String getEmail() {
    return email;
  }


  public void setEmail(String email) {
    this.email = email;
  }


  public AuthConfig identitytoken(String identitytoken) {

    this.identitytoken = identitytoken;
    return this;
  }

  /**
   * IdentityToken is used to authenticate the user and get an access token for the registry.
   * @return identitytoken
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "IdentityToken is used to authenticate the user and get an access token for the registry.")

  public String getIdentitytoken() {
    return identitytoken;
  }


  public void setIdentitytoken(String identitytoken) {
    this.identitytoken = identitytoken;
  }


  public AuthConfig password(String password) {

    this.password = password;
    return this;
  }

  /**
   * Get password
   * @return password
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getPassword() {
    return password;
  }


  public void setPassword(String password) {
    this.password = password;
  }


  public AuthConfig registrytoken(String registrytoken) {

    this.registrytoken = registrytoken;
    return this;
  }

  /**
   * RegistryToken is a bearer token to be sent to a registry
   * @return registrytoken
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RegistryToken is a bearer token to be sent to a registry")

  public String getRegistrytoken() {
    return registrytoken;
  }


  public void setRegistrytoken(String registrytoken) {
    this.registrytoken = registrytoken;
  }


  public AuthConfig serveraddress(String serveraddress) {

    this.serveraddress = serveraddress;
    return this;
  }

  /**
   * Get serveraddress
   * @return serveraddress
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getServeraddress() {
    return serveraddress;
  }


  public void setServeraddress(String serveraddress) {
    this.serveraddress = serveraddress;
  }


  public AuthConfig username(String username) {

    this.username = username;
    return this;
  }

  /**
   * Get username
   * @return username
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AuthConfig authConfig = (AuthConfig) o;
    return Objects.equals(this.auth, authConfig.auth) &&
        Objects.equals(this.email, authConfig.email) &&
        Objects.equals(this.identitytoken, authConfig.identitytoken) &&
        Objects.equals(this.password, authConfig.password) &&
        Objects.equals(this.registrytoken, authConfig.registrytoken) &&
        Objects.equals(this.serveraddress, authConfig.serveraddress) &&
        Objects.equals(this.username, authConfig.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(auth, email, identitytoken, password, registrytoken, serveraddress, username);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AuthConfig {\n");
    sb.append("    auth: ").append(toIndentedString(auth)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    identitytoken: ").append(toIndentedString(identitytoken)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    registrytoken: ").append(toIndentedString(registrytoken)).append("\n");
    sb.append("    serveraddress: ").append(toIndentedString(serveraddress)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
    openapiFields.add("auth");
    openapiFields.add("email");
    openapiFields.add("identitytoken");
    openapiFields.add("password");
    openapiFields.add("registrytoken");
    openapiFields.add("serveraddress");
    openapiFields.add("username");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Object and throws an exception if issues found
   *
   * @param jsonObj JSON Object
   * @throws IOException if the JSON Object is invalid with respect to AuthConfig
   */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (AuthConfig.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in AuthConfig is not found in the empty JSON string", AuthConfig.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!AuthConfig.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `AuthConfig` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("auth") != null && !jsonObj.get("auth").isJsonNull()) && !jsonObj.get("auth").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `auth` to be a primitive type in the JSON string but got `%s`", jsonObj.get("auth").toString()));
      }
      if ((jsonObj.get("email") != null && !jsonObj.get("email").isJsonNull()) && !jsonObj.get("email").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `email` to be a primitive type in the JSON string but got `%s`", jsonObj.get("email").toString()));
      }
      if ((jsonObj.get("identitytoken") != null && !jsonObj.get("identitytoken").isJsonNull()) && !jsonObj.get("identitytoken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `identitytoken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("identitytoken").toString()));
      }
      if ((jsonObj.get("password") != null && !jsonObj.get("password").isJsonNull()) && !jsonObj.get("password").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `password` to be a primitive type in the JSON string but got `%s`", jsonObj.get("password").toString()));
      }
      if ((jsonObj.get("registrytoken") != null && !jsonObj.get("registrytoken").isJsonNull()) && !jsonObj.get("registrytoken").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `registrytoken` to be a primitive type in the JSON string but got `%s`", jsonObj.get("registrytoken").toString()));
      }
      if ((jsonObj.get("serveraddress") != null && !jsonObj.get("serveraddress").isJsonNull()) && !jsonObj.get("serveraddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `serveraddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("serveraddress").toString()));
      }
      if ((jsonObj.get("username") != null && !jsonObj.get("username").isJsonNull()) && !jsonObj.get("username").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `username` to be a primitive type in the JSON string but got `%s`", jsonObj.get("username").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!AuthConfig.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'AuthConfig' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<AuthConfig> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(AuthConfig.class));

       return (TypeAdapter<T>) new TypeAdapter<AuthConfig>() {
           @Override
           public void write(JsonWriter out, AuthConfig value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public AuthConfig read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of AuthConfig given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of AuthConfig
   * @throws IOException if the JSON string is invalid with respect to AuthConfig
  */
  public static AuthConfig fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, AuthConfig.class);
  }

  /**
   * Convert an instance of AuthConfig to an JSON string
   *
   * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


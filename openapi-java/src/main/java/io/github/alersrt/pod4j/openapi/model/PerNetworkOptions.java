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
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** PerNetworkOptions */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-26T18:24:48.119248545+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class PerNetworkOptions {
    public static final String SERIALIZED_NAME_ALIASES = "aliases";

    @SerializedName(SERIALIZED_NAME_ALIASES)
    private List<String> aliases = new ArrayList<>();

    public static final String SERIALIZED_NAME_INTERFACE_NAME = "interface_name";

    @SerializedName(SERIALIZED_NAME_INTERFACE_NAME)
    private String interfaceName;

    public static final String SERIALIZED_NAME_STATIC_IPS = "static_ips";

    @SerializedName(SERIALIZED_NAME_STATIC_IPS)
    private List<String> staticIps = new ArrayList<>();

    public static final String SERIALIZED_NAME_STATIC_MAC = "static_mac";

    @SerializedName(SERIALIZED_NAME_STATIC_MAC)
    private String staticMac;

    public PerNetworkOptions() {}

    public PerNetworkOptions aliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    public PerNetworkOptions addAliasesItem(String aliasesItem) {
        if (this.aliases == null) {
            this.aliases = new ArrayList<>();
        }
        this.aliases.add(aliasesItem);
        return this;
    }

    /**
     * Aliases contains a list of names which the dns server should resolve to this container.
     * Should only be set when DNSEnabled is true on the Network. If aliases are set but there is no
     * dns support for this network the network interface implementation should ignore this and NOT
     * error. Optional.
     *
     * @return aliases
     */
    @javax.annotation.Nullable
    public List<String> getAliases() {
        return aliases;
    }

    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public PerNetworkOptions interfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
        return this;
    }

    /**
     * InterfaceName for this container. Required in the backend. Optional in the frontend. Will be
     * filled with ethX (where X is a integer) when empty.
     *
     * @return interfaceName
     */
    @javax.annotation.Nullable
    public String getInterfaceName() {
        return interfaceName;
    }

    public void setInterfaceName(String interfaceName) {
        this.interfaceName = interfaceName;
    }

    public PerNetworkOptions staticIps(List<String> staticIps) {
        this.staticIps = staticIps;
        return this;
    }

    public PerNetworkOptions addStaticIpsItem(String staticIpsItem) {
        if (this.staticIps == null) {
            this.staticIps = new ArrayList<>();
        }
        this.staticIps.add(staticIpsItem);
        return this;
    }

    /**
     * StaticIPs for this container. Optional.
     *
     * @return staticIps
     */
    @javax.annotation.Nullable
    public List<String> getStaticIps() {
        return staticIps;
    }

    public void setStaticIps(List<String> staticIps) {
        this.staticIps = staticIps;
    }

    public PerNetworkOptions staticMac(String staticMac) {
        this.staticMac = staticMac;
        return this;
    }

    /**
     * StaticMac for this container. Optional.
     *
     * @return staticMac
     */
    @javax.annotation.Nullable
    public String getStaticMac() {
        return staticMac;
    }

    public void setStaticMac(String staticMac) {
        this.staticMac = staticMac;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PerNetworkOptions perNetworkOptions = (PerNetworkOptions) o;
        return Objects.equals(this.aliases, perNetworkOptions.aliases)
                && Objects.equals(this.interfaceName, perNetworkOptions.interfaceName)
                && Objects.equals(this.staticIps, perNetworkOptions.staticIps)
                && Objects.equals(this.staticMac, perNetworkOptions.staticMac);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aliases, interfaceName, staticIps, staticMac);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PerNetworkOptions {\n");
        sb.append("    aliases: ").append(toIndentedString(aliases)).append("\n");
        sb.append("    interfaceName: ").append(toIndentedString(interfaceName)).append("\n");
        sb.append("    staticIps: ").append(toIndentedString(staticIps)).append("\n");
        sb.append("    staticMac: ").append(toIndentedString(staticMac)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces (except the first
     * line).
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
        openapiFields.add("aliases");
        openapiFields.add("interface_name");
        openapiFields.add("static_ips");
        openapiFields.add("static_mac");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to PerNetworkOptions
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!PerNetworkOptions.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in PerNetworkOptions is not found in the"
                                        + " empty JSON string",
                                PerNetworkOptions.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!PerNetworkOptions.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `PerNetworkOptions` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        // ensure the optional json data is an array if present
        if (jsonObj.get("aliases") != null
                && !jsonObj.get("aliases").isJsonNull()
                && !jsonObj.get("aliases").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `aliases` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("aliases").toString()));
        }
        if ((jsonObj.get("interface_name") != null && !jsonObj.get("interface_name").isJsonNull())
                && !jsonObj.get("interface_name").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `interface_name` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("interface_name").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("static_ips") != null
                && !jsonObj.get("static_ips").isJsonNull()
                && !jsonObj.get("static_ips").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `static_ips` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("static_ips").toString()));
        }
        if ((jsonObj.get("static_mac") != null && !jsonObj.get("static_mac").isJsonNull())
                && !jsonObj.get("static_mac").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `static_mac` to be a primitive type in the JSON"
                                    + " string but got `%s`",
                            jsonObj.get("static_mac").toString()));
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!PerNetworkOptions.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'PerNetworkOptions' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<PerNetworkOptions> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(PerNetworkOptions.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<PerNetworkOptions>() {
                        @Override
                        public void write(JsonWriter out, PerNetworkOptions value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public PerNetworkOptions read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of PerNetworkOptions given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of PerNetworkOptions
     * @throws IOException if the JSON string is invalid with respect to PerNetworkOptions
     */
    public static PerNetworkOptions fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, PerNetworkOptions.class);
    }

    /**
     * Convert an instance of PerNetworkOptions to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

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
import io.github.alersrt.pod4j.openapi.model.Address;
import io.github.alersrt.pod4j.openapi.model.InspectAdditionalNetwork;
import io.github.alersrt.pod4j.openapi.model.InspectHostPort;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
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
 * InspectNetworkSettings holds information about the network settings of the container. Many fields are maintained only for compatibility with &#x60;docker inspect&#x60; and are unused within Libpod.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-18T19:55:00.918558451+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class InspectNetworkSettings {
  public static final String SERIALIZED_NAME_ADDITIONAL_M_A_C_ADDRESSES = "AdditionalMACAddresses";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_M_A_C_ADDRESSES)
  private List<String> additionalMACAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_BRIDGE = "Bridge";
  @SerializedName(SERIALIZED_NAME_BRIDGE)
  private String bridge;

  public static final String SERIALIZED_NAME_ENDPOINT_I_D = "EndpointID";
  @SerializedName(SERIALIZED_NAME_ENDPOINT_I_D)
  private String endpointID;

  public static final String SERIALIZED_NAME_GATEWAY = "Gateway";
  @SerializedName(SERIALIZED_NAME_GATEWAY)
  private String gateway;

  public static final String SERIALIZED_NAME_GLOBAL_I_PV6_ADDRESS = "GlobalIPv6Address";
  @SerializedName(SERIALIZED_NAME_GLOBAL_I_PV6_ADDRESS)
  private String globalIPv6Address;

  public static final String SERIALIZED_NAME_GLOBAL_I_PV6_PREFIX_LEN = "GlobalIPv6PrefixLen";
  @SerializedName(SERIALIZED_NAME_GLOBAL_I_PV6_PREFIX_LEN)
  private Long globalIPv6PrefixLen;

  public static final String SERIALIZED_NAME_HAIRPIN_MODE = "HairpinMode";
  @SerializedName(SERIALIZED_NAME_HAIRPIN_MODE)
  private Boolean hairpinMode;

  public static final String SERIALIZED_NAME_IP_ADDRESS = "IPAddress";
  @SerializedName(SERIALIZED_NAME_IP_ADDRESS)
  private String ipAddress;

  public static final String SERIALIZED_NAME_IP_PREFIX_LEN = "IPPrefixLen";
  @SerializedName(SERIALIZED_NAME_IP_PREFIX_LEN)
  private Long ipPrefixLen;

  public static final String SERIALIZED_NAME_IPV6_GATEWAY = "IPv6Gateway";
  @SerializedName(SERIALIZED_NAME_IPV6_GATEWAY)
  private String ipv6Gateway;

  public static final String SERIALIZED_NAME_LINK_LOCAL_I_PV6_ADDRESS = "LinkLocalIPv6Address";
  @SerializedName(SERIALIZED_NAME_LINK_LOCAL_I_PV6_ADDRESS)
  private String linkLocalIPv6Address;

  public static final String SERIALIZED_NAME_LINK_LOCAL_I_PV6_PREFIX_LEN = "LinkLocalIPv6PrefixLen";
  @SerializedName(SERIALIZED_NAME_LINK_LOCAL_I_PV6_PREFIX_LEN)
  private Long linkLocalIPv6PrefixLen;

  public static final String SERIALIZED_NAME_MAC_ADDRESS = "MacAddress";
  @SerializedName(SERIALIZED_NAME_MAC_ADDRESS)
  private String macAddress;

  public static final String SERIALIZED_NAME_NETWORKS = "Networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private Map<String, InspectAdditionalNetwork> networks = new HashMap<>();

  public static final String SERIALIZED_NAME_PORTS = "Ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private Map<String, List<InspectHostPort>> ports = new HashMap<>();

  public static final String SERIALIZED_NAME_SANDBOX_I_D = "SandboxID";
  @SerializedName(SERIALIZED_NAME_SANDBOX_I_D)
  private String sandboxID;

  public static final String SERIALIZED_NAME_SANDBOX_KEY = "SandboxKey";
  @SerializedName(SERIALIZED_NAME_SANDBOX_KEY)
  private String sandboxKey;

  public static final String SERIALIZED_NAME_SECONDARY_I_P_ADDRESSES = "SecondaryIPAddresses";
  @SerializedName(SERIALIZED_NAME_SECONDARY_I_P_ADDRESSES)
  private List<Address> secondaryIPAddresses = new ArrayList<>();

  public static final String SERIALIZED_NAME_SECONDARY_I_PV6_ADDRESSES = "SecondaryIPv6Addresses";
  @SerializedName(SERIALIZED_NAME_SECONDARY_I_PV6_ADDRESSES)
  private List<Address> secondaryIPv6Addresses = new ArrayList<>();

  public InspectNetworkSettings() {
  }

  public InspectNetworkSettings additionalMACAddresses(List<String> additionalMACAddresses) {
    this.additionalMACAddresses = additionalMACAddresses;
    return this;
  }

  public InspectNetworkSettings addAdditionalMACAddressesItem(String additionalMACAddressesItem) {
    if (this.additionalMACAddresses == null) {
      this.additionalMACAddresses = new ArrayList<>();
    }
    this.additionalMACAddresses.add(additionalMACAddressesItem);
    return this;
  }

  /**
   * AdditionalMacAddresses is a set of additional MAC Addresses beyond the first. CNI may configure more than one interface for a single network, which can cause this.
   * @return additionalMACAddresses
   */
  @javax.annotation.Nullable
  public List<String> getAdditionalMACAddresses() {
    return additionalMACAddresses;
  }

  public void setAdditionalMACAddresses(List<String> additionalMACAddresses) {
    this.additionalMACAddresses = additionalMACAddresses;
  }


  public InspectNetworkSettings bridge(String bridge) {
    this.bridge = bridge;
    return this;
  }

  /**
   * Get bridge
   * @return bridge
   */
  @javax.annotation.Nullable
  public String getBridge() {
    return bridge;
  }

  public void setBridge(String bridge) {
    this.bridge = bridge;
  }


  public InspectNetworkSettings endpointID(String endpointID) {
    this.endpointID = endpointID;
    return this;
  }

  /**
   * EndpointID is unused, maintained exclusively for compatibility.
   * @return endpointID
   */
  @javax.annotation.Nullable
  public String getEndpointID() {
    return endpointID;
  }

  public void setEndpointID(String endpointID) {
    this.endpointID = endpointID;
  }


  public InspectNetworkSettings gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

  /**
   * Gateway is the IP address of the gateway this network will use.
   * @return gateway
   */
  @javax.annotation.Nullable
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }


  public InspectNetworkSettings globalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
    return this;
  }

  /**
   * GlobalIPv6Address is the global-scope IPv6 Address for this network.
   * @return globalIPv6Address
   */
  @javax.annotation.Nullable
  public String getGlobalIPv6Address() {
    return globalIPv6Address;
  }

  public void setGlobalIPv6Address(String globalIPv6Address) {
    this.globalIPv6Address = globalIPv6Address;
  }


  public InspectNetworkSettings globalIPv6PrefixLen(Long globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
    return this;
  }

  /**
   * GlobalIPv6PrefixLen is the length of the subnet mask of this network.
   * @return globalIPv6PrefixLen
   */
  @javax.annotation.Nullable
  public Long getGlobalIPv6PrefixLen() {
    return globalIPv6PrefixLen;
  }

  public void setGlobalIPv6PrefixLen(Long globalIPv6PrefixLen) {
    this.globalIPv6PrefixLen = globalIPv6PrefixLen;
  }


  public InspectNetworkSettings hairpinMode(Boolean hairpinMode) {
    this.hairpinMode = hairpinMode;
    return this;
  }

  /**
   * Get hairpinMode
   * @return hairpinMode
   */
  @javax.annotation.Nullable
  public Boolean getHairpinMode() {
    return hairpinMode;
  }

  public void setHairpinMode(Boolean hairpinMode) {
    this.hairpinMode = hairpinMode;
  }


  public InspectNetworkSettings ipAddress(String ipAddress) {
    this.ipAddress = ipAddress;
    return this;
  }

  /**
   * IPAddress is the IP address for this network.
   * @return ipAddress
   */
  @javax.annotation.Nullable
  public String getIpAddress() {
    return ipAddress;
  }

  public void setIpAddress(String ipAddress) {
    this.ipAddress = ipAddress;
  }


  public InspectNetworkSettings ipPrefixLen(Long ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
    return this;
  }

  /**
   * IPPrefixLen is the length of the subnet mask of this network.
   * @return ipPrefixLen
   */
  @javax.annotation.Nullable
  public Long getIpPrefixLen() {
    return ipPrefixLen;
  }

  public void setIpPrefixLen(Long ipPrefixLen) {
    this.ipPrefixLen = ipPrefixLen;
  }


  public InspectNetworkSettings ipv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
    return this;
  }

  /**
   * IPv6Gateway is the IPv6 gateway this network will use.
   * @return ipv6Gateway
   */
  @javax.annotation.Nullable
  public String getIpv6Gateway() {
    return ipv6Gateway;
  }

  public void setIpv6Gateway(String ipv6Gateway) {
    this.ipv6Gateway = ipv6Gateway;
  }


  public InspectNetworkSettings linkLocalIPv6Address(String linkLocalIPv6Address) {
    this.linkLocalIPv6Address = linkLocalIPv6Address;
    return this;
  }

  /**
   * Get linkLocalIPv6Address
   * @return linkLocalIPv6Address
   */
  @javax.annotation.Nullable
  public String getLinkLocalIPv6Address() {
    return linkLocalIPv6Address;
  }

  public void setLinkLocalIPv6Address(String linkLocalIPv6Address) {
    this.linkLocalIPv6Address = linkLocalIPv6Address;
  }


  public InspectNetworkSettings linkLocalIPv6PrefixLen(Long linkLocalIPv6PrefixLen) {
    this.linkLocalIPv6PrefixLen = linkLocalIPv6PrefixLen;
    return this;
  }

  /**
   * Get linkLocalIPv6PrefixLen
   * @return linkLocalIPv6PrefixLen
   */
  @javax.annotation.Nullable
  public Long getLinkLocalIPv6PrefixLen() {
    return linkLocalIPv6PrefixLen;
  }

  public void setLinkLocalIPv6PrefixLen(Long linkLocalIPv6PrefixLen) {
    this.linkLocalIPv6PrefixLen = linkLocalIPv6PrefixLen;
  }


  public InspectNetworkSettings macAddress(String macAddress) {
    this.macAddress = macAddress;
    return this;
  }

  /**
   * MacAddress is the MAC address for the interface in this network.
   * @return macAddress
   */
  @javax.annotation.Nullable
  public String getMacAddress() {
    return macAddress;
  }

  public void setMacAddress(String macAddress) {
    this.macAddress = macAddress;
  }


  public InspectNetworkSettings networks(Map<String, InspectAdditionalNetwork> networks) {
    this.networks = networks;
    return this;
  }

  public InspectNetworkSettings putNetworksItem(String key, InspectAdditionalNetwork networksItem) {
    if (this.networks == null) {
      this.networks = new HashMap<>();
    }
    this.networks.put(key, networksItem);
    return this;
  }

  /**
   * Networks contains information on non-default networks this container has joined. It is a map of network name to network information.
   * @return networks
   */
  @javax.annotation.Nullable
  public Map<String, InspectAdditionalNetwork> getNetworks() {
    return networks;
  }

  public void setNetworks(Map<String, InspectAdditionalNetwork> networks) {
    this.networks = networks;
  }


  public InspectNetworkSettings ports(Map<String, List<InspectHostPort>> ports) {
    this.ports = ports;
    return this;
  }

  public InspectNetworkSettings putPortsItem(String key, List<InspectHostPort> portsItem) {
    if (this.ports == null) {
      this.ports = new HashMap<>();
    }
    this.ports.put(key, portsItem);
    return this;
  }

  /**
   * Get ports
   * @return ports
   */
  @javax.annotation.Nullable
  public Map<String, List<InspectHostPort>> getPorts() {
    return ports;
  }

  public void setPorts(Map<String, List<InspectHostPort>> ports) {
    this.ports = ports;
  }


  public InspectNetworkSettings sandboxID(String sandboxID) {
    this.sandboxID = sandboxID;
    return this;
  }

  /**
   * Get sandboxID
   * @return sandboxID
   */
  @javax.annotation.Nullable
  public String getSandboxID() {
    return sandboxID;
  }

  public void setSandboxID(String sandboxID) {
    this.sandboxID = sandboxID;
  }


  public InspectNetworkSettings sandboxKey(String sandboxKey) {
    this.sandboxKey = sandboxKey;
    return this;
  }

  /**
   * Get sandboxKey
   * @return sandboxKey
   */
  @javax.annotation.Nullable
  public String getSandboxKey() {
    return sandboxKey;
  }

  public void setSandboxKey(String sandboxKey) {
    this.sandboxKey = sandboxKey;
  }


  public InspectNetworkSettings secondaryIPAddresses(List<Address> secondaryIPAddresses) {
    this.secondaryIPAddresses = secondaryIPAddresses;
    return this;
  }

  public InspectNetworkSettings addSecondaryIPAddressesItem(Address secondaryIPAddressesItem) {
    if (this.secondaryIPAddresses == null) {
      this.secondaryIPAddresses = new ArrayList<>();
    }
    this.secondaryIPAddresses.add(secondaryIPAddressesItem);
    return this;
  }

  /**
   * SecondaryIPAddresses is a list of extra IP Addresses that the container has been assigned in this network.
   * @return secondaryIPAddresses
   */
  @javax.annotation.Nullable
  public List<Address> getSecondaryIPAddresses() {
    return secondaryIPAddresses;
  }

  public void setSecondaryIPAddresses(List<Address> secondaryIPAddresses) {
    this.secondaryIPAddresses = secondaryIPAddresses;
  }


  public InspectNetworkSettings secondaryIPv6Addresses(List<Address> secondaryIPv6Addresses) {
    this.secondaryIPv6Addresses = secondaryIPv6Addresses;
    return this;
  }

  public InspectNetworkSettings addSecondaryIPv6AddressesItem(Address secondaryIPv6AddressesItem) {
    if (this.secondaryIPv6Addresses == null) {
      this.secondaryIPv6Addresses = new ArrayList<>();
    }
    this.secondaryIPv6Addresses.add(secondaryIPv6AddressesItem);
    return this;
  }

  /**
   * SecondaryIPv6Addresses is a list of extra IPv6 Addresses that the container has been assigned in this network.
   * @return secondaryIPv6Addresses
   */
  @javax.annotation.Nullable
  public List<Address> getSecondaryIPv6Addresses() {
    return secondaryIPv6Addresses;
  }

  public void setSecondaryIPv6Addresses(List<Address> secondaryIPv6Addresses) {
    this.secondaryIPv6Addresses = secondaryIPv6Addresses;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InspectNetworkSettings inspectNetworkSettings = (InspectNetworkSettings) o;
    return Objects.equals(this.additionalMACAddresses, inspectNetworkSettings.additionalMACAddresses) &&
        Objects.equals(this.bridge, inspectNetworkSettings.bridge) &&
        Objects.equals(this.endpointID, inspectNetworkSettings.endpointID) &&
        Objects.equals(this.gateway, inspectNetworkSettings.gateway) &&
        Objects.equals(this.globalIPv6Address, inspectNetworkSettings.globalIPv6Address) &&
        Objects.equals(this.globalIPv6PrefixLen, inspectNetworkSettings.globalIPv6PrefixLen) &&
        Objects.equals(this.hairpinMode, inspectNetworkSettings.hairpinMode) &&
        Objects.equals(this.ipAddress, inspectNetworkSettings.ipAddress) &&
        Objects.equals(this.ipPrefixLen, inspectNetworkSettings.ipPrefixLen) &&
        Objects.equals(this.ipv6Gateway, inspectNetworkSettings.ipv6Gateway) &&
        Objects.equals(this.linkLocalIPv6Address, inspectNetworkSettings.linkLocalIPv6Address) &&
        Objects.equals(this.linkLocalIPv6PrefixLen, inspectNetworkSettings.linkLocalIPv6PrefixLen) &&
        Objects.equals(this.macAddress, inspectNetworkSettings.macAddress) &&
        Objects.equals(this.networks, inspectNetworkSettings.networks) &&
        Objects.equals(this.ports, inspectNetworkSettings.ports) &&
        Objects.equals(this.sandboxID, inspectNetworkSettings.sandboxID) &&
        Objects.equals(this.sandboxKey, inspectNetworkSettings.sandboxKey) &&
        Objects.equals(this.secondaryIPAddresses, inspectNetworkSettings.secondaryIPAddresses) &&
        Objects.equals(this.secondaryIPv6Addresses, inspectNetworkSettings.secondaryIPv6Addresses);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalMACAddresses, bridge, endpointID, gateway, globalIPv6Address, globalIPv6PrefixLen, hairpinMode, ipAddress, ipPrefixLen, ipv6Gateway, linkLocalIPv6Address, linkLocalIPv6PrefixLen, macAddress, networks, ports, sandboxID, sandboxKey, secondaryIPAddresses, secondaryIPv6Addresses);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InspectNetworkSettings {\n");
    sb.append("    additionalMACAddresses: ").append(toIndentedString(additionalMACAddresses)).append("\n");
    sb.append("    bridge: ").append(toIndentedString(bridge)).append("\n");
    sb.append("    endpointID: ").append(toIndentedString(endpointID)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    globalIPv6Address: ").append(toIndentedString(globalIPv6Address)).append("\n");
    sb.append("    globalIPv6PrefixLen: ").append(toIndentedString(globalIPv6PrefixLen)).append("\n");
    sb.append("    hairpinMode: ").append(toIndentedString(hairpinMode)).append("\n");
    sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
    sb.append("    ipPrefixLen: ").append(toIndentedString(ipPrefixLen)).append("\n");
    sb.append("    ipv6Gateway: ").append(toIndentedString(ipv6Gateway)).append("\n");
    sb.append("    linkLocalIPv6Address: ").append(toIndentedString(linkLocalIPv6Address)).append("\n");
    sb.append("    linkLocalIPv6PrefixLen: ").append(toIndentedString(linkLocalIPv6PrefixLen)).append("\n");
    sb.append("    macAddress: ").append(toIndentedString(macAddress)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    sandboxID: ").append(toIndentedString(sandboxID)).append("\n");
    sb.append("    sandboxKey: ").append(toIndentedString(sandboxKey)).append("\n");
    sb.append("    secondaryIPAddresses: ").append(toIndentedString(secondaryIPAddresses)).append("\n");
    sb.append("    secondaryIPv6Addresses: ").append(toIndentedString(secondaryIPv6Addresses)).append("\n");
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
    openapiFields.add("AdditionalMACAddresses");
    openapiFields.add("Bridge");
    openapiFields.add("EndpointID");
    openapiFields.add("Gateway");
    openapiFields.add("GlobalIPv6Address");
    openapiFields.add("GlobalIPv6PrefixLen");
    openapiFields.add("HairpinMode");
    openapiFields.add("IPAddress");
    openapiFields.add("IPPrefixLen");
    openapiFields.add("IPv6Gateway");
    openapiFields.add("LinkLocalIPv6Address");
    openapiFields.add("LinkLocalIPv6PrefixLen");
    openapiFields.add("MacAddress");
    openapiFields.add("Networks");
    openapiFields.add("Ports");
    openapiFields.add("SandboxID");
    openapiFields.add("SandboxKey");
    openapiFields.add("SecondaryIPAddresses");
    openapiFields.add("SecondaryIPv6Addresses");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to InspectNetworkSettings
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!InspectNetworkSettings.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in InspectNetworkSettings is not found in the empty JSON string", InspectNetworkSettings.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!InspectNetworkSettings.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `InspectNetworkSettings` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // ensure the optional json data is an array if present
      if (jsonObj.get("AdditionalMACAddresses") != null && !jsonObj.get("AdditionalMACAddresses").isJsonNull() && !jsonObj.get("AdditionalMACAddresses").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `AdditionalMACAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("AdditionalMACAddresses").toString()));
      }
      if ((jsonObj.get("Bridge") != null && !jsonObj.get("Bridge").isJsonNull()) && !jsonObj.get("Bridge").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Bridge` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Bridge").toString()));
      }
      if ((jsonObj.get("EndpointID") != null && !jsonObj.get("EndpointID").isJsonNull()) && !jsonObj.get("EndpointID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `EndpointID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("EndpointID").toString()));
      }
      if ((jsonObj.get("Gateway") != null && !jsonObj.get("Gateway").isJsonNull()) && !jsonObj.get("Gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Gateway").toString()));
      }
      if ((jsonObj.get("GlobalIPv6Address") != null && !jsonObj.get("GlobalIPv6Address").isJsonNull()) && !jsonObj.get("GlobalIPv6Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `GlobalIPv6Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("GlobalIPv6Address").toString()));
      }
      if ((jsonObj.get("IPAddress") != null && !jsonObj.get("IPAddress").isJsonNull()) && !jsonObj.get("IPAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPAddress").toString()));
      }
      if ((jsonObj.get("IPv6Gateway") != null && !jsonObj.get("IPv6Gateway").isJsonNull()) && !jsonObj.get("IPv6Gateway").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `IPv6Gateway` to be a primitive type in the JSON string but got `%s`", jsonObj.get("IPv6Gateway").toString()));
      }
      if ((jsonObj.get("LinkLocalIPv6Address") != null && !jsonObj.get("LinkLocalIPv6Address").isJsonNull()) && !jsonObj.get("LinkLocalIPv6Address").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `LinkLocalIPv6Address` to be a primitive type in the JSON string but got `%s`", jsonObj.get("LinkLocalIPv6Address").toString()));
      }
      if ((jsonObj.get("MacAddress") != null && !jsonObj.get("MacAddress").isJsonNull()) && !jsonObj.get("MacAddress").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `MacAddress` to be a primitive type in the JSON string but got `%s`", jsonObj.get("MacAddress").toString()));
      }
      if ((jsonObj.get("SandboxID") != null && !jsonObj.get("SandboxID").isJsonNull()) && !jsonObj.get("SandboxID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SandboxID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SandboxID").toString()));
      }
      if ((jsonObj.get("SandboxKey") != null && !jsonObj.get("SandboxKey").isJsonNull()) && !jsonObj.get("SandboxKey").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `SandboxKey` to be a primitive type in the JSON string but got `%s`", jsonObj.get("SandboxKey").toString()));
      }
      if (jsonObj.get("SecondaryIPAddresses") != null && !jsonObj.get("SecondaryIPAddresses").isJsonNull()) {
        JsonArray jsonArraysecondaryIPAddresses = jsonObj.getAsJsonArray("SecondaryIPAddresses");
        if (jsonArraysecondaryIPAddresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SecondaryIPAddresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SecondaryIPAddresses` to be an array in the JSON string but got `%s`", jsonObj.get("SecondaryIPAddresses").toString()));
          }

          // validate the optional field `SecondaryIPAddresses` (array)
          for (int i = 0; i < jsonArraysecondaryIPAddresses.size(); i++) {
            Address.validateJsonElement(jsonArraysecondaryIPAddresses.get(i));
          };
        }
      }
      if (jsonObj.get("SecondaryIPv6Addresses") != null && !jsonObj.get("SecondaryIPv6Addresses").isJsonNull()) {
        JsonArray jsonArraysecondaryIPv6Addresses = jsonObj.getAsJsonArray("SecondaryIPv6Addresses");
        if (jsonArraysecondaryIPv6Addresses != null) {
          // ensure the json data is an array
          if (!jsonObj.get("SecondaryIPv6Addresses").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `SecondaryIPv6Addresses` to be an array in the JSON string but got `%s`", jsonObj.get("SecondaryIPv6Addresses").toString()));
          }

          // validate the optional field `SecondaryIPv6Addresses` (array)
          for (int i = 0; i < jsonArraysecondaryIPv6Addresses.size(); i++) {
            Address.validateJsonElement(jsonArraysecondaryIPv6Addresses.get(i));
          };
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!InspectNetworkSettings.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'InspectNetworkSettings' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<InspectNetworkSettings> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(InspectNetworkSettings.class));

       return (TypeAdapter<T>) new TypeAdapter<InspectNetworkSettings>() {
           @Override
           public void write(JsonWriter out, InspectNetworkSettings value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public InspectNetworkSettings read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of InspectNetworkSettings given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of InspectNetworkSettings
   * @throws IOException if the JSON string is invalid with respect to InspectNetworkSettings
   */
  public static InspectNetworkSettings fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, InspectNetworkSettings.class);
  }

  /**
   * Convert an instance of InspectNetworkSettings to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


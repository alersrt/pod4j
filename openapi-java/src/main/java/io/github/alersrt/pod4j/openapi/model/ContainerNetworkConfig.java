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
import com.google.gson.JsonArray;
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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/** ContainerNetworkConfig contains information on a container&#39;s network configuration. */
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2024-11-26T18:24:48.119248545+07:00[Asia/Barnaul]",
        comments = "Generator version: 7.7.0")
public class ContainerNetworkConfig {
    public static final String SERIALIZED_NAME_NETWORKS = "Networks";

    @SerializedName(SERIALIZED_NAME_NETWORKS)
    private Map<String, PerNetworkOptions> networks = new HashMap<>();

    public static final String SERIALIZED_NAME_BASE_HOSTS_FILE = "base_hosts_file";

    @SerializedName(SERIALIZED_NAME_BASE_HOSTS_FILE)
    private String baseHostsFile;

    public static final String SERIALIZED_NAME_CNI_NETWORKS = "cni_networks";

    @SerializedName(SERIALIZED_NAME_CNI_NETWORKS)
    private List<String> cniNetworks = new ArrayList<>();

    public static final String SERIALIZED_NAME_DNS_OPTION = "dns_option";

    @SerializedName(SERIALIZED_NAME_DNS_OPTION)
    private List<String> dnsOption = new ArrayList<>();

    public static final String SERIALIZED_NAME_DNS_SEARCH = "dns_search";

    @SerializedName(SERIALIZED_NAME_DNS_SEARCH)
    private List<String> dnsSearch = new ArrayList<>();

    public static final String SERIALIZED_NAME_DNS_SERVER = "dns_server";

    @SerializedName(SERIALIZED_NAME_DNS_SERVER)
    private List<String> dnsServer = new ArrayList<>();

    public static final String SERIALIZED_NAME_EXPOSE = "expose";

    @SerializedName(SERIALIZED_NAME_EXPOSE)
    private Object expose;

    public static final String SERIALIZED_NAME_HOSTADD = "hostadd";

    @SerializedName(SERIALIZED_NAME_HOSTADD)
    private List<String> hostadd = new ArrayList<>();

    public static final String SERIALIZED_NAME_NETNS = "netns";

    @SerializedName(SERIALIZED_NAME_NETNS)
    private Namespace netns;

    public static final String SERIALIZED_NAME_NETWORK_OPTIONS = "network_options";

    @SerializedName(SERIALIZED_NAME_NETWORK_OPTIONS)
    private Map<String, List<String>> networkOptions = new HashMap<>();

    public static final String SERIALIZED_NAME_PORTMAPPINGS = "portmappings";

    @SerializedName(SERIALIZED_NAME_PORTMAPPINGS)
    private List<PortMapping> portmappings = new ArrayList<>();

    public static final String SERIALIZED_NAME_PUBLISH_IMAGE_PORTS = "publish_image_ports";

    @SerializedName(SERIALIZED_NAME_PUBLISH_IMAGE_PORTS)
    private Boolean publishImagePorts;

    public static final String SERIALIZED_NAME_USE_IMAGE_HOSTS = "use_image_hosts";

    @SerializedName(SERIALIZED_NAME_USE_IMAGE_HOSTS)
    private Boolean useImageHosts;

    public static final String SERIALIZED_NAME_USE_IMAGE_RESOLVE_CONF = "use_image_resolve_conf";

    @SerializedName(SERIALIZED_NAME_USE_IMAGE_RESOLVE_CONF)
    private Boolean useImageResolveConf;

    public ContainerNetworkConfig() {}

    public ContainerNetworkConfig networks(Map<String, PerNetworkOptions> networks) {
        this.networks = networks;
        return this;
    }

    public ContainerNetworkConfig putNetworksItem(String key, PerNetworkOptions networksItem) {
        if (this.networks == null) {
            this.networks = new HashMap<>();
        }
        this.networks.put(key, networksItem);
        return this;
    }

    /**
     * Map of networks names or ids that the container should join. You can request additional
     * settings for each network, you can set network aliases, static ips, static mac address and
     * the network interface name for this container on the specific network. If the map is empty
     * and the bridge network mode is set the container will be joined to the default network.
     * Optional.
     *
     * @return networks
     */
    @javax.annotation.Nullable
    public Map<String, PerNetworkOptions> getNetworks() {
        return networks;
    }

    public void setNetworks(Map<String, PerNetworkOptions> networks) {
        this.networks = networks;
    }

    public ContainerNetworkConfig baseHostsFile(String baseHostsFile) {
        this.baseHostsFile = baseHostsFile;
        return this;
    }

    /**
     * BaseHostsFile is the path to a hosts file, the entries from this file are added to the
     * containers hosts file. As special value \&quot;image\&quot; is allowed which uses the
     * /etc/hosts file from within the image and \&quot;none\&quot; which uses no base file at all.
     * If it is empty we should default to the base_hosts_file configuration in containers.conf.
     * Optional.
     *
     * @return baseHostsFile
     */
    @javax.annotation.Nullable
    public String getBaseHostsFile() {
        return baseHostsFile;
    }

    public void setBaseHostsFile(String baseHostsFile) {
        this.baseHostsFile = baseHostsFile;
    }

    public ContainerNetworkConfig cniNetworks(List<String> cniNetworks) {
        this.cniNetworks = cniNetworks;
        return this;
    }

    public ContainerNetworkConfig addCniNetworksItem(String cniNetworksItem) {
        if (this.cniNetworks == null) {
            this.cniNetworks = new ArrayList<>();
        }
        this.cniNetworks.add(cniNetworksItem);
        return this;
    }

    /**
     * CNINetworks is a list of CNI networks to join the container to. If this list is empty, the
     * default CNI network will be joined instead. If at least one entry is present, we will not
     * join the default network (unless it is part of this list). Only available if NetNS is set to
     * bridge. Optional. Deprecated: as of podman 4.0 use \&quot;Networks\&quot; instead.
     *
     * @return cniNetworks
     */
    @javax.annotation.Nullable
    public List<String> getCniNetworks() {
        return cniNetworks;
    }

    public void setCniNetworks(List<String> cniNetworks) {
        this.cniNetworks = cniNetworks;
    }

    public ContainerNetworkConfig dnsOption(List<String> dnsOption) {
        this.dnsOption = dnsOption;
        return this;
    }

    public ContainerNetworkConfig addDnsOptionItem(String dnsOptionItem) {
        if (this.dnsOption == null) {
            this.dnsOption = new ArrayList<>();
        }
        this.dnsOption.add(dnsOptionItem);
        return this;
    }

    /**
     * DNSOptions is a set of DNS options that will be used in the container&#39;s resolv.conf,
     * replacing the host&#39;s DNS options which are used by default. Conflicts with
     * UseImageResolvConf. Optional.
     *
     * @return dnsOption
     */
    @javax.annotation.Nullable
    public List<String> getDnsOption() {
        return dnsOption;
    }

    public void setDnsOption(List<String> dnsOption) {
        this.dnsOption = dnsOption;
    }

    public ContainerNetworkConfig dnsSearch(List<String> dnsSearch) {
        this.dnsSearch = dnsSearch;
        return this;
    }

    public ContainerNetworkConfig addDnsSearchItem(String dnsSearchItem) {
        if (this.dnsSearch == null) {
            this.dnsSearch = new ArrayList<>();
        }
        this.dnsSearch.add(dnsSearchItem);
        return this;
    }

    /**
     * DNSSearch is a set of DNS search domains that will be used in the container&#39;s
     * resolv.conf, replacing the host&#39;s DNS search domains which are used by default. Conflicts
     * with UseImageResolvConf. Optional.
     *
     * @return dnsSearch
     */
    @javax.annotation.Nullable
    public List<String> getDnsSearch() {
        return dnsSearch;
    }

    public void setDnsSearch(List<String> dnsSearch) {
        this.dnsSearch = dnsSearch;
    }

    public ContainerNetworkConfig dnsServer(List<String> dnsServer) {
        this.dnsServer = dnsServer;
        return this;
    }

    public ContainerNetworkConfig addDnsServerItem(String dnsServerItem) {
        if (this.dnsServer == null) {
            this.dnsServer = new ArrayList<>();
        }
        this.dnsServer.add(dnsServerItem);
        return this;
    }

    /**
     * DNSServers is a set of DNS servers that will be used in the container&#39;s resolv.conf,
     * replacing the host&#39;s DNS Servers which are used by default. Conflicts with
     * UseImageResolvConf. Optional.
     *
     * @return dnsServer
     */
    @javax.annotation.Nullable
    public List<String> getDnsServer() {
        return dnsServer;
    }

    public void setDnsServer(List<String> dnsServer) {
        this.dnsServer = dnsServer;
    }

    public ContainerNetworkConfig expose(Object expose) {
        this.expose = expose;
        return this;
    }

    /**
     * Expose is a number of ports that will be forwarded to the container if PublishExposedPorts is
     * set. Expose is a map of uint16 (port number) to a string representing protocol i.e
     * map[uint16]string. Allowed protocols are \&quot;tcp\&quot;, \&quot;udp\&quot;, and
     * \&quot;sctp\&quot;, or some combination of the three separated by commas. If protocol is set
     * to \&quot;\&quot; we will assume TCP. Only available if NetNS is set to Bridge or Slirp, and
     * PublishExposedPorts is set. Optional.
     *
     * @return expose
     */
    @javax.annotation.Nullable
    public Object getExpose() {
        return expose;
    }

    public void setExpose(Object expose) {
        this.expose = expose;
    }

    public ContainerNetworkConfig hostadd(List<String> hostadd) {
        this.hostadd = hostadd;
        return this;
    }

    public ContainerNetworkConfig addHostaddItem(String hostaddItem) {
        if (this.hostadd == null) {
            this.hostadd = new ArrayList<>();
        }
        this.hostadd.add(hostaddItem);
        return this;
    }

    /**
     * HostAdd is a set of hosts which will be added to the container&#39;s etc/hosts file.
     * Conflicts with UseImageHosts. Optional.
     *
     * @return hostadd
     */
    @javax.annotation.Nullable
    public List<String> getHostadd() {
        return hostadd;
    }

    public void setHostadd(List<String> hostadd) {
        this.hostadd = hostadd;
    }

    public ContainerNetworkConfig netns(Namespace netns) {
        this.netns = netns;
        return this;
    }

    /**
     * Get netns
     *
     * @return netns
     */
    @javax.annotation.Nullable
    public Namespace getNetns() {
        return netns;
    }

    public void setNetns(Namespace netns) {
        this.netns = netns;
    }

    public ContainerNetworkConfig networkOptions(Map<String, List<String>> networkOptions) {
        this.networkOptions = networkOptions;
        return this;
    }

    public ContainerNetworkConfig putNetworkOptionsItem(
            String key, List<String> networkOptionsItem) {
        if (this.networkOptions == null) {
            this.networkOptions = new HashMap<>();
        }
        this.networkOptions.put(key, networkOptionsItem);
        return this;
    }

    /**
     * NetworkOptions are additional options for each network Optional.
     *
     * @return networkOptions
     */
    @javax.annotation.Nullable
    public Map<String, List<String>> getNetworkOptions() {
        return networkOptions;
    }

    public void setNetworkOptions(Map<String, List<String>> networkOptions) {
        this.networkOptions = networkOptions;
    }

    public ContainerNetworkConfig portmappings(List<PortMapping> portmappings) {
        this.portmappings = portmappings;
        return this;
    }

    public ContainerNetworkConfig addPortmappingsItem(PortMapping portmappingsItem) {
        if (this.portmappings == null) {
            this.portmappings = new ArrayList<>();
        }
        this.portmappings.add(portmappingsItem);
        return this;
    }

    /**
     * PortBindings is a set of ports to map into the container. Only available if NetNS is set to
     * bridge, slirp, or pasta. Optional.
     *
     * @return portmappings
     */
    @javax.annotation.Nullable
    public List<PortMapping> getPortmappings() {
        return portmappings;
    }

    public void setPortmappings(List<PortMapping> portmappings) {
        this.portmappings = portmappings;
    }

    public ContainerNetworkConfig publishImagePorts(Boolean publishImagePorts) {
        this.publishImagePorts = publishImagePorts;
        return this;
    }

    /**
     * PublishExposedPorts will publish ports specified in the image to random unused ports
     * (guaranteed to be above 1024) on the host. This is based on ports set in Expose below, and
     * any ports specified by the Image (if one is given). Only available if NetNS is set to Bridge
     * or Slirp. Optional.
     *
     * @return publishImagePorts
     */
    @javax.annotation.Nullable
    public Boolean getPublishImagePorts() {
        return publishImagePorts;
    }

    public void setPublishImagePorts(Boolean publishImagePorts) {
        this.publishImagePorts = publishImagePorts;
    }

    public ContainerNetworkConfig useImageHosts(Boolean useImageHosts) {
        this.useImageHosts = useImageHosts;
        return this;
    }

    /**
     * UseImageHosts indicates that /etc/hosts should not be managed by Podman, and instead sourced
     * from the image. Conflicts with HostAdd. Optional.
     *
     * @return useImageHosts
     */
    @javax.annotation.Nullable
    public Boolean getUseImageHosts() {
        return useImageHosts;
    }

    public void setUseImageHosts(Boolean useImageHosts) {
        this.useImageHosts = useImageHosts;
    }

    public ContainerNetworkConfig useImageResolveConf(Boolean useImageResolveConf) {
        this.useImageResolveConf = useImageResolveConf;
        return this;
    }

    /**
     * UseImageResolvConf indicates that resolv.conf should not be managed by Podman, but instead
     * sourced from the image. Conflicts with DNSServer, DNSSearch, DNSOption. Optional.
     *
     * @return useImageResolveConf
     */
    @javax.annotation.Nullable
    public Boolean getUseImageResolveConf() {
        return useImageResolveConf;
    }

    public void setUseImageResolveConf(Boolean useImageResolveConf) {
        this.useImageResolveConf = useImageResolveConf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ContainerNetworkConfig containerNetworkConfig = (ContainerNetworkConfig) o;
        return Objects.equals(this.networks, containerNetworkConfig.networks)
                && Objects.equals(this.baseHostsFile, containerNetworkConfig.baseHostsFile)
                && Objects.equals(this.cniNetworks, containerNetworkConfig.cniNetworks)
                && Objects.equals(this.dnsOption, containerNetworkConfig.dnsOption)
                && Objects.equals(this.dnsSearch, containerNetworkConfig.dnsSearch)
                && Objects.equals(this.dnsServer, containerNetworkConfig.dnsServer)
                && Objects.equals(this.expose, containerNetworkConfig.expose)
                && Objects.equals(this.hostadd, containerNetworkConfig.hostadd)
                && Objects.equals(this.netns, containerNetworkConfig.netns)
                && Objects.equals(this.networkOptions, containerNetworkConfig.networkOptions)
                && Objects.equals(this.portmappings, containerNetworkConfig.portmappings)
                && Objects.equals(this.publishImagePorts, containerNetworkConfig.publishImagePorts)
                && Objects.equals(this.useImageHosts, containerNetworkConfig.useImageHosts)
                && Objects.equals(
                        this.useImageResolveConf, containerNetworkConfig.useImageResolveConf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                networks,
                baseHostsFile,
                cniNetworks,
                dnsOption,
                dnsSearch,
                dnsServer,
                expose,
                hostadd,
                netns,
                networkOptions,
                portmappings,
                publishImagePorts,
                useImageHosts,
                useImageResolveConf);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ContainerNetworkConfig {\n");
        sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
        sb.append("    baseHostsFile: ").append(toIndentedString(baseHostsFile)).append("\n");
        sb.append("    cniNetworks: ").append(toIndentedString(cniNetworks)).append("\n");
        sb.append("    dnsOption: ").append(toIndentedString(dnsOption)).append("\n");
        sb.append("    dnsSearch: ").append(toIndentedString(dnsSearch)).append("\n");
        sb.append("    dnsServer: ").append(toIndentedString(dnsServer)).append("\n");
        sb.append("    expose: ").append(toIndentedString(expose)).append("\n");
        sb.append("    hostadd: ").append(toIndentedString(hostadd)).append("\n");
        sb.append("    netns: ").append(toIndentedString(netns)).append("\n");
        sb.append("    networkOptions: ").append(toIndentedString(networkOptions)).append("\n");
        sb.append("    portmappings: ").append(toIndentedString(portmappings)).append("\n");
        sb.append("    publishImagePorts: ")
                .append(toIndentedString(publishImagePorts))
                .append("\n");
        sb.append("    useImageHosts: ").append(toIndentedString(useImageHosts)).append("\n");
        sb.append("    useImageResolveConf: ")
                .append(toIndentedString(useImageResolveConf))
                .append("\n");
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
        openapiFields.add("Networks");
        openapiFields.add("base_hosts_file");
        openapiFields.add("cni_networks");
        openapiFields.add("dns_option");
        openapiFields.add("dns_search");
        openapiFields.add("dns_server");
        openapiFields.add("expose");
        openapiFields.add("hostadd");
        openapiFields.add("netns");
        openapiFields.add("network_options");
        openapiFields.add("portmappings");
        openapiFields.add("publish_image_ports");
        openapiFields.add("use_image_hosts");
        openapiFields.add("use_image_resolve_conf");

        // a set of required properties/fields (JSON key names)
        openapiRequiredFields = new HashSet<String>();
    }

    /**
     * Validates the JSON Element and throws an exception if issues found
     *
     * @param jsonElement JSON Element
     * @throws IOException if the JSON Element is invalid with respect to ContainerNetworkConfig
     */
    public static void validateJsonElement(JsonElement jsonElement) throws IOException {
        if (jsonElement == null) {
            if (!ContainerNetworkConfig.openapiRequiredFields
                    .isEmpty()) { // has required fields but JSON element is null
                throw new IllegalArgumentException(
                        String.format(
                                "The required field(s) %s in ContainerNetworkConfig is not found in"
                                        + " the empty JSON string",
                                ContainerNetworkConfig.openapiRequiredFields.toString()));
            }
        }

        Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
        // check to see if the JSON string contains additional fields
        for (Map.Entry<String, JsonElement> entry : entries) {
            if (!ContainerNetworkConfig.openapiFields.contains(entry.getKey())) {
                throw new IllegalArgumentException(
                        String.format(
                                "The field `%s` in the JSON string is not defined in the"
                                        + " `ContainerNetworkConfig` properties. JSON: %s",
                                entry.getKey(), jsonElement.toString()));
            }
        }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
        if ((jsonObj.get("base_hosts_file") != null && !jsonObj.get("base_hosts_file").isJsonNull())
                && !jsonObj.get("base_hosts_file").isJsonPrimitive()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `base_hosts_file` to be a primitive type in the"
                                    + " JSON string but got `%s`",
                            jsonObj.get("base_hosts_file").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("cni_networks") != null
                && !jsonObj.get("cni_networks").isJsonNull()
                && !jsonObj.get("cni_networks").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `cni_networks` to be an array in the JSON string"
                                    + " but got `%s`",
                            jsonObj.get("cni_networks").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("dns_option") != null
                && !jsonObj.get("dns_option").isJsonNull()
                && !jsonObj.get("dns_option").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `dns_option` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("dns_option").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("dns_search") != null
                && !jsonObj.get("dns_search").isJsonNull()
                && !jsonObj.get("dns_search").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `dns_search` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("dns_search").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("dns_server") != null
                && !jsonObj.get("dns_server").isJsonNull()
                && !jsonObj.get("dns_server").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `dns_server` to be an array in the JSON string but"
                                    + " got `%s`",
                            jsonObj.get("dns_server").toString()));
        }
        // ensure the optional json data is an array if present
        if (jsonObj.get("hostadd") != null
                && !jsonObj.get("hostadd").isJsonNull()
                && !jsonObj.get("hostadd").isJsonArray()) {
            throw new IllegalArgumentException(
                    String.format(
                            "Expected the field `hostadd` to be an array in the JSON string but got"
                                    + " `%s`",
                            jsonObj.get("hostadd").toString()));
        }
        // validate the optional field `netns`
        if (jsonObj.get("netns") != null && !jsonObj.get("netns").isJsonNull()) {
            Namespace.validateJsonElement(jsonObj.get("netns"));
        }
        if (jsonObj.get("portmappings") != null && !jsonObj.get("portmappings").isJsonNull()) {
            JsonArray jsonArrayportmappings = jsonObj.getAsJsonArray("portmappings");
            if (jsonArrayportmappings != null) {
                // ensure the json data is an array
                if (!jsonObj.get("portmappings").isJsonArray()) {
                    throw new IllegalArgumentException(
                            String.format(
                                    "Expected the field `portmappings` to be an array in the JSON"
                                            + " string but got `%s`",
                                    jsonObj.get("portmappings").toString()));
                }

                // validate the optional field `portmappings` (array)
                for (int i = 0; i < jsonArrayportmappings.size(); i++) {
                    PortMapping.validateJsonElement(jsonArrayportmappings.get(i));
                }
                ;
            }
        }
    }

    public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
        @SuppressWarnings("unchecked")
        @Override
        public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
            if (!ContainerNetworkConfig.class.isAssignableFrom(type.getRawType())) {
                return null; // this class only serializes 'ContainerNetworkConfig' and its subtypes
            }
            final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
            final TypeAdapter<ContainerNetworkConfig> thisAdapter =
                    gson.getDelegateAdapter(this, TypeToken.get(ContainerNetworkConfig.class));

            return (TypeAdapter<T>)
                    new TypeAdapter<ContainerNetworkConfig>() {
                        @Override
                        public void write(JsonWriter out, ContainerNetworkConfig value)
                                throws IOException {
                            JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
                            elementAdapter.write(out, obj);
                        }

                        @Override
                        public ContainerNetworkConfig read(JsonReader in) throws IOException {
                            JsonElement jsonElement = elementAdapter.read(in);
                            validateJsonElement(jsonElement);
                            return thisAdapter.fromJsonTree(jsonElement);
                        }
                    }.nullSafe();
        }
    }

    /**
     * Create an instance of ContainerNetworkConfig given an JSON string
     *
     * @param jsonString JSON string
     * @return An instance of ContainerNetworkConfig
     * @throws IOException if the JSON string is invalid with respect to ContainerNetworkConfig
     */
    public static ContainerNetworkConfig fromJson(String jsonString) throws IOException {
        return JSON.getGson().fromJson(jsonString, ContainerNetworkConfig.class);
    }

    /**
     * Convert an instance of ContainerNetworkConfig to an JSON string
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }
}

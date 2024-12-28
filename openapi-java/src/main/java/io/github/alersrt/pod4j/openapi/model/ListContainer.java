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
import io.github.alersrt.pod4j.openapi.model.ContainerSize;
import io.github.alersrt.pod4j.openapi.model.ListContainerNamespaces;
import io.github.alersrt.pod4j.openapi.model.PortMapping;
import java.io.IOException;
import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
 * ListContainer describes a container suitable for listing
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", comments = "Generator version: 7.7.0")
public class ListContainer implements Serializable {
  private static final long serialVersionUID = 1L;

  public static final String SERIALIZED_NAME_AUTO_REMOVE = "AutoRemove";
  @SerializedName(SERIALIZED_NAME_AUTO_REMOVE)
  private Boolean autoRemove;

  public static final String SERIALIZED_NAME_CI_D_FILE = "CIDFile";
  @SerializedName(SERIALIZED_NAME_CI_D_FILE)
  private String ciDFile;

  public static final String SERIALIZED_NAME_COMMAND = "Command";
  @SerializedName(SERIALIZED_NAME_COMMAND)
  private List<String> command = new ArrayList<>();

  public static final String SERIALIZED_NAME_CREATED = "Created";
  @SerializedName(SERIALIZED_NAME_CREATED)
  private OffsetDateTime created;

  public static final String SERIALIZED_NAME_CREATED_AT = "CreatedAt";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private String createdAt;

  public static final String SERIALIZED_NAME_EXIT_CODE = "ExitCode";
  @SerializedName(SERIALIZED_NAME_EXIT_CODE)
  private Integer exitCode;

  public static final String SERIALIZED_NAME_EXITED = "Exited";
  @SerializedName(SERIALIZED_NAME_EXITED)
  private Boolean exited;

  public static final String SERIALIZED_NAME_EXITED_AT = "ExitedAt";
  @SerializedName(SERIALIZED_NAME_EXITED_AT)
  private Long exitedAt;

  public static final String SERIALIZED_NAME_EXPOSED_PORTS = "ExposedPorts";
  @SerializedName(SERIALIZED_NAME_EXPOSED_PORTS)
  private Object exposedPorts;

  public static final String SERIALIZED_NAME_ID = "Id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_IMAGE = "Image";
  @SerializedName(SERIALIZED_NAME_IMAGE)
  private String image;

  public static final String SERIALIZED_NAME_IMAGE_I_D = "ImageID";
  @SerializedName(SERIALIZED_NAME_IMAGE_I_D)
  private String imageID;

  public static final String SERIALIZED_NAME_IS_INFRA = "IsInfra";
  @SerializedName(SERIALIZED_NAME_IS_INFRA)
  private Boolean isInfra;

  public static final String SERIALIZED_NAME_LABELS = "Labels";
  @SerializedName(SERIALIZED_NAME_LABELS)
  private Map<String, String> labels = new HashMap<>();

  public static final String SERIALIZED_NAME_MOUNTS = "Mounts";
  @SerializedName(SERIALIZED_NAME_MOUNTS)
  private List<String> mounts = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAMES = "Names";
  @SerializedName(SERIALIZED_NAME_NAMES)
  private List<String> names = new ArrayList<>();

  public static final String SERIALIZED_NAME_NAMESPACES = "Namespaces";
  @SerializedName(SERIALIZED_NAME_NAMESPACES)
  private ListContainerNamespaces namespaces;

  public static final String SERIALIZED_NAME_NETWORKS = "Networks";
  @SerializedName(SERIALIZED_NAME_NETWORKS)
  private List<String> networks = new ArrayList<>();

  public static final String SERIALIZED_NAME_PID = "Pid";
  @SerializedName(SERIALIZED_NAME_PID)
  private Long pid;

  public static final String SERIALIZED_NAME_POD = "Pod";
  @SerializedName(SERIALIZED_NAME_POD)
  private String pod;

  public static final String SERIALIZED_NAME_POD_NAME = "PodName";
  @SerializedName(SERIALIZED_NAME_POD_NAME)
  private String podName;

  public static final String SERIALIZED_NAME_PORTS = "Ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<@Valid PortMapping> ports = new ArrayList<>();

  public static final String SERIALIZED_NAME_RESTARTS = "Restarts";
  @SerializedName(SERIALIZED_NAME_RESTARTS)
  private Integer restarts;

  public static final String SERIALIZED_NAME_SIZE = "Size";
  @SerializedName(SERIALIZED_NAME_SIZE)
  private ContainerSize size;

  public static final String SERIALIZED_NAME_STARTED_AT = "StartedAt";
  @SerializedName(SERIALIZED_NAME_STARTED_AT)
  private Long startedAt;

  public static final String SERIALIZED_NAME_STATE = "State";
  @SerializedName(SERIALIZED_NAME_STATE)
  private String state;

  public static final String SERIALIZED_NAME_STATUS = "Status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public ListContainer() {
  }

  public ListContainer autoRemove(Boolean autoRemove) {
    this.autoRemove = autoRemove;
    return this;
  }

  /**
   * AutoRemove
   * @return autoRemove
   */
  @jakarta.annotation.Nullable

  public Boolean getAutoRemove() {
    return autoRemove;
  }

  public void setAutoRemove(Boolean autoRemove) {
    this.autoRemove = autoRemove;
  }


  public ListContainer ciDFile(String ciDFile) {
    this.ciDFile = ciDFile;
    return this;
  }

  /**
   * CIDFile specified at creation time.
   * @return ciDFile
   */
  @jakarta.annotation.Nullable

  public String getCiDFile() {
    return ciDFile;
  }

  public void setCiDFile(String ciDFile) {
    this.ciDFile = ciDFile;
  }


  public ListContainer command(List<String> command) {
    this.command = command;
    return this;
  }

  public ListContainer addCommandItem(String commandItem) {
    if (this.command == null) {
      this.command = new ArrayList<>();
    }
    this.command.add(commandItem);
    return this;
  }

  /**
   * Container command
   * @return command
   */
  @jakarta.annotation.Nullable

  public List<String> getCommand() {
    return command;
  }

  public void setCommand(List<String> command) {
    this.command = command;
  }


  public ListContainer created(OffsetDateTime created) {
    this.created = created;
    return this;
  }

  /**
   * Container creation time
   * @return created
   */
  @jakarta.annotation.Nullable
  @Valid

  public OffsetDateTime getCreated() {
    return created;
  }

  public void setCreated(OffsetDateTime created) {
    this.created = created;
  }


  public ListContainer createdAt(String createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Human-readable container creation time.
   * @return createdAt
   */
  @jakarta.annotation.Nullable

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public ListContainer exitCode(Integer exitCode) {
    this.exitCode = exitCode;
    return this;
  }

  /**
   * If container has exited, the return code from the command
   * @return exitCode
   */
  @jakarta.annotation.Nullable

  public Integer getExitCode() {
    return exitCode;
  }

  public void setExitCode(Integer exitCode) {
    this.exitCode = exitCode;
  }


  public ListContainer exited(Boolean exited) {
    this.exited = exited;
    return this;
  }

  /**
   * If container has exited/stopped
   * @return exited
   */
  @jakarta.annotation.Nullable

  public Boolean getExited() {
    return exited;
  }

  public void setExited(Boolean exited) {
    this.exited = exited;
  }


  public ListContainer exitedAt(Long exitedAt) {
    this.exitedAt = exitedAt;
    return this;
  }

  /**
   * Time container exited
   * @return exitedAt
   */
  @jakarta.annotation.Nullable

  public Long getExitedAt() {
    return exitedAt;
  }

  public void setExitedAt(Long exitedAt) {
    this.exitedAt = exitedAt;
  }


  public ListContainer exposedPorts(Object exposedPorts) {
    this.exposedPorts = exposedPorts;
    return this;
  }

  /**
   * ExposedPorts contains the ports that are exposed but not forwarded, see Ports for forwarded ports. The key is the port number and the string slice contains the protocols, i.e. \&quot;tcp\&quot;, \&quot;udp\&quot; and \&quot;sctp\&quot;.
   * @return exposedPorts
   */
  @jakarta.annotation.Nullable

  public Object getExposedPorts() {
    return exposedPorts;
  }

  public void setExposedPorts(Object exposedPorts) {
    this.exposedPorts = exposedPorts;
  }


  public ListContainer id(String id) {
    this.id = id;
    return this;
  }

  /**
   * The unique identifier for the container
   * @return id
   */
  @jakarta.annotation.Nullable

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }


  public ListContainer image(String image) {
    this.image = image;
    return this;
  }

  /**
   * Container image
   * @return image
   */
  @jakarta.annotation.Nullable

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }


  public ListContainer imageID(String imageID) {
    this.imageID = imageID;
    return this;
  }

  /**
   * Container image ID
   * @return imageID
   */
  @jakarta.annotation.Nullable

  public String getImageID() {
    return imageID;
  }

  public void setImageID(String imageID) {
    this.imageID = imageID;
  }


  public ListContainer isInfra(Boolean isInfra) {
    this.isInfra = isInfra;
    return this;
  }

  /**
   * If this container is a Pod infra container
   * @return isInfra
   */
  @jakarta.annotation.Nullable

  public Boolean getIsInfra() {
    return isInfra;
  }

  public void setIsInfra(Boolean isInfra) {
    this.isInfra = isInfra;
  }


  public ListContainer labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ListContainer putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

  /**
   * Labels for container
   * @return labels
   */
  @jakarta.annotation.Nullable

  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }


  public ListContainer mounts(List<String> mounts) {
    this.mounts = mounts;
    return this;
  }

  public ListContainer addMountsItem(String mountsItem) {
    if (this.mounts == null) {
      this.mounts = new ArrayList<>();
    }
    this.mounts.add(mountsItem);
    return this;
  }

  /**
   * User volume mounts
   * @return mounts
   */
  @jakarta.annotation.Nullable

  public List<String> getMounts() {
    return mounts;
  }

  public void setMounts(List<String> mounts) {
    this.mounts = mounts;
  }


  public ListContainer names(List<String> names) {
    this.names = names;
    return this;
  }

  public ListContainer addNamesItem(String namesItem) {
    if (this.names == null) {
      this.names = new ArrayList<>();
    }
    this.names.add(namesItem);
    return this;
  }

  /**
   * The names assigned to the container
   * @return names
   */
  @jakarta.annotation.Nullable

  public List<String> getNames() {
    return names;
  }

  public void setNames(List<String> names) {
    this.names = names;
  }


  public ListContainer namespaces(ListContainerNamespaces namespaces) {
    this.namespaces = namespaces;
    return this;
  }

  /**
   * Get namespaces
   * @return namespaces
   */
  @jakarta.annotation.Nullable
  @Valid

  public ListContainerNamespaces getNamespaces() {
    return namespaces;
  }

  public void setNamespaces(ListContainerNamespaces namespaces) {
    this.namespaces = namespaces;
  }


  public ListContainer networks(List<String> networks) {
    this.networks = networks;
    return this;
  }

  public ListContainer addNetworksItem(String networksItem) {
    if (this.networks == null) {
      this.networks = new ArrayList<>();
    }
    this.networks.add(networksItem);
    return this;
  }

  /**
   * The network names assigned to the container
   * @return networks
   */
  @jakarta.annotation.Nullable

  public List<String> getNetworks() {
    return networks;
  }

  public void setNetworks(List<String> networks) {
    this.networks = networks;
  }


  public ListContainer pid(Long pid) {
    this.pid = pid;
    return this;
  }

  /**
   * The process id of the container
   * @return pid
   */
  @jakarta.annotation.Nullable

  public Long getPid() {
    return pid;
  }

  public void setPid(Long pid) {
    this.pid = pid;
  }


  public ListContainer pod(String pod) {
    this.pod = pod;
    return this;
  }

  /**
   * If the container is part of Pod, the Pod ID. Requires the pod boolean to be set
   * @return pod
   */
  @jakarta.annotation.Nullable

  public String getPod() {
    return pod;
  }

  public void setPod(String pod) {
    this.pod = pod;
  }


  public ListContainer podName(String podName) {
    this.podName = podName;
    return this;
  }

  /**
   * If the container is part of Pod, the Pod name. Requires the pod boolean to be set
   * @return podName
   */
  @jakarta.annotation.Nullable

  public String getPodName() {
    return podName;
  }

  public void setPodName(String podName) {
    this.podName = podName;
  }


  public ListContainer ports(List<@Valid PortMapping> ports) {
    this.ports = ports;
    return this;
  }

  public ListContainer addPortsItem(PortMapping portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<>();
    }
    this.ports.add(portsItem);
    return this;
  }

  /**
   * Port mappings
   * @return ports
   */
  @jakarta.annotation.Nullable
  @Valid

  public List<@Valid PortMapping> getPorts() {
    return ports;
  }

  public void setPorts(List<@Valid PortMapping> ports) {
    this.ports = ports;
  }


  public ListContainer restarts(Integer restarts) {
    this.restarts = restarts;
    return this;
  }

  /**
   * Restarts is how many times the container was restarted by its restart policy. This is NOT incremented by normal container restarts (only by restart policy).
   * @return restarts
   */
  @jakarta.annotation.Nullable

  public Integer getRestarts() {
    return restarts;
  }

  public void setRestarts(Integer restarts) {
    this.restarts = restarts;
  }


  public ListContainer size(ContainerSize size) {
    this.size = size;
    return this;
  }

  /**
   * Get size
   * @return size
   */
  @jakarta.annotation.Nullable
  @Valid

  public ContainerSize getSize() {
    return size;
  }

  public void setSize(ContainerSize size) {
    this.size = size;
  }


  public ListContainer startedAt(Long startedAt) {
    this.startedAt = startedAt;
    return this;
  }

  /**
   * Time when container started
   * @return startedAt
   */
  @jakarta.annotation.Nullable

  public Long getStartedAt() {
    return startedAt;
  }

  public void setStartedAt(Long startedAt) {
    this.startedAt = startedAt;
  }


  public ListContainer state(String state) {
    this.state = state;
    return this;
  }

  /**
   * State of container
   * @return state
   */
  @jakarta.annotation.Nullable

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }


  public ListContainer status(String status) {
    this.status = status;
    return this;
  }

  /**
   * Status is a human-readable approximation of a duration for json output
   * @return status
   */
  @jakarta.annotation.Nullable

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
    ListContainer listContainer = (ListContainer) o;
    return Objects.equals(this.autoRemove, listContainer.autoRemove) &&
        Objects.equals(this.ciDFile, listContainer.ciDFile) &&
        Objects.equals(this.command, listContainer.command) &&
        Objects.equals(this.created, listContainer.created) &&
        Objects.equals(this.createdAt, listContainer.createdAt) &&
        Objects.equals(this.exitCode, listContainer.exitCode) &&
        Objects.equals(this.exited, listContainer.exited) &&
        Objects.equals(this.exitedAt, listContainer.exitedAt) &&
        Objects.equals(this.exposedPorts, listContainer.exposedPorts) &&
        Objects.equals(this.id, listContainer.id) &&
        Objects.equals(this.image, listContainer.image) &&
        Objects.equals(this.imageID, listContainer.imageID) &&
        Objects.equals(this.isInfra, listContainer.isInfra) &&
        Objects.equals(this.labels, listContainer.labels) &&
        Objects.equals(this.mounts, listContainer.mounts) &&
        Objects.equals(this.names, listContainer.names) &&
        Objects.equals(this.namespaces, listContainer.namespaces) &&
        Objects.equals(this.networks, listContainer.networks) &&
        Objects.equals(this.pid, listContainer.pid) &&
        Objects.equals(this.pod, listContainer.pod) &&
        Objects.equals(this.podName, listContainer.podName) &&
        Objects.equals(this.ports, listContainer.ports) &&
        Objects.equals(this.restarts, listContainer.restarts) &&
        Objects.equals(this.size, listContainer.size) &&
        Objects.equals(this.startedAt, listContainer.startedAt) &&
        Objects.equals(this.state, listContainer.state) &&
        Objects.equals(this.status, listContainer.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoRemove, ciDFile, command, created, createdAt, exitCode, exited, exitedAt, exposedPorts, id, image, imageID, isInfra, labels, mounts, names, namespaces, networks, pid, pod, podName, ports, restarts, size, startedAt, state, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ListContainer {\n");
    sb.append("    autoRemove: ").append(toIndentedString(autoRemove)).append("\n");
    sb.append("    ciDFile: ").append(toIndentedString(ciDFile)).append("\n");
    sb.append("    command: ").append(toIndentedString(command)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    exitCode: ").append(toIndentedString(exitCode)).append("\n");
    sb.append("    exited: ").append(toIndentedString(exited)).append("\n");
    sb.append("    exitedAt: ").append(toIndentedString(exitedAt)).append("\n");
    sb.append("    exposedPorts: ").append(toIndentedString(exposedPorts)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageID: ").append(toIndentedString(imageID)).append("\n");
    sb.append("    isInfra: ").append(toIndentedString(isInfra)).append("\n");
    sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
    sb.append("    mounts: ").append(toIndentedString(mounts)).append("\n");
    sb.append("    names: ").append(toIndentedString(names)).append("\n");
    sb.append("    namespaces: ").append(toIndentedString(namespaces)).append("\n");
    sb.append("    networks: ").append(toIndentedString(networks)).append("\n");
    sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
    sb.append("    pod: ").append(toIndentedString(pod)).append("\n");
    sb.append("    podName: ").append(toIndentedString(podName)).append("\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    restarts: ").append(toIndentedString(restarts)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    startedAt: ").append(toIndentedString(startedAt)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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
    openapiFields.add("AutoRemove");
    openapiFields.add("CIDFile");
    openapiFields.add("Command");
    openapiFields.add("Created");
    openapiFields.add("CreatedAt");
    openapiFields.add("ExitCode");
    openapiFields.add("Exited");
    openapiFields.add("ExitedAt");
    openapiFields.add("ExposedPorts");
    openapiFields.add("Id");
    openapiFields.add("Image");
    openapiFields.add("ImageID");
    openapiFields.add("IsInfra");
    openapiFields.add("Labels");
    openapiFields.add("Mounts");
    openapiFields.add("Names");
    openapiFields.add("Namespaces");
    openapiFields.add("Networks");
    openapiFields.add("Pid");
    openapiFields.add("Pod");
    openapiFields.add("PodName");
    openapiFields.add("Ports");
    openapiFields.add("Restarts");
    openapiFields.add("Size");
    openapiFields.add("StartedAt");
    openapiFields.add("State");
    openapiFields.add("Status");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

  /**
   * Validates the JSON Element and throws an exception if issues found
   *
   * @param jsonElement JSON Element
   * @throws IOException if the JSON Element is invalid with respect to ListContainer
   */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!ListContainer.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ListContainer is not found in the empty JSON string", ListContainer.openapiRequiredFields.toString()));
        }
      }

      Set<Map.Entry<String, JsonElement>> entries = jsonElement.getAsJsonObject().entrySet();
      // check to see if the JSON string contains additional fields
      for (Map.Entry<String, JsonElement> entry : entries) {
        if (!ListContainer.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ListContainer` properties. JSON: %s", entry.getKey(), jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if ((jsonObj.get("CIDFile") != null && !jsonObj.get("CIDFile").isJsonNull()) && !jsonObj.get("CIDFile").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CIDFile` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CIDFile").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Command") != null && !jsonObj.get("Command").isJsonNull() && !jsonObj.get("Command").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Command` to be an array in the JSON string but got `%s`", jsonObj.get("Command").toString()));
      }
      if ((jsonObj.get("CreatedAt") != null && !jsonObj.get("CreatedAt").isJsonNull()) && !jsonObj.get("CreatedAt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `CreatedAt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("CreatedAt").toString()));
      }
      if ((jsonObj.get("Id") != null && !jsonObj.get("Id").isJsonNull()) && !jsonObj.get("Id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Id").toString()));
      }
      if ((jsonObj.get("Image") != null && !jsonObj.get("Image").isJsonNull()) && !jsonObj.get("Image").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Image` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Image").toString()));
      }
      if ((jsonObj.get("ImageID") != null && !jsonObj.get("ImageID").isJsonNull()) && !jsonObj.get("ImageID").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ImageID` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ImageID").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Mounts") != null && !jsonObj.get("Mounts").isJsonNull() && !jsonObj.get("Mounts").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Mounts` to be an array in the JSON string but got `%s`", jsonObj.get("Mounts").toString()));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Names") != null && !jsonObj.get("Names").isJsonNull() && !jsonObj.get("Names").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Names` to be an array in the JSON string but got `%s`", jsonObj.get("Names").toString()));
      }
      // validate the optional field `Namespaces`
      if (jsonObj.get("Namespaces") != null && !jsonObj.get("Namespaces").isJsonNull()) {
        ListContainerNamespaces.validateJsonElement(jsonObj.get("Namespaces"));
      }
      // ensure the optional json data is an array if present
      if (jsonObj.get("Networks") != null && !jsonObj.get("Networks").isJsonNull() && !jsonObj.get("Networks").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `Networks` to be an array in the JSON string but got `%s`", jsonObj.get("Networks").toString()));
      }
      if ((jsonObj.get("Pod") != null && !jsonObj.get("Pod").isJsonNull()) && !jsonObj.get("Pod").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Pod` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Pod").toString()));
      }
      if ((jsonObj.get("PodName") != null && !jsonObj.get("PodName").isJsonNull()) && !jsonObj.get("PodName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `PodName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("PodName").toString()));
      }
      if (jsonObj.get("Ports") != null && !jsonObj.get("Ports").isJsonNull()) {
        JsonArray jsonArrayports = jsonObj.getAsJsonArray("Ports");
        if (jsonArrayports != null) {
          // ensure the json data is an array
          if (!jsonObj.get("Ports").isJsonArray()) {
            throw new IllegalArgumentException(String.format("Expected the field `Ports` to be an array in the JSON string but got `%s`", jsonObj.get("Ports").toString()));
          }

          // validate the optional field `Ports` (array)
          for (int i = 0; i < jsonArrayports.size(); i++) {
            PortMapping.validateJsonElement(jsonArrayports.get(i));
          };
        }
      }
      // validate the optional field `Size`
      if (jsonObj.get("Size") != null && !jsonObj.get("Size").isJsonNull()) {
        ContainerSize.validateJsonElement(jsonObj.get("Size"));
      }
      if ((jsonObj.get("State") != null && !jsonObj.get("State").isJsonNull()) && !jsonObj.get("State").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `State` to be a primitive type in the JSON string but got `%s`", jsonObj.get("State").toString()));
      }
      if ((jsonObj.get("Status") != null && !jsonObj.get("Status").isJsonNull()) && !jsonObj.get("Status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `Status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("Status").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ListContainer.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ListContainer' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ListContainer> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ListContainer.class));

       return (TypeAdapter<T>) new TypeAdapter<ListContainer>() {
           @Override
           public void write(JsonWriter out, ListContainer value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ListContainer read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             return thisAdapter.fromJsonTree(jsonElement);
           }

       }.nullSafe();
    }
  }

  /**
   * Create an instance of ListContainer given an JSON string
   *
   * @param jsonString JSON string
   * @return An instance of ListContainer
   * @throws IOException if the JSON string is invalid with respect to ListContainer
   */
  public static ListContainer fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ListContainer.class);
  }

  /**
   * Convert an instance of ListContainer to an JSON string
   *
   * @return JSON string
   */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}


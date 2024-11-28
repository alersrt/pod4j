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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.github.alersrt.pod4j.openapi.ApiClient;
import jakarta.validation.Valid;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;
/**
 * ContainerSecurityConfig is a container&#39;s security features, including SELinux, Apparmor, and Seccomp.
 */
@JsonPropertyOrder({
  ContainerSecurityConfig.JSON_PROPERTY_APPARMOR_PROFILE,
  ContainerSecurityConfig.JSON_PROPERTY_CAP_ADD,
  ContainerSecurityConfig.JSON_PROPERTY_CAP_DROP,
  ContainerSecurityConfig.JSON_PROPERTY_GROUPS,
  ContainerSecurityConfig.JSON_PROPERTY_IDMAPPINGS,
  ContainerSecurityConfig.JSON_PROPERTY_LABEL_NESTED,
  ContainerSecurityConfig.JSON_PROPERTY_MASK,
  ContainerSecurityConfig.JSON_PROPERTY_NO_NEW_PRIVILEGES,
  ContainerSecurityConfig.JSON_PROPERTY_PRIVILEGED,
  ContainerSecurityConfig.JSON_PROPERTY_PROCFS_OPTS,
  ContainerSecurityConfig.JSON_PROPERTY_READ_ONLY_FILESYSTEM,
  ContainerSecurityConfig.JSON_PROPERTY_READ_WRITE_TMPFS,
  ContainerSecurityConfig.JSON_PROPERTY_SECCOMP_POLICY,
  ContainerSecurityConfig.JSON_PROPERTY_SECCOMP_PROFILE_PATH,
  ContainerSecurityConfig.JSON_PROPERTY_SELINUX_OPTS,
  ContainerSecurityConfig.JSON_PROPERTY_UMASK,
  ContainerSecurityConfig.JSON_PROPERTY_UNMASK,
  ContainerSecurityConfig.JSON_PROPERTY_USER,
  ContainerSecurityConfig.JSON_PROPERTY_USERNS
})
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-11-28T20:49:08.759389952+07:00[Asia/Barnaul]", comments = "Generator version: 7.7.0")
public class ContainerSecurityConfig {
  public static final String JSON_PROPERTY_APPARMOR_PROFILE = "apparmor_profile";
  private String apparmorProfile;

  public static final String JSON_PROPERTY_CAP_ADD = "cap_add";
  private List<String> capAdd = new ArrayList<>();

  public static final String JSON_PROPERTY_CAP_DROP = "cap_drop";
  private List<String> capDrop = new ArrayList<>();

  public static final String JSON_PROPERTY_GROUPS = "groups";
  private List<String> groups = new ArrayList<>();

  public static final String JSON_PROPERTY_IDMAPPINGS = "idmappings";
  private IDMappingOptions idmappings;

  public static final String JSON_PROPERTY_LABEL_NESTED = "label_nested";
  private Boolean labelNested;

  public static final String JSON_PROPERTY_MASK = "mask";
  private List<String> mask = new ArrayList<>();

  public static final String JSON_PROPERTY_NO_NEW_PRIVILEGES = "no_new_privileges";
  private Boolean noNewPrivileges;

  public static final String JSON_PROPERTY_PRIVILEGED = "privileged";
  private Boolean privileged;

  public static final String JSON_PROPERTY_PROCFS_OPTS = "procfs_opts";
  private List<String> procfsOpts = new ArrayList<>();

  public static final String JSON_PROPERTY_READ_ONLY_FILESYSTEM = "read_only_filesystem";
  private Boolean readOnlyFilesystem;

  public static final String JSON_PROPERTY_READ_WRITE_TMPFS = "read_write_tmpfs";
  private Boolean readWriteTmpfs;

  public static final String JSON_PROPERTY_SECCOMP_POLICY = "seccomp_policy";
  private String seccompPolicy;

  public static final String JSON_PROPERTY_SECCOMP_PROFILE_PATH = "seccomp_profile_path";
  private String seccompProfilePath;

  public static final String JSON_PROPERTY_SELINUX_OPTS = "selinux_opts";
  private List<String> selinuxOpts = new ArrayList<>();

  public static final String JSON_PROPERTY_UMASK = "umask";
  private String umask;

  public static final String JSON_PROPERTY_UNMASK = "unmask";
  private List<String> unmask = new ArrayList<>();

  public static final String JSON_PROPERTY_USER = "user";
  private String user;

  public static final String JSON_PROPERTY_USERNS = "userns";
  private Namespace userns;

  public ContainerSecurityConfig() { 
  }

  public ContainerSecurityConfig apparmorProfile(String apparmorProfile) {
    this.apparmorProfile = apparmorProfile;
    return this;
  }

  /**
   * ApparmorProfile is the name of the Apparmor profile the container will use. Optional.
   * @return apparmorProfile
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_APPARMOR_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getApparmorProfile() {
    return apparmorProfile;
  }


  @JsonProperty(JSON_PROPERTY_APPARMOR_PROFILE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setApparmorProfile(String apparmorProfile) {
    this.apparmorProfile = apparmorProfile;
  }


  public ContainerSecurityConfig capAdd(List<String> capAdd) {
    this.capAdd = capAdd;
    return this;
  }

  public ContainerSecurityConfig addCapAddItem(String capAddItem) {
    if (this.capAdd == null) {
      this.capAdd = new ArrayList<>();
    }
    this.capAdd.add(capAddItem);
    return this;
  }

  /**
   * CapAdd are capabilities which will be added to the container. Conflicts with Privileged. Optional.
   * @return capAdd
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CAP_ADD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCapAdd() {
    return capAdd;
  }


  @JsonProperty(JSON_PROPERTY_CAP_ADD)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapAdd(List<String> capAdd) {
    this.capAdd = capAdd;
  }


  public ContainerSecurityConfig capDrop(List<String> capDrop) {
    this.capDrop = capDrop;
    return this;
  }

  public ContainerSecurityConfig addCapDropItem(String capDropItem) {
    if (this.capDrop == null) {
      this.capDrop = new ArrayList<>();
    }
    this.capDrop.add(capDropItem);
    return this;
  }

  /**
   * CapDrop are capabilities which will be removed from the container. Conflicts with Privileged. Optional.
   * @return capDrop
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_CAP_DROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getCapDrop() {
    return capDrop;
  }


  @JsonProperty(JSON_PROPERTY_CAP_DROP)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCapDrop(List<String> capDrop) {
    this.capDrop = capDrop;
  }


  public ContainerSecurityConfig groups(List<String> groups) {
    this.groups = groups;
    return this;
  }

  public ContainerSecurityConfig addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<>();
    }
    this.groups.add(groupsItem);
    return this;
  }

  /**
   * Groups are a list of supplemental groups the container&#39;s user will be granted access to. Optional.
   * @return groups
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getGroups() {
    return groups;
  }


  @JsonProperty(JSON_PROPERTY_GROUPS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public ContainerSecurityConfig idmappings(IDMappingOptions idmappings) {
    this.idmappings = idmappings;
    return this;
  }

  /**
   * Get idmappings
   * @return idmappings
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_IDMAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public IDMappingOptions getIdmappings() {
    return idmappings;
  }


  @JsonProperty(JSON_PROPERTY_IDMAPPINGS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIdmappings(IDMappingOptions idmappings) {
    this.idmappings = idmappings;
  }


  public ContainerSecurityConfig labelNested(Boolean labelNested) {
    this.labelNested = labelNested;
    return this;
  }

  /**
   * LabelNested indicates whether or not the container is allowed to run fully nested containers including SELinux labelling. Optional.
   * @return labelNested
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_LABEL_NESTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getLabelNested() {
    return labelNested;
  }


  @JsonProperty(JSON_PROPERTY_LABEL_NESTED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setLabelNested(Boolean labelNested) {
    this.labelNested = labelNested;
  }


  public ContainerSecurityConfig mask(List<String> mask) {
    this.mask = mask;
    return this;
  }

  public ContainerSecurityConfig addMaskItem(String maskItem) {
    if (this.mask == null) {
      this.mask = new ArrayList<>();
    }
    this.mask.add(maskItem);
    return this;
  }

  /**
   * Mask is the path we want to mask in the container. This masks the paths given in addition to the default list. Optional
   * @return mask
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_MASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getMask() {
    return mask;
  }


  @JsonProperty(JSON_PROPERTY_MASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMask(List<String> mask) {
    this.mask = mask;
  }


  public ContainerSecurityConfig noNewPrivileges(Boolean noNewPrivileges) {
    this.noNewPrivileges = noNewPrivileges;
    return this;
  }

  /**
   * NoNewPrivileges is whether the container will set the no new privileges flag on create, which disables gaining additional privileges (e.g. via setuid) in the container. Optional.
   * @return noNewPrivileges
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_NO_NEW_PRIVILEGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getNoNewPrivileges() {
    return noNewPrivileges;
  }


  @JsonProperty(JSON_PROPERTY_NO_NEW_PRIVILEGES)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setNoNewPrivileges(Boolean noNewPrivileges) {
    this.noNewPrivileges = noNewPrivileges;
  }


  public ContainerSecurityConfig privileged(Boolean privileged) {
    this.privileged = privileged;
    return this;
  }

  /**
   * Privileged is whether the container is privileged. Privileged does the following: Adds all devices on the system to the container. Adds all capabilities to the container. Disables Seccomp, SELinux, and Apparmor confinement. (Though SELinux can be manually re-enabled). TODO: this conflicts with things. TODO: this does more. Optional.
   * @return privileged
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PRIVILEGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getPrivileged() {
    return privileged;
  }


  @JsonProperty(JSON_PROPERTY_PRIVILEGED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPrivileged(Boolean privileged) {
    this.privileged = privileged;
  }


  public ContainerSecurityConfig procfsOpts(List<String> procfsOpts) {
    this.procfsOpts = procfsOpts;
    return this;
  }

  public ContainerSecurityConfig addProcfsOptsItem(String procfsOptsItem) {
    if (this.procfsOpts == null) {
      this.procfsOpts = new ArrayList<>();
    }
    this.procfsOpts.add(procfsOptsItem);
    return this;
  }

  /**
   * ProcOpts are the options used for the proc mount.
   * @return procfsOpts
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_PROCFS_OPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getProcfsOpts() {
    return procfsOpts;
  }


  @JsonProperty(JSON_PROPERTY_PROCFS_OPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setProcfsOpts(List<String> procfsOpts) {
    this.procfsOpts = procfsOpts;
  }


  public ContainerSecurityConfig readOnlyFilesystem(Boolean readOnlyFilesystem) {
    this.readOnlyFilesystem = readOnlyFilesystem;
    return this;
  }

  /**
   * ReadOnlyFilesystem indicates that everything will be mounted as read-only. Optional.
   * @return readOnlyFilesystem
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_READ_ONLY_FILESYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReadOnlyFilesystem() {
    return readOnlyFilesystem;
  }


  @JsonProperty(JSON_PROPERTY_READ_ONLY_FILESYSTEM)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadOnlyFilesystem(Boolean readOnlyFilesystem) {
    this.readOnlyFilesystem = readOnlyFilesystem;
  }


  public ContainerSecurityConfig readWriteTmpfs(Boolean readWriteTmpfs) {
    this.readWriteTmpfs = readWriteTmpfs;
    return this;
  }

  /**
   * ReadWriteTmpfs indicates that when running with a ReadOnlyFilesystem mount temporary file systems. Optional.
   * @return readWriteTmpfs
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_READ_WRITE_TMPFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Boolean getReadWriteTmpfs() {
    return readWriteTmpfs;
  }


  @JsonProperty(JSON_PROPERTY_READ_WRITE_TMPFS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setReadWriteTmpfs(Boolean readWriteTmpfs) {
    this.readWriteTmpfs = readWriteTmpfs;
  }


  public ContainerSecurityConfig seccompPolicy(String seccompPolicy) {
    this.seccompPolicy = seccompPolicy;
    return this;
  }

  /**
   * SeccompPolicy determines which seccomp profile gets applied the container. valid values: empty,default,image
   * @return seccompPolicy
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SECCOMP_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSeccompPolicy() {
    return seccompPolicy;
  }


  @JsonProperty(JSON_PROPERTY_SECCOMP_POLICY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeccompPolicy(String seccompPolicy) {
    this.seccompPolicy = seccompPolicy;
  }


  public ContainerSecurityConfig seccompProfilePath(String seccompProfilePath) {
    this.seccompProfilePath = seccompProfilePath;
    return this;
  }

  /**
   * SeccompProfilePath is the path to a JSON file containing the container&#39;s Seccomp profile. If not specified, no Seccomp profile will be used. Optional.
   * @return seccompProfilePath
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SECCOMP_PROFILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getSeccompProfilePath() {
    return seccompProfilePath;
  }


  @JsonProperty(JSON_PROPERTY_SECCOMP_PROFILE_PATH)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSeccompProfilePath(String seccompProfilePath) {
    this.seccompProfilePath = seccompProfilePath;
  }


  public ContainerSecurityConfig selinuxOpts(List<String> selinuxOpts) {
    this.selinuxOpts = selinuxOpts;
    return this;
  }

  public ContainerSecurityConfig addSelinuxOptsItem(String selinuxOptsItem) {
    if (this.selinuxOpts == null) {
      this.selinuxOpts = new ArrayList<>();
    }
    this.selinuxOpts.add(selinuxOptsItem);
    return this;
  }

  /**
   * SelinuxProcessLabel is the process label the container will use. If SELinux is enabled and this is not specified, a label will be automatically generated if not specified. Optional.
   * @return selinuxOpts
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_SELINUX_OPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getSelinuxOpts() {
    return selinuxOpts;
  }


  @JsonProperty(JSON_PROPERTY_SELINUX_OPTS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSelinuxOpts(List<String> selinuxOpts) {
    this.selinuxOpts = selinuxOpts;
  }


  public ContainerSecurityConfig umask(String umask) {
    this.umask = umask;
    return this;
  }

  /**
   * Umask is the umask the init process of the container will be run with.
   * @return umask
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_UMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUmask() {
    return umask;
  }


  @JsonProperty(JSON_PROPERTY_UMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUmask(String umask) {
    this.umask = umask;
  }


  public ContainerSecurityConfig unmask(List<String> unmask) {
    this.unmask = unmask;
    return this;
  }

  public ContainerSecurityConfig addUnmaskItem(String unmaskItem) {
    if (this.unmask == null) {
      this.unmask = new ArrayList<>();
    }
    this.unmask.add(unmaskItem);
    return this;
  }

  /**
   * Unmask a path in the container. Some paths are masked by default, preventing them from being accessed within the container; this undoes that masking. If ALL is passed, all paths will be unmasked. Optional.
   * @return unmask
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_UNMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public List<String> getUnmask() {
    return unmask;
  }


  @JsonProperty(JSON_PROPERTY_UNMASK)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUnmask(List<String> unmask) {
    this.unmask = unmask;
  }


  public ContainerSecurityConfig user(String user) {
    this.user = user;
    return this;
  }

  /**
   * User is the user the container will be run as. Can be given as a UID or a username; if a username, it will be resolved within the container, using the container&#39;s /etc/passwd. If unset, the container will be run as root. Optional.
   * @return user
   */
  @jakarta.annotation.Nullable

  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public String getUser() {
    return user;
  }


  @JsonProperty(JSON_PROPERTY_USER)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUser(String user) {
    this.user = user;
  }


  public ContainerSecurityConfig userns(Namespace userns) {
    this.userns = userns;
    return this;
  }

  /**
   * Get userns
   * @return userns
   */
  @jakarta.annotation.Nullable
  @Valid

  @JsonProperty(JSON_PROPERTY_USERNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public Namespace getUserns() {
    return userns;
  }


  @JsonProperty(JSON_PROPERTY_USERNS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUserns(Namespace userns) {
    this.userns = userns;
  }


  /**
   * Return true if this ContainerSecurityConfig object is equal to o.
   */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerSecurityConfig containerSecurityConfig = (ContainerSecurityConfig) o;
    return Objects.equals(this.apparmorProfile, containerSecurityConfig.apparmorProfile) &&
        Objects.equals(this.capAdd, containerSecurityConfig.capAdd) &&
        Objects.equals(this.capDrop, containerSecurityConfig.capDrop) &&
        Objects.equals(this.groups, containerSecurityConfig.groups) &&
        Objects.equals(this.idmappings, containerSecurityConfig.idmappings) &&
        Objects.equals(this.labelNested, containerSecurityConfig.labelNested) &&
        Objects.equals(this.mask, containerSecurityConfig.mask) &&
        Objects.equals(this.noNewPrivileges, containerSecurityConfig.noNewPrivileges) &&
        Objects.equals(this.privileged, containerSecurityConfig.privileged) &&
        Objects.equals(this.procfsOpts, containerSecurityConfig.procfsOpts) &&
        Objects.equals(this.readOnlyFilesystem, containerSecurityConfig.readOnlyFilesystem) &&
        Objects.equals(this.readWriteTmpfs, containerSecurityConfig.readWriteTmpfs) &&
        Objects.equals(this.seccompPolicy, containerSecurityConfig.seccompPolicy) &&
        Objects.equals(this.seccompProfilePath, containerSecurityConfig.seccompProfilePath) &&
        Objects.equals(this.selinuxOpts, containerSecurityConfig.selinuxOpts) &&
        Objects.equals(this.umask, containerSecurityConfig.umask) &&
        Objects.equals(this.unmask, containerSecurityConfig.unmask) &&
        Objects.equals(this.user, containerSecurityConfig.user) &&
        Objects.equals(this.userns, containerSecurityConfig.userns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apparmorProfile, capAdd, capDrop, groups, idmappings, labelNested, mask, noNewPrivileges, privileged, procfsOpts, readOnlyFilesystem, readWriteTmpfs, seccompPolicy, seccompProfilePath, selinuxOpts, umask, unmask, user, userns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerSecurityConfig {\n");
    sb.append("    apparmorProfile: ").append(toIndentedString(apparmorProfile)).append("\n");
    sb.append("    capAdd: ").append(toIndentedString(capAdd)).append("\n");
    sb.append("    capDrop: ").append(toIndentedString(capDrop)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    idmappings: ").append(toIndentedString(idmappings)).append("\n");
    sb.append("    labelNested: ").append(toIndentedString(labelNested)).append("\n");
    sb.append("    mask: ").append(toIndentedString(mask)).append("\n");
    sb.append("    noNewPrivileges: ").append(toIndentedString(noNewPrivileges)).append("\n");
    sb.append("    privileged: ").append(toIndentedString(privileged)).append("\n");
    sb.append("    procfsOpts: ").append(toIndentedString(procfsOpts)).append("\n");
    sb.append("    readOnlyFilesystem: ").append(toIndentedString(readOnlyFilesystem)).append("\n");
    sb.append("    readWriteTmpfs: ").append(toIndentedString(readWriteTmpfs)).append("\n");
    sb.append("    seccompPolicy: ").append(toIndentedString(seccompPolicy)).append("\n");
    sb.append("    seccompProfilePath: ").append(toIndentedString(seccompProfilePath)).append("\n");
    sb.append("    selinuxOpts: ").append(toIndentedString(selinuxOpts)).append("\n");
    sb.append("    umask: ").append(toIndentedString(umask)).append("\n");
    sb.append("    unmask: ").append(toIndentedString(unmask)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    userns: ").append(toIndentedString(userns)).append("\n");
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

  /**
   * Convert the instance into URL query string.
   *
   * @return URL query string
   */
  public String toUrlQueryString() {
    return toUrlQueryString(null);
  }

  /**
   * Convert the instance into URL query string.
   *
   * @param prefix prefix of the query string
   * @return URL query string
   */
  public String toUrlQueryString(String prefix) {
    String suffix = "";
    String containerSuffix = "";
    String containerPrefix = "";
    if (prefix == null) {
      // style=form, explode=true, e.g. /pet?name=cat&type=manx
      prefix = "";
    } else {
      // deepObject style e.g. /pet?id[name]=cat&id[type]=manx
      prefix = prefix + "[";
      suffix = "]";
      containerSuffix = "]";
      containerPrefix = "[";
    }

    StringJoiner joiner = new StringJoiner("&");

    // add `apparmor_profile` to the URL query string
    if (getApparmorProfile() != null) {
      joiner.add(String.format("%sapparmor_profile%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getApparmorProfile()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `cap_add` to the URL query string
    if (getCapAdd() != null) {
      for (int i = 0; i < getCapAdd().size(); i++) {
        joiner.add(String.format("%scap_add%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getCapAdd().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `cap_drop` to the URL query string
    if (getCapDrop() != null) {
      for (int i = 0; i < getCapDrop().size(); i++) {
        joiner.add(String.format("%scap_drop%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getCapDrop().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `groups` to the URL query string
    if (getGroups() != null) {
      for (int i = 0; i < getGroups().size(); i++) {
        joiner.add(String.format("%sgroups%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getGroups().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `idmappings` to the URL query string
    if (getIdmappings() != null) {
      joiner.add(getIdmappings().toUrlQueryString(prefix + "idmappings" + suffix));
    }

    // add `label_nested` to the URL query string
    if (getLabelNested() != null) {
      joiner.add(String.format("%slabel_nested%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getLabelNested()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `mask` to the URL query string
    if (getMask() != null) {
      for (int i = 0; i < getMask().size(); i++) {
        joiner.add(String.format("%smask%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getMask().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `no_new_privileges` to the URL query string
    if (getNoNewPrivileges() != null) {
      joiner.add(String.format("%sno_new_privileges%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getNoNewPrivileges()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `privileged` to the URL query string
    if (getPrivileged() != null) {
      joiner.add(String.format("%sprivileged%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getPrivileged()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `procfs_opts` to the URL query string
    if (getProcfsOpts() != null) {
      for (int i = 0; i < getProcfsOpts().size(); i++) {
        joiner.add(String.format("%sprocfs_opts%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getProcfsOpts().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `read_only_filesystem` to the URL query string
    if (getReadOnlyFilesystem() != null) {
      joiner.add(String.format("%sread_only_filesystem%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReadOnlyFilesystem()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `read_write_tmpfs` to the URL query string
    if (getReadWriteTmpfs() != null) {
      joiner.add(String.format("%sread_write_tmpfs%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getReadWriteTmpfs()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `seccomp_policy` to the URL query string
    if (getSeccompPolicy() != null) {
      joiner.add(String.format("%sseccomp_policy%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSeccompPolicy()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `seccomp_profile_path` to the URL query string
    if (getSeccompProfilePath() != null) {
      joiner.add(String.format("%sseccomp_profile_path%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getSeccompProfilePath()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `selinux_opts` to the URL query string
    if (getSelinuxOpts() != null) {
      for (int i = 0; i < getSelinuxOpts().size(); i++) {
        joiner.add(String.format("%sselinux_opts%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getSelinuxOpts().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `umask` to the URL query string
    if (getUmask() != null) {
      joiner.add(String.format("%sumask%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUmask()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `unmask` to the URL query string
    if (getUnmask() != null) {
      for (int i = 0; i < getUnmask().size(); i++) {
        joiner.add(String.format("%sunmask%s%s=%s", prefix, suffix,
            "".equals(suffix) ? "" : String.format("%s%d%s", containerPrefix, i, containerSuffix),
            URLEncoder.encode(ApiClient.valueToString(getUnmask().get(i)), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
      }
    }

    // add `user` to the URL query string
    if (getUser() != null) {
      joiner.add(String.format("%suser%s=%s", prefix, suffix, URLEncoder.encode(ApiClient.valueToString(getUser()), StandardCharsets.UTF_8).replaceAll("\\+", "%20")));
    }

    // add `userns` to the URL query string
    if (getUserns() != null) {
      joiner.add(getUserns().toUrlQueryString(prefix + "userns" + suffix));
    }

    return joiner.toString();
  }
}


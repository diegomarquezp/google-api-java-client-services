/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.notebooks.v1.model;

/**
 * The definition of a notebook instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Notebooks API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * The hardware accelerator used on this instance. If you use accelerators, make sure that your
   * configuration has [enough vCPUs and memory to support the `machine_type` you have
   * selected](/compute/docs/gpus/#gpus-list).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AcceleratorConfig acceleratorConfig;

  /**
   * Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000
   * GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults to 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long bootDiskSizeGb;

  /**
   * Input only. The type of the boot disk attached to this instance, defaults to standard
   * persistent disk (`PD_STANDARD`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String bootDiskType;

  /**
   * Optional. Flag to enable ip forwarding or not, default false/off.
   * https://cloud.google.com/vpc/docs/using-routes#canipforward
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean canIpForward;

  /**
   * Use a container image to start the notebook instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ContainerImage containerImage;

  /**
   * Output only. Instance creation time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. Email address of entity that sent original CreateInstance request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creator;

  /**
   * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll
   * automatically choose from official GPU drivers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customGpuDriverPath;

  /**
   * Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000
   * GB (64 TB). You can choose the size of the data disk based on how big your notebooks and data
   * are. If not specified, this defaults to 100.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long dataDiskSizeGb;

  /**
   * Input only. The type of the data disk attached to this instance, defaults to standard
   * persistent disk (`PD_STANDARD`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dataDiskType;

  /**
   * Input only. Disk encryption method used on the boot and data disks, defaults to GMEK.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String diskEncryption;

  /**
   * Output only. Attached disks to notebook instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Disk> disks;

  static {
    // hack to force ProGuard to consider Disk used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Disk.class);
  }

  /**
   * Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this
   * field is empty or set to false, the GPU driver won't be installed. Only applicable to instances
   * with GPUs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean installGpuDriver;

  /**
   * Input only. The owner of this instance after creation. Format: `alias@example.com` Currently
   * supports one owner only. If not specified, all of the service account users of your VM
   * instance's service account can use the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> instanceOwners;

  /**
   * Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK.
   * Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
   * Learn more about [using your own encryption keys](/kms/docs/quickstart).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kmsKey;

  /**
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. The [Compute Engine machine type](/compute/docs/machine-types) of this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineType;

  /**
   * Custom metadata to apply to this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> metadata;

  /**
   * Output only. The name of this notebook instance. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The name of the VPC that this instance is in. Format:
   * `projects/{project_id}/global/networks/{network_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String network;

  /**
   * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nicType;

  /**
   * If true, the notebook instance will not register with the proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean noProxyAccess;

  /**
   * If true, no public IP will be assigned to this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean noPublicIp;

  /**
   * Input only. If true, the data disk will not be auto deleted when deleting the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean noRemoveDataDisk;

  /**
   * Path to a Bash script that automatically runs after a notebook instance fully boots up. The
   * path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String postStartupScript;

  /**
   * Output only. The proxy endpoint that is used to access the Jupyter notebook.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proxyUri;

  /**
   * Optional. The optional reservation affinity. Setting this field will apply the specified [Zonal
   * Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
   * to this notebook instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ReservationAffinity reservationAffinity;

  /**
   * The service account on this instance, giving access to other Google Cloud services. You can use
   * any service account within the same project, but you must have the service account user
   * permission to use the instance. If not specified, the [Compute Engine default service
   * account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account)
   * is used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Optional. The URIs of service account scopes to be included in Compute Engine instances. If not
   * specified, the following [scopes](https://cloud.google.com/compute/docs/access/service-
   * accounts#accesscopesiam) are defined: - https://www.googleapis.com/auth/cloud-platform -
   * https://www.googleapis.com/auth/userinfo.email If not using default scopes, you need at least:
   * https://www.googleapis.com/auth/compute
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> serviceAccountScopes;

  /**
   * Optional. Shielded VM configuration. [Images using supported Shielded VM
   * features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ShieldedInstanceConfig shieldedInstanceConfig;

  /**
   * Output only. The state of this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * The name of the subnet that this instance is in. Format:
   * `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String subnet;

  /**
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> tags;

  /**
   * Output only. Instance update time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The upgrade history of this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<UpgradeHistoryEntry> upgradeHistory;

  /**
   * Use a Compute Engine VM image to start the notebook instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VmImage vmImage;

  /**
   * The hardware accelerator used on this instance. If you use accelerators, make sure that your
   * configuration has [enough vCPUs and memory to support the `machine_type` you have
   * selected](/compute/docs/gpus/#gpus-list).
   * @return value or {@code null} for none
   */
  public AcceleratorConfig getAcceleratorConfig() {
    return acceleratorConfig;
  }

  /**
   * The hardware accelerator used on this instance. If you use accelerators, make sure that your
   * configuration has [enough vCPUs and memory to support the `machine_type` you have
   * selected](/compute/docs/gpus/#gpus-list).
   * @param acceleratorConfig acceleratorConfig or {@code null} for none
   */
  public Instance setAcceleratorConfig(AcceleratorConfig acceleratorConfig) {
    this.acceleratorConfig = acceleratorConfig;
    return this;
  }

  /**
   * Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000
   * GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults to 100.
   * @return value or {@code null} for none
   */
  public java.lang.Long getBootDiskSizeGb() {
    return bootDiskSizeGb;
  }

  /**
   * Input only. The size of the boot disk in GB attached to this instance, up to a maximum of 64000
   * GB (64 TB). The minimum recommended value is 100 GB. If not specified, this defaults to 100.
   * @param bootDiskSizeGb bootDiskSizeGb or {@code null} for none
   */
  public Instance setBootDiskSizeGb(java.lang.Long bootDiskSizeGb) {
    this.bootDiskSizeGb = bootDiskSizeGb;
    return this;
  }

  /**
   * Input only. The type of the boot disk attached to this instance, defaults to standard
   * persistent disk (`PD_STANDARD`).
   * @return value or {@code null} for none
   */
  public java.lang.String getBootDiskType() {
    return bootDiskType;
  }

  /**
   * Input only. The type of the boot disk attached to this instance, defaults to standard
   * persistent disk (`PD_STANDARD`).
   * @param bootDiskType bootDiskType or {@code null} for none
   */
  public Instance setBootDiskType(java.lang.String bootDiskType) {
    this.bootDiskType = bootDiskType;
    return this;
  }

  /**
   * Optional. Flag to enable ip forwarding or not, default false/off.
   * https://cloud.google.com/vpc/docs/using-routes#canipforward
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCanIpForward() {
    return canIpForward;
  }

  /**
   * Optional. Flag to enable ip forwarding or not, default false/off.
   * https://cloud.google.com/vpc/docs/using-routes#canipforward
   * @param canIpForward canIpForward or {@code null} for none
   */
  public Instance setCanIpForward(java.lang.Boolean canIpForward) {
    this.canIpForward = canIpForward;
    return this;
  }

  /**
   * Use a container image to start the notebook instance.
   * @return value or {@code null} for none
   */
  public ContainerImage getContainerImage() {
    return containerImage;
  }

  /**
   * Use a container image to start the notebook instance.
   * @param containerImage containerImage or {@code null} for none
   */
  public Instance setContainerImage(ContainerImage containerImage) {
    this.containerImage = containerImage;
    return this;
  }

  /**
   * Output only. Instance creation time.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. Instance creation time.
   * @param createTime createTime or {@code null} for none
   */
  public Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. Email address of entity that sent original CreateInstance request.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreator() {
    return creator;
  }

  /**
   * Output only. Email address of entity that sent original CreateInstance request.
   * @param creator creator or {@code null} for none
   */
  public Instance setCreator(java.lang.String creator) {
    this.creator = creator;
    return this;
  }

  /**
   * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll
   * automatically choose from official GPU drivers.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomGpuDriverPath() {
    return customGpuDriverPath;
  }

  /**
   * Specify a custom Cloud Storage path where the GPU driver is stored. If not specified, we'll
   * automatically choose from official GPU drivers.
   * @param customGpuDriverPath customGpuDriverPath or {@code null} for none
   */
  public Instance setCustomGpuDriverPath(java.lang.String customGpuDriverPath) {
    this.customGpuDriverPath = customGpuDriverPath;
    return this;
  }

  /**
   * Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000
   * GB (64 TB). You can choose the size of the data disk based on how big your notebooks and data
   * are. If not specified, this defaults to 100.
   * @return value or {@code null} for none
   */
  public java.lang.Long getDataDiskSizeGb() {
    return dataDiskSizeGb;
  }

  /**
   * Input only. The size of the data disk in GB attached to this instance, up to a maximum of 64000
   * GB (64 TB). You can choose the size of the data disk based on how big your notebooks and data
   * are. If not specified, this defaults to 100.
   * @param dataDiskSizeGb dataDiskSizeGb or {@code null} for none
   */
  public Instance setDataDiskSizeGb(java.lang.Long dataDiskSizeGb) {
    this.dataDiskSizeGb = dataDiskSizeGb;
    return this;
  }

  /**
   * Input only. The type of the data disk attached to this instance, defaults to standard
   * persistent disk (`PD_STANDARD`).
   * @return value or {@code null} for none
   */
  public java.lang.String getDataDiskType() {
    return dataDiskType;
  }

  /**
   * Input only. The type of the data disk attached to this instance, defaults to standard
   * persistent disk (`PD_STANDARD`).
   * @param dataDiskType dataDiskType or {@code null} for none
   */
  public Instance setDataDiskType(java.lang.String dataDiskType) {
    this.dataDiskType = dataDiskType;
    return this;
  }

  /**
   * Input only. Disk encryption method used on the boot and data disks, defaults to GMEK.
   * @return value or {@code null} for none
   */
  public java.lang.String getDiskEncryption() {
    return diskEncryption;
  }

  /**
   * Input only. Disk encryption method used on the boot and data disks, defaults to GMEK.
   * @param diskEncryption diskEncryption or {@code null} for none
   */
  public Instance setDiskEncryption(java.lang.String diskEncryption) {
    this.diskEncryption = diskEncryption;
    return this;
  }

  /**
   * Output only. Attached disks to notebook instance.
   * @return value or {@code null} for none
   */
  public java.util.List<Disk> getDisks() {
    return disks;
  }

  /**
   * Output only. Attached disks to notebook instance.
   * @param disks disks or {@code null} for none
   */
  public Instance setDisks(java.util.List<Disk> disks) {
    this.disks = disks;
    return this;
  }

  /**
   * Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this
   * field is empty or set to false, the GPU driver won't be installed. Only applicable to instances
   * with GPUs.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getInstallGpuDriver() {
    return installGpuDriver;
  }

  /**
   * Whether the end user authorizes Google Cloud to install GPU driver on this instance. If this
   * field is empty or set to false, the GPU driver won't be installed. Only applicable to instances
   * with GPUs.
   * @param installGpuDriver installGpuDriver or {@code null} for none
   */
  public Instance setInstallGpuDriver(java.lang.Boolean installGpuDriver) {
    this.installGpuDriver = installGpuDriver;
    return this;
  }

  /**
   * Input only. The owner of this instance after creation. Format: `alias@example.com` Currently
   * supports one owner only. If not specified, all of the service account users of your VM
   * instance's service account can use the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getInstanceOwners() {
    return instanceOwners;
  }

  /**
   * Input only. The owner of this instance after creation. Format: `alias@example.com` Currently
   * supports one owner only. If not specified, all of the service account users of your VM
   * instance's service account can use the instance.
   * @param instanceOwners instanceOwners or {@code null} for none
   */
  public Instance setInstanceOwners(java.util.List<java.lang.String> instanceOwners) {
    this.instanceOwners = instanceOwners;
    return this;
  }

  /**
   * Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK.
   * Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
   * Learn more about [using your own encryption keys](/kms/docs/quickstart).
   * @return value or {@code null} for none
   */
  public java.lang.String getKmsKey() {
    return kmsKey;
  }

  /**
   * Input only. The KMS key used to encrypt the disks, only applicable if disk_encryption is CMEK.
   * Format: `projects/{project_id}/locations/{location}/keyRings/{key_ring_id}/cryptoKeys/{key_id}`
   * Learn more about [using your own encryption keys](/kms/docs/quickstart).
   * @param kmsKey kmsKey or {@code null} for none
   */
  public Instance setKmsKey(java.lang.String kmsKey) {
    this.kmsKey = kmsKey;
    return this;
  }

  /**
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Labels to apply to this instance. These can be later modified by the setLabels method.
   * @param labels labels or {@code null} for none
   */
  public Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. The [Compute Engine machine type](/compute/docs/machine-types) of this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineType() {
    return machineType;
  }

  /**
   * Required. The [Compute Engine machine type](/compute/docs/machine-types) of this instance.
   * @param machineType machineType or {@code null} for none
   */
  public Instance setMachineType(java.lang.String machineType) {
    this.machineType = machineType;
    return this;
  }

  /**
   * Custom metadata to apply to this instance.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getMetadata() {
    return metadata;
  }

  /**
   * Custom metadata to apply to this instance.
   * @param metadata metadata or {@code null} for none
   */
  public Instance setMetadata(java.util.Map<String, java.lang.String> metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * Output only. The name of this notebook instance. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The name of this notebook instance. Format:
   * `projects/{project_id}/locations/{location}/instances/{instance_id}`
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The name of the VPC that this instance is in. Format:
   * `projects/{project_id}/global/networks/{network_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getNetwork() {
    return network;
  }

  /**
   * The name of the VPC that this instance is in. Format:
   * `projects/{project_id}/global/networks/{network_id}`
   * @param network network or {@code null} for none
   */
  public Instance setNetwork(java.lang.String network) {
    this.network = network;
    return this;
  }

  /**
   * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * @return value or {@code null} for none
   */
  public java.lang.String getNicType() {
    return nicType;
  }

  /**
   * Optional. The type of vNIC to be used on this interface. This may be gVNIC or VirtioNet.
   * @param nicType nicType or {@code null} for none
   */
  public Instance setNicType(java.lang.String nicType) {
    this.nicType = nicType;
    return this;
  }

  /**
   * If true, the notebook instance will not register with the proxy.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNoProxyAccess() {
    return noProxyAccess;
  }

  /**
   * If true, the notebook instance will not register with the proxy.
   * @param noProxyAccess noProxyAccess or {@code null} for none
   */
  public Instance setNoProxyAccess(java.lang.Boolean noProxyAccess) {
    this.noProxyAccess = noProxyAccess;
    return this;
  }

  /**
   * If true, no public IP will be assigned to this instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNoPublicIp() {
    return noPublicIp;
  }

  /**
   * If true, no public IP will be assigned to this instance.
   * @param noPublicIp noPublicIp or {@code null} for none
   */
  public Instance setNoPublicIp(java.lang.Boolean noPublicIp) {
    this.noPublicIp = noPublicIp;
    return this;
  }

  /**
   * Input only. If true, the data disk will not be auto deleted when deleting the instance.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNoRemoveDataDisk() {
    return noRemoveDataDisk;
  }

  /**
   * Input only. If true, the data disk will not be auto deleted when deleting the instance.
   * @param noRemoveDataDisk noRemoveDataDisk or {@code null} for none
   */
  public Instance setNoRemoveDataDisk(java.lang.Boolean noRemoveDataDisk) {
    this.noRemoveDataDisk = noRemoveDataDisk;
    return this;
  }

  /**
   * Path to a Bash script that automatically runs after a notebook instance fully boots up. The
   * path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
   * @return value or {@code null} for none
   */
  public java.lang.String getPostStartupScript() {
    return postStartupScript;
  }

  /**
   * Path to a Bash script that automatically runs after a notebook instance fully boots up. The
   * path must be a URL or Cloud Storage path (`gs://path-to-file/file-name`).
   * @param postStartupScript postStartupScript or {@code null} for none
   */
  public Instance setPostStartupScript(java.lang.String postStartupScript) {
    this.postStartupScript = postStartupScript;
    return this;
  }

  /**
   * Output only. The proxy endpoint that is used to access the Jupyter notebook.
   * @return value or {@code null} for none
   */
  public java.lang.String getProxyUri() {
    return proxyUri;
  }

  /**
   * Output only. The proxy endpoint that is used to access the Jupyter notebook.
   * @param proxyUri proxyUri or {@code null} for none
   */
  public Instance setProxyUri(java.lang.String proxyUri) {
    this.proxyUri = proxyUri;
    return this;
  }

  /**
   * Optional. The optional reservation affinity. Setting this field will apply the specified [Zonal
   * Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
   * to this notebook instance.
   * @return value or {@code null} for none
   */
  public ReservationAffinity getReservationAffinity() {
    return reservationAffinity;
  }

  /**
   * Optional. The optional reservation affinity. Setting this field will apply the specified [Zonal
   * Compute Reservation](https://cloud.google.com/compute/docs/instances/reserving-zonal-resources)
   * to this notebook instance.
   * @param reservationAffinity reservationAffinity or {@code null} for none
   */
  public Instance setReservationAffinity(ReservationAffinity reservationAffinity) {
    this.reservationAffinity = reservationAffinity;
    return this;
  }

  /**
   * The service account on this instance, giving access to other Google Cloud services. You can use
   * any service account within the same project, but you must have the service account user
   * permission to use the instance. If not specified, the [Compute Engine default service
   * account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account)
   * is used.
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The service account on this instance, giving access to other Google Cloud services. You can use
   * any service account within the same project, but you must have the service account user
   * permission to use the instance. If not specified, the [Compute Engine default service
   * account](https://cloud.google.com/compute/docs/access/service-accounts#default_service_account)
   * is used.
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public Instance setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Optional. The URIs of service account scopes to be included in Compute Engine instances. If not
   * specified, the following [scopes](https://cloud.google.com/compute/docs/access/service-
   * accounts#accesscopesiam) are defined: - https://www.googleapis.com/auth/cloud-platform -
   * https://www.googleapis.com/auth/userinfo.email If not using default scopes, you need at least:
   * https://www.googleapis.com/auth/compute
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getServiceAccountScopes() {
    return serviceAccountScopes;
  }

  /**
   * Optional. The URIs of service account scopes to be included in Compute Engine instances. If not
   * specified, the following [scopes](https://cloud.google.com/compute/docs/access/service-
   * accounts#accesscopesiam) are defined: - https://www.googleapis.com/auth/cloud-platform -
   * https://www.googleapis.com/auth/userinfo.email If not using default scopes, you need at least:
   * https://www.googleapis.com/auth/compute
   * @param serviceAccountScopes serviceAccountScopes or {@code null} for none
   */
  public Instance setServiceAccountScopes(java.util.List<java.lang.String> serviceAccountScopes) {
    this.serviceAccountScopes = serviceAccountScopes;
    return this;
  }

  /**
   * Optional. Shielded VM configuration. [Images using supported Shielded VM
   * features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
   * @return value or {@code null} for none
   */
  public ShieldedInstanceConfig getShieldedInstanceConfig() {
    return shieldedInstanceConfig;
  }

  /**
   * Optional. Shielded VM configuration. [Images using supported Shielded VM
   * features](https://cloud.google.com/compute/docs/instances/modifying-shielded-vm).
   * @param shieldedInstanceConfig shieldedInstanceConfig or {@code null} for none
   */
  public Instance setShieldedInstanceConfig(ShieldedInstanceConfig shieldedInstanceConfig) {
    this.shieldedInstanceConfig = shieldedInstanceConfig;
    return this;
  }

  /**
   * Output only. The state of this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The state of this instance.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * The name of the subnet that this instance is in. Format:
   * `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}`
   * @return value or {@code null} for none
   */
  public java.lang.String getSubnet() {
    return subnet;
  }

  /**
   * The name of the subnet that this instance is in. Format:
   * `projects/{project_id}/regions/{region}/subnetworks/{subnetwork_id}`
   * @param subnet subnet or {@code null} for none
   */
  public Instance setSubnet(java.lang.String subnet) {
    this.subnet = subnet;
    return this;
  }

  /**
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTags() {
    return tags;
  }

  /**
   * Optional. The Compute Engine tags to add to runtime (see [Tagging
   * instances](https://cloud.google.com/compute/docs/label-or-tag-resources#tags)).
   * @param tags tags or {@code null} for none
   */
  public Instance setTags(java.util.List<java.lang.String> tags) {
    this.tags = tags;
    return this;
  }

  /**
   * Output only. Instance update time.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. Instance update time.
   * @param updateTime updateTime or {@code null} for none
   */
  public Instance setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * The upgrade history of this instance.
   * @return value or {@code null} for none
   */
  public java.util.List<UpgradeHistoryEntry> getUpgradeHistory() {
    return upgradeHistory;
  }

  /**
   * The upgrade history of this instance.
   * @param upgradeHistory upgradeHistory or {@code null} for none
   */
  public Instance setUpgradeHistory(java.util.List<UpgradeHistoryEntry> upgradeHistory) {
    this.upgradeHistory = upgradeHistory;
    return this;
  }

  /**
   * Use a Compute Engine VM image to start the notebook instance.
   * @return value or {@code null} for none
   */
  public VmImage getVmImage() {
    return vmImage;
  }

  /**
   * Use a Compute Engine VM image to start the notebook instance.
   * @param vmImage vmImage or {@code null} for none
   */
  public Instance setVmImage(VmImage vmImage) {
    this.vmImage = vmImage;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}

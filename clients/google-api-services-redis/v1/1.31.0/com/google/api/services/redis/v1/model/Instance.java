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

package com.google.api.services.redis.v1.model;

/**
 * A Memorystore for Redis instance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud Memorystore for Redis API. For a
 * detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * Optional. If specified, at least one node will be provisioned in this zone in addition to the
   * zone specified in location_id. Only applicable to standard tier. If provided, it must be a
   * different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will
   * be placed in zones selected by the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alternativeLocationId;

  /**
   * Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to "true" AUTH
   * is enabled on the instance. Default value is "false" meaning AUTH is disabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean authEnabled;

  /**
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left
   * unspecified, the `default` network will be used.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authorizedNetwork;

  /**
   * Optional. The network connect mode of the Redis instance. If not provided, the connect mode
   * defaults to DIRECT_PEERING.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectMode;

  /**
   * Output only. The time the instance was created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Output only. The current zone where the Redis primary node is located. In basic tier, this will
   * always be the same as [location_id]. In standard tier, this can be the zone of any node in the
   * instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currentLocationId;

  /**
   * An arbitrary and optional user-provided name for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. Hostname or IP address of the exposed Redis endpoint used by clients to connect to
   * the service.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String host;

  /**
   * Resource labels to represent user provided metadata
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Optional. The zone where the instance will be provisioned. If not provided, the service will
   * choose a zone from the specified region for the instance. For standard tier, additional nodes
   * will be added across multiple zones for protection against zonal failures. If specified, at
   * least one node will be provisioned in this zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String locationId;

  /**
   * Optional. The maintenance policy for the instance. If not provided, maintenance events can be
   * performed at any time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaintenancePolicy maintenancePolicy;

  /**
   * Output only. Date and time of upcoming maintenance events which have been scheduled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private MaintenanceSchedule maintenanceSchedule;

  /**
   * Required. Redis memory size in GiB.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer memorySizeGb;

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis
   * instances are managed and addressed at regional level so location_id here refers to a GCP
   * region; however, users may choose which specific zone (or collection of zones for cross-zone
   * instances) an instance should be provisioned in. Refer to location_id and
   * alternative_location_id fields for more details.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Info per node.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<NodeInfo> nodes;

  /**
   * Optional. Persistence configuration parameters
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PersistenceConfig persistenceConfig;

  /**
   * Output only. Cloud IAM identity used by import / export operations to transfer data to/from
   * Cloud Storage. Format is "serviceAccount:". The value may change over time for a given instance
   * so should be checked before each import/export operation.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String persistenceIamIdentity;

  /**
   * Output only. The port number of the exposed Redis endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer port;

  /**
   * Output only. Hostname or IP address of the exposed readonly Redis endpoint. Standard tier only.
   * Targets all healthy replica nodes in instance. Replication is asynchronous and replica nodes
   * will exhibit some lag behind the primary. Write requests must target 'host'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String readEndpoint;

  /**
   * Output only. The port number of the exposed readonly redis endpoint. Standard tier only. Write
   * requests should target 'port'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer readEndpointPort;

  /**
   * Optional. Read replicas mode for the instance. Defaults to READ_REPLICAS_DISABLED.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String readReplicasMode;

  /**
   * Optional. Redis configuration parameters, according to http://redis.io/topics/config.
   * Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy *
   * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-
   * factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-
   * entries
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> redisConfigs;

  /**
   * Optional. The version of Redis software. If not provided, latest supported version will be
   * used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility *
   * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility *
   * `REDIS_6_X` for Redis 6.x compatibility
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String redisVersion;

  /**
   * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas
   * enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier
   * instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0
   * and the default is also 0.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer replicaCount;

  /**
   * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for
   * this instance. Range must be unique and non-overlapping with existing subnets in an authorized
   * network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges
   * associated with this private service access connection. If not provided, the service will
   * choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For
   * READ_REPLICAS_ENABLED the default block size is /28.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reservedIpRange;

  /**
   * Optional. Additional IP range for node placement. Required when enabling read replicas on an
   * existing instance. For DIRECT_PEERING mode value must be a CIDR range of size /28, or "auto".
   * For PRIVATE_SERVICE_ACCESS mode value must be the name of an allocated address range associated
   * with the private service access connection, or "auto".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String secondaryIpRange;

  /**
   * Output only. List of server CA certificates for the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TlsCertificate> serverCaCerts;

  /**
   * Output only. The current state of this instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Output only. Additional information about the current status of this instance, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String statusMessage;

  /**
   * Required. The service tier of the instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tier;

  /**
   * Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the
   * instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String transitEncryptionMode;

  /**
   * Optional. If specified, at least one node will be provisioned in this zone in addition to the
   * zone specified in location_id. Only applicable to standard tier. If provided, it must be a
   * different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will
   * be placed in zones selected by the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternativeLocationId() {
    return alternativeLocationId;
  }

  /**
   * Optional. If specified, at least one node will be provisioned in this zone in addition to the
   * zone specified in location_id. Only applicable to standard tier. If provided, it must be a
   * different zone from the one provided in [location_id]. Additional nodes beyond the first 2 will
   * be placed in zones selected by the service.
   * @param alternativeLocationId alternativeLocationId or {@code null} for none
   */
  public Instance setAlternativeLocationId(java.lang.String alternativeLocationId) {
    this.alternativeLocationId = alternativeLocationId;
    return this;
  }

  /**
   * Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to "true" AUTH
   * is enabled on the instance. Default value is "false" meaning AUTH is disabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAuthEnabled() {
    return authEnabled;
  }

  /**
   * Optional. Indicates whether OSS Redis AUTH is enabled for the instance. If set to "true" AUTH
   * is enabled on the instance. Default value is "false" meaning AUTH is disabled.
   * @param authEnabled authEnabled or {@code null} for none
   */
  public Instance setAuthEnabled(java.lang.Boolean authEnabled) {
    this.authEnabled = authEnabled;
    return this;
  }

  /**
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left
   * unspecified, the `default` network will be used.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthorizedNetwork() {
    return authorizedNetwork;
  }

  /**
   * Optional. The full name of the Google Compute Engine
   * [network](https://cloud.google.com/vpc/docs/vpc) to which the instance is connected. If left
   * unspecified, the `default` network will be used.
   * @param authorizedNetwork authorizedNetwork or {@code null} for none
   */
  public Instance setAuthorizedNetwork(java.lang.String authorizedNetwork) {
    this.authorizedNetwork = authorizedNetwork;
    return this;
  }

  /**
   * Optional. The network connect mode of the Redis instance. If not provided, the connect mode
   * defaults to DIRECT_PEERING.
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectMode() {
    return connectMode;
  }

  /**
   * Optional. The network connect mode of the Redis instance. If not provided, the connect mode
   * defaults to DIRECT_PEERING.
   * @param connectMode connectMode or {@code null} for none
   */
  public Instance setConnectMode(java.lang.String connectMode) {
    this.connectMode = connectMode;
    return this;
  }

  /**
   * Output only. The time the instance was created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time the instance was created.
   * @param createTime createTime or {@code null} for none
   */
  public Instance setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Output only. The current zone where the Redis primary node is located. In basic tier, this will
   * always be the same as [location_id]. In standard tier, this can be the zone of any node in the
   * instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrentLocationId() {
    return currentLocationId;
  }

  /**
   * Output only. The current zone where the Redis primary node is located. In basic tier, this will
   * always be the same as [location_id]. In standard tier, this can be the zone of any node in the
   * instance.
   * @param currentLocationId currentLocationId or {@code null} for none
   */
  public Instance setCurrentLocationId(java.lang.String currentLocationId) {
    this.currentLocationId = currentLocationId;
    return this;
  }

  /**
   * An arbitrary and optional user-provided name for the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * An arbitrary and optional user-provided name for the instance.
   * @param displayName displayName or {@code null} for none
   */
  public Instance setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. Hostname or IP address of the exposed Redis endpoint used by clients to connect to
   * the service.
   * @return value or {@code null} for none
   */
  public java.lang.String getHost() {
    return host;
  }

  /**
   * Output only. Hostname or IP address of the exposed Redis endpoint used by clients to connect to
   * the service.
   * @param host host or {@code null} for none
   */
  public Instance setHost(java.lang.String host) {
    this.host = host;
    return this;
  }

  /**
   * Resource labels to represent user provided metadata
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Resource labels to represent user provided metadata
   * @param labels labels or {@code null} for none
   */
  public Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Optional. The zone where the instance will be provisioned. If not provided, the service will
   * choose a zone from the specified region for the instance. For standard tier, additional nodes
   * will be added across multiple zones for protection against zonal failures. If specified, at
   * least one node will be provisioned in this zone.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocationId() {
    return locationId;
  }

  /**
   * Optional. The zone where the instance will be provisioned. If not provided, the service will
   * choose a zone from the specified region for the instance. For standard tier, additional nodes
   * will be added across multiple zones for protection against zonal failures. If specified, at
   * least one node will be provisioned in this zone.
   * @param locationId locationId or {@code null} for none
   */
  public Instance setLocationId(java.lang.String locationId) {
    this.locationId = locationId;
    return this;
  }

  /**
   * Optional. The maintenance policy for the instance. If not provided, maintenance events can be
   * performed at any time.
   * @return value or {@code null} for none
   */
  public MaintenancePolicy getMaintenancePolicy() {
    return maintenancePolicy;
  }

  /**
   * Optional. The maintenance policy for the instance. If not provided, maintenance events can be
   * performed at any time.
   * @param maintenancePolicy maintenancePolicy or {@code null} for none
   */
  public Instance setMaintenancePolicy(MaintenancePolicy maintenancePolicy) {
    this.maintenancePolicy = maintenancePolicy;
    return this;
  }

  /**
   * Output only. Date and time of upcoming maintenance events which have been scheduled.
   * @return value or {@code null} for none
   */
  public MaintenanceSchedule getMaintenanceSchedule() {
    return maintenanceSchedule;
  }

  /**
   * Output only. Date and time of upcoming maintenance events which have been scheduled.
   * @param maintenanceSchedule maintenanceSchedule or {@code null} for none
   */
  public Instance setMaintenanceSchedule(MaintenanceSchedule maintenanceSchedule) {
    this.maintenanceSchedule = maintenanceSchedule;
    return this;
  }

  /**
   * Required. Redis memory size in GiB.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMemorySizeGb() {
    return memorySizeGb;
  }

  /**
   * Required. Redis memory size in GiB.
   * @param memorySizeGb memorySizeGb or {@code null} for none
   */
  public Instance setMemorySizeGb(java.lang.Integer memorySizeGb) {
    this.memorySizeGb = memorySizeGb;
    return this;
  }

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis
   * instances are managed and addressed at regional level so location_id here refers to a GCP
   * region; however, users may choose which specific zone (or collection of zones for cross-zone
   * instances) an instance should be provisioned in. Refer to location_id and
   * alternative_location_id fields for more details.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. Unique name of the resource in this scope including project and location using the
   * form: `projects/{project_id}/locations/{location_id}/instances/{instance_id}` Note: Redis
   * instances are managed and addressed at regional level so location_id here refers to a GCP
   * region; however, users may choose which specific zone (or collection of zones for cross-zone
   * instances) an instance should be provisioned in. Refer to location_id and
   * alternative_location_id fields for more details.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Info per node.
   * @return value or {@code null} for none
   */
  public java.util.List<NodeInfo> getNodes() {
    return nodes;
  }

  /**
   * Output only. Info per node.
   * @param nodes nodes or {@code null} for none
   */
  public Instance setNodes(java.util.List<NodeInfo> nodes) {
    this.nodes = nodes;
    return this;
  }

  /**
   * Optional. Persistence configuration parameters
   * @return value or {@code null} for none
   */
  public PersistenceConfig getPersistenceConfig() {
    return persistenceConfig;
  }

  /**
   * Optional. Persistence configuration parameters
   * @param persistenceConfig persistenceConfig or {@code null} for none
   */
  public Instance setPersistenceConfig(PersistenceConfig persistenceConfig) {
    this.persistenceConfig = persistenceConfig;
    return this;
  }

  /**
   * Output only. Cloud IAM identity used by import / export operations to transfer data to/from
   * Cloud Storage. Format is "serviceAccount:". The value may change over time for a given instance
   * so should be checked before each import/export operation.
   * @return value or {@code null} for none
   */
  public java.lang.String getPersistenceIamIdentity() {
    return persistenceIamIdentity;
  }

  /**
   * Output only. Cloud IAM identity used by import / export operations to transfer data to/from
   * Cloud Storage. Format is "serviceAccount:". The value may change over time for a given instance
   * so should be checked before each import/export operation.
   * @param persistenceIamIdentity persistenceIamIdentity or {@code null} for none
   */
  public Instance setPersistenceIamIdentity(java.lang.String persistenceIamIdentity) {
    this.persistenceIamIdentity = persistenceIamIdentity;
    return this;
  }

  /**
   * Output only. The port number of the exposed Redis endpoint.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPort() {
    return port;
  }

  /**
   * Output only. The port number of the exposed Redis endpoint.
   * @param port port or {@code null} for none
   */
  public Instance setPort(java.lang.Integer port) {
    this.port = port;
    return this;
  }

  /**
   * Output only. Hostname or IP address of the exposed readonly Redis endpoint. Standard tier only.
   * Targets all healthy replica nodes in instance. Replication is asynchronous and replica nodes
   * will exhibit some lag behind the primary. Write requests must target 'host'.
   * @return value or {@code null} for none
   */
  public java.lang.String getReadEndpoint() {
    return readEndpoint;
  }

  /**
   * Output only. Hostname or IP address of the exposed readonly Redis endpoint. Standard tier only.
   * Targets all healthy replica nodes in instance. Replication is asynchronous and replica nodes
   * will exhibit some lag behind the primary. Write requests must target 'host'.
   * @param readEndpoint readEndpoint or {@code null} for none
   */
  public Instance setReadEndpoint(java.lang.String readEndpoint) {
    this.readEndpoint = readEndpoint;
    return this;
  }

  /**
   * Output only. The port number of the exposed readonly redis endpoint. Standard tier only. Write
   * requests should target 'port'.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getReadEndpointPort() {
    return readEndpointPort;
  }

  /**
   * Output only. The port number of the exposed readonly redis endpoint. Standard tier only. Write
   * requests should target 'port'.
   * @param readEndpointPort readEndpointPort or {@code null} for none
   */
  public Instance setReadEndpointPort(java.lang.Integer readEndpointPort) {
    this.readEndpointPort = readEndpointPort;
    return this;
  }

  /**
   * Optional. Read replicas mode for the instance. Defaults to READ_REPLICAS_DISABLED.
   * @return value or {@code null} for none
   */
  public java.lang.String getReadReplicasMode() {
    return readReplicasMode;
  }

  /**
   * Optional. Read replicas mode for the instance. Defaults to READ_REPLICAS_DISABLED.
   * @param readReplicasMode readReplicasMode or {@code null} for none
   */
  public Instance setReadReplicasMode(java.lang.String readReplicasMode) {
    this.readReplicasMode = readReplicasMode;
    return this;
  }

  /**
   * Optional. Redis configuration parameters, according to http://redis.io/topics/config.
   * Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy *
   * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-
   * factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-
   * entries
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getRedisConfigs() {
    return redisConfigs;
  }

  /**
   * Optional. Redis configuration parameters, according to http://redis.io/topics/config.
   * Currently, the only supported parameters are: Redis version 3.2 and newer: * maxmemory-policy *
   * notify-keyspace-events Redis version 4.0 and newer: * activedefrag * lfu-decay-time * lfu-log-
   * factor * maxmemory-gb Redis version 5.0 and newer: * stream-node-max-bytes * stream-node-max-
   * entries
   * @param redisConfigs redisConfigs or {@code null} for none
   */
  public Instance setRedisConfigs(java.util.Map<String, java.lang.String> redisConfigs) {
    this.redisConfigs = redisConfigs;
    return this;
  }

  /**
   * Optional. The version of Redis software. If not provided, latest supported version will be
   * used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility *
   * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility *
   * `REDIS_6_X` for Redis 6.x compatibility
   * @return value or {@code null} for none
   */
  public java.lang.String getRedisVersion() {
    return redisVersion;
  }

  /**
   * Optional. The version of Redis software. If not provided, latest supported version will be
   * used. Currently, the supported values are: * `REDIS_3_2` for Redis 3.2 compatibility *
   * `REDIS_4_0` for Redis 4.0 compatibility (default) * `REDIS_5_0` for Redis 5.0 compatibility *
   * `REDIS_6_X` for Redis 6.x compatibility
   * @param redisVersion redisVersion or {@code null} for none
   */
  public Instance setRedisVersion(java.lang.String redisVersion) {
    this.redisVersion = redisVersion;
    return this;
  }

  /**
   * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas
   * enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier
   * instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0
   * and the default is also 0.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getReplicaCount() {
    return replicaCount;
  }

  /**
   * Optional. The number of replica nodes. The valid range for the Standard Tier with read replicas
   * enabled is [1-5] and defaults to 2. If read replicas are not enabled for a Standard Tier
   * instance, the only valid value is 1 and the default is 1. The valid value for basic tier is 0
   * and the default is also 0.
   * @param replicaCount replicaCount or {@code null} for none
   */
  public Instance setReplicaCount(java.lang.Integer replicaCount) {
    this.replicaCount = replicaCount;
    return this;
  }

  /**
   * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for
   * this instance. Range must be unique and non-overlapping with existing subnets in an authorized
   * network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges
   * associated with this private service access connection. If not provided, the service will
   * choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For
   * READ_REPLICAS_ENABLED the default block size is /28.
   * @return value or {@code null} for none
   */
  public java.lang.String getReservedIpRange() {
    return reservedIpRange;
  }

  /**
   * Optional. For DIRECT_PEERING mode, the CIDR range of internal addresses that are reserved for
   * this instance. Range must be unique and non-overlapping with existing subnets in an authorized
   * network. For PRIVATE_SERVICE_ACCESS mode, the name of one allocated IP address ranges
   * associated with this private service access connection. If not provided, the service will
   * choose an unused /29 block, for example, 10.0.0.0/29 or 192.168.0.0/29. For
   * READ_REPLICAS_ENABLED the default block size is /28.
   * @param reservedIpRange reservedIpRange or {@code null} for none
   */
  public Instance setReservedIpRange(java.lang.String reservedIpRange) {
    this.reservedIpRange = reservedIpRange;
    return this;
  }

  /**
   * Optional. Additional IP range for node placement. Required when enabling read replicas on an
   * existing instance. For DIRECT_PEERING mode value must be a CIDR range of size /28, or "auto".
   * For PRIVATE_SERVICE_ACCESS mode value must be the name of an allocated address range associated
   * with the private service access connection, or "auto".
   * @return value or {@code null} for none
   */
  public java.lang.String getSecondaryIpRange() {
    return secondaryIpRange;
  }

  /**
   * Optional. Additional IP range for node placement. Required when enabling read replicas on an
   * existing instance. For DIRECT_PEERING mode value must be a CIDR range of size /28, or "auto".
   * For PRIVATE_SERVICE_ACCESS mode value must be the name of an allocated address range associated
   * with the private service access connection, or "auto".
   * @param secondaryIpRange secondaryIpRange or {@code null} for none
   */
  public Instance setSecondaryIpRange(java.lang.String secondaryIpRange) {
    this.secondaryIpRange = secondaryIpRange;
    return this;
  }

  /**
   * Output only. List of server CA certificates for the instance.
   * @return value or {@code null} for none
   */
  public java.util.List<TlsCertificate> getServerCaCerts() {
    return serverCaCerts;
  }

  /**
   * Output only. List of server CA certificates for the instance.
   * @param serverCaCerts serverCaCerts or {@code null} for none
   */
  public Instance setServerCaCerts(java.util.List<TlsCertificate> serverCaCerts) {
    this.serverCaCerts = serverCaCerts;
    return this;
  }

  /**
   * Output only. The current state of this instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current state of this instance.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Output only. Additional information about the current status of this instance, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getStatusMessage() {
    return statusMessage;
  }

  /**
   * Output only. Additional information about the current status of this instance, if available.
   * @param statusMessage statusMessage or {@code null} for none
   */
  public Instance setStatusMessage(java.lang.String statusMessage) {
    this.statusMessage = statusMessage;
    return this;
  }

  /**
   * Required. The service tier of the instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getTier() {
    return tier;
  }

  /**
   * Required. The service tier of the instance.
   * @param tier tier or {@code null} for none
   */
  public Instance setTier(java.lang.String tier) {
    this.tier = tier;
    return this;
  }

  /**
   * Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the
   * instance.
   * @return value or {@code null} for none
   */
  public java.lang.String getTransitEncryptionMode() {
    return transitEncryptionMode;
  }

  /**
   * Optional. The TLS mode of the Redis instance. If not provided, TLS is disabled for the
   * instance.
   * @param transitEncryptionMode transitEncryptionMode or {@code null} for none
   */
  public Instance setTransitEncryptionMode(java.lang.String transitEncryptionMode) {
    this.transitEncryptionMode = transitEncryptionMode;
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

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

package com.google.api.services.compute.model;

/**
 * Represents a Health-Check as a Service resource.
 *
 * (== resource_for {$api_version}.regionHealthCheckServices ==)
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HealthCheckService extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String creationTimestamp;

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a HealthCheckService. An up-
   * to-date fingerprint must be provided in order to patch/update the HealthCheckService;
   * Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
   * make a get() request to retrieve the HealthCheckService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fingerprint;

  /**
   * List of URLs to the HealthCheck resources. Must have at least one HealthCheck, and not more
   * than 10. HealthCheck resources must have portSpecification=USE_SERVING_PORT. For regional
   * HealthCheckService, the HealthCheck must be regional and in the same region. For global
   * HealthCheckService, HealthCheck must be global. Mix of regional and global HealthChecks is not
   * supported. Multiple regional HealthChecks must belong to the same region. Regional HealthChecks
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> healthChecks;

  /**
   * Optional. Policy for how the results from multiple health checks for the same endpoint are
   * aggregated. Defaults to NO_AGGREGATION if unspecified. - NO_AGGREGATION. An EndpointHealth
   * message is returned for each backend in the health check service.  - AND. If any backend's
   * health check reports UNHEALTHY, then UNHEALTHY is the HealthState of the entire health check
   * service. If all backend's are healthy, the HealthState of the health check service is HEALTHY.
   * .
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String healthStatusAggregationPolicy;

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * [Output only] Type of the resource. Always compute#healthCheckServicefor health check services.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of URLs to the NetworkEndpointGroup resources. Must not have more than 100. For regional
   * HealthCheckService, NEGs must be in zones in the region of the HealthCheckService.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> networkEndpointGroups;

  /**
   * List of URLs to the NotificationEndpoint resources. Must not have more than 10. A list of
   * endpoints for receiving notifications of change in health status. For regional
   * HealthCheckService, NotificationEndpoint must be regional and in the same region. For global
   * HealthCheckService, NotificationEndpoint must be global.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> notificationEndpoints;

  /**
   * [Output Only] URL of the region where the health check service resides. This field is not
   * applicable to global health check services. You must specify this field as part of the HTTP
   * request URL. It is not settable as a field in the request body.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String region;

  /**
   * [Output Only] Server-defined URL for the resource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCreationTimestamp() {
    return creationTimestamp;
  }

  /**
   * [Output Only] Creation timestamp in RFC3339 text format.
   * @param creationTimestamp creationTimestamp or {@code null} for none
   */
  public HealthCheckService setCreationTimestamp(java.lang.String creationTimestamp) {
    this.creationTimestamp = creationTimestamp;
    return this;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * An optional description of this resource. Provide this property when you create the resource.
   * @param description description or {@code null} for none
   */
  public HealthCheckService setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a HealthCheckService. An up-
   * to-date fingerprint must be provided in order to patch/update the HealthCheckService;
   * Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
   * make a get() request to retrieve the HealthCheckService.
   * @see #decodeFingerprint()
   * @return value or {@code null} for none
   */
  public java.lang.String getFingerprint() {
    return fingerprint;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a HealthCheckService. An up-
   * to-date fingerprint must be provided in order to patch/update the HealthCheckService;
   * Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
   * make a get() request to retrieve the HealthCheckService.
   * @see #getFingerprint()
   * @return Base64 decoded value or {@code null} for none
   *
   * @since 1.14
   */
  public byte[] decodeFingerprint() {
    return com.google.api.client.util.Base64.decodeBase64(fingerprint);
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a HealthCheckService. An up-
   * to-date fingerprint must be provided in order to patch/update the HealthCheckService;
   * Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
   * make a get() request to retrieve the HealthCheckService.
   * @see #encodeFingerprint()
   * @param fingerprint fingerprint or {@code null} for none
   */
  public HealthCheckService setFingerprint(java.lang.String fingerprint) {
    this.fingerprint = fingerprint;
    return this;
  }

  /**
   * Fingerprint of this resource. A hash of the contents stored in this object. This field is used
   * in optimistic locking. This field will be ignored when inserting a HealthCheckService. An up-
   * to-date fingerprint must be provided in order to patch/update the HealthCheckService;
   * Otherwise, the request will fail with error 412 conditionNotMet. To see the latest fingerprint,
   * make a get() request to retrieve the HealthCheckService.
   * @see #setFingerprint()
   *
   * <p>
   * The value is encoded Base64 or {@code null} for none.
   * </p>
   *
   * @since 1.14
   */
  public HealthCheckService encodeFingerprint(byte[] fingerprint) {
    this.fingerprint = com.google.api.client.util.Base64.encodeBase64URLSafeString(fingerprint);
    return this;
  }

  /**
   * List of URLs to the HealthCheck resources. Must have at least one HealthCheck, and not more
   * than 10. HealthCheck resources must have portSpecification=USE_SERVING_PORT. For regional
   * HealthCheckService, the HealthCheck must be regional and in the same region. For global
   * HealthCheckService, HealthCheck must be global. Mix of regional and global HealthChecks is not
   * supported. Multiple regional HealthChecks must belong to the same region. Regional HealthChecks
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getHealthChecks() {
    return healthChecks;
  }

  /**
   * List of URLs to the HealthCheck resources. Must have at least one HealthCheck, and not more
   * than 10. HealthCheck resources must have portSpecification=USE_SERVING_PORT. For regional
   * HealthCheckService, the HealthCheck must be regional and in the same region. For global
   * HealthCheckService, HealthCheck must be global. Mix of regional and global HealthChecks is not
   * supported. Multiple regional HealthChecks must belong to the same region. Regional HealthChecks
   * @param healthChecks healthChecks or {@code null} for none
   */
  public HealthCheckService setHealthChecks(java.util.List<java.lang.String> healthChecks) {
    this.healthChecks = healthChecks;
    return this;
  }

  /**
   * Optional. Policy for how the results from multiple health checks for the same endpoint are
   * aggregated. Defaults to NO_AGGREGATION if unspecified. - NO_AGGREGATION. An EndpointHealth
   * message is returned for each backend in the health check service.  - AND. If any backend's
   * health check reports UNHEALTHY, then UNHEALTHY is the HealthState of the entire health check
   * service. If all backend's are healthy, the HealthState of the health check service is HEALTHY.
   * .
   * @return value or {@code null} for none
   */
  public java.lang.String getHealthStatusAggregationPolicy() {
    return healthStatusAggregationPolicy;
  }

  /**
   * Optional. Policy for how the results from multiple health checks for the same endpoint are
   * aggregated. Defaults to NO_AGGREGATION if unspecified. - NO_AGGREGATION. An EndpointHealth
   * message is returned for each backend in the health check service.  - AND. If any backend's
   * health check reports UNHEALTHY, then UNHEALTHY is the HealthState of the entire health check
   * service. If all backend's are healthy, the HealthState of the health check service is HEALTHY.
   * .
   * @param healthStatusAggregationPolicy healthStatusAggregationPolicy or {@code null} for none
   */
  public HealthCheckService setHealthStatusAggregationPolicy(java.lang.String healthStatusAggregationPolicy) {
    this.healthStatusAggregationPolicy = healthStatusAggregationPolicy;
    return this;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * [Output Only] The unique identifier for the resource. This identifier is defined by the server.
   * @param id id or {@code null} for none
   */
  public HealthCheckService setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * [Output only] Type of the resource. Always compute#healthCheckServicefor health check services.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output only] Type of the resource. Always compute#healthCheckServicefor health check services.
   * @param kind kind or {@code null} for none
   */
  public HealthCheckService setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource. The name must be 1-63 characters long, and comply with RFC1035.
   * Specifically, the name must be 1-63 characters long and match the regular expression
   * `[a-z]([-a-z0-9]*[a-z0-9])?` which means the first character must be a lowercase letter, and
   * all following characters must be a dash, lowercase letter, or digit, except the last character,
   * which cannot be a dash.
   * @param name name or {@code null} for none
   */
  public HealthCheckService setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * List of URLs to the NetworkEndpointGroup resources. Must not have more than 100. For regional
   * HealthCheckService, NEGs must be in zones in the region of the HealthCheckService.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNetworkEndpointGroups() {
    return networkEndpointGroups;
  }

  /**
   * List of URLs to the NetworkEndpointGroup resources. Must not have more than 100. For regional
   * HealthCheckService, NEGs must be in zones in the region of the HealthCheckService.
   * @param networkEndpointGroups networkEndpointGroups or {@code null} for none
   */
  public HealthCheckService setNetworkEndpointGroups(java.util.List<java.lang.String> networkEndpointGroups) {
    this.networkEndpointGroups = networkEndpointGroups;
    return this;
  }

  /**
   * List of URLs to the NotificationEndpoint resources. Must not have more than 10. A list of
   * endpoints for receiving notifications of change in health status. For regional
   * HealthCheckService, NotificationEndpoint must be regional and in the same region. For global
   * HealthCheckService, NotificationEndpoint must be global.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getNotificationEndpoints() {
    return notificationEndpoints;
  }

  /**
   * List of URLs to the NotificationEndpoint resources. Must not have more than 10. A list of
   * endpoints for receiving notifications of change in health status. For regional
   * HealthCheckService, NotificationEndpoint must be regional and in the same region. For global
   * HealthCheckService, NotificationEndpoint must be global.
   * @param notificationEndpoints notificationEndpoints or {@code null} for none
   */
  public HealthCheckService setNotificationEndpoints(java.util.List<java.lang.String> notificationEndpoints) {
    this.notificationEndpoints = notificationEndpoints;
    return this;
  }

  /**
   * [Output Only] URL of the region where the health check service resides. This field is not
   * applicable to global health check services. You must specify this field as part of the HTTP
   * request URL. It is not settable as a field in the request body.
   * @return value or {@code null} for none
   */
  public java.lang.String getRegion() {
    return region;
  }

  /**
   * [Output Only] URL of the region where the health check service resides. This field is not
   * applicable to global health check services. You must specify this field as part of the HTTP
   * request URL. It is not settable as a field in the request body.
   * @param region region or {@code null} for none
   */
  public HealthCheckService setRegion(java.lang.String region) {
    this.region = region;
    return this;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * [Output Only] Server-defined URL for the resource.
   * @param selfLink selfLink or {@code null} for none
   */
  public HealthCheckService setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  @Override
  public HealthCheckService set(String fieldName, Object value) {
    return (HealthCheckService) super.set(fieldName, value);
  }

  @Override
  public HealthCheckService clone() {
    return (HealthCheckService) super.clone();
  }

}

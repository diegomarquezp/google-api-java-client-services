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

package com.google.api.services.apigee.v1.model;

/**
 * Runtime configuration for the organization. Response for GetRuntimeConfig.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1RuntimeConfig extends com.google.api.client.json.GenericJson {

  /**
   * Cloud Storage bucket used for uploading Analytics records.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String analyticsBucket;

  /**
   * Name of the resource in the following format: `organizations/{org}/runtimeConfig`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. Tenant project ID associated with the Apigee organization. The tenant project is
   * used to host Google-managed resources that are dedicated to this Apigee organization. Clients
   * have limited access to resources within the tenant project used to support Apigee runtime
   * instances. Access to the tenant project is managed using SetSyncAuthorization. It can be empty
   * if the tenant project hasn't been created yet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tenantProjectId;

  /**
   * Cloud Storage bucket used for uploading Trace records.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String traceBucket;

  /**
   * Cloud Storage bucket used for uploading Analytics records.
   * @return value or {@code null} for none
   */
  public java.lang.String getAnalyticsBucket() {
    return analyticsBucket;
  }

  /**
   * Cloud Storage bucket used for uploading Analytics records.
   * @param analyticsBucket analyticsBucket or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeConfig setAnalyticsBucket(java.lang.String analyticsBucket) {
    this.analyticsBucket = analyticsBucket;
    return this;
  }

  /**
   * Name of the resource in the following format: `organizations/{org}/runtimeConfig`.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the resource in the following format: `organizations/{org}/runtimeConfig`.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. Tenant project ID associated with the Apigee organization. The tenant project is
   * used to host Google-managed resources that are dedicated to this Apigee organization. Clients
   * have limited access to resources within the tenant project used to support Apigee runtime
   * instances. Access to the tenant project is managed using SetSyncAuthorization. It can be empty
   * if the tenant project hasn't been created yet.
   * @return value or {@code null} for none
   */
  public java.lang.String getTenantProjectId() {
    return tenantProjectId;
  }

  /**
   * Output only. Tenant project ID associated with the Apigee organization. The tenant project is
   * used to host Google-managed resources that are dedicated to this Apigee organization. Clients
   * have limited access to resources within the tenant project used to support Apigee runtime
   * instances. Access to the tenant project is managed using SetSyncAuthorization. It can be empty
   * if the tenant project hasn't been created yet.
   * @param tenantProjectId tenantProjectId or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeConfig setTenantProjectId(java.lang.String tenantProjectId) {
    this.tenantProjectId = tenantProjectId;
    return this;
  }

  /**
   * Cloud Storage bucket used for uploading Trace records.
   * @return value or {@code null} for none
   */
  public java.lang.String getTraceBucket() {
    return traceBucket;
  }

  /**
   * Cloud Storage bucket used for uploading Trace records.
   * @param traceBucket traceBucket or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeConfig setTraceBucket(java.lang.String traceBucket) {
    this.traceBucket = traceBucket;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1RuntimeConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1RuntimeConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1RuntimeConfig clone() {
    return (GoogleCloudApigeeV1RuntimeConfig) super.clone();
  }

}

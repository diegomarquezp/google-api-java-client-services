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
 * NEXT ID: 9
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1DeploymentConfig extends com.google.api.client.json.GenericJson {

  /**
   * Additional key-value metadata for the deployment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> attributes;

  /**
   * Base path where the application will be hosted. Defaults to "/".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String basePath;

  /**
   * Location of the API proxy bundle as a URI.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String location;

  /**
   * Name of the API or shared flow revision to be deployed in the following format:
   * `organizations/{org}/apis/{api}/revisions/{rev}` or
   * `organizations/{org}/sharedflows/{sharedflow}/revisions/{rev}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Unique ID of the API proxy revision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String proxyUid;

  /**
   * The service account identity associated with this deployment. If non-empty, will be in the
   * following format: `projects/-/serviceAccounts/{account_email}`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String serviceAccount;

  /**
   * Unique ID. The ID will only change if the deployment is deleted and recreated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String uid;

  /**
   * Additional key-value metadata for the deployment.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getAttributes() {
    return attributes;
  }

  /**
   * Additional key-value metadata for the deployment.
   * @param attributes attributes or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentConfig setAttributes(java.util.Map<String, java.lang.String> attributes) {
    this.attributes = attributes;
    return this;
  }

  /**
   * Base path where the application will be hosted. Defaults to "/".
   * @return value or {@code null} for none
   */
  public java.lang.String getBasePath() {
    return basePath;
  }

  /**
   * Base path where the application will be hosted. Defaults to "/".
   * @param basePath basePath or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentConfig setBasePath(java.lang.String basePath) {
    this.basePath = basePath;
    return this;
  }

  /**
   * Location of the API proxy bundle as a URI.
   * @return value or {@code null} for none
   */
  public java.lang.String getLocation() {
    return location;
  }

  /**
   * Location of the API proxy bundle as a URI.
   * @param location location or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentConfig setLocation(java.lang.String location) {
    this.location = location;
    return this;
  }

  /**
   * Name of the API or shared flow revision to be deployed in the following format:
   * `organizations/{org}/apis/{api}/revisions/{rev}` or
   * `organizations/{org}/sharedflows/{sharedflow}/revisions/{rev}`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the API or shared flow revision to be deployed in the following format:
   * `organizations/{org}/apis/{api}/revisions/{rev}` or
   * `organizations/{org}/sharedflows/{sharedflow}/revisions/{rev}`
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Unique ID of the API proxy revision.
   * @return value or {@code null} for none
   */
  public java.lang.String getProxyUid() {
    return proxyUid;
  }

  /**
   * Unique ID of the API proxy revision.
   * @param proxyUid proxyUid or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentConfig setProxyUid(java.lang.String proxyUid) {
    this.proxyUid = proxyUid;
    return this;
  }

  /**
   * The service account identity associated with this deployment. If non-empty, will be in the
   * following format: `projects/-/serviceAccounts/{account_email}`
   * @return value or {@code null} for none
   */
  public java.lang.String getServiceAccount() {
    return serviceAccount;
  }

  /**
   * The service account identity associated with this deployment. If non-empty, will be in the
   * following format: `projects/-/serviceAccounts/{account_email}`
   * @param serviceAccount serviceAccount or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentConfig setServiceAccount(java.lang.String serviceAccount) {
    this.serviceAccount = serviceAccount;
    return this;
  }

  /**
   * Unique ID. The ID will only change if the deployment is deleted and recreated.
   * @return value or {@code null} for none
   */
  public java.lang.String getUid() {
    return uid;
  }

  /**
   * Unique ID. The ID will only change if the deployment is deleted and recreated.
   * @param uid uid or {@code null} for none
   */
  public GoogleCloudApigeeV1DeploymentConfig setUid(java.lang.String uid) {
    this.uid = uid;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1DeploymentConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1DeploymentConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1DeploymentConfig clone() {
    return (GoogleCloudApigeeV1DeploymentConfig) super.clone();
  }

}

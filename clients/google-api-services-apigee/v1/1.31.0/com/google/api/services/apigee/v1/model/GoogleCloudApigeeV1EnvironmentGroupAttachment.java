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
 * EnvironmentGroupAttachment is a resource which defines an attachment of an environment to an
 * environment group.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1EnvironmentGroupAttachment extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The time at which the environment group attachment was created as milliseconds
   * since epoch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long createdAt;

  /**
   * Required. ID of the attached environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String environment;

  /**
   * ID of the environment group attachment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The time at which the environment group attachment was created as milliseconds
   * since epoch.
   * @return value or {@code null} for none
   */
  public java.lang.Long getCreatedAt() {
    return createdAt;
  }

  /**
   * Output only. The time at which the environment group attachment was created as milliseconds
   * since epoch.
   * @param createdAt createdAt or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentGroupAttachment setCreatedAt(java.lang.Long createdAt) {
    this.createdAt = createdAt;
    return this;
  }

  /**
   * Required. ID of the attached environment.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnvironment() {
    return environment;
  }

  /**
   * Required. ID of the attached environment.
   * @param environment environment or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentGroupAttachment setEnvironment(java.lang.String environment) {
    this.environment = environment;
    return this;
  }

  /**
   * ID of the environment group attachment.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * ID of the environment group attachment.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1EnvironmentGroupAttachment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1EnvironmentGroupAttachment set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1EnvironmentGroupAttachment) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1EnvironmentGroupAttachment clone() {
    return (GoogleCloudApigeeV1EnvironmentGroupAttachment) super.clone();
  }

}

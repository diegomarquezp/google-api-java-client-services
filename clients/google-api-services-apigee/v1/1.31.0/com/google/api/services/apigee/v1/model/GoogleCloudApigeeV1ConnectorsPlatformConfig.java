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
 * Configuration for the Connectors Platform add-on.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1ConnectorsPlatformConfig extends com.google.api.client.json.GenericJson {

  /**
   * Flag that specifies whether the Connectors Platform add-on is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enabled;

  /**
   * Output only. Time at which the Connectors Platform add-on expires in in milliseconds since
   * epoch. If unspecified, the add-on will never expire.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long expiresAt;

  /**
   * Flag that specifies whether the Connectors Platform add-on is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnabled() {
    return enabled;
  }

  /**
   * Flag that specifies whether the Connectors Platform add-on is enabled.
   * @param enabled enabled or {@code null} for none
   */
  public GoogleCloudApigeeV1ConnectorsPlatformConfig setEnabled(java.lang.Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

  /**
   * Output only. Time at which the Connectors Platform add-on expires in in milliseconds since
   * epoch. If unspecified, the add-on will never expire.
   * @return value or {@code null} for none
   */
  public java.lang.Long getExpiresAt() {
    return expiresAt;
  }

  /**
   * Output only. Time at which the Connectors Platform add-on expires in in milliseconds since
   * epoch. If unspecified, the add-on will never expire.
   * @param expiresAt expiresAt or {@code null} for none
   */
  public GoogleCloudApigeeV1ConnectorsPlatformConfig setExpiresAt(java.lang.Long expiresAt) {
    this.expiresAt = expiresAt;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1ConnectorsPlatformConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1ConnectorsPlatformConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1ConnectorsPlatformConfig clone() {
    return (GoogleCloudApigeeV1ConnectorsPlatformConfig) super.clone();
  }

}

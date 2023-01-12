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

package com.google.api.services.integrations.v1.model;

/**
 * The credentials to authenticate a user agent with a server that is put in HTTP Authorization
 * request header.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudIntegrationsV1alphaAuthToken extends com.google.api.client.json.GenericJson {

  /**
   * The token for the auth type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String token;

  /**
   * Authentication type, e.g. "Basic", "Bearer", etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The token for the auth type.
   * @return value or {@code null} for none
   */
  public java.lang.String getToken() {
    return token;
  }

  /**
   * The token for the auth type.
   * @param token token or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAuthToken setToken(java.lang.String token) {
    this.token = token;
    return this;
  }

  /**
   * Authentication type, e.g. "Basic", "Bearer", etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Authentication type, e.g. "Basic", "Bearer", etc.
   * @param type type or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAuthToken setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaAuthToken set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaAuthToken) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaAuthToken clone() {
    return (GoogleCloudIntegrationsV1alphaAuthToken) super.clone();
  }

}
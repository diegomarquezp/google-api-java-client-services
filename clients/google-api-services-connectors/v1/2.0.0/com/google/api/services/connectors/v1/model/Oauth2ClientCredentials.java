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

package com.google.api.services.connectors.v1.model;

/**
 * Parameters to support Oauth 2.0 Client Credentials Grant Authentication. See
 * https://tools.ietf.org/html/rfc6749#section-1.3.4 for more details.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Oauth2ClientCredentials extends com.google.api.client.json.GenericJson {

  /**
   * The client identifier.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientId;

  /**
   * Secret version reference containing the client secret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Secret clientSecret;

  /**
   * The client identifier.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientId() {
    return clientId;
  }

  /**
   * The client identifier.
   * @param clientId clientId or {@code null} for none
   */
  public Oauth2ClientCredentials setClientId(java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * Secret version reference containing the client secret.
   * @return value or {@code null} for none
   */
  public Secret getClientSecret() {
    return clientSecret;
  }

  /**
   * Secret version reference containing the client secret.
   * @param clientSecret clientSecret or {@code null} for none
   */
  public Oauth2ClientCredentials setClientSecret(Secret clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  @Override
  public Oauth2ClientCredentials set(String fieldName, Object value) {
    return (Oauth2ClientCredentials) super.set(fieldName, value);
  }

  @Override
  public Oauth2ClientCredentials clone() {
    return (Oauth2ClientCredentials) super.clone();
  }

}

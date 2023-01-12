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
 * The OAuth Type where the client sends request with the client id and requested scopes to auth
 * endpoint. User sees a consent screen and auth code is received at specified redirect url
 * afterwards. The auth code is then combined with the client id and secret and sent to the token
 * endpoint in exchange for the access and refresh token. The refresh token can be used to fetch new
 * access tokens.
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
public final class GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode extends com.google.api.client.json.GenericJson {

  /**
   * The access token received from the token endpoint.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaAccessToken accessToken;

  /**
   * Indicates if the user has opted in Google Reauth Policy. If opted in, the refresh token will be
   * valid for 20 hours, after which time users must re-authenticate in order to obtain a new one.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean applyReauthPolicy;

  /**
   * The Auth Code that is used to initially retrieve the access token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authCode;

  /**
   * The auth url endpoint to send the auth code request to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authEndpoint;

  /**
   * The auth parameters sent along with the auth code request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaParameterMap authParams;

  /**
   * The client's id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientId;

  /**
   * The client's secret.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clientSecret;

  /**
   * Represent how to pass parameters to fetch access token
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String requestType;

  /**
   * A space-delimited list of requested scope permissions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String scope;

  /**
   * The token url endpoint to send the token request to.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String tokenEndpoint;

  /**
   * The token parameters sent along with the token request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudIntegrationsV1alphaParameterMap tokenParams;

  /**
   * The access token received from the token endpoint.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaAccessToken getAccessToken() {
    return accessToken;
  }

  /**
   * The access token received from the token endpoint.
   * @param accessToken accessToken or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setAccessToken(GoogleCloudIntegrationsV1alphaAccessToken accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Indicates if the user has opted in Google Reauth Policy. If opted in, the refresh token will be
   * valid for 20 hours, after which time users must re-authenticate in order to obtain a new one.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getApplyReauthPolicy() {
    return applyReauthPolicy;
  }

  /**
   * Indicates if the user has opted in Google Reauth Policy. If opted in, the refresh token will be
   * valid for 20 hours, after which time users must re-authenticate in order to obtain a new one.
   * @param applyReauthPolicy applyReauthPolicy or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setApplyReauthPolicy(java.lang.Boolean applyReauthPolicy) {
    this.applyReauthPolicy = applyReauthPolicy;
    return this;
  }

  /**
   * The Auth Code that is used to initially retrieve the access token.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthCode() {
    return authCode;
  }

  /**
   * The Auth Code that is used to initially retrieve the access token.
   * @param authCode authCode or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setAuthCode(java.lang.String authCode) {
    this.authCode = authCode;
    return this;
  }

  /**
   * The auth url endpoint to send the auth code request to.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthEndpoint() {
    return authEndpoint;
  }

  /**
   * The auth url endpoint to send the auth code request to.
   * @param authEndpoint authEndpoint or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setAuthEndpoint(java.lang.String authEndpoint) {
    this.authEndpoint = authEndpoint;
    return this;
  }

  /**
   * The auth parameters sent along with the auth code request.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaParameterMap getAuthParams() {
    return authParams;
  }

  /**
   * The auth parameters sent along with the auth code request.
   * @param authParams authParams or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setAuthParams(GoogleCloudIntegrationsV1alphaParameterMap authParams) {
    this.authParams = authParams;
    return this;
  }

  /**
   * The client's id.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientId() {
    return clientId;
  }

  /**
   * The client's id.
   * @param clientId clientId or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setClientId(java.lang.String clientId) {
    this.clientId = clientId;
    return this;
  }

  /**
   * The client's secret.
   * @return value or {@code null} for none
   */
  public java.lang.String getClientSecret() {
    return clientSecret;
  }

  /**
   * The client's secret.
   * @param clientSecret clientSecret or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setClientSecret(java.lang.String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

  /**
   * Represent how to pass parameters to fetch access token
   * @return value or {@code null} for none
   */
  public java.lang.String getRequestType() {
    return requestType;
  }

  /**
   * Represent how to pass parameters to fetch access token
   * @param requestType requestType or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setRequestType(java.lang.String requestType) {
    this.requestType = requestType;
    return this;
  }

  /**
   * A space-delimited list of requested scope permissions.
   * @return value or {@code null} for none
   */
  public java.lang.String getScope() {
    return scope;
  }

  /**
   * A space-delimited list of requested scope permissions.
   * @param scope scope or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setScope(java.lang.String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * The token url endpoint to send the token request to.
   * @return value or {@code null} for none
   */
  public java.lang.String getTokenEndpoint() {
    return tokenEndpoint;
  }

  /**
   * The token url endpoint to send the token request to.
   * @param tokenEndpoint tokenEndpoint or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setTokenEndpoint(java.lang.String tokenEndpoint) {
    this.tokenEndpoint = tokenEndpoint;
    return this;
  }

  /**
   * The token parameters sent along with the token request.
   * @return value or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaParameterMap getTokenParams() {
    return tokenParams;
  }

  /**
   * The token parameters sent along with the token request.
   * @param tokenParams tokenParams or {@code null} for none
   */
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode setTokenParams(GoogleCloudIntegrationsV1alphaParameterMap tokenParams) {
    this.tokenParams = tokenParams;
    return this;
  }

  @Override
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode set(String fieldName, Object value) {
    return (GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode clone() {
    return (GoogleCloudIntegrationsV1alphaOAuth2AuthorizationCode) super.clone();
  }

}
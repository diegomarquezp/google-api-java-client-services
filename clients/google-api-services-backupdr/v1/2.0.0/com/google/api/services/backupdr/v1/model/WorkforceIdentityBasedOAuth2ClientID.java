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

package com.google.api.services.backupdr.v1.model;

/**
 * OAuth Client ID depending on the Workforce Identity i.e. either 1p or 3p,
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Backup and DR Service API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkforceIdentityBasedOAuth2ClientID extends com.google.api.client.json.GenericJson {

  /**
   * Output only. First party OAuth Client ID for Google Identities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstPartyOauth2ClientId;

  /**
   * Output only. Third party OAuth Client ID for External Identity Providers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thirdPartyOauth2ClientId;

  /**
   * Output only. First party OAuth Client ID for Google Identities.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstPartyOauth2ClientId() {
    return firstPartyOauth2ClientId;
  }

  /**
   * Output only. First party OAuth Client ID for Google Identities.
   * @param firstPartyOauth2ClientId firstPartyOauth2ClientId or {@code null} for none
   */
  public WorkforceIdentityBasedOAuth2ClientID setFirstPartyOauth2ClientId(java.lang.String firstPartyOauth2ClientId) {
    this.firstPartyOauth2ClientId = firstPartyOauth2ClientId;
    return this;
  }

  /**
   * Output only. Third party OAuth Client ID for External Identity Providers.
   * @return value or {@code null} for none
   */
  public java.lang.String getThirdPartyOauth2ClientId() {
    return thirdPartyOauth2ClientId;
  }

  /**
   * Output only. Third party OAuth Client ID for External Identity Providers.
   * @param thirdPartyOauth2ClientId thirdPartyOauth2ClientId or {@code null} for none
   */
  public WorkforceIdentityBasedOAuth2ClientID setThirdPartyOauth2ClientId(java.lang.String thirdPartyOauth2ClientId) {
    this.thirdPartyOauth2ClientId = thirdPartyOauth2ClientId;
    return this;
  }

  @Override
  public WorkforceIdentityBasedOAuth2ClientID set(String fieldName, Object value) {
    return (WorkforceIdentityBasedOAuth2ClientID) super.set(fieldName, value);
  }

  @Override
  public WorkforceIdentityBasedOAuth2ClientID clone() {
    return (WorkforceIdentityBasedOAuth2ClientID) super.clone();
  }

}

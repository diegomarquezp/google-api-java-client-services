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
 * ManagementURI depending on the Workforce Identity i.e. either 1p or 3p.
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
public final class WorkforceIdentityBasedManagementURI extends com.google.api.client.json.GenericJson {

  /**
   * Output only. First party Management URI for Google Identities.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String firstPartyManagementUri;

  /**
   * Output only. Third party Management URI for External Identity Providers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String thirdPartyManagementUri;

  /**
   * Output only. First party Management URI for Google Identities.
   * @return value or {@code null} for none
   */
  public java.lang.String getFirstPartyManagementUri() {
    return firstPartyManagementUri;
  }

  /**
   * Output only. First party Management URI for Google Identities.
   * @param firstPartyManagementUri firstPartyManagementUri or {@code null} for none
   */
  public WorkforceIdentityBasedManagementURI setFirstPartyManagementUri(java.lang.String firstPartyManagementUri) {
    this.firstPartyManagementUri = firstPartyManagementUri;
    return this;
  }

  /**
   * Output only. Third party Management URI for External Identity Providers.
   * @return value or {@code null} for none
   */
  public java.lang.String getThirdPartyManagementUri() {
    return thirdPartyManagementUri;
  }

  /**
   * Output only. Third party Management URI for External Identity Providers.
   * @param thirdPartyManagementUri thirdPartyManagementUri or {@code null} for none
   */
  public WorkforceIdentityBasedManagementURI setThirdPartyManagementUri(java.lang.String thirdPartyManagementUri) {
    this.thirdPartyManagementUri = thirdPartyManagementUri;
    return this;
  }

  @Override
  public WorkforceIdentityBasedManagementURI set(String fieldName, Object value) {
    return (WorkforceIdentityBasedManagementURI) super.set(fieldName, value);
  }

  @Override
  public WorkforceIdentityBasedManagementURI clone() {
    return (WorkforceIdentityBasedManagementURI) super.clone();
  }

}

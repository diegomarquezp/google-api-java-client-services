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

package com.google.api.services.dfareporting.model;

/**
 * Omniture Integration Settings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Campaign Manager 360 API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OmnitureSettings extends com.google.api.client.json.GenericJson {

  /**
   * Whether placement cost data will be sent to Omniture. This property can be enabled only if
   * omnitureIntegrationEnabled is true.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean omnitureCostDataEnabled;

  /**
   * Whether Omniture integration is enabled. This property can be enabled only when the "Advanced
   * Ad Serving" account setting is enabled.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean omnitureIntegrationEnabled;

  /**
   * Whether placement cost data will be sent to Omniture. This property can be enabled only if
   * omnitureIntegrationEnabled is true.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOmnitureCostDataEnabled() {
    return omnitureCostDataEnabled;
  }

  /**
   * Whether placement cost data will be sent to Omniture. This property can be enabled only if
   * omnitureIntegrationEnabled is true.
   * @param omnitureCostDataEnabled omnitureCostDataEnabled or {@code null} for none
   */
  public OmnitureSettings setOmnitureCostDataEnabled(java.lang.Boolean omnitureCostDataEnabled) {
    this.omnitureCostDataEnabled = omnitureCostDataEnabled;
    return this;
  }

  /**
   * Whether Omniture integration is enabled. This property can be enabled only when the "Advanced
   * Ad Serving" account setting is enabled.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getOmnitureIntegrationEnabled() {
    return omnitureIntegrationEnabled;
  }

  /**
   * Whether Omniture integration is enabled. This property can be enabled only when the "Advanced
   * Ad Serving" account setting is enabled.
   * @param omnitureIntegrationEnabled omnitureIntegrationEnabled or {@code null} for none
   */
  public OmnitureSettings setOmnitureIntegrationEnabled(java.lang.Boolean omnitureIntegrationEnabled) {
    this.omnitureIntegrationEnabled = omnitureIntegrationEnabled;
    return this;
  }

  @Override
  public OmnitureSettings set(String fieldName, Object value) {
    return (OmnitureSettings) super.set(fieldName, value);
  }

  @Override
  public OmnitureSettings clone() {
    return (OmnitureSettings) super.clone();
  }

}

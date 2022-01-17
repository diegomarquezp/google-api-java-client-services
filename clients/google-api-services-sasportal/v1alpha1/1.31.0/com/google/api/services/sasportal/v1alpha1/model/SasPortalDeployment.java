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

package com.google.api.services.sasportal.v1alpha1.model;

/**
 * The Deployment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the SAS Portal API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SasPortalDeployment extends com.google.api.client.json.GenericJson {

  /**
   * The deployment's display name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Output only. The FRNs copied from its direct parent.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> frns;

  /**
   * Output only. Resource name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * User ID used by the devices belonging to this deployment. Each deployment should be associated
   * with one unique user ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> sasUserIds;

  /**
   * The deployment's display name.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * The deployment's display name.
   * @param displayName displayName or {@code null} for none
   */
  public SasPortalDeployment setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Output only. The FRNs copied from its direct parent.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFrns() {
    return frns;
  }

  /**
   * Output only. The FRNs copied from its direct parent.
   * @param frns frns or {@code null} for none
   */
  public SasPortalDeployment setFrns(java.util.List<java.lang.String> frns) {
    this.frns = frns;
    return this;
  }

  /**
   * Output only. Resource name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name.
   * @param name name or {@code null} for none
   */
  public SasPortalDeployment setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * User ID used by the devices belonging to this deployment. Each deployment should be associated
   * with one unique user ID.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSasUserIds() {
    return sasUserIds;
  }

  /**
   * User ID used by the devices belonging to this deployment. Each deployment should be associated
   * with one unique user ID.
   * @param sasUserIds sasUserIds or {@code null} for none
   */
  public SasPortalDeployment setSasUserIds(java.util.List<java.lang.String> sasUserIds) {
    this.sasUserIds = sasUserIds;
    return this;
  }

  @Override
  public SasPortalDeployment set(String fieldName, Object value) {
    return (SasPortalDeployment) super.set(fieldName, value);
  }

  @Override
  public SasPortalDeployment clone() {
    return (SasPortalDeployment) super.clone();
  }

}

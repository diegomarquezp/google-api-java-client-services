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

package com.google.api.services.compute.model;

/**
 * Model definition for FirewallPoliciesListAssociationsResponse.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class FirewallPoliciesListAssociationsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of associations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FirewallPolicyAssociation> associations;

  /**
   * [Output Only] Type of firewallPolicy associations. Always
   * compute#FirewallPoliciesListAssociations for lists of firewallPolicy associations.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A list of associations.
   * @return value or {@code null} for none
   */
  public java.util.List<FirewallPolicyAssociation> getAssociations() {
    return associations;
  }

  /**
   * A list of associations.
   * @param associations associations or {@code null} for none
   */
  public FirewallPoliciesListAssociationsResponse setAssociations(java.util.List<FirewallPolicyAssociation> associations) {
    this.associations = associations;
    return this;
  }

  /**
   * [Output Only] Type of firewallPolicy associations. Always
   * compute#FirewallPoliciesListAssociations for lists of firewallPolicy associations.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * [Output Only] Type of firewallPolicy associations. Always
   * compute#FirewallPoliciesListAssociations for lists of firewallPolicy associations.
   * @param kind kind or {@code null} for none
   */
  public FirewallPoliciesListAssociationsResponse setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  @Override
  public FirewallPoliciesListAssociationsResponse set(String fieldName, Object value) {
    return (FirewallPoliciesListAssociationsResponse) super.set(fieldName, value);
  }

  @Override
  public FirewallPoliciesListAssociationsResponse clone() {
    return (FirewallPoliciesListAssociationsResponse) super.clone();
  }

}

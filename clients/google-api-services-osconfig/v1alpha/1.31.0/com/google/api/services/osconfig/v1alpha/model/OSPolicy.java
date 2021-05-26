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

package com.google.api.services.osconfig.v1alpha.model;

/**
 * An OS policy defines the desired state configuration for a VM.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the OS Config API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class OSPolicy extends com.google.api.client.json.GenericJson {

  /**
   * This flag determines the OS policy compliance status when none of the resource groups within
   * the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported
   * as compliant even if the policy has nothing to validate or enforce.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowNoResourceGroupMatch;

  /**
   * Policy description. Length of the description is limited to 1024 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Required. The id of the OS policy with the following restrictions: * Must contain only
   * lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63
   * characters. * Must end with a number or a letter. * Must be unique within the assignment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * Required. Policy mode
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mode;

  /**
   * Required. List of resource groups for the policy. For a particular VM, resource groups are
   * evaluated in the order specified and the first resource group that is applicable is selected
   * and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is
   * considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag
   * `allow_no_resource_group_match`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OSPolicyResourceGroup> resourceGroups;

  /**
   * This flag determines the OS policy compliance status when none of the resource groups within
   * the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported
   * as compliant even if the policy has nothing to validate or enforce.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowNoResourceGroupMatch() {
    return allowNoResourceGroupMatch;
  }

  /**
   * This flag determines the OS policy compliance status when none of the resource groups within
   * the policy are applicable for a VM. Set this value to `true` if the policy needs to be reported
   * as compliant even if the policy has nothing to validate or enforce.
   * @param allowNoResourceGroupMatch allowNoResourceGroupMatch or {@code null} for none
   */
  public OSPolicy setAllowNoResourceGroupMatch(java.lang.Boolean allowNoResourceGroupMatch) {
    this.allowNoResourceGroupMatch = allowNoResourceGroupMatch;
    return this;
  }

  /**
   * Policy description. Length of the description is limited to 1024 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * Policy description. Length of the description is limited to 1024 characters.
   * @param description description or {@code null} for none
   */
  public OSPolicy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Required. The id of the OS policy with the following restrictions: * Must contain only
   * lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63
   * characters. * Must end with a number or a letter. * Must be unique within the assignment.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * Required. The id of the OS policy with the following restrictions: * Must contain only
   * lowercase letters, numbers, and hyphens. * Must start with a letter. * Must be between 1-63
   * characters. * Must end with a number or a letter. * Must be unique within the assignment.
   * @param id id or {@code null} for none
   */
  public OSPolicy setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * Required. Policy mode
   * @return value or {@code null} for none
   */
  public java.lang.String getMode() {
    return mode;
  }

  /**
   * Required. Policy mode
   * @param mode mode or {@code null} for none
   */
  public OSPolicy setMode(java.lang.String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * Required. List of resource groups for the policy. For a particular VM, resource groups are
   * evaluated in the order specified and the first resource group that is applicable is selected
   * and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is
   * considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag
   * `allow_no_resource_group_match`
   * @return value or {@code null} for none
   */
  public java.util.List<OSPolicyResourceGroup> getResourceGroups() {
    return resourceGroups;
  }

  /**
   * Required. List of resource groups for the policy. For a particular VM, resource groups are
   * evaluated in the order specified and the first resource group that is applicable is selected
   * and the rest are ignored. If none of the resource groups are applicable for a VM, the VM is
   * considered to be non-compliant w.r.t this policy. This behavior can be toggled by the flag
   * `allow_no_resource_group_match`
   * @param resourceGroups resourceGroups or {@code null} for none
   */
  public OSPolicy setResourceGroups(java.util.List<OSPolicyResourceGroup> resourceGroups) {
    this.resourceGroups = resourceGroups;
    return this;
  }

  @Override
  public OSPolicy set(String fieldName, Object value) {
    return (OSPolicy) super.set(fieldName, value);
  }

  @Override
  public OSPolicy clone() {
    return (OSPolicy) super.clone();
  }

}

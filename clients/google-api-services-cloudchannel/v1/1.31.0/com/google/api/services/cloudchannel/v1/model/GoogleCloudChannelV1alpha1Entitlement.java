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

package com.google.api.services.cloudchannel.v1.model;

/**
 * An entitlement is a representation of a customer's ability to use a service.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1alpha1Entitlement extends com.google.api.client.json.GenericJson {

  /**
   * The current number of users that are assigned a license for the product defined in
   * provisioned_service.skuId. Read-only. Deprecated: Use `parameters` instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer assignedUnits;

  /**
   * Association information to other entitlements.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1alpha1AssociationInfo associationInfo;

  /**
   * Cloud Identity ID of a channel partner who will be the direct reseller for the customer's
   * order. This field is generally used in 2-tier ordering, where the order is placed by a top-
   * level distributor on behalf of their channel partner or reseller. Required for distributors.
   * Deprecated: `channel_partner_id` has been moved to the Customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String channelPartnerId;

  /**
   * Commitment settings for a commitment-based Offer. Required for commitment based offers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1alpha1CommitmentSettings commitmentSettings;

  /**
   * Output only. The time at which the entitlement is created.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String createTime;

  /**
   * Maximum number of units for a non commitment-based Offer, such as Flexible, Trial or Free
   * entitlements. For commitment-based entitlements, this is a read-only field, which only the
   * internal support team can update. Deprecated: Use `parameters` instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer maxUnits;

  /**
   * Output only. Resource name of an entitlement in the form:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Number of units for a commitment-based Offer. For example, for seat-based Offers, this would be
   * the number of seats; for license-based Offers, this would be the number of licenses. Required
   * for creating commitment-based Offers. Deprecated: Use `parameters` instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer numUnits;

  /**
   * Required. The offer resource name for which the entitlement is to be created. Takes the form:
   * accounts/{account_id}/offers/{offer_id}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String offer;

  /**
   * Extended entitlement parameters. When creating an entitlement, valid parameter names and values
   * are defined in the Offer.parameter_definitions. The response may include the following output-
   * only Parameters: - assigned_units: The number of licenses assigned to a user. - max_units: The
   * maximum assignable units for a flexible offer. - num_units: The total commitment for
   * commitment-based offers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudChannelV1alpha1Parameter> parameters;

  /**
   * Output only. Service provisioning details for the entitlement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1alpha1ProvisionedService provisionedService;

  /**
   * Output only. Current provisioning state of the entitlement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String provisioningState;

  /**
   * Optional. This purchase order (PO) information is for resellers to use for their company
   * tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows
   * up in the invoice. The property accepts up to 80 plain text characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String purchaseOrderId;

  /**
   * Output only. Enumerable of all current suspension reasons for an entitlement.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> suspensionReasons;

  /**
   * Output only. Settings for trial offers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1alpha1TrialSettings trialSettings;

  /**
   * Output only. The time at which the entitlement is updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String updateTime;

  /**
   * The current number of users that are assigned a license for the product defined in
   * provisioned_service.skuId. Read-only. Deprecated: Use `parameters` instead.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAssignedUnits() {
    return assignedUnits;
  }

  /**
   * The current number of users that are assigned a license for the product defined in
   * provisioned_service.skuId. Read-only. Deprecated: Use `parameters` instead.
   * @param assignedUnits assignedUnits or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setAssignedUnits(java.lang.Integer assignedUnits) {
    this.assignedUnits = assignedUnits;
    return this;
  }

  /**
   * Association information to other entitlements.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1AssociationInfo getAssociationInfo() {
    return associationInfo;
  }

  /**
   * Association information to other entitlements.
   * @param associationInfo associationInfo or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setAssociationInfo(GoogleCloudChannelV1alpha1AssociationInfo associationInfo) {
    this.associationInfo = associationInfo;
    return this;
  }

  /**
   * Cloud Identity ID of a channel partner who will be the direct reseller for the customer's
   * order. This field is generally used in 2-tier ordering, where the order is placed by a top-
   * level distributor on behalf of their channel partner or reseller. Required for distributors.
   * Deprecated: `channel_partner_id` has been moved to the Customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getChannelPartnerId() {
    return channelPartnerId;
  }

  /**
   * Cloud Identity ID of a channel partner who will be the direct reseller for the customer's
   * order. This field is generally used in 2-tier ordering, where the order is placed by a top-
   * level distributor on behalf of their channel partner or reseller. Required for distributors.
   * Deprecated: `channel_partner_id` has been moved to the Customer.
   * @param channelPartnerId channelPartnerId or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setChannelPartnerId(java.lang.String channelPartnerId) {
    this.channelPartnerId = channelPartnerId;
    return this;
  }

  /**
   * Commitment settings for a commitment-based Offer. Required for commitment based offers.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1CommitmentSettings getCommitmentSettings() {
    return commitmentSettings;
  }

  /**
   * Commitment settings for a commitment-based Offer. Required for commitment based offers.
   * @param commitmentSettings commitmentSettings or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setCommitmentSettings(GoogleCloudChannelV1alpha1CommitmentSettings commitmentSettings) {
    this.commitmentSettings = commitmentSettings;
    return this;
  }

  /**
   * Output only. The time at which the entitlement is created.
   * @return value or {@code null} for none
   */
  public String getCreateTime() {
    return createTime;
  }

  /**
   * Output only. The time at which the entitlement is created.
   * @param createTime createTime or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setCreateTime(String createTime) {
    this.createTime = createTime;
    return this;
  }

  /**
   * Maximum number of units for a non commitment-based Offer, such as Flexible, Trial or Free
   * entitlements. For commitment-based entitlements, this is a read-only field, which only the
   * internal support team can update. Deprecated: Use `parameters` instead.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMaxUnits() {
    return maxUnits;
  }

  /**
   * Maximum number of units for a non commitment-based Offer, such as Flexible, Trial or Free
   * entitlements. For commitment-based entitlements, this is a read-only field, which only the
   * internal support team can update. Deprecated: Use `parameters` instead.
   * @param maxUnits maxUnits or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setMaxUnits(java.lang.Integer maxUnits) {
    this.maxUnits = maxUnits;
    return this;
  }

  /**
   * Output only. Resource name of an entitlement in the form:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. Resource name of an entitlement in the form:
   * accounts/{account_id}/customers/{customer_id}/entitlements/{entitlement_id}.
   * @param name name or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Number of units for a commitment-based Offer. For example, for seat-based Offers, this would be
   * the number of seats; for license-based Offers, this would be the number of licenses. Required
   * for creating commitment-based Offers. Deprecated: Use `parameters` instead.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNumUnits() {
    return numUnits;
  }

  /**
   * Number of units for a commitment-based Offer. For example, for seat-based Offers, this would be
   * the number of seats; for license-based Offers, this would be the number of licenses. Required
   * for creating commitment-based Offers. Deprecated: Use `parameters` instead.
   * @param numUnits numUnits or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setNumUnits(java.lang.Integer numUnits) {
    this.numUnits = numUnits;
    return this;
  }

  /**
   * Required. The offer resource name for which the entitlement is to be created. Takes the form:
   * accounts/{account_id}/offers/{offer_id}.
   * @return value or {@code null} for none
   */
  public java.lang.String getOffer() {
    return offer;
  }

  /**
   * Required. The offer resource name for which the entitlement is to be created. Takes the form:
   * accounts/{account_id}/offers/{offer_id}.
   * @param offer offer or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setOffer(java.lang.String offer) {
    this.offer = offer;
    return this;
  }

  /**
   * Extended entitlement parameters. When creating an entitlement, valid parameter names and values
   * are defined in the Offer.parameter_definitions. The response may include the following output-
   * only Parameters: - assigned_units: The number of licenses assigned to a user. - max_units: The
   * maximum assignable units for a flexible offer. - num_units: The total commitment for
   * commitment-based offers.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudChannelV1alpha1Parameter> getParameters() {
    return parameters;
  }

  /**
   * Extended entitlement parameters. When creating an entitlement, valid parameter names and values
   * are defined in the Offer.parameter_definitions. The response may include the following output-
   * only Parameters: - assigned_units: The number of licenses assigned to a user. - max_units: The
   * maximum assignable units for a flexible offer. - num_units: The total commitment for
   * commitment-based offers.
   * @param parameters parameters or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setParameters(java.util.List<GoogleCloudChannelV1alpha1Parameter> parameters) {
    this.parameters = parameters;
    return this;
  }

  /**
   * Output only. Service provisioning details for the entitlement.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1ProvisionedService getProvisionedService() {
    return provisionedService;
  }

  /**
   * Output only. Service provisioning details for the entitlement.
   * @param provisionedService provisionedService or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setProvisionedService(GoogleCloudChannelV1alpha1ProvisionedService provisionedService) {
    this.provisionedService = provisionedService;
    return this;
  }

  /**
   * Output only. Current provisioning state of the entitlement.
   * @return value or {@code null} for none
   */
  public java.lang.String getProvisioningState() {
    return provisioningState;
  }

  /**
   * Output only. Current provisioning state of the entitlement.
   * @param provisioningState provisioningState or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setProvisioningState(java.lang.String provisioningState) {
    this.provisioningState = provisioningState;
    return this;
  }

  /**
   * Optional. This purchase order (PO) information is for resellers to use for their company
   * tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows
   * up in the invoice. The property accepts up to 80 plain text characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getPurchaseOrderId() {
    return purchaseOrderId;
  }

  /**
   * Optional. This purchase order (PO) information is for resellers to use for their company
   * tracking usage. If a purchaseOrderId value is given, it appears in the API responses and shows
   * up in the invoice. The property accepts up to 80 plain text characters.
   * @param purchaseOrderId purchaseOrderId or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setPurchaseOrderId(java.lang.String purchaseOrderId) {
    this.purchaseOrderId = purchaseOrderId;
    return this;
  }

  /**
   * Output only. Enumerable of all current suspension reasons for an entitlement.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSuspensionReasons() {
    return suspensionReasons;
  }

  /**
   * Output only. Enumerable of all current suspension reasons for an entitlement.
   * @param suspensionReasons suspensionReasons or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setSuspensionReasons(java.util.List<java.lang.String> suspensionReasons) {
    this.suspensionReasons = suspensionReasons;
    return this;
  }

  /**
   * Output only. Settings for trial offers.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1TrialSettings getTrialSettings() {
    return trialSettings;
  }

  /**
   * Output only. Settings for trial offers.
   * @param trialSettings trialSettings or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setTrialSettings(GoogleCloudChannelV1alpha1TrialSettings trialSettings) {
    this.trialSettings = trialSettings;
    return this;
  }

  /**
   * Output only. The time at which the entitlement is updated.
   * @return value or {@code null} for none
   */
  public String getUpdateTime() {
    return updateTime;
  }

  /**
   * Output only. The time at which the entitlement is updated.
   * @param updateTime updateTime or {@code null} for none
   */
  public GoogleCloudChannelV1alpha1Entitlement setUpdateTime(String updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  @Override
  public GoogleCloudChannelV1alpha1Entitlement set(String fieldName, Object value) {
    return (GoogleCloudChannelV1alpha1Entitlement) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1alpha1Entitlement clone() {
    return (GoogleCloudChannelV1alpha1Entitlement) super.clone();
  }

}

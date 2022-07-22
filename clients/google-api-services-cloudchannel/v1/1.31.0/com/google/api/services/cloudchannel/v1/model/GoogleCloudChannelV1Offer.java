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
 * Represents an offer made to resellers for purchase. An offer is associated with a Sku, has a plan
 * for payment, a price, and defines the constraints for buying.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Channel API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudChannelV1Offer extends com.google.api.client.json.GenericJson {

  /**
   * Constraints on transacting the Offer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1Constraints constraints;

  /**
   * The deal code of the offer to get a special promotion or discount.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String dealCode;

  /**
   * Output only. End of the Offer validity time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String endTime;

  /**
   * Marketing information for the Offer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1MarketingInfo marketingInfo;

  /**
   * Resource Name of the Offer. Format: accounts/{account_id}/offers/{offer_id}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Parameters required to use current Offer to purchase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudChannelV1ParameterDefinition> parameterDefinitions;

  /**
   * Describes the payment plan for the Offer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1Plan plan;

  /**
   * Price for each monetizable resource type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudChannelV1PriceByResource> priceByResources;

  /**
   * SKU the offer is associated with.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudChannelV1Sku sku;

  /**
   * Start of the Offer validity time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Constraints on transacting the Offer.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1Constraints getConstraints() {
    return constraints;
  }

  /**
   * Constraints on transacting the Offer.
   * @param constraints constraints or {@code null} for none
   */
  public GoogleCloudChannelV1Offer setConstraints(GoogleCloudChannelV1Constraints constraints) {
    this.constraints = constraints;
    return this;
  }

  /**
   * The deal code of the offer to get a special promotion or discount.
   * @return value or {@code null} for none
   */
  public java.lang.String getDealCode() {
    return dealCode;
  }

  /**
   * The deal code of the offer to get a special promotion or discount.
   * @param dealCode dealCode or {@code null} for none
   */
  public GoogleCloudChannelV1Offer setDealCode(java.lang.String dealCode) {
    this.dealCode = dealCode;
    return this;
  }

  /**
   * Output only. End of the Offer validity time.
   * @return value or {@code null} for none
   */
  public String getEndTime() {
    return endTime;
  }

  /**
   * Output only. End of the Offer validity time.
   * @param endTime endTime or {@code null} for none
   */
  public GoogleCloudChannelV1Offer setEndTime(String endTime) {
    this.endTime = endTime;
    return this;
  }

  /**
   * Marketing information for the Offer.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1MarketingInfo getMarketingInfo() {
    return marketingInfo;
  }

  /**
   * Marketing information for the Offer.
   * @param marketingInfo marketingInfo or {@code null} for none
   */
  public GoogleCloudChannelV1Offer setMarketingInfo(GoogleCloudChannelV1MarketingInfo marketingInfo) {
    this.marketingInfo = marketingInfo;
    return this;
  }

  /**
   * Resource Name of the Offer. Format: accounts/{account_id}/offers/{offer_id}
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Resource Name of the Offer. Format: accounts/{account_id}/offers/{offer_id}
   * @param name name or {@code null} for none
   */
  public GoogleCloudChannelV1Offer setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Parameters required to use current Offer to purchase.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudChannelV1ParameterDefinition> getParameterDefinitions() {
    return parameterDefinitions;
  }

  /**
   * Parameters required to use current Offer to purchase.
   * @param parameterDefinitions parameterDefinitions or {@code null} for none
   */
  public GoogleCloudChannelV1Offer setParameterDefinitions(java.util.List<GoogleCloudChannelV1ParameterDefinition> parameterDefinitions) {
    this.parameterDefinitions = parameterDefinitions;
    return this;
  }

  /**
   * Describes the payment plan for the Offer.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1Plan getPlan() {
    return plan;
  }

  /**
   * Describes the payment plan for the Offer.
   * @param plan plan or {@code null} for none
   */
  public GoogleCloudChannelV1Offer setPlan(GoogleCloudChannelV1Plan plan) {
    this.plan = plan;
    return this;
  }

  /**
   * Price for each monetizable resource type.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudChannelV1PriceByResource> getPriceByResources() {
    return priceByResources;
  }

  /**
   * Price for each monetizable resource type.
   * @param priceByResources priceByResources or {@code null} for none
   */
  public GoogleCloudChannelV1Offer setPriceByResources(java.util.List<GoogleCloudChannelV1PriceByResource> priceByResources) {
    this.priceByResources = priceByResources;
    return this;
  }

  /**
   * SKU the offer is associated with.
   * @return value or {@code null} for none
   */
  public GoogleCloudChannelV1Sku getSku() {
    return sku;
  }

  /**
   * SKU the offer is associated with.
   * @param sku sku or {@code null} for none
   */
  public GoogleCloudChannelV1Offer setSku(GoogleCloudChannelV1Sku sku) {
    this.sku = sku;
    return this;
  }

  /**
   * Start of the Offer validity time.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Start of the Offer validity time.
   * @param startTime startTime or {@code null} for none
   */
  public GoogleCloudChannelV1Offer setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  @Override
  public GoogleCloudChannelV1Offer set(String fieldName, Object value) {
    return (GoogleCloudChannelV1Offer) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudChannelV1Offer clone() {
    return (GoogleCloudChannelV1Offer) super.clone();
  }

}

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
 * Model definition for BillingRate.
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
public final class BillingRate extends com.google.api.client.json.GenericJson {

  /**
   * Billing currency code in ISO 4217 format.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String currencyCode;

  /**
   * End date of this billing rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endDate;

  /**
   * ID of this billing rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long id;

  /**
   * Name of this billing rate. This must be less than 256 characters long.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Flat rate in micros of this billing rate. This cannot co-exist with tiered rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long rateInMicros;

  /**
   * Start date of this billing rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String startDate;

  /**
   * Tiered rate of this billing rate. This cannot co-exist with flat rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<BillingRateTieredRate> tieredRates;

  /**
   * Type of this billing rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * Unit of measure for this billing rate.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unitOfMeasure;

  /**
   * Billing currency code in ISO 4217 format.
   * @return value or {@code null} for none
   */
  public java.lang.String getCurrencyCode() {
    return currencyCode;
  }

  /**
   * Billing currency code in ISO 4217 format.
   * @param currencyCode currencyCode or {@code null} for none
   */
  public BillingRate setCurrencyCode(java.lang.String currencyCode) {
    this.currencyCode = currencyCode;
    return this;
  }

  /**
   * End date of this billing rate.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndDate() {
    return endDate;
  }

  /**
   * End date of this billing rate.
   * @param endDate endDate or {@code null} for none
   */
  public BillingRate setEndDate(java.lang.String endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * ID of this billing rate.
   * @return value or {@code null} for none
   */
  public java.lang.Long getId() {
    return id;
  }

  /**
   * ID of this billing rate.
   * @param id id or {@code null} for none
   */
  public BillingRate setId(java.lang.Long id) {
    this.id = id;
    return this;
  }

  /**
   * Name of this billing rate. This must be less than 256 characters long.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of this billing rate. This must be less than 256 characters long.
   * @param name name or {@code null} for none
   */
  public BillingRate setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Flat rate in micros of this billing rate. This cannot co-exist with tiered rate.
   * @return value or {@code null} for none
   */
  public java.lang.Long getRateInMicros() {
    return rateInMicros;
  }

  /**
   * Flat rate in micros of this billing rate. This cannot co-exist with tiered rate.
   * @param rateInMicros rateInMicros or {@code null} for none
   */
  public BillingRate setRateInMicros(java.lang.Long rateInMicros) {
    this.rateInMicros = rateInMicros;
    return this;
  }

  /**
   * Start date of this billing rate.
   * @return value or {@code null} for none
   */
  public java.lang.String getStartDate() {
    return startDate;
  }

  /**
   * Start date of this billing rate.
   * @param startDate startDate or {@code null} for none
   */
  public BillingRate setStartDate(java.lang.String startDate) {
    this.startDate = startDate;
    return this;
  }

  /**
   * Tiered rate of this billing rate. This cannot co-exist with flat rate.
   * @return value or {@code null} for none
   */
  public java.util.List<BillingRateTieredRate> getTieredRates() {
    return tieredRates;
  }

  /**
   * Tiered rate of this billing rate. This cannot co-exist with flat rate.
   * @param tieredRates tieredRates or {@code null} for none
   */
  public BillingRate setTieredRates(java.util.List<BillingRateTieredRate> tieredRates) {
    this.tieredRates = tieredRates;
    return this;
  }

  /**
   * Type of this billing rate.
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * Type of this billing rate.
   * @param type type or {@code null} for none
   */
  public BillingRate setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * Unit of measure for this billing rate.
   * @return value or {@code null} for none
   */
  public java.lang.String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  /**
   * Unit of measure for this billing rate.
   * @param unitOfMeasure unitOfMeasure or {@code null} for none
   */
  public BillingRate setUnitOfMeasure(java.lang.String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

  @Override
  public BillingRate set(String fieldName, Object value) {
    return (BillingRate) super.set(fieldName, value);
  }

  @Override
  public BillingRate clone() {
    return (BillingRate) super.clone();
  }

}

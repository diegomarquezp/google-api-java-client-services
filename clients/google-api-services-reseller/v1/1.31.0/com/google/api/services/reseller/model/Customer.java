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

package com.google.api.services.reseller.model;

/**
 * When a Google customer's account is registered with a reseller, the customer's subscriptions for
 * Google services are managed by this reseller. A customer is described by a primary domain name
 * and a physical address.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Workspace Reseller API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Customer extends com.google.api.client.json.GenericJson {

  /**
   * Like the "Customer email" in the reseller tools, this email is the secondary contact used if
   * something happens to the customer's service such as service outage or a security issue. This
   * property is required when creating a new customer and should not use the same domain as
   * `customerDomain`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String alternateEmail;

  /**
   * The customer's primary domain name string. `customerDomain` is required when creating a new
   * customer. Do not include the `www` prefix in the domain when adding a customer.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerDomain;

  /**
   * Whether the customer's primary domain has been verified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean customerDomainVerified;

  /**
   * This property will always be returned in a response as the unique identifier generated by
   * Google. In a request, this property can be either the primary domain or the unique identifier
   * generated by Google.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String customerId;

  /**
   * Identifies the resource as a customer. Value: `reseller#customer`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Customer contact phone number. Must start with "+" followed by the country code. The rest of
   * the number can be contiguous numbers or respect the phone local format conventions, but it must
   * be a real phone number and not, for example, "123". This field is silently ignored if invalid.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String phoneNumber;

  /**
   * A customer's address information. Each field has a limit of 255 charcters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Address postalAddress;

  /**
   * URL to customer's Admin console dashboard. The read-only URL is generated by the API service.
   * This is used if your client application requires the customer to complete a task in the Admin
   * console.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceUiUrl;

  /**
   * Like the "Customer email" in the reseller tools, this email is the secondary contact used if
   * something happens to the customer's service such as service outage or a security issue. This
   * property is required when creating a new customer and should not use the same domain as
   * `customerDomain`.
   * @return value or {@code null} for none
   */
  public java.lang.String getAlternateEmail() {
    return alternateEmail;
  }

  /**
   * Like the "Customer email" in the reseller tools, this email is the secondary contact used if
   * something happens to the customer's service such as service outage or a security issue. This
   * property is required when creating a new customer and should not use the same domain as
   * `customerDomain`.
   * @param alternateEmail alternateEmail or {@code null} for none
   */
  public Customer setAlternateEmail(java.lang.String alternateEmail) {
    this.alternateEmail = alternateEmail;
    return this;
  }

  /**
   * The customer's primary domain name string. `customerDomain` is required when creating a new
   * customer. Do not include the `www` prefix in the domain when adding a customer.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerDomain() {
    return customerDomain;
  }

  /**
   * The customer's primary domain name string. `customerDomain` is required when creating a new
   * customer. Do not include the `www` prefix in the domain when adding a customer.
   * @param customerDomain customerDomain or {@code null} for none
   */
  public Customer setCustomerDomain(java.lang.String customerDomain) {
    this.customerDomain = customerDomain;
    return this;
  }

  /**
   * Whether the customer's primary domain has been verified.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCustomerDomainVerified() {
    return customerDomainVerified;
  }

  /**
   * Whether the customer's primary domain has been verified.
   * @param customerDomainVerified customerDomainVerified or {@code null} for none
   */
  public Customer setCustomerDomainVerified(java.lang.Boolean customerDomainVerified) {
    this.customerDomainVerified = customerDomainVerified;
    return this;
  }

  /**
   * This property will always be returned in a response as the unique identifier generated by
   * Google. In a request, this property can be either the primary domain or the unique identifier
   * generated by Google.
   * @return value or {@code null} for none
   */
  public java.lang.String getCustomerId() {
    return customerId;
  }

  /**
   * This property will always be returned in a response as the unique identifier generated by
   * Google. In a request, this property can be either the primary domain or the unique identifier
   * generated by Google.
   * @param customerId customerId or {@code null} for none
   */
  public Customer setCustomerId(java.lang.String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Identifies the resource as a customer. Value: `reseller#customer`
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies the resource as a customer. Value: `reseller#customer`
   * @param kind kind or {@code null} for none
   */
  public Customer setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Customer contact phone number. Must start with "+" followed by the country code. The rest of
   * the number can be contiguous numbers or respect the phone local format conventions, but it must
   * be a real phone number and not, for example, "123". This field is silently ignored if invalid.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhoneNumber() {
    return phoneNumber;
  }

  /**
   * Customer contact phone number. Must start with "+" followed by the country code. The rest of
   * the number can be contiguous numbers or respect the phone local format conventions, but it must
   * be a real phone number and not, for example, "123". This field is silently ignored if invalid.
   * @param phoneNumber phoneNumber or {@code null} for none
   */
  public Customer setPhoneNumber(java.lang.String phoneNumber) {
    this.phoneNumber = phoneNumber;
    return this;
  }

  /**
   * A customer's address information. Each field has a limit of 255 charcters.
   * @return value or {@code null} for none
   */
  public Address getPostalAddress() {
    return postalAddress;
  }

  /**
   * A customer's address information. Each field has a limit of 255 charcters.
   * @param postalAddress postalAddress or {@code null} for none
   */
  public Customer setPostalAddress(Address postalAddress) {
    this.postalAddress = postalAddress;
    return this;
  }

  /**
   * URL to customer's Admin console dashboard. The read-only URL is generated by the API service.
   * This is used if your client application requires the customer to complete a task in the Admin
   * console.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceUiUrl() {
    return resourceUiUrl;
  }

  /**
   * URL to customer's Admin console dashboard. The read-only URL is generated by the API service.
   * This is used if your client application requires the customer to complete a task in the Admin
   * console.
   * @param resourceUiUrl resourceUiUrl or {@code null} for none
   */
  public Customer setResourceUiUrl(java.lang.String resourceUiUrl) {
    this.resourceUiUrl = resourceUiUrl;
    return this;
  }

  @Override
  public Customer set(String fieldName, Object value) {
    return (Customer) super.set(fieldName, value);
  }

  @Override
  public Customer clone() {
    return (Customer) super.clone();
  }

}

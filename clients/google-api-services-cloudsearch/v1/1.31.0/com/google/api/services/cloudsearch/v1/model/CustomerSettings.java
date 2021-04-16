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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Represents settings at a customer level.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CustomerSettings extends com.google.api.client.json.GenericJson {

  /**
   * Audit Logging settings for the customer. If update_mask is empty then this field will be
   * updated based on UpdateCustomerSettings request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AuditLoggingSettings auditLoggingSettings;

  /**
   * VPC SC settings for the customer. If update_mask is empty then this field will be updated based
   * on UpdateCustomerSettings request.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VPCSettings vpcSettings;

  /**
   * Audit Logging settings for the customer. If update_mask is empty then this field will be
   * updated based on UpdateCustomerSettings request.
   * @return value or {@code null} for none
   */
  public AuditLoggingSettings getAuditLoggingSettings() {
    return auditLoggingSettings;
  }

  /**
   * Audit Logging settings for the customer. If update_mask is empty then this field will be
   * updated based on UpdateCustomerSettings request.
   * @param auditLoggingSettings auditLoggingSettings or {@code null} for none
   */
  public CustomerSettings setAuditLoggingSettings(AuditLoggingSettings auditLoggingSettings) {
    this.auditLoggingSettings = auditLoggingSettings;
    return this;
  }

  /**
   * VPC SC settings for the customer. If update_mask is empty then this field will be updated based
   * on UpdateCustomerSettings request.
   * @return value or {@code null} for none
   */
  public VPCSettings getVpcSettings() {
    return vpcSettings;
  }

  /**
   * VPC SC settings for the customer. If update_mask is empty then this field will be updated based
   * on UpdateCustomerSettings request.
   * @param vpcSettings vpcSettings or {@code null} for none
   */
  public CustomerSettings setVpcSettings(VPCSettings vpcSettings) {
    this.vpcSettings = vpcSettings;
    return this;
  }

  @Override
  public CustomerSettings set(String fieldName, Object value) {
    return (CustomerSettings) super.set(fieldName, value);
  }

  @Override
  public CustomerSettings clone() {
    return (CustomerSettings) super.clone();
  }

}

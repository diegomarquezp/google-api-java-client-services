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

package com.google.api.services.androidpublisher.model;

/**
 * Defines the scope of subscriptions which a targeting rule can match to target offers to users
 * based on past or current entitlement.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Android Developer API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetingRuleScope extends com.google.api.client.json.GenericJson {

  /**
   * The scope of the current targeting rule is any subscription in the parent app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetingRuleScopeAnySubscriptionInApp anySubscriptionInApp;

  /**
   * The scope of the current targeting rule is the subscription with the specified subscription ID.
   * Must be a subscription within the same parent app.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String specificSubscriptionInApp;

  /**
   * The scope of the current targeting rule is the subscription in which this offer is defined.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetingRuleScopeThisSubscription thisSubscription;

  /**
   * The scope of the current targeting rule is any subscription in the parent app.
   * @return value or {@code null} for none
   */
  public TargetingRuleScopeAnySubscriptionInApp getAnySubscriptionInApp() {
    return anySubscriptionInApp;
  }

  /**
   * The scope of the current targeting rule is any subscription in the parent app.
   * @param anySubscriptionInApp anySubscriptionInApp or {@code null} for none
   */
  public TargetingRuleScope setAnySubscriptionInApp(TargetingRuleScopeAnySubscriptionInApp anySubscriptionInApp) {
    this.anySubscriptionInApp = anySubscriptionInApp;
    return this;
  }

  /**
   * The scope of the current targeting rule is the subscription with the specified subscription ID.
   * Must be a subscription within the same parent app.
   * @return value or {@code null} for none
   */
  public java.lang.String getSpecificSubscriptionInApp() {
    return specificSubscriptionInApp;
  }

  /**
   * The scope of the current targeting rule is the subscription with the specified subscription ID.
   * Must be a subscription within the same parent app.
   * @param specificSubscriptionInApp specificSubscriptionInApp or {@code null} for none
   */
  public TargetingRuleScope setSpecificSubscriptionInApp(java.lang.String specificSubscriptionInApp) {
    this.specificSubscriptionInApp = specificSubscriptionInApp;
    return this;
  }

  /**
   * The scope of the current targeting rule is the subscription in which this offer is defined.
   * @return value or {@code null} for none
   */
  public TargetingRuleScopeThisSubscription getThisSubscription() {
    return thisSubscription;
  }

  /**
   * The scope of the current targeting rule is the subscription in which this offer is defined.
   * @param thisSubscription thisSubscription or {@code null} for none
   */
  public TargetingRuleScope setThisSubscription(TargetingRuleScopeThisSubscription thisSubscription) {
    this.thisSubscription = thisSubscription;
    return this;
  }

  @Override
  public TargetingRuleScope set(String fieldName, Object value) {
    return (TargetingRuleScope) super.set(fieldName, value);
  }

  @Override
  public TargetingRuleScope clone() {
    return (TargetingRuleScope) super.clone();
  }

}

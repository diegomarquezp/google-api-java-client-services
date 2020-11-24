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

package com.google.api.services.adexchangebuyer2.v2beta1.model;

/**
 * A polymorphic targeting value used as part of Shared Targeting.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Ad Exchange Buyer API II. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TargetingValue extends com.google.api.client.json.GenericJson {

  /**
   * The creative size value to include/exclude. Filled in when key = GOOG_CREATIVE_SIZE
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CreativeSize creativeSizeValue;

  /**
   * The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING.
   * The definition of this targeting is derived from the structure used by Ad Manager.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DayPartTargeting dayPartTargetingValue;

  /**
   * The long value to include/exclude.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long longValue;

  /**
   * The string value to include/exclude.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringValue;

  /**
   * The creative size value to include/exclude. Filled in when key = GOOG_CREATIVE_SIZE
   * @return value or {@code null} for none
   */
  public CreativeSize getCreativeSizeValue() {
    return creativeSizeValue;
  }

  /**
   * The creative size value to include/exclude. Filled in when key = GOOG_CREATIVE_SIZE
   * @param creativeSizeValue creativeSizeValue or {@code null} for none
   */
  public TargetingValue setCreativeSizeValue(CreativeSize creativeSizeValue) {
    this.creativeSizeValue = creativeSizeValue;
    return this;
  }

  /**
   * The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING.
   * The definition of this targeting is derived from the structure used by Ad Manager.
   * @return value or {@code null} for none
   */
  public DayPartTargeting getDayPartTargetingValue() {
    return dayPartTargetingValue;
  }

  /**
   * The daypart targeting to include / exclude. Filled in when the key is GOOG_DAYPART_TARGETING.
   * The definition of this targeting is derived from the structure used by Ad Manager.
   * @param dayPartTargetingValue dayPartTargetingValue or {@code null} for none
   */
  public TargetingValue setDayPartTargetingValue(DayPartTargeting dayPartTargetingValue) {
    this.dayPartTargetingValue = dayPartTargetingValue;
    return this;
  }

  /**
   * The long value to include/exclude.
   * @return value or {@code null} for none
   */
  public java.lang.Long getLongValue() {
    return longValue;
  }

  /**
   * The long value to include/exclude.
   * @param longValue longValue or {@code null} for none
   */
  public TargetingValue setLongValue(java.lang.Long longValue) {
    this.longValue = longValue;
    return this;
  }

  /**
   * The string value to include/exclude.
   * @return value or {@code null} for none
   */
  public java.lang.String getStringValue() {
    return stringValue;
  }

  /**
   * The string value to include/exclude.
   * @param stringValue stringValue or {@code null} for none
   */
  public TargetingValue setStringValue(java.lang.String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  @Override
  public TargetingValue set(String fieldName, Object value) {
    return (TargetingValue) super.set(fieldName, value);
  }

  @Override
  public TargetingValue clone() {
    return (TargetingValue) super.clone();
  }

}

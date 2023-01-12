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

package com.google.api.services.integrations.v1.model;

/**
 * Rule used to validate strings.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Application Integration API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class EnterpriseCrmEventbusProtoParamSpecEntryValidationRuleStringRegex extends com.google.api.client.json.GenericJson {

  /**
   * Whether the regex matcher is applied exclusively (if true, matching values will be rejected).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean exclusive;

  /**
   * The regex applied to the input value(s).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String regex;

  /**
   * Whether the regex matcher is applied exclusively (if true, matching values will be rejected).
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getExclusive() {
    return exclusive;
  }

  /**
   * Whether the regex matcher is applied exclusively (if true, matching values will be rejected).
   * @param exclusive exclusive or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoParamSpecEntryValidationRuleStringRegex setExclusive(java.lang.Boolean exclusive) {
    this.exclusive = exclusive;
    return this;
  }

  /**
   * The regex applied to the input value(s).
   * @return value or {@code null} for none
   */
  public java.lang.String getRegex() {
    return regex;
  }

  /**
   * The regex applied to the input value(s).
   * @param regex regex or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoParamSpecEntryValidationRuleStringRegex setRegex(java.lang.String regex) {
    this.regex = regex;
    return this;
  }

  @Override
  public EnterpriseCrmEventbusProtoParamSpecEntryValidationRuleStringRegex set(String fieldName, Object value) {
    return (EnterpriseCrmEventbusProtoParamSpecEntryValidationRuleStringRegex) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmEventbusProtoParamSpecEntryValidationRuleStringRegex clone() {
    return (EnterpriseCrmEventbusProtoParamSpecEntryValidationRuleStringRegex) super.clone();
  }

}
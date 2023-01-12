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
 * The LogSettings define the logging attributes for an event property. These attributes are used to
 * map the property to the parameter in the log proto. Also used to define scrubbing/truncation
 * behavior and PII information. See go/integration-platform/analytics/logging_task.md for details.
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
public final class EnterpriseCrmEventbusProtoLogSettings extends com.google.api.client.json.GenericJson {

  /**
   * The name of corresponding logging field of the event property. If omitted, assumes the same
   * name as the event property key.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String logFieldName;

  /**
   * Contains the scrubbing options, such as whether to scrub, obfuscate, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmLoggingGwsSanitizeOptions sanitizeOptions;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String seedPeriod;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String seedScope;

  /**
   * Contains the field limits for shortening, such as max string length and max array length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EnterpriseCrmLoggingGwsFieldLimits shorteningLimits;

  /**
   * The name of corresponding logging field of the event property. If omitted, assumes the same
   * name as the event property key.
   * @return value or {@code null} for none
   */
  public java.lang.String getLogFieldName() {
    return logFieldName;
  }

  /**
   * The name of corresponding logging field of the event property. If omitted, assumes the same
   * name as the event property key.
   * @param logFieldName logFieldName or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoLogSettings setLogFieldName(java.lang.String logFieldName) {
    this.logFieldName = logFieldName;
    return this;
  }

  /**
   * Contains the scrubbing options, such as whether to scrub, obfuscate, etc.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmLoggingGwsSanitizeOptions getSanitizeOptions() {
    return sanitizeOptions;
  }

  /**
   * Contains the scrubbing options, such as whether to scrub, obfuscate, etc.
   * @param sanitizeOptions sanitizeOptions or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoLogSettings setSanitizeOptions(EnterpriseCrmLoggingGwsSanitizeOptions sanitizeOptions) {
    this.sanitizeOptions = sanitizeOptions;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSeedPeriod() {
    return seedPeriod;
  }

  /**
   * @param seedPeriod seedPeriod or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoLogSettings setSeedPeriod(java.lang.String seedPeriod) {
    this.seedPeriod = seedPeriod;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getSeedScope() {
    return seedScope;
  }

  /**
   * @param seedScope seedScope or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoLogSettings setSeedScope(java.lang.String seedScope) {
    this.seedScope = seedScope;
    return this;
  }

  /**
   * Contains the field limits for shortening, such as max string length and max array length.
   * @return value or {@code null} for none
   */
  public EnterpriseCrmLoggingGwsFieldLimits getShorteningLimits() {
    return shorteningLimits;
  }

  /**
   * Contains the field limits for shortening, such as max string length and max array length.
   * @param shorteningLimits shorteningLimits or {@code null} for none
   */
  public EnterpriseCrmEventbusProtoLogSettings setShorteningLimits(EnterpriseCrmLoggingGwsFieldLimits shorteningLimits) {
    this.shorteningLimits = shorteningLimits;
    return this;
  }

  @Override
  public EnterpriseCrmEventbusProtoLogSettings set(String fieldName, Object value) {
    return (EnterpriseCrmEventbusProtoLogSettings) super.set(fieldName, value);
  }

  @Override
  public EnterpriseCrmEventbusProtoLogSettings clone() {
    return (EnterpriseCrmEventbusProtoLogSettings) super.clone();
  }

}
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
 * Represents a date range.
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
public final class DateRange extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime endDate;

  /**
   * The kind of resource this is, in this case dfareporting#dateRange.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The date range relative to the date of when the report is run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String relativeDateRange;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime startDate;

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getEndDate() {
    return endDate;
  }

  /**
   * @param endDate endDate or {@code null} for none
   */
  public DateRange setEndDate(com.google.api.client.util.DateTime endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * The kind of resource this is, in this case dfareporting#dateRange.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The kind of resource this is, in this case dfareporting#dateRange.
   * @param kind kind or {@code null} for none
   */
  public DateRange setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The date range relative to the date of when the report is run.
   * @return value or {@code null} for none
   */
  public java.lang.String getRelativeDateRange() {
    return relativeDateRange;
  }

  /**
   * The date range relative to the date of when the report is run.
   * @param relativeDateRange relativeDateRange or {@code null} for none
   */
  public DateRange setRelativeDateRange(java.lang.String relativeDateRange) {
    this.relativeDateRange = relativeDateRange;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getStartDate() {
    return startDate;
  }

  /**
   * @param startDate startDate or {@code null} for none
   */
  public DateRange setStartDate(com.google.api.client.util.DateTime startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public DateRange set(String fieldName, Object value) {
    return (DateRange) super.set(fieldName, value);
  }

  @Override
  public DateRange clone() {
    return (DateRange) super.clone();
  }

}

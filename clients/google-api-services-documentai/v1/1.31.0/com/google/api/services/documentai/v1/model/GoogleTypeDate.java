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

package com.google.api.services.documentai.v1.model;

/**
 * Represents a whole or partial calendar date, such as a birthday. The time of day and time zone
 * are either specified elsewhere or are insignificant. The date is relative to the Gregorian
 * Calendar. This can represent one of the following: * A full date, with non-zero year, month, and
 * day values * A month and day value, with a zero year, such as an anniversary * A year on its own,
 * with zero month and day values * A year and month value, with a zero day, such as a credit card
 * expiration date Related types are google.type.TimeOfDay and `google.protobuf.Timestamp`.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Document AI API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleTypeDate extends com.google.api.client.json.GenericJson {

  /**
   * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year
   * by itself or a year and month where the day isn't significant.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer day;

  /**
   * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer month;

  /**
   * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer year;

  /**
   * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year
   * by itself or a year and month where the day isn't significant.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDay() {
    return day;
  }

  /**
   * Day of a month. Must be from 1 to 31 and valid for the year and month, or 0 to specify a year
   * by itself or a year and month where the day isn't significant.
   * @param day day or {@code null} for none
   */
  public GoogleTypeDate setDay(java.lang.Integer day) {
    this.day = day;
    return this;
  }

  /**
   * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMonth() {
    return month;
  }

  /**
   * Month of a year. Must be from 1 to 12, or 0 to specify a year without a month and day.
   * @param month month or {@code null} for none
   */
  public GoogleTypeDate setMonth(java.lang.Integer month) {
    this.month = month;
    return this;
  }

  /**
   * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getYear() {
    return year;
  }

  /**
   * Year of the date. Must be from 1 to 9999, or 0 to specify a date without a year.
   * @param year year or {@code null} for none
   */
  public GoogleTypeDate setYear(java.lang.Integer year) {
    this.year = year;
    return this;
  }

  @Override
  public GoogleTypeDate set(String fieldName, Object value) {
    return (GoogleTypeDate) super.set(fieldName, value);
  }

  @Override
  public GoogleTypeDate clone() {
    return (GoogleTypeDate) super.clone();
  }

}

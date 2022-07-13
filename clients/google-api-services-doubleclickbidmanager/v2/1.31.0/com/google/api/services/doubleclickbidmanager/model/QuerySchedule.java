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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * Information on when and how frequently to run a query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class QuerySchedule extends com.google.api.client.json.GenericJson {

  /**
   * Date to periodically run the query until. Not applicable to `ONE_TIME` frequency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date endDate;

  /**
   * How often the query is run.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String frequency;

  /**
   * Canonical timezone code for report generation time. Defaults to `America/New_York`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextRunTimezoneCode;

  /**
   * When to start running the query. Not applicable to `ONE_TIME` frequency.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date startDate;

  /**
   * Date to periodically run the query until. Not applicable to `ONE_TIME` frequency.
   * @return value or {@code null} for none
   */
  public Date getEndDate() {
    return endDate;
  }

  /**
   * Date to periodically run the query until. Not applicable to `ONE_TIME` frequency.
   * @param endDate endDate or {@code null} for none
   */
  public QuerySchedule setEndDate(Date endDate) {
    this.endDate = endDate;
    return this;
  }

  /**
   * How often the query is run.
   * @return value or {@code null} for none
   */
  public java.lang.String getFrequency() {
    return frequency;
  }

  /**
   * How often the query is run.
   * @param frequency frequency or {@code null} for none
   */
  public QuerySchedule setFrequency(java.lang.String frequency) {
    this.frequency = frequency;
    return this;
  }

  /**
   * Canonical timezone code for report generation time. Defaults to `America/New_York`.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextRunTimezoneCode() {
    return nextRunTimezoneCode;
  }

  /**
   * Canonical timezone code for report generation time. Defaults to `America/New_York`.
   * @param nextRunTimezoneCode nextRunTimezoneCode or {@code null} for none
   */
  public QuerySchedule setNextRunTimezoneCode(java.lang.String nextRunTimezoneCode) {
    this.nextRunTimezoneCode = nextRunTimezoneCode;
    return this;
  }

  /**
   * When to start running the query. Not applicable to `ONE_TIME` frequency.
   * @return value or {@code null} for none
   */
  public Date getStartDate() {
    return startDate;
  }

  /**
   * When to start running the query. Not applicable to `ONE_TIME` frequency.
   * @param startDate startDate or {@code null} for none
   */
  public QuerySchedule setStartDate(Date startDate) {
    this.startDate = startDate;
    return this;
  }

  @Override
  public QuerySchedule set(String fieldName, Object value) {
    return (QuerySchedule) super.set(fieldName, value);
  }

  @Override
  public QuerySchedule clone() {
    return (QuerySchedule) super.clone();
  }

}

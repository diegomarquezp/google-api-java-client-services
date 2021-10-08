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

package com.google.api.services.apigee.v1.model;

/**
 * Quota contains the essential parameters needed that can be applied on the resources, methods, API
 * source combination associated with this API product. While Quota is optional, setting it prevents
 * requests from exceeding the provisioned parameters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1Quota extends com.google.api.client.json.GenericJson {

  /**
   * Required. Time interval over which the number of request messages is calculated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String interval;

  /**
   * Required. Upper limit allowed for the time interval and time unit specified. Requests exceeding
   * this limit will be rejected.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String limit;

  /**
   * Time unit defined for the `interval`. Valid values include `minute`, `hour`, `day`, or `month`.
   * If `limit` and `interval` are valid, the default value is `hour`; otherwise, the default is
   * null.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String timeUnit;

  /**
   * Required. Time interval over which the number of request messages is calculated.
   * @return value or {@code null} for none
   */
  public java.lang.String getInterval() {
    return interval;
  }

  /**
   * Required. Time interval over which the number of request messages is calculated.
   * @param interval interval or {@code null} for none
   */
  public GoogleCloudApigeeV1Quota setInterval(java.lang.String interval) {
    this.interval = interval;
    return this;
  }

  /**
   * Required. Upper limit allowed for the time interval and time unit specified. Requests exceeding
   * this limit will be rejected.
   * @return value or {@code null} for none
   */
  public java.lang.String getLimit() {
    return limit;
  }

  /**
   * Required. Upper limit allowed for the time interval and time unit specified. Requests exceeding
   * this limit will be rejected.
   * @param limit limit or {@code null} for none
   */
  public GoogleCloudApigeeV1Quota setLimit(java.lang.String limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Time unit defined for the `interval`. Valid values include `minute`, `hour`, `day`, or `month`.
   * If `limit` and `interval` are valid, the default value is `hour`; otherwise, the default is
   * null.
   * @return value or {@code null} for none
   */
  public java.lang.String getTimeUnit() {
    return timeUnit;
  }

  /**
   * Time unit defined for the `interval`. Valid values include `minute`, `hour`, `day`, or `month`.
   * If `limit` and `interval` are valid, the default value is `hour`; otherwise, the default is
   * null.
   * @param timeUnit timeUnit or {@code null} for none
   */
  public GoogleCloudApigeeV1Quota setTimeUnit(java.lang.String timeUnit) {
    this.timeUnit = timeUnit;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1Quota set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1Quota) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1Quota clone() {
    return (GoogleCloudApigeeV1Quota) super.clone();
  }

}

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

package com.google.api.services.jobs.v3p1beta1.model;

/**
 * Output only. Histogram result that matches HistogramSpec specified in searches.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Talent Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HistogramQueryResult extends com.google.api.client.json.GenericJson {

  /**
   * A map from the values of the facet associated with distinct values to the number of matching
   * entries with corresponding value. The key format is: * (for string histogram) string values
   * stored in the field. * (for named numeric bucket) name specified in `bucket()` function, like
   * for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`. * (for anonymous numeric
   * bucket) range formatted as `-`, for example, `0-1000`, `MIN-0`, and `0-MAX`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.Map<String, java.lang.Long> histogram;

  /**
   * Requested histogram expression.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String histogramQuery;

  /**
   * A map from the values of the facet associated with distinct values to the number of matching
   * entries with corresponding value. The key format is: * (for string histogram) string values
   * stored in the field. * (for named numeric bucket) name specified in `bucket()` function, like
   * for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`. * (for anonymous numeric
   * bucket) range formatted as `-`, for example, `0-1000`, `MIN-0`, and `0-MAX`.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Long> getHistogram() {
    return histogram;
  }

  /**
   * A map from the values of the facet associated with distinct values to the number of matching
   * entries with corresponding value. The key format is: * (for string histogram) string values
   * stored in the field. * (for named numeric bucket) name specified in `bucket()` function, like
   * for `bucket(0, MAX, "non-negative")`, the key will be `non-negative`. * (for anonymous numeric
   * bucket) range formatted as `-`, for example, `0-1000`, `MIN-0`, and `0-MAX`.
   * @param histogram histogram or {@code null} for none
   */
  public HistogramQueryResult setHistogram(java.util.Map<String, java.lang.Long> histogram) {
    this.histogram = histogram;
    return this;
  }

  /**
   * Requested histogram expression.
   * @return value or {@code null} for none
   */
  public java.lang.String getHistogramQuery() {
    return histogramQuery;
  }

  /**
   * Requested histogram expression.
   * @param histogramQuery histogramQuery or {@code null} for none
   */
  public HistogramQueryResult setHistogramQuery(java.lang.String histogramQuery) {
    this.histogramQuery = histogramQuery;
    return this;
  }

  @Override
  public HistogramQueryResult set(String fieldName, Object value) {
    return (HistogramQueryResult) super.set(fieldName, value);
  }

  @Override
  public HistogramQueryResult clone() {
    return (HistogramQueryResult) super.clone();
  }

}

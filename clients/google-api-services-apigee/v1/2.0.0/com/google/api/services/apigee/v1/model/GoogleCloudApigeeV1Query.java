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
 * Model definition for GoogleCloudApigeeV1Query.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1Query extends com.google.api.client.json.GenericJson {

  /**
   * Delimiter used in the CSV file, if `outputFormat` is set to `csv`. Defaults to the `,` (comma)
   * character. Supported delimiter characters include comma (`,`), pipe (`|`), and tab (`\t`).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String csvDelimiter;

  /**
   * A list of dimensions. https://docs.apigee.com/api-platform/analytics/analytics-
   * reference#dimensions
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> dimensions;

  /**
   * Hostname needs to be specified if query intends to run at host level. This field is only
   * allowed when query is submitted by CreateHostAsyncQuery where analytics data will be grouped by
   * organization and hostname.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String envgroupHostname;

  /**
   * Boolean expression that can be used to filter data. Filter expressions can be combined using
   * AND/OR terms and should be fully parenthesized to avoid ambiguity. See Analytics metrics,
   * dimensions, and filters reference https://docs.apigee.com/api-platform/analytics/analytics-
   * reference for more information on the fields available to filter on. For more information on
   * the tokens that you use to build filter expressions, see Filter expression syntax.
   * https://docs.apigee.com/api-platform/analytics/asynch-reports-api#filter-expression-syntax
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filter;

  /**
   * Time unit used to group the result set. Valid values include: second, minute, hour, day, week,
   * or month. If a query includes groupByTimeUnit, then the result is an aggregation based on the
   * specified time unit and the resultant timestamp does not include milliseconds precision. If a
   * query omits groupByTimeUnit, then the resultant timestamp includes milliseconds precision.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String groupByTimeUnit;

  /**
   * Maximum number of rows that can be returned in the result.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer limit;

  /**
   * A list of Metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1QueryMetric> metrics;

  /**
   * Asynchronous Query Name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Valid values include: `csv` or `json`. Defaults to `json`. Note: Configure the delimiter for
   * CSV output using the csvDelimiter property.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String outputFormat;

  /**
   * Asynchronous Report ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String reportDefinitionId;

  /**
   * Required. Time range for the query. Can use the following predefined strings to specify the
   * time range: `last60minutes` `last24hours` `last7days` Or, specify the timeRange as a structure
   * describing start and end timestamps in the ISO format: yyyy-mm-ddThh:mm:ssZ. Example:
   * "timeRange": { "start": "2018-07-29T00:13:00Z", "end": "2018-08-01T00:18:00Z" }
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Object timeRange;

  /**
   * Delimiter used in the CSV file, if `outputFormat` is set to `csv`. Defaults to the `,` (comma)
   * character. Supported delimiter characters include comma (`,`), pipe (`|`), and tab (`\t`).
   * @return value or {@code null} for none
   */
  public java.lang.String getCsvDelimiter() {
    return csvDelimiter;
  }

  /**
   * Delimiter used in the CSV file, if `outputFormat` is set to `csv`. Defaults to the `,` (comma)
   * character. Supported delimiter characters include comma (`,`), pipe (`|`), and tab (`\t`).
   * @param csvDelimiter csvDelimiter or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setCsvDelimiter(java.lang.String csvDelimiter) {
    this.csvDelimiter = csvDelimiter;
    return this;
  }

  /**
   * A list of dimensions. https://docs.apigee.com/api-platform/analytics/analytics-
   * reference#dimensions
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getDimensions() {
    return dimensions;
  }

  /**
   * A list of dimensions. https://docs.apigee.com/api-platform/analytics/analytics-
   * reference#dimensions
   * @param dimensions dimensions or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setDimensions(java.util.List<java.lang.String> dimensions) {
    this.dimensions = dimensions;
    return this;
  }

  /**
   * Hostname needs to be specified if query intends to run at host level. This field is only
   * allowed when query is submitted by CreateHostAsyncQuery where analytics data will be grouped by
   * organization and hostname.
   * @return value or {@code null} for none
   */
  public java.lang.String getEnvgroupHostname() {
    return envgroupHostname;
  }

  /**
   * Hostname needs to be specified if query intends to run at host level. This field is only
   * allowed when query is submitted by CreateHostAsyncQuery where analytics data will be grouped by
   * organization and hostname.
   * @param envgroupHostname envgroupHostname or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setEnvgroupHostname(java.lang.String envgroupHostname) {
    this.envgroupHostname = envgroupHostname;
    return this;
  }

  /**
   * Boolean expression that can be used to filter data. Filter expressions can be combined using
   * AND/OR terms and should be fully parenthesized to avoid ambiguity. See Analytics metrics,
   * dimensions, and filters reference https://docs.apigee.com/api-platform/analytics/analytics-
   * reference for more information on the fields available to filter on. For more information on
   * the tokens that you use to build filter expressions, see Filter expression syntax.
   * https://docs.apigee.com/api-platform/analytics/asynch-reports-api#filter-expression-syntax
   * @return value or {@code null} for none
   */
  public java.lang.String getFilter() {
    return filter;
  }

  /**
   * Boolean expression that can be used to filter data. Filter expressions can be combined using
   * AND/OR terms and should be fully parenthesized to avoid ambiguity. See Analytics metrics,
   * dimensions, and filters reference https://docs.apigee.com/api-platform/analytics/analytics-
   * reference for more information on the fields available to filter on. For more information on
   * the tokens that you use to build filter expressions, see Filter expression syntax.
   * https://docs.apigee.com/api-platform/analytics/asynch-reports-api#filter-expression-syntax
   * @param filter filter or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setFilter(java.lang.String filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Time unit used to group the result set. Valid values include: second, minute, hour, day, week,
   * or month. If a query includes groupByTimeUnit, then the result is an aggregation based on the
   * specified time unit and the resultant timestamp does not include milliseconds precision. If a
   * query omits groupByTimeUnit, then the resultant timestamp includes milliseconds precision.
   * @return value or {@code null} for none
   */
  public java.lang.String getGroupByTimeUnit() {
    return groupByTimeUnit;
  }

  /**
   * Time unit used to group the result set. Valid values include: second, minute, hour, day, week,
   * or month. If a query includes groupByTimeUnit, then the result is an aggregation based on the
   * specified time unit and the resultant timestamp does not include milliseconds precision. If a
   * query omits groupByTimeUnit, then the resultant timestamp includes milliseconds precision.
   * @param groupByTimeUnit groupByTimeUnit or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setGroupByTimeUnit(java.lang.String groupByTimeUnit) {
    this.groupByTimeUnit = groupByTimeUnit;
    return this;
  }

  /**
   * Maximum number of rows that can be returned in the result.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLimit() {
    return limit;
  }

  /**
   * Maximum number of rows that can be returned in the result.
   * @param limit limit or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setLimit(java.lang.Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * A list of Metrics.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1QueryMetric> getMetrics() {
    return metrics;
  }

  /**
   * A list of Metrics.
   * @param metrics metrics or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setMetrics(java.util.List<GoogleCloudApigeeV1QueryMetric> metrics) {
    this.metrics = metrics;
    return this;
  }

  /**
   * Asynchronous Query Name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Asynchronous Query Name.
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Valid values include: `csv` or `json`. Defaults to `json`. Note: Configure the delimiter for
   * CSV output using the csvDelimiter property.
   * @return value or {@code null} for none
   */
  public java.lang.String getOutputFormat() {
    return outputFormat;
  }

  /**
   * Valid values include: `csv` or `json`. Defaults to `json`. Note: Configure the delimiter for
   * CSV output using the csvDelimiter property.
   * @param outputFormat outputFormat or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setOutputFormat(java.lang.String outputFormat) {
    this.outputFormat = outputFormat;
    return this;
  }

  /**
   * Asynchronous Report ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getReportDefinitionId() {
    return reportDefinitionId;
  }

  /**
   * Asynchronous Report ID.
   * @param reportDefinitionId reportDefinitionId or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setReportDefinitionId(java.lang.String reportDefinitionId) {
    this.reportDefinitionId = reportDefinitionId;
    return this;
  }

  /**
   * Required. Time range for the query. Can use the following predefined strings to specify the
   * time range: `last60minutes` `last24hours` `last7days` Or, specify the timeRange as a structure
   * describing start and end timestamps in the ISO format: yyyy-mm-ddThh:mm:ssZ. Example:
   * "timeRange": { "start": "2018-07-29T00:13:00Z", "end": "2018-08-01T00:18:00Z" }
   * @return value or {@code null} for none
   */
  public java.lang.Object getTimeRange() {
    return timeRange;
  }

  /**
   * Required. Time range for the query. Can use the following predefined strings to specify the
   * time range: `last60minutes` `last24hours` `last7days` Or, specify the timeRange as a structure
   * describing start and end timestamps in the ISO format: yyyy-mm-ddThh:mm:ssZ. Example:
   * "timeRange": { "start": "2018-07-29T00:13:00Z", "end": "2018-08-01T00:18:00Z" }
   * @param timeRange timeRange or {@code null} for none
   */
  public GoogleCloudApigeeV1Query setTimeRange(java.lang.Object timeRange) {
    this.timeRange = timeRange;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1Query set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1Query) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1Query clone() {
    return (GoogleCloudApigeeV1Query) super.clone();
  }

}

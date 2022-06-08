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

package com.google.api.services.cloudsearch.v1.model;

/**
 * SearchApplication
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SearchApplication extends com.google.api.client.json.GenericJson {

  /**
   * Retrictions applied to the configurations. The maximum number of elements is 10.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataSourceRestriction> dataSourceRestrictions;

  static {
    // hack to force ProGuard to consider DataSourceRestriction used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DataSourceRestriction.class);
  }

  /**
   * The default fields for returning facet results. The sources specified here also have been
   * included in data_source_restrictions above.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FacetOptions> defaultFacetOptions;

  static {
    // hack to force ProGuard to consider FacetOptions used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FacetOptions.class);
  }

  /**
   * The default options for sorting the search results
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SortOptions defaultSortOptions;

  /**
   * Display name of the Search Application. The maximum length is 300 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Indicates whether audit logging is on/off for requests made for the search application in query
   * APIs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableAuditLog;

  /**
   * The name of the Search Application. Format: searchapplications/{application_id}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. IDs of the Long Running Operations (LROs) currently running for this schema.
   * Output only field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> operationIds;

  /**
   * The default options for query interpretation
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private QueryInterpretationConfig queryInterpretationConfig;

  /**
   * With each result we should return the URI for its thumbnail (when applicable)
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean returnResultThumbnailUrls;

  /**
   * Configuration for ranking results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ScoringConfig scoringConfig;

  /**
   * Configuration for a sources specified in data_source_restrictions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<SourceConfig> sourceConfig;

  /**
   * Retrictions applied to the configurations. The maximum number of elements is 10.
   * @return value or {@code null} for none
   */
  public java.util.List<DataSourceRestriction> getDataSourceRestrictions() {
    return dataSourceRestrictions;
  }

  /**
   * Retrictions applied to the configurations. The maximum number of elements is 10.
   * @param dataSourceRestrictions dataSourceRestrictions or {@code null} for none
   */
  public SearchApplication setDataSourceRestrictions(java.util.List<DataSourceRestriction> dataSourceRestrictions) {
    this.dataSourceRestrictions = dataSourceRestrictions;
    return this;
  }

  /**
   * The default fields for returning facet results. The sources specified here also have been
   * included in data_source_restrictions above.
   * @return value or {@code null} for none
   */
  public java.util.List<FacetOptions> getDefaultFacetOptions() {
    return defaultFacetOptions;
  }

  /**
   * The default fields for returning facet results. The sources specified here also have been
   * included in data_source_restrictions above.
   * @param defaultFacetOptions defaultFacetOptions or {@code null} for none
   */
  public SearchApplication setDefaultFacetOptions(java.util.List<FacetOptions> defaultFacetOptions) {
    this.defaultFacetOptions = defaultFacetOptions;
    return this;
  }

  /**
   * The default options for sorting the search results
   * @return value or {@code null} for none
   */
  public SortOptions getDefaultSortOptions() {
    return defaultSortOptions;
  }

  /**
   * The default options for sorting the search results
   * @param defaultSortOptions defaultSortOptions or {@code null} for none
   */
  public SearchApplication setDefaultSortOptions(SortOptions defaultSortOptions) {
    this.defaultSortOptions = defaultSortOptions;
    return this;
  }

  /**
   * Display name of the Search Application. The maximum length is 300 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Display name of the Search Application. The maximum length is 300 characters.
   * @param displayName displayName or {@code null} for none
   */
  public SearchApplication setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Indicates whether audit logging is on/off for requests made for the search application in query
   * APIs.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableAuditLog() {
    return enableAuditLog;
  }

  /**
   * Indicates whether audit logging is on/off for requests made for the search application in query
   * APIs.
   * @param enableAuditLog enableAuditLog or {@code null} for none
   */
  public SearchApplication setEnableAuditLog(java.lang.Boolean enableAuditLog) {
    this.enableAuditLog = enableAuditLog;
    return this;
  }

  /**
   * The name of the Search Application. Format: searchapplications/{application_id}.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the Search Application. Format: searchapplications/{application_id}.
   * @param name name or {@code null} for none
   */
  public SearchApplication setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. IDs of the Long Running Operations (LROs) currently running for this schema.
   * Output only field.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOperationIds() {
    return operationIds;
  }

  /**
   * Output only. IDs of the Long Running Operations (LROs) currently running for this schema.
   * Output only field.
   * @param operationIds operationIds or {@code null} for none
   */
  public SearchApplication setOperationIds(java.util.List<java.lang.String> operationIds) {
    this.operationIds = operationIds;
    return this;
  }

  /**
   * The default options for query interpretation
   * @return value or {@code null} for none
   */
  public QueryInterpretationConfig getQueryInterpretationConfig() {
    return queryInterpretationConfig;
  }

  /**
   * The default options for query interpretation
   * @param queryInterpretationConfig queryInterpretationConfig or {@code null} for none
   */
  public SearchApplication setQueryInterpretationConfig(QueryInterpretationConfig queryInterpretationConfig) {
    this.queryInterpretationConfig = queryInterpretationConfig;
    return this;
  }

  /**
   * With each result we should return the URI for its thumbnail (when applicable)
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getReturnResultThumbnailUrls() {
    return returnResultThumbnailUrls;
  }

  /**
   * With each result we should return the URI for its thumbnail (when applicable)
   * @param returnResultThumbnailUrls returnResultThumbnailUrls or {@code null} for none
   */
  public SearchApplication setReturnResultThumbnailUrls(java.lang.Boolean returnResultThumbnailUrls) {
    this.returnResultThumbnailUrls = returnResultThumbnailUrls;
    return this;
  }

  /**
   * Configuration for ranking results.
   * @return value or {@code null} for none
   */
  public ScoringConfig getScoringConfig() {
    return scoringConfig;
  }

  /**
   * Configuration for ranking results.
   * @param scoringConfig scoringConfig or {@code null} for none
   */
  public SearchApplication setScoringConfig(ScoringConfig scoringConfig) {
    this.scoringConfig = scoringConfig;
    return this;
  }

  /**
   * Configuration for a sources specified in data_source_restrictions.
   * @return value or {@code null} for none
   */
  public java.util.List<SourceConfig> getSourceConfig() {
    return sourceConfig;
  }

  /**
   * Configuration for a sources specified in data_source_restrictions.
   * @param sourceConfig sourceConfig or {@code null} for none
   */
  public SearchApplication setSourceConfig(java.util.List<SourceConfig> sourceConfig) {
    this.sourceConfig = sourceConfig;
    return this;
  }

  @Override
  public SearchApplication set(String fieldName, Object value) {
    return (SearchApplication) super.set(fieldName, value);
  }

  @Override
  public SearchApplication clone() {
    return (SearchApplication) super.clone();
  }

}

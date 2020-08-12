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
 * Datasource is a logical namespace for items to be indexed. All items must belong to a datasource.
 * This is the prerequisite before items can be indexed into Cloud Search.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DataSource extends com.google.api.client.json.GenericJson {

  /**
   * If true, Indexing API rejects any modification calls to this datasource such as create, update,
   * and delete. Disabling this does not imply halting process of previously accepted data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableModifications;

  /**
   * Disable serving any search or assist results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean disableServing;

  /**
   * Required. Display name of the datasource The maximum length is 300 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * List of service accounts that have indexing access.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> indexingServiceAccounts;

  /**
   * This field restricts visibility to items at the datasource level. Items within the datasource
   * are restricted to the union of users and groups included in this field. Note that, this does
   * not ensure access to a specific item, as users need to have ACL permissions on the contained
   * items. This ensures a high level access on the entire datasource, and that the individual items
   * are not shared outside this visibility.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GSuitePrincipal> itemsVisibility;

  /**
   * Name of the datasource resource. Format: datasources/{source_id}. The name is ignored when
   * creating a datasource.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * IDs of the Long Running Operations (LROs) currently running for this schema.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> operationIds;

  /**
   * A short name or alias for the source. This value will be used to match the 'source' operator.
   * For example, if the short name is ** then queries like *source:* will only return results for
   * this source. The value must be unique across all datasources. The value must only contain
   * alphanumeric characters (a-zA-Z0-9). The value cannot start with 'google' and cannot be one of
   * the following: mail, gmail, docs, drive, groups, sites, calendar, hangouts, gplus, keep,
   * people, teams. Its maximum length is 32 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shortName;

  /**
   * If true, Indexing API rejects any modification calls to this datasource such as create, update,
   * and delete. Disabling this does not imply halting process of previously accepted data.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableModifications() {
    return disableModifications;
  }

  /**
   * If true, Indexing API rejects any modification calls to this datasource such as create, update,
   * and delete. Disabling this does not imply halting process of previously accepted data.
   * @param disableModifications disableModifications or {@code null} for none
   */
  public DataSource setDisableModifications(java.lang.Boolean disableModifications) {
    this.disableModifications = disableModifications;
    return this;
  }

  /**
   * Disable serving any search or assist results.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDisableServing() {
    return disableServing;
  }

  /**
   * Disable serving any search or assist results.
   * @param disableServing disableServing or {@code null} for none
   */
  public DataSource setDisableServing(java.lang.Boolean disableServing) {
    this.disableServing = disableServing;
    return this;
  }

  /**
   * Required. Display name of the datasource The maximum length is 300 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. Display name of the datasource The maximum length is 300 characters.
   * @param displayName displayName or {@code null} for none
   */
  public DataSource setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * List of service accounts that have indexing access.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getIndexingServiceAccounts() {
    return indexingServiceAccounts;
  }

  /**
   * List of service accounts that have indexing access.
   * @param indexingServiceAccounts indexingServiceAccounts or {@code null} for none
   */
  public DataSource setIndexingServiceAccounts(java.util.List<java.lang.String> indexingServiceAccounts) {
    this.indexingServiceAccounts = indexingServiceAccounts;
    return this;
  }

  /**
   * This field restricts visibility to items at the datasource level. Items within the datasource
   * are restricted to the union of users and groups included in this field. Note that, this does
   * not ensure access to a specific item, as users need to have ACL permissions on the contained
   * items. This ensures a high level access on the entire datasource, and that the individual items
   * are not shared outside this visibility.
   * @return value or {@code null} for none
   */
  public java.util.List<GSuitePrincipal> getItemsVisibility() {
    return itemsVisibility;
  }

  /**
   * This field restricts visibility to items at the datasource level. Items within the datasource
   * are restricted to the union of users and groups included in this field. Note that, this does
   * not ensure access to a specific item, as users need to have ACL permissions on the contained
   * items. This ensures a high level access on the entire datasource, and that the individual items
   * are not shared outside this visibility.
   * @param itemsVisibility itemsVisibility or {@code null} for none
   */
  public DataSource setItemsVisibility(java.util.List<GSuitePrincipal> itemsVisibility) {
    this.itemsVisibility = itemsVisibility;
    return this;
  }

  /**
   * Name of the datasource resource. Format: datasources/{source_id}. The name is ignored when
   * creating a datasource.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the datasource resource. Format: datasources/{source_id}. The name is ignored when
   * creating a datasource.
   * @param name name or {@code null} for none
   */
  public DataSource setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * IDs of the Long Running Operations (LROs) currently running for this schema.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getOperationIds() {
    return operationIds;
  }

  /**
   * IDs of the Long Running Operations (LROs) currently running for this schema.
   * @param operationIds operationIds or {@code null} for none
   */
  public DataSource setOperationIds(java.util.List<java.lang.String> operationIds) {
    this.operationIds = operationIds;
    return this;
  }

  /**
   * A short name or alias for the source. This value will be used to match the 'source' operator.
   * For example, if the short name is ** then queries like *source:* will only return results for
   * this source. The value must be unique across all datasources. The value must only contain
   * alphanumeric characters (a-zA-Z0-9). The value cannot start with 'google' and cannot be one of
   * the following: mail, gmail, docs, drive, groups, sites, calendar, hangouts, gplus, keep,
   * people, teams. Its maximum length is 32 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getShortName() {
    return shortName;
  }

  /**
   * A short name or alias for the source. This value will be used to match the 'source' operator.
   * For example, if the short name is ** then queries like *source:* will only return results for
   * this source. The value must be unique across all datasources. The value must only contain
   * alphanumeric characters (a-zA-Z0-9). The value cannot start with 'google' and cannot be one of
   * the following: mail, gmail, docs, drive, groups, sites, calendar, hangouts, gplus, keep,
   * people, teams. Its maximum length is 32 characters.
   * @param shortName shortName or {@code null} for none
   */
  public DataSource setShortName(java.lang.String shortName) {
    this.shortName = shortName;
    return this;
  }

  @Override
  public DataSource set(String fieldName, Object value) {
    return (DataSource) super.set(fieldName, value);
  }

  @Override
  public DataSource clone() {
    return (DataSource) super.clone();
  }

}

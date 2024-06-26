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

package com.google.api.services.bigquery.model;

/**
 * Model definition for TableDataList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TableDataList extends com.google.api.client.json.GenericJson {

  /**
   * A hash of this page of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The resource type of the response.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * A token used for paging results. Providing this token instead of the startIndex parameter can
   * help you retrieve stable results when an underlying table is changing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String pageToken;

  /**
   * Rows of results.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TableRow> rows;

  /**
   * Total rows of the entire table. In order to show default value 0 we have to present it as
   * string.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long totalRows;

  /**
   * A hash of this page of results.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * A hash of this page of results.
   * @param etag etag or {@code null} for none
   */
  public TableDataList setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The resource type of the response.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * The resource type of the response.
   * @param kind kind or {@code null} for none
   */
  public TableDataList setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * A token used for paging results. Providing this token instead of the startIndex parameter can
   * help you retrieve stable results when an underlying table is changing.
   * @return value or {@code null} for none
   */
  public java.lang.String getPageToken() {
    return pageToken;
  }

  /**
   * A token used for paging results. Providing this token instead of the startIndex parameter can
   * help you retrieve stable results when an underlying table is changing.
   * @param pageToken pageToken or {@code null} for none
   */
  public TableDataList setPageToken(java.lang.String pageToken) {
    this.pageToken = pageToken;
    return this;
  }

  /**
   * Rows of results.
   * @return value or {@code null} for none
   */
  public java.util.List<TableRow> getRows() {
    return rows;
  }

  /**
   * Rows of results.
   * @param rows rows or {@code null} for none
   */
  public TableDataList setRows(java.util.List<TableRow> rows) {
    this.rows = rows;
    return this;
  }

  /**
   * Total rows of the entire table. In order to show default value 0 we have to present it as
   * string.
   * @return value or {@code null} for none
   */
  public java.lang.Long getTotalRows() {
    return totalRows;
  }

  /**
   * Total rows of the entire table. In order to show default value 0 we have to present it as
   * string.
   * @param totalRows totalRows or {@code null} for none
   */
  public TableDataList setTotalRows(java.lang.Long totalRows) {
    this.totalRows = totalRows;
    return this;
  }

  @Override
  public TableDataList set(String fieldName, Object value) {
    return (TableDataList) super.set(fieldName, value);
  }

  @Override
  public TableDataList clone() {
    return (TableDataList) super.clone();
  }

}

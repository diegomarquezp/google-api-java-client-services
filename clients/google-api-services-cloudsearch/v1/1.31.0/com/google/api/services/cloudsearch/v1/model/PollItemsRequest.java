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
 * Model definition for PollItemsRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PollItemsRequest extends com.google.api.client.json.GenericJson {

  /**
   * The name of connector making this call. Format: datasources/{source_id}/connectors/{ID}
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String connectorName;

  /**
   * Common debug options.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DebugOptions debugOptions;

  /**
   * Maximum number of items to return. The maximum value is 100 and the default value is 20.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer limit;

  /**
   * Queue name to fetch items from. If unspecified, PollItems will fetch from 'default' queue. The
   * maximum length is 100 characters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String queue;

  /**
   * Limit the items polled to the ones with these statuses.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> statusCodes;

  /**
   * The name of connector making this call. Format: datasources/{source_id}/connectors/{ID}
   * @return value or {@code null} for none
   */
  public java.lang.String getConnectorName() {
    return connectorName;
  }

  /**
   * The name of connector making this call. Format: datasources/{source_id}/connectors/{ID}
   * @param connectorName connectorName or {@code null} for none
   */
  public PollItemsRequest setConnectorName(java.lang.String connectorName) {
    this.connectorName = connectorName;
    return this;
  }

  /**
   * Common debug options.
   * @return value or {@code null} for none
   */
  public DebugOptions getDebugOptions() {
    return debugOptions;
  }

  /**
   * Common debug options.
   * @param debugOptions debugOptions or {@code null} for none
   */
  public PollItemsRequest setDebugOptions(DebugOptions debugOptions) {
    this.debugOptions = debugOptions;
    return this;
  }

  /**
   * Maximum number of items to return. The maximum value is 100 and the default value is 20.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getLimit() {
    return limit;
  }

  /**
   * Maximum number of items to return. The maximum value is 100 and the default value is 20.
   * @param limit limit or {@code null} for none
   */
  public PollItemsRequest setLimit(java.lang.Integer limit) {
    this.limit = limit;
    return this;
  }

  /**
   * Queue name to fetch items from. If unspecified, PollItems will fetch from 'default' queue. The
   * maximum length is 100 characters.
   * @return value or {@code null} for none
   */
  public java.lang.String getQueue() {
    return queue;
  }

  /**
   * Queue name to fetch items from. If unspecified, PollItems will fetch from 'default' queue. The
   * maximum length is 100 characters.
   * @param queue queue or {@code null} for none
   */
  public PollItemsRequest setQueue(java.lang.String queue) {
    this.queue = queue;
    return this;
  }

  /**
   * Limit the items polled to the ones with these statuses.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getStatusCodes() {
    return statusCodes;
  }

  /**
   * Limit the items polled to the ones with these statuses.
   * @param statusCodes statusCodes or {@code null} for none
   */
  public PollItemsRequest setStatusCodes(java.util.List<java.lang.String> statusCodes) {
    this.statusCodes = statusCodes;
    return this;
  }

  @Override
  public PollItemsRequest set(String fieldName, Object value) {
    return (PollItemsRequest) super.set(fieldName, value);
  }

  @Override
  public PollItemsRequest clone() {
    return (PollItemsRequest) super.clone();
  }

}

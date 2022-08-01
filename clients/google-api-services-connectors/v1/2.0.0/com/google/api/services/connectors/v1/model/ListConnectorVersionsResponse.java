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

package com.google.api.services.connectors.v1.model;

/**
 * Response message for Connectors.ListConnectorVersions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Connectors API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListConnectorVersionsResponse extends com.google.api.client.json.GenericJson {

  /**
   * A list of connector versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ConnectorVersion> connectorVersions;

  static {
    // hack to force ProGuard to consider ConnectorVersion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ConnectorVersion.class);
  }

  /**
   * Next page token.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nextPageToken;

  /**
   * Locations that could not be reached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> unreachable;

  /**
   * A list of connector versions.
   * @return value or {@code null} for none
   */
  public java.util.List<ConnectorVersion> getConnectorVersions() {
    return connectorVersions;
  }

  /**
   * A list of connector versions.
   * @param connectorVersions connectorVersions or {@code null} for none
   */
  public ListConnectorVersionsResponse setConnectorVersions(java.util.List<ConnectorVersion> connectorVersions) {
    this.connectorVersions = connectorVersions;
    return this;
  }

  /**
   * Next page token.
   * @return value or {@code null} for none
   */
  public java.lang.String getNextPageToken() {
    return nextPageToken;
  }

  /**
   * Next page token.
   * @param nextPageToken nextPageToken or {@code null} for none
   */
  public ListConnectorVersionsResponse setNextPageToken(java.lang.String nextPageToken) {
    this.nextPageToken = nextPageToken;
    return this;
  }

  /**
   * Locations that could not be reached.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getUnreachable() {
    return unreachable;
  }

  /**
   * Locations that could not be reached.
   * @param unreachable unreachable or {@code null} for none
   */
  public ListConnectorVersionsResponse setUnreachable(java.util.List<java.lang.String> unreachable) {
    this.unreachable = unreachable;
    return this;
  }

  @Override
  public ListConnectorVersionsResponse set(String fieldName, Object value) {
    return (ListConnectorVersionsResponse) super.set(fieldName, value);
  }

  @Override
  public ListConnectorVersionsResponse clone() {
    return (ListConnectorVersionsResponse) super.clone();
  }

}

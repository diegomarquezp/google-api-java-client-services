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
 * Start upload file request.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class StartUploadItemRequest extends com.google.api.client.json.GenericJson {

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
  public StartUploadItemRequest setConnectorName(java.lang.String connectorName) {
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
  public StartUploadItemRequest setDebugOptions(DebugOptions debugOptions) {
    this.debugOptions = debugOptions;
    return this;
  }

  @Override
  public StartUploadItemRequest set(String fieldName, Object value) {
    return (StartUploadItemRequest) super.set(fieldName, value);
  }

  @Override
  public StartUploadItemRequest clone() {
    return (StartUploadItemRequest) super.clone();
  }

}

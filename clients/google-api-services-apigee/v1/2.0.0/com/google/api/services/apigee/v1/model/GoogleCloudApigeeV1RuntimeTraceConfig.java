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
 * NEXT ID: 8 RuntimeTraceConfig defines the configurations for distributed trace in an environment.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apigee API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GoogleCloudApigeeV1RuntimeTraceConfig extends com.google.api.client.json.GenericJson {

  /**
   * Endpoint of the exporter.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String endpoint;

  /**
   * Exporter that is used to view the distributed trace captured using OpenCensus. An exporter
   * sends traces to any backend that is capable of consuming them. Recorded spans can be exported
   * by registered exporters.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String exporter;

  /**
   * Name of the trace config in the following format:
   * `organizations/{org}/environment/{env}/traceConfig`
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of trace configuration overrides for spicific API proxies.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<GoogleCloudApigeeV1RuntimeTraceConfigOverride> overrides;

  /**
   * The timestamp that the revision was created or updated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String revisionCreateTime;

  /**
   * Revision number which can be used by the runtime to detect if the trace config has changed
   * between two versions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String revisionId;

  /**
   * Trace configuration for all API proxies in an environment.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GoogleCloudApigeeV1RuntimeTraceSamplingConfig samplingConfig;

  /**
   * Endpoint of the exporter.
   * @return value or {@code null} for none
   */
  public java.lang.String getEndpoint() {
    return endpoint;
  }

  /**
   * Endpoint of the exporter.
   * @param endpoint endpoint or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeTraceConfig setEndpoint(java.lang.String endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Exporter that is used to view the distributed trace captured using OpenCensus. An exporter
   * sends traces to any backend that is capable of consuming them. Recorded spans can be exported
   * by registered exporters.
   * @return value or {@code null} for none
   */
  public java.lang.String getExporter() {
    return exporter;
  }

  /**
   * Exporter that is used to view the distributed trace captured using OpenCensus. An exporter
   * sends traces to any backend that is capable of consuming them. Recorded spans can be exported
   * by registered exporters.
   * @param exporter exporter or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeTraceConfig setExporter(java.lang.String exporter) {
    this.exporter = exporter;
    return this;
  }

  /**
   * Name of the trace config in the following format:
   * `organizations/{org}/environment/{env}/traceConfig`
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Name of the trace config in the following format:
   * `organizations/{org}/environment/{env}/traceConfig`
   * @param name name or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeTraceConfig setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * List of trace configuration overrides for spicific API proxies.
   * @return value or {@code null} for none
   */
  public java.util.List<GoogleCloudApigeeV1RuntimeTraceConfigOverride> getOverrides() {
    return overrides;
  }

  /**
   * List of trace configuration overrides for spicific API proxies.
   * @param overrides overrides or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeTraceConfig setOverrides(java.util.List<GoogleCloudApigeeV1RuntimeTraceConfigOverride> overrides) {
    this.overrides = overrides;
    return this;
  }

  /**
   * The timestamp that the revision was created or updated.
   * @return value or {@code null} for none
   */
  public String getRevisionCreateTime() {
    return revisionCreateTime;
  }

  /**
   * The timestamp that the revision was created or updated.
   * @param revisionCreateTime revisionCreateTime or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeTraceConfig setRevisionCreateTime(String revisionCreateTime) {
    this.revisionCreateTime = revisionCreateTime;
    return this;
  }

  /**
   * Revision number which can be used by the runtime to detect if the trace config has changed
   * between two versions.
   * @return value or {@code null} for none
   */
  public java.lang.String getRevisionId() {
    return revisionId;
  }

  /**
   * Revision number which can be used by the runtime to detect if the trace config has changed
   * between two versions.
   * @param revisionId revisionId or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeTraceConfig setRevisionId(java.lang.String revisionId) {
    this.revisionId = revisionId;
    return this;
  }

  /**
   * Trace configuration for all API proxies in an environment.
   * @return value or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeTraceSamplingConfig getSamplingConfig() {
    return samplingConfig;
  }

  /**
   * Trace configuration for all API proxies in an environment.
   * @param samplingConfig samplingConfig or {@code null} for none
   */
  public GoogleCloudApigeeV1RuntimeTraceConfig setSamplingConfig(GoogleCloudApigeeV1RuntimeTraceSamplingConfig samplingConfig) {
    this.samplingConfig = samplingConfig;
    return this;
  }

  @Override
  public GoogleCloudApigeeV1RuntimeTraceConfig set(String fieldName, Object value) {
    return (GoogleCloudApigeeV1RuntimeTraceConfig) super.set(fieldName, value);
  }

  @Override
  public GoogleCloudApigeeV1RuntimeTraceConfig clone() {
    return (GoogleCloudApigeeV1RuntimeTraceConfig) super.clone();
  }

}

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

package com.google.api.services.spanner.v1.model;

/**
 * An isolated set of Cloud Spanner resources on which databases can be hosted.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Spanner API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Instance extends com.google.api.client.json.GenericJson {

  /**
   * Required. The name of the instance's configuration. Values are of the form
   * `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String config;

  /**
   * Required. The descriptive name for this instance as it appears in UIs. Must be unique per
   * project and between 4 and 30 characters in length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String displayName;

  /**
   * Deprecated. This field is not populated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> endpointUris;

  /**
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into
   * groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels
   * can be used to filter collections of resources. They can be used to control how resource
   * metrics are aggregated. And they can be used as arguments to policy management rules (e.g.
   * route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long
   * and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. * Label
   * values must be between 0 and 63 characters long and must conform to the regular expression
   * `([a-z]([-a-z0-9]*[a-z0-9])?)?`. * No more than 64 labels can be associated with a given
   * resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan
   * to use labels in your own code, please note that additional characters may be allowed in the
   * future. And so you are advised to use an internal label representation, such as JSON, which
   * doesn't rely upon specific characters being disallowed. For example, representing labels as the
   * string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.String> labels;

  /**
   * Required. A unique identifier for the instance, which cannot be changed after the instance is
   * created. Values are of the form `projects//instances/a-z*[a-z0-9]`. The final segment of the
   * name must be between 2 and 64 characters in length.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The number of nodes allocated to this instance. At most one of either node_count or
   * processing_units should be present in the message. This may be zero in API responses for
   * instances that are not yet in state `READY`. See [the
   * documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information
   * about nodes and processing units.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer nodeCount;

  /**
   * The number of processing units allocated to this instance. At most one of processing_units or
   * node_count should be present in the message. This may be zero in API responses for instances
   * that are not yet in state `READY`. See [the
   * documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information
   * about nodes and processing units.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer processingUnits;

  /**
   * Output only. The current instance state. For CreateInstance, the state must be either omitted
   * or set to `CREATING`. For UpdateInstance, the state must be either omitted or set to `READY`.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Required. The name of the instance's configuration. Values are of the form
   * `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
   * @return value or {@code null} for none
   */
  public java.lang.String getConfig() {
    return config;
  }

  /**
   * Required. The name of the instance's configuration. Values are of the form
   * `projects//instanceConfigs/`. See also InstanceConfig and ListInstanceConfigs.
   * @param config config or {@code null} for none
   */
  public Instance setConfig(java.lang.String config) {
    this.config = config;
    return this;
  }

  /**
   * Required. The descriptive name for this instance as it appears in UIs. Must be unique per
   * project and between 4 and 30 characters in length.
   * @return value or {@code null} for none
   */
  public java.lang.String getDisplayName() {
    return displayName;
  }

  /**
   * Required. The descriptive name for this instance as it appears in UIs. Must be unique per
   * project and between 4 and 30 characters in length.
   * @param displayName displayName or {@code null} for none
   */
  public Instance setDisplayName(java.lang.String displayName) {
    this.displayName = displayName;
    return this;
  }

  /**
   * Deprecated. This field is not populated.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getEndpointUris() {
    return endpointUris;
  }

  /**
   * Deprecated. This field is not populated.
   * @param endpointUris endpointUris or {@code null} for none
   */
  public Instance setEndpointUris(java.util.List<java.lang.String> endpointUris) {
    this.endpointUris = endpointUris;
    return this;
  }

  /**
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into
   * groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels
   * can be used to filter collections of resources. They can be used to control how resource
   * metrics are aggregated. And they can be used as arguments to policy management rules (e.g.
   * route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long
   * and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. * Label
   * values must be between 0 and 63 characters long and must conform to the regular expression
   * `([a-z]([-a-z0-9]*[a-z0-9])?)?`. * No more than 64 labels can be associated with a given
   * resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan
   * to use labels in your own code, please note that additional characters may be allowed in the
   * future. And so you are advised to use an internal label representation, such as JSON, which
   * doesn't rely upon specific characters being disallowed. For example, representing labels as the
   * string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.String> getLabels() {
    return labels;
  }

  /**
   * Cloud Labels are a flexible and lightweight mechanism for organizing cloud resources into
   * groups that reflect a customer's organizational needs and deployment strategies. Cloud Labels
   * can be used to filter collections of resources. They can be used to control how resource
   * metrics are aggregated. And they can be used as arguments to policy management rules (e.g.
   * route, firewall, load balancing, etc.). * Label keys must be between 1 and 63 characters long
   * and must conform to the following regular expression: `[a-z]([-a-z0-9]*[a-z0-9])?`. * Label
   * values must be between 0 and 63 characters long and must conform to the regular expression
   * `([a-z]([-a-z0-9]*[a-z0-9])?)?`. * No more than 64 labels can be associated with a given
   * resource. See https://goo.gl/xmQnxf for more information on and examples of labels. If you plan
   * to use labels in your own code, please note that additional characters may be allowed in the
   * future. And so you are advised to use an internal label representation, such as JSON, which
   * doesn't rely upon specific characters being disallowed. For example, representing labels as the
   * string: name + "_" + value would prove problematic if we were to allow "_" in a future release.
   * @param labels labels or {@code null} for none
   */
  public Instance setLabels(java.util.Map<String, java.lang.String> labels) {
    this.labels = labels;
    return this;
  }

  /**
   * Required. A unique identifier for the instance, which cannot be changed after the instance is
   * created. Values are of the form `projects//instances/a-z*[a-z0-9]`. The final segment of the
   * name must be between 2 and 64 characters in length.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Required. A unique identifier for the instance, which cannot be changed after the instance is
   * created. Values are of the form `projects//instances/a-z*[a-z0-9]`. The final segment of the
   * name must be between 2 and 64 characters in length.
   * @param name name or {@code null} for none
   */
  public Instance setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The number of nodes allocated to this instance. At most one of either node_count or
   * processing_units should be present in the message. This may be zero in API responses for
   * instances that are not yet in state `READY`. See [the
   * documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information
   * about nodes and processing units.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNodeCount() {
    return nodeCount;
  }

  /**
   * The number of nodes allocated to this instance. At most one of either node_count or
   * processing_units should be present in the message. This may be zero in API responses for
   * instances that are not yet in state `READY`. See [the
   * documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information
   * about nodes and processing units.
   * @param nodeCount nodeCount or {@code null} for none
   */
  public Instance setNodeCount(java.lang.Integer nodeCount) {
    this.nodeCount = nodeCount;
    return this;
  }

  /**
   * The number of processing units allocated to this instance. At most one of processing_units or
   * node_count should be present in the message. This may be zero in API responses for instances
   * that are not yet in state `READY`. See [the
   * documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information
   * about nodes and processing units.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getProcessingUnits() {
    return processingUnits;
  }

  /**
   * The number of processing units allocated to this instance. At most one of processing_units or
   * node_count should be present in the message. This may be zero in API responses for instances
   * that are not yet in state `READY`. See [the
   * documentation](https://cloud.google.com/spanner/docs/compute-capacity) for more information
   * about nodes and processing units.
   * @param processingUnits processingUnits or {@code null} for none
   */
  public Instance setProcessingUnits(java.lang.Integer processingUnits) {
    this.processingUnits = processingUnits;
    return this;
  }

  /**
   * Output only. The current instance state. For CreateInstance, the state must be either omitted
   * or set to `CREATING`. For UpdateInstance, the state must be either omitted or set to `READY`.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Output only. The current instance state. For CreateInstance, the state must be either omitted
   * or set to `CREATING`. For UpdateInstance, the state must be either omitted or set to `READY`.
   * @param state state or {@code null} for none
   */
  public Instance setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  @Override
  public Instance set(String fieldName, Object value) {
    return (Instance) super.set(fieldName, value);
  }

  @Override
  public Instance clone() {
    return (Instance) super.clone();
  }

}

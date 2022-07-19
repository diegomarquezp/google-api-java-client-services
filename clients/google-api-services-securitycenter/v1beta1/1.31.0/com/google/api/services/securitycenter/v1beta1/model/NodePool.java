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

package com.google.api.services.securitycenter.v1beta1.model;

/**
 * Provides GKE Node Pool information.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Security Command Center API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NodePool extends com.google.api.client.json.GenericJson {

  /**
   * Kubernetes Node pool name.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Nodes associated with the finding.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Node> nodes;

  static {
    // hack to force ProGuard to consider Node used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Node.class);
  }

  /**
   * Kubernetes Node pool name.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Kubernetes Node pool name.
   * @param name name or {@code null} for none
   */
  public NodePool setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Nodes associated with the finding.
   * @return value or {@code null} for none
   */
  public java.util.List<Node> getNodes() {
    return nodes;
  }

  /**
   * Nodes associated with the finding.
   * @param nodes nodes or {@code null} for none
   */
  public NodePool setNodes(java.util.List<Node> nodes) {
    this.nodes = nodes;
    return this;
  }

  @Override
  public NodePool set(String fieldName, Object value) {
    return (NodePool) super.set(fieldName, value);
  }

  @Override
  public NodePool clone() {
    return (NodePool) super.clone();
  }

}

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

package com.google.api.services.gkehub.v1alpha.model;

/**
 * GkeCluster contains information specific to GKE clusters.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the GKE Hub API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GkeCluster extends com.google.api.client.json.GenericJson {

  /**
   * Output only. If cluster_missing is set then it denotes that the GKE cluster no longer exists in
   * the GKE Control Plane.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean clusterMissing;

  /**
   * Immutable. Self-link of the GCP resource for the GKE cluster. For example:
   * //container.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster Zonal
   * clusters are also supported.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String resourceLink;

  /**
   * Output only. If cluster_missing is set then it denotes that the GKE cluster no longer exists in
   * the GKE Control Plane.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getClusterMissing() {
    return clusterMissing;
  }

  /**
   * Output only. If cluster_missing is set then it denotes that the GKE cluster no longer exists in
   * the GKE Control Plane.
   * @param clusterMissing clusterMissing or {@code null} for none
   */
  public GkeCluster setClusterMissing(java.lang.Boolean clusterMissing) {
    this.clusterMissing = clusterMissing;
    return this;
  }

  /**
   * Immutable. Self-link of the GCP resource for the GKE cluster. For example:
   * //container.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster Zonal
   * clusters are also supported.
   * @return value or {@code null} for none
   */
  public java.lang.String getResourceLink() {
    return resourceLink;
  }

  /**
   * Immutable. Self-link of the GCP resource for the GKE cluster. For example:
   * //container.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster Zonal
   * clusters are also supported.
   * @param resourceLink resourceLink or {@code null} for none
   */
  public GkeCluster setResourceLink(java.lang.String resourceLink) {
    this.resourceLink = resourceLink;
    return this;
  }

  @Override
  public GkeCluster set(String fieldName, Object value) {
    return (GkeCluster) super.set(fieldName, value);
  }

  @Override
  public GkeCluster clone() {
    return (GkeCluster) super.clone();
  }

}

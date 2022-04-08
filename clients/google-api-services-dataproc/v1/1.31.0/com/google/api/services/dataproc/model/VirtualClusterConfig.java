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

package com.google.api.services.dataproc.model;

/**
 * Dataproc cluster config for a cluster that does not directly control the underlying compute
 * resources, such as a Dataproc-on-GKE cluster
 * (https://cloud.google.com/dataproc/docs/concepts/jobs/dataproc-gke#create-a-dataproc-on-gke-
 * cluster).
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class VirtualClusterConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Configuration of auxiliary services used by this cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AuxiliaryServicesConfig auxiliaryServicesConfig;

  /**
   * Required. The configuration for running the Dataproc cluster on Kubernetes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private KubernetesClusterConfig kubernetesClusterConfig;

  /**
   * Optional. A Storage bucket used to stage job dependencies, config files, and job driver console
   * output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage
   * location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine
   * zone where your cluster is deployed, and then create and manage this project-level, per-
   * location bucket (see Dataproc staging and temp buckets
   * (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This
   * field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stagingBucket;

  /**
   * Optional. Configuration of auxiliary services used by this cluster.
   * @return value or {@code null} for none
   */
  public AuxiliaryServicesConfig getAuxiliaryServicesConfig() {
    return auxiliaryServicesConfig;
  }

  /**
   * Optional. Configuration of auxiliary services used by this cluster.
   * @param auxiliaryServicesConfig auxiliaryServicesConfig or {@code null} for none
   */
  public VirtualClusterConfig setAuxiliaryServicesConfig(AuxiliaryServicesConfig auxiliaryServicesConfig) {
    this.auxiliaryServicesConfig = auxiliaryServicesConfig;
    return this;
  }

  /**
   * Required. The configuration for running the Dataproc cluster on Kubernetes.
   * @return value or {@code null} for none
   */
  public KubernetesClusterConfig getKubernetesClusterConfig() {
    return kubernetesClusterConfig;
  }

  /**
   * Required. The configuration for running the Dataproc cluster on Kubernetes.
   * @param kubernetesClusterConfig kubernetesClusterConfig or {@code null} for none
   */
  public VirtualClusterConfig setKubernetesClusterConfig(KubernetesClusterConfig kubernetesClusterConfig) {
    this.kubernetesClusterConfig = kubernetesClusterConfig;
    return this;
  }

  /**
   * Optional. A Storage bucket used to stage job dependencies, config files, and job driver console
   * output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage
   * location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine
   * zone where your cluster is deployed, and then create and manage this project-level, per-
   * location bucket (see Dataproc staging and temp buckets
   * (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This
   * field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
   * @return value or {@code null} for none
   */
  public java.lang.String getStagingBucket() {
    return stagingBucket;
  }

  /**
   * Optional. A Storage bucket used to stage job dependencies, config files, and job driver console
   * output. If you do not specify a staging bucket, Cloud Dataproc will determine a Cloud Storage
   * location (US, ASIA, or EU) for your cluster's staging bucket according to the Compute Engine
   * zone where your cluster is deployed, and then create and manage this project-level, per-
   * location bucket (see Dataproc staging and temp buckets
   * (https://cloud.google.com/dataproc/docs/concepts/configuring-clusters/staging-bucket)). This
   * field requires a Cloud Storage bucket name, not a gs://... URI to a Cloud Storage bucket.
   * @param stagingBucket stagingBucket or {@code null} for none
   */
  public VirtualClusterConfig setStagingBucket(java.lang.String stagingBucket) {
    this.stagingBucket = stagingBucket;
    return this;
  }

  @Override
  public VirtualClusterConfig set(String fieldName, Object value) {
    return (VirtualClusterConfig) super.set(fieldName, value);
  }

  @Override
  public VirtualClusterConfig clone() {
    return (VirtualClusterConfig) super.clone();
  }

}

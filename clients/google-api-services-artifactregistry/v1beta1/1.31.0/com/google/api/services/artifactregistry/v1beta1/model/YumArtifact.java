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

package com.google.api.services.artifactregistry.v1beta1.model;

/**
 * A detailed representation of a Yum artifact.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Artifact Registry API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class YumArtifact extends com.google.api.client.json.GenericJson {

  /**
   * Output only. Operating system architecture of the artifact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String architecture;

  /**
   * Output only. The Artifact Registry resource name of the artifact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Output only. The yum package name of the artifact.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageName;

  /**
   * Output only. An artifact is a binary or source package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageType;

  /**
   * Output only. Operating system architecture of the artifact.
   * @return value or {@code null} for none
   */
  public java.lang.String getArchitecture() {
    return architecture;
  }

  /**
   * Output only. Operating system architecture of the artifact.
   * @param architecture architecture or {@code null} for none
   */
  public YumArtifact setArchitecture(java.lang.String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * Output only. The Artifact Registry resource name of the artifact.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * Output only. The Artifact Registry resource name of the artifact.
   * @param name name or {@code null} for none
   */
  public YumArtifact setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Output only. The yum package name of the artifact.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageName() {
    return packageName;
  }

  /**
   * Output only. The yum package name of the artifact.
   * @param packageName packageName or {@code null} for none
   */
  public YumArtifact setPackageName(java.lang.String packageName) {
    this.packageName = packageName;
    return this;
  }

  /**
   * Output only. An artifact is a binary or source package.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageType() {
    return packageType;
  }

  /**
   * Output only. An artifact is a binary or source package.
   * @param packageType packageType or {@code null} for none
   */
  public YumArtifact setPackageType(java.lang.String packageType) {
    this.packageType = packageType;
    return this;
  }

  @Override
  public YumArtifact set(String fieldName, Object value) {
    return (YumArtifact) super.set(fieldName, value);
  }

  @Override
  public YumArtifact clone() {
    return (YumArtifact) super.clone();
  }

}

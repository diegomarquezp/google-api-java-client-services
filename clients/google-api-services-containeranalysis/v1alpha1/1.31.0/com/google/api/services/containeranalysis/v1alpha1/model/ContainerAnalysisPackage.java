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

package com.google.api.services.containeranalysis.v1alpha1.model;

/**
 * This represents a particular package that is distributed over various channels. e.g. glibc (aka
 * libc6) is distributed by many, at various versions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Container Analysis API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ContainerAnalysisPackage extends com.google.api.client.json.GenericJson {

  /**
   * The CPU architecture for which packages in this distribution channel were built. Architecture
   * will be blank for language packages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String architecture;

  /**
   * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager
   * version distributing a package. The cpe_uri will be blank for language packages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpeUri;

  /**
   * The description of this package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Hash value, typically a file digest, that allows unique identification a specific package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Digest> digest;

  static {
    // hack to force ProGuard to consider Digest used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Digest.class);
  }

  /**
   * The various channels by which a package is distributed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<Distribution> distribution;

  static {
    // hack to force ProGuard to consider Distribution used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(Distribution.class);
  }

  /**
   * Licenses that have been declared by the authors of the package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private License license;

  /**
   * A freeform text denoting the maintainer of this package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String maintainer;

  /**
   * The name of the package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageType;

  /**
   * The homepage for this package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String url;

  /**
   * The version of the package.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Version version;

  /**
   * The CPU architecture for which packages in this distribution channel were built. Architecture
   * will be blank for language packages.
   * @return value or {@code null} for none
   */
  public java.lang.String getArchitecture() {
    return architecture;
  }

  /**
   * The CPU architecture for which packages in this distribution channel were built. Architecture
   * will be blank for language packages.
   * @param architecture architecture or {@code null} for none
   */
  public ContainerAnalysisPackage setArchitecture(java.lang.String architecture) {
    this.architecture = architecture;
    return this;
  }

  /**
   * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager
   * version distributing a package. The cpe_uri will be blank for language packages.
   * @return value or {@code null} for none
   */
  public java.lang.String getCpeUri() {
    return cpeUri;
  }

  /**
   * The cpe_uri in [CPE format](https://cpe.mitre.org/specification/) denoting the package manager
   * version distributing a package. The cpe_uri will be blank for language packages.
   * @param cpeUri cpeUri or {@code null} for none
   */
  public ContainerAnalysisPackage setCpeUri(java.lang.String cpeUri) {
    this.cpeUri = cpeUri;
    return this;
  }

  /**
   * The description of this package.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * The description of this package.
   * @param description description or {@code null} for none
   */
  public ContainerAnalysisPackage setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Hash value, typically a file digest, that allows unique identification a specific package.
   * @return value or {@code null} for none
   */
  public java.util.List<Digest> getDigest() {
    return digest;
  }

  /**
   * Hash value, typically a file digest, that allows unique identification a specific package.
   * @param digest digest or {@code null} for none
   */
  public ContainerAnalysisPackage setDigest(java.util.List<Digest> digest) {
    this.digest = digest;
    return this;
  }

  /**
   * The various channels by which a package is distributed.
   * @return value or {@code null} for none
   */
  public java.util.List<Distribution> getDistribution() {
    return distribution;
  }

  /**
   * The various channels by which a package is distributed.
   * @param distribution distribution or {@code null} for none
   */
  public ContainerAnalysisPackage setDistribution(java.util.List<Distribution> distribution) {
    this.distribution = distribution;
    return this;
  }

  /**
   * Licenses that have been declared by the authors of the package.
   * @return value or {@code null} for none
   */
  public License getLicense() {
    return license;
  }

  /**
   * Licenses that have been declared by the authors of the package.
   * @param license license or {@code null} for none
   */
  public ContainerAnalysisPackage setLicense(License license) {
    this.license = license;
    return this;
  }

  /**
   * A freeform text denoting the maintainer of this package.
   * @return value or {@code null} for none
   */
  public java.lang.String getMaintainer() {
    return maintainer;
  }

  /**
   * A freeform text denoting the maintainer of this package.
   * @param maintainer maintainer or {@code null} for none
   */
  public ContainerAnalysisPackage setMaintainer(java.lang.String maintainer) {
    this.maintainer = maintainer;
    return this;
  }

  /**
   * The name of the package.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name of the package.
   * @param name name or {@code null} for none
   */
  public ContainerAnalysisPackage setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageType() {
    return packageType;
  }

  /**
   * The type of package; whether native or non native (e.g., ruby gems, node.js packages, etc.).
   * @param packageType packageType or {@code null} for none
   */
  public ContainerAnalysisPackage setPackageType(java.lang.String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * The homepage for this package.
   * @return value or {@code null} for none
   */
  public java.lang.String getUrl() {
    return url;
  }

  /**
   * The homepage for this package.
   * @param url url or {@code null} for none
   */
  public ContainerAnalysisPackage setUrl(java.lang.String url) {
    this.url = url;
    return this;
  }

  /**
   * The version of the package.
   * @return value or {@code null} for none
   */
  public Version getVersion() {
    return version;
  }

  /**
   * The version of the package.
   * @param version version or {@code null} for none
   */
  public ContainerAnalysisPackage setVersion(Version version) {
    this.version = version;
    return this;
  }

  @Override
  public ContainerAnalysisPackage set(String fieldName, Object value) {
    return (ContainerAnalysisPackage) super.set(fieldName, value);
  }

  @Override
  public ContainerAnalysisPackage clone() {
    return (ContainerAnalysisPackage) super.clone();
  }

}

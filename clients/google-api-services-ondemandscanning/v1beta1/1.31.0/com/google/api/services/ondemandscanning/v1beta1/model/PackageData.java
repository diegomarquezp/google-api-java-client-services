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

package com.google.api.services.ondemandscanning.v1beta1.model;

/**
 * Model definition for PackageData.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the On-Demand Scanning API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class PackageData extends com.google.api.client.json.GenericJson {

  /**
   * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in which the vulnerability
   * may manifest. Examples include distro or storage location for vulnerable jar.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cpeUri;

  /**
   * The path to the jar file / go binary file.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<FileLocation> fileLocation;

  static {
    // hack to force ProGuard to consider FileLocation used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(FileLocation.class);
  }

  /**
   * HashDigest stores the SHA512 hash digest of the jar file if the package is of type Maven. This
   * field will be unset for non Maven packages.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String hashDigest;

  /**
   * The OS affected by a vulnerability This field is deprecated and the information is in cpe_uri
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String os;

  /**
   * The version of the OS This field is deprecated and the information is in cpe_uri
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String osVersion;

  /**
   * The package being analysed for vulnerabilities
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key("package")
  private java.lang.String package__;

  /**
   * The type of package: os, maven, go, etc.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String packageType;

  /**
   * CVEs that this package is no longer vulnerable to go/drydock-dd-custom-binary-scanning
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> patchedCve;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String unused;

  /**
   * The version of the package being analysed
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String version;

  /**
   * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in which the vulnerability
   * may manifest. Examples include distro or storage location for vulnerable jar.
   * @return value or {@code null} for none
   */
  public java.lang.String getCpeUri() {
    return cpeUri;
  }

  /**
   * The cpe_uri in [cpe format] (https://cpe.mitre.org/specification/) in which the vulnerability
   * may manifest. Examples include distro or storage location for vulnerable jar.
   * @param cpeUri cpeUri or {@code null} for none
   */
  public PackageData setCpeUri(java.lang.String cpeUri) {
    this.cpeUri = cpeUri;
    return this;
  }

  /**
   * The path to the jar file / go binary file.
   * @return value or {@code null} for none
   */
  public java.util.List<FileLocation> getFileLocation() {
    return fileLocation;
  }

  /**
   * The path to the jar file / go binary file.
   * @param fileLocation fileLocation or {@code null} for none
   */
  public PackageData setFileLocation(java.util.List<FileLocation> fileLocation) {
    this.fileLocation = fileLocation;
    return this;
  }

  /**
   * HashDigest stores the SHA512 hash digest of the jar file if the package is of type Maven. This
   * field will be unset for non Maven packages.
   * @return value or {@code null} for none
   */
  public java.lang.String getHashDigest() {
    return hashDigest;
  }

  /**
   * HashDigest stores the SHA512 hash digest of the jar file if the package is of type Maven. This
   * field will be unset for non Maven packages.
   * @param hashDigest hashDigest or {@code null} for none
   */
  public PackageData setHashDigest(java.lang.String hashDigest) {
    this.hashDigest = hashDigest;
    return this;
  }

  /**
   * The OS affected by a vulnerability This field is deprecated and the information is in cpe_uri
   * @return value or {@code null} for none
   */
  public java.lang.String getOs() {
    return os;
  }

  /**
   * The OS affected by a vulnerability This field is deprecated and the information is in cpe_uri
   * @param os os or {@code null} for none
   */
  public PackageData setOs(java.lang.String os) {
    this.os = os;
    return this;
  }

  /**
   * The version of the OS This field is deprecated and the information is in cpe_uri
   * @return value or {@code null} for none
   */
  public java.lang.String getOsVersion() {
    return osVersion;
  }

  /**
   * The version of the OS This field is deprecated and the information is in cpe_uri
   * @param osVersion osVersion or {@code null} for none
   */
  public PackageData setOsVersion(java.lang.String osVersion) {
    this.osVersion = osVersion;
    return this;
  }

  /**
   * The package being analysed for vulnerabilities
   * @return value or {@code null} for none
   */
  public java.lang.String getPackage() {
    return package__;
  }

  /**
   * The package being analysed for vulnerabilities
   * @param package__ package__ or {@code null} for none
   */
  public PackageData setPackage(java.lang.String package__) {
    this.package__ = package__;
    return this;
  }

  /**
   * The type of package: os, maven, go, etc.
   * @return value or {@code null} for none
   */
  public java.lang.String getPackageType() {
    return packageType;
  }

  /**
   * The type of package: os, maven, go, etc.
   * @param packageType packageType or {@code null} for none
   */
  public PackageData setPackageType(java.lang.String packageType) {
    this.packageType = packageType;
    return this;
  }

  /**
   * CVEs that this package is no longer vulnerable to go/drydock-dd-custom-binary-scanning
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getPatchedCve() {
    return patchedCve;
  }

  /**
   * CVEs that this package is no longer vulnerable to go/drydock-dd-custom-binary-scanning
   * @param patchedCve patchedCve or {@code null} for none
   */
  public PackageData setPatchedCve(java.util.List<java.lang.String> patchedCve) {
    this.patchedCve = patchedCve;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getUnused() {
    return unused;
  }

  /**
   * @param unused unused or {@code null} for none
   */
  public PackageData setUnused(java.lang.String unused) {
    this.unused = unused;
    return this;
  }

  /**
   * The version of the package being analysed
   * @return value or {@code null} for none
   */
  public java.lang.String getVersion() {
    return version;
  }

  /**
   * The version of the package being analysed
   * @param version version or {@code null} for none
   */
  public PackageData setVersion(java.lang.String version) {
    this.version = version;
    return this;
  }

  @Override
  public PackageData set(String fieldName, Object value) {
    return (PackageData) super.set(fieldName, value);
  }

  @Override
  public PackageData clone() {
    return (PackageData) super.clone();
  }

}

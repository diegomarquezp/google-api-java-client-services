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

package com.google.api.services.baremetalsolution.v1alpha1.model;

/**
 * A NFS export entry.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Bare Metal Solution API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class NfsExport extends com.google.api.client.json.GenericJson {

  /**
   * Allow dev.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowDev;

  /**
   * Allow the setuid flag.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean allowSuid;

  /**
   * A CIDR range.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cidr;

  /**
   * A single machine, identified by an ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String machineId;

  /**
   * Network to use to publish the export.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String networkId;

  /**
   * Disable root squashing.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean noRootSquash;

  /**
   * Export permissions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String permissions;

  /**
   * Allow dev.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowDev() {
    return allowDev;
  }

  /**
   * Allow dev.
   * @param allowDev allowDev or {@code null} for none
   */
  public NfsExport setAllowDev(java.lang.Boolean allowDev) {
    this.allowDev = allowDev;
    return this;
  }

  /**
   * Allow the setuid flag.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getAllowSuid() {
    return allowSuid;
  }

  /**
   * Allow the setuid flag.
   * @param allowSuid allowSuid or {@code null} for none
   */
  public NfsExport setAllowSuid(java.lang.Boolean allowSuid) {
    this.allowSuid = allowSuid;
    return this;
  }

  /**
   * A CIDR range.
   * @return value or {@code null} for none
   */
  public java.lang.String getCidr() {
    return cidr;
  }

  /**
   * A CIDR range.
   * @param cidr cidr or {@code null} for none
   */
  public NfsExport setCidr(java.lang.String cidr) {
    this.cidr = cidr;
    return this;
  }

  /**
   * A single machine, identified by an ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getMachineId() {
    return machineId;
  }

  /**
   * A single machine, identified by an ID.
   * @param machineId machineId or {@code null} for none
   */
  public NfsExport setMachineId(java.lang.String machineId) {
    this.machineId = machineId;
    return this;
  }

  /**
   * Network to use to publish the export.
   * @return value or {@code null} for none
   */
  public java.lang.String getNetworkId() {
    return networkId;
  }

  /**
   * Network to use to publish the export.
   * @param networkId networkId or {@code null} for none
   */
  public NfsExport setNetworkId(java.lang.String networkId) {
    this.networkId = networkId;
    return this;
  }

  /**
   * Disable root squashing.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getNoRootSquash() {
    return noRootSquash;
  }

  /**
   * Disable root squashing.
   * @param noRootSquash noRootSquash or {@code null} for none
   */
  public NfsExport setNoRootSquash(java.lang.Boolean noRootSquash) {
    this.noRootSquash = noRootSquash;
    return this;
  }

  /**
   * Export permissions.
   * @return value or {@code null} for none
   */
  public java.lang.String getPermissions() {
    return permissions;
  }

  /**
   * Export permissions.
   * @param permissions permissions or {@code null} for none
   */
  public NfsExport setPermissions(java.lang.String permissions) {
    this.permissions = permissions;
    return this;
  }

  @Override
  public NfsExport set(String fieldName, Object value) {
    return (NfsExport) super.set(fieldName, value);
  }

  @Override
  public NfsExport clone() {
    return (NfsExport) super.clone();
  }

}

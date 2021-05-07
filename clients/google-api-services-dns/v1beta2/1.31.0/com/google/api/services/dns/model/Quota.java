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

package com.google.api.services.dns.model;

/**
 * Limits associated with a Project.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Quota extends com.google.api.client.json.GenericJson {

  /**
   * Maximum allowed number of DnsKeys per ManagedZone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer dnsKeysPerManagedZone;

  /**
   * Maximum allowed number of GKE clusters to which a privately scoped zone can be attached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer gkeClustersPerManagedZone;

  /**
   * Maximum allowed number of GKE clusters per response policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer gkeClustersPerResponsePolicy;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Maximum allowed number of managed zones in the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer managedZones;

  /**
   * Maximum allowed number of managed zones which can be attached to a GKE cluster.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer managedZonesPerGkeCluster;

  /**
   * Maximum allowed number of managed zones which can be attached to a network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer managedZonesPerNetwork;

  /**
   * Maximum allowed number of networks to which a privately scoped zone can be attached.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer networksPerManagedZone;

  /**
   * Maximum allowed number of networks per policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer networksPerPolicy;

  /**
   * Maximum allowed number of policies per project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer policies;

  /**
   * Maximum allowed number of ResourceRecords per ResourceRecordSet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer resourceRecordsPerRrset;

  /**
   * Maximum allowed number of rules per response policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer responsePolicyRulesPerResponsePolicy;

  /**
   * Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rrsetAdditionsPerChange;

  /**
   * Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rrsetDeletionsPerChange;

  /**
   * Maximum allowed number of ResourceRecordSets per zone in the project.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer rrsetsPerManagedZone;

  /**
   * Maximum allowed number of target name servers per managed forwarding zone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetNameServersPerManagedZone;

  /**
   * Maximum allowed number of alternative target name servers per policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer targetNameServersPerPolicy;

  /**
   * Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer totalRrdataSizePerChange;

  /**
   * DNSSEC algorithm and key length types that can be used for DnsKeys.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DnsKeySpec> whitelistedKeySpecs;

  static {
    // hack to force ProGuard to consider DnsKeySpec used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DnsKeySpec.class);
  }

  /**
   * Maximum allowed number of DnsKeys per ManagedZone.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getDnsKeysPerManagedZone() {
    return dnsKeysPerManagedZone;
  }

  /**
   * Maximum allowed number of DnsKeys per ManagedZone.
   * @param dnsKeysPerManagedZone dnsKeysPerManagedZone or {@code null} for none
   */
  public Quota setDnsKeysPerManagedZone(java.lang.Integer dnsKeysPerManagedZone) {
    this.dnsKeysPerManagedZone = dnsKeysPerManagedZone;
    return this;
  }

  /**
   * Maximum allowed number of GKE clusters to which a privately scoped zone can be attached.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGkeClustersPerManagedZone() {
    return gkeClustersPerManagedZone;
  }

  /**
   * Maximum allowed number of GKE clusters to which a privately scoped zone can be attached.
   * @param gkeClustersPerManagedZone gkeClustersPerManagedZone or {@code null} for none
   */
  public Quota setGkeClustersPerManagedZone(java.lang.Integer gkeClustersPerManagedZone) {
    this.gkeClustersPerManagedZone = gkeClustersPerManagedZone;
    return this;
  }

  /**
   * Maximum allowed number of GKE clusters per response policy.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getGkeClustersPerResponsePolicy() {
    return gkeClustersPerResponsePolicy;
  }

  /**
   * Maximum allowed number of GKE clusters per response policy.
   * @param gkeClustersPerResponsePolicy gkeClustersPerResponsePolicy or {@code null} for none
   */
  public Quota setGkeClustersPerResponsePolicy(java.lang.Integer gkeClustersPerResponsePolicy) {
    this.gkeClustersPerResponsePolicy = gkeClustersPerResponsePolicy;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * @param kind kind or {@code null} for none
   */
  public Quota setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Maximum allowed number of managed zones in the project.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getManagedZones() {
    return managedZones;
  }

  /**
   * Maximum allowed number of managed zones in the project.
   * @param managedZones managedZones or {@code null} for none
   */
  public Quota setManagedZones(java.lang.Integer managedZones) {
    this.managedZones = managedZones;
    return this;
  }

  /**
   * Maximum allowed number of managed zones which can be attached to a GKE cluster.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getManagedZonesPerGkeCluster() {
    return managedZonesPerGkeCluster;
  }

  /**
   * Maximum allowed number of managed zones which can be attached to a GKE cluster.
   * @param managedZonesPerGkeCluster managedZonesPerGkeCluster or {@code null} for none
   */
  public Quota setManagedZonesPerGkeCluster(java.lang.Integer managedZonesPerGkeCluster) {
    this.managedZonesPerGkeCluster = managedZonesPerGkeCluster;
    return this;
  }

  /**
   * Maximum allowed number of managed zones which can be attached to a network.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getManagedZonesPerNetwork() {
    return managedZonesPerNetwork;
  }

  /**
   * Maximum allowed number of managed zones which can be attached to a network.
   * @param managedZonesPerNetwork managedZonesPerNetwork or {@code null} for none
   */
  public Quota setManagedZonesPerNetwork(java.lang.Integer managedZonesPerNetwork) {
    this.managedZonesPerNetwork = managedZonesPerNetwork;
    return this;
  }

  /**
   * Maximum allowed number of networks to which a privately scoped zone can be attached.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNetworksPerManagedZone() {
    return networksPerManagedZone;
  }

  /**
   * Maximum allowed number of networks to which a privately scoped zone can be attached.
   * @param networksPerManagedZone networksPerManagedZone or {@code null} for none
   */
  public Quota setNetworksPerManagedZone(java.lang.Integer networksPerManagedZone) {
    this.networksPerManagedZone = networksPerManagedZone;
    return this;
  }

  /**
   * Maximum allowed number of networks per policy.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getNetworksPerPolicy() {
    return networksPerPolicy;
  }

  /**
   * Maximum allowed number of networks per policy.
   * @param networksPerPolicy networksPerPolicy or {@code null} for none
   */
  public Quota setNetworksPerPolicy(java.lang.Integer networksPerPolicy) {
    this.networksPerPolicy = networksPerPolicy;
    return this;
  }

  /**
   * Maximum allowed number of policies per project.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPolicies() {
    return policies;
  }

  /**
   * Maximum allowed number of policies per project.
   * @param policies policies or {@code null} for none
   */
  public Quota setPolicies(java.lang.Integer policies) {
    this.policies = policies;
    return this;
  }

  /**
   * Maximum allowed number of ResourceRecords per ResourceRecordSet.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getResourceRecordsPerRrset() {
    return resourceRecordsPerRrset;
  }

  /**
   * Maximum allowed number of ResourceRecords per ResourceRecordSet.
   * @param resourceRecordsPerRrset resourceRecordsPerRrset or {@code null} for none
   */
  public Quota setResourceRecordsPerRrset(java.lang.Integer resourceRecordsPerRrset) {
    this.resourceRecordsPerRrset = resourceRecordsPerRrset;
    return this;
  }

  /**
   * Maximum allowed number of rules per response policy.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getResponsePolicyRulesPerResponsePolicy() {
    return responsePolicyRulesPerResponsePolicy;
  }

  /**
   * Maximum allowed number of rules per response policy.
   * @param responsePolicyRulesPerResponsePolicy responsePolicyRulesPerResponsePolicy or {@code null} for none
   */
  public Quota setResponsePolicyRulesPerResponsePolicy(java.lang.Integer responsePolicyRulesPerResponsePolicy) {
    this.responsePolicyRulesPerResponsePolicy = responsePolicyRulesPerResponsePolicy;
    return this;
  }

  /**
   * Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRrsetAdditionsPerChange() {
    return rrsetAdditionsPerChange;
  }

  /**
   * Maximum allowed number of ResourceRecordSets to add per ChangesCreateRequest.
   * @param rrsetAdditionsPerChange rrsetAdditionsPerChange or {@code null} for none
   */
  public Quota setRrsetAdditionsPerChange(java.lang.Integer rrsetAdditionsPerChange) {
    this.rrsetAdditionsPerChange = rrsetAdditionsPerChange;
    return this;
  }

  /**
   * Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRrsetDeletionsPerChange() {
    return rrsetDeletionsPerChange;
  }

  /**
   * Maximum allowed number of ResourceRecordSets to delete per ChangesCreateRequest.
   * @param rrsetDeletionsPerChange rrsetDeletionsPerChange or {@code null} for none
   */
  public Quota setRrsetDeletionsPerChange(java.lang.Integer rrsetDeletionsPerChange) {
    this.rrsetDeletionsPerChange = rrsetDeletionsPerChange;
    return this;
  }

  /**
   * Maximum allowed number of ResourceRecordSets per zone in the project.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getRrsetsPerManagedZone() {
    return rrsetsPerManagedZone;
  }

  /**
   * Maximum allowed number of ResourceRecordSets per zone in the project.
   * @param rrsetsPerManagedZone rrsetsPerManagedZone or {@code null} for none
   */
  public Quota setRrsetsPerManagedZone(java.lang.Integer rrsetsPerManagedZone) {
    this.rrsetsPerManagedZone = rrsetsPerManagedZone;
    return this;
  }

  /**
   * Maximum allowed number of target name servers per managed forwarding zone.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetNameServersPerManagedZone() {
    return targetNameServersPerManagedZone;
  }

  /**
   * Maximum allowed number of target name servers per managed forwarding zone.
   * @param targetNameServersPerManagedZone targetNameServersPerManagedZone or {@code null} for none
   */
  public Quota setTargetNameServersPerManagedZone(java.lang.Integer targetNameServersPerManagedZone) {
    this.targetNameServersPerManagedZone = targetNameServersPerManagedZone;
    return this;
  }

  /**
   * Maximum allowed number of alternative target name servers per policy.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTargetNameServersPerPolicy() {
    return targetNameServersPerPolicy;
  }

  /**
   * Maximum allowed number of alternative target name servers per policy.
   * @param targetNameServersPerPolicy targetNameServersPerPolicy or {@code null} for none
   */
  public Quota setTargetNameServersPerPolicy(java.lang.Integer targetNameServersPerPolicy) {
    this.targetNameServersPerPolicy = targetNameServersPerPolicy;
    return this;
  }

  /**
   * Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTotalRrdataSizePerChange() {
    return totalRrdataSizePerChange;
  }

  /**
   * Maximum allowed size for total rrdata in one ChangesCreateRequest in bytes.
   * @param totalRrdataSizePerChange totalRrdataSizePerChange or {@code null} for none
   */
  public Quota setTotalRrdataSizePerChange(java.lang.Integer totalRrdataSizePerChange) {
    this.totalRrdataSizePerChange = totalRrdataSizePerChange;
    return this;
  }

  /**
   * DNSSEC algorithm and key length types that can be used for DnsKeys.
   * @return value or {@code null} for none
   */
  public java.util.List<DnsKeySpec> getWhitelistedKeySpecs() {
    return whitelistedKeySpecs;
  }

  /**
   * DNSSEC algorithm and key length types that can be used for DnsKeys.
   * @param whitelistedKeySpecs whitelistedKeySpecs or {@code null} for none
   */
  public Quota setWhitelistedKeySpecs(java.util.List<DnsKeySpec> whitelistedKeySpecs) {
    this.whitelistedKeySpecs = whitelistedKeySpecs;
    return this;
  }

  @Override
  public Quota set(String fieldName, Object value) {
    return (Quota) super.set(fieldName, value);
  }

  @Override
  public Quota clone() {
    return (Quota) super.clone();
  }

}

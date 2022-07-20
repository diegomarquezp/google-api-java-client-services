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

package com.google.api.services.compute.model;

/**
 * Model definition for InterconnectRemoteLocationConstraints.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Compute Engine API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class InterconnectRemoteLocationConstraints extends com.google.api.client.json.GenericJson {

  /**
   * [Output Only] Port pair remote location constraints, which can take one of the following
   * values: PORT_PAIR_UNCONSTRAINED_REMOTE_LOCATION, PORT_PAIR_MATCHING_REMOTE_LOCATION. GCP's API
   * refers only to individual ports, but the UI uses this field when ordering a pair of ports, to
   * prevent users from accidentally ordering something that is incompatible with their cloud
   * provider. Specifically, when ordering a redundant pair of Cross-Cloud Interconnect ports, and
   * one of them uses a remote location with portPairMatchingRemoteLocation set to matching, the UI
   * will require that both ports use the same remote location.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String portPairRemoteLocation;

  /**
   * [Output Only] Port pair VLAN constraints, which can take one of the following values:
   * PORT_PAIR_UNCONSTRAINED_VLAN, PORT_PAIR_MATCHING_VLAN
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String portPairVlan;

  /**
   * [Output Only] [min-length, max-length] The minimum and maximum value (inclusive) for the IPv4
   * subnet length. For example, an interconnectRemoteLocation for Azure has {min: 30, max: 30}
   * because Azure requires /30 subnets. This range specifies the values supported by both cloud
   * providers. Interconnect currently supports /29 and /30 IPv4 subnet lengths. If a remote cloud
   * has no constraint on IPv4 subnet length, the range would thus be {min: 29, max: 30}.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InterconnectRemoteLocationConstraintsSubnetLengthRange subnetLengthRange;

  /**
   * [Output Only] Port pair remote location constraints, which can take one of the following
   * values: PORT_PAIR_UNCONSTRAINED_REMOTE_LOCATION, PORT_PAIR_MATCHING_REMOTE_LOCATION. GCP's API
   * refers only to individual ports, but the UI uses this field when ordering a pair of ports, to
   * prevent users from accidentally ordering something that is incompatible with their cloud
   * provider. Specifically, when ordering a redundant pair of Cross-Cloud Interconnect ports, and
   * one of them uses a remote location with portPairMatchingRemoteLocation set to matching, the UI
   * will require that both ports use the same remote location.
   * @return value or {@code null} for none
   */
  public java.lang.String getPortPairRemoteLocation() {
    return portPairRemoteLocation;
  }

  /**
   * [Output Only] Port pair remote location constraints, which can take one of the following
   * values: PORT_PAIR_UNCONSTRAINED_REMOTE_LOCATION, PORT_PAIR_MATCHING_REMOTE_LOCATION. GCP's API
   * refers only to individual ports, but the UI uses this field when ordering a pair of ports, to
   * prevent users from accidentally ordering something that is incompatible with their cloud
   * provider. Specifically, when ordering a redundant pair of Cross-Cloud Interconnect ports, and
   * one of them uses a remote location with portPairMatchingRemoteLocation set to matching, the UI
   * will require that both ports use the same remote location.
   * @param portPairRemoteLocation portPairRemoteLocation or {@code null} for none
   */
  public InterconnectRemoteLocationConstraints setPortPairRemoteLocation(java.lang.String portPairRemoteLocation) {
    this.portPairRemoteLocation = portPairRemoteLocation;
    return this;
  }

  /**
   * [Output Only] Port pair VLAN constraints, which can take one of the following values:
   * PORT_PAIR_UNCONSTRAINED_VLAN, PORT_PAIR_MATCHING_VLAN
   * @return value or {@code null} for none
   */
  public java.lang.String getPortPairVlan() {
    return portPairVlan;
  }

  /**
   * [Output Only] Port pair VLAN constraints, which can take one of the following values:
   * PORT_PAIR_UNCONSTRAINED_VLAN, PORT_PAIR_MATCHING_VLAN
   * @param portPairVlan portPairVlan or {@code null} for none
   */
  public InterconnectRemoteLocationConstraints setPortPairVlan(java.lang.String portPairVlan) {
    this.portPairVlan = portPairVlan;
    return this;
  }

  /**
   * [Output Only] [min-length, max-length] The minimum and maximum value (inclusive) for the IPv4
   * subnet length. For example, an interconnectRemoteLocation for Azure has {min: 30, max: 30}
   * because Azure requires /30 subnets. This range specifies the values supported by both cloud
   * providers. Interconnect currently supports /29 and /30 IPv4 subnet lengths. If a remote cloud
   * has no constraint on IPv4 subnet length, the range would thus be {min: 29, max: 30}.
   * @return value or {@code null} for none
   */
  public InterconnectRemoteLocationConstraintsSubnetLengthRange getSubnetLengthRange() {
    return subnetLengthRange;
  }

  /**
   * [Output Only] [min-length, max-length] The minimum and maximum value (inclusive) for the IPv4
   * subnet length. For example, an interconnectRemoteLocation for Azure has {min: 30, max: 30}
   * because Azure requires /30 subnets. This range specifies the values supported by both cloud
   * providers. Interconnect currently supports /29 and /30 IPv4 subnet lengths. If a remote cloud
   * has no constraint on IPv4 subnet length, the range would thus be {min: 29, max: 30}.
   * @param subnetLengthRange subnetLengthRange or {@code null} for none
   */
  public InterconnectRemoteLocationConstraints setSubnetLengthRange(InterconnectRemoteLocationConstraintsSubnetLengthRange subnetLengthRange) {
    this.subnetLengthRange = subnetLengthRange;
    return this;
  }

  @Override
  public InterconnectRemoteLocationConstraints set(String fieldName, Object value) {
    return (InterconnectRemoteLocationConstraints) super.set(fieldName, value);
  }

  @Override
  public InterconnectRemoteLocationConstraints clone() {
    return (InterconnectRemoteLocationConstraints) super.clone();
  }

}

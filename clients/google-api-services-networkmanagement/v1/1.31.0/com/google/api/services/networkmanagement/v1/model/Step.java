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

package com.google.api.services.networkmanagement.v1.model;

/**
 * A simulated forwarding path is composed of multiple steps. Each step has a well-defined state and
 * an associated configuration.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Network Management API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Step extends com.google.api.client.json.GenericJson {

  /**
   * Display information of the final state "abort" and reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private AbortInfo abort;

  /**
   * This is a step that leads to the final state Drop.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean causesDrop;

  /**
   * Display information of a Cloud SQL instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private CloudSQLInstanceInfo cloudSqlInstance;

  /**
   * Display information of the final state "deliver" and reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DeliverInfo deliver;

  /**
   * A description of the step. Usually this is a summary of the state.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Display information of the final state "drop" and reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DropInfo drop;

  /**
   * Display information of the source and destination under analysis. The endpoint information in
   * an intermediate state may differ with the initial input, as it might be modified by state like
   * NAT, or Connection Proxy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private EndpointInfo endpoint;

  /**
   * Display information of a Compute Engine firewall rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FirewallInfo firewall;

  /**
   * Display information of the final state "forward" and reason.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ForwardInfo forward;

  /**
   * Display information of a Compute Engine forwarding rule.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ForwardingRuleInfo forwardingRule;

  /**
   * Display information of a Google Kubernetes Engine cluster master.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GKEMasterInfo gkeMaster;

  /**
   * Display information of a Compute Engine instance.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private InstanceInfo instance;

  /**
   * Display information of the load balancers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private LoadBalancerInfo loadBalancer;

  /**
   * Display information of a Google Cloud network.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private NetworkInfo network;

  /**
   * Project ID that contains the configuration this step is validating.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Display information of a Compute Engine route.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RouteInfo route;

  /**
   * Each step is in one of the pre-defined states.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String state;

  /**
   * Display information of a Compute Engine VPN gateway.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VpnGatewayInfo vpnGateway;

  /**
   * Display information of a Compute Engine VPN tunnel.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private VpnTunnelInfo vpnTunnel;

  /**
   * Display information of the final state "abort" and reason.
   * @return value or {@code null} for none
   */
  public AbortInfo getAbort() {
    return abort;
  }

  /**
   * Display information of the final state "abort" and reason.
   * @param abort abort or {@code null} for none
   */
  public Step setAbort(AbortInfo abort) {
    this.abort = abort;
    return this;
  }

  /**
   * This is a step that leads to the final state Drop.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCausesDrop() {
    return causesDrop;
  }

  /**
   * This is a step that leads to the final state Drop.
   * @param causesDrop causesDrop or {@code null} for none
   */
  public Step setCausesDrop(java.lang.Boolean causesDrop) {
    this.causesDrop = causesDrop;
    return this;
  }

  /**
   * Display information of a Cloud SQL instance.
   * @return value or {@code null} for none
   */
  public CloudSQLInstanceInfo getCloudSqlInstance() {
    return cloudSqlInstance;
  }

  /**
   * Display information of a Cloud SQL instance.
   * @param cloudSqlInstance cloudSqlInstance or {@code null} for none
   */
  public Step setCloudSqlInstance(CloudSQLInstanceInfo cloudSqlInstance) {
    this.cloudSqlInstance = cloudSqlInstance;
    return this;
  }

  /**
   * Display information of the final state "deliver" and reason.
   * @return value or {@code null} for none
   */
  public DeliverInfo getDeliver() {
    return deliver;
  }

  /**
   * Display information of the final state "deliver" and reason.
   * @param deliver deliver or {@code null} for none
   */
  public Step setDeliver(DeliverInfo deliver) {
    this.deliver = deliver;
    return this;
  }

  /**
   * A description of the step. Usually this is a summary of the state.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A description of the step. Usually this is a summary of the state.
   * @param description description or {@code null} for none
   */
  public Step setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Display information of the final state "drop" and reason.
   * @return value or {@code null} for none
   */
  public DropInfo getDrop() {
    return drop;
  }

  /**
   * Display information of the final state "drop" and reason.
   * @param drop drop or {@code null} for none
   */
  public Step setDrop(DropInfo drop) {
    this.drop = drop;
    return this;
  }

  /**
   * Display information of the source and destination under analysis. The endpoint information in
   * an intermediate state may differ with the initial input, as it might be modified by state like
   * NAT, or Connection Proxy.
   * @return value or {@code null} for none
   */
  public EndpointInfo getEndpoint() {
    return endpoint;
  }

  /**
   * Display information of the source and destination under analysis. The endpoint information in
   * an intermediate state may differ with the initial input, as it might be modified by state like
   * NAT, or Connection Proxy.
   * @param endpoint endpoint or {@code null} for none
   */
  public Step setEndpoint(EndpointInfo endpoint) {
    this.endpoint = endpoint;
    return this;
  }

  /**
   * Display information of a Compute Engine firewall rule.
   * @return value or {@code null} for none
   */
  public FirewallInfo getFirewall() {
    return firewall;
  }

  /**
   * Display information of a Compute Engine firewall rule.
   * @param firewall firewall or {@code null} for none
   */
  public Step setFirewall(FirewallInfo firewall) {
    this.firewall = firewall;
    return this;
  }

  /**
   * Display information of the final state "forward" and reason.
   * @return value or {@code null} for none
   */
  public ForwardInfo getForward() {
    return forward;
  }

  /**
   * Display information of the final state "forward" and reason.
   * @param forward forward or {@code null} for none
   */
  public Step setForward(ForwardInfo forward) {
    this.forward = forward;
    return this;
  }

  /**
   * Display information of a Compute Engine forwarding rule.
   * @return value or {@code null} for none
   */
  public ForwardingRuleInfo getForwardingRule() {
    return forwardingRule;
  }

  /**
   * Display information of a Compute Engine forwarding rule.
   * @param forwardingRule forwardingRule or {@code null} for none
   */
  public Step setForwardingRule(ForwardingRuleInfo forwardingRule) {
    this.forwardingRule = forwardingRule;
    return this;
  }

  /**
   * Display information of a Google Kubernetes Engine cluster master.
   * @return value or {@code null} for none
   */
  public GKEMasterInfo getGkeMaster() {
    return gkeMaster;
  }

  /**
   * Display information of a Google Kubernetes Engine cluster master.
   * @param gkeMaster gkeMaster or {@code null} for none
   */
  public Step setGkeMaster(GKEMasterInfo gkeMaster) {
    this.gkeMaster = gkeMaster;
    return this;
  }

  /**
   * Display information of a Compute Engine instance.
   * @return value or {@code null} for none
   */
  public InstanceInfo getInstance() {
    return instance;
  }

  /**
   * Display information of a Compute Engine instance.
   * @param instance instance or {@code null} for none
   */
  public Step setInstance(InstanceInfo instance) {
    this.instance = instance;
    return this;
  }

  /**
   * Display information of the load balancers.
   * @return value or {@code null} for none
   */
  public LoadBalancerInfo getLoadBalancer() {
    return loadBalancer;
  }

  /**
   * Display information of the load balancers.
   * @param loadBalancer loadBalancer or {@code null} for none
   */
  public Step setLoadBalancer(LoadBalancerInfo loadBalancer) {
    this.loadBalancer = loadBalancer;
    return this;
  }

  /**
   * Display information of a Google Cloud network.
   * @return value or {@code null} for none
   */
  public NetworkInfo getNetwork() {
    return network;
  }

  /**
   * Display information of a Google Cloud network.
   * @param network network or {@code null} for none
   */
  public Step setNetwork(NetworkInfo network) {
    this.network = network;
    return this;
  }

  /**
   * Project ID that contains the configuration this step is validating.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Project ID that contains the configuration this step is validating.
   * @param projectId projectId or {@code null} for none
   */
  public Step setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Display information of a Compute Engine route.
   * @return value or {@code null} for none
   */
  public RouteInfo getRoute() {
    return route;
  }

  /**
   * Display information of a Compute Engine route.
   * @param route route or {@code null} for none
   */
  public Step setRoute(RouteInfo route) {
    this.route = route;
    return this;
  }

  /**
   * Each step is in one of the pre-defined states.
   * @return value or {@code null} for none
   */
  public java.lang.String getState() {
    return state;
  }

  /**
   * Each step is in one of the pre-defined states.
   * @param state state or {@code null} for none
   */
  public Step setState(java.lang.String state) {
    this.state = state;
    return this;
  }

  /**
   * Display information of a Compute Engine VPN gateway.
   * @return value or {@code null} for none
   */
  public VpnGatewayInfo getVpnGateway() {
    return vpnGateway;
  }

  /**
   * Display information of a Compute Engine VPN gateway.
   * @param vpnGateway vpnGateway or {@code null} for none
   */
  public Step setVpnGateway(VpnGatewayInfo vpnGateway) {
    this.vpnGateway = vpnGateway;
    return this;
  }

  /**
   * Display information of a Compute Engine VPN tunnel.
   * @return value or {@code null} for none
   */
  public VpnTunnelInfo getVpnTunnel() {
    return vpnTunnel;
  }

  /**
   * Display information of a Compute Engine VPN tunnel.
   * @param vpnTunnel vpnTunnel or {@code null} for none
   */
  public Step setVpnTunnel(VpnTunnelInfo vpnTunnel) {
    this.vpnTunnel = vpnTunnel;
    return this;
  }

  @Override
  public Step set(String fieldName, Object value) {
    return (Step) super.set(fieldName, value);
  }

  @Override
  public Step clone() {
    return (Step) super.clone();
  }

}

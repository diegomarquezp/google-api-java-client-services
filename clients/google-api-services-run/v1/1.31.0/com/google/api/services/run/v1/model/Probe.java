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

package com.google.api.services.run.v1.model;

/**
 * Not supported by Cloud Run Probe describes a health check to be performed against a container to
 * determine whether it is alive or ready to receive traffic.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Run Admin API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Probe extends com.google.api.client.json.GenericJson {

  /**
   * (Optional) One and only one of the following should be specified. Exec specifies the action to
   * take. A field inlined from the Handler message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExecAction exec;

  /**
   * (Optional) Minimum consecutive failures for the probe to be considered failed after having
   * succeeded. Defaults to 3. Minimum value is 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer failureThreshold;

  /**
   * (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler
   * message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private HTTPGetAction httpGet;

  /**
   * (Optional) Number of seconds after the container has started before liveness probes are
   * initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle
   * #container-probes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer initialDelaySeconds;

  /**
   * (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is
   * 1. Maximum value is 3600. Must be greater or equal than timeout_seconds.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer periodSeconds;

  /**
   * (Optional) Minimum consecutive successes for the probe to be considered successful after having
   * failed. Defaults to 1. Must be 1 for liveness and startup Probes.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer successThreshold;

  /**
   * (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A
   * field inlined from the Handler message.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TCPSocketAction tcpSocket;

  /**
   * (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum
   * value is 1. Maximum value is 3600. Must be smaller than period_seconds. More info:
   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer timeoutSeconds;

  /**
   * (Optional) One and only one of the following should be specified. Exec specifies the action to
   * take. A field inlined from the Handler message.
   * @return value or {@code null} for none
   */
  public ExecAction getExec() {
    return exec;
  }

  /**
   * (Optional) One and only one of the following should be specified. Exec specifies the action to
   * take. A field inlined from the Handler message.
   * @param exec exec or {@code null} for none
   */
  public Probe setExec(ExecAction exec) {
    this.exec = exec;
    return this;
  }

  /**
   * (Optional) Minimum consecutive failures for the probe to be considered failed after having
   * succeeded. Defaults to 3. Minimum value is 1.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getFailureThreshold() {
    return failureThreshold;
  }

  /**
   * (Optional) Minimum consecutive failures for the probe to be considered failed after having
   * succeeded. Defaults to 3. Minimum value is 1.
   * @param failureThreshold failureThreshold or {@code null} for none
   */
  public Probe setFailureThreshold(java.lang.Integer failureThreshold) {
    this.failureThreshold = failureThreshold;
    return this;
  }

  /**
   * (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler
   * message.
   * @return value or {@code null} for none
   */
  public HTTPGetAction getHttpGet() {
    return httpGet;
  }

  /**
   * (Optional) HTTPGet specifies the http request to perform. A field inlined from the Handler
   * message.
   * @param httpGet httpGet or {@code null} for none
   */
  public Probe setHttpGet(HTTPGetAction httpGet) {
    this.httpGet = httpGet;
    return this;
  }

  /**
   * (Optional) Number of seconds after the container has started before liveness probes are
   * initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle
   * #container-probes
   * @return value or {@code null} for none
   */
  public java.lang.Integer getInitialDelaySeconds() {
    return initialDelaySeconds;
  }

  /**
   * (Optional) Number of seconds after the container has started before liveness probes are
   * initiated. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle
   * #container-probes
   * @param initialDelaySeconds initialDelaySeconds or {@code null} for none
   */
  public Probe setInitialDelaySeconds(java.lang.Integer initialDelaySeconds) {
    this.initialDelaySeconds = initialDelaySeconds;
    return this;
  }

  /**
   * (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is
   * 1. Maximum value is 3600. Must be greater or equal than timeout_seconds.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getPeriodSeconds() {
    return periodSeconds;
  }

  /**
   * (Optional) How often (in seconds) to perform the probe. Default to 10 seconds. Minimum value is
   * 1. Maximum value is 3600. Must be greater or equal than timeout_seconds.
   * @param periodSeconds periodSeconds or {@code null} for none
   */
  public Probe setPeriodSeconds(java.lang.Integer periodSeconds) {
    this.periodSeconds = periodSeconds;
    return this;
  }

  /**
   * (Optional) Minimum consecutive successes for the probe to be considered successful after having
   * failed. Defaults to 1. Must be 1 for liveness and startup Probes.
   * @return value or {@code null} for none
   */
  public java.lang.Integer getSuccessThreshold() {
    return successThreshold;
  }

  /**
   * (Optional) Minimum consecutive successes for the probe to be considered successful after having
   * failed. Defaults to 1. Must be 1 for liveness and startup Probes.
   * @param successThreshold successThreshold or {@code null} for none
   */
  public Probe setSuccessThreshold(java.lang.Integer successThreshold) {
    this.successThreshold = successThreshold;
    return this;
  }

  /**
   * (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A
   * field inlined from the Handler message.
   * @return value or {@code null} for none
   */
  public TCPSocketAction getTcpSocket() {
    return tcpSocket;
  }

  /**
   * (Optional) TCPSocket specifies an action involving a TCP port. TCP hooks not yet supported A
   * field inlined from the Handler message.
   * @param tcpSocket tcpSocket or {@code null} for none
   */
  public Probe setTcpSocket(TCPSocketAction tcpSocket) {
    this.tcpSocket = tcpSocket;
    return this;
  }

  /**
   * (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum
   * value is 1. Maximum value is 3600. Must be smaller than period_seconds. More info:
   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @return value or {@code null} for none
   */
  public java.lang.Integer getTimeoutSeconds() {
    return timeoutSeconds;
  }

  /**
   * (Optional) Number of seconds after which the probe times out. Defaults to 1 second. Minimum
   * value is 1. Maximum value is 3600. Must be smaller than period_seconds. More info:
   * https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#container-probes
   * @param timeoutSeconds timeoutSeconds or {@code null} for none
   */
  public Probe setTimeoutSeconds(java.lang.Integer timeoutSeconds) {
    this.timeoutSeconds = timeoutSeconds;
    return this;
  }

  @Override
  public Probe set(String fieldName, Object value) {
    return (Probe) super.set(fieldName, value);
  }

  @Override
  public Probe clone() {
    return (Probe) super.clone();
  }

}

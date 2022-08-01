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

package com.google.api.services.composer.v1.model;

/**
 * The Kubernetes workloads configuration for GKE cluster associated with the Cloud Composer
 * environment. Supported for Cloud Composer environments in versions composer-2.*.*-airflow-*.*.*
 * and newer.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Composer API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class WorkloadsConfig extends com.google.api.client.json.GenericJson {

  /**
   * Optional. Resources used by Airflow schedulers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private SchedulerResource scheduler;

  /**
   * Optional. Resources used by Airflow web server.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WebServerResource webServer;

  /**
   * Optional. Resources used by Airflow workers.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private WorkerResource worker;

  /**
   * Optional. Resources used by Airflow schedulers.
   * @return value or {@code null} for none
   */
  public SchedulerResource getScheduler() {
    return scheduler;
  }

  /**
   * Optional. Resources used by Airflow schedulers.
   * @param scheduler scheduler or {@code null} for none
   */
  public WorkloadsConfig setScheduler(SchedulerResource scheduler) {
    this.scheduler = scheduler;
    return this;
  }

  /**
   * Optional. Resources used by Airflow web server.
   * @return value or {@code null} for none
   */
  public WebServerResource getWebServer() {
    return webServer;
  }

  /**
   * Optional. Resources used by Airflow web server.
   * @param webServer webServer or {@code null} for none
   */
  public WorkloadsConfig setWebServer(WebServerResource webServer) {
    this.webServer = webServer;
    return this;
  }

  /**
   * Optional. Resources used by Airflow workers.
   * @return value or {@code null} for none
   */
  public WorkerResource getWorker() {
    return worker;
  }

  /**
   * Optional. Resources used by Airflow workers.
   * @param worker worker or {@code null} for none
   */
  public WorkloadsConfig setWorker(WorkerResource worker) {
    this.worker = worker;
    return this;
  }

  @Override
  public WorkloadsConfig set(String fieldName, Object value) {
    return (WorkloadsConfig) super.set(fieldName, value);
  }

  @Override
  public WorkloadsConfig clone() {
    return (WorkloadsConfig) super.clone();
  }

}

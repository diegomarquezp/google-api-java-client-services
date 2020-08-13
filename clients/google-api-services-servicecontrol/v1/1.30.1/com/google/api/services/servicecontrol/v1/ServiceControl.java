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

package com.google.api.services.servicecontrol.v1;

/**
 * Service definition for ServiceControl (v1).
 *
 * <p>
 * Provides control plane functionality to managed services, such as logging, monitoring, and status checks.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/service-control/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link ServiceControlRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class ServiceControl extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 15,
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.15 of google-api-client to run version " +
        "1.30.10 of the Service Control API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://servicecontrol.googleapis.com/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "";

  /**
   * The default encoded batch path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.23
   */
  public static final String DEFAULT_BATCH_PATH = "batch";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Constructor.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport HTTP transport, which should normally be:
   *        <ul>
   *        <li>Google App Engine:
   *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
   *        <li>Android: {@code newCompatibleTransport} from
   *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
   *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
   *        </li>
   *        </ul>
   * @param jsonFactory JSON factory, which may be:
   *        <ul>
   *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
   *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
   *        <li>Android Honeycomb or higher:
   *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
   *        </ul>
   * @param httpRequestInitializer HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public ServiceControl(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  ServiceControl(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Services collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code ServiceControl servicecontrol = new ServiceControl(...);}
   *   {@code ServiceControl.Services.List request = servicecontrol.services().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Services services() {
    return new Services();
  }

  /**
   * The "services" collection of methods.
   */
  public class Services {

    /**
     * Attempts to allocate quota for the specified consumer. It should be called before the operation
     * is executed. This method requires the `servicemanagement.services.quota` permission on the
     * specified service. For more information, see [Cloud IAM](https://cloud.google.com/iam). **NOTE:**
     * The client **must** fail-open on server errors `INTERNAL`, `UNKNOWN`, `DEADLINE_EXCEEDED`, and
     * `UNAVAILABLE`. To ensure system reliability, the server may inject these errors to prohibit any
     * hard dependency on the quota functionality.
     *
     * Create a request for the method "services.allocateQuota".
     *
     * This request holds the parameters needed by the servicecontrol server.  After setting any
     * optional parameters, call the {@link AllocateQuota#execute()} method to invoke the remote
     * operation.
     *
     * @param serviceName Name of the service as specified in the service configuration. For example,
     *        `"pubsub.googleapis.com"`. See google.api.Service for the definition of a service name.
     * @param content the {@link com.google.api.services.servicecontrol.v1.model.AllocateQuotaRequest}
     * @return the request
     */
    public AllocateQuota allocateQuota(java.lang.String serviceName, com.google.api.services.servicecontrol.v1.model.AllocateQuotaRequest content) throws java.io.IOException {
      AllocateQuota result = new AllocateQuota(serviceName, content);
      initialize(result);
      return result;
    }

    public class AllocateQuota extends ServiceControlRequest<com.google.api.services.servicecontrol.v1.model.AllocateQuotaResponse> {

      private static final String REST_PATH = "v1/services/{serviceName}:allocateQuota";

      /**
       * Attempts to allocate quota for the specified consumer. It should be called before the operation
       * is executed. This method requires the `servicemanagement.services.quota` permission on the
       * specified service. For more information, see [Cloud IAM](https://cloud.google.com/iam).
       * **NOTE:** The client **must** fail-open on server errors `INTERNAL`, `UNKNOWN`,
       * `DEADLINE_EXCEEDED`, and `UNAVAILABLE`. To ensure system reliability, the server may inject
       * these errors to prohibit any hard dependency on the quota functionality.
       *
       * Create a request for the method "services.allocateQuota".
       *
       * This request holds the parameters needed by the the servicecontrol server.  After setting any
       * optional parameters, call the {@link AllocateQuota#execute()} method to invoke the remote
       * operation. <p> {@link AllocateQuota#initialize(com.google.api.client.googleapis.services.Abstra
       * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
       * the constructor. </p>
       *
       * @param serviceName Name of the service as specified in the service configuration. For example,
     *        `"pubsub.googleapis.com"`. See google.api.Service for the definition of a service name.
       * @param content the {@link com.google.api.services.servicecontrol.v1.model.AllocateQuotaRequest}
       * @since 1.13
       */
      protected AllocateQuota(java.lang.String serviceName, com.google.api.services.servicecontrol.v1.model.AllocateQuotaRequest content) {
        super(ServiceControl.this, "POST", REST_PATH, content, com.google.api.services.servicecontrol.v1.model.AllocateQuotaResponse.class);
        this.serviceName = com.google.api.client.util.Preconditions.checkNotNull(serviceName, "Required parameter serviceName must be specified.");
      }

      @Override
      public AllocateQuota set$Xgafv(java.lang.String $Xgafv) {
        return (AllocateQuota) super.set$Xgafv($Xgafv);
      }

      @Override
      public AllocateQuota setAccessToken(java.lang.String accessToken) {
        return (AllocateQuota) super.setAccessToken(accessToken);
      }

      @Override
      public AllocateQuota setAlt(java.lang.String alt) {
        return (AllocateQuota) super.setAlt(alt);
      }

      @Override
      public AllocateQuota setCallback(java.lang.String callback) {
        return (AllocateQuota) super.setCallback(callback);
      }

      @Override
      public AllocateQuota setFields(java.lang.String fields) {
        return (AllocateQuota) super.setFields(fields);
      }

      @Override
      public AllocateQuota setKey(java.lang.String key) {
        return (AllocateQuota) super.setKey(key);
      }

      @Override
      public AllocateQuota setOauthToken(java.lang.String oauthToken) {
        return (AllocateQuota) super.setOauthToken(oauthToken);
      }

      @Override
      public AllocateQuota setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (AllocateQuota) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public AllocateQuota setQuotaUser(java.lang.String quotaUser) {
        return (AllocateQuota) super.setQuotaUser(quotaUser);
      }

      @Override
      public AllocateQuota setUploadType(java.lang.String uploadType) {
        return (AllocateQuota) super.setUploadType(uploadType);
      }

      @Override
      public AllocateQuota setUploadProtocol(java.lang.String uploadProtocol) {
        return (AllocateQuota) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * Name of the service as specified in the service configuration. For example,
       * `"pubsub.googleapis.com"`. See google.api.Service for the definition of a service name.
       */
      @com.google.api.client.util.Key
      private java.lang.String serviceName;

      /** Name of the service as specified in the service configuration. For example,
     `"pubsub.googleapis.com"`. See google.api.Service for the definition of a service name.
       */
      public java.lang.String getServiceName() {
        return serviceName;
      }

      /**
       * Name of the service as specified in the service configuration. For example,
       * `"pubsub.googleapis.com"`. See google.api.Service for the definition of a service name.
       */
      public AllocateQuota setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
        return this;
      }

      @Override
      public AllocateQuota set(String parameterName, Object value) {
        return (AllocateQuota) super.set(parameterName, value);
      }
    }
    /**
     * Checks whether an operation on a service should be allowed to proceed based on the configuration
     * of the service and related policies. It must be called before the operation is executed. If
     * feasible, the client should cache the check results and reuse them for 60 seconds. In case of any
     * server errors, the client should rely on the cached results for much longer time to avoid outage.
     * WARNING: There is general 60s delay for the configuration and policy propagation, therefore
     * callers MUST NOT depend on the `Check` method having the latest policy information. NOTE: the
     * CheckRequest has the size limit of 64KB. This method requires the
     * `servicemanagement.services.check` permission on the specified service. For more information, see
     * [Cloud IAM](https://cloud.google.com/iam).
     *
     * Create a request for the method "services.check".
     *
     * This request holds the parameters needed by the servicecontrol server.  After setting any
     * optional parameters, call the {@link Check#execute()} method to invoke the remote operation.
     *
     * @param serviceName The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`.
     *        See [google.api.Service](https://cloud.google.com/service-
     *        management/reference/rpc/google.api#google.api.Service) for the definition of a service
     *        name.
     * @param content the {@link com.google.api.services.servicecontrol.v1.model.CheckRequest}
     * @return the request
     */
    public Check check(java.lang.String serviceName, com.google.api.services.servicecontrol.v1.model.CheckRequest content) throws java.io.IOException {
      Check result = new Check(serviceName, content);
      initialize(result);
      return result;
    }

    public class Check extends ServiceControlRequest<com.google.api.services.servicecontrol.v1.model.CheckResponse> {

      private static final String REST_PATH = "v1/services/{serviceName}:check";

      /**
       * Checks whether an operation on a service should be allowed to proceed based on the
       * configuration of the service and related policies. It must be called before the operation is
       * executed. If feasible, the client should cache the check results and reuse them for 60 seconds.
       * In case of any server errors, the client should rely on the cached results for much longer time
       * to avoid outage. WARNING: There is general 60s delay for the configuration and policy
       * propagation, therefore callers MUST NOT depend on the `Check` method having the latest policy
       * information. NOTE: the CheckRequest has the size limit of 64KB. This method requires the
       * `servicemanagement.services.check` permission on the specified service. For more information,
       * see [Cloud IAM](https://cloud.google.com/iam).
       *
       * Create a request for the method "services.check".
       *
       * This request holds the parameters needed by the the servicecontrol server.  After setting any
       * optional parameters, call the {@link Check#execute()} method to invoke the remote operation.
       * <p> {@link
       * Check#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param serviceName The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`.
     *        See [google.api.Service](https://cloud.google.com/service-
     *        management/reference/rpc/google.api#google.api.Service) for the definition of a service
     *        name.
       * @param content the {@link com.google.api.services.servicecontrol.v1.model.CheckRequest}
       * @since 1.13
       */
      protected Check(java.lang.String serviceName, com.google.api.services.servicecontrol.v1.model.CheckRequest content) {
        super(ServiceControl.this, "POST", REST_PATH, content, com.google.api.services.servicecontrol.v1.model.CheckResponse.class);
        this.serviceName = com.google.api.client.util.Preconditions.checkNotNull(serviceName, "Required parameter serviceName must be specified.");
      }

      @Override
      public Check set$Xgafv(java.lang.String $Xgafv) {
        return (Check) super.set$Xgafv($Xgafv);
      }

      @Override
      public Check setAccessToken(java.lang.String accessToken) {
        return (Check) super.setAccessToken(accessToken);
      }

      @Override
      public Check setAlt(java.lang.String alt) {
        return (Check) super.setAlt(alt);
      }

      @Override
      public Check setCallback(java.lang.String callback) {
        return (Check) super.setCallback(callback);
      }

      @Override
      public Check setFields(java.lang.String fields) {
        return (Check) super.setFields(fields);
      }

      @Override
      public Check setKey(java.lang.String key) {
        return (Check) super.setKey(key);
      }

      @Override
      public Check setOauthToken(java.lang.String oauthToken) {
        return (Check) super.setOauthToken(oauthToken);
      }

      @Override
      public Check setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Check) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Check setQuotaUser(java.lang.String quotaUser) {
        return (Check) super.setQuotaUser(quotaUser);
      }

      @Override
      public Check setUploadType(java.lang.String uploadType) {
        return (Check) super.setUploadType(uploadType);
      }

      @Override
      public Check setUploadProtocol(java.lang.String uploadProtocol) {
        return (Check) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * The service name as specified in its service configuration. For example,
       * `"pubsub.googleapis.com"`. See [google.api.Service](https://cloud.google.com/service-
       * management/reference/rpc/google.api#google.api.Service) for the definition of a service
       * name.
       */
      @com.google.api.client.util.Key
      private java.lang.String serviceName;

      /** The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`.
     See [google.api.Service](https://cloud.google.com/service-
     management/reference/rpc/google.api#google.api.Service) for the definition of a service name.
       */
      public java.lang.String getServiceName() {
        return serviceName;
      }

      /**
       * The service name as specified in its service configuration. For example,
       * `"pubsub.googleapis.com"`. See [google.api.Service](https://cloud.google.com/service-
       * management/reference/rpc/google.api#google.api.Service) for the definition of a service
       * name.
       */
      public Check setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
        return this;
      }

      @Override
      public Check set(String parameterName, Object value) {
        return (Check) super.set(parameterName, value);
      }
    }
    /**
     * Reports operation results to Google Service Control, such as logs and metrics. It should be
     * called after an operation is completed. If feasible, the client should aggregate reporting data
     * for up to 5 seconds to reduce API traffic. Limiting aggregation to 5 seconds is to reduce data
     * loss during client crashes. Clients should carefully choose the aggregation time window to avoid
     * data loss risk more than 0.01% for business and compliance reasons. NOTE: the ReportRequest has
     * the size limit (wire-format byte size) of 1MB. This method requires the
     * `servicemanagement.services.report` permission on the specified service. For more information,
     * see [Google Cloud IAM](https://cloud.google.com/iam).
     *
     * Create a request for the method "services.report".
     *
     * This request holds the parameters needed by the servicecontrol server.  After setting any
     * optional parameters, call the {@link Report#execute()} method to invoke the remote operation.
     *
     * @param serviceName The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`.
     *        See [google.api.Service](https://cloud.google.com/service-
     *        management/reference/rpc/google.api#google.api.Service) for the definition of a service
     *        name.
     * @param content the {@link com.google.api.services.servicecontrol.v1.model.ReportRequest}
     * @return the request
     */
    public Report report(java.lang.String serviceName, com.google.api.services.servicecontrol.v1.model.ReportRequest content) throws java.io.IOException {
      Report result = new Report(serviceName, content);
      initialize(result);
      return result;
    }

    public class Report extends ServiceControlRequest<com.google.api.services.servicecontrol.v1.model.ReportResponse> {

      private static final String REST_PATH = "v1/services/{serviceName}:report";

      /**
       * Reports operation results to Google Service Control, such as logs and metrics. It should be
       * called after an operation is completed. If feasible, the client should aggregate reporting data
       * for up to 5 seconds to reduce API traffic. Limiting aggregation to 5 seconds is to reduce data
       * loss during client crashes. Clients should carefully choose the aggregation time window to
       * avoid data loss risk more than 0.01% for business and compliance reasons. NOTE: the
       * ReportRequest has the size limit (wire-format byte size) of 1MB. This method requires the
       * `servicemanagement.services.report` permission on the specified service. For more information,
       * see [Google Cloud IAM](https://cloud.google.com/iam).
       *
       * Create a request for the method "services.report".
       *
       * This request holds the parameters needed by the the servicecontrol server.  After setting any
       * optional parameters, call the {@link Report#execute()} method to invoke the remote operation.
       * <p> {@link
       * Report#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
       * be called to initialize this instance immediately after invoking the constructor. </p>
       *
       * @param serviceName The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`.
     *        See [google.api.Service](https://cloud.google.com/service-
     *        management/reference/rpc/google.api#google.api.Service) for the definition of a service
     *        name.
       * @param content the {@link com.google.api.services.servicecontrol.v1.model.ReportRequest}
       * @since 1.13
       */
      protected Report(java.lang.String serviceName, com.google.api.services.servicecontrol.v1.model.ReportRequest content) {
        super(ServiceControl.this, "POST", REST_PATH, content, com.google.api.services.servicecontrol.v1.model.ReportResponse.class);
        this.serviceName = com.google.api.client.util.Preconditions.checkNotNull(serviceName, "Required parameter serviceName must be specified.");
      }

      @Override
      public Report set$Xgafv(java.lang.String $Xgafv) {
        return (Report) super.set$Xgafv($Xgafv);
      }

      @Override
      public Report setAccessToken(java.lang.String accessToken) {
        return (Report) super.setAccessToken(accessToken);
      }

      @Override
      public Report setAlt(java.lang.String alt) {
        return (Report) super.setAlt(alt);
      }

      @Override
      public Report setCallback(java.lang.String callback) {
        return (Report) super.setCallback(callback);
      }

      @Override
      public Report setFields(java.lang.String fields) {
        return (Report) super.setFields(fields);
      }

      @Override
      public Report setKey(java.lang.String key) {
        return (Report) super.setKey(key);
      }

      @Override
      public Report setOauthToken(java.lang.String oauthToken) {
        return (Report) super.setOauthToken(oauthToken);
      }

      @Override
      public Report setPrettyPrint(java.lang.Boolean prettyPrint) {
        return (Report) super.setPrettyPrint(prettyPrint);
      }

      @Override
      public Report setQuotaUser(java.lang.String quotaUser) {
        return (Report) super.setQuotaUser(quotaUser);
      }

      @Override
      public Report setUploadType(java.lang.String uploadType) {
        return (Report) super.setUploadType(uploadType);
      }

      @Override
      public Report setUploadProtocol(java.lang.String uploadProtocol) {
        return (Report) super.setUploadProtocol(uploadProtocol);
      }

      /**
       * The service name as specified in its service configuration. For example,
       * `"pubsub.googleapis.com"`. See [google.api.Service](https://cloud.google.com/service-
       * management/reference/rpc/google.api#google.api.Service) for the definition of a service
       * name.
       */
      @com.google.api.client.util.Key
      private java.lang.String serviceName;

      /** The service name as specified in its service configuration. For example, `"pubsub.googleapis.com"`.
     See [google.api.Service](https://cloud.google.com/service-
     management/reference/rpc/google.api#google.api.Service) for the definition of a service name.
       */
      public java.lang.String getServiceName() {
        return serviceName;
      }

      /**
       * The service name as specified in its service configuration. For example,
       * `"pubsub.googleapis.com"`. See [google.api.Service](https://cloud.google.com/service-
       * management/reference/rpc/google.api#google.api.Service) for the definition of a service
       * name.
       */
      public Report setServiceName(java.lang.String serviceName) {
        this.serviceName = serviceName;
        return this;
      }

      @Override
      public Report set(String parameterName, Object value) {
        return (Report) super.set(parameterName, value);
      }
    }

  }

  /**
   * Builder for {@link ServiceControl}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport HTTP transport, which should normally be:
     *        <ul>
     *        <li>Google App Engine:
     *        {@code com.google.api.client.extensions.appengine.http.UrlFetchTransport}</li>
     *        <li>Android: {@code newCompatibleTransport} from
     *        {@code com.google.api.client.extensions.android.http.AndroidHttp}</li>
     *        <li>Java: {@link com.google.api.client.googleapis.javanet.GoogleNetHttpTransport#newTrustedTransport()}
     *        </li>
     *        </ul>
     * @param jsonFactory JSON factory, which may be:
     *        <ul>
     *        <li>Jackson: {@code com.google.api.client.json.jackson2.JacksonFactory}</li>
     *        <li>Google GSON: {@code com.google.api.client.json.gson.GsonFactory}</li>
     *        <li>Android Honeycomb or higher:
     *        {@code com.google.api.client.extensions.android.json.AndroidJsonFactory}</li>
     *        </ul>
     * @param httpRequestInitializer HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
        com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      super(
          transport,
          jsonFactory,
          DEFAULT_ROOT_URL,
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link ServiceControl}. */
    @Override
    public ServiceControl build() {
      return new ServiceControl(this);
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      return (Builder) super.setRootUrl(rootUrl);
    }

    @Override
    public Builder setServicePath(String servicePath) {
      return (Builder) super.setServicePath(servicePath);
    }

    @Override
    public Builder setBatchPath(String batchPath) {
      return (Builder) super.setBatchPath(batchPath);
    }

    @Override
    public Builder setHttpRequestInitializer(com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
      return (Builder) super.setHttpRequestInitializer(httpRequestInitializer);
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      return (Builder) super.setApplicationName(applicationName);
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      return (Builder) super.setSuppressPatternChecks(suppressPatternChecks);
    }

    @Override
    public Builder setSuppressRequiredParameterChecks(boolean suppressRequiredParameterChecks) {
      return (Builder) super.setSuppressRequiredParameterChecks(suppressRequiredParameterChecks);
    }

    @Override
    public Builder setSuppressAllChecks(boolean suppressAllChecks) {
      return (Builder) super.setSuppressAllChecks(suppressAllChecks);
    }

    /**
     * Set the {@link ServiceControlRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setServiceControlRequestInitializer(
        ServiceControlRequestInitializer servicecontrolRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(servicecontrolRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}

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

package com.google.api.services.cloudprofiler.v2;

/**
 * Service definition for CloudProfiler (v2).
 *
 * <p>
 * Manages continuous profiling information.
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="https://cloud.google.com/profiler/" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link CloudProfilerRequestInitializer} to initialize global parameters via its
 * {@link Builder}.
 * </p>
 *
 * @since 1.3
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public class CloudProfiler extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient {

  // Note: Leave this static initializer at the top of the file.
  static {
    com.google.api.client.util.Preconditions.checkState(
        com.google.api.client.googleapis.GoogleUtils.MAJOR_VERSION == 1 &&
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION >= 32 ||
        (com.google.api.client.googleapis.GoogleUtils.MINOR_VERSION == 31 &&
        com.google.api.client.googleapis.GoogleUtils.BUGFIX_VERSION >= 1)),
        "You are currently running with version %s of google-api-client. " +
        "You need at least version 1.31.1 of google-api-client to run version " +
        "1.31.5 of the Stackdriver Profiler API library.", com.google.api.client.googleapis.GoogleUtils.VERSION);
  }

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://cloudprofiler.googleapis.com/";

  /**
   * The default encoded mTLS root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.31
   */
  public static final String DEFAULT_MTLS_ROOT_URL = "https://cloudprofiler.mtls.googleapis.com/";

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
  public CloudProfiler(com.google.api.client.http.HttpTransport transport, com.google.api.client.json.JsonFactory jsonFactory,
      com.google.api.client.http.HttpRequestInitializer httpRequestInitializer) {
    this(new Builder(transport, jsonFactory, httpRequestInitializer));
  }

  /**
   * @param builder builder
   */
  CloudProfiler(Builder builder) {
    super(builder);
  }

  @Override
  protected void initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest<?> httpClientRequest) throws java.io.IOException {
    super.initialize(httpClientRequest);
  }

  /**
   * An accessor for creating requests from the Projects collection.
   *
   * <p>The typical use is:</p>
   * <pre>
   *   {@code CloudProfiler cloudprofiler = new CloudProfiler(...);}
   *   {@code CloudProfiler.Projects.List request = cloudprofiler.projects().list(parameters ...)}
   * </pre>
   *
   * @return the resource collection
   */
  public Projects projects() {
    return new Projects();
  }

  /**
   * The "projects" collection of methods.
   */
  public class Projects {

    /**
     * An accessor for creating requests from the Profiles collection.
     *
     * <p>The typical use is:</p>
     * <pre>
     *   {@code CloudProfiler cloudprofiler = new CloudProfiler(...);}
     *   {@code CloudProfiler.Profiles.List request = cloudprofiler.profiles().list(parameters ...)}
     * </pre>
     *
     * @return the resource collection
     */
    public Profiles profiles() {
      return new Profiles();
    }

    /**
     * The "profiles" collection of methods.
     */
    public class Profiles {

      /**
       * CreateProfile creates a new profile resource in the online mode. The server ensures that the new
       * profiles are created at a constant rate per deployment, so the creation request may hang for some
       * time until the next profile session is available. The request may fail with ABORTED error if the
       * creation is not available within ~1m, the response will indicate the duration of the backoff the
       * client should take before attempting creating a profile again. The backoff duration is returned
       * in google.rpc.RetryInfo extension on the response status. To a gRPC client, the extension will be
       * return as a binary-serialized proto in the trailing metadata item named "google.rpc.retryinfo-
       * bin".
       *
       * Create a request for the method "profiles.create".
       *
       * This request holds the parameters needed by the cloudprofiler server.  After setting any optional
       * parameters, call the {@link Create#execute()} method to invoke the remote operation.
       *
       * @param parent Parent project to create the profile in.
       * @param content the {@link com.google.api.services.cloudprofiler.v2.model.CreateProfileRequest}
       * @return the request
       */
      public Create create(java.lang.String parent, com.google.api.services.cloudprofiler.v2.model.CreateProfileRequest content) throws java.io.IOException {
        Create result = new Create(parent, content);
        initialize(result);
        return result;
      }

      public class Create extends CloudProfilerRequest<com.google.api.services.cloudprofiler.v2.model.Profile> {

        private static final String REST_PATH = "v2/{+parent}/profiles";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^projects/[^/]+$");

        /**
         * CreateProfile creates a new profile resource in the online mode. The server ensures that the
         * new profiles are created at a constant rate per deployment, so the creation request may hang
         * for some time until the next profile session is available. The request may fail with ABORTED
         * error if the creation is not available within ~1m, the response will indicate the duration of
         * the backoff the client should take before attempting creating a profile again. The backoff
         * duration is returned in google.rpc.RetryInfo extension on the response status. To a gRPC
         * client, the extension will be return as a binary-serialized proto in the trailing metadata item
         * named "google.rpc.retryinfo-bin".
         *
         * Create a request for the method "profiles.create".
         *
         * This request holds the parameters needed by the the cloudprofiler server.  After setting any
         * optional parameters, call the {@link Create#execute()} method to invoke the remote operation.
         * <p> {@link
         * Create#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param parent Parent project to create the profile in.
         * @param content the {@link com.google.api.services.cloudprofiler.v2.model.CreateProfileRequest}
         * @since 1.13
         */
        protected Create(java.lang.String parent, com.google.api.services.cloudprofiler.v2.model.CreateProfileRequest content) {
          super(CloudProfiler.this, "POST", REST_PATH, content, com.google.api.services.cloudprofiler.v2.model.Profile.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^projects/[^/]+$");
          }
        }

        @Override
        public Create set$Xgafv(java.lang.String $Xgafv) {
          return (Create) super.set$Xgafv($Xgafv);
        }

        @Override
        public Create setAccessToken(java.lang.String accessToken) {
          return (Create) super.setAccessToken(accessToken);
        }

        @Override
        public Create setAlt(java.lang.String alt) {
          return (Create) super.setAlt(alt);
        }

        @Override
        public Create setCallback(java.lang.String callback) {
          return (Create) super.setCallback(callback);
        }

        @Override
        public Create setFields(java.lang.String fields) {
          return (Create) super.setFields(fields);
        }

        @Override
        public Create setKey(java.lang.String key) {
          return (Create) super.setKey(key);
        }

        @Override
        public Create setOauthToken(java.lang.String oauthToken) {
          return (Create) super.setOauthToken(oauthToken);
        }

        @Override
        public Create setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Create) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Create setQuotaUser(java.lang.String quotaUser) {
          return (Create) super.setQuotaUser(quotaUser);
        }

        @Override
        public Create setUploadType(java.lang.String uploadType) {
          return (Create) super.setUploadType(uploadType);
        }

        @Override
        public Create setUploadProtocol(java.lang.String uploadProtocol) {
          return (Create) super.setUploadProtocol(uploadProtocol);
        }

        /** Parent project to create the profile in. */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Parent project to create the profile in.
         */
        public java.lang.String getParent() {
          return parent;
        }

        /** Parent project to create the profile in. */
        public Create setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^projects/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        @Override
        public Create set(String parameterName, Object value) {
          return (Create) super.set(parameterName, value);
        }
      }
      /**
       * CreateOfflineProfile creates a new profile resource in the offline mode. The client provides the
       * profile to create along with the profile bytes, the server records it.
       *
       * Create a request for the method "profiles.createOffline".
       *
       * This request holds the parameters needed by the cloudprofiler server.  After setting any optional
       * parameters, call the {@link CreateOffline#execute()} method to invoke the remote operation.
       *
       * @param parent Parent project to create the profile in.
       * @param content the {@link com.google.api.services.cloudprofiler.v2.model.Profile}
       * @return the request
       */
      public CreateOffline createOffline(java.lang.String parent, com.google.api.services.cloudprofiler.v2.model.Profile content) throws java.io.IOException {
        CreateOffline result = new CreateOffline(parent, content);
        initialize(result);
        return result;
      }

      public class CreateOffline extends CloudProfilerRequest<com.google.api.services.cloudprofiler.v2.model.Profile> {

        private static final String REST_PATH = "v2/{+parent}/profiles:createOffline";

        private final java.util.regex.Pattern PARENT_PATTERN =
            java.util.regex.Pattern.compile("^projects/[^/]+$");

        /**
         * CreateOfflineProfile creates a new profile resource in the offline mode. The client provides
         * the profile to create along with the profile bytes, the server records it.
         *
         * Create a request for the method "profiles.createOffline".
         *
         * This request holds the parameters needed by the the cloudprofiler server.  After setting any
         * optional parameters, call the {@link CreateOffline#execute()} method to invoke the remote
         * operation. <p> {@link CreateOffline#initialize(com.google.api.client.googleapis.services.Abstra
         * ctGoogleClientRequest)} must be called to initialize this instance immediately after invoking
         * the constructor. </p>
         *
         * @param parent Parent project to create the profile in.
         * @param content the {@link com.google.api.services.cloudprofiler.v2.model.Profile}
         * @since 1.13
         */
        protected CreateOffline(java.lang.String parent, com.google.api.services.cloudprofiler.v2.model.Profile content) {
          super(CloudProfiler.this, "POST", REST_PATH, content, com.google.api.services.cloudprofiler.v2.model.Profile.class);
          this.parent = com.google.api.client.util.Preconditions.checkNotNull(parent, "Required parameter parent must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^projects/[^/]+$");
          }
        }

        @Override
        public CreateOffline set$Xgafv(java.lang.String $Xgafv) {
          return (CreateOffline) super.set$Xgafv($Xgafv);
        }

        @Override
        public CreateOffline setAccessToken(java.lang.String accessToken) {
          return (CreateOffline) super.setAccessToken(accessToken);
        }

        @Override
        public CreateOffline setAlt(java.lang.String alt) {
          return (CreateOffline) super.setAlt(alt);
        }

        @Override
        public CreateOffline setCallback(java.lang.String callback) {
          return (CreateOffline) super.setCallback(callback);
        }

        @Override
        public CreateOffline setFields(java.lang.String fields) {
          return (CreateOffline) super.setFields(fields);
        }

        @Override
        public CreateOffline setKey(java.lang.String key) {
          return (CreateOffline) super.setKey(key);
        }

        @Override
        public CreateOffline setOauthToken(java.lang.String oauthToken) {
          return (CreateOffline) super.setOauthToken(oauthToken);
        }

        @Override
        public CreateOffline setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (CreateOffline) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public CreateOffline setQuotaUser(java.lang.String quotaUser) {
          return (CreateOffline) super.setQuotaUser(quotaUser);
        }

        @Override
        public CreateOffline setUploadType(java.lang.String uploadType) {
          return (CreateOffline) super.setUploadType(uploadType);
        }

        @Override
        public CreateOffline setUploadProtocol(java.lang.String uploadProtocol) {
          return (CreateOffline) super.setUploadProtocol(uploadProtocol);
        }

        /** Parent project to create the profile in. */
        @com.google.api.client.util.Key
        private java.lang.String parent;

        /** Parent project to create the profile in.
         */
        public java.lang.String getParent() {
          return parent;
        }

        /** Parent project to create the profile in. */
        public CreateOffline setParent(java.lang.String parent) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(PARENT_PATTERN.matcher(parent).matches(),
                "Parameter parent must conform to the pattern " +
                "^projects/[^/]+$");
          }
          this.parent = parent;
          return this;
        }

        @Override
        public CreateOffline set(String parameterName, Object value) {
          return (CreateOffline) super.set(parameterName, value);
        }
      }
      /**
       * UpdateProfile updates the profile bytes and labels on the profile resource created in the online
       * mode. Updating the bytes for profiles created in the offline mode is currently not supported: the
       * profile content must be provided at the time of the profile creation.
       *
       * Create a request for the method "profiles.patch".
       *
       * This request holds the parameters needed by the cloudprofiler server.  After setting any optional
       * parameters, call the {@link Patch#execute()} method to invoke the remote operation.
       *
       * @param name Output only. Opaque, server-assigned, unique ID for this profile.
       * @param content the {@link com.google.api.services.cloudprofiler.v2.model.Profile}
       * @return the request
       */
      public Patch patch(java.lang.String name, com.google.api.services.cloudprofiler.v2.model.Profile content) throws java.io.IOException {
        Patch result = new Patch(name, content);
        initialize(result);
        return result;
      }

      public class Patch extends CloudProfilerRequest<com.google.api.services.cloudprofiler.v2.model.Profile> {

        private static final String REST_PATH = "v2/{+name}";

        private final java.util.regex.Pattern NAME_PATTERN =
            java.util.regex.Pattern.compile("^projects/[^/]+/profiles/[^/]+$");

        /**
         * UpdateProfile updates the profile bytes and labels on the profile resource created in the
         * online mode. Updating the bytes for profiles created in the offline mode is currently not
         * supported: the profile content must be provided at the time of the profile creation.
         *
         * Create a request for the method "profiles.patch".
         *
         * This request holds the parameters needed by the the cloudprofiler server.  After setting any
         * optional parameters, call the {@link Patch#execute()} method to invoke the remote operation.
         * <p> {@link
         * Patch#initialize(com.google.api.client.googleapis.services.AbstractGoogleClientRequest)} must
         * be called to initialize this instance immediately after invoking the constructor. </p>
         *
         * @param name Output only. Opaque, server-assigned, unique ID for this profile.
         * @param content the {@link com.google.api.services.cloudprofiler.v2.model.Profile}
         * @since 1.13
         */
        protected Patch(java.lang.String name, com.google.api.services.cloudprofiler.v2.model.Profile content) {
          super(CloudProfiler.this, "PATCH", REST_PATH, content, com.google.api.services.cloudprofiler.v2.model.Profile.class);
          this.name = com.google.api.client.util.Preconditions.checkNotNull(name, "Required parameter name must be specified.");
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^projects/[^/]+/profiles/[^/]+$");
          }
        }

        @Override
        public Patch set$Xgafv(java.lang.String $Xgafv) {
          return (Patch) super.set$Xgafv($Xgafv);
        }

        @Override
        public Patch setAccessToken(java.lang.String accessToken) {
          return (Patch) super.setAccessToken(accessToken);
        }

        @Override
        public Patch setAlt(java.lang.String alt) {
          return (Patch) super.setAlt(alt);
        }

        @Override
        public Patch setCallback(java.lang.String callback) {
          return (Patch) super.setCallback(callback);
        }

        @Override
        public Patch setFields(java.lang.String fields) {
          return (Patch) super.setFields(fields);
        }

        @Override
        public Patch setKey(java.lang.String key) {
          return (Patch) super.setKey(key);
        }

        @Override
        public Patch setOauthToken(java.lang.String oauthToken) {
          return (Patch) super.setOauthToken(oauthToken);
        }

        @Override
        public Patch setPrettyPrint(java.lang.Boolean prettyPrint) {
          return (Patch) super.setPrettyPrint(prettyPrint);
        }

        @Override
        public Patch setQuotaUser(java.lang.String quotaUser) {
          return (Patch) super.setQuotaUser(quotaUser);
        }

        @Override
        public Patch setUploadType(java.lang.String uploadType) {
          return (Patch) super.setUploadType(uploadType);
        }

        @Override
        public Patch setUploadProtocol(java.lang.String uploadProtocol) {
          return (Patch) super.setUploadProtocol(uploadProtocol);
        }

        /** Output only. Opaque, server-assigned, unique ID for this profile. */
        @com.google.api.client.util.Key
        private java.lang.String name;

        /** Output only. Opaque, server-assigned, unique ID for this profile.
         */
        public java.lang.String getName() {
          return name;
        }

        /** Output only. Opaque, server-assigned, unique ID for this profile. */
        public Patch setName(java.lang.String name) {
          if (!getSuppressPatternChecks()) {
            com.google.api.client.util.Preconditions.checkArgument(NAME_PATTERN.matcher(name).matches(),
                "Parameter name must conform to the pattern " +
                "^projects/[^/]+/profiles/[^/]+$");
          }
          this.name = name;
          return this;
        }

        /**
         * Field mask used to specify the fields to be overwritten. Currently only profile_bytes and
         * labels fields are supported by UpdateProfile, so only those fields can be specified in
         * the mask. When no mask is provided, all fields are overwritten.
         */
        @com.google.api.client.util.Key
        private String updateMask;

        /** Field mask used to specify the fields to be overwritten. Currently only profile_bytes and labels
       fields are supported by UpdateProfile, so only those fields can be specified in the mask. When no
       mask is provided, all fields are overwritten.
         */
        public String getUpdateMask() {
          return updateMask;
        }

        /**
         * Field mask used to specify the fields to be overwritten. Currently only profile_bytes and
         * labels fields are supported by UpdateProfile, so only those fields can be specified in
         * the mask. When no mask is provided, all fields are overwritten.
         */
        public Patch setUpdateMask(String updateMask) {
          this.updateMask = updateMask;
          return this;
        }

        @Override
        public Patch set(String parameterName, Object value) {
          return (Patch) super.set(parameterName, value);
        }
      }

    }
  }

  /**
   * Builder for {@link CloudProfiler}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient.Builder {

    private static String chooseEndpoint(com.google.api.client.http.HttpTransport transport) {
      // If the GOOGLE_API_USE_MTLS_ENDPOINT environment variable value is "always", use mTLS endpoint.
      // If the env variable is "auto", use mTLS endpoint if and only if the transport is mTLS.
      // Use the regular endpoint for all other cases.
      String useMtlsEndpoint = System.getenv("GOOGLE_API_USE_MTLS_ENDPOINT");
      useMtlsEndpoint = useMtlsEndpoint == null ? "auto" : useMtlsEndpoint;
      if ("always".equals(useMtlsEndpoint) || ("auto".equals(useMtlsEndpoint) && transport != null && transport.isMtls())) {
        return DEFAULT_MTLS_ROOT_URL;
      }
      return DEFAULT_ROOT_URL;
    }

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
          Builder.chooseEndpoint(transport),
          DEFAULT_SERVICE_PATH,
          httpRequestInitializer,
          false);
      setBatchPath(DEFAULT_BATCH_PATH);
    }

    /** Builds a new instance of {@link CloudProfiler}. */
    @Override
    public CloudProfiler build() {
      return new CloudProfiler(this);
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
     * Set the {@link CloudProfilerRequestInitializer}.
     *
     * @since 1.12
     */
    public Builder setCloudProfilerRequestInitializer(
        CloudProfilerRequestInitializer cloudprofilerRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(cloudprofilerRequestInitializer);
    }

    @Override
    public Builder setGoogleClientRequestInitializer(
        com.google.api.client.googleapis.services.GoogleClientRequestInitializer googleClientRequestInitializer) {
      return (Builder) super.setGoogleClientRequestInitializer(googleClientRequestInitializer);
    }
  }
}

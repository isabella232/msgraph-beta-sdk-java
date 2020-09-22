// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health App Performance By App Version Request.
 */
public class UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest extends BaseRequest implements IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest {
	
    /**
     * The request for the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion.class);
    }

    /**
     * Gets the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion from the service
     *
     * @return the UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion, final ICallback<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> callback) {
        send(HttpMethod.PATCH, callback, sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion);
    }

    /**
     * Patches this UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the source object with updates
     * @return the updated UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion patch(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion, final ICallback<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> callback) {
        send(HttpMethod.POST, callback, newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the new object to create
     * @return the created UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion post(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion, final ICallback<UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion> callback) {
        send(HttpMethod.PUT, callback, newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion the object to create/update
     * @return the created UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion put(final UserExperienceAnalyticsAppHealthAppPerformanceByAppVersion newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsAppHealthAppPerformanceByAppVersion);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (UserExperienceAnalyticsAppHealthAppPerformanceByAppVersionRequest)this;
     }

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsAppHealthDeviceModelPerformance;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics App Health Device Model Performance Request.
 */
public class UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest extends BaseRequest implements IUserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest {
	
    /**
     * The request for the UserExperienceAnalyticsAppHealthDeviceModelPerformance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsAppHealthDeviceModelPerformance.class);
    }

    /**
     * Gets the UserExperienceAnalyticsAppHealthDeviceModelPerformance from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<UserExperienceAnalyticsAppHealthDeviceModelPerformance> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserExperienceAnalyticsAppHealthDeviceModelPerformance from the service
     *
     * @return the UserExperienceAnalyticsAppHealthDeviceModelPerformance from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthDeviceModelPerformance get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<UserExperienceAnalyticsAppHealthDeviceModelPerformance> callback) {
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
     * Patches this UserExperienceAnalyticsAppHealthDeviceModelPerformance with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDeviceModelPerformance the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserExperienceAnalyticsAppHealthDeviceModelPerformance sourceUserExperienceAnalyticsAppHealthDeviceModelPerformance, final ICallback<UserExperienceAnalyticsAppHealthDeviceModelPerformance> callback) {
        send(HttpMethod.PATCH, callback, sourceUserExperienceAnalyticsAppHealthDeviceModelPerformance);
    }

    /**
     * Patches this UserExperienceAnalyticsAppHealthDeviceModelPerformance with a source
     *
     * @param sourceUserExperienceAnalyticsAppHealthDeviceModelPerformance the source object with updates
     * @return the updated UserExperienceAnalyticsAppHealthDeviceModelPerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthDeviceModelPerformance patch(final UserExperienceAnalyticsAppHealthDeviceModelPerformance sourceUserExperienceAnalyticsAppHealthDeviceModelPerformance) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsAppHealthDeviceModelPerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDeviceModelPerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDeviceModelPerformance the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserExperienceAnalyticsAppHealthDeviceModelPerformance newUserExperienceAnalyticsAppHealthDeviceModelPerformance, final ICallback<UserExperienceAnalyticsAppHealthDeviceModelPerformance> callback) {
        send(HttpMethod.POST, callback, newUserExperienceAnalyticsAppHealthDeviceModelPerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDeviceModelPerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDeviceModelPerformance the new object to create
     * @return the created UserExperienceAnalyticsAppHealthDeviceModelPerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthDeviceModelPerformance post(final UserExperienceAnalyticsAppHealthDeviceModelPerformance newUserExperienceAnalyticsAppHealthDeviceModelPerformance) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsAppHealthDeviceModelPerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDeviceModelPerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDeviceModelPerformance the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserExperienceAnalyticsAppHealthDeviceModelPerformance newUserExperienceAnalyticsAppHealthDeviceModelPerformance, final ICallback<UserExperienceAnalyticsAppHealthDeviceModelPerformance> callback) {
        send(HttpMethod.PUT, callback, newUserExperienceAnalyticsAppHealthDeviceModelPerformance);
    }

    /**
     * Creates a UserExperienceAnalyticsAppHealthDeviceModelPerformance with a new object
     *
     * @param newUserExperienceAnalyticsAppHealthDeviceModelPerformance the object to create/update
     * @return the created UserExperienceAnalyticsAppHealthDeviceModelPerformance
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsAppHealthDeviceModelPerformance put(final UserExperienceAnalyticsAppHealthDeviceModelPerformance newUserExperienceAnalyticsAppHealthDeviceModelPerformance) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsAppHealthDeviceModelPerformance);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (UserExperienceAnalyticsAppHealthDeviceModelPerformanceRequest)this;
     }

}


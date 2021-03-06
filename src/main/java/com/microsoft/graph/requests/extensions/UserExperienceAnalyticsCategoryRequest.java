// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsCategory;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsMetricRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Category Request.
 */
public class UserExperienceAnalyticsCategoryRequest extends BaseRequest implements IUserExperienceAnalyticsCategoryRequest {
	
    /**
     * The request for the UserExperienceAnalyticsCategory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsCategoryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsCategory.class);
    }

    /**
     * Gets the UserExperienceAnalyticsCategory from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super UserExperienceAnalyticsCategory> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the UserExperienceAnalyticsCategory from the service
     *
     * @return the UserExperienceAnalyticsCategory from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsCategory get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super UserExperienceAnalyticsCategory> callback) {
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
     * Patches this UserExperienceAnalyticsCategory with a source
     *
     * @param sourceUserExperienceAnalyticsCategory the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final UserExperienceAnalyticsCategory sourceUserExperienceAnalyticsCategory, final ICallback<? super UserExperienceAnalyticsCategory> callback) {
        send(HttpMethod.PATCH, callback, sourceUserExperienceAnalyticsCategory);
    }

    /**
     * Patches this UserExperienceAnalyticsCategory with a source
     *
     * @param sourceUserExperienceAnalyticsCategory the source object with updates
     * @return the updated UserExperienceAnalyticsCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsCategory patch(final UserExperienceAnalyticsCategory sourceUserExperienceAnalyticsCategory) throws ClientException {
        return send(HttpMethod.PATCH, sourceUserExperienceAnalyticsCategory);
    }

    /**
     * Creates a UserExperienceAnalyticsCategory with a new object
     *
     * @param newUserExperienceAnalyticsCategory the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final UserExperienceAnalyticsCategory newUserExperienceAnalyticsCategory, final ICallback<? super UserExperienceAnalyticsCategory> callback) {
        send(HttpMethod.POST, callback, newUserExperienceAnalyticsCategory);
    }

    /**
     * Creates a UserExperienceAnalyticsCategory with a new object
     *
     * @param newUserExperienceAnalyticsCategory the new object to create
     * @return the created UserExperienceAnalyticsCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsCategory post(final UserExperienceAnalyticsCategory newUserExperienceAnalyticsCategory) throws ClientException {
        return send(HttpMethod.POST, newUserExperienceAnalyticsCategory);
    }

    /**
     * Creates a UserExperienceAnalyticsCategory with a new object
     *
     * @param newUserExperienceAnalyticsCategory the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final UserExperienceAnalyticsCategory newUserExperienceAnalyticsCategory, final ICallback<? super UserExperienceAnalyticsCategory> callback) {
        send(HttpMethod.PUT, callback, newUserExperienceAnalyticsCategory);
    }

    /**
     * Creates a UserExperienceAnalyticsCategory with a new object
     *
     * @param newUserExperienceAnalyticsCategory the object to create/update
     * @return the created UserExperienceAnalyticsCategory
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public UserExperienceAnalyticsCategory put(final UserExperienceAnalyticsCategory newUserExperienceAnalyticsCategory) throws ClientException {
        return send(HttpMethod.PUT, newUserExperienceAnalyticsCategory);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsCategoryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (UserExperienceAnalyticsCategoryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IUserExperienceAnalyticsCategoryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (UserExperienceAnalyticsCategoryRequest)this;
     }

}


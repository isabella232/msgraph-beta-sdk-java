// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ActivityStatistics;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Activity Statistics Request.
 */
public class ActivityStatisticsRequest extends BaseRequest implements IActivityStatisticsRequest {
	
    /**
     * The request for the ActivityStatistics
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ActivityStatisticsRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends ActivityStatistics> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ActivityStatistics
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ActivityStatisticsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ActivityStatistics.class);
    }

    /**
     * Gets the ActivityStatistics from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ActivityStatistics> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ActivityStatistics from the service
     *
     * @return the ActivityStatistics from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ActivityStatistics get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ActivityStatistics> callback) {
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
     * Patches this ActivityStatistics with a source
     *
     * @param sourceActivityStatistics the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ActivityStatistics sourceActivityStatistics, final ICallback<? super ActivityStatistics> callback) {
        send(HttpMethod.PATCH, callback, sourceActivityStatistics);
    }

    /**
     * Patches this ActivityStatistics with a source
     *
     * @param sourceActivityStatistics the source object with updates
     * @return the updated ActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ActivityStatistics patch(final ActivityStatistics sourceActivityStatistics) throws ClientException {
        return send(HttpMethod.PATCH, sourceActivityStatistics);
    }

    /**
     * Creates a ActivityStatistics with a new object
     *
     * @param newActivityStatistics the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ActivityStatistics newActivityStatistics, final ICallback<? super ActivityStatistics> callback) {
        send(HttpMethod.POST, callback, newActivityStatistics);
    }

    /**
     * Creates a ActivityStatistics with a new object
     *
     * @param newActivityStatistics the new object to create
     * @return the created ActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ActivityStatistics post(final ActivityStatistics newActivityStatistics) throws ClientException {
        return send(HttpMethod.POST, newActivityStatistics);
    }

    /**
     * Creates a ActivityStatistics with a new object
     *
     * @param newActivityStatistics the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ActivityStatistics newActivityStatistics, final ICallback<? super ActivityStatistics> callback) {
        send(HttpMethod.PUT, callback, newActivityStatistics);
    }

    /**
     * Creates a ActivityStatistics with a new object
     *
     * @param newActivityStatistics the object to create/update
     * @return the created ActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ActivityStatistics put(final ActivityStatistics newActivityStatistics) throws ClientException {
        return send(HttpMethod.PUT, newActivityStatistics);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IActivityStatisticsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ActivityStatisticsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IActivityStatisticsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ActivityStatisticsRequest)this;
     }

}


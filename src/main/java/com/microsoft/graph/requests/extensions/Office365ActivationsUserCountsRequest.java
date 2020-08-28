// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365ActivationsUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office365Activations User Counts Request.
 */
public class Office365ActivationsUserCountsRequest extends BaseRequest implements IOffice365ActivationsUserCountsRequest {
	
    /**
     * The request for the Office365ActivationsUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public Office365ActivationsUserCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Office365ActivationsUserCounts.class);
    }

    /**
     * Gets the Office365ActivationsUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Office365ActivationsUserCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Office365ActivationsUserCounts from the service
     *
     * @return the Office365ActivationsUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ActivationsUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Office365ActivationsUserCounts> callback) {
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
     * Patches this Office365ActivationsUserCounts with a source
     *
     * @param sourceOffice365ActivationsUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Office365ActivationsUserCounts sourceOffice365ActivationsUserCounts, final ICallback<Office365ActivationsUserCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceOffice365ActivationsUserCounts);
    }

    /**
     * Patches this Office365ActivationsUserCounts with a source
     *
     * @param sourceOffice365ActivationsUserCounts the source object with updates
     * @return the updated Office365ActivationsUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ActivationsUserCounts patch(final Office365ActivationsUserCounts sourceOffice365ActivationsUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceOffice365ActivationsUserCounts);
    }

    /**
     * Creates a Office365ActivationsUserCounts with a new object
     *
     * @param newOffice365ActivationsUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Office365ActivationsUserCounts newOffice365ActivationsUserCounts, final ICallback<Office365ActivationsUserCounts> callback) {
        send(HttpMethod.POST, callback, newOffice365ActivationsUserCounts);
    }

    /**
     * Creates a Office365ActivationsUserCounts with a new object
     *
     * @param newOffice365ActivationsUserCounts the new object to create
     * @return the created Office365ActivationsUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Office365ActivationsUserCounts post(final Office365ActivationsUserCounts newOffice365ActivationsUserCounts) throws ClientException {
        return send(HttpMethod.POST, newOffice365ActivationsUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOffice365ActivationsUserCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (Office365ActivationsUserCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOffice365ActivationsUserCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (Office365ActivationsUserCountsRequest)this;
     }

}


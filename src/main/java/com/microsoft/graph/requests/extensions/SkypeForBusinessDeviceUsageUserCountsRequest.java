// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessDeviceUsageUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Device Usage User Counts Request.
 */
public class SkypeForBusinessDeviceUsageUserCountsRequest extends BaseRequest implements ISkypeForBusinessDeviceUsageUserCountsRequest {
	
    /**
     * The request for the SkypeForBusinessDeviceUsageUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessDeviceUsageUserCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeForBusinessDeviceUsageUserCounts.class);
    }

    /**
     * Gets the SkypeForBusinessDeviceUsageUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SkypeForBusinessDeviceUsageUserCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SkypeForBusinessDeviceUsageUserCounts from the service
     *
     * @return the SkypeForBusinessDeviceUsageUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessDeviceUsageUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SkypeForBusinessDeviceUsageUserCounts> callback) {
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
     * Patches this SkypeForBusinessDeviceUsageUserCounts with a source
     *
     * @param sourceSkypeForBusinessDeviceUsageUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SkypeForBusinessDeviceUsageUserCounts sourceSkypeForBusinessDeviceUsageUserCounts, final ICallback<SkypeForBusinessDeviceUsageUserCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Patches this SkypeForBusinessDeviceUsageUserCounts with a source
     *
     * @param sourceSkypeForBusinessDeviceUsageUserCounts the source object with updates
     * @return the updated SkypeForBusinessDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessDeviceUsageUserCounts patch(final SkypeForBusinessDeviceUsageUserCounts sourceSkypeForBusinessDeviceUsageUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserCounts with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SkypeForBusinessDeviceUsageUserCounts newSkypeForBusinessDeviceUsageUserCounts, final ICallback<SkypeForBusinessDeviceUsageUserCounts> callback) {
        send(HttpMethod.POST, callback, newSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserCounts with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserCounts the new object to create
     * @return the created SkypeForBusinessDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessDeviceUsageUserCounts post(final SkypeForBusinessDeviceUsageUserCounts newSkypeForBusinessDeviceUsageUserCounts) throws ClientException {
        return send(HttpMethod.POST, newSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserCounts with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SkypeForBusinessDeviceUsageUserCounts newSkypeForBusinessDeviceUsageUserCounts, final ICallback<SkypeForBusinessDeviceUsageUserCounts> callback) {
        send(HttpMethod.PUT, callback, newSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Creates a SkypeForBusinessDeviceUsageUserCounts with a new object
     *
     * @param newSkypeForBusinessDeviceUsageUserCounts the object to create/update
     * @return the created SkypeForBusinessDeviceUsageUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessDeviceUsageUserCounts put(final SkypeForBusinessDeviceUsageUserCounts newSkypeForBusinessDeviceUsageUserCounts) throws ClientException {
        return send(HttpMethod.PUT, newSkypeForBusinessDeviceUsageUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISkypeForBusinessDeviceUsageUserCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SkypeForBusinessDeviceUsageUserCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISkypeForBusinessDeviceUsageUserCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SkypeForBusinessDeviceUsageUserCountsRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public ISkypeForBusinessDeviceUsageUserCountsRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (SkypeForBusinessDeviceUsageUserCountsRequest)this;
     }

}


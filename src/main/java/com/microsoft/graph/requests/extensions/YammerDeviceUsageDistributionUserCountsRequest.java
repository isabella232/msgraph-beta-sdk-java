// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerDeviceUsageDistributionUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Yammer Device Usage Distribution User Counts Request.
 */
public class YammerDeviceUsageDistributionUserCountsRequest extends BaseRequest implements IYammerDeviceUsageDistributionUserCountsRequest {
	
    /**
     * The request for the YammerDeviceUsageDistributionUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public YammerDeviceUsageDistributionUserCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, YammerDeviceUsageDistributionUserCounts.class);
    }

    /**
     * Gets the YammerDeviceUsageDistributionUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<YammerDeviceUsageDistributionUserCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the YammerDeviceUsageDistributionUserCounts from the service
     *
     * @return the YammerDeviceUsageDistributionUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerDeviceUsageDistributionUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<YammerDeviceUsageDistributionUserCounts> callback) {
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
     * Patches this YammerDeviceUsageDistributionUserCounts with a source
     *
     * @param sourceYammerDeviceUsageDistributionUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final YammerDeviceUsageDistributionUserCounts sourceYammerDeviceUsageDistributionUserCounts, final ICallback<YammerDeviceUsageDistributionUserCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceYammerDeviceUsageDistributionUserCounts);
    }

    /**
     * Patches this YammerDeviceUsageDistributionUserCounts with a source
     *
     * @param sourceYammerDeviceUsageDistributionUserCounts the source object with updates
     * @return the updated YammerDeviceUsageDistributionUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerDeviceUsageDistributionUserCounts patch(final YammerDeviceUsageDistributionUserCounts sourceYammerDeviceUsageDistributionUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceYammerDeviceUsageDistributionUserCounts);
    }

    /**
     * Creates a YammerDeviceUsageDistributionUserCounts with a new object
     *
     * @param newYammerDeviceUsageDistributionUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final YammerDeviceUsageDistributionUserCounts newYammerDeviceUsageDistributionUserCounts, final ICallback<YammerDeviceUsageDistributionUserCounts> callback) {
        send(HttpMethod.POST, callback, newYammerDeviceUsageDistributionUserCounts);
    }

    /**
     * Creates a YammerDeviceUsageDistributionUserCounts with a new object
     *
     * @param newYammerDeviceUsageDistributionUserCounts the new object to create
     * @return the created YammerDeviceUsageDistributionUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerDeviceUsageDistributionUserCounts post(final YammerDeviceUsageDistributionUserCounts newYammerDeviceUsageDistributionUserCounts) throws ClientException {
        return send(HttpMethod.POST, newYammerDeviceUsageDistributionUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IYammerDeviceUsageDistributionUserCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (YammerDeviceUsageDistributionUserCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IYammerDeviceUsageDistributionUserCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (YammerDeviceUsageDistributionUserCountsRequest)this;
     }

}

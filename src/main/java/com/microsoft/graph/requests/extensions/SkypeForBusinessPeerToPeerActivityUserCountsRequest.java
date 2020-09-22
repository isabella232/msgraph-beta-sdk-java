// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessPeerToPeerActivityUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skype For Business Peer To Peer Activity User Counts Request.
 */
public class SkypeForBusinessPeerToPeerActivityUserCountsRequest extends BaseRequest implements ISkypeForBusinessPeerToPeerActivityUserCountsRequest {
	
    /**
     * The request for the SkypeForBusinessPeerToPeerActivityUserCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkypeForBusinessPeerToPeerActivityUserCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkypeForBusinessPeerToPeerActivityUserCounts.class);
    }

    /**
     * Gets the SkypeForBusinessPeerToPeerActivityUserCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SkypeForBusinessPeerToPeerActivityUserCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SkypeForBusinessPeerToPeerActivityUserCounts from the service
     *
     * @return the SkypeForBusinessPeerToPeerActivityUserCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessPeerToPeerActivityUserCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SkypeForBusinessPeerToPeerActivityUserCounts> callback) {
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
     * Patches this SkypeForBusinessPeerToPeerActivityUserCounts with a source
     *
     * @param sourceSkypeForBusinessPeerToPeerActivityUserCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SkypeForBusinessPeerToPeerActivityUserCounts sourceSkypeForBusinessPeerToPeerActivityUserCounts, final ICallback<SkypeForBusinessPeerToPeerActivityUserCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceSkypeForBusinessPeerToPeerActivityUserCounts);
    }

    /**
     * Patches this SkypeForBusinessPeerToPeerActivityUserCounts with a source
     *
     * @param sourceSkypeForBusinessPeerToPeerActivityUserCounts the source object with updates
     * @return the updated SkypeForBusinessPeerToPeerActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessPeerToPeerActivityUserCounts patch(final SkypeForBusinessPeerToPeerActivityUserCounts sourceSkypeForBusinessPeerToPeerActivityUserCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceSkypeForBusinessPeerToPeerActivityUserCounts);
    }

    /**
     * Creates a SkypeForBusinessPeerToPeerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityUserCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SkypeForBusinessPeerToPeerActivityUserCounts newSkypeForBusinessPeerToPeerActivityUserCounts, final ICallback<SkypeForBusinessPeerToPeerActivityUserCounts> callback) {
        send(HttpMethod.POST, callback, newSkypeForBusinessPeerToPeerActivityUserCounts);
    }

    /**
     * Creates a SkypeForBusinessPeerToPeerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityUserCounts the new object to create
     * @return the created SkypeForBusinessPeerToPeerActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessPeerToPeerActivityUserCounts post(final SkypeForBusinessPeerToPeerActivityUserCounts newSkypeForBusinessPeerToPeerActivityUserCounts) throws ClientException {
        return send(HttpMethod.POST, newSkypeForBusinessPeerToPeerActivityUserCounts);
    }

    /**
     * Creates a SkypeForBusinessPeerToPeerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityUserCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final SkypeForBusinessPeerToPeerActivityUserCounts newSkypeForBusinessPeerToPeerActivityUserCounts, final ICallback<SkypeForBusinessPeerToPeerActivityUserCounts> callback) {
        send(HttpMethod.PUT, callback, newSkypeForBusinessPeerToPeerActivityUserCounts);
    }

    /**
     * Creates a SkypeForBusinessPeerToPeerActivityUserCounts with a new object
     *
     * @param newSkypeForBusinessPeerToPeerActivityUserCounts the object to create/update
     * @return the created SkypeForBusinessPeerToPeerActivityUserCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SkypeForBusinessPeerToPeerActivityUserCounts put(final SkypeForBusinessPeerToPeerActivityUserCounts newSkypeForBusinessPeerToPeerActivityUserCounts) throws ClientException {
        return send(HttpMethod.PUT, newSkypeForBusinessPeerToPeerActivityUserCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISkypeForBusinessPeerToPeerActivityUserCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SkypeForBusinessPeerToPeerActivityUserCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISkypeForBusinessPeerToPeerActivityUserCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SkypeForBusinessPeerToPeerActivityUserCountsRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public ISkypeForBusinessPeerToPeerActivityUserCountsRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (SkypeForBusinessPeerToPeerActivityUserCountsRequest)this;
     }

}


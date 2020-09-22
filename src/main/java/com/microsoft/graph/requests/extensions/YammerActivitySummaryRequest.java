// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Yammer Activity Summary Request.
 */
public class YammerActivitySummaryRequest extends BaseRequest implements IYammerActivitySummaryRequest {
	
    /**
     * The request for the YammerActivitySummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public YammerActivitySummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, YammerActivitySummary.class);
    }

    /**
     * Gets the YammerActivitySummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<YammerActivitySummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the YammerActivitySummary from the service
     *
     * @return the YammerActivitySummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerActivitySummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<YammerActivitySummary> callback) {
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
     * Patches this YammerActivitySummary with a source
     *
     * @param sourceYammerActivitySummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final YammerActivitySummary sourceYammerActivitySummary, final ICallback<YammerActivitySummary> callback) {
        send(HttpMethod.PATCH, callback, sourceYammerActivitySummary);
    }

    /**
     * Patches this YammerActivitySummary with a source
     *
     * @param sourceYammerActivitySummary the source object with updates
     * @return the updated YammerActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerActivitySummary patch(final YammerActivitySummary sourceYammerActivitySummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceYammerActivitySummary);
    }

    /**
     * Creates a YammerActivitySummary with a new object
     *
     * @param newYammerActivitySummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final YammerActivitySummary newYammerActivitySummary, final ICallback<YammerActivitySummary> callback) {
        send(HttpMethod.POST, callback, newYammerActivitySummary);
    }

    /**
     * Creates a YammerActivitySummary with a new object
     *
     * @param newYammerActivitySummary the new object to create
     * @return the created YammerActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerActivitySummary post(final YammerActivitySummary newYammerActivitySummary) throws ClientException {
        return send(HttpMethod.POST, newYammerActivitySummary);
    }

    /**
     * Creates a YammerActivitySummary with a new object
     *
     * @param newYammerActivitySummary the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final YammerActivitySummary newYammerActivitySummary, final ICallback<YammerActivitySummary> callback) {
        send(HttpMethod.PUT, callback, newYammerActivitySummary);
    }

    /**
     * Creates a YammerActivitySummary with a new object
     *
     * @param newYammerActivitySummary the object to create/update
     * @return the created YammerActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public YammerActivitySummary put(final YammerActivitySummary newYammerActivitySummary) throws ClientException {
        return send(HttpMethod.PUT, newYammerActivitySummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IYammerActivitySummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (YammerActivitySummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IYammerActivitySummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (YammerActivitySummaryRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IYammerActivitySummaryRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (YammerActivitySummaryRequest)this;
     }

}


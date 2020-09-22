// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.JournalLine;
import com.microsoft.graph.requests.extensions.IAccountRequestBuilder;
import com.microsoft.graph.requests.extensions.AccountRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Journal Line Request.
 */
public class JournalLineRequest extends BaseRequest implements IJournalLineRequest {
	
    /**
     * The request for the JournalLine
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public JournalLineRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, JournalLine.class);
    }

    /**
     * Gets the JournalLine from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<JournalLine> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the JournalLine from the service
     *
     * @return the JournalLine from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public JournalLine get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<JournalLine> callback) {
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
     * Patches this JournalLine with a source
     *
     * @param sourceJournalLine the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final JournalLine sourceJournalLine, final ICallback<JournalLine> callback) {
        send(HttpMethod.PATCH, callback, sourceJournalLine);
    }

    /**
     * Patches this JournalLine with a source
     *
     * @param sourceJournalLine the source object with updates
     * @return the updated JournalLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public JournalLine patch(final JournalLine sourceJournalLine) throws ClientException {
        return send(HttpMethod.PATCH, sourceJournalLine);
    }

    /**
     * Creates a JournalLine with a new object
     *
     * @param newJournalLine the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final JournalLine newJournalLine, final ICallback<JournalLine> callback) {
        send(HttpMethod.POST, callback, newJournalLine);
    }

    /**
     * Creates a JournalLine with a new object
     *
     * @param newJournalLine the new object to create
     * @return the created JournalLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public JournalLine post(final JournalLine newJournalLine) throws ClientException {
        return send(HttpMethod.POST, newJournalLine);
    }

    /**
     * Creates a JournalLine with a new object
     *
     * @param newJournalLine the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final JournalLine newJournalLine, final ICallback<JournalLine> callback) {
        send(HttpMethod.PUT, callback, newJournalLine);
    }

    /**
     * Creates a JournalLine with a new object
     *
     * @param newJournalLine the object to create/update
     * @return the created JournalLine
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public JournalLine put(final JournalLine newJournalLine) throws ClientException {
        return send(HttpMethod.PUT, newJournalLine);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IJournalLineRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (JournalLineRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IJournalLineRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (JournalLineRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IJournalLineRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (JournalLineRequest)this;
     }

}


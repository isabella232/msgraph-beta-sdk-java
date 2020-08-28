// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EmailActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Email Activity Summary Request.
 */
public class EmailActivitySummaryRequest extends BaseRequest implements IEmailActivitySummaryRequest {
	
    /**
     * The request for the EmailActivitySummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EmailActivitySummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EmailActivitySummary.class);
    }

    /**
     * Gets the EmailActivitySummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<EmailActivitySummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EmailActivitySummary from the service
     *
     * @return the EmailActivitySummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailActivitySummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<EmailActivitySummary> callback) {
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
     * Patches this EmailActivitySummary with a source
     *
     * @param sourceEmailActivitySummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EmailActivitySummary sourceEmailActivitySummary, final ICallback<EmailActivitySummary> callback) {
        send(HttpMethod.PATCH, callback, sourceEmailActivitySummary);
    }

    /**
     * Patches this EmailActivitySummary with a source
     *
     * @param sourceEmailActivitySummary the source object with updates
     * @return the updated EmailActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailActivitySummary patch(final EmailActivitySummary sourceEmailActivitySummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceEmailActivitySummary);
    }

    /**
     * Creates a EmailActivitySummary with a new object
     *
     * @param newEmailActivitySummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EmailActivitySummary newEmailActivitySummary, final ICallback<EmailActivitySummary> callback) {
        send(HttpMethod.POST, callback, newEmailActivitySummary);
    }

    /**
     * Creates a EmailActivitySummary with a new object
     *
     * @param newEmailActivitySummary the new object to create
     * @return the created EmailActivitySummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EmailActivitySummary post(final EmailActivitySummary newEmailActivitySummary) throws ClientException {
        return send(HttpMethod.POST, newEmailActivitySummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEmailActivitySummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EmailActivitySummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEmailActivitySummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EmailActivitySummaryRequest)this;
     }

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MailboxUsageQuotaStatusMailboxCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mailbox Usage Quota Status Mailbox Counts Request.
 */
public class MailboxUsageQuotaStatusMailboxCountsRequest extends BaseRequest implements IMailboxUsageQuotaStatusMailboxCountsRequest {
	
    /**
     * The request for the MailboxUsageQuotaStatusMailboxCounts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MailboxUsageQuotaStatusMailboxCountsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MailboxUsageQuotaStatusMailboxCounts.class);
    }

    /**
     * Gets the MailboxUsageQuotaStatusMailboxCounts from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super MailboxUsageQuotaStatusMailboxCounts> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MailboxUsageQuotaStatusMailboxCounts from the service
     *
     * @return the MailboxUsageQuotaStatusMailboxCounts from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MailboxUsageQuotaStatusMailboxCounts get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super MailboxUsageQuotaStatusMailboxCounts> callback) {
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
     * Patches this MailboxUsageQuotaStatusMailboxCounts with a source
     *
     * @param sourceMailboxUsageQuotaStatusMailboxCounts the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MailboxUsageQuotaStatusMailboxCounts sourceMailboxUsageQuotaStatusMailboxCounts, final ICallback<? super MailboxUsageQuotaStatusMailboxCounts> callback) {
        send(HttpMethod.PATCH, callback, sourceMailboxUsageQuotaStatusMailboxCounts);
    }

    /**
     * Patches this MailboxUsageQuotaStatusMailboxCounts with a source
     *
     * @param sourceMailboxUsageQuotaStatusMailboxCounts the source object with updates
     * @return the updated MailboxUsageQuotaStatusMailboxCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MailboxUsageQuotaStatusMailboxCounts patch(final MailboxUsageQuotaStatusMailboxCounts sourceMailboxUsageQuotaStatusMailboxCounts) throws ClientException {
        return send(HttpMethod.PATCH, sourceMailboxUsageQuotaStatusMailboxCounts);
    }

    /**
     * Creates a MailboxUsageQuotaStatusMailboxCounts with a new object
     *
     * @param newMailboxUsageQuotaStatusMailboxCounts the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MailboxUsageQuotaStatusMailboxCounts newMailboxUsageQuotaStatusMailboxCounts, final ICallback<? super MailboxUsageQuotaStatusMailboxCounts> callback) {
        send(HttpMethod.POST, callback, newMailboxUsageQuotaStatusMailboxCounts);
    }

    /**
     * Creates a MailboxUsageQuotaStatusMailboxCounts with a new object
     *
     * @param newMailboxUsageQuotaStatusMailboxCounts the new object to create
     * @return the created MailboxUsageQuotaStatusMailboxCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MailboxUsageQuotaStatusMailboxCounts post(final MailboxUsageQuotaStatusMailboxCounts newMailboxUsageQuotaStatusMailboxCounts) throws ClientException {
        return send(HttpMethod.POST, newMailboxUsageQuotaStatusMailboxCounts);
    }

    /**
     * Creates a MailboxUsageQuotaStatusMailboxCounts with a new object
     *
     * @param newMailboxUsageQuotaStatusMailboxCounts the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MailboxUsageQuotaStatusMailboxCounts newMailboxUsageQuotaStatusMailboxCounts, final ICallback<? super MailboxUsageQuotaStatusMailboxCounts> callback) {
        send(HttpMethod.PUT, callback, newMailboxUsageQuotaStatusMailboxCounts);
    }

    /**
     * Creates a MailboxUsageQuotaStatusMailboxCounts with a new object
     *
     * @param newMailboxUsageQuotaStatusMailboxCounts the object to create/update
     * @return the created MailboxUsageQuotaStatusMailboxCounts
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MailboxUsageQuotaStatusMailboxCounts put(final MailboxUsageQuotaStatusMailboxCounts newMailboxUsageQuotaStatusMailboxCounts) throws ClientException {
        return send(HttpMethod.PUT, newMailboxUsageQuotaStatusMailboxCounts);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMailboxUsageQuotaStatusMailboxCountsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MailboxUsageQuotaStatusMailboxCountsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMailboxUsageQuotaStatusMailboxCountsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MailboxUsageQuotaStatusMailboxCountsRequest)this;
     }

}


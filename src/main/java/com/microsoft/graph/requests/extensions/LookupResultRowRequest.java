// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.LookupResultRow;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Lookup Result Row Request.
 */
public class LookupResultRowRequest extends BaseRequest implements ILookupResultRowRequest {
	
    /**
     * The request for the LookupResultRow
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LookupResultRowRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LookupResultRow.class);
    }

    /**
     * Gets the LookupResultRow from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<LookupResultRow> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the LookupResultRow from the service
     *
     * @return the LookupResultRow from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LookupResultRow get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<LookupResultRow> callback) {
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
     * Patches this LookupResultRow with a source
     *
     * @param sourceLookupResultRow the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final LookupResultRow sourceLookupResultRow, final ICallback<LookupResultRow> callback) {
        send(HttpMethod.PATCH, callback, sourceLookupResultRow);
    }

    /**
     * Patches this LookupResultRow with a source
     *
     * @param sourceLookupResultRow the source object with updates
     * @return the updated LookupResultRow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LookupResultRow patch(final LookupResultRow sourceLookupResultRow) throws ClientException {
        return send(HttpMethod.PATCH, sourceLookupResultRow);
    }

    /**
     * Creates a LookupResultRow with a new object
     *
     * @param newLookupResultRow the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final LookupResultRow newLookupResultRow, final ICallback<LookupResultRow> callback) {
        send(HttpMethod.POST, callback, newLookupResultRow);
    }

    /**
     * Creates a LookupResultRow with a new object
     *
     * @param newLookupResultRow the new object to create
     * @return the created LookupResultRow
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public LookupResultRow post(final LookupResultRow newLookupResultRow) throws ClientException {
        return send(HttpMethod.POST, newLookupResultRow);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ILookupResultRowRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (LookupResultRowRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ILookupResultRowRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (LookupResultRowRequest)this;
     }

}


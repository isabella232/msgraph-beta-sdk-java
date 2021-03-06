// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EdiscoveryCase;
import com.microsoft.graph.requests.extensions.ICustodianCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICustodianRequestBuilder;
import com.microsoft.graph.requests.extensions.CustodianCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CustodianRequestBuilder;
import com.microsoft.graph.requests.extensions.IReviewSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReviewSetRequestBuilder;
import com.microsoft.graph.requests.extensions.ReviewSetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReviewSetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ediscovery Case Request.
 */
public class EdiscoveryCaseRequest extends BaseRequest implements IEdiscoveryCaseRequest {
	
    /**
     * The request for the EdiscoveryCase
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EdiscoveryCaseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EdiscoveryCase.class);
    }

    /**
     * Gets the EdiscoveryCase from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super EdiscoveryCase> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the EdiscoveryCase from the service
     *
     * @return the EdiscoveryCase from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EdiscoveryCase get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super EdiscoveryCase> callback) {
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
     * Patches this EdiscoveryCase with a source
     *
     * @param sourceEdiscoveryCase the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final EdiscoveryCase sourceEdiscoveryCase, final ICallback<? super EdiscoveryCase> callback) {
        send(HttpMethod.PATCH, callback, sourceEdiscoveryCase);
    }

    /**
     * Patches this EdiscoveryCase with a source
     *
     * @param sourceEdiscoveryCase the source object with updates
     * @return the updated EdiscoveryCase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EdiscoveryCase patch(final EdiscoveryCase sourceEdiscoveryCase) throws ClientException {
        return send(HttpMethod.PATCH, sourceEdiscoveryCase);
    }

    /**
     * Creates a EdiscoveryCase with a new object
     *
     * @param newEdiscoveryCase the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final EdiscoveryCase newEdiscoveryCase, final ICallback<? super EdiscoveryCase> callback) {
        send(HttpMethod.POST, callback, newEdiscoveryCase);
    }

    /**
     * Creates a EdiscoveryCase with a new object
     *
     * @param newEdiscoveryCase the new object to create
     * @return the created EdiscoveryCase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EdiscoveryCase post(final EdiscoveryCase newEdiscoveryCase) throws ClientException {
        return send(HttpMethod.POST, newEdiscoveryCase);
    }

    /**
     * Creates a EdiscoveryCase with a new object
     *
     * @param newEdiscoveryCase the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final EdiscoveryCase newEdiscoveryCase, final ICallback<? super EdiscoveryCase> callback) {
        send(HttpMethod.PUT, callback, newEdiscoveryCase);
    }

    /**
     * Creates a EdiscoveryCase with a new object
     *
     * @param newEdiscoveryCase the object to create/update
     * @return the created EdiscoveryCase
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public EdiscoveryCase put(final EdiscoveryCase newEdiscoveryCase) throws ClientException {
        return send(HttpMethod.PUT, newEdiscoveryCase);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IEdiscoveryCaseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (EdiscoveryCaseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IEdiscoveryCaseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (EdiscoveryCaseRequest)this;
     }

}


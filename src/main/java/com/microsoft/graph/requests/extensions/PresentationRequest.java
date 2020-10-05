// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Presentation;
import com.microsoft.graph.requests.extensions.IDocumentCommentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDocumentCommentRequestBuilder;
import com.microsoft.graph.requests.extensions.DocumentCommentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DocumentCommentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Presentation Request.
 */
public class PresentationRequest extends BaseRequest implements IPresentationRequest {
	
    /**
     * The request for the Presentation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PresentationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Presentation.class);
    }

    /**
     * Gets the Presentation from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super Presentation> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Presentation from the service
     *
     * @return the Presentation from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Presentation get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super Presentation> callback) {
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
     * Patches this Presentation with a source
     *
     * @param sourcePresentation the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Presentation sourcePresentation, final ICallback<? super Presentation> callback) {
        send(HttpMethod.PATCH, callback, sourcePresentation);
    }

    /**
     * Patches this Presentation with a source
     *
     * @param sourcePresentation the source object with updates
     * @return the updated Presentation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Presentation patch(final Presentation sourcePresentation) throws ClientException {
        return send(HttpMethod.PATCH, sourcePresentation);
    }

    /**
     * Creates a Presentation with a new object
     *
     * @param newPresentation the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Presentation newPresentation, final ICallback<? super Presentation> callback) {
        send(HttpMethod.POST, callback, newPresentation);
    }

    /**
     * Creates a Presentation with a new object
     *
     * @param newPresentation the new object to create
     * @return the created Presentation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Presentation post(final Presentation newPresentation) throws ClientException {
        return send(HttpMethod.POST, newPresentation);
    }

    /**
     * Creates a Presentation with a new object
     *
     * @param newPresentation the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Presentation newPresentation, final ICallback<? super Presentation> callback) {
        send(HttpMethod.PUT, callback, newPresentation);
    }

    /**
     * Creates a Presentation with a new object
     *
     * @param newPresentation the object to create/update
     * @return the created Presentation
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Presentation put(final Presentation newPresentation) throws ClientException {
        return send(HttpMethod.PUT, newPresentation);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPresentationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PresentationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPresentationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PresentationRequest)this;
     }

}


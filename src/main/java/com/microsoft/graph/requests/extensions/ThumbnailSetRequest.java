// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ThumbnailSet;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Thumbnail Set Request.
 */
public class ThumbnailSetRequest extends BaseRequest implements IThumbnailSetRequest {
	
    /**
     * The request for the ThumbnailSet
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ThumbnailSetRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ThumbnailSet.class);
    }

    /**
     * Gets the ThumbnailSet from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super ThumbnailSet> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ThumbnailSet from the service
     *
     * @return the ThumbnailSet from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThumbnailSet get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super ThumbnailSet> callback) {
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
     * Patches this ThumbnailSet with a source
     *
     * @param sourceThumbnailSet the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ThumbnailSet sourceThumbnailSet, final ICallback<? super ThumbnailSet> callback) {
        send(HttpMethod.PATCH, callback, sourceThumbnailSet);
    }

    /**
     * Patches this ThumbnailSet with a source
     *
     * @param sourceThumbnailSet the source object with updates
     * @return the updated ThumbnailSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThumbnailSet patch(final ThumbnailSet sourceThumbnailSet) throws ClientException {
        return send(HttpMethod.PATCH, sourceThumbnailSet);
    }

    /**
     * Creates a ThumbnailSet with a new object
     *
     * @param newThumbnailSet the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ThumbnailSet newThumbnailSet, final ICallback<? super ThumbnailSet> callback) {
        send(HttpMethod.POST, callback, newThumbnailSet);
    }

    /**
     * Creates a ThumbnailSet with a new object
     *
     * @param newThumbnailSet the new object to create
     * @return the created ThumbnailSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThumbnailSet post(final ThumbnailSet newThumbnailSet) throws ClientException {
        return send(HttpMethod.POST, newThumbnailSet);
    }

    /**
     * Creates a ThumbnailSet with a new object
     *
     * @param newThumbnailSet the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final ThumbnailSet newThumbnailSet, final ICallback<? super ThumbnailSet> callback) {
        send(HttpMethod.PUT, callback, newThumbnailSet);
    }

    /**
     * Creates a ThumbnailSet with a new object
     *
     * @param newThumbnailSet the object to create/update
     * @return the created ThumbnailSet
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ThumbnailSet put(final ThumbnailSet newThumbnailSet) throws ClientException {
        return send(HttpMethod.PUT, newThumbnailSet);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IThumbnailSetRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ThumbnailSetRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IThumbnailSetRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ThumbnailSetRequest)this;
     }

}


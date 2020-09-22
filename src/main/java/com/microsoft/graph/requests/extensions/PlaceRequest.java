// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Place;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Place Request.
 */
public class PlaceRequest extends BaseRequest implements IPlaceRequest {
	
    /**
     * The request for the Place
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public PlaceRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends Place> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the Place
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PlaceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Place.class);
    }

    /**
     * Gets the Place from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Place> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Place from the service
     *
     * @return the Place from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Place get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Place> callback) {
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
     * Patches this Place with a source
     *
     * @param sourcePlace the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Place sourcePlace, final ICallback<Place> callback) {
        send(HttpMethod.PATCH, callback, sourcePlace);
    }

    /**
     * Patches this Place with a source
     *
     * @param sourcePlace the source object with updates
     * @return the updated Place
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Place patch(final Place sourcePlace) throws ClientException {
        return send(HttpMethod.PATCH, sourcePlace);
    }

    /**
     * Creates a Place with a new object
     *
     * @param newPlace the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Place newPlace, final ICallback<Place> callback) {
        send(HttpMethod.POST, callback, newPlace);
    }

    /**
     * Creates a Place with a new object
     *
     * @param newPlace the new object to create
     * @return the created Place
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Place post(final Place newPlace) throws ClientException {
        return send(HttpMethod.POST, newPlace);
    }

    /**
     * Creates a Place with a new object
     *
     * @param newPlace the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final Place newPlace, final ICallback<Place> callback) {
        send(HttpMethod.PUT, callback, newPlace);
    }

    /**
     * Creates a Place with a new object
     *
     * @param newPlace the object to create/update
     * @return the created Place
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Place put(final Place newPlace) throws ClientException {
        return send(HttpMethod.PUT, newPlace);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPlaceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PlaceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPlaceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PlaceRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IPlaceRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (PlaceRequest)this;
     }

}


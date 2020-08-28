// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BookingNamedEntity;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Named Entity Request.
 */
public class BookingNamedEntityRequest extends BaseRequest implements IBookingNamedEntityRequest {
	
    /**
     * The request for the BookingNamedEntity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BookingNamedEntityRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends BookingNamedEntity> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the BookingNamedEntity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingNamedEntityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingNamedEntity.class);
    }

    /**
     * Gets the BookingNamedEntity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<BookingNamedEntity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the BookingNamedEntity from the service
     *
     * @return the BookingNamedEntity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingNamedEntity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<BookingNamedEntity> callback) {
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
     * Patches this BookingNamedEntity with a source
     *
     * @param sourceBookingNamedEntity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final BookingNamedEntity sourceBookingNamedEntity, final ICallback<BookingNamedEntity> callback) {
        send(HttpMethod.PATCH, callback, sourceBookingNamedEntity);
    }

    /**
     * Patches this BookingNamedEntity with a source
     *
     * @param sourceBookingNamedEntity the source object with updates
     * @return the updated BookingNamedEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingNamedEntity patch(final BookingNamedEntity sourceBookingNamedEntity) throws ClientException {
        return send(HttpMethod.PATCH, sourceBookingNamedEntity);
    }

    /**
     * Creates a BookingNamedEntity with a new object
     *
     * @param newBookingNamedEntity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final BookingNamedEntity newBookingNamedEntity, final ICallback<BookingNamedEntity> callback) {
        send(HttpMethod.POST, callback, newBookingNamedEntity);
    }

    /**
     * Creates a BookingNamedEntity with a new object
     *
     * @param newBookingNamedEntity the new object to create
     * @return the created BookingNamedEntity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingNamedEntity post(final BookingNamedEntity newBookingNamedEntity) throws ClientException {
        return send(HttpMethod.POST, newBookingNamedEntity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IBookingNamedEntityRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (BookingNamedEntityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IBookingNamedEntityRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (BookingNamedEntityRequest)this;
     }

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BookingPerson;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Person Request.
 */
public class BookingPersonRequest extends BaseRequest implements IBookingPersonRequest {
	
    /**
     * The request for the BookingPerson
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public BookingPersonRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends BookingPerson> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the BookingPerson
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingPersonRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingPerson.class);
    }

    /**
     * Gets the BookingPerson from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super BookingPerson> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the BookingPerson from the service
     *
     * @return the BookingPerson from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingPerson get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super BookingPerson> callback) {
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
     * Patches this BookingPerson with a source
     *
     * @param sourceBookingPerson the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final BookingPerson sourceBookingPerson, final ICallback<? super BookingPerson> callback) {
        send(HttpMethod.PATCH, callback, sourceBookingPerson);
    }

    /**
     * Patches this BookingPerson with a source
     *
     * @param sourceBookingPerson the source object with updates
     * @return the updated BookingPerson
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingPerson patch(final BookingPerson sourceBookingPerson) throws ClientException {
        return send(HttpMethod.PATCH, sourceBookingPerson);
    }

    /**
     * Creates a BookingPerson with a new object
     *
     * @param newBookingPerson the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final BookingPerson newBookingPerson, final ICallback<? super BookingPerson> callback) {
        send(HttpMethod.POST, callback, newBookingPerson);
    }

    /**
     * Creates a BookingPerson with a new object
     *
     * @param newBookingPerson the new object to create
     * @return the created BookingPerson
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingPerson post(final BookingPerson newBookingPerson) throws ClientException {
        return send(HttpMethod.POST, newBookingPerson);
    }

    /**
     * Creates a BookingPerson with a new object
     *
     * @param newBookingPerson the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final BookingPerson newBookingPerson, final ICallback<? super BookingPerson> callback) {
        send(HttpMethod.PUT, callback, newBookingPerson);
    }

    /**
     * Creates a BookingPerson with a new object
     *
     * @param newBookingPerson the object to create/update
     * @return the created BookingPerson
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingPerson put(final BookingPerson newBookingPerson) throws ClientException {
        return send(HttpMethod.PUT, newBookingPerson);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IBookingPersonRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (BookingPersonRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IBookingPersonRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (BookingPersonRequest)this;
     }

}


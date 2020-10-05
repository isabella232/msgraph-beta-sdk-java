// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BookingService;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Service Request.
 */
public class BookingServiceRequest extends BaseRequest implements IBookingServiceRequest {
	
    /**
     * The request for the BookingService
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingServiceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingService.class);
    }

    /**
     * Gets the BookingService from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super BookingService> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the BookingService from the service
     *
     * @return the BookingService from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingService get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super BookingService> callback) {
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
     * Patches this BookingService with a source
     *
     * @param sourceBookingService the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final BookingService sourceBookingService, final ICallback<? super BookingService> callback) {
        send(HttpMethod.PATCH, callback, sourceBookingService);
    }

    /**
     * Patches this BookingService with a source
     *
     * @param sourceBookingService the source object with updates
     * @return the updated BookingService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingService patch(final BookingService sourceBookingService) throws ClientException {
        return send(HttpMethod.PATCH, sourceBookingService);
    }

    /**
     * Creates a BookingService with a new object
     *
     * @param newBookingService the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final BookingService newBookingService, final ICallback<? super BookingService> callback) {
        send(HttpMethod.POST, callback, newBookingService);
    }

    /**
     * Creates a BookingService with a new object
     *
     * @param newBookingService the new object to create
     * @return the created BookingService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingService post(final BookingService newBookingService) throws ClientException {
        return send(HttpMethod.POST, newBookingService);
    }

    /**
     * Creates a BookingService with a new object
     *
     * @param newBookingService the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final BookingService newBookingService, final ICallback<? super BookingService> callback) {
        send(HttpMethod.PUT, callback, newBookingService);
    }

    /**
     * Creates a BookingService with a new object
     *
     * @param newBookingService the object to create/update
     * @return the created BookingService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingService put(final BookingService newBookingService) throws ClientException {
        return send(HttpMethod.PUT, newBookingService);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IBookingServiceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (BookingServiceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IBookingServiceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (BookingServiceRequest)this;
     }

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BookingBusiness;
import com.microsoft.graph.requests.extensions.IBookingAppointmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingAppointmentRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingAppointmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingAppointmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCustomerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingCustomerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingCustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingServiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingServiceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingServiceRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingStaffMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingStaffMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingStaffMemberCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.BookingStaffMemberRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Business Request.
 */
public class BookingBusinessRequest extends BaseRequest implements IBookingBusinessRequest {
	
    /**
     * The request for the BookingBusiness
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingBusinessRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingBusiness.class);
    }

    /**
     * Gets the BookingBusiness from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<BookingBusiness> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the BookingBusiness from the service
     *
     * @return the BookingBusiness from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingBusiness get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<BookingBusiness> callback) {
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
     * Patches this BookingBusiness with a source
     *
     * @param sourceBookingBusiness the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final BookingBusiness sourceBookingBusiness, final ICallback<BookingBusiness> callback) {
        send(HttpMethod.PATCH, callback, sourceBookingBusiness);
    }

    /**
     * Patches this BookingBusiness with a source
     *
     * @param sourceBookingBusiness the source object with updates
     * @return the updated BookingBusiness
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingBusiness patch(final BookingBusiness sourceBookingBusiness) throws ClientException {
        return send(HttpMethod.PATCH, sourceBookingBusiness);
    }

    /**
     * Creates a BookingBusiness with a new object
     *
     * @param newBookingBusiness the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final BookingBusiness newBookingBusiness, final ICallback<BookingBusiness> callback) {
        send(HttpMethod.POST, callback, newBookingBusiness);
    }

    /**
     * Creates a BookingBusiness with a new object
     *
     * @param newBookingBusiness the new object to create
     * @return the created BookingBusiness
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public BookingBusiness post(final BookingBusiness newBookingBusiness) throws ClientException {
        return send(HttpMethod.POST, newBookingBusiness);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IBookingBusinessRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (BookingBusinessRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IBookingBusinessRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (BookingBusinessRequest)this;
     }

}


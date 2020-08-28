// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BookingBusiness;
import com.microsoft.graph.models.extensions.BookingCustomer;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IBookingCustomerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCustomerRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingCustomerCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Customer Collection Request Builder.
 */
public class BookingCustomerCollectionRequestBuilder extends BaseRequestBuilder implements IBookingCustomerCollectionRequestBuilder {

    /**
     * The request builder for this collection of BookingBusiness
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingCustomerCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IBookingCustomerCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IBookingCustomerCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new BookingCustomerCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IBookingCustomerRequestBuilder byId(final String id) {
        return new BookingCustomerRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

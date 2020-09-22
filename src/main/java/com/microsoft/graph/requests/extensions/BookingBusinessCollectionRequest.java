// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BookingBusiness;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IBookingBusinessCollectionPage;
import com.microsoft.graph.requests.extensions.BookingBusinessCollectionResponse;
import com.microsoft.graph.requests.extensions.IBookingBusinessCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBookingBusinessCollectionRequest;
import com.microsoft.graph.requests.extensions.BookingBusinessCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Booking Business Collection Request.
 */
public class BookingBusinessCollectionRequest extends BaseCollectionRequest<BookingBusinessCollectionResponse, IBookingBusinessCollectionPage> implements IBookingBusinessCollectionRequest {

    /**
     * The request builder for this collection of BookingBusiness
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BookingBusinessCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BookingBusinessCollectionResponse.class, IBookingBusinessCollectionPage.class);
    }

    public void get(final ICallback<IBookingBusinessCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IBookingBusinessCollectionPage get() throws ClientException {
        final BookingBusinessCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final BookingBusiness newBookingBusiness, final ICallback<BookingBusiness> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new BookingBusinessRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newBookingBusiness, callback);
    }

    public BookingBusiness post(final BookingBusiness newBookingBusiness) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new BookingBusinessRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newBookingBusiness);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IBookingBusinessCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (BookingBusinessCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IBookingBusinessCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (BookingBusinessCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IBookingBusinessCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (BookingBusinessCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IBookingBusinessCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (BookingBusinessCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IBookingBusinessCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (BookingBusinessCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IBookingBusinessCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IBookingBusinessCollectionRequest)this;
    }
    public IBookingBusinessCollectionPage buildFromResponse(final BookingBusinessCollectionResponse response) {
        final IBookingBusinessCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new BookingBusinessCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BookingBusinessCollectionPage page = new BookingBusinessCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

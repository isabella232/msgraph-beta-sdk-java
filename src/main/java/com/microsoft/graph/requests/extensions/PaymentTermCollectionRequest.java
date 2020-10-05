// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.PaymentTerm;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPaymentTermCollectionPage;
import com.microsoft.graph.requests.extensions.PaymentTermCollectionResponse;
import com.microsoft.graph.requests.extensions.IPaymentTermCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPaymentTermCollectionRequest;
import com.microsoft.graph.requests.extensions.PaymentTermCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Payment Term Collection Request.
 */
public class PaymentTermCollectionRequest extends BaseCollectionRequest<PaymentTermCollectionResponse, IPaymentTermCollectionPage> implements IPaymentTermCollectionRequest {

    /**
     * The request builder for this collection of PaymentTerm
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PaymentTermCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PaymentTermCollectionResponse.class, IPaymentTermCollectionPage.class);
    }

    public void get(final ICallback<? super IPaymentTermCollectionPage> callback) {
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

    public IPaymentTermCollectionPage get() throws ClientException {
        final PaymentTermCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PaymentTerm newPaymentTerm, final ICallback<? super PaymentTerm> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PaymentTermRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPaymentTerm, callback);
    }

    public PaymentTerm post(final PaymentTerm newPaymentTerm) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PaymentTermRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPaymentTerm);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPaymentTermCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PaymentTermCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPaymentTermCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PaymentTermCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IPaymentTermCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (PaymentTermCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPaymentTermCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PaymentTermCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPaymentTermCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PaymentTermCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPaymentTermCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PaymentTermCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPaymentTermCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPaymentTermCollectionRequest)this;
    }
    public IPaymentTermCollectionPage buildFromResponse(final PaymentTermCollectionResponse response) {
        final IPaymentTermCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PaymentTermCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PaymentTermCollectionPage page = new PaymentTermCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

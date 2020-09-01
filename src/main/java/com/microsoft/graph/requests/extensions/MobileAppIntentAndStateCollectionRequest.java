// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.User;
import com.microsoft.graph.models.extensions.MobileAppIntentAndState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IMobileAppIntentAndStateCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppIntentAndStateCollectionResponse;
import com.microsoft.graph.requests.extensions.IMobileAppIntentAndStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppIntentAndStateCollectionRequest;
import com.microsoft.graph.requests.extensions.MobileAppIntentAndStateCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Intent And State Collection Request.
 */
public class MobileAppIntentAndStateCollectionRequest extends BaseCollectionRequest<MobileAppIntentAndStateCollectionResponse, IMobileAppIntentAndStateCollectionPage> implements IMobileAppIntentAndStateCollectionRequest {

    /**
     * The request builder for this collection of MobileAppIntentAndState
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppIntentAndStateCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppIntentAndStateCollectionResponse.class, IMobileAppIntentAndStateCollectionPage.class);
    }

    public void get(final ICallback<IMobileAppIntentAndStateCollectionPage> callback) {
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

    public IMobileAppIntentAndStateCollectionPage get() throws ClientException {
        final MobileAppIntentAndStateCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MobileAppIntentAndState newMobileAppIntentAndState, final ICallback<MobileAppIntentAndState> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MobileAppIntentAndStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMobileAppIntentAndState, callback);
    }

    public MobileAppIntentAndState post(final MobileAppIntentAndState newMobileAppIntentAndState) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MobileAppIntentAndStateRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newMobileAppIntentAndState);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMobileAppIntentAndStateCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MobileAppIntentAndStateCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMobileAppIntentAndStateCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MobileAppIntentAndStateCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMobileAppIntentAndStateCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MobileAppIntentAndStateCollectionRequest)this;
    }

    public IMobileAppIntentAndStateCollectionPage buildFromResponse(final MobileAppIntentAndStateCollectionResponse response) {
        final IMobileAppIntentAndStateCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MobileAppIntentAndStateCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MobileAppIntentAndStateCollectionPage page = new MobileAppIntentAndStateCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
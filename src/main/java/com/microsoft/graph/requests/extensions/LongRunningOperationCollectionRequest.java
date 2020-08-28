// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.models.extensions.LongRunningOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ILongRunningOperationCollectionPage;
import com.microsoft.graph.requests.extensions.LongRunningOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.ILongRunningOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILongRunningOperationCollectionRequest;
import com.microsoft.graph.requests.extensions.LongRunningOperationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Long Running Operation Collection Request.
 */
public class LongRunningOperationCollectionRequest extends BaseCollectionRequest<LongRunningOperationCollectionResponse, ILongRunningOperationCollectionPage> implements ILongRunningOperationCollectionRequest {

    /**
     * The request builder for this collection of LongRunningOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LongRunningOperationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, LongRunningOperationCollectionResponse.class, ILongRunningOperationCollectionPage.class);
    }

    public void get(final ICallback<ILongRunningOperationCollectionPage> callback) {
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

    public ILongRunningOperationCollectionPage get() throws ClientException {
        final LongRunningOperationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final LongRunningOperation newLongRunningOperation, final ICallback<LongRunningOperation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new LongRunningOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newLongRunningOperation, callback);
    }

    public LongRunningOperation post(final LongRunningOperation newLongRunningOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new LongRunningOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newLongRunningOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ILongRunningOperationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (LongRunningOperationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ILongRunningOperationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (LongRunningOperationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ILongRunningOperationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (LongRunningOperationCollectionRequest)this;
    }

    public ILongRunningOperationCollectionPage buildFromResponse(final LongRunningOperationCollectionResponse response) {
        final ILongRunningOperationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new LongRunningOperationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final LongRunningOperationCollectionPage page = new LongRunningOperationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

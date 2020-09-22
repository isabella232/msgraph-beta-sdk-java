// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Call;
import com.microsoft.graph.models.extensions.CommsOperation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ICommsOperationCollectionPage;
import com.microsoft.graph.requests.extensions.CommsOperationCollectionResponse;
import com.microsoft.graph.requests.extensions.ICommsOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICommsOperationCollectionRequest;
import com.microsoft.graph.requests.extensions.CommsOperationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Comms Operation Collection Request.
 */
public class CommsOperationCollectionRequest extends BaseCollectionRequest<CommsOperationCollectionResponse, ICommsOperationCollectionPage> implements ICommsOperationCollectionRequest {

    /**
     * The request builder for this collection of CommsOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CommsOperationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CommsOperationCollectionResponse.class, ICommsOperationCollectionPage.class);
    }

    public void get(final ICallback<ICommsOperationCollectionPage> callback) {
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

    public ICommsOperationCollectionPage get() throws ClientException {
        final CommsOperationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final CommsOperation newCommsOperation, final ICallback<CommsOperation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CommsOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCommsOperation, callback);
    }

    public CommsOperation post(final CommsOperation newCommsOperation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CommsOperationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newCommsOperation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICommsOperationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CommsOperationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ICommsOperationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (CommsOperationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICommsOperationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CommsOperationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICommsOperationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (CommsOperationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ICommsOperationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (CommsOperationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ICommsOperationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ICommsOperationCollectionRequest)this;
    }
    public ICommsOperationCollectionPage buildFromResponse(final CommsOperationCollectionResponse response) {
        final ICommsOperationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CommsOperationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final CommsOperationCollectionPage page = new CommsOperationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

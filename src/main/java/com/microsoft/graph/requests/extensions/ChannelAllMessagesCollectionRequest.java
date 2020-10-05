// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ChatMessage;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IChannelAllMessagesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ChannelAllMessagesCollectionPage;
import com.microsoft.graph.requests.extensions.ChannelAllMessagesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Channel All Messages Collection Request.
 */
public class ChannelAllMessagesCollectionRequest extends BaseCollectionRequest<ChannelAllMessagesCollectionResponse, IChannelAllMessagesCollectionPage> implements IChannelAllMessagesCollectionRequest {


    /**
     * The request for this ChannelAllMessages
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ChannelAllMessagesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ChannelAllMessagesCollectionResponse.class, IChannelAllMessagesCollectionPage.class);
    }


    public void get(final ICallback<? super IChannelAllMessagesCollectionPage> callback) {
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

    public IChannelAllMessagesCollectionPage get() throws ClientException {
        final ChannelAllMessagesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IChannelAllMessagesCollectionPage buildFromResponse(final ChannelAllMessagesCollectionResponse response) {
        final IChannelAllMessagesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new ChannelAllMessagesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IChannelAllMessagesCollectionPage page = new ChannelAllMessagesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IChannelAllMessagesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IChannelAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IChannelAllMessagesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IChannelAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IChannelAllMessagesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IChannelAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IChannelAllMessagesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IChannelAllMessagesCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IChannelAllMessagesCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IChannelAllMessagesCollectionRequest)this;
    }

}

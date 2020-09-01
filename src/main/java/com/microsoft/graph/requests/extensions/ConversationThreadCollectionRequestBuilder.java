// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Conversation;
import com.microsoft.graph.models.extensions.ConversationThread;
import com.microsoft.graph.models.extensions.Post;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Thread Collection Request Builder.
 */
public class ConversationThreadCollectionRequestBuilder extends BaseRequestBuilder implements IConversationThreadCollectionRequestBuilder {

    /**
     * The request builder for this collection of Conversation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConversationThreadCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IConversationThreadCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IConversationThreadCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ConversationThreadCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IConversationThreadRequestBuilder byId(final String id) {
        return new ConversationThreadRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Conversation;
import com.microsoft.graph.requests.extensions.IConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationThreadRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ConversationThreadRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Conversation Request Builder.
 */
public class ConversationRequestBuilder extends BaseRequestBuilder implements IConversationRequestBuilder {

    /**
     * The request builder for the Conversation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ConversationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IConversationRequest instance
     */
    public IConversationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IConversationRequest instance
     */
    public IConversationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ConversationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IConversationThreadCollectionRequestBuilder threads() {
        return new ConversationThreadCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("threads"), getClient(), null);
    }

    public IConversationThreadRequestBuilder threads(final String id) {
        return new ConversationThreadRequestBuilder(getRequestUrlWithAdditionalSegment("threads") + "/" + id, getClient(), null);
    }
}
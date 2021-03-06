// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IMessageUnsubscribeRequest;
import com.microsoft.graph.requests.extensions.MessageUnsubscribeRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Message Unsubscribe Request Builder.
 */
public class MessageUnsubscribeRequestBuilder extends BaseActionRequestBuilder implements IMessageUnsubscribeRequestBuilder {

    /**
     * The request builder for this MessageUnsubscribe
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MessageUnsubscribeRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IMessageUnsubscribeRequest
     *
     * @param requestOptions the options for the request
     * @return the IMessageUnsubscribeRequest instance
     */
    public IMessageUnsubscribeRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IMessageUnsubscribeRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IMessageUnsubscribeRequest instance
     */
    public IMessageUnsubscribeRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        MessageUnsubscribeRequest request = new MessageUnsubscribeRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

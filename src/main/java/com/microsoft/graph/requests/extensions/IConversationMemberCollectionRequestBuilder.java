// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Channel;
import com.microsoft.graph.models.extensions.ConversationMember;
import com.microsoft.graph.models.extensions.ActionResultPart;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IConversationMemberRequestBuilder;
import com.microsoft.graph.requests.extensions.IConversationMemberCollectionRequest;
import com.microsoft.graph.requests.extensions.IConversationMemberAddCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Conversation Member Collection Request Builder.
 */
public interface IConversationMemberCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IConversationMemberCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IConversationMemberCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IConversationMemberRequestBuilder byId(final String id);


    IConversationMemberAddCollectionRequestBuilder add(final java.util.List<ConversationMember> values);
}

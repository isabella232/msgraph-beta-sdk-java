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

import com.microsoft.graph.requests.extensions.IChatAllMessagesCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Chat All Messages Collection Request Builder.
 */
public interface IChatAllMessagesCollectionRequestBuilder extends IRequestBuilder {

    IChatAllMessagesCollectionRequest buildRequest();

    IChatAllMessagesCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}

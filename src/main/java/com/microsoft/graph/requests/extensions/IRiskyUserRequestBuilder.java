// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RiskyUser;
import com.microsoft.graph.requests.extensions.IRiskyUserHistoryItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRiskyUserHistoryItemRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Risky User Request Builder.
 */
public interface IRiskyUserRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IRiskyUserRequest instance
     */
    IRiskyUserRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IRiskyUserRequest instance
     */
    IRiskyUserRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IRiskyUserHistoryItemCollectionRequestBuilder history();

    IRiskyUserHistoryItemRequestBuilder history(final String id);

}
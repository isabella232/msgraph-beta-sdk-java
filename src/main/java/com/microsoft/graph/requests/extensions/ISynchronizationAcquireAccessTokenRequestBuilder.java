// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISynchronizationAcquireAccessTokenRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Synchronization Acquire Access Token Request Builder.
 */
public interface ISynchronizationAcquireAccessTokenRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ISynchronizationAcquireAccessTokenRequest
     *
     * @param requestOptions the options for the request
     * @return the ISynchronizationAcquireAccessTokenRequest instance
     */
    ISynchronizationAcquireAccessTokenRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ISynchronizationAcquireAccessTokenRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ISynchronizationAcquireAccessTokenRequest instance
     */
    ISynchronizationAcquireAccessTokenRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

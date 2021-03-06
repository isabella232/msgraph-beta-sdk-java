// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISynchronizationJobStartRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Synchronization Job Start Request Builder.
 */
public interface ISynchronizationJobStartRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ISynchronizationJobStartRequest
     *
     * @param requestOptions the options for the request
     * @return the ISynchronizationJobStartRequest instance
     */
    ISynchronizationJobStartRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the ISynchronizationJobStartRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ISynchronizationJobStartRequest instance
     */
    ISynchronizationJobStartRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

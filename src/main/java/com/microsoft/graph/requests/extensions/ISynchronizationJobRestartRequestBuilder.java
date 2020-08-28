// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ISynchronizationJobRestartRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Synchronization Job Restart Request Builder.
 */
public interface ISynchronizationJobRestartRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ISynchronizationJobRestartRequest
     *
     * @return the ISynchronizationJobRestartRequest instance
     */
    ISynchronizationJobRestartRequest buildRequest();

    /**
     * Creates the ISynchronizationJobRestartRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ISynchronizationJobRestartRequest instance
     */
    ISynchronizationJobRestartRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

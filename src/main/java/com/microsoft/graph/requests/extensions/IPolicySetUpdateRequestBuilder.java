// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPolicySetUpdateRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Policy Set Update Request Builder.
 */
public interface IPolicySetUpdateRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IPolicySetUpdateRequest
     *
     * @param requestOptions the options for the request
     * @return the IPolicySetUpdateRequest instance
     */
    IPolicySetUpdateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IPolicySetUpdateRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IPolicySetUpdateRequest instance
     */
    IPolicySetUpdateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

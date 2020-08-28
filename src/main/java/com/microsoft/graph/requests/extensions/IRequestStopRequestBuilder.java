// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IRequestStopRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Request Stop Request Builder.
 */
public interface IRequestStopRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IRequestStopRequest
     *
     * @return the IRequestStopRequest instance
     */
    IRequestStopRequest buildRequest();

    /**
     * Creates the IRequestStopRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IRequestStopRequest instance
     */
    IRequestStopRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

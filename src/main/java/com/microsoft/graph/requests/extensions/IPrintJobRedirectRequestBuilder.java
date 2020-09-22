// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrintJobRedirectRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Job Redirect Request Builder.
 */
public interface IPrintJobRedirectRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IPrintJobRedirectRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobRedirectRequest instance
     */
    IPrintJobRedirectRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IPrintJobRedirectRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobRedirectRequest instance
     */
    IPrintJobRedirectRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

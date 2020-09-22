// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IApplicationTemplateInstantiateRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Application Template Instantiate Request Builder.
 */
public interface IApplicationTemplateInstantiateRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IApplicationTemplateInstantiateRequest
     *
     * @param requestOptions the options for the request
     * @return the IApplicationTemplateInstantiateRequest instance
     */
    IApplicationTemplateInstantiateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IApplicationTemplateInstantiateRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IApplicationTemplateInstantiateRequest instance
     */
    IApplicationTemplateInstantiateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ICallAnswerRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Call Answer Request Builder.
 */
public interface ICallAnswerRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ICallAnswerRequest
     *
     * @return the ICallAnswerRequest instance
     */
    ICallAnswerRequest buildRequest();

    /**
     * Creates the ICallAnswerRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ICallAnswerRequest instance
     */
    ICallAnswerRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITrustFrameworkKeySetUploadSecretRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Trust Framework Key Set Upload Secret Request Builder.
 */
public interface ITrustFrameworkKeySetUploadSecretRequestBuilder extends IRequestBuilder {

    /**
     * Creates the ITrustFrameworkKeySetUploadSecretRequest
     *
     * @return the ITrustFrameworkKeySetUploadSecretRequest instance
     */
    ITrustFrameworkKeySetUploadSecretRequest buildRequest();

    /**
     * Creates the ITrustFrameworkKeySetUploadSecretRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the ITrustFrameworkKeySetUploadSecretRequest instance
     */
    ITrustFrameworkKeySetUploadSecretRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
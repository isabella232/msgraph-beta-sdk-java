// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IServicePrincipalGetPasswordSingleSignOnCredentialsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Service Principal Get Password Single Sign On Credentials Request Builder.
 */
public interface IServicePrincipalGetPasswordSingleSignOnCredentialsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IServicePrincipalGetPasswordSingleSignOnCredentialsRequest
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalGetPasswordSingleSignOnCredentialsRequest instance
     */
    IServicePrincipalGetPasswordSingleSignOnCredentialsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IServicePrincipalGetPasswordSingleSignOnCredentialsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalGetPasswordSingleSignOnCredentialsRequest instance
     */
    IServicePrincipalGetPasswordSingleSignOnCredentialsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Service Principal Create Password Single Sign On Credentials Request Builder.
 */
public interface IServicePrincipalCreatePasswordSingleSignOnCredentialsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest
     *
     * @return the IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest instance
     */
    IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest buildRequest();

    /**
     * Creates the IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest instance
     */
    IServicePrincipalCreatePasswordSingleSignOnCredentialsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

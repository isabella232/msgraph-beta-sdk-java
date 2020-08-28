// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IServicePrincipalDeletePasswordSingleSignOnCredentialsRequest;
import com.microsoft.graph.requests.extensions.ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Service Principal Delete Password Single Sign On Credentials Request Builder.
 */
public class ServicePrincipalDeletePasswordSingleSignOnCredentialsRequestBuilder extends BaseActionRequestBuilder implements IServicePrincipalDeletePasswordSingleSignOnCredentialsRequestBuilder {

    /**
     * The request builder for this ServicePrincipalDeletePasswordSingleSignOnCredentials
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param id the id
     */
    public ServicePrincipalDeletePasswordSingleSignOnCredentialsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String id) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("id", id);
    }

    /**
     * Creates the IServicePrincipalDeletePasswordSingleSignOnCredentialsRequest
     *
     * @return the IServicePrincipalDeletePasswordSingleSignOnCredentialsRequest instance
     */
    public IServicePrincipalDeletePasswordSingleSignOnCredentialsRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IServicePrincipalDeletePasswordSingleSignOnCredentialsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IServicePrincipalDeletePasswordSingleSignOnCredentialsRequest instance
     */
    public IServicePrincipalDeletePasswordSingleSignOnCredentialsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest request = new ServicePrincipalDeletePasswordSingleSignOnCredentialsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("id")) {
            request.body.id = getParameter("id");
        }

        return request;
    }
}

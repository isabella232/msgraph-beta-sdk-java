// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IApplicationTemplateInstantiateRequest;
import com.microsoft.graph.requests.extensions.ApplicationTemplateInstantiateRequest;
import com.microsoft.graph.models.extensions.ApplicationServicePrincipal;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Application Template Instantiate Request Builder.
 */
public class ApplicationTemplateInstantiateRequestBuilder extends BaseActionRequestBuilder implements IApplicationTemplateInstantiateRequestBuilder {

    /**
     * The request builder for this ApplicationTemplateInstantiate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param displayName the displayName
     */
    public ApplicationTemplateInstantiateRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String displayName) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("displayName", displayName);
    }

    /**
     * Creates the IApplicationTemplateInstantiateRequest
     *
     * @param requestOptions the options for the request
     * @return the IApplicationTemplateInstantiateRequest instance
     */
    public IApplicationTemplateInstantiateRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IApplicationTemplateInstantiateRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IApplicationTemplateInstantiateRequest instance
     */
    public IApplicationTemplateInstantiateRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ApplicationTemplateInstantiateRequest request = new ApplicationTemplateInstantiateRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("displayName")) {
            request.body.displayName = getParameter("displayName");
        }

        return request;
    }
}

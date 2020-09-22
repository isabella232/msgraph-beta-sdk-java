// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.BusinessFlowTemplate;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateRequestBuilder;
import com.microsoft.graph.requests.extensions.IBusinessFlowTemplateCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Business Flow Template Collection Request Builder.
 */
public class BusinessFlowTemplateCollectionRequestBuilder extends BaseRequestBuilder implements IBusinessFlowTemplateCollectionRequestBuilder {

    /**
     * The request builder for this collection of BusinessFlowTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BusinessFlowTemplateCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IBusinessFlowTemplateCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IBusinessFlowTemplateCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new BusinessFlowTemplateCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IBusinessFlowTemplateRequestBuilder byId(final String id) {
        return new BusinessFlowTemplateRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ResourceOperation;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Resource Operation Request Builder.
 */
public class ResourceOperationRequestBuilder extends BaseRequestBuilder implements IResourceOperationRequestBuilder {

    /**
     * The request builder for the ResourceOperation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ResourceOperationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IResourceOperationRequest instance
     */
    public IResourceOperationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IResourceOperationRequest instance
     */
    public IResourceOperationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ResourceOperationRequest(getRequestUrl(), getClient(), requestOptions);
    }



    public IResourceOperationGetScopesForUserCollectionRequestBuilder getScopesForUser(final String userid) {
        return new ResourceOperationGetScopesForUserCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.getScopesForUser"), getClient(), null, userid);
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExternalConnection;
import com.microsoft.graph.models.extensions.ExternalItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IExternalItemCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalItemRequestBuilder;
import com.microsoft.graph.requests.extensions.IExternalItemCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the External Item Collection Request Builder.
 */
public class ExternalItemCollectionRequestBuilder extends BaseRequestBuilder implements IExternalItemCollectionRequestBuilder {

    /**
     * The request builder for this collection of ExternalConnection
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExternalItemCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IExternalItemCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IExternalItemCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new ExternalItemCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IExternalItemRequestBuilder byId(final String id) {
        return new ExternalItemRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

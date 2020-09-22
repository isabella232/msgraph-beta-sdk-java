// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Dimension;
import com.microsoft.graph.models.extensions.DimensionValue;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDimensionValueCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDimensionValueRequestBuilder;
import com.microsoft.graph.requests.extensions.IDimensionValueCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dimension Value Collection Request Builder.
 */
public class DimensionValueCollectionRequestBuilder extends BaseRequestBuilder implements IDimensionValueCollectionRequestBuilder {

    /**
     * The request builder for this collection of Dimension
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DimensionValueCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDimensionValueCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IDimensionValueCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new DimensionValueCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IDimensionValueRequestBuilder byId(final String id) {
        return new DimensionValueRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

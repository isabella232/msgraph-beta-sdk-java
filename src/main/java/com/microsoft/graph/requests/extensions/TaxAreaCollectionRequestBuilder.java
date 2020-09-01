// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.TaxArea;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITaxAreaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITaxAreaRequestBuilder;
import com.microsoft.graph.requests.extensions.ITaxAreaCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tax Area Collection Request Builder.
 */
public class TaxAreaCollectionRequestBuilder extends BaseRequestBuilder implements ITaxAreaCollectionRequestBuilder {

    /**
     * The request builder for this collection of Company
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TaxAreaCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ITaxAreaCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ITaxAreaCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TaxAreaCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITaxAreaRequestBuilder byId(final String id) {
        return new TaxAreaRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
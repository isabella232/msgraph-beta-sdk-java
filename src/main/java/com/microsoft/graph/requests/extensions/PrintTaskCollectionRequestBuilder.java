// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintTaskDefinition;
import com.microsoft.graph.models.extensions.PrintTask;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrintTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Task Collection Request Builder.
 */
public class PrintTaskCollectionRequestBuilder extends BaseRequestBuilder implements IPrintTaskCollectionRequestBuilder {

    /**
     * The request builder for this collection of PrintTaskDefinition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintTaskCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IPrintTaskCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPrintTaskCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PrintTaskCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPrintTaskRequestBuilder byId(final String id) {
        return new PrintTaskRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

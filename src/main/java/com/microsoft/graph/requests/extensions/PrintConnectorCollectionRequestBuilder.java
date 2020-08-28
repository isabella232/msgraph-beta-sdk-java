// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Print;
import com.microsoft.graph.models.extensions.PrintConnector;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrintConnectorCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintConnectorCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Connector Collection Request Builder.
 */
public class PrintConnectorCollectionRequestBuilder extends BaseRequestBuilder implements IPrintConnectorCollectionRequestBuilder {

    /**
     * The request builder for this collection of Print
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintConnectorCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IPrintConnectorCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IPrintConnectorCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PrintConnectorCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPrintConnectorRequestBuilder byId(final String id) {
        return new PrintConnectorRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ReportRoot;
import com.microsoft.graph.models.extensions.PrintUsageSummaryByPrinter;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByPrinterCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByPrinterRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintUsageSummaryByPrinterCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Usage Summary By Printer Collection Request Builder.
 */
public class PrintUsageSummaryByPrinterCollectionRequestBuilder extends BaseRequestBuilder implements IPrintUsageSummaryByPrinterCollectionRequestBuilder {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintUsageSummaryByPrinterCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPrintUsageSummaryByPrinterCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IPrintUsageSummaryByPrinterCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new PrintUsageSummaryByPrinterCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IPrintUsageSummaryByPrinterRequestBuilder byId(final String id) {
        return new PrintUsageSummaryByPrinterRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrintJobStartPrintJobRequest;
import com.microsoft.graph.requests.extensions.PrintJobStartPrintJobRequest;
import com.microsoft.graph.models.extensions.PrintJobStatus;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Job Start Print Job Request Builder.
 */
public class PrintJobStartPrintJobRequestBuilder extends BaseActionRequestBuilder implements IPrintJobStartPrintJobRequestBuilder {

    /**
     * The request builder for this PrintJobStartPrintJob
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintJobStartPrintJobRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IPrintJobStartPrintJobRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobStartPrintJobRequest instance
     */
    public IPrintJobStartPrintJobRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IPrintJobStartPrintJobRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPrintJobStartPrintJobRequest instance
     */
    public IPrintJobStartPrintJobRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrintJobStartPrintJobRequest request = new PrintJobStartPrintJobRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

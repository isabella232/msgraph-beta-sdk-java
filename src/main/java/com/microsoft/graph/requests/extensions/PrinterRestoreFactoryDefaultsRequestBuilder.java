// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrinterRestoreFactoryDefaultsRequest;
import com.microsoft.graph.requests.extensions.PrinterRestoreFactoryDefaultsRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Restore Factory Defaults Request Builder.
 */
public class PrinterRestoreFactoryDefaultsRequestBuilder extends BaseActionRequestBuilder implements IPrinterRestoreFactoryDefaultsRequestBuilder {

    /**
     * The request builder for this PrinterRestoreFactoryDefaults
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterRestoreFactoryDefaultsRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IPrinterRestoreFactoryDefaultsRequest
     *
     * @param requestOptions the options for the request
     * @return the IPrinterRestoreFactoryDefaultsRequest instance
     */
    public IPrinterRestoreFactoryDefaultsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IPrinterRestoreFactoryDefaultsRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPrinterRestoreFactoryDefaultsRequest instance
     */
    public IPrinterRestoreFactoryDefaultsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrinterRestoreFactoryDefaultsRequest request = new PrinterRestoreFactoryDefaultsRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}
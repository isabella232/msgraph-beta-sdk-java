// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsBin2HexRequest;
import com.microsoft.graph.requests.extensions.WorkbookFunctionsBin2HexRequest;
import com.microsoft.graph.models.extensions.WorkbookFunctionResult;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Functions Bin2Hex Request Builder.
 */
public class WorkbookFunctionsBin2HexRequestBuilder extends BaseActionRequestBuilder implements IWorkbookFunctionsBin2HexRequestBuilder {

    /**
     * The request builder for this WorkbookFunctionsBin2Hex
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param number the number
     * @param places the places
     */
    public WorkbookFunctionsBin2HexRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final com.google.gson.JsonElement number, final com.google.gson.JsonElement places) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("number", number);
        bodyParams.put("places", places);
    }

    /**
     * Creates the IWorkbookFunctionsBin2HexRequest
     *
     * @return the IWorkbookFunctionsBin2HexRequest instance
     */
    public IWorkbookFunctionsBin2HexRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IWorkbookFunctionsBin2HexRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsBin2HexRequest instance
     */
    public IWorkbookFunctionsBin2HexRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        WorkbookFunctionsBin2HexRequest request = new WorkbookFunctionsBin2HexRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("number")) {
            request.body.number = getParameter("number");
        }

        if (hasParameter("places")) {
            request.body.places = getParameter("places");
        }

        return request;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootGetPrinterUsageSummaryRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetPrinterUsageSummaryRequest;
import com.microsoft.graph.models.extensions.PrinterUsageSummary;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Printer Usage Summary Request Builder.
 */
public class ReportRootGetPrinterUsageSummaryRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetPrinterUsageSummaryRequestBuilder {

    /**
     * The request builder for this ReportRootGetPrinterUsageSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param printerId the printerId
     * @param periodStart the periodStart
     * @param periodEnd the periodEnd
     */
    public ReportRootGetPrinterUsageSummaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String printerId, final java.util.Calendar periodStart, final java.util.Calendar periodEnd) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("printerId", printerId));
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("periodStart", periodStart));
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("periodEnd", periodEnd));
    }

    /**
     * Creates the IReportRootGetPrinterUsageSummaryRequest
     *
     * @return the IReportRootGetPrinterUsageSummaryRequest instance
     */
    public IReportRootGetPrinterUsageSummaryRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IReportRootGetPrinterUsageSummaryRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IReportRootGetPrinterUsageSummaryRequest instance
     */
    public IReportRootGetPrinterUsageSummaryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetPrinterUsageSummaryRequest request = new ReportRootGetPrinterUsageSummaryRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

      for (com.microsoft.graph.options.FunctionOption option : functionOptions) {
            request.addFunctionOption(option);
      }

        return request;
    }
}
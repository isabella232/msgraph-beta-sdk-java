// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.UserPrintUsageSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetPrintUsageSummariesByUserCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetPrintUsageSummariesByUserCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByUserCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Print Usage Summaries By User Collection Request Builder.
 */
public class ReportRootGetPrintUsageSummariesByUserCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetPrintUsageSummariesByUserCollectionRequestBuilder {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param periodStart the periodStart
     * @param periodEnd the periodEnd
     */
    public ReportRootGetPrintUsageSummariesByUserCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.Calendar periodStart, final java.util.Calendar periodEnd) {
        super(requestUrl, client, requestOptions);
     	 if(periodStart!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("periodStart", periodStart));
		}
       	 if(periodEnd!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("periodEnd", periodEnd));
		}
      }

    public IReportRootGetPrintUsageSummariesByUserCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IReportRootGetPrintUsageSummariesByUserCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetPrintUsageSummariesByUserCollectionRequest request = new ReportRootGetPrintUsageSummariesByUserCollectionRequest(
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
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintUsageSummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetPrintUsageSummariesByTimeSpanCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetPrintUsageSummariesByTimeSpanCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Print Usage Summaries By Time Span Collection Request Builder.
 */
public class ReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param periodStart the periodStart
     * @param periodEnd the periodEnd
     * @param timeSpanInMinutes the timeSpanInMinutes
     */
    public ReportRootGetPrintUsageSummariesByTimeSpanCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final java.util.Calendar periodStart, final java.util.Calendar periodEnd, final Integer timeSpanInMinutes) {
        super(requestUrl, client, requestOptions);
     	 if(periodStart!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("periodStart", periodStart));
		}
       	 if(periodEnd!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("periodEnd", periodEnd));
		}
       	 if(timeSpanInMinutes!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("timeSpanInMinutes", timeSpanInMinutes));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IReportRootGetPrintUsageSummariesByTimeSpanCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IReportRootGetPrintUsageSummariesByTimeSpanCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetPrintUsageSummariesByTimeSpanCollectionRequest request = new ReportRootGetPrintUsageSummariesByTimeSpanCollectionRequest(
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

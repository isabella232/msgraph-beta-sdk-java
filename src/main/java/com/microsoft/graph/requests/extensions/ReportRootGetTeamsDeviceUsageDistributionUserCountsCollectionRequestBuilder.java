// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageDistributionUserCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Teams Device Usage Distribution User Counts Collection Request Builder.
 */
public class ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
     	 if(period!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
		}
      }

    public IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest request = new ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequest(
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

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365GroupsActivityCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityCountsCollectionRequest;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityCountsCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Groups Activity Counts Collection Request Builder.
 */
public class ReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder {

    /**
     * The request builder for this collection of ReportRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param period the period
     */
    public ReportRootGetOffice365GroupsActivityCountsCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String period) {
        super(requestUrl, client, requestOptions);
     	 if(period!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("period", period));
		}
      }
    
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IReportRootGetOffice365GroupsActivityCountsCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IReportRootGetOffice365GroupsActivityCountsCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ReportRootGetOffice365GroupsActivityCountsCollectionRequest request = new ReportRootGetOffice365GroupsActivityCountsCollectionRequest(
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

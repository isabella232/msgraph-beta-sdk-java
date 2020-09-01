// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.generated.UserExperienceAnalyticsSummarizedBy;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDevicePerformance;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest;
import com.microsoft.graph.options.FunctionOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Performance Summarize Device Performance Devices Collection Request Builder.
 */
public class UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder extends BaseFunctionRequestBuilder implements IUserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder {

    /**
     * The request builder for this collection of UserExperienceAnalyticsDevicePerformance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param summarizeBy the summarizeBy
     */
    public UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final UserExperienceAnalyticsSummarizedBy summarizeBy) {
        super(requestUrl, client, requestOptions);
     	 if(summarizeBy!=null){
			functionOptions.add(new com.microsoft.graph.options.FunctionOption("summarizeBy", summarizeBy));
		}
      }

    public IUserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IUserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest request = new UserExperienceAnalyticsDevicePerformanceSummarizeDevicePerformanceDevicesCollectionRequest(
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
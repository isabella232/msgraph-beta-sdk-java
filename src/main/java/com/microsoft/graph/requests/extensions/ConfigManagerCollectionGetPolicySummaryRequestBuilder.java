// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IConfigManagerCollectionGetPolicySummaryRequest;
import com.microsoft.graph.requests.extensions.ConfigManagerCollectionGetPolicySummaryRequest;
import com.microsoft.graph.models.extensions.ConfigManagerPolicySummary;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Config Manager Collection Get Policy Summary Request Builder.
 */
public class ConfigManagerCollectionGetPolicySummaryRequestBuilder extends BaseFunctionRequestBuilder implements IConfigManagerCollectionGetPolicySummaryRequestBuilder {

    /**
     * The request builder for this ConfigManagerCollectionGetPolicySummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param policyId the policyId
     */
    public ConfigManagerCollectionGetPolicySummaryRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String policyId) {
        super(requestUrl, client, requestOptions);
        functionOptions.add(new com.microsoft.graph.options.FunctionOption("policyId", policyId));
    }

    /**
     * Creates the IConfigManagerCollectionGetPolicySummaryRequest
     *
     * @param requestOptions the options for the request
     * @return the IConfigManagerCollectionGetPolicySummaryRequest instance
     */
    public IConfigManagerCollectionGetPolicySummaryRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IConfigManagerCollectionGetPolicySummaryRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IConfigManagerCollectionGetPolicySummaryRequest instance
     */
    public IConfigManagerCollectionGetPolicySummaryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        ConfigManagerCollectionGetPolicySummaryRequest request = new ConfigManagerCollectionGetPolicySummaryRequest(
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
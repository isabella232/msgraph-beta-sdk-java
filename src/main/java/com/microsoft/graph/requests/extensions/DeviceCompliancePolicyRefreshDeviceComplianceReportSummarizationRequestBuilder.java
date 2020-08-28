// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Refresh Device Compliance Report Summarization Request Builder.
 */
public class DeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequestBuilder extends BaseActionRequestBuilder implements IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequestBuilder {

    /**
     * The request builder for this DeviceCompliancePolicyRefreshDeviceComplianceReportSummarization
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest
     *
     * @return the IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest instance
     */
    public IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest instance
     */
    public IDeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest request = new DeviceCompliancePolicyRefreshDeviceComplianceReportSummarizationRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

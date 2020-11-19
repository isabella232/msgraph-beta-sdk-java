// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetUnhealthyFirewallReportRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Reports Get Unhealthy Firewall Report Request Builder.
 */
public interface IDeviceManagementReportsGetUnhealthyFirewallReportRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementReportsGetUnhealthyFirewallReportRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetUnhealthyFirewallReportRequest instance
     */
    IDeviceManagementReportsGetUnhealthyFirewallReportRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceManagementReportsGetUnhealthyFirewallReportRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetUnhealthyFirewallReportRequest instance
     */
    IDeviceManagementReportsGetUnhealthyFirewallReportRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

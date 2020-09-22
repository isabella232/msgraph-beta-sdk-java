// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetDeviceInstallStatusReportRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Reports Get Device Install Status Report Request Builder.
 */
public interface IDeviceManagementReportsGetDeviceInstallStatusReportRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceManagementReportsGetDeviceInstallStatusReportRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetDeviceInstallStatusReportRequest instance
     */
    IDeviceManagementReportsGetDeviceInstallStatusReportRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IDeviceManagementReportsGetDeviceInstallStatusReportRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetDeviceInstallStatusReportRequest instance
     */
    IDeviceManagementReportsGetDeviceInstallStatusReportRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IReportRootManagedDeviceEnrollmentFailureTrendsRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Managed Device Enrollment Failure Trends Request Builder.
 */
public interface IReportRootManagedDeviceEnrollmentFailureTrendsRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IReportRootManagedDeviceEnrollmentFailureTrendsRequest
     *
     * @param requestOptions the options for the request
     * @return the IReportRootManagedDeviceEnrollmentFailureTrendsRequest instance
     */
    IReportRootManagedDeviceEnrollmentFailureTrendsRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IReportRootManagedDeviceEnrollmentFailureTrendsRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IReportRootManagedDeviceEnrollmentFailureTrendsRequest instance
     */
    IReportRootManagedDeviceEnrollmentFailureTrendsRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

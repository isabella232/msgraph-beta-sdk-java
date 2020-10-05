// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerDeviceUsageUserCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerDeviceUsageUserCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Yammer Device Usage User Counts Collection Page.
 */
public class ReportRootGetYammerDeviceUsageUserCountsCollectionPage extends BaseCollectionPage<YammerDeviceUsageUserCounts, IReportRootGetYammerDeviceUsageUserCountsCollectionRequestBuilder> implements IReportRootGetYammerDeviceUsageUserCountsCollectionPage {

    /**
     * A collection page for YammerDeviceUsageUserCounts.
     *
     * @param response The serialized ReportRootGetYammerDeviceUsageUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetYammerDeviceUsageUserCountsCollectionPage(final ReportRootGetYammerDeviceUsageUserCountsCollectionResponse response, final IReportRootGetYammerDeviceUsageUserCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}

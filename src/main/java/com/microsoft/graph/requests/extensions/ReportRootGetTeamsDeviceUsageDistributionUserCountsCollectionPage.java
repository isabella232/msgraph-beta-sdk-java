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
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Teams Device Usage Distribution User Counts Collection Page.
 */
public class ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionPage extends BaseCollectionPage<TeamsDeviceUsageDistributionUserCounts, IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder> implements IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionPage {

    /**
     * A collection page for TeamsDeviceUsageDistributionUserCounts.
     *
     * @param response The serialized ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionPage(final ReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionResponse response, final IReportRootGetTeamsDeviceUsageDistributionUserCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}

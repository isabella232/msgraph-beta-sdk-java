// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerActivitySummary;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetYammerActivityUserCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityUserCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetYammerActivityUserCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Yammer Activity User Counts Collection Page.
 */
public class ReportRootGetYammerActivityUserCountsCollectionPage extends BaseCollectionPage<YammerActivitySummary, IReportRootGetYammerActivityUserCountsCollectionRequestBuilder> implements IReportRootGetYammerActivityUserCountsCollectionPage {

    /**
     * A collection page for YammerActivitySummary.
     *
     * @param response The serialized ReportRootGetYammerActivityUserCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetYammerActivityUserCountsCollectionPage(final ReportRootGetYammerActivityUserCountsCollectionResponse response, final IReportRootGetYammerActivityUserCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}

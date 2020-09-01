// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Office365GroupsActivityGroupCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetOffice365GroupsActivityGroupCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityGroupCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetOffice365GroupsActivityGroupCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Office365Groups Activity Group Counts Collection Page.
 */
public class ReportRootGetOffice365GroupsActivityGroupCountsCollectionPage extends BaseCollectionPage<Office365GroupsActivityGroupCounts, IReportRootGetOffice365GroupsActivityGroupCountsCollectionRequestBuilder> implements IReportRootGetOffice365GroupsActivityGroupCountsCollectionPage {

    /**
     * A collection page for Office365GroupsActivityGroupCounts.
     *
     * @param response The serialized ReportRootGetOffice365GroupsActivityGroupCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetOffice365GroupsActivityGroupCountsCollectionPage(final ReportRootGetOffice365GroupsActivityGroupCountsCollectionResponse response, final IReportRootGetOffice365GroupsActivityGroupCountsCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SkypeForBusinessOrganizerActivityCounts;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Skype For Business Organizer Activity Counts Collection Page.
 */
public class ReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionPage extends BaseCollectionPage<SkypeForBusinessOrganizerActivityCounts, IReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionRequestBuilder> implements IReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionPage {

    /**
     * A collection page for SkypeForBusinessOrganizerActivityCounts.
     *
     * @param response The serialized ReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionPage(final ReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionResponse response, final IReportRootGetSkypeForBusinessOrganizerActivityCountsCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}

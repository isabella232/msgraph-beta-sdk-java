// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TeamsDeviceUsageUserDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserDetailCollectionPage;
import com.microsoft.graph.requests.extensions.ReportRootGetTeamsDeviceUsageUserDetailCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Report Root Get Teams Device Usage User Detail Collection Page.
 */
public class ReportRootGetTeamsDeviceUsageUserDetailCollectionPage extends BaseCollectionPage<TeamsDeviceUsageUserDetail, IReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder> implements IReportRootGetTeamsDeviceUsageUserDetailCollectionPage {

    /**
     * A collection page for TeamsDeviceUsageUserDetail.
     *
     * @param response The serialized ReportRootGetTeamsDeviceUsageUserDetailCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public ReportRootGetTeamsDeviceUsageUserDetailCollectionPage(final ReportRootGetTeamsDeviceUsageUserDetailCollectionResponse response, final IReportRootGetTeamsDeviceUsageUserDetailCollectionRequestBuilder builder) {
       super(response.value, builder, response.additionalDataManager());
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerDeviceUsageDistributionUserCounts;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.http.IHttpRequest;

import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Yammer Device Usage Distribution User Counts Collection Request.
 */
public interface IReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequest extends IHttpRequest {

    void get(final ICallback<IReportRootGetYammerDeviceUsageDistributionUserCountsCollectionPage> callback);

    IReportRootGetYammerDeviceUsageDistributionUserCountsCollectionPage get() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequest expand(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IReportRootGetYammerDeviceUsageDistributionUserCountsCollectionRequest top(final int value);

}

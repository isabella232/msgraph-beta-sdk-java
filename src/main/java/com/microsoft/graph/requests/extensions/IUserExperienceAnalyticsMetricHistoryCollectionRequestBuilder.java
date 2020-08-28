// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsMetricHistory;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricHistoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsMetricHistoryCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the User Experience Analytics Metric History Collection Request Builder.
 */
public interface IUserExperienceAnalyticsMetricHistoryCollectionRequestBuilder extends IRequestBuilder {

    IUserExperienceAnalyticsMetricHistoryCollectionRequest buildRequest();

    IUserExperienceAnalyticsMetricHistoryCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IUserExperienceAnalyticsMetricHistoryRequestBuilder byId(final String id);

}

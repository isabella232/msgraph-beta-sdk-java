// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.YammerDeviceUsageUserDetail;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IReportRootGetYammerDeviceUsageUserDetailCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Report Root Get Yammer Device Usage User Detail Collection Request Builder.
 */
public interface IReportRootGetYammerDeviceUsageUserDetailCollectionRequestBuilder extends IRequestBuilder {

    IReportRootGetYammerDeviceUsageUserDetailCollectionRequest buildRequest();

    IReportRootGetYammerDeviceUsageUserDetailCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}
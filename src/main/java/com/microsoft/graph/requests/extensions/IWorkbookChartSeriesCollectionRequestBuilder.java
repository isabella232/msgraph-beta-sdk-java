// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChart;
import com.microsoft.graph.models.extensions.WorkbookChartSeries;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCollectionRequest;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesCountRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookChartSeriesItemAtRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Series Collection Request Builder.
 */
public interface IWorkbookChartSeriesCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IWorkbookChartSeriesCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IWorkbookChartSeriesCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IWorkbookChartSeriesRequestBuilder byId(final String id);

    IWorkbookChartSeriesCountRequestBuilder count();
    IWorkbookChartSeriesItemAtRequestBuilder itemAt(final Integer index);
}

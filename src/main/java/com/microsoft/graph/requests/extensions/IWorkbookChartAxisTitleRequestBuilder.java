// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WorkbookChartAxisTitle;
import com.microsoft.graph.requests.extensions.IWorkbookChartAxisTitleFormatRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Chart Axis Title Request Builder.
 */
public interface IWorkbookChartAxisTitleRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IWorkbookChartAxisTitleRequest instance
     */
    IWorkbookChartAxisTitleRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IWorkbookChartAxisTitleRequest instance
     */
    IWorkbookChartAxisTitleRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    /**
     * Gets the request builder for WorkbookChartAxisTitleFormat
     *
     * @return the IWorkbookChartAxisTitleFormatRequestBuilder instance
     */
    IWorkbookChartAxisTitleFormatRequestBuilder format();

}
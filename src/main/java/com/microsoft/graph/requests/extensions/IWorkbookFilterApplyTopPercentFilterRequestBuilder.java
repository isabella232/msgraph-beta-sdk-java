// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFilterApplyTopPercentFilterRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Filter Apply Top Percent Filter Request Builder.
 */
public interface IWorkbookFilterApplyTopPercentFilterRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFilterApplyTopPercentFilterRequest
     *
     * @return the IWorkbookFilterApplyTopPercentFilterRequest instance
     */
    IWorkbookFilterApplyTopPercentFilterRequest buildRequest();

    /**
     * Creates the IWorkbookFilterApplyTopPercentFilterRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFilterApplyTopPercentFilterRequest instance
     */
    IWorkbookFilterApplyTopPercentFilterRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

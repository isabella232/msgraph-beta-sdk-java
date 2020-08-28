// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsCotRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Cot Request Builder.
 */
public interface IWorkbookFunctionsCotRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsCotRequest
     *
     * @return the IWorkbookFunctionsCotRequest instance
     */
    IWorkbookFunctionsCotRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsCotRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsCotRequest instance
     */
    IWorkbookFunctionsCotRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

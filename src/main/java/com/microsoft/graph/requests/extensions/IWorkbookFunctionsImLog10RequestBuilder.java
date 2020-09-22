// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImLog10Request;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Log10Request Builder.
 */
public interface IWorkbookFunctionsImLog10RequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImLog10Request
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImLog10Request instance
     */
    IWorkbookFunctionsImLog10Request buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsImLog10Request with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImLog10Request instance
     */
    IWorkbookFunctionsImLog10Request buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

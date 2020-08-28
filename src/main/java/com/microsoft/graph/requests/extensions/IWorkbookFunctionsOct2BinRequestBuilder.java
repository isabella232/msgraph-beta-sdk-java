// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsOct2BinRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Oct2Bin Request Builder.
 */
public interface IWorkbookFunctionsOct2BinRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsOct2BinRequest
     *
     * @return the IWorkbookFunctionsOct2BinRequest instance
     */
    IWorkbookFunctionsOct2BinRequest buildRequest();

    /**
     * Creates the IWorkbookFunctionsOct2BinRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsOct2BinRequest instance
     */
    IWorkbookFunctionsOct2BinRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookFunctionsImSubRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Functions Im Sub Request Builder.
 */
public interface IWorkbookFunctionsImSubRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookFunctionsImSubRequest
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImSubRequest instance
     */
    IWorkbookFunctionsImSubRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IWorkbookFunctionsImSubRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookFunctionsImSubRequest instance
     */
    IWorkbookFunctionsImSubRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWorkbookTableAddRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Workbook Table Add Request Builder.
 */
public interface IWorkbookTableAddRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IWorkbookTableAddRequest
     *
     * @return the IWorkbookTableAddRequest instance
     */
    IWorkbookTableAddRequest buildRequest();

    /**
     * Creates the IWorkbookTableAddRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IWorkbookTableAddRequest instance
     */
    IWorkbookTableAddRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}
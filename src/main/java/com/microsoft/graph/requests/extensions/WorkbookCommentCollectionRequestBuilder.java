// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Workbook;
import com.microsoft.graph.models.extensions.WorkbookComment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IWorkbookCommentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCommentRequestBuilder;
import com.microsoft.graph.requests.extensions.IWorkbookCommentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Workbook Comment Collection Request Builder.
 */
public class WorkbookCommentCollectionRequestBuilder extends BaseRequestBuilder implements IWorkbookCommentCollectionRequestBuilder {

    /**
     * The request builder for this collection of Workbook
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WorkbookCommentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWorkbookCommentCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IWorkbookCommentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new WorkbookCommentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IWorkbookCommentRequestBuilder byId(final String id) {
        return new WorkbookCommentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

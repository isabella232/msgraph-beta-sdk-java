// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TodoTaskList;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITodoTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITodoTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TodoTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task List Request Builder.
 */
public class TodoTaskListRequestBuilder extends BaseRequestBuilder implements ITodoTaskListRequestBuilder {

    /**
     * The request builder for the TodoTaskList
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TodoTaskListRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITodoTaskListRequest instance
     */
    public ITodoTaskListRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITodoTaskListRequest instance
     */
    public ITodoTaskListRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.TodoTaskListRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public ITodoTaskCollectionRequestBuilder tasks() {
        return new TodoTaskCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("tasks"), getClient(), null);
    }

    public ITodoTaskRequestBuilder tasks(final String id) {
        return new TodoTaskRequestBuilder(getRequestUrlWithAdditionalSegment("tasks") + "/" + id, getClient(), null);
    }
}

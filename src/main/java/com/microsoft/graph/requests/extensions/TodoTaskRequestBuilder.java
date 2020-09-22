// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TodoTask;
import com.microsoft.graph.requests.extensions.IExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExtensionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILinkedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILinkedResourceRequestBuilder;
import com.microsoft.graph.requests.extensions.LinkedResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.LinkedResourceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Todo Task Request Builder.
 */
public class TodoTaskRequestBuilder extends BaseRequestBuilder implements ITodoTaskRequestBuilder {

    /**
     * The request builder for the TodoTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TodoTaskRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the ITodoTaskRequest instance
     */
    public ITodoTaskRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITodoTaskRequest instance
     */
    public ITodoTaskRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.TodoTaskRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IExtensionCollectionRequestBuilder extensions() {
        return new ExtensionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions"), getClient(), null);
    }

    public IExtensionRequestBuilder extensions(final String id) {
        return new ExtensionRequestBuilder(getRequestUrlWithAdditionalSegment("extensions") + "/" + id, getClient(), null);
    }
    public ILinkedResourceCollectionRequestBuilder linkedResources() {
        return new LinkedResourceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("linkedResources"), getClient(), null);
    }

    public ILinkedResourceRequestBuilder linkedResources(final String id) {
        return new LinkedResourceRequestBuilder(getRequestUrlWithAdditionalSegment("linkedResources") + "/" + id, getClient(), null);
    }
}

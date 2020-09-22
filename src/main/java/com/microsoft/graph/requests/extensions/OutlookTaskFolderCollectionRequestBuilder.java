// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OutlookTaskGroup;
import com.microsoft.graph.models.extensions.OutlookTaskFolder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOutlookTaskFolderCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskFolderRequestBuilder;
import com.microsoft.graph.requests.extensions.IOutlookTaskFolderCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Outlook Task Folder Collection Request Builder.
 */
public class OutlookTaskFolderCollectionRequestBuilder extends BaseRequestBuilder implements IOutlookTaskFolderCollectionRequestBuilder {

    /**
     * The request builder for this collection of OutlookTaskGroup
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OutlookTaskFolderCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IOutlookTaskFolderCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IOutlookTaskFolderCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new OutlookTaskFolderCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOutlookTaskFolderRequestBuilder byId(final String id) {
        return new OutlookTaskFolderRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

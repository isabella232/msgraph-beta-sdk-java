// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Journal;
import com.microsoft.graph.models.extensions.JournalLine;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IJournalLineCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalLineRequestBuilder;
import com.microsoft.graph.requests.extensions.IJournalLineCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Journal Line Collection Request Builder.
 */
public class JournalLineCollectionRequestBuilder extends BaseRequestBuilder implements IJournalLineCollectionRequestBuilder {

    /**
     * The request builder for this collection of Journal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public JournalLineCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IJournalLineCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IJournalLineCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new JournalLineCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IJournalLineRequestBuilder byId(final String id) {
        return new JournalLineRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.termstore.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.termstore.models.extensions.Term;
import com.microsoft.graph.termstore.requests.extensions.ITermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ITermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.TermCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.TermRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.IRelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.RelationCollectionRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.RelationRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.ISetRequestBuilder;
import com.microsoft.graph.termstore.requests.extensions.SetRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Term Reference Request Builder.
 */
public class TermReferenceRequestBuilder extends BaseRequestBuilder implements ITermReferenceRequestBuilder {

    /**
     * The request builder for the Term
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermReferenceRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return The ITermReferenceRequest instance
     */
    public ITermReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the ITermReferenceRequest instance
     */
    public ITermReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TermReferenceRequest(getRequestUrl(), getClient(), requestOptions);
    }
}

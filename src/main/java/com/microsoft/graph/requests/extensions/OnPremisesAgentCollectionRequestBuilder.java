// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OnPremisesPublishingProfile;
import com.microsoft.graph.models.extensions.OnPremisesAgent;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IOnPremisesAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentRequestBuilder;
import com.microsoft.graph.requests.extensions.IOnPremisesAgentCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the On Premises Agent Collection Request Builder.
 */
public class OnPremisesAgentCollectionRequestBuilder extends BaseRequestBuilder implements IOnPremisesAgentCollectionRequestBuilder {

    /**
     * The request builder for this collection of OnPremisesPublishingProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OnPremisesAgentCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IOnPremisesAgentCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IOnPremisesAgentCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new OnPremisesAgentCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IOnPremisesAgentRequestBuilder byId(final String id) {
        return new OnPremisesAgentRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}
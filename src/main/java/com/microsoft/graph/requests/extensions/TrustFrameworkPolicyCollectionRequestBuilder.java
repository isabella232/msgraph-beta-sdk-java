// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TrustFramework;
import com.microsoft.graph.models.extensions.TrustFrameworkPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITrustFrameworkPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrustFrameworkPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrustFrameworkPolicyCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Policy Collection Request Builder.
 */
public class TrustFrameworkPolicyCollectionRequestBuilder extends BaseRequestBuilder implements ITrustFrameworkPolicyCollectionRequestBuilder {

    /**
     * The request builder for this collection of TrustFramework
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TrustFrameworkPolicyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public ITrustFrameworkPolicyCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public ITrustFrameworkPolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new TrustFrameworkPolicyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ITrustFrameworkPolicyRequestBuilder byId(final String id) {
        return new TrustFrameworkPolicyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

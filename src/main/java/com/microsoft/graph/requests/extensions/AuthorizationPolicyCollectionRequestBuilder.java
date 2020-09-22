// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PolicyRoot;
import com.microsoft.graph.models.extensions.AuthorizationPolicy;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAuthorizationPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthorizationPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthorizationPolicyCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authorization Policy Collection Request Builder.
 */
public class AuthorizationPolicyCollectionRequestBuilder extends BaseRequestBuilder implements IAuthorizationPolicyCollectionRequestBuilder {

    /**
     * The request builder for this collection of PolicyRoot
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthorizationPolicyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAuthorizationPolicyCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAuthorizationPolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AuthorizationPolicyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAuthorizationPolicyRequestBuilder byId(final String id) {
        return new AuthorizationPolicyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Directory;
import com.microsoft.graph.models.extensions.SharedEmailDomain;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISharedEmailDomainCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedEmailDomainRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedEmailDomainCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Shared Email Domain Collection Request Builder.
 */
public class SharedEmailDomainCollectionRequestBuilder extends BaseRequestBuilder implements ISharedEmailDomainCollectionRequestBuilder {

    /**
     * The request builder for this collection of Directory
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SharedEmailDomainCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISharedEmailDomainCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ISharedEmailDomainCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new SharedEmailDomainCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ISharedEmailDomainRequestBuilder byId(final String id) {
        return new SharedEmailDomainRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

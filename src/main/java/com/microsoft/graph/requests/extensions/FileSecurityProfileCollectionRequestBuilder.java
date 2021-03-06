// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.FileSecurityProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IFileSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileSecurityProfileCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the File Security Profile Collection Request Builder.
 */
public class FileSecurityProfileCollectionRequestBuilder extends BaseRequestBuilder implements IFileSecurityProfileCollectionRequestBuilder {

    /**
     * The request builder for this collection of Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FileSecurityProfileCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IFileSecurityProfileCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IFileSecurityProfileCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new FileSecurityProfileCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IFileSecurityProfileRequestBuilder byId(final String id) {
        return new FileSecurityProfileRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

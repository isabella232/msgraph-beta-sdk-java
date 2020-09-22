// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.models.extensions.UserAppInstallStatus;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IUserAppInstallStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAppInstallStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserAppInstallStatusCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User App Install Status Collection Request Builder.
 */
public class UserAppInstallStatusCollectionRequestBuilder extends BaseRequestBuilder implements IUserAppInstallStatusCollectionRequestBuilder {

    /**
     * The request builder for this collection of MobileApp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserAppInstallStatusCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUserAppInstallStatusCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IUserAppInstallStatusCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new UserAppInstallStatusCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IUserAppInstallStatusRequestBuilder byId(final String id) {
        return new UserAppInstallStatusRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

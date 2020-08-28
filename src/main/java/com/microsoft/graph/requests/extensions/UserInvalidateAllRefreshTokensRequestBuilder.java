// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IUserInvalidateAllRefreshTokensRequest;
import com.microsoft.graph.requests.extensions.UserInvalidateAllRefreshTokensRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Invalidate All Refresh Tokens Request Builder.
 */
public class UserInvalidateAllRefreshTokensRequestBuilder extends BaseActionRequestBuilder implements IUserInvalidateAllRefreshTokensRequestBuilder {

    /**
     * The request builder for this UserInvalidateAllRefreshTokens
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserInvalidateAllRefreshTokensRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IUserInvalidateAllRefreshTokensRequest
     *
     * @return the IUserInvalidateAllRefreshTokensRequest instance
     */
    public IUserInvalidateAllRefreshTokensRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IUserInvalidateAllRefreshTokensRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IUserInvalidateAllRefreshTokensRequest instance
     */
    public IUserInvalidateAllRefreshTokensRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        UserInvalidateAllRefreshTokensRequest request = new UserInvalidateAllRefreshTokensRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

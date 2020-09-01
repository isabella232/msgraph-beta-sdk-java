// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MicrosoftAuthenticatorAuthenticationMethod;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Authenticator Authentication Method Request Builder.
 */
public class MicrosoftAuthenticatorAuthenticationMethodRequestBuilder extends BaseRequestBuilder implements IMicrosoftAuthenticatorAuthenticationMethodRequestBuilder {

    /**
     * The request builder for the MicrosoftAuthenticatorAuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MicrosoftAuthenticatorAuthenticationMethodRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IMicrosoftAuthenticatorAuthenticationMethodRequest instance
     */
    public IMicrosoftAuthenticatorAuthenticationMethodRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IMicrosoftAuthenticatorAuthenticationMethodRequest instance
     */
    public IMicrosoftAuthenticatorAuthenticationMethodRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.MicrosoftAuthenticatorAuthenticationMethodRequest(getRequestUrl(), getClient(), requestOptions);
    }


}
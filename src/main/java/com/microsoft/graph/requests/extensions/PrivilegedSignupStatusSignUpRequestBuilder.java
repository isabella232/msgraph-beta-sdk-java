// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IPrivilegedSignupStatusSignUpRequest;
import com.microsoft.graph.requests.extensions.PrivilegedSignupStatusSignUpRequest;
import com.microsoft.graph.models.extensions.PrivilegedSignupStatus;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Privileged Signup Status Sign Up Request Builder.
 */
public class PrivilegedSignupStatusSignUpRequestBuilder extends BaseActionRequestBuilder implements IPrivilegedSignupStatusSignUpRequestBuilder {

    /**
     * The request builder for this PrivilegedSignupStatusSignUp
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrivilegedSignupStatusSignUpRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the IPrivilegedSignupStatusSignUpRequest
     *
     * @return the IPrivilegedSignupStatusSignUpRequest instance
     */
    public IPrivilegedSignupStatusSignUpRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the IPrivilegedSignupStatusSignUpRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IPrivilegedSignupStatusSignUpRequest instance
     */
    public IPrivilegedSignupStatusSignUpRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        PrivilegedSignupStatusSignUpRequest request = new PrivilegedSignupStatusSignUpRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        return request;
    }
}

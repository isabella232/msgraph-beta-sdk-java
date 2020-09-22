// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITrustFrameworkKeySetGenerateKeyRequest;
import com.microsoft.graph.requests.extensions.TrustFrameworkKeySetGenerateKeyRequest;
import com.microsoft.graph.models.extensions.TrustFrameworkKey;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Trust Framework Key Set Generate Key Request Builder.
 */
public class TrustFrameworkKeySetGenerateKeyRequestBuilder extends BaseActionRequestBuilder implements ITrustFrameworkKeySetGenerateKeyRequestBuilder {

    /**
     * The request builder for this TrustFrameworkKeySetGenerateKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param use the use
     * @param kty the kty
     * @param nbf the nbf
     * @param exp the exp
     */
    public TrustFrameworkKeySetGenerateKeyRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String use, final String kty, final Long nbf, final Long exp) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("use", use);
        bodyParams.put("kty", kty);
        bodyParams.put("nbf", nbf);
        bodyParams.put("exp", exp);
    }

    /**
     * Creates the ITrustFrameworkKeySetGenerateKeyRequest
     *
     * @param requestOptions the options for the request
     * @return the ITrustFrameworkKeySetGenerateKeyRequest instance
     */
    public ITrustFrameworkKeySetGenerateKeyRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ITrustFrameworkKeySetGenerateKeyRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ITrustFrameworkKeySetGenerateKeyRequest instance
     */
    public ITrustFrameworkKeySetGenerateKeyRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TrustFrameworkKeySetGenerateKeyRequest request = new TrustFrameworkKeySetGenerateKeyRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("use")) {
            request.body.use = getParameter("use");
        }

        if (hasParameter("kty")) {
            request.body.kty = getParameter("kty");
        }

        if (hasParameter("nbf")) {
            request.body.nbf = getParameter("nbf");
        }

        if (hasParameter("exp")) {
            request.body.exp = getParameter("exp");
        }

        return request;
    }
}

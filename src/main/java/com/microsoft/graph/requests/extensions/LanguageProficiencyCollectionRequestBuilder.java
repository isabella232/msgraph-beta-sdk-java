// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.LanguageProficiency;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ILanguageProficiencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ILanguageProficiencyRequestBuilder;
import com.microsoft.graph.requests.extensions.ILanguageProficiencyCollectionRequest;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Language Proficiency Collection Request Builder.
 */
public class LanguageProficiencyCollectionRequestBuilder extends BaseRequestBuilder implements ILanguageProficiencyCollectionRequestBuilder {

    /**
     * The request builder for this collection of Profile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public LanguageProficiencyCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ILanguageProficiencyCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public ILanguageProficiencyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new LanguageProficiencyCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public ILanguageProficiencyRequestBuilder byId(final String id) {
        return new LanguageProficiencyRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }


}

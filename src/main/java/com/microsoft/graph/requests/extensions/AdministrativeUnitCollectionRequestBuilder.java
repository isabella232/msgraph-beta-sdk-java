// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AdministrativeUnit;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAdministrativeUnitCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitRequestBuilder;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitCollectionRequest;
import com.microsoft.graph.requests.extensions.IAdministrativeUnitDeltaCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Administrative Unit Collection Request Builder.
 */
public class AdministrativeUnitCollectionRequestBuilder extends BaseRequestBuilder implements IAdministrativeUnitCollectionRequestBuilder {

    /**
     * The request builder for this collection of AdministrativeUnit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AdministrativeUnitCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAdministrativeUnitCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    public IAdministrativeUnitCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AdministrativeUnitCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAdministrativeUnitRequestBuilder byId(final String id) {
        return new AdministrativeUnitRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IAdministrativeUnitDeltaCollectionRequestBuilder delta() {
        return new AdministrativeUnitDeltaCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.delta"), getClient(), null);
    }

	public IAdministrativeUnitDeltaCollectionRequestBuilder delta(final String deltaLink) {
        return new AdministrativeUnitDeltaCollectionRequestBuilder(deltaLink, getClient(), null);
    }
}

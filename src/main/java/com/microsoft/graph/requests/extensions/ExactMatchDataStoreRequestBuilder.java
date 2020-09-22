// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ExactMatchDataStore;
import com.microsoft.graph.requests.extensions.IExactMatchSessionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchSessionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchSessionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchSessionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Exact Match Data Store Request Builder.
 */
public class ExactMatchDataStoreRequestBuilder extends BaseRequestBuilder implements IExactMatchDataStoreRequestBuilder {

    /**
     * The request builder for the ExactMatchDataStore
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ExactMatchDataStoreRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IExactMatchDataStoreRequest instance
     */
    public IExactMatchDataStoreRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IExactMatchDataStoreRequest instance
     */
    public IExactMatchDataStoreRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.ExactMatchDataStoreRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IExactMatchSessionCollectionRequestBuilder sessions() {
        return new ExactMatchSessionCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions"), getClient(), null);
    }

    public IExactMatchSessionRequestBuilder sessions(final String id) {
        return new ExactMatchSessionRequestBuilder(getRequestUrlWithAdditionalSegment("sessions") + "/" + id, getClient(), null);
    }

    public IExactMatchDataStoreLookupCollectionRequestBuilder lookup(final String key, final java.util.List<String> values, final java.util.List<String> resultColumnNames) {
        return new ExactMatchDataStoreLookupCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.lookup"), getClient(), null, key, values, resultColumnNames);
    }
}

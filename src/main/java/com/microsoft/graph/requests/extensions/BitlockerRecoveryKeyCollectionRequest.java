// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Bitlocker;
import com.microsoft.graph.models.extensions.BitlockerRecoveryKey;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IBitlockerRecoveryKeyCollectionPage;
import com.microsoft.graph.requests.extensions.BitlockerRecoveryKeyCollectionResponse;
import com.microsoft.graph.requests.extensions.IBitlockerRecoveryKeyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IBitlockerRecoveryKeyCollectionRequest;
import com.microsoft.graph.requests.extensions.BitlockerRecoveryKeyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Bitlocker Recovery Key Collection Request.
 */
public class BitlockerRecoveryKeyCollectionRequest extends BaseCollectionRequest<BitlockerRecoveryKeyCollectionResponse, IBitlockerRecoveryKeyCollectionPage> implements IBitlockerRecoveryKeyCollectionRequest {

    /**
     * The request builder for this collection of BitlockerRecoveryKey
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public BitlockerRecoveryKeyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, BitlockerRecoveryKeyCollectionResponse.class, IBitlockerRecoveryKeyCollectionPage.class);
    }

    public void get(final ICallback<IBitlockerRecoveryKeyCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(get(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IBitlockerRecoveryKeyCollectionPage get() throws ClientException {
        final BitlockerRecoveryKeyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final BitlockerRecoveryKey newBitlockerRecoveryKey, final ICallback<BitlockerRecoveryKey> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new BitlockerRecoveryKeyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newBitlockerRecoveryKey, callback);
    }

    public BitlockerRecoveryKey post(final BitlockerRecoveryKey newBitlockerRecoveryKey) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new BitlockerRecoveryKeyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newBitlockerRecoveryKey);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IBitlockerRecoveryKeyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (BitlockerRecoveryKeyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IBitlockerRecoveryKeyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (BitlockerRecoveryKeyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IBitlockerRecoveryKeyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (BitlockerRecoveryKeyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IBitlockerRecoveryKeyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (BitlockerRecoveryKeyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IBitlockerRecoveryKeyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (BitlockerRecoveryKeyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IBitlockerRecoveryKeyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IBitlockerRecoveryKeyCollectionRequest)this;
    }
    public IBitlockerRecoveryKeyCollectionPage buildFromResponse(final BitlockerRecoveryKeyCollectionResponse response) {
        final IBitlockerRecoveryKeyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new BitlockerRecoveryKeyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final BitlockerRecoveryKeyCollectionPage page = new BitlockerRecoveryKeyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

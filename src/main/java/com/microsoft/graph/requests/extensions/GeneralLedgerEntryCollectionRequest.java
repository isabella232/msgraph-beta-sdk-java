// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Company;
import com.microsoft.graph.models.extensions.GeneralLedgerEntry;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IGeneralLedgerEntryCollectionPage;
import com.microsoft.graph.requests.extensions.GeneralLedgerEntryCollectionResponse;
import com.microsoft.graph.requests.extensions.IGeneralLedgerEntryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGeneralLedgerEntryCollectionRequest;
import com.microsoft.graph.requests.extensions.GeneralLedgerEntryCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the General Ledger Entry Collection Request.
 */
public class GeneralLedgerEntryCollectionRequest extends BaseCollectionRequest<GeneralLedgerEntryCollectionResponse, IGeneralLedgerEntryCollectionPage> implements IGeneralLedgerEntryCollectionRequest {

    /**
     * The request builder for this collection of GeneralLedgerEntry
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GeneralLedgerEntryCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GeneralLedgerEntryCollectionResponse.class, IGeneralLedgerEntryCollectionPage.class);
    }

    public void get(final ICallback<IGeneralLedgerEntryCollectionPage> callback) {
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

    public IGeneralLedgerEntryCollectionPage get() throws ClientException {
        final GeneralLedgerEntryCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final GeneralLedgerEntry newGeneralLedgerEntry, final ICallback<GeneralLedgerEntry> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GeneralLedgerEntryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGeneralLedgerEntry, callback);
    }

    public GeneralLedgerEntry post(final GeneralLedgerEntry newGeneralLedgerEntry) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GeneralLedgerEntryRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGeneralLedgerEntry);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGeneralLedgerEntryCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GeneralLedgerEntryCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGeneralLedgerEntryCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GeneralLedgerEntryCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGeneralLedgerEntryCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (GeneralLedgerEntryCollectionRequest)this;
    }

    public IGeneralLedgerEntryCollectionPage buildFromResponse(final GeneralLedgerEntryCollectionResponse response) {
        final IGeneralLedgerEntryCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GeneralLedgerEntryCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GeneralLedgerEntryCollectionPage page = new GeneralLedgerEntryCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

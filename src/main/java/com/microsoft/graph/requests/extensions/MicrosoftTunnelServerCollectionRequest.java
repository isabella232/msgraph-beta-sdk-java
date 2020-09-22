// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MicrosoftTunnelSite;
import com.microsoft.graph.models.extensions.MicrosoftTunnelServer;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelServerCollectionPage;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelServerCollectionResponse;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelServerCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMicrosoftTunnelServerCollectionRequest;
import com.microsoft.graph.requests.extensions.MicrosoftTunnelServerCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Microsoft Tunnel Server Collection Request.
 */
public class MicrosoftTunnelServerCollectionRequest extends BaseCollectionRequest<MicrosoftTunnelServerCollectionResponse, IMicrosoftTunnelServerCollectionPage> implements IMicrosoftTunnelServerCollectionRequest {

    /**
     * The request builder for this collection of MicrosoftTunnelServer
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MicrosoftTunnelServerCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MicrosoftTunnelServerCollectionResponse.class, IMicrosoftTunnelServerCollectionPage.class);
    }

    public void get(final ICallback<IMicrosoftTunnelServerCollectionPage> callback) {
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

    public IMicrosoftTunnelServerCollectionPage get() throws ClientException {
        final MicrosoftTunnelServerCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final MicrosoftTunnelServer newMicrosoftTunnelServer, final ICallback<MicrosoftTunnelServer> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new MicrosoftTunnelServerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMicrosoftTunnelServer, callback);
    }

    public MicrosoftTunnelServer post(final MicrosoftTunnelServer newMicrosoftTunnelServer) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new MicrosoftTunnelServerRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newMicrosoftTunnelServer);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMicrosoftTunnelServerCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (MicrosoftTunnelServerCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IMicrosoftTunnelServerCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (MicrosoftTunnelServerCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMicrosoftTunnelServerCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (MicrosoftTunnelServerCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMicrosoftTunnelServerCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (MicrosoftTunnelServerCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IMicrosoftTunnelServerCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (MicrosoftTunnelServerCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IMicrosoftTunnelServerCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IMicrosoftTunnelServerCollectionRequest)this;
    }
    public IMicrosoftTunnelServerCollectionPage buildFromResponse(final MicrosoftTunnelServerCollectionResponse response) {
        final IMicrosoftTunnelServerCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MicrosoftTunnelServerCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final MicrosoftTunnelServerCollectionPage page = new MicrosoftTunnelServerCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

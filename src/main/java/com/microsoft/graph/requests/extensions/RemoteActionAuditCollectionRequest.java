// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.RemoteActionAudit;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditCollectionPage;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionResponse;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRemoteActionAuditCollectionRequest;
import com.microsoft.graph.requests.extensions.RemoteActionAuditCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Remote Action Audit Collection Request.
 */
public class RemoteActionAuditCollectionRequest extends BaseCollectionRequest<RemoteActionAuditCollectionResponse, IRemoteActionAuditCollectionPage> implements IRemoteActionAuditCollectionRequest {

    /**
     * The request builder for this collection of RemoteActionAudit
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RemoteActionAuditCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RemoteActionAuditCollectionResponse.class, IRemoteActionAuditCollectionPage.class);
    }

    public void get(final ICallback<? super IRemoteActionAuditCollectionPage> callback) {
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

    public IRemoteActionAuditCollectionPage get() throws ClientException {
        final RemoteActionAuditCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final RemoteActionAudit newRemoteActionAudit, final ICallback<? super RemoteActionAudit> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new RemoteActionAuditRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newRemoteActionAudit, callback);
    }

    public RemoteActionAudit post(final RemoteActionAudit newRemoteActionAudit) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new RemoteActionAuditRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newRemoteActionAudit);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRemoteActionAuditCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (RemoteActionAuditCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IRemoteActionAuditCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (RemoteActionAuditCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IRemoteActionAuditCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (RemoteActionAuditCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRemoteActionAuditCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (RemoteActionAuditCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IRemoteActionAuditCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (RemoteActionAuditCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IRemoteActionAuditCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (RemoteActionAuditCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IRemoteActionAuditCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IRemoteActionAuditCollectionRequest)this;
    }
    public IRemoteActionAuditCollectionPage buildFromResponse(final RemoteActionAuditCollectionResponse response) {
        final IRemoteActionAuditCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new RemoteActionAuditCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final RemoteActionAuditCollectionPage page = new RemoteActionAuditCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

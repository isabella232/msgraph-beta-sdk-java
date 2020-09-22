// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAuditEventGetAuditActivityTypesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditEventGetAuditActivityTypesCollectionPage;
import com.microsoft.graph.requests.extensions.AuditEventGetAuditActivityTypesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Event Get Audit Activity Types Collection Request.
 */
public class AuditEventGetAuditActivityTypesCollectionRequest extends BaseCollectionRequest<AuditEventGetAuditActivityTypesCollectionResponse, IAuditEventGetAuditActivityTypesCollectionPage> implements IAuditEventGetAuditActivityTypesCollectionRequest {


    /**
     * The request for this AuditEventGetAuditActivityTypes
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuditEventGetAuditActivityTypesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuditEventGetAuditActivityTypesCollectionResponse.class, IAuditEventGetAuditActivityTypesCollectionPage.class);
    }


    public void get(final ICallback<IAuditEventGetAuditActivityTypesCollectionPage> callback) {
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

    public IAuditEventGetAuditActivityTypesCollectionPage get() throws ClientException {
        final AuditEventGetAuditActivityTypesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IAuditEventGetAuditActivityTypesCollectionPage buildFromResponse(final AuditEventGetAuditActivityTypesCollectionResponse response) {
        final IAuditEventGetAuditActivityTypesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AuditEventGetAuditActivityTypesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null);
        } else {
            builder = null;
        }
        final IAuditEventGetAuditActivityTypesCollectionPage page = new AuditEventGetAuditActivityTypesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAuditEventGetAuditActivityTypesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAuditEventGetAuditActivityTypesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAuditEventGetAuditActivityTypesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IAuditEventGetAuditActivityTypesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAuditEventGetAuditActivityTypesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IAuditEventGetAuditActivityTypesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAuditEventGetAuditActivityTypesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IAuditEventGetAuditActivityTypesCollectionRequest)this;
    }

}

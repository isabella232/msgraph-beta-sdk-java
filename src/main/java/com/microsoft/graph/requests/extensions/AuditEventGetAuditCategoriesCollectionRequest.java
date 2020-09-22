// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;

import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAuditEventGetAuditCategoriesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AuditEventGetAuditCategoriesCollectionPage;
import com.microsoft.graph.requests.extensions.AuditEventGetAuditCategoriesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Audit Event Get Audit Categories Collection Request.
 */
public class AuditEventGetAuditCategoriesCollectionRequest extends BaseCollectionRequest<AuditEventGetAuditCategoriesCollectionResponse, IAuditEventGetAuditCategoriesCollectionPage> implements IAuditEventGetAuditCategoriesCollectionRequest {


    /**
     * The request for this AuditEventGetAuditCategories
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuditEventGetAuditCategoriesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuditEventGetAuditCategoriesCollectionResponse.class, IAuditEventGetAuditCategoriesCollectionPage.class);
    }


    public void get(final ICallback<IAuditEventGetAuditCategoriesCollectionPage> callback) {
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

    public IAuditEventGetAuditCategoriesCollectionPage get() throws ClientException {
        final AuditEventGetAuditCategoriesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IAuditEventGetAuditCategoriesCollectionPage buildFromResponse(final AuditEventGetAuditCategoriesCollectionResponse response) {
        final IAuditEventGetAuditCategoriesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AuditEventGetAuditCategoriesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IAuditEventGetAuditCategoriesCollectionPage page = new AuditEventGetAuditCategoriesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAuditEventGetAuditCategoriesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAuditEventGetAuditCategoriesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAuditEventGetAuditCategoriesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IAuditEventGetAuditCategoriesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAuditEventGetAuditCategoriesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IAuditEventGetAuditCategoriesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAuditEventGetAuditCategoriesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IAuditEventGetAuditCategoriesCollectionRequest)this;
    }

}

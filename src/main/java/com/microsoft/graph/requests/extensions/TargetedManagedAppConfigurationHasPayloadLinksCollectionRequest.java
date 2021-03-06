// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationHasPayloadLinksCollectionPage;
import com.microsoft.graph.requests.extensions.TargetedManagedAppConfigurationHasPayloadLinksCollectionResponse;
import com.microsoft.graph.models.extensions.TargetedManagedAppConfigurationHasPayloadLinksBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Targeted Managed App Configuration Has Payload Links Collection Request.
 */
public class TargetedManagedAppConfigurationHasPayloadLinksCollectionRequest extends BaseCollectionRequest<TargetedManagedAppConfigurationHasPayloadLinksCollectionResponse, ITargetedManagedAppConfigurationHasPayloadLinksCollectionPage> implements ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest {


    protected final TargetedManagedAppConfigurationHasPayloadLinksBody body;


    /**
     * The request for this TargetedManagedAppConfigurationHasPayloadLinks
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TargetedManagedAppConfigurationHasPayloadLinksCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TargetedManagedAppConfigurationHasPayloadLinksCollectionResponse.class, ITargetedManagedAppConfigurationHasPayloadLinksCollectionPage.class);
        body = new TargetedManagedAppConfigurationHasPayloadLinksBody();
    }


    public void post(final ICallback<? super ITargetedManagedAppConfigurationHasPayloadLinksCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public ITargetedManagedAppConfigurationHasPayloadLinksCollectionPage post() throws ClientException {
        final TargetedManagedAppConfigurationHasPayloadLinksCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public ITargetedManagedAppConfigurationHasPayloadLinksCollectionPage buildFromResponse(final TargetedManagedAppConfigurationHasPayloadLinksCollectionResponse response) {
        final ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TargetedManagedAppConfigurationHasPayloadLinksCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<String>) null);
        } else {
            builder = null;
        }
        final ITargetedManagedAppConfigurationHasPayloadLinksCollectionPage page = new TargetedManagedAppConfigurationHasPayloadLinksCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (ITargetedManagedAppConfigurationHasPayloadLinksCollectionRequest)this;
    }

}

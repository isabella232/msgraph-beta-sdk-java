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

import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionHasPayloadLinksCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionHasPayloadLinksCollectionPage;
import com.microsoft.graph.requests.extensions.IosManagedAppProtectionHasPayloadLinksCollectionResponse;
import com.microsoft.graph.models.extensions.IosManagedAppProtectionHasPayloadLinksBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Managed App Protection Has Payload Links Collection Request.
 */
public class IosManagedAppProtectionHasPayloadLinksCollectionRequest extends BaseCollectionRequest<IosManagedAppProtectionHasPayloadLinksCollectionResponse, IIosManagedAppProtectionHasPayloadLinksCollectionPage> implements IIosManagedAppProtectionHasPayloadLinksCollectionRequest {


    protected final IosManagedAppProtectionHasPayloadLinksBody body;


    /**
     * The request for this IosManagedAppProtectionHasPayloadLinks
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosManagedAppProtectionHasPayloadLinksCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosManagedAppProtectionHasPayloadLinksCollectionResponse.class, IIosManagedAppProtectionHasPayloadLinksCollectionPage.class);
        body = new IosManagedAppProtectionHasPayloadLinksBody();
    }


    public void post(final ICallback<IIosManagedAppProtectionHasPayloadLinksCollectionPage> callback) {
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

    public IIosManagedAppProtectionHasPayloadLinksCollectionPage post() throws ClientException {
        final IosManagedAppProtectionHasPayloadLinksCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IIosManagedAppProtectionHasPayloadLinksCollectionPage buildFromResponse(final IosManagedAppProtectionHasPayloadLinksCollectionResponse response) {
        final IIosManagedAppProtectionHasPayloadLinksCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new IosManagedAppProtectionHasPayloadLinksCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<String>) null);
        } else {
            builder = null;
        }
        final IIosManagedAppProtectionHasPayloadLinksCollectionPage page = new IosManagedAppProtectionHasPayloadLinksCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IIosManagedAppProtectionHasPayloadLinksCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IIosManagedAppProtectionHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IIosManagedAppProtectionHasPayloadLinksCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IIosManagedAppProtectionHasPayloadLinksCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IIosManagedAppProtectionHasPayloadLinksCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IIosManagedAppProtectionHasPayloadLinksCollectionRequest)this;
    }

}
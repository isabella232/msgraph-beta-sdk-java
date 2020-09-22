// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Presence;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ICloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.CloudCommunicationsGetPresencesByUserIdCollectionPage;
import com.microsoft.graph.requests.extensions.CloudCommunicationsGetPresencesByUserIdCollectionResponse;
import com.microsoft.graph.models.extensions.CloudCommunicationsGetPresencesByUserIdBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud Communications Get Presences By User Id Collection Request.
 */
public class CloudCommunicationsGetPresencesByUserIdCollectionRequest extends BaseCollectionRequest<CloudCommunicationsGetPresencesByUserIdCollectionResponse, ICloudCommunicationsGetPresencesByUserIdCollectionPage> implements ICloudCommunicationsGetPresencesByUserIdCollectionRequest {


    protected final CloudCommunicationsGetPresencesByUserIdBody body;


    /**
     * The request for this CloudCommunicationsGetPresencesByUserId
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudCommunicationsGetPresencesByUserIdCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudCommunicationsGetPresencesByUserIdCollectionResponse.class, ICloudCommunicationsGetPresencesByUserIdCollectionPage.class);
        body = new CloudCommunicationsGetPresencesByUserIdBody();
    }


    public void post(final ICallback<ICloudCommunicationsGetPresencesByUserIdCollectionPage> callback) {
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

    public ICloudCommunicationsGetPresencesByUserIdCollectionPage post() throws ClientException {
        final CloudCommunicationsGetPresencesByUserIdCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public ICloudCommunicationsGetPresencesByUserIdCollectionPage buildFromResponse(final CloudCommunicationsGetPresencesByUserIdCollectionResponse response) {
        final ICloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CloudCommunicationsGetPresencesByUserIdCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<String>) null);
        } else {
            builder = null;
        }
        final ICloudCommunicationsGetPresencesByUserIdCollectionPage page = new CloudCommunicationsGetPresencesByUserIdCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICloudCommunicationsGetPresencesByUserIdCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ICloudCommunicationsGetPresencesByUserIdCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICloudCommunicationsGetPresencesByUserIdCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ICloudCommunicationsGetPresencesByUserIdCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICloudCommunicationsGetPresencesByUserIdCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ICloudCommunicationsGetPresencesByUserIdCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ICloudCommunicationsGetPresencesByUserIdCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (ICloudCommunicationsGetPresencesByUserIdCollectionRequest)this;
    }

}

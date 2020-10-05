// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppRelationshipState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IMobileAppGetRelatedAppStatesCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.MobileAppGetRelatedAppStatesCollectionPage;
import com.microsoft.graph.requests.extensions.MobileAppGetRelatedAppStatesCollectionResponse;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Get Related App States Collection Request.
 */
public class MobileAppGetRelatedAppStatesCollectionRequest extends BaseCollectionRequest<MobileAppGetRelatedAppStatesCollectionResponse, IMobileAppGetRelatedAppStatesCollectionPage> implements IMobileAppGetRelatedAppStatesCollectionRequest {


    /**
     * The request for this MobileAppGetRelatedAppStates
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppGetRelatedAppStatesCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppGetRelatedAppStatesCollectionResponse.class, IMobileAppGetRelatedAppStatesCollectionPage.class);
    }


    public void get(final ICallback<? super IMobileAppGetRelatedAppStatesCollectionPage> callback) {
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

    public IMobileAppGetRelatedAppStatesCollectionPage get() throws ClientException {
        final MobileAppGetRelatedAppStatesCollectionResponse response = send();
        return buildFromResponse(response);
    }


    public IMobileAppGetRelatedAppStatesCollectionPage buildFromResponse(final MobileAppGetRelatedAppStatesCollectionResponse response) {
        final IMobileAppGetRelatedAppStatesCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new MobileAppGetRelatedAppStatesCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (String) null, (String) null);
        } else {
            builder = null;
        }
        final IMobileAppGetRelatedAppStatesCollectionPage page = new MobileAppGetRelatedAppStatesCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IMobileAppGetRelatedAppStatesCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IMobileAppGetRelatedAppStatesCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IMobileAppGetRelatedAppStatesCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IMobileAppGetRelatedAppStatesCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IMobileAppGetRelatedAppStatesCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IMobileAppGetRelatedAppStatesCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IMobileAppGetRelatedAppStatesCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IMobileAppGetRelatedAppStatesCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IMobileAppGetRelatedAppStatesCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IMobileAppGetRelatedAppStatesCollectionRequest)this;
    }

}

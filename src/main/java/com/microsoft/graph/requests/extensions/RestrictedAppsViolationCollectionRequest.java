// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.RestrictedAppsViolation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationCollectionPage;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationCollectionResponse;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IRestrictedAppsViolationCollectionRequest;
import com.microsoft.graph.requests.extensions.RestrictedAppsViolationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Restricted Apps Violation Collection Request.
 */
public class RestrictedAppsViolationCollectionRequest extends BaseCollectionRequest<RestrictedAppsViolationCollectionResponse, IRestrictedAppsViolationCollectionPage> implements IRestrictedAppsViolationCollectionRequest {

    /**
     * The request builder for this collection of RestrictedAppsViolation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public RestrictedAppsViolationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, RestrictedAppsViolationCollectionResponse.class, IRestrictedAppsViolationCollectionPage.class);
    }

    public void get(final ICallback<? super IRestrictedAppsViolationCollectionPage> callback) {
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

    public IRestrictedAppsViolationCollectionPage get() throws ClientException {
        final RestrictedAppsViolationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final RestrictedAppsViolation newRestrictedAppsViolation, final ICallback<? super RestrictedAppsViolation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new RestrictedAppsViolationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newRestrictedAppsViolation, callback);
    }

    public RestrictedAppsViolation post(final RestrictedAppsViolation newRestrictedAppsViolation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new RestrictedAppsViolationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newRestrictedAppsViolation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IRestrictedAppsViolationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (RestrictedAppsViolationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IRestrictedAppsViolationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (RestrictedAppsViolationCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IRestrictedAppsViolationCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (RestrictedAppsViolationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IRestrictedAppsViolationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (RestrictedAppsViolationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IRestrictedAppsViolationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (RestrictedAppsViolationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IRestrictedAppsViolationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (RestrictedAppsViolationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IRestrictedAppsViolationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IRestrictedAppsViolationCollectionRequest)this;
    }
    public IRestrictedAppsViolationCollectionPage buildFromResponse(final RestrictedAppsViolationCollectionResponse response) {
        final IRestrictedAppsViolationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new RestrictedAppsViolationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final RestrictedAppsViolationCollectionPage page = new RestrictedAppsViolationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

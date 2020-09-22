// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformance;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionResponse;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest;
import com.microsoft.graph.requests.extensions.UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the User Experience Analytics Device Startup Process Performance Collection Request.
 */
public class UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest extends BaseCollectionRequest<UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionResponse, IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage> implements IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest {

    /**
     * The request builder for this collection of UserExperienceAnalyticsDeviceStartupProcessPerformance
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionResponse.class, IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage.class);
    }

    public void get(final ICallback<IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage> callback) {
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

    public IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage get() throws ClientException {
        final UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final UserExperienceAnalyticsDeviceStartupProcessPerformance newUserExperienceAnalyticsDeviceStartupProcessPerformance, final ICallback<UserExperienceAnalyticsDeviceStartupProcessPerformance> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserExperienceAnalyticsDeviceStartupProcessPerformance, callback);
    }

    public UserExperienceAnalyticsDeviceStartupProcessPerformance post(final UserExperienceAnalyticsDeviceStartupProcessPerformance newUserExperienceAnalyticsDeviceStartupProcessPerformance) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new UserExperienceAnalyticsDeviceStartupProcessPerformanceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newUserExperienceAnalyticsDeviceStartupProcessPerformance);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequest)this;
    }
    public IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage buildFromResponse(final UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionResponse response) {
        final IUserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage page = new UserExperienceAnalyticsDeviceStartupProcessPerformanceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

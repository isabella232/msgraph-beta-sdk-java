// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DepOnboardingSetting;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingCollectionPage;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingCollectionResponse;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingCollectionRequest;
import com.microsoft.graph.requests.extensions.DepOnboardingSettingCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Onboarding Setting Collection Request.
 */
public class DepOnboardingSettingCollectionRequest extends BaseCollectionRequest<DepOnboardingSettingCollectionResponse, IDepOnboardingSettingCollectionPage> implements IDepOnboardingSettingCollectionRequest {

    /**
     * The request builder for this collection of DepOnboardingSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepOnboardingSettingCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DepOnboardingSettingCollectionResponse.class, IDepOnboardingSettingCollectionPage.class);
    }

    public void get(final ICallback<IDepOnboardingSettingCollectionPage> callback) {
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

    public IDepOnboardingSettingCollectionPage get() throws ClientException {
        final DepOnboardingSettingCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DepOnboardingSetting newDepOnboardingSetting, final ICallback<DepOnboardingSetting> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DepOnboardingSettingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDepOnboardingSetting, callback);
    }

    public DepOnboardingSetting post(final DepOnboardingSetting newDepOnboardingSetting) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DepOnboardingSettingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDepOnboardingSetting);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDepOnboardingSettingCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DepOnboardingSettingCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDepOnboardingSettingCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DepOnboardingSettingCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDepOnboardingSettingCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DepOnboardingSettingCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDepOnboardingSettingCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DepOnboardingSettingCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDepOnboardingSettingCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DepOnboardingSettingCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDepOnboardingSettingCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDepOnboardingSettingCollectionRequest)this;
    }
    public IDepOnboardingSettingCollectionPage buildFromResponse(final DepOnboardingSettingCollectionResponse response) {
        final IDepOnboardingSettingCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DepOnboardingSettingCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DepOnboardingSettingCollectionPage page = new DepOnboardingSettingCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

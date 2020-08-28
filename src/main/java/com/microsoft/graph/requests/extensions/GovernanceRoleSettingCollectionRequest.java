// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GovernanceRoleSetting;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingCollectionPage;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingCollectionResponse;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGovernanceRoleSettingCollectionRequest;
import com.microsoft.graph.requests.extensions.GovernanceRoleSettingCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Governance Role Setting Collection Request.
 */
public class GovernanceRoleSettingCollectionRequest extends BaseCollectionRequest<GovernanceRoleSettingCollectionResponse, IGovernanceRoleSettingCollectionPage> implements IGovernanceRoleSettingCollectionRequest {

    /**
     * The request builder for this collection of GovernanceRoleSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GovernanceRoleSettingCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GovernanceRoleSettingCollectionResponse.class, IGovernanceRoleSettingCollectionPage.class);
    }

    public void get(final ICallback<IGovernanceRoleSettingCollectionPage> callback) {
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

    public IGovernanceRoleSettingCollectionPage get() throws ClientException {
        final GovernanceRoleSettingCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final GovernanceRoleSetting newGovernanceRoleSetting, final ICallback<GovernanceRoleSetting> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new GovernanceRoleSettingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGovernanceRoleSetting, callback);
    }

    public GovernanceRoleSetting post(final GovernanceRoleSetting newGovernanceRoleSetting) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new GovernanceRoleSettingRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newGovernanceRoleSetting);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGovernanceRoleSettingCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GovernanceRoleSettingCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGovernanceRoleSettingCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (GovernanceRoleSettingCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IGovernanceRoleSettingCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (GovernanceRoleSettingCollectionRequest)this;
    }

    public IGovernanceRoleSettingCollectionPage buildFromResponse(final GovernanceRoleSettingCollectionResponse response) {
        final IGovernanceRoleSettingCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new GovernanceRoleSettingCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final GovernanceRoleSettingCollectionPage page = new GovernanceRoleSettingCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

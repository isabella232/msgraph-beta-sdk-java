// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.SkillProficiency;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ISkillProficiencyCollectionPage;
import com.microsoft.graph.requests.extensions.SkillProficiencyCollectionResponse;
import com.microsoft.graph.requests.extensions.ISkillProficiencyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISkillProficiencyCollectionRequest;
import com.microsoft.graph.requests.extensions.SkillProficiencyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Skill Proficiency Collection Request.
 */
public class SkillProficiencyCollectionRequest extends BaseCollectionRequest<SkillProficiencyCollectionResponse, ISkillProficiencyCollectionPage> implements ISkillProficiencyCollectionRequest {

    /**
     * The request builder for this collection of SkillProficiency
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SkillProficiencyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SkillProficiencyCollectionResponse.class, ISkillProficiencyCollectionPage.class);
    }

    public void get(final ICallback<ISkillProficiencyCollectionPage> callback) {
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

    public ISkillProficiencyCollectionPage get() throws ClientException {
        final SkillProficiencyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final SkillProficiency newSkillProficiency, final ICallback<SkillProficiency> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new SkillProficiencyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSkillProficiency, callback);
    }

    public SkillProficiency post(final SkillProficiency newSkillProficiency) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new SkillProficiencyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newSkillProficiency);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ISkillProficiencyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (SkillProficiencyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public ISkillProficiencyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (SkillProficiencyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ISkillProficiencyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (SkillProficiencyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ISkillProficiencyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (SkillProficiencyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public ISkillProficiencyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (SkillProficiencyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public ISkillProficiencyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (ISkillProficiencyCollectionRequest)this;
    }
    public ISkillProficiencyCollectionPage buildFromResponse(final SkillProficiencyCollectionResponse response) {
        final ISkillProficiencyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new SkillProficiencyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final SkillProficiencyCollectionPage page = new SkillProficiencyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

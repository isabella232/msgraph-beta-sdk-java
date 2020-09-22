// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.EducationAssignment;
import com.microsoft.graph.models.extensions.EducationAssignmentResource;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IEducationAssignmentResourceCollectionPage;
import com.microsoft.graph.requests.extensions.EducationAssignmentResourceCollectionResponse;
import com.microsoft.graph.requests.extensions.IEducationAssignmentResourceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEducationAssignmentResourceCollectionRequest;
import com.microsoft.graph.requests.extensions.EducationAssignmentResourceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Assignment Resource Collection Request.
 */
public class EducationAssignmentResourceCollectionRequest extends BaseCollectionRequest<EducationAssignmentResourceCollectionResponse, IEducationAssignmentResourceCollectionPage> implements IEducationAssignmentResourceCollectionRequest {

    /**
     * The request builder for this collection of EducationAssignmentResource
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public EducationAssignmentResourceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, EducationAssignmentResourceCollectionResponse.class, IEducationAssignmentResourceCollectionPage.class);
    }

    public void get(final ICallback<IEducationAssignmentResourceCollectionPage> callback) {
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

    public IEducationAssignmentResourceCollectionPage get() throws ClientException {
        final EducationAssignmentResourceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final EducationAssignmentResource newEducationAssignmentResource, final ICallback<EducationAssignmentResource> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new EducationAssignmentResourceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEducationAssignmentResource, callback);
    }

    public EducationAssignmentResource post(final EducationAssignmentResource newEducationAssignmentResource) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new EducationAssignmentResourceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newEducationAssignmentResource);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IEducationAssignmentResourceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (EducationAssignmentResourceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IEducationAssignmentResourceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (EducationAssignmentResourceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IEducationAssignmentResourceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (EducationAssignmentResourceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IEducationAssignmentResourceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (EducationAssignmentResourceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IEducationAssignmentResourceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (EducationAssignmentResourceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IEducationAssignmentResourceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IEducationAssignmentResourceCollectionRequest)this;
    }
    public IEducationAssignmentResourceCollectionPage buildFromResponse(final EducationAssignmentResourceCollectionResponse response) {
        final IEducationAssignmentResourceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new EducationAssignmentResourceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final EducationAssignmentResourceCollectionPage page = new EducationAssignmentResourceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

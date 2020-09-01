// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TermsAndConditions;
import com.microsoft.graph.models.extensions.TermsAndConditionsAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITermsAndConditionsAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.TermsAndConditionsAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Terms And Conditions Assignment Collection Request.
 */
public class TermsAndConditionsAssignmentCollectionRequest extends BaseCollectionRequest<TermsAndConditionsAssignmentCollectionResponse, ITermsAndConditionsAssignmentCollectionPage> implements ITermsAndConditionsAssignmentCollectionRequest {

    /**
     * The request builder for this collection of TermsAndConditionsAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TermsAndConditionsAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TermsAndConditionsAssignmentCollectionResponse.class, ITermsAndConditionsAssignmentCollectionPage.class);
    }

    public void get(final ICallback<ITermsAndConditionsAssignmentCollectionPage> callback) {
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

    public ITermsAndConditionsAssignmentCollectionPage get() throws ClientException {
        final TermsAndConditionsAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final TermsAndConditionsAssignment newTermsAndConditionsAssignment, final ICallback<TermsAndConditionsAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new TermsAndConditionsAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTermsAndConditionsAssignment, callback);
    }

    public TermsAndConditionsAssignment post(final TermsAndConditionsAssignment newTermsAndConditionsAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new TermsAndConditionsAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newTermsAndConditionsAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ITermsAndConditionsAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (TermsAndConditionsAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ITermsAndConditionsAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (TermsAndConditionsAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ITermsAndConditionsAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (TermsAndConditionsAssignmentCollectionRequest)this;
    }

    public ITermsAndConditionsAssignmentCollectionPage buildFromResponse(final TermsAndConditionsAssignmentCollectionResponse response) {
        final ITermsAndConditionsAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new TermsAndConditionsAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final TermsAndConditionsAssignmentCollectionPage page = new TermsAndConditionsAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
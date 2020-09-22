// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IntuneBrandingProfile;
import com.microsoft.graph.models.extensions.IntuneBrandingProfileAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileAssignmentCollectionPage;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileAssignmentCollectionResponse;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIntuneBrandingProfileAssignmentCollectionRequest;
import com.microsoft.graph.requests.extensions.IntuneBrandingProfileAssignmentCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Intune Branding Profile Assignment Collection Request.
 */
public class IntuneBrandingProfileAssignmentCollectionRequest extends BaseCollectionRequest<IntuneBrandingProfileAssignmentCollectionResponse, IIntuneBrandingProfileAssignmentCollectionPage> implements IIntuneBrandingProfileAssignmentCollectionRequest {

    /**
     * The request builder for this collection of IntuneBrandingProfileAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IntuneBrandingProfileAssignmentCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IntuneBrandingProfileAssignmentCollectionResponse.class, IIntuneBrandingProfileAssignmentCollectionPage.class);
    }

    public void get(final ICallback<IIntuneBrandingProfileAssignmentCollectionPage> callback) {
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

    public IIntuneBrandingProfileAssignmentCollectionPage get() throws ClientException {
        final IntuneBrandingProfileAssignmentCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final IntuneBrandingProfileAssignment newIntuneBrandingProfileAssignment, final ICallback<IntuneBrandingProfileAssignment> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new IntuneBrandingProfileAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newIntuneBrandingProfileAssignment, callback);
    }

    public IntuneBrandingProfileAssignment post(final IntuneBrandingProfileAssignment newIntuneBrandingProfileAssignment) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new IntuneBrandingProfileAssignmentRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newIntuneBrandingProfileAssignment);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IIntuneBrandingProfileAssignmentCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IntuneBrandingProfileAssignmentCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IIntuneBrandingProfileAssignmentCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IntuneBrandingProfileAssignmentCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IIntuneBrandingProfileAssignmentCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IntuneBrandingProfileAssignmentCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IIntuneBrandingProfileAssignmentCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (IntuneBrandingProfileAssignmentCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IIntuneBrandingProfileAssignmentCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (IntuneBrandingProfileAssignmentCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IIntuneBrandingProfileAssignmentCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IIntuneBrandingProfileAssignmentCollectionRequest)this;
    }
    public IIntuneBrandingProfileAssignmentCollectionPage buildFromResponse(final IntuneBrandingProfileAssignmentCollectionResponse response) {
        final IIntuneBrandingProfileAssignmentCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new IntuneBrandingProfileAssignmentCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final IntuneBrandingProfileAssignmentCollectionPage page = new IntuneBrandingProfileAssignmentCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

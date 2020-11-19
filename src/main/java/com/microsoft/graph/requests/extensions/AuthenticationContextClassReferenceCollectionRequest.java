// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ConditionalAccessRoot;
import com.microsoft.graph.models.extensions.AuthenticationContextClassReference;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAuthenticationContextClassReferenceCollectionPage;
import com.microsoft.graph.requests.extensions.AuthenticationContextClassReferenceCollectionResponse;
import com.microsoft.graph.requests.extensions.IAuthenticationContextClassReferenceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAuthenticationContextClassReferenceCollectionRequest;
import com.microsoft.graph.requests.extensions.AuthenticationContextClassReferenceCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Authentication Context Class Reference Collection Request.
 */
public class AuthenticationContextClassReferenceCollectionRequest extends BaseCollectionRequest<AuthenticationContextClassReferenceCollectionResponse, IAuthenticationContextClassReferenceCollectionPage> implements IAuthenticationContextClassReferenceCollectionRequest {

    /**
     * The request builder for this collection of AuthenticationContextClassReference
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AuthenticationContextClassReferenceCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AuthenticationContextClassReferenceCollectionResponse.class, IAuthenticationContextClassReferenceCollectionPage.class);
    }

    public void get(final ICallback<? super IAuthenticationContextClassReferenceCollectionPage> callback) {
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

    public IAuthenticationContextClassReferenceCollectionPage get() throws ClientException {
        final AuthenticationContextClassReferenceCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AuthenticationContextClassReference newAuthenticationContextClassReference, final ICallback<? super AuthenticationContextClassReference> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AuthenticationContextClassReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAuthenticationContextClassReference, callback);
    }

    public AuthenticationContextClassReference post(final AuthenticationContextClassReference newAuthenticationContextClassReference) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AuthenticationContextClassReferenceRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAuthenticationContextClassReference);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAuthenticationContextClassReferenceCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AuthenticationContextClassReferenceCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAuthenticationContextClassReferenceCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AuthenticationContextClassReferenceCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IAuthenticationContextClassReferenceCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (AuthenticationContextClassReferenceCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAuthenticationContextClassReferenceCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AuthenticationContextClassReferenceCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAuthenticationContextClassReferenceCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AuthenticationContextClassReferenceCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAuthenticationContextClassReferenceCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AuthenticationContextClassReferenceCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAuthenticationContextClassReferenceCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAuthenticationContextClassReferenceCollectionRequest)this;
    }
    public IAuthenticationContextClassReferenceCollectionPage buildFromResponse(final AuthenticationContextClassReferenceCollectionResponse response) {
        final IAuthenticationContextClassReferenceCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AuthenticationContextClassReferenceCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AuthenticationContextClassReferenceCollectionPage page = new AuthenticationContextClassReferenceCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Profile;
import com.microsoft.graph.models.extensions.PersonAnnotation;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPersonAnnotationCollectionPage;
import com.microsoft.graph.requests.extensions.PersonAnnotationCollectionResponse;
import com.microsoft.graph.requests.extensions.IPersonAnnotationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPersonAnnotationCollectionRequest;
import com.microsoft.graph.requests.extensions.PersonAnnotationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Person Annotation Collection Request.
 */
public class PersonAnnotationCollectionRequest extends BaseCollectionRequest<PersonAnnotationCollectionResponse, IPersonAnnotationCollectionPage> implements IPersonAnnotationCollectionRequest {

    /**
     * The request builder for this collection of PersonAnnotation
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PersonAnnotationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PersonAnnotationCollectionResponse.class, IPersonAnnotationCollectionPage.class);
    }

    public void get(final ICallback<IPersonAnnotationCollectionPage> callback) {
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

    public IPersonAnnotationCollectionPage get() throws ClientException {
        final PersonAnnotationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PersonAnnotation newPersonAnnotation, final ICallback<PersonAnnotation> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PersonAnnotationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPersonAnnotation, callback);
    }

    public PersonAnnotation post(final PersonAnnotation newPersonAnnotation) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PersonAnnotationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPersonAnnotation);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPersonAnnotationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PersonAnnotationCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPersonAnnotationCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PersonAnnotationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPersonAnnotationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PersonAnnotationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPersonAnnotationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PersonAnnotationCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPersonAnnotationCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PersonAnnotationCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPersonAnnotationCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPersonAnnotationCollectionRequest)this;
    }
    public IPersonAnnotationCollectionPage buildFromResponse(final PersonAnnotationCollectionResponse response) {
        final IPersonAnnotationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PersonAnnotationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PersonAnnotationCollectionPage page = new PersonAnnotationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

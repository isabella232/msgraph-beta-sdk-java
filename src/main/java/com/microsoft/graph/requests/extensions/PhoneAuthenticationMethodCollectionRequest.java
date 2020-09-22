// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Authentication;
import com.microsoft.graph.models.extensions.PhoneAuthenticationMethod;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IPhoneAuthenticationMethodCollectionPage;
import com.microsoft.graph.requests.extensions.PhoneAuthenticationMethodCollectionResponse;
import com.microsoft.graph.requests.extensions.IPhoneAuthenticationMethodCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPhoneAuthenticationMethodCollectionRequest;
import com.microsoft.graph.requests.extensions.PhoneAuthenticationMethodCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Phone Authentication Method Collection Request.
 */
public class PhoneAuthenticationMethodCollectionRequest extends BaseCollectionRequest<PhoneAuthenticationMethodCollectionResponse, IPhoneAuthenticationMethodCollectionPage> implements IPhoneAuthenticationMethodCollectionRequest {

    /**
     * The request builder for this collection of PhoneAuthenticationMethod
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PhoneAuthenticationMethodCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PhoneAuthenticationMethodCollectionResponse.class, IPhoneAuthenticationMethodCollectionPage.class);
    }

    public void get(final ICallback<IPhoneAuthenticationMethodCollectionPage> callback) {
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

    public IPhoneAuthenticationMethodCollectionPage get() throws ClientException {
        final PhoneAuthenticationMethodCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final PhoneAuthenticationMethod newPhoneAuthenticationMethod, final ICallback<PhoneAuthenticationMethod> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new PhoneAuthenticationMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPhoneAuthenticationMethod, callback);
    }

    public PhoneAuthenticationMethod post(final PhoneAuthenticationMethod newPhoneAuthenticationMethod) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new PhoneAuthenticationMethodRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newPhoneAuthenticationMethod);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPhoneAuthenticationMethodCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PhoneAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPhoneAuthenticationMethodCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PhoneAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPhoneAuthenticationMethodCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PhoneAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IPhoneAuthenticationMethodCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (PhoneAuthenticationMethodCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IPhoneAuthenticationMethodCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (PhoneAuthenticationMethodCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IPhoneAuthenticationMethodCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IPhoneAuthenticationMethodCollectionRequest)this;
    }
    public IPhoneAuthenticationMethodCollectionPage buildFromResponse(final PhoneAuthenticationMethodCollectionResponse response) {
        final IPhoneAuthenticationMethodCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new PhoneAuthenticationMethodCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final PhoneAuthenticationMethodCollectionPage page = new PhoneAuthenticationMethodCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

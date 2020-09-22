// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.AndroidForWorkAppConfigurationSchema;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaCollectionPage;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaCollectionResponse;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidForWorkAppConfigurationSchemaCollectionRequest;
import com.microsoft.graph.requests.extensions.AndroidForWorkAppConfigurationSchemaCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android For Work App Configuration Schema Collection Request.
 */
public class AndroidForWorkAppConfigurationSchemaCollectionRequest extends BaseCollectionRequest<AndroidForWorkAppConfigurationSchemaCollectionResponse, IAndroidForWorkAppConfigurationSchemaCollectionPage> implements IAndroidForWorkAppConfigurationSchemaCollectionRequest {

    /**
     * The request builder for this collection of AndroidForWorkAppConfigurationSchema
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AndroidForWorkAppConfigurationSchemaCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AndroidForWorkAppConfigurationSchemaCollectionResponse.class, IAndroidForWorkAppConfigurationSchemaCollectionPage.class);
    }

    public void get(final ICallback<IAndroidForWorkAppConfigurationSchemaCollectionPage> callback) {
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

    public IAndroidForWorkAppConfigurationSchemaCollectionPage get() throws ClientException {
        final AndroidForWorkAppConfigurationSchemaCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final AndroidForWorkAppConfigurationSchema newAndroidForWorkAppConfigurationSchema, final ICallback<AndroidForWorkAppConfigurationSchema> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new AndroidForWorkAppConfigurationSchemaRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAndroidForWorkAppConfigurationSchema, callback);
    }

    public AndroidForWorkAppConfigurationSchema post(final AndroidForWorkAppConfigurationSchema newAndroidForWorkAppConfigurationSchema) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new AndroidForWorkAppConfigurationSchemaRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newAndroidForWorkAppConfigurationSchema);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAndroidForWorkAppConfigurationSchemaCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (AndroidForWorkAppConfigurationSchemaCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAndroidForWorkAppConfigurationSchemaCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (AndroidForWorkAppConfigurationSchemaCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAndroidForWorkAppConfigurationSchemaCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (AndroidForWorkAppConfigurationSchemaCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAndroidForWorkAppConfigurationSchemaCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (AndroidForWorkAppConfigurationSchemaCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IAndroidForWorkAppConfigurationSchemaCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (AndroidForWorkAppConfigurationSchemaCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IAndroidForWorkAppConfigurationSchemaCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IAndroidForWorkAppConfigurationSchemaCollectionRequest)this;
    }
    public IAndroidForWorkAppConfigurationSchemaCollectionPage buildFromResponse(final AndroidForWorkAppConfigurationSchemaCollectionResponse response) {
        final IAndroidForWorkAppConfigurationSchemaCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AndroidForWorkAppConfigurationSchemaCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final AndroidForWorkAppConfigurationSchemaCollectionPage page = new AndroidForWorkAppConfigurationSchemaCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

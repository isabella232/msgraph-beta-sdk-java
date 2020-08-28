// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.CloudAppSecurityProfile;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.ICloudAppSecurityProfileCollectionPage;
import com.microsoft.graph.requests.extensions.CloudAppSecurityProfileCollectionResponse;
import com.microsoft.graph.requests.extensions.ICloudAppSecurityProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ICloudAppSecurityProfileCollectionRequest;
import com.microsoft.graph.requests.extensions.CloudAppSecurityProfileCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Cloud App Security Profile Collection Request.
 */
public class CloudAppSecurityProfileCollectionRequest extends BaseCollectionRequest<CloudAppSecurityProfileCollectionResponse, ICloudAppSecurityProfileCollectionPage> implements ICloudAppSecurityProfileCollectionRequest {

    /**
     * The request builder for this collection of CloudAppSecurityProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CloudAppSecurityProfileCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, CloudAppSecurityProfileCollectionResponse.class, ICloudAppSecurityProfileCollectionPage.class);
    }

    public void get(final ICallback<ICloudAppSecurityProfileCollectionPage> callback) {
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

    public ICloudAppSecurityProfileCollectionPage get() throws ClientException {
        final CloudAppSecurityProfileCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final CloudAppSecurityProfile newCloudAppSecurityProfile, final ICallback<CloudAppSecurityProfile> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new CloudAppSecurityProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newCloudAppSecurityProfile, callback);
    }

    public CloudAppSecurityProfile post(final CloudAppSecurityProfile newCloudAppSecurityProfile) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new CloudAppSecurityProfileRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newCloudAppSecurityProfile);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public ICloudAppSecurityProfileCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (CloudAppSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public ICloudAppSecurityProfileCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (CloudAppSecurityProfileCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public ICloudAppSecurityProfileCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (CloudAppSecurityProfileCollectionRequest)this;
    }

    public ICloudAppSecurityProfileCollectionPage buildFromResponse(final CloudAppSecurityProfileCollectionResponse response) {
        final ICloudAppSecurityProfileCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new CloudAppSecurityProfileCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final CloudAppSecurityProfileCollectionPage page = new CloudAppSecurityProfileCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

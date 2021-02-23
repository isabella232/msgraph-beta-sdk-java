// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicy;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationPolicyAssignment;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyCollectionPage;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyCollectionResponse;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementConfigurationPolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementConfigurationPolicyCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Configuration Policy Collection Request.
 */
public class DeviceManagementConfigurationPolicyCollectionRequest extends BaseCollectionRequest<DeviceManagementConfigurationPolicyCollectionResponse, IDeviceManagementConfigurationPolicyCollectionPage> implements IDeviceManagementConfigurationPolicyCollectionRequest {

    /**
     * The request builder for this collection of DeviceManagementConfigurationPolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementConfigurationPolicyCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceManagementConfigurationPolicyCollectionResponse.class, IDeviceManagementConfigurationPolicyCollectionPage.class);
    }

    public void get(final ICallback<? super IDeviceManagementConfigurationPolicyCollectionPage> callback) {
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

    public IDeviceManagementConfigurationPolicyCollectionPage get() throws ClientException {
        final DeviceManagementConfigurationPolicyCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final DeviceManagementConfigurationPolicy newDeviceManagementConfigurationPolicy, final ICallback<? super DeviceManagementConfigurationPolicy> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new DeviceManagementConfigurationPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementConfigurationPolicy, callback);
    }

    public DeviceManagementConfigurationPolicy post(final DeviceManagementConfigurationPolicy newDeviceManagementConfigurationPolicy) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new DeviceManagementConfigurationPolicyRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getHeaders())
            .post(newDeviceManagementConfigurationPolicy);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementConfigurationPolicyCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceManagementConfigurationPolicyCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceManagementConfigurationPolicyCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementConfigurationPolicyCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (DeviceManagementConfigurationPolicyCollectionRequest)this;
    }

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyCollectionRequest skip(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$skip", value + ""));
        return (DeviceManagementConfigurationPolicyCollectionRequest)this;
    }


    /**
     * Add Skip token for pagination
     * @param skipToken - Token for pagination
     * @return the updated request
     */
    public IDeviceManagementConfigurationPolicyCollectionRequest skipToken(final String skipToken) {
    	addQueryOption(new QueryOption("$skiptoken", skipToken));
        return (IDeviceManagementConfigurationPolicyCollectionRequest)this;
    }
    public IDeviceManagementConfigurationPolicyCollectionPage buildFromResponse(final DeviceManagementConfigurationPolicyCollectionResponse response) {
        final IDeviceManagementConfigurationPolicyCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new DeviceManagementConfigurationPolicyCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final DeviceManagementConfigurationPolicyCollectionPage page = new DeviceManagementConfigurationPolicyCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}
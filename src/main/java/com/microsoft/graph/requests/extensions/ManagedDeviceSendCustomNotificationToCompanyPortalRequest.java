// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ManagedDeviceSendCustomNotificationToCompanyPortalBody;
import com.microsoft.graph.requests.extensions.IManagedDeviceSendCustomNotificationToCompanyPortalRequest;
import com.microsoft.graph.requests.extensions.ManagedDeviceSendCustomNotificationToCompanyPortalRequest;

import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Managed Device Send Custom Notification To Company Portal Request.
 */
public class ManagedDeviceSendCustomNotificationToCompanyPortalRequest extends BaseRequest implements IManagedDeviceSendCustomNotificationToCompanyPortalRequest {
    protected final ManagedDeviceSendCustomNotificationToCompanyPortalBody body;

    /**
     * The request for this ManagedDeviceSendCustomNotificationToCompanyPortal
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ManagedDeviceSendCustomNotificationToCompanyPortalRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Void.class);
        body = new ManagedDeviceSendCustomNotificationToCompanyPortalBody();
    }

    public void post(final ICallback<? super Void> callback) {
        send(HttpMethod.POST, callback, body);
    }

    public Void post() throws ClientException {
        return send(HttpMethod.POST, body);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IManagedDeviceSendCustomNotificationToCompanyPortalRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (ManagedDeviceSendCustomNotificationToCompanyPortalRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IManagedDeviceSendCustomNotificationToCompanyPortalRequest top(final int value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (ManagedDeviceSendCustomNotificationToCompanyPortalRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IManagedDeviceSendCustomNotificationToCompanyPortalRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (ManagedDeviceSendCustomNotificationToCompanyPortalRequest)this;
    }

}

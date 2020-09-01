// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Security;
import com.microsoft.graph.models.extensions.Alert;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAlertCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAlertRequestBuilder;
import com.microsoft.graph.requests.extensions.IAlertCollectionRequest;
import com.microsoft.graph.requests.extensions.IAlertUpdateAlertsCollectionRequestBuilder;
import com.microsoft.graph.http.BaseRequestBuilder;
import com.microsoft.graph.core.IBaseClient;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert Collection Request Builder.
 */
public class AlertCollectionRequestBuilder extends BaseRequestBuilder implements IAlertCollectionRequestBuilder {

    /**
     * The request builder for this collection of Security
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AlertCollectionRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    public IAlertCollectionRequest buildRequest() {
        return buildRequest(getOptions());
    }

    public IAlertCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new AlertCollectionRequest(getRequestUrl(), getClient(), requestOptions);
    }

    public IAlertRequestBuilder byId(final String id) {
        return new AlertRequestBuilder(getRequestUrlWithAdditionalSegment(id), getClient(), getOptions());
    }



    public IAlertUpdateAlertsCollectionRequestBuilder updateAlerts(final java.util.List<Alert> value) {
        return new AlertUpdateAlertsCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateAlerts"), getClient(), null, value);
    }
}
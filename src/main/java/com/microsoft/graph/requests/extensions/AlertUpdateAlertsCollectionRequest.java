// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Alert;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAlertUpdateAlertsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.AlertUpdateAlertsCollectionPage;
import com.microsoft.graph.requests.extensions.AlertUpdateAlertsCollectionResponse;
import com.microsoft.graph.models.extensions.AlertUpdateAlertsBody;
import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Alert Update Alerts Collection Request.
 */
public class AlertUpdateAlertsCollectionRequest extends BaseCollectionRequest<AlertUpdateAlertsCollectionResponse, IAlertUpdateAlertsCollectionPage> implements IAlertUpdateAlertsCollectionRequest {


    protected final AlertUpdateAlertsBody body;


    /**
     * The request for this AlertUpdateAlerts
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AlertUpdateAlertsCollectionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AlertUpdateAlertsCollectionResponse.class, IAlertUpdateAlertsCollectionPage.class);
        body = new AlertUpdateAlertsBody();
    }


    public void post(final ICallback<? super IAlertUpdateAlertsCollectionPage> callback) {
        final IExecutors executors = getBaseRequest().getClient().getExecutors();
        executors.performOnBackground(new Runnable() {
           @Override
           public void run() {
                try {
                    executors.performOnForeground(post(), callback);
                } catch (final ClientException e) {
                    executors.performOnForeground(e, callback);
                }
           }
        });
    }

    public IAlertUpdateAlertsCollectionPage post() throws ClientException {
        final AlertUpdateAlertsCollectionResponse response = post(body);
        return buildFromResponse(response);
    }


    public IAlertUpdateAlertsCollectionPage buildFromResponse(final AlertUpdateAlertsCollectionResponse response) {
        final IAlertUpdateAlertsCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new AlertUpdateAlertsCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null, (java.util.List<Alert>) null);
        } else {
            builder = null;
        }
        final IAlertUpdateAlertsCollectionPage page = new AlertUpdateAlertsCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IAlertUpdateAlertsCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IAlertUpdateAlertsCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IAlertUpdateAlertsCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value+""));
        return (IAlertUpdateAlertsCollectionRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IAlertUpdateAlertsCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (IAlertUpdateAlertsCollectionRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IAlertUpdateAlertsCollectionRequest filter(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (IAlertUpdateAlertsCollectionRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IAlertUpdateAlertsCollectionRequest orderBy(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (IAlertUpdateAlertsCollectionRequest)this;
    }

}

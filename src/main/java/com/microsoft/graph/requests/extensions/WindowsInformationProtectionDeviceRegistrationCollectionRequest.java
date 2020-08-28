// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationCollectionPage;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationCollectionResponse;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationCollectionRequest;
import com.microsoft.graph.requests.extensions.WindowsInformationProtectionDeviceRegistrationCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration Collection Request.
 */
public class WindowsInformationProtectionDeviceRegistrationCollectionRequest extends BaseCollectionRequest<WindowsInformationProtectionDeviceRegistrationCollectionResponse, IWindowsInformationProtectionDeviceRegistrationCollectionPage> implements IWindowsInformationProtectionDeviceRegistrationCollectionRequest {

    /**
     * The request builder for this collection of WindowsInformationProtectionDeviceRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionDeviceRegistrationCollectionRequest(final String requestUrl, IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionDeviceRegistrationCollectionResponse.class, IWindowsInformationProtectionDeviceRegistrationCollectionPage.class);
    }

    public void get(final ICallback<IWindowsInformationProtectionDeviceRegistrationCollectionPage> callback) {
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

    public IWindowsInformationProtectionDeviceRegistrationCollectionPage get() throws ClientException {
        final WindowsInformationProtectionDeviceRegistrationCollectionResponse response = send();
        return buildFromResponse(response);
    }

    public void post(final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration, final ICallback<WindowsInformationProtectionDeviceRegistration> callback) {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        new WindowsInformationProtectionDeviceRegistrationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsInformationProtectionDeviceRegistration, callback);
    }

    public WindowsInformationProtectionDeviceRegistration post(final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration) throws ClientException {
        final String requestUrl = getBaseRequest().getRequestUrl().toString();
        return new WindowsInformationProtectionDeviceRegistrationRequestBuilder(requestUrl, getBaseRequest().getClient(), /* Options */ null)
            .buildRequest(getBaseRequest().getOptions())
            .post(newWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IWindowsInformationProtectionDeviceRegistrationCollectionRequest expand(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (WindowsInformationProtectionDeviceRegistrationCollectionRequest)this;
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IWindowsInformationProtectionDeviceRegistrationCollectionRequest select(final String value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$select", value));
        return (WindowsInformationProtectionDeviceRegistrationCollectionRequest)this;
    }

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    public IWindowsInformationProtectionDeviceRegistrationCollectionRequest top(final int value) {
        addQueryOption(new com.microsoft.graph.options.QueryOption("$top", value + ""));
        return (WindowsInformationProtectionDeviceRegistrationCollectionRequest)this;
    }

    public IWindowsInformationProtectionDeviceRegistrationCollectionPage buildFromResponse(final WindowsInformationProtectionDeviceRegistrationCollectionResponse response) {
        final IWindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder builder;
        if (response.nextLink != null) {
            builder = new WindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder(response.nextLink, getBaseRequest().getClient(), /* options */ null);
        } else {
            builder = null;
        }
        final WindowsInformationProtectionDeviceRegistrationCollectionPage page = new WindowsInformationProtectionDeviceRegistrationCollectionPage(response, builder);
        page.setRawObject(response.getSerializer(), response.getRawObject());
        return page;
    }
}

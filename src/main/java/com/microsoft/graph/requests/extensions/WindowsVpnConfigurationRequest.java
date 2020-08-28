// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsVpnConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Vpn Configuration Request.
 */
public class WindowsVpnConfigurationRequest extends BaseRequest implements IWindowsVpnConfigurationRequest {
	
    /**
     * The request for the WindowsVpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public WindowsVpnConfigurationRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends WindowsVpnConfiguration> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the WindowsVpnConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsVpnConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsVpnConfiguration.class);
    }

    /**
     * Gets the WindowsVpnConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsVpnConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsVpnConfiguration from the service
     *
     * @return the WindowsVpnConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsVpnConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsVpnConfiguration> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this WindowsVpnConfiguration with a source
     *
     * @param sourceWindowsVpnConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsVpnConfiguration sourceWindowsVpnConfiguration, final ICallback<WindowsVpnConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsVpnConfiguration);
    }

    /**
     * Patches this WindowsVpnConfiguration with a source
     *
     * @param sourceWindowsVpnConfiguration the source object with updates
     * @return the updated WindowsVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsVpnConfiguration patch(final WindowsVpnConfiguration sourceWindowsVpnConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsVpnConfiguration);
    }

    /**
     * Creates a WindowsVpnConfiguration with a new object
     *
     * @param newWindowsVpnConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsVpnConfiguration newWindowsVpnConfiguration, final ICallback<WindowsVpnConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindowsVpnConfiguration);
    }

    /**
     * Creates a WindowsVpnConfiguration with a new object
     *
     * @param newWindowsVpnConfiguration the new object to create
     * @return the created WindowsVpnConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsVpnConfiguration post(final WindowsVpnConfiguration newWindowsVpnConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsVpnConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsVpnConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsVpnConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsVpnConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsVpnConfigurationRequest)this;
     }

}


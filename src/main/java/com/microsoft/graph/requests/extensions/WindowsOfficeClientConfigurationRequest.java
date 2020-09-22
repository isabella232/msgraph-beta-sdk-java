// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsOfficeClientConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Office Client Configuration Request.
 */
public class WindowsOfficeClientConfigurationRequest extends BaseRequest implements IWindowsOfficeClientConfigurationRequest {
	
    /**
     * The request for the WindowsOfficeClientConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsOfficeClientConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsOfficeClientConfiguration.class);
    }

    /**
     * Gets the WindowsOfficeClientConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsOfficeClientConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsOfficeClientConfiguration from the service
     *
     * @return the WindowsOfficeClientConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsOfficeClientConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsOfficeClientConfiguration> callback) {
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
     * Patches this WindowsOfficeClientConfiguration with a source
     *
     * @param sourceWindowsOfficeClientConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsOfficeClientConfiguration sourceWindowsOfficeClientConfiguration, final ICallback<WindowsOfficeClientConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsOfficeClientConfiguration);
    }

    /**
     * Patches this WindowsOfficeClientConfiguration with a source
     *
     * @param sourceWindowsOfficeClientConfiguration the source object with updates
     * @return the updated WindowsOfficeClientConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsOfficeClientConfiguration patch(final WindowsOfficeClientConfiguration sourceWindowsOfficeClientConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsOfficeClientConfiguration);
    }

    /**
     * Creates a WindowsOfficeClientConfiguration with a new object
     *
     * @param newWindowsOfficeClientConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsOfficeClientConfiguration newWindowsOfficeClientConfiguration, final ICallback<WindowsOfficeClientConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindowsOfficeClientConfiguration);
    }

    /**
     * Creates a WindowsOfficeClientConfiguration with a new object
     *
     * @param newWindowsOfficeClientConfiguration the new object to create
     * @return the created WindowsOfficeClientConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsOfficeClientConfiguration post(final WindowsOfficeClientConfiguration newWindowsOfficeClientConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsOfficeClientConfiguration);
    }

    /**
     * Creates a WindowsOfficeClientConfiguration with a new object
     *
     * @param newWindowsOfficeClientConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsOfficeClientConfiguration newWindowsOfficeClientConfiguration, final ICallback<WindowsOfficeClientConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindowsOfficeClientConfiguration);
    }

    /**
     * Creates a WindowsOfficeClientConfiguration with a new object
     *
     * @param newWindowsOfficeClientConfiguration the object to create/update
     * @return the created WindowsOfficeClientConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsOfficeClientConfiguration put(final WindowsOfficeClientConfiguration newWindowsOfficeClientConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsOfficeClientConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsOfficeClientConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsOfficeClientConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsOfficeClientConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsOfficeClientConfigurationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWindowsOfficeClientConfigurationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WindowsOfficeClientConfigurationRequest)this;
     }

}


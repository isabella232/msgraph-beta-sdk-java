// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsPhone81CustomConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Phone81Custom Configuration Request.
 */
public class WindowsPhone81CustomConfigurationRequest extends BaseRequest implements IWindowsPhone81CustomConfigurationRequest {
	
    /**
     * The request for the WindowsPhone81CustomConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsPhone81CustomConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsPhone81CustomConfiguration.class);
    }

    /**
     * Gets the WindowsPhone81CustomConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsPhone81CustomConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsPhone81CustomConfiguration from the service
     *
     * @return the WindowsPhone81CustomConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81CustomConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsPhone81CustomConfiguration> callback) {
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
     * Patches this WindowsPhone81CustomConfiguration with a source
     *
     * @param sourceWindowsPhone81CustomConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsPhone81CustomConfiguration sourceWindowsPhone81CustomConfiguration, final ICallback<? super WindowsPhone81CustomConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsPhone81CustomConfiguration);
    }

    /**
     * Patches this WindowsPhone81CustomConfiguration with a source
     *
     * @param sourceWindowsPhone81CustomConfiguration the source object with updates
     * @return the updated WindowsPhone81CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81CustomConfiguration patch(final WindowsPhone81CustomConfiguration sourceWindowsPhone81CustomConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsPhone81CustomConfiguration);
    }

    /**
     * Creates a WindowsPhone81CustomConfiguration with a new object
     *
     * @param newWindowsPhone81CustomConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsPhone81CustomConfiguration newWindowsPhone81CustomConfiguration, final ICallback<? super WindowsPhone81CustomConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindowsPhone81CustomConfiguration);
    }

    /**
     * Creates a WindowsPhone81CustomConfiguration with a new object
     *
     * @param newWindowsPhone81CustomConfiguration the new object to create
     * @return the created WindowsPhone81CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81CustomConfiguration post(final WindowsPhone81CustomConfiguration newWindowsPhone81CustomConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsPhone81CustomConfiguration);
    }

    /**
     * Creates a WindowsPhone81CustomConfiguration with a new object
     *
     * @param newWindowsPhone81CustomConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsPhone81CustomConfiguration newWindowsPhone81CustomConfiguration, final ICallback<? super WindowsPhone81CustomConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindowsPhone81CustomConfiguration);
    }

    /**
     * Creates a WindowsPhone81CustomConfiguration with a new object
     *
     * @param newWindowsPhone81CustomConfiguration the object to create/update
     * @return the created WindowsPhone81CustomConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsPhone81CustomConfiguration put(final WindowsPhone81CustomConfiguration newWindowsPhone81CustomConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsPhone81CustomConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsPhone81CustomConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsPhone81CustomConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsPhone81CustomConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsPhone81CustomConfigurationRequest)this;
     }

}


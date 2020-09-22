// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsIdentityProtectionConfiguration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Identity Protection Configuration Request.
 */
public class WindowsIdentityProtectionConfigurationRequest extends BaseRequest implements IWindowsIdentityProtectionConfigurationRequest {
	
    /**
     * The request for the WindowsIdentityProtectionConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsIdentityProtectionConfigurationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsIdentityProtectionConfiguration.class);
    }

    /**
     * Gets the WindowsIdentityProtectionConfiguration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsIdentityProtectionConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsIdentityProtectionConfiguration from the service
     *
     * @return the WindowsIdentityProtectionConfiguration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsIdentityProtectionConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsIdentityProtectionConfiguration> callback) {
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
     * Patches this WindowsIdentityProtectionConfiguration with a source
     *
     * @param sourceWindowsIdentityProtectionConfiguration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsIdentityProtectionConfiguration sourceWindowsIdentityProtectionConfiguration, final ICallback<WindowsIdentityProtectionConfiguration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsIdentityProtectionConfiguration);
    }

    /**
     * Patches this WindowsIdentityProtectionConfiguration with a source
     *
     * @param sourceWindowsIdentityProtectionConfiguration the source object with updates
     * @return the updated WindowsIdentityProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsIdentityProtectionConfiguration patch(final WindowsIdentityProtectionConfiguration sourceWindowsIdentityProtectionConfiguration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsIdentityProtectionConfiguration);
    }

    /**
     * Creates a WindowsIdentityProtectionConfiguration with a new object
     *
     * @param newWindowsIdentityProtectionConfiguration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsIdentityProtectionConfiguration newWindowsIdentityProtectionConfiguration, final ICallback<WindowsIdentityProtectionConfiguration> callback) {
        send(HttpMethod.POST, callback, newWindowsIdentityProtectionConfiguration);
    }

    /**
     * Creates a WindowsIdentityProtectionConfiguration with a new object
     *
     * @param newWindowsIdentityProtectionConfiguration the new object to create
     * @return the created WindowsIdentityProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsIdentityProtectionConfiguration post(final WindowsIdentityProtectionConfiguration newWindowsIdentityProtectionConfiguration) throws ClientException {
        return send(HttpMethod.POST, newWindowsIdentityProtectionConfiguration);
    }

    /**
     * Creates a WindowsIdentityProtectionConfiguration with a new object
     *
     * @param newWindowsIdentityProtectionConfiguration the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsIdentityProtectionConfiguration newWindowsIdentityProtectionConfiguration, final ICallback<WindowsIdentityProtectionConfiguration> callback) {
        send(HttpMethod.PUT, callback, newWindowsIdentityProtectionConfiguration);
    }

    /**
     * Creates a WindowsIdentityProtectionConfiguration with a new object
     *
     * @param newWindowsIdentityProtectionConfiguration the object to create/update
     * @return the created WindowsIdentityProtectionConfiguration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsIdentityProtectionConfiguration put(final WindowsIdentityProtectionConfiguration newWindowsIdentityProtectionConfiguration) throws ClientException {
        return send(HttpMethod.PUT, newWindowsIdentityProtectionConfiguration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsIdentityProtectionConfigurationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsIdentityProtectionConfigurationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsIdentityProtectionConfigurationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsIdentityProtectionConfigurationRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWindowsIdentityProtectionConfigurationRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WindowsIdentityProtectionConfigurationRequest)this;
     }

}


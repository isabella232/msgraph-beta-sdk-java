// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeviceIdentity;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Device Identity Request.
 */
public class WindowsAutopilotDeviceIdentityRequest extends BaseRequest implements IWindowsAutopilotDeviceIdentityRequest {
	
    /**
     * The request for the WindowsAutopilotDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeviceIdentityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsAutopilotDeviceIdentity.class);
    }

    /**
     * Gets the WindowsAutopilotDeviceIdentity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsAutopilotDeviceIdentity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsAutopilotDeviceIdentity from the service
     *
     * @return the WindowsAutopilotDeviceIdentity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotDeviceIdentity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsAutopilotDeviceIdentity> callback) {
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
     * Patches this WindowsAutopilotDeviceIdentity with a source
     *
     * @param sourceWindowsAutopilotDeviceIdentity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsAutopilotDeviceIdentity sourceWindowsAutopilotDeviceIdentity, final ICallback<WindowsAutopilotDeviceIdentity> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsAutopilotDeviceIdentity);
    }

    /**
     * Patches this WindowsAutopilotDeviceIdentity with a source
     *
     * @param sourceWindowsAutopilotDeviceIdentity the source object with updates
     * @return the updated WindowsAutopilotDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotDeviceIdentity patch(final WindowsAutopilotDeviceIdentity sourceWindowsAutopilotDeviceIdentity) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsAutopilotDeviceIdentity);
    }

    /**
     * Creates a WindowsAutopilotDeviceIdentity with a new object
     *
     * @param newWindowsAutopilotDeviceIdentity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsAutopilotDeviceIdentity newWindowsAutopilotDeviceIdentity, final ICallback<WindowsAutopilotDeviceIdentity> callback) {
        send(HttpMethod.POST, callback, newWindowsAutopilotDeviceIdentity);
    }

    /**
     * Creates a WindowsAutopilotDeviceIdentity with a new object
     *
     * @param newWindowsAutopilotDeviceIdentity the new object to create
     * @return the created WindowsAutopilotDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotDeviceIdentity post(final WindowsAutopilotDeviceIdentity newWindowsAutopilotDeviceIdentity) throws ClientException {
        return send(HttpMethod.POST, newWindowsAutopilotDeviceIdentity);
    }

    /**
     * Creates a WindowsAutopilotDeviceIdentity with a new object
     *
     * @param newWindowsAutopilotDeviceIdentity the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsAutopilotDeviceIdentity newWindowsAutopilotDeviceIdentity, final ICallback<WindowsAutopilotDeviceIdentity> callback) {
        send(HttpMethod.PUT, callback, newWindowsAutopilotDeviceIdentity);
    }

    /**
     * Creates a WindowsAutopilotDeviceIdentity with a new object
     *
     * @param newWindowsAutopilotDeviceIdentity the object to create/update
     * @return the created WindowsAutopilotDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotDeviceIdentity put(final WindowsAutopilotDeviceIdentity newWindowsAutopilotDeviceIdentity) throws ClientException {
        return send(HttpMethod.PUT, newWindowsAutopilotDeviceIdentity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsAutopilotDeviceIdentityRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsAutopilotDeviceIdentityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsAutopilotDeviceIdentityRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsAutopilotDeviceIdentityRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWindowsAutopilotDeviceIdentityRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WindowsAutopilotDeviceIdentityRequest)this;
     }

}


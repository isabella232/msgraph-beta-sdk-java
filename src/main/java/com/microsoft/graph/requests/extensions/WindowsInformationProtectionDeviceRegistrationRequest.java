// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsInformationProtectionDeviceRegistration;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Information Protection Device Registration Request.
 */
public class WindowsInformationProtectionDeviceRegistrationRequest extends BaseRequest implements IWindowsInformationProtectionDeviceRegistrationRequest {
	
    /**
     * The request for the WindowsInformationProtectionDeviceRegistration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsInformationProtectionDeviceRegistrationRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsInformationProtectionDeviceRegistration.class);
    }

    /**
     * Gets the WindowsInformationProtectionDeviceRegistration from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsInformationProtectionDeviceRegistration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsInformationProtectionDeviceRegistration from the service
     *
     * @return the WindowsInformationProtectionDeviceRegistration from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionDeviceRegistration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsInformationProtectionDeviceRegistration> callback) {
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
     * Patches this WindowsInformationProtectionDeviceRegistration with a source
     *
     * @param sourceWindowsInformationProtectionDeviceRegistration the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsInformationProtectionDeviceRegistration sourceWindowsInformationProtectionDeviceRegistration, final ICallback<WindowsInformationProtectionDeviceRegistration> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Patches this WindowsInformationProtectionDeviceRegistration with a source
     *
     * @param sourceWindowsInformationProtectionDeviceRegistration the source object with updates
     * @return the updated WindowsInformationProtectionDeviceRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionDeviceRegistration patch(final WindowsInformationProtectionDeviceRegistration sourceWindowsInformationProtectionDeviceRegistration) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Creates a WindowsInformationProtectionDeviceRegistration with a new object
     *
     * @param newWindowsInformationProtectionDeviceRegistration the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration, final ICallback<WindowsInformationProtectionDeviceRegistration> callback) {
        send(HttpMethod.POST, callback, newWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Creates a WindowsInformationProtectionDeviceRegistration with a new object
     *
     * @param newWindowsInformationProtectionDeviceRegistration the new object to create
     * @return the created WindowsInformationProtectionDeviceRegistration
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsInformationProtectionDeviceRegistration post(final WindowsInformationProtectionDeviceRegistration newWindowsInformationProtectionDeviceRegistration) throws ClientException {
        return send(HttpMethod.POST, newWindowsInformationProtectionDeviceRegistration);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsInformationProtectionDeviceRegistrationRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsInformationProtectionDeviceRegistrationRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsInformationProtectionDeviceRegistrationRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsInformationProtectionDeviceRegistrationRequest)this;
     }

}

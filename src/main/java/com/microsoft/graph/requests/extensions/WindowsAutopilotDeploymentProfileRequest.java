// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsAutopilotDeploymentProfile;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsAutopilotDeploymentProfileAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsAutopilotDeploymentProfileAssignmentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Autopilot Deployment Profile Request.
 */
public class WindowsAutopilotDeploymentProfileRequest extends BaseRequest implements IWindowsAutopilotDeploymentProfileRequest {
	
    /**
     * The request for the WindowsAutopilotDeploymentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public WindowsAutopilotDeploymentProfileRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends WindowsAutopilotDeploymentProfile> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the WindowsAutopilotDeploymentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsAutopilotDeploymentProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsAutopilotDeploymentProfile.class);
    }

    /**
     * Gets the WindowsAutopilotDeploymentProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<WindowsAutopilotDeploymentProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsAutopilotDeploymentProfile from the service
     *
     * @return the WindowsAutopilotDeploymentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotDeploymentProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<WindowsAutopilotDeploymentProfile> callback) {
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
     * Patches this WindowsAutopilotDeploymentProfile with a source
     *
     * @param sourceWindowsAutopilotDeploymentProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsAutopilotDeploymentProfile sourceWindowsAutopilotDeploymentProfile, final ICallback<WindowsAutopilotDeploymentProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsAutopilotDeploymentProfile);
    }

    /**
     * Patches this WindowsAutopilotDeploymentProfile with a source
     *
     * @param sourceWindowsAutopilotDeploymentProfile the source object with updates
     * @return the updated WindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotDeploymentProfile patch(final WindowsAutopilotDeploymentProfile sourceWindowsAutopilotDeploymentProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a WindowsAutopilotDeploymentProfile with a new object
     *
     * @param newWindowsAutopilotDeploymentProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsAutopilotDeploymentProfile newWindowsAutopilotDeploymentProfile, final ICallback<WindowsAutopilotDeploymentProfile> callback) {
        send(HttpMethod.POST, callback, newWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a WindowsAutopilotDeploymentProfile with a new object
     *
     * @param newWindowsAutopilotDeploymentProfile the new object to create
     * @return the created WindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotDeploymentProfile post(final WindowsAutopilotDeploymentProfile newWindowsAutopilotDeploymentProfile) throws ClientException {
        return send(HttpMethod.POST, newWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a WindowsAutopilotDeploymentProfile with a new object
     *
     * @param newWindowsAutopilotDeploymentProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsAutopilotDeploymentProfile newWindowsAutopilotDeploymentProfile, final ICallback<WindowsAutopilotDeploymentProfile> callback) {
        send(HttpMethod.PUT, callback, newWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a WindowsAutopilotDeploymentProfile with a new object
     *
     * @param newWindowsAutopilotDeploymentProfile the object to create/update
     * @return the created WindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsAutopilotDeploymentProfile put(final WindowsAutopilotDeploymentProfile newWindowsAutopilotDeploymentProfile) throws ClientException {
        return send(HttpMethod.PUT, newWindowsAutopilotDeploymentProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsAutopilotDeploymentProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsAutopilotDeploymentProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsAutopilotDeploymentProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsAutopilotDeploymentProfileRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IWindowsAutopilotDeploymentProfileRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (WindowsAutopilotDeploymentProfileRequest)this;
     }

}


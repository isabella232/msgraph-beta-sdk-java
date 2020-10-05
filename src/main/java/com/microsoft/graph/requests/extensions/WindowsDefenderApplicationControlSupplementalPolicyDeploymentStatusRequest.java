// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.WindowsDefenderApplicationControlSupplementalPolicyRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Windows Defender Application Control Supplemental Policy Deployment Status Request.
 */
public class WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest extends BaseRequest implements IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest {
	
    /**
     * The request for the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus.class);
    }

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus from the service
     *
     * @return the WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> callback) {
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
     * Patches this WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> callback) {
        send(HttpMethod.PATCH, callback, sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Patches this WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a source
     *
     * @param sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the source object with updates
     * @return the updated WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus patch(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) throws ClientException {
        return send(HttpMethod.PATCH, sourceWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> callback) {
        send(HttpMethod.POST, callback, newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the new object to create
     * @return the created WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus post(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) throws ClientException {
        return send(HttpMethod.POST, newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus, final ICallback<? super WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus> callback) {
        send(HttpMethod.PUT, callback, newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Creates a WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus with a new object
     *
     * @param newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus the object to create/update
     * @return the created WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus put(final WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus) throws ClientException {
        return send(HttpMethod.PUT, newWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatus);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IWindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (WindowsDefenderApplicationControlSupplementalPolicyDeploymentStatusRequest)this;
     }

}


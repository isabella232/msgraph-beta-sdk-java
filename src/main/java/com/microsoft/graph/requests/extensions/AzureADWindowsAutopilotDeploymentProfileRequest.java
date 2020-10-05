// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.AzureADWindowsAutopilotDeploymentProfile;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Azure ADWindows Autopilot Deployment Profile Request.
 */
public class AzureADWindowsAutopilotDeploymentProfileRequest extends BaseRequest implements IAzureADWindowsAutopilotDeploymentProfileRequest {
	
    /**
     * The request for the AzureADWindowsAutopilotDeploymentProfile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public AzureADWindowsAutopilotDeploymentProfileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, AzureADWindowsAutopilotDeploymentProfile.class);
    }

    /**
     * Gets the AzureADWindowsAutopilotDeploymentProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super AzureADWindowsAutopilotDeploymentProfile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the AzureADWindowsAutopilotDeploymentProfile from the service
     *
     * @return the AzureADWindowsAutopilotDeploymentProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AzureADWindowsAutopilotDeploymentProfile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super AzureADWindowsAutopilotDeploymentProfile> callback) {
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
     * Patches this AzureADWindowsAutopilotDeploymentProfile with a source
     *
     * @param sourceAzureADWindowsAutopilotDeploymentProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final AzureADWindowsAutopilotDeploymentProfile sourceAzureADWindowsAutopilotDeploymentProfile, final ICallback<? super AzureADWindowsAutopilotDeploymentProfile> callback) {
        send(HttpMethod.PATCH, callback, sourceAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Patches this AzureADWindowsAutopilotDeploymentProfile with a source
     *
     * @param sourceAzureADWindowsAutopilotDeploymentProfile the source object with updates
     * @return the updated AzureADWindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AzureADWindowsAutopilotDeploymentProfile patch(final AzureADWindowsAutopilotDeploymentProfile sourceAzureADWindowsAutopilotDeploymentProfile) throws ClientException {
        return send(HttpMethod.PATCH, sourceAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a AzureADWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newAzureADWindowsAutopilotDeploymentProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final AzureADWindowsAutopilotDeploymentProfile newAzureADWindowsAutopilotDeploymentProfile, final ICallback<? super AzureADWindowsAutopilotDeploymentProfile> callback) {
        send(HttpMethod.POST, callback, newAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a AzureADWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newAzureADWindowsAutopilotDeploymentProfile the new object to create
     * @return the created AzureADWindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AzureADWindowsAutopilotDeploymentProfile post(final AzureADWindowsAutopilotDeploymentProfile newAzureADWindowsAutopilotDeploymentProfile) throws ClientException {
        return send(HttpMethod.POST, newAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a AzureADWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newAzureADWindowsAutopilotDeploymentProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final AzureADWindowsAutopilotDeploymentProfile newAzureADWindowsAutopilotDeploymentProfile, final ICallback<? super AzureADWindowsAutopilotDeploymentProfile> callback) {
        send(HttpMethod.PUT, callback, newAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Creates a AzureADWindowsAutopilotDeploymentProfile with a new object
     *
     * @param newAzureADWindowsAutopilotDeploymentProfile the object to create/update
     * @return the created AzureADWindowsAutopilotDeploymentProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public AzureADWindowsAutopilotDeploymentProfile put(final AzureADWindowsAutopilotDeploymentProfile newAzureADWindowsAutopilotDeploymentProfile) throws ClientException {
        return send(HttpMethod.PUT, newAzureADWindowsAutopilotDeploymentProfile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IAzureADWindowsAutopilotDeploymentProfileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (AzureADWindowsAutopilotDeploymentProfileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IAzureADWindowsAutopilotDeploymentProfileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (AzureADWindowsAutopilotDeploymentProfileRequest)this;
     }

}


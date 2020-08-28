// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityConfigurationTask;
import com.microsoft.graph.requests.extensions.IVulnerableManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IVulnerableManagedDeviceRequestBuilder;
import com.microsoft.graph.requests.extensions.VulnerableManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.VulnerableManagedDeviceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Configuration Task Request.
 */
public class SecurityConfigurationTaskRequest extends BaseRequest implements ISecurityConfigurationTaskRequest {
	
    /**
     * The request for the SecurityConfigurationTask
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityConfigurationTaskRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecurityConfigurationTask.class);
    }

    /**
     * Gets the SecurityConfigurationTask from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SecurityConfigurationTask> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SecurityConfigurationTask from the service
     *
     * @return the SecurityConfigurationTask from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityConfigurationTask get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SecurityConfigurationTask> callback) {
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
     * Patches this SecurityConfigurationTask with a source
     *
     * @param sourceSecurityConfigurationTask the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SecurityConfigurationTask sourceSecurityConfigurationTask, final ICallback<SecurityConfigurationTask> callback) {
        send(HttpMethod.PATCH, callback, sourceSecurityConfigurationTask);
    }

    /**
     * Patches this SecurityConfigurationTask with a source
     *
     * @param sourceSecurityConfigurationTask the source object with updates
     * @return the updated SecurityConfigurationTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityConfigurationTask patch(final SecurityConfigurationTask sourceSecurityConfigurationTask) throws ClientException {
        return send(HttpMethod.PATCH, sourceSecurityConfigurationTask);
    }

    /**
     * Creates a SecurityConfigurationTask with a new object
     *
     * @param newSecurityConfigurationTask the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SecurityConfigurationTask newSecurityConfigurationTask, final ICallback<SecurityConfigurationTask> callback) {
        send(HttpMethod.POST, callback, newSecurityConfigurationTask);
    }

    /**
     * Creates a SecurityConfigurationTask with a new object
     *
     * @param newSecurityConfigurationTask the new object to create
     * @return the created SecurityConfigurationTask
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityConfigurationTask post(final SecurityConfigurationTask newSecurityConfigurationTask) throws ClientException {
        return send(HttpMethod.POST, newSecurityConfigurationTask);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISecurityConfigurationTaskRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SecurityConfigurationTaskRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISecurityConfigurationTaskRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SecurityConfigurationTaskRequest)this;
     }

}


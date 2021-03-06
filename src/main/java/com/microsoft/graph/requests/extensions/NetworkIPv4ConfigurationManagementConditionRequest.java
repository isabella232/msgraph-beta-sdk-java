// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.NetworkIPv4ConfigurationManagementCondition;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Network IPv4Configuration Management Condition Request.
 */
public class NetworkIPv4ConfigurationManagementConditionRequest extends BaseRequest implements INetworkIPv4ConfigurationManagementConditionRequest {
	
    /**
     * The request for the NetworkIPv4ConfigurationManagementCondition
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public NetworkIPv4ConfigurationManagementConditionRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, NetworkIPv4ConfigurationManagementCondition.class);
    }

    /**
     * Gets the NetworkIPv4ConfigurationManagementCondition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super NetworkIPv4ConfigurationManagementCondition> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the NetworkIPv4ConfigurationManagementCondition from the service
     *
     * @return the NetworkIPv4ConfigurationManagementCondition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NetworkIPv4ConfigurationManagementCondition get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super NetworkIPv4ConfigurationManagementCondition> callback) {
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
     * Patches this NetworkIPv4ConfigurationManagementCondition with a source
     *
     * @param sourceNetworkIPv4ConfigurationManagementCondition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final NetworkIPv4ConfigurationManagementCondition sourceNetworkIPv4ConfigurationManagementCondition, final ICallback<? super NetworkIPv4ConfigurationManagementCondition> callback) {
        send(HttpMethod.PATCH, callback, sourceNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Patches this NetworkIPv4ConfigurationManagementCondition with a source
     *
     * @param sourceNetworkIPv4ConfigurationManagementCondition the source object with updates
     * @return the updated NetworkIPv4ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NetworkIPv4ConfigurationManagementCondition patch(final NetworkIPv4ConfigurationManagementCondition sourceNetworkIPv4ConfigurationManagementCondition) throws ClientException {
        return send(HttpMethod.PATCH, sourceNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Creates a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition, final ICallback<? super NetworkIPv4ConfigurationManagementCondition> callback) {
        send(HttpMethod.POST, callback, newNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Creates a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the new object to create
     * @return the created NetworkIPv4ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NetworkIPv4ConfigurationManagementCondition post(final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition) throws ClientException {
        return send(HttpMethod.POST, newNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Creates a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition, final ICallback<? super NetworkIPv4ConfigurationManagementCondition> callback) {
        send(HttpMethod.PUT, callback, newNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Creates a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the object to create/update
     * @return the created NetworkIPv4ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public NetworkIPv4ConfigurationManagementCondition put(final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition) throws ClientException {
        return send(HttpMethod.PUT, newNetworkIPv4ConfigurationManagementCondition);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public INetworkIPv4ConfigurationManagementConditionRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (NetworkIPv4ConfigurationManagementConditionRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public INetworkIPv4ConfigurationManagementConditionRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (NetworkIPv4ConfigurationManagementConditionRequest)this;
     }

}


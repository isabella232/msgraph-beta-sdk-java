// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.NetworkIPv4ConfigurationManagementCondition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Network IPv4Configuration Management Condition Request.
 */
public interface INetworkIPv4ConfigurationManagementConditionRequest extends IHttpRequest {

    /**
     * Gets the NetworkIPv4ConfigurationManagementCondition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super NetworkIPv4ConfigurationManagementCondition> callback);

    /**
     * Gets the NetworkIPv4ConfigurationManagementCondition from the service
     *
     * @return the NetworkIPv4ConfigurationManagementCondition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkIPv4ConfigurationManagementCondition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super NetworkIPv4ConfigurationManagementCondition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this NetworkIPv4ConfigurationManagementCondition with a source
     *
     * @param sourceNetworkIPv4ConfigurationManagementCondition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final NetworkIPv4ConfigurationManagementCondition sourceNetworkIPv4ConfigurationManagementCondition, final ICallback<? super NetworkIPv4ConfigurationManagementCondition> callback);

    /**
     * Patches this NetworkIPv4ConfigurationManagementCondition with a source
     *
     * @param sourceNetworkIPv4ConfigurationManagementCondition the source object with updates
     * @return the updated NetworkIPv4ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkIPv4ConfigurationManagementCondition patch(final NetworkIPv4ConfigurationManagementCondition sourceNetworkIPv4ConfigurationManagementCondition) throws ClientException;

    /**
     * Posts a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition, final ICallback<? super NetworkIPv4ConfigurationManagementCondition> callback);

    /**
     * Posts a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the new object to create
     * @return the created NetworkIPv4ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkIPv4ConfigurationManagementCondition post(final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition) throws ClientException;

    /**
     * Posts a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition, final ICallback<? super NetworkIPv4ConfigurationManagementCondition> callback);

    /**
     * Posts a NetworkIPv4ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv4ConfigurationManagementCondition the object to create/update
     * @return the created NetworkIPv4ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkIPv4ConfigurationManagementCondition put(final NetworkIPv4ConfigurationManagementCondition newNetworkIPv4ConfigurationManagementCondition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    INetworkIPv4ConfigurationManagementConditionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    INetworkIPv4ConfigurationManagementConditionRequest expand(final String value);

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.NetworkIPv6ConfigurationManagementCondition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Network IPv6Configuration Management Condition Request.
 */
public interface INetworkIPv6ConfigurationManagementConditionRequest extends IHttpRequest {

    /**
     * Gets the NetworkIPv6ConfigurationManagementCondition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super NetworkIPv6ConfigurationManagementCondition> callback);

    /**
     * Gets the NetworkIPv6ConfigurationManagementCondition from the service
     *
     * @return the NetworkIPv6ConfigurationManagementCondition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkIPv6ConfigurationManagementCondition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super NetworkIPv6ConfigurationManagementCondition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this NetworkIPv6ConfigurationManagementCondition with a source
     *
     * @param sourceNetworkIPv6ConfigurationManagementCondition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final NetworkIPv6ConfigurationManagementCondition sourceNetworkIPv6ConfigurationManagementCondition, final ICallback<? super NetworkIPv6ConfigurationManagementCondition> callback);

    /**
     * Patches this NetworkIPv6ConfigurationManagementCondition with a source
     *
     * @param sourceNetworkIPv6ConfigurationManagementCondition the source object with updates
     * @return the updated NetworkIPv6ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkIPv6ConfigurationManagementCondition patch(final NetworkIPv6ConfigurationManagementCondition sourceNetworkIPv6ConfigurationManagementCondition) throws ClientException;

    /**
     * Posts a NetworkIPv6ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv6ConfigurationManagementCondition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final NetworkIPv6ConfigurationManagementCondition newNetworkIPv6ConfigurationManagementCondition, final ICallback<? super NetworkIPv6ConfigurationManagementCondition> callback);

    /**
     * Posts a NetworkIPv6ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv6ConfigurationManagementCondition the new object to create
     * @return the created NetworkIPv6ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkIPv6ConfigurationManagementCondition post(final NetworkIPv6ConfigurationManagementCondition newNetworkIPv6ConfigurationManagementCondition) throws ClientException;

    /**
     * Posts a NetworkIPv6ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv6ConfigurationManagementCondition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final NetworkIPv6ConfigurationManagementCondition newNetworkIPv6ConfigurationManagementCondition, final ICallback<? super NetworkIPv6ConfigurationManagementCondition> callback);

    /**
     * Posts a NetworkIPv6ConfigurationManagementCondition with a new object
     *
     * @param newNetworkIPv6ConfigurationManagementCondition the object to create/update
     * @return the created NetworkIPv6ConfigurationManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkIPv6ConfigurationManagementCondition put(final NetworkIPv6ConfigurationManagementCondition newNetworkIPv6ConfigurationManagementCondition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    INetworkIPv6ConfigurationManagementConditionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    INetworkIPv6ConfigurationManagementConditionRequest expand(final String value);

}


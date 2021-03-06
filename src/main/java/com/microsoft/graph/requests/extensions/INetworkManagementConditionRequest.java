// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.NetworkManagementCondition;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Network Management Condition Request.
 */
public interface INetworkManagementConditionRequest extends IHttpRequest {

    /**
     * Gets the NetworkManagementCondition from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super NetworkManagementCondition> callback);

    /**
     * Gets the NetworkManagementCondition from the service
     *
     * @return the NetworkManagementCondition from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkManagementCondition get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super NetworkManagementCondition> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this NetworkManagementCondition with a source
     *
     * @param sourceNetworkManagementCondition the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final NetworkManagementCondition sourceNetworkManagementCondition, final ICallback<? super NetworkManagementCondition> callback);

    /**
     * Patches this NetworkManagementCondition with a source
     *
     * @param sourceNetworkManagementCondition the source object with updates
     * @return the updated NetworkManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkManagementCondition patch(final NetworkManagementCondition sourceNetworkManagementCondition) throws ClientException;

    /**
     * Posts a NetworkManagementCondition with a new object
     *
     * @param newNetworkManagementCondition the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final NetworkManagementCondition newNetworkManagementCondition, final ICallback<? super NetworkManagementCondition> callback);

    /**
     * Posts a NetworkManagementCondition with a new object
     *
     * @param newNetworkManagementCondition the new object to create
     * @return the created NetworkManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkManagementCondition post(final NetworkManagementCondition newNetworkManagementCondition) throws ClientException;

    /**
     * Posts a NetworkManagementCondition with a new object
     *
     * @param newNetworkManagementCondition the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final NetworkManagementCondition newNetworkManagementCondition, final ICallback<? super NetworkManagementCondition> callback);

    /**
     * Posts a NetworkManagementCondition with a new object
     *
     * @param newNetworkManagementCondition the object to create/update
     * @return the created NetworkManagementCondition
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    NetworkManagementCondition put(final NetworkManagementCondition newNetworkManagementCondition) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    INetworkManagementConditionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    INetworkManagementConditionRequest expand(final String value);

}


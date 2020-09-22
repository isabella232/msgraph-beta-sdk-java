// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MicrosoftTunnelServer;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Microsoft Tunnel Server Request.
 */
public interface IMicrosoftTunnelServerRequest extends IHttpRequest {

    /**
     * Gets the MicrosoftTunnelServer from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MicrosoftTunnelServer> callback);

    /**
     * Gets the MicrosoftTunnelServer from the service
     *
     * @return the MicrosoftTunnelServer from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MicrosoftTunnelServer get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MicrosoftTunnelServer> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MicrosoftTunnelServer with a source
     *
     * @param sourceMicrosoftTunnelServer the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MicrosoftTunnelServer sourceMicrosoftTunnelServer, final ICallback<MicrosoftTunnelServer> callback);

    /**
     * Patches this MicrosoftTunnelServer with a source
     *
     * @param sourceMicrosoftTunnelServer the source object with updates
     * @return the updated MicrosoftTunnelServer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MicrosoftTunnelServer patch(final MicrosoftTunnelServer sourceMicrosoftTunnelServer) throws ClientException;

    /**
     * Posts a MicrosoftTunnelServer with a new object
     *
     * @param newMicrosoftTunnelServer the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MicrosoftTunnelServer newMicrosoftTunnelServer, final ICallback<MicrosoftTunnelServer> callback);

    /**
     * Posts a MicrosoftTunnelServer with a new object
     *
     * @param newMicrosoftTunnelServer the new object to create
     * @return the created MicrosoftTunnelServer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MicrosoftTunnelServer post(final MicrosoftTunnelServer newMicrosoftTunnelServer) throws ClientException;

    /**
     * Posts a MicrosoftTunnelServer with a new object
     *
     * @param newMicrosoftTunnelServer the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final MicrosoftTunnelServer newMicrosoftTunnelServer, final ICallback<MicrosoftTunnelServer> callback);

    /**
     * Posts a MicrosoftTunnelServer with a new object
     *
     * @param newMicrosoftTunnelServer the object to create/update
     * @return the created MicrosoftTunnelServer
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MicrosoftTunnelServer put(final MicrosoftTunnelServer newMicrosoftTunnelServer) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMicrosoftTunnelServerRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMicrosoftTunnelServerRequest expand(final String value);

}

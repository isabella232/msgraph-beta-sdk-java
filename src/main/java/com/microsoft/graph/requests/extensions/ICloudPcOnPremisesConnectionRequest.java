// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.CloudPcOnPremisesConnection;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Cloud Pc On Premises Connection Request.
 */
public interface ICloudPcOnPremisesConnectionRequest extends IHttpRequest {

    /**
     * Gets the CloudPcOnPremisesConnection from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super CloudPcOnPremisesConnection> callback);

    /**
     * Gets the CloudPcOnPremisesConnection from the service
     *
     * @return the CloudPcOnPremisesConnection from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CloudPcOnPremisesConnection get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super CloudPcOnPremisesConnection> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this CloudPcOnPremisesConnection with a source
     *
     * @param sourceCloudPcOnPremisesConnection the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final CloudPcOnPremisesConnection sourceCloudPcOnPremisesConnection, final ICallback<? super CloudPcOnPremisesConnection> callback);

    /**
     * Patches this CloudPcOnPremisesConnection with a source
     *
     * @param sourceCloudPcOnPremisesConnection the source object with updates
     * @return the updated CloudPcOnPremisesConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CloudPcOnPremisesConnection patch(final CloudPcOnPremisesConnection sourceCloudPcOnPremisesConnection) throws ClientException;

    /**
     * Posts a CloudPcOnPremisesConnection with a new object
     *
     * @param newCloudPcOnPremisesConnection the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final CloudPcOnPremisesConnection newCloudPcOnPremisesConnection, final ICallback<? super CloudPcOnPremisesConnection> callback);

    /**
     * Posts a CloudPcOnPremisesConnection with a new object
     *
     * @param newCloudPcOnPremisesConnection the new object to create
     * @return the created CloudPcOnPremisesConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CloudPcOnPremisesConnection post(final CloudPcOnPremisesConnection newCloudPcOnPremisesConnection) throws ClientException;

    /**
     * Posts a CloudPcOnPremisesConnection with a new object
     *
     * @param newCloudPcOnPremisesConnection the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final CloudPcOnPremisesConnection newCloudPcOnPremisesConnection, final ICallback<? super CloudPcOnPremisesConnection> callback);

    /**
     * Posts a CloudPcOnPremisesConnection with a new object
     *
     * @param newCloudPcOnPremisesConnection the object to create/update
     * @return the created CloudPcOnPremisesConnection
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    CloudPcOnPremisesConnection put(final CloudPcOnPremisesConnection newCloudPcOnPremisesConnection) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ICloudPcOnPremisesConnectionRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ICloudPcOnPremisesConnectionRequest expand(final String value);

}


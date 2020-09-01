// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.AndroidForWorkAppConfigurationSchema;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Android For Work App Configuration Schema Request.
 */
public interface IAndroidForWorkAppConfigurationSchemaRequest extends IHttpRequest {

    /**
     * Gets the AndroidForWorkAppConfigurationSchema from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<AndroidForWorkAppConfigurationSchema> callback);

    /**
     * Gets the AndroidForWorkAppConfigurationSchema from the service
     *
     * @return the AndroidForWorkAppConfigurationSchema from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkAppConfigurationSchema get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<AndroidForWorkAppConfigurationSchema> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this AndroidForWorkAppConfigurationSchema with a source
     *
     * @param sourceAndroidForWorkAppConfigurationSchema the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final AndroidForWorkAppConfigurationSchema sourceAndroidForWorkAppConfigurationSchema, final ICallback<AndroidForWorkAppConfigurationSchema> callback);

    /**
     * Patches this AndroidForWorkAppConfigurationSchema with a source
     *
     * @param sourceAndroidForWorkAppConfigurationSchema the source object with updates
     * @return the updated AndroidForWorkAppConfigurationSchema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkAppConfigurationSchema patch(final AndroidForWorkAppConfigurationSchema sourceAndroidForWorkAppConfigurationSchema) throws ClientException;

    /**
     * Posts a AndroidForWorkAppConfigurationSchema with a new object
     *
     * @param newAndroidForWorkAppConfigurationSchema the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final AndroidForWorkAppConfigurationSchema newAndroidForWorkAppConfigurationSchema, final ICallback<AndroidForWorkAppConfigurationSchema> callback);

    /**
     * Posts a AndroidForWorkAppConfigurationSchema with a new object
     *
     * @param newAndroidForWorkAppConfigurationSchema the new object to create
     * @return the created AndroidForWorkAppConfigurationSchema
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    AndroidForWorkAppConfigurationSchema post(final AndroidForWorkAppConfigurationSchema newAndroidForWorkAppConfigurationSchema) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IAndroidForWorkAppConfigurationSchemaRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IAndroidForWorkAppConfigurationSchemaRequest expand(final String value);

}

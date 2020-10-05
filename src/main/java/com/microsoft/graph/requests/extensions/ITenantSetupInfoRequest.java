// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.TenantSetupInfo;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Tenant Setup Info Request.
 */
public interface ITenantSetupInfoRequest extends IHttpRequest {

    /**
     * Gets the TenantSetupInfo from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super TenantSetupInfo> callback);

    /**
     * Gets the TenantSetupInfo from the service
     *
     * @return the TenantSetupInfo from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TenantSetupInfo get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super TenantSetupInfo> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this TenantSetupInfo with a source
     *
     * @param sourceTenantSetupInfo the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final TenantSetupInfo sourceTenantSetupInfo, final ICallback<? super TenantSetupInfo> callback);

    /**
     * Patches this TenantSetupInfo with a source
     *
     * @param sourceTenantSetupInfo the source object with updates
     * @return the updated TenantSetupInfo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TenantSetupInfo patch(final TenantSetupInfo sourceTenantSetupInfo) throws ClientException;

    /**
     * Posts a TenantSetupInfo with a new object
     *
     * @param newTenantSetupInfo the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final TenantSetupInfo newTenantSetupInfo, final ICallback<? super TenantSetupInfo> callback);

    /**
     * Posts a TenantSetupInfo with a new object
     *
     * @param newTenantSetupInfo the new object to create
     * @return the created TenantSetupInfo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TenantSetupInfo post(final TenantSetupInfo newTenantSetupInfo) throws ClientException;

    /**
     * Posts a TenantSetupInfo with a new object
     *
     * @param newTenantSetupInfo the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final TenantSetupInfo newTenantSetupInfo, final ICallback<? super TenantSetupInfo> callback);

    /**
     * Posts a TenantSetupInfo with a new object
     *
     * @param newTenantSetupInfo the object to create/update
     * @return the created TenantSetupInfo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    TenantSetupInfo put(final TenantSetupInfo newTenantSetupInfo) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ITenantSetupInfoRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ITenantSetupInfoRequest expand(final String value);

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SharePointSiteUsagePages;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Share Point Site Usage Pages Request.
 */
public interface ISharePointSiteUsagePagesRequest extends IHttpRequest {

    /**
     * Gets the SharePointSiteUsagePages from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SharePointSiteUsagePages> callback);

    /**
     * Gets the SharePointSiteUsagePages from the service
     *
     * @return the SharePointSiteUsagePages from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsagePages get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SharePointSiteUsagePages> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SharePointSiteUsagePages with a source
     *
     * @param sourceSharePointSiteUsagePages the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SharePointSiteUsagePages sourceSharePointSiteUsagePages, final ICallback<? super SharePointSiteUsagePages> callback);

    /**
     * Patches this SharePointSiteUsagePages with a source
     *
     * @param sourceSharePointSiteUsagePages the source object with updates
     * @return the updated SharePointSiteUsagePages
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsagePages patch(final SharePointSiteUsagePages sourceSharePointSiteUsagePages) throws ClientException;

    /**
     * Posts a SharePointSiteUsagePages with a new object
     *
     * @param newSharePointSiteUsagePages the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SharePointSiteUsagePages newSharePointSiteUsagePages, final ICallback<? super SharePointSiteUsagePages> callback);

    /**
     * Posts a SharePointSiteUsagePages with a new object
     *
     * @param newSharePointSiteUsagePages the new object to create
     * @return the created SharePointSiteUsagePages
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsagePages post(final SharePointSiteUsagePages newSharePointSiteUsagePages) throws ClientException;

    /**
     * Posts a SharePointSiteUsagePages with a new object
     *
     * @param newSharePointSiteUsagePages the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SharePointSiteUsagePages newSharePointSiteUsagePages, final ICallback<? super SharePointSiteUsagePages> callback);

    /**
     * Posts a SharePointSiteUsagePages with a new object
     *
     * @param newSharePointSiteUsagePages the object to create/update
     * @return the created SharePointSiteUsagePages
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SharePointSiteUsagePages put(final SharePointSiteUsagePages newSharePointSiteUsagePages) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISharePointSiteUsagePagesRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISharePointSiteUsagePagesRequest expand(final String value);

}


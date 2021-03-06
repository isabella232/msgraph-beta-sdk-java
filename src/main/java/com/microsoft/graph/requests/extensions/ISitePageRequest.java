// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.SitePage;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Site Page Request.
 */
public interface ISitePageRequest extends IHttpRequest {

    /**
     * Gets the SitePage from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super SitePage> callback);

    /**
     * Gets the SitePage from the service
     *
     * @return the SitePage from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SitePage get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super SitePage> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this SitePage with a source
     *
     * @param sourceSitePage the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final SitePage sourceSitePage, final ICallback<? super SitePage> callback);

    /**
     * Patches this SitePage with a source
     *
     * @param sourceSitePage the source object with updates
     * @return the updated SitePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SitePage patch(final SitePage sourceSitePage) throws ClientException;

    /**
     * Posts a SitePage with a new object
     *
     * @param newSitePage the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final SitePage newSitePage, final ICallback<? super SitePage> callback);

    /**
     * Posts a SitePage with a new object
     *
     * @param newSitePage the new object to create
     * @return the created SitePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SitePage post(final SitePage newSitePage) throws ClientException;

    /**
     * Posts a SitePage with a new object
     *
     * @param newSitePage the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final SitePage newSitePage, final ICallback<? super SitePage> callback);

    /**
     * Posts a SitePage with a new object
     *
     * @param newSitePage the object to create/update
     * @return the created SitePage
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    SitePage put(final SitePage newSitePage) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    ISitePageRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    ISitePageRequest expand(final String value);

}


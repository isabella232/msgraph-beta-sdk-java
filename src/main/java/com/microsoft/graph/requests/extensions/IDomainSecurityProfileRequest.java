// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DomainSecurityProfile;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Domain Security Profile Request.
 */
public interface IDomainSecurityProfileRequest extends IHttpRequest {

    /**
     * Gets the DomainSecurityProfile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DomainSecurityProfile> callback);

    /**
     * Gets the DomainSecurityProfile from the service
     *
     * @return the DomainSecurityProfile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DomainSecurityProfile get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DomainSecurityProfile> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DomainSecurityProfile with a source
     *
     * @param sourceDomainSecurityProfile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DomainSecurityProfile sourceDomainSecurityProfile, final ICallback<? super DomainSecurityProfile> callback);

    /**
     * Patches this DomainSecurityProfile with a source
     *
     * @param sourceDomainSecurityProfile the source object with updates
     * @return the updated DomainSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DomainSecurityProfile patch(final DomainSecurityProfile sourceDomainSecurityProfile) throws ClientException;

    /**
     * Posts a DomainSecurityProfile with a new object
     *
     * @param newDomainSecurityProfile the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DomainSecurityProfile newDomainSecurityProfile, final ICallback<? super DomainSecurityProfile> callback);

    /**
     * Posts a DomainSecurityProfile with a new object
     *
     * @param newDomainSecurityProfile the new object to create
     * @return the created DomainSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DomainSecurityProfile post(final DomainSecurityProfile newDomainSecurityProfile) throws ClientException;

    /**
     * Posts a DomainSecurityProfile with a new object
     *
     * @param newDomainSecurityProfile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DomainSecurityProfile newDomainSecurityProfile, final ICallback<? super DomainSecurityProfile> callback);

    /**
     * Posts a DomainSecurityProfile with a new object
     *
     * @param newDomainSecurityProfile the object to create/update
     * @return the created DomainSecurityProfile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DomainSecurityProfile put(final DomainSecurityProfile newDomainSecurityProfile) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDomainSecurityProfileRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDomainSecurityProfileRequest expand(final String value);

}


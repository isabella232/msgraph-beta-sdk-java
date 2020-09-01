// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.ExternalGroupMember;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the External Group Member Request.
 */
public interface IExternalGroupMemberRequest extends IHttpRequest {

    /**
     * Gets the ExternalGroupMember from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<ExternalGroupMember> callback);

    /**
     * Gets the ExternalGroupMember from the service
     *
     * @return the ExternalGroupMember from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalGroupMember get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<ExternalGroupMember> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this ExternalGroupMember with a source
     *
     * @param sourceExternalGroupMember the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final ExternalGroupMember sourceExternalGroupMember, final ICallback<ExternalGroupMember> callback);

    /**
     * Patches this ExternalGroupMember with a source
     *
     * @param sourceExternalGroupMember the source object with updates
     * @return the updated ExternalGroupMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalGroupMember patch(final ExternalGroupMember sourceExternalGroupMember) throws ClientException;

    /**
     * Posts a ExternalGroupMember with a new object
     *
     * @param newExternalGroupMember the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final ExternalGroupMember newExternalGroupMember, final ICallback<ExternalGroupMember> callback);

    /**
     * Posts a ExternalGroupMember with a new object
     *
     * @param newExternalGroupMember the new object to create
     * @return the created ExternalGroupMember
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    ExternalGroupMember post(final ExternalGroupMember newExternalGroupMember) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IExternalGroupMemberRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IExternalGroupMemberRequest expand(final String value);

}

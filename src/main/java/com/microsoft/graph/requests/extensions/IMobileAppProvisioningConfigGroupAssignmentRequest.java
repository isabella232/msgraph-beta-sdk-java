// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.MobileAppProvisioningConfigGroupAssignment;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mobile App Provisioning Config Group Assignment Request.
 */
public interface IMobileAppProvisioningConfigGroupAssignmentRequest extends IHttpRequest {

    /**
     * Gets the MobileAppProvisioningConfigGroupAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<MobileAppProvisioningConfigGroupAssignment> callback);

    /**
     * Gets the MobileAppProvisioningConfigGroupAssignment from the service
     *
     * @return the MobileAppProvisioningConfigGroupAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppProvisioningConfigGroupAssignment get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<MobileAppProvisioningConfigGroupAssignment> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this MobileAppProvisioningConfigGroupAssignment with a source
     *
     * @param sourceMobileAppProvisioningConfigGroupAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final MobileAppProvisioningConfigGroupAssignment sourceMobileAppProvisioningConfigGroupAssignment, final ICallback<MobileAppProvisioningConfigGroupAssignment> callback);

    /**
     * Patches this MobileAppProvisioningConfigGroupAssignment with a source
     *
     * @param sourceMobileAppProvisioningConfigGroupAssignment the source object with updates
     * @return the updated MobileAppProvisioningConfigGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppProvisioningConfigGroupAssignment patch(final MobileAppProvisioningConfigGroupAssignment sourceMobileAppProvisioningConfigGroupAssignment) throws ClientException;

    /**
     * Posts a MobileAppProvisioningConfigGroupAssignment with a new object
     *
     * @param newMobileAppProvisioningConfigGroupAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final MobileAppProvisioningConfigGroupAssignment newMobileAppProvisioningConfigGroupAssignment, final ICallback<MobileAppProvisioningConfigGroupAssignment> callback);

    /**
     * Posts a MobileAppProvisioningConfigGroupAssignment with a new object
     *
     * @param newMobileAppProvisioningConfigGroupAssignment the new object to create
     * @return the created MobileAppProvisioningConfigGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    MobileAppProvisioningConfigGroupAssignment post(final MobileAppProvisioningConfigGroupAssignment newMobileAppProvisioningConfigGroupAssignment) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IMobileAppProvisioningConfigGroupAssignmentRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IMobileAppProvisioningConfigGroupAssignmentRequest expand(final String value);

}


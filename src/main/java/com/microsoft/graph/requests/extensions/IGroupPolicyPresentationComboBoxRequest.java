// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationComboBox;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Presentation Combo Box Request.
 */
public interface IGroupPolicyPresentationComboBoxRequest extends IHttpRequest {

    /**
     * Gets the GroupPolicyPresentationComboBox from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<GroupPolicyPresentationComboBox> callback);

    /**
     * Gets the GroupPolicyPresentationComboBox from the service
     *
     * @return the GroupPolicyPresentationComboBox from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationComboBox get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<GroupPolicyPresentationComboBox> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this GroupPolicyPresentationComboBox with a source
     *
     * @param sourceGroupPolicyPresentationComboBox the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final GroupPolicyPresentationComboBox sourceGroupPolicyPresentationComboBox, final ICallback<GroupPolicyPresentationComboBox> callback);

    /**
     * Patches this GroupPolicyPresentationComboBox with a source
     *
     * @param sourceGroupPolicyPresentationComboBox the source object with updates
     * @return the updated GroupPolicyPresentationComboBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationComboBox patch(final GroupPolicyPresentationComboBox sourceGroupPolicyPresentationComboBox) throws ClientException;

    /**
     * Posts a GroupPolicyPresentationComboBox with a new object
     *
     * @param newGroupPolicyPresentationComboBox the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final GroupPolicyPresentationComboBox newGroupPolicyPresentationComboBox, final ICallback<GroupPolicyPresentationComboBox> callback);

    /**
     * Posts a GroupPolicyPresentationComboBox with a new object
     *
     * @param newGroupPolicyPresentationComboBox the new object to create
     * @return the created GroupPolicyPresentationComboBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    GroupPolicyPresentationComboBox post(final GroupPolicyPresentationComboBox newGroupPolicyPresentationComboBox) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IGroupPolicyPresentationComboBoxRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IGroupPolicyPresentationComboBoxRequest expand(final String value);

}


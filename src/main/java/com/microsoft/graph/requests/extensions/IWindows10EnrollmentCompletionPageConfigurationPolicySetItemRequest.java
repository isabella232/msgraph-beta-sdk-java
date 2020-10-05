// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.Windows10EnrollmentCompletionPageConfigurationPolicySetItem;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows10Enrollment Completion Page Configuration Policy Set Item Request.
 */
public interface IWindows10EnrollmentCompletionPageConfigurationPolicySetItemRequest extends IHttpRequest {

    /**
     * Gets the Windows10EnrollmentCompletionPageConfigurationPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super Windows10EnrollmentCompletionPageConfigurationPolicySetItem> callback);

    /**
     * Gets the Windows10EnrollmentCompletionPageConfigurationPolicySetItem from the service
     *
     * @return the Windows10EnrollmentCompletionPageConfigurationPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EnrollmentCompletionPageConfigurationPolicySetItem get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super Windows10EnrollmentCompletionPageConfigurationPolicySetItem> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a source
     *
     * @param sourceWindows10EnrollmentCompletionPageConfigurationPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem sourceWindows10EnrollmentCompletionPageConfigurationPolicySetItem, final ICallback<? super Windows10EnrollmentCompletionPageConfigurationPolicySetItem> callback);

    /**
     * Patches this Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a source
     *
     * @param sourceWindows10EnrollmentCompletionPageConfigurationPolicySetItem the source object with updates
     * @return the updated Windows10EnrollmentCompletionPageConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EnrollmentCompletionPageConfigurationPolicySetItem patch(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem sourceWindows10EnrollmentCompletionPageConfigurationPolicySetItem) throws ClientException;

    /**
     * Posts a Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfigurationPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem newWindows10EnrollmentCompletionPageConfigurationPolicySetItem, final ICallback<? super Windows10EnrollmentCompletionPageConfigurationPolicySetItem> callback);

    /**
     * Posts a Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfigurationPolicySetItem the new object to create
     * @return the created Windows10EnrollmentCompletionPageConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EnrollmentCompletionPageConfigurationPolicySetItem post(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem newWindows10EnrollmentCompletionPageConfigurationPolicySetItem) throws ClientException;

    /**
     * Posts a Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfigurationPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem newWindows10EnrollmentCompletionPageConfigurationPolicySetItem, final ICallback<? super Windows10EnrollmentCompletionPageConfigurationPolicySetItem> callback);

    /**
     * Posts a Windows10EnrollmentCompletionPageConfigurationPolicySetItem with a new object
     *
     * @param newWindows10EnrollmentCompletionPageConfigurationPolicySetItem the object to create/update
     * @return the created Windows10EnrollmentCompletionPageConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    Windows10EnrollmentCompletionPageConfigurationPolicySetItem put(final Windows10EnrollmentCompletionPageConfigurationPolicySetItem newWindows10EnrollmentCompletionPageConfigurationPolicySetItem) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IWindows10EnrollmentCompletionPageConfigurationPolicySetItemRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IWindows10EnrollmentCompletionPageConfigurationPolicySetItemRequest expand(final String value);

}


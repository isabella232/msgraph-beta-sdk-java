// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.EducationSchool;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Education School Request.
 */
public interface IEducationSchoolRequest extends IHttpRequest {

    /**
     * Gets the EducationSchool from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super EducationSchool> callback);

    /**
     * Gets the EducationSchool from the service
     *
     * @return the EducationSchool from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSchool get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super EducationSchool> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this EducationSchool with a source
     *
     * @param sourceEducationSchool the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final EducationSchool sourceEducationSchool, final ICallback<? super EducationSchool> callback);

    /**
     * Patches this EducationSchool with a source
     *
     * @param sourceEducationSchool the source object with updates
     * @return the updated EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSchool patch(final EducationSchool sourceEducationSchool) throws ClientException;

    /**
     * Posts a EducationSchool with a new object
     *
     * @param newEducationSchool the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final EducationSchool newEducationSchool, final ICallback<? super EducationSchool> callback);

    /**
     * Posts a EducationSchool with a new object
     *
     * @param newEducationSchool the new object to create
     * @return the created EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSchool post(final EducationSchool newEducationSchool) throws ClientException;

    /**
     * Posts a EducationSchool with a new object
     *
     * @param newEducationSchool the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final EducationSchool newEducationSchool, final ICallback<? super EducationSchool> callback);

    /**
     * Posts a EducationSchool with a new object
     *
     * @param newEducationSchool the object to create/update
     * @return the created EducationSchool
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    EducationSchool put(final EducationSchool newEducationSchool) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IEducationSchoolRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IEducationSchoolRequest expand(final String value);

}


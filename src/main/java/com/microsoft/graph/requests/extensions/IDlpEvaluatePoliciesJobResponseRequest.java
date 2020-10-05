// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DlpEvaluatePoliciesJobResponse;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Dlp Evaluate Policies Job Response Request.
 */
public interface IDlpEvaluatePoliciesJobResponseRequest extends IHttpRequest {

    /**
     * Gets the DlpEvaluatePoliciesJobResponse from the service
     *
     * @param callback the callback to be called after success or failure
     */
    void get(final ICallback<? super DlpEvaluatePoliciesJobResponse> callback);

    /**
     * Gets the DlpEvaluatePoliciesJobResponse from the service
     *
     * @return the DlpEvaluatePoliciesJobResponse from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DlpEvaluatePoliciesJobResponse get() throws ClientException;

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    void delete(final ICallback<? super DlpEvaluatePoliciesJobResponse> callback);

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    void delete() throws ClientException;

    /**
     * Patches this DlpEvaluatePoliciesJobResponse with a source
     *
     * @param sourceDlpEvaluatePoliciesJobResponse the source object with updates
     * @param callback the callback to be called after success or failure
     */
    void patch(final DlpEvaluatePoliciesJobResponse sourceDlpEvaluatePoliciesJobResponse, final ICallback<? super DlpEvaluatePoliciesJobResponse> callback);

    /**
     * Patches this DlpEvaluatePoliciesJobResponse with a source
     *
     * @param sourceDlpEvaluatePoliciesJobResponse the source object with updates
     * @return the updated DlpEvaluatePoliciesJobResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DlpEvaluatePoliciesJobResponse patch(final DlpEvaluatePoliciesJobResponse sourceDlpEvaluatePoliciesJobResponse) throws ClientException;

    /**
     * Posts a DlpEvaluatePoliciesJobResponse with a new object
     *
     * @param newDlpEvaluatePoliciesJobResponse the new object to create
     * @param callback the callback to be called after success or failure
     */
    void post(final DlpEvaluatePoliciesJobResponse newDlpEvaluatePoliciesJobResponse, final ICallback<? super DlpEvaluatePoliciesJobResponse> callback);

    /**
     * Posts a DlpEvaluatePoliciesJobResponse with a new object
     *
     * @param newDlpEvaluatePoliciesJobResponse the new object to create
     * @return the created DlpEvaluatePoliciesJobResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DlpEvaluatePoliciesJobResponse post(final DlpEvaluatePoliciesJobResponse newDlpEvaluatePoliciesJobResponse) throws ClientException;

    /**
     * Posts a DlpEvaluatePoliciesJobResponse with a new object
     *
     * @param newDlpEvaluatePoliciesJobResponse the object to create/update
     * @param callback the callback to be called after success or failure
     */
    void put(final DlpEvaluatePoliciesJobResponse newDlpEvaluatePoliciesJobResponse, final ICallback<? super DlpEvaluatePoliciesJobResponse> callback);

    /**
     * Posts a DlpEvaluatePoliciesJobResponse with a new object
     *
     * @param newDlpEvaluatePoliciesJobResponse the object to create/update
     * @return the created DlpEvaluatePoliciesJobResponse
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    DlpEvaluatePoliciesJobResponse put(final DlpEvaluatePoliciesJobResponse newDlpEvaluatePoliciesJobResponse) throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDlpEvaluatePoliciesJobResponseRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDlpEvaluatePoliciesJobResponseRequest expand(final String value);

}


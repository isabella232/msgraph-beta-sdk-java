// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SecurityBaselineCategoryStateSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Security Baseline Category State Summary Request.
 */
public class SecurityBaselineCategoryStateSummaryRequest extends BaseRequest implements ISecurityBaselineCategoryStateSummaryRequest {
	
    /**
     * The request for the SecurityBaselineCategoryStateSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public SecurityBaselineCategoryStateSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, SecurityBaselineCategoryStateSummary.class);
    }

    /**
     * Gets the SecurityBaselineCategoryStateSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<SecurityBaselineCategoryStateSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the SecurityBaselineCategoryStateSummary from the service
     *
     * @return the SecurityBaselineCategoryStateSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineCategoryStateSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<SecurityBaselineCategoryStateSummary> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this SecurityBaselineCategoryStateSummary with a source
     *
     * @param sourceSecurityBaselineCategoryStateSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final SecurityBaselineCategoryStateSummary sourceSecurityBaselineCategoryStateSummary, final ICallback<SecurityBaselineCategoryStateSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceSecurityBaselineCategoryStateSummary);
    }

    /**
     * Patches this SecurityBaselineCategoryStateSummary with a source
     *
     * @param sourceSecurityBaselineCategoryStateSummary the source object with updates
     * @return the updated SecurityBaselineCategoryStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineCategoryStateSummary patch(final SecurityBaselineCategoryStateSummary sourceSecurityBaselineCategoryStateSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceSecurityBaselineCategoryStateSummary);
    }

    /**
     * Creates a SecurityBaselineCategoryStateSummary with a new object
     *
     * @param newSecurityBaselineCategoryStateSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final SecurityBaselineCategoryStateSummary newSecurityBaselineCategoryStateSummary, final ICallback<SecurityBaselineCategoryStateSummary> callback) {
        send(HttpMethod.POST, callback, newSecurityBaselineCategoryStateSummary);
    }

    /**
     * Creates a SecurityBaselineCategoryStateSummary with a new object
     *
     * @param newSecurityBaselineCategoryStateSummary the new object to create
     * @return the created SecurityBaselineCategoryStateSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public SecurityBaselineCategoryStateSummary post(final SecurityBaselineCategoryStateSummary newSecurityBaselineCategoryStateSummary) throws ClientException {
        return send(HttpMethod.POST, newSecurityBaselineCategoryStateSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ISecurityBaselineCategoryStateSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (SecurityBaselineCategoryStateSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ISecurityBaselineCategoryStateSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (SecurityBaselineCategoryStateSummaryRequest)this;
     }

}


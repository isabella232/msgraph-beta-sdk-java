// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppInstallSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Install Summary Request.
 */
public class MobileAppInstallSummaryRequest extends BaseRequest implements IMobileAppInstallSummaryRequest {
	
    /**
     * The request for the MobileAppInstallSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppInstallSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppInstallSummary.class);
    }

    /**
     * Gets the MobileAppInstallSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MobileAppInstallSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppInstallSummary from the service
     *
     * @return the MobileAppInstallSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppInstallSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MobileAppInstallSummary> callback) {
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
     * Patches this MobileAppInstallSummary with a source
     *
     * @param sourceMobileAppInstallSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MobileAppInstallSummary sourceMobileAppInstallSummary, final ICallback<MobileAppInstallSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppInstallSummary);
    }

    /**
     * Patches this MobileAppInstallSummary with a source
     *
     * @param sourceMobileAppInstallSummary the source object with updates
     * @return the updated MobileAppInstallSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppInstallSummary patch(final MobileAppInstallSummary sourceMobileAppInstallSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppInstallSummary);
    }

    /**
     * Creates a MobileAppInstallSummary with a new object
     *
     * @param newMobileAppInstallSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MobileAppInstallSummary newMobileAppInstallSummary, final ICallback<MobileAppInstallSummary> callback) {
        send(HttpMethod.POST, callback, newMobileAppInstallSummary);
    }

    /**
     * Creates a MobileAppInstallSummary with a new object
     *
     * @param newMobileAppInstallSummary the new object to create
     * @return the created MobileAppInstallSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppInstallSummary post(final MobileAppInstallSummary newMobileAppInstallSummary) throws ClientException {
        return send(HttpMethod.POST, newMobileAppInstallSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMobileAppInstallSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MobileAppInstallSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMobileAppInstallSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MobileAppInstallSummaryRequest)this;
     }

}


// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.FocusActivityStatistics;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Focus Activity Statistics Request.
 */
public class FocusActivityStatisticsRequest extends BaseRequest implements IFocusActivityStatisticsRequest {
	
    /**
     * The request for the FocusActivityStatistics
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public FocusActivityStatisticsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, FocusActivityStatistics.class);
    }

    /**
     * Gets the FocusActivityStatistics from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<FocusActivityStatistics> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the FocusActivityStatistics from the service
     *
     * @return the FocusActivityStatistics from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FocusActivityStatistics get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<FocusActivityStatistics> callback) {
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
     * Patches this FocusActivityStatistics with a source
     *
     * @param sourceFocusActivityStatistics the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final FocusActivityStatistics sourceFocusActivityStatistics, final ICallback<FocusActivityStatistics> callback) {
        send(HttpMethod.PATCH, callback, sourceFocusActivityStatistics);
    }

    /**
     * Patches this FocusActivityStatistics with a source
     *
     * @param sourceFocusActivityStatistics the source object with updates
     * @return the updated FocusActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FocusActivityStatistics patch(final FocusActivityStatistics sourceFocusActivityStatistics) throws ClientException {
        return send(HttpMethod.PATCH, sourceFocusActivityStatistics);
    }

    /**
     * Creates a FocusActivityStatistics with a new object
     *
     * @param newFocusActivityStatistics the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final FocusActivityStatistics newFocusActivityStatistics, final ICallback<FocusActivityStatistics> callback) {
        send(HttpMethod.POST, callback, newFocusActivityStatistics);
    }

    /**
     * Creates a FocusActivityStatistics with a new object
     *
     * @param newFocusActivityStatistics the new object to create
     * @return the created FocusActivityStatistics
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public FocusActivityStatistics post(final FocusActivityStatistics newFocusActivityStatistics) throws ClientException {
        return send(HttpMethod.POST, newFocusActivityStatistics);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IFocusActivityStatisticsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (FocusActivityStatisticsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IFocusActivityStatisticsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (FocusActivityStatisticsRequest)this;
     }

}


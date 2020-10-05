// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.OfficeGraphInsights;
import com.microsoft.graph.requests.extensions.ISharedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISharedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SharedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrendingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITrendingRequestBuilder;
import com.microsoft.graph.requests.extensions.TrendingCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TrendingRequestBuilder;
import com.microsoft.graph.requests.extensions.IUsedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IUsedInsightRequestBuilder;
import com.microsoft.graph.requests.extensions.UsedInsightCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.UsedInsightRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Office Graph Insights Request.
 */
public class OfficeGraphInsightsRequest extends BaseRequest implements IOfficeGraphInsightsRequest {
	
    /**
     * The request for the OfficeGraphInsights
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public OfficeGraphInsightsRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends OfficeGraphInsights> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the OfficeGraphInsights
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public OfficeGraphInsightsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, OfficeGraphInsights.class);
    }

    /**
     * Gets the OfficeGraphInsights from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super OfficeGraphInsights> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the OfficeGraphInsights from the service
     *
     * @return the OfficeGraphInsights from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OfficeGraphInsights get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super OfficeGraphInsights> callback) {
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
     * Patches this OfficeGraphInsights with a source
     *
     * @param sourceOfficeGraphInsights the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final OfficeGraphInsights sourceOfficeGraphInsights, final ICallback<? super OfficeGraphInsights> callback) {
        send(HttpMethod.PATCH, callback, sourceOfficeGraphInsights);
    }

    /**
     * Patches this OfficeGraphInsights with a source
     *
     * @param sourceOfficeGraphInsights the source object with updates
     * @return the updated OfficeGraphInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OfficeGraphInsights patch(final OfficeGraphInsights sourceOfficeGraphInsights) throws ClientException {
        return send(HttpMethod.PATCH, sourceOfficeGraphInsights);
    }

    /**
     * Creates a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final OfficeGraphInsights newOfficeGraphInsights, final ICallback<? super OfficeGraphInsights> callback) {
        send(HttpMethod.POST, callback, newOfficeGraphInsights);
    }

    /**
     * Creates a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the new object to create
     * @return the created OfficeGraphInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OfficeGraphInsights post(final OfficeGraphInsights newOfficeGraphInsights) throws ClientException {
        return send(HttpMethod.POST, newOfficeGraphInsights);
    }

    /**
     * Creates a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final OfficeGraphInsights newOfficeGraphInsights, final ICallback<? super OfficeGraphInsights> callback) {
        send(HttpMethod.PUT, callback, newOfficeGraphInsights);
    }

    /**
     * Creates a OfficeGraphInsights with a new object
     *
     * @param newOfficeGraphInsights the object to create/update
     * @return the created OfficeGraphInsights
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public OfficeGraphInsights put(final OfficeGraphInsights newOfficeGraphInsights) throws ClientException {
        return send(HttpMethod.PUT, newOfficeGraphInsights);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IOfficeGraphInsightsRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (OfficeGraphInsightsRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IOfficeGraphInsightsRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (OfficeGraphInsightsRequest)this;
     }

}


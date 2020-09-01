// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceComplianceScriptRunSummary;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Script Run Summary Request.
 */
public class DeviceComplianceScriptRunSummaryRequest extends BaseRequest implements IDeviceComplianceScriptRunSummaryRequest {
	
    /**
     * The request for the DeviceComplianceScriptRunSummary
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceComplianceScriptRunSummaryRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceComplianceScriptRunSummary.class);
    }

    /**
     * Gets the DeviceComplianceScriptRunSummary from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceComplianceScriptRunSummary> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceComplianceScriptRunSummary from the service
     *
     * @return the DeviceComplianceScriptRunSummary from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceScriptRunSummary get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceComplianceScriptRunSummary> callback) {
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
     * Patches this DeviceComplianceScriptRunSummary with a source
     *
     * @param sourceDeviceComplianceScriptRunSummary the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceComplianceScriptRunSummary sourceDeviceComplianceScriptRunSummary, final ICallback<DeviceComplianceScriptRunSummary> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceComplianceScriptRunSummary);
    }

    /**
     * Patches this DeviceComplianceScriptRunSummary with a source
     *
     * @param sourceDeviceComplianceScriptRunSummary the source object with updates
     * @return the updated DeviceComplianceScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceScriptRunSummary patch(final DeviceComplianceScriptRunSummary sourceDeviceComplianceScriptRunSummary) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceComplianceScriptRunSummary);
    }

    /**
     * Creates a DeviceComplianceScriptRunSummary with a new object
     *
     * @param newDeviceComplianceScriptRunSummary the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceComplianceScriptRunSummary newDeviceComplianceScriptRunSummary, final ICallback<DeviceComplianceScriptRunSummary> callback) {
        send(HttpMethod.POST, callback, newDeviceComplianceScriptRunSummary);
    }

    /**
     * Creates a DeviceComplianceScriptRunSummary with a new object
     *
     * @param newDeviceComplianceScriptRunSummary the new object to create
     * @return the created DeviceComplianceScriptRunSummary
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceComplianceScriptRunSummary post(final DeviceComplianceScriptRunSummary newDeviceComplianceScriptRunSummary) throws ClientException {
        return send(HttpMethod.POST, newDeviceComplianceScriptRunSummary);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceComplianceScriptRunSummaryRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceComplianceScriptRunSummaryRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceComplianceScriptRunSummaryRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceComplianceScriptRunSummaryRequest)this;
     }

}

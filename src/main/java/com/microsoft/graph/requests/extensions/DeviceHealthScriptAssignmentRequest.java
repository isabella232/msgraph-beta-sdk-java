// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceHealthScriptAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Health Script Assignment Request.
 */
public class DeviceHealthScriptAssignmentRequest extends BaseRequest implements IDeviceHealthScriptAssignmentRequest {
	
    /**
     * The request for the DeviceHealthScriptAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceHealthScriptAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceHealthScriptAssignment.class);
    }

    /**
     * Gets the DeviceHealthScriptAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DeviceHealthScriptAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceHealthScriptAssignment from the service
     *
     * @return the DeviceHealthScriptAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceHealthScriptAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DeviceHealthScriptAssignment> callback) {
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
     * Patches this DeviceHealthScriptAssignment with a source
     *
     * @param sourceDeviceHealthScriptAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceHealthScriptAssignment sourceDeviceHealthScriptAssignment, final ICallback<DeviceHealthScriptAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceHealthScriptAssignment);
    }

    /**
     * Patches this DeviceHealthScriptAssignment with a source
     *
     * @param sourceDeviceHealthScriptAssignment the source object with updates
     * @return the updated DeviceHealthScriptAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceHealthScriptAssignment patch(final DeviceHealthScriptAssignment sourceDeviceHealthScriptAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceHealthScriptAssignment);
    }

    /**
     * Creates a DeviceHealthScriptAssignment with a new object
     *
     * @param newDeviceHealthScriptAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceHealthScriptAssignment newDeviceHealthScriptAssignment, final ICallback<DeviceHealthScriptAssignment> callback) {
        send(HttpMethod.POST, callback, newDeviceHealthScriptAssignment);
    }

    /**
     * Creates a DeviceHealthScriptAssignment with a new object
     *
     * @param newDeviceHealthScriptAssignment the new object to create
     * @return the created DeviceHealthScriptAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceHealthScriptAssignment post(final DeviceHealthScriptAssignment newDeviceHealthScriptAssignment) throws ClientException {
        return send(HttpMethod.POST, newDeviceHealthScriptAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceHealthScriptAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceHealthScriptAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceHealthScriptAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceHealthScriptAssignmentRequest)this;
     }

}


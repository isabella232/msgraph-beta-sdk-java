// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyPolicySetItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Policy Set Item Request.
 */
public class DeviceCompliancePolicyPolicySetItemRequest extends BaseRequest implements IDeviceCompliancePolicyPolicySetItemRequest {
	
    /**
     * The request for the DeviceCompliancePolicyPolicySetItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyPolicySetItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicyPolicySetItem.class);
    }

    /**
     * Gets the DeviceCompliancePolicyPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceCompliancePolicyPolicySetItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicyPolicySetItem from the service
     *
     * @return the DeviceCompliancePolicyPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyPolicySetItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceCompliancePolicyPolicySetItem> callback) {
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
     * Patches this DeviceCompliancePolicyPolicySetItem with a source
     *
     * @param sourceDeviceCompliancePolicyPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCompliancePolicyPolicySetItem sourceDeviceCompliancePolicyPolicySetItem, final ICallback<? super DeviceCompliancePolicyPolicySetItem> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicyPolicySetItem);
    }

    /**
     * Patches this DeviceCompliancePolicyPolicySetItem with a source
     *
     * @param sourceDeviceCompliancePolicyPolicySetItem the source object with updates
     * @return the updated DeviceCompliancePolicyPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyPolicySetItem patch(final DeviceCompliancePolicyPolicySetItem sourceDeviceCompliancePolicyPolicySetItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicyPolicySetItem);
    }

    /**
     * Creates a DeviceCompliancePolicyPolicySetItem with a new object
     *
     * @param newDeviceCompliancePolicyPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCompliancePolicyPolicySetItem newDeviceCompliancePolicyPolicySetItem, final ICallback<? super DeviceCompliancePolicyPolicySetItem> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicyPolicySetItem);
    }

    /**
     * Creates a DeviceCompliancePolicyPolicySetItem with a new object
     *
     * @param newDeviceCompliancePolicyPolicySetItem the new object to create
     * @return the created DeviceCompliancePolicyPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyPolicySetItem post(final DeviceCompliancePolicyPolicySetItem newDeviceCompliancePolicyPolicySetItem) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicyPolicySetItem);
    }

    /**
     * Creates a DeviceCompliancePolicyPolicySetItem with a new object
     *
     * @param newDeviceCompliancePolicyPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceCompliancePolicyPolicySetItem newDeviceCompliancePolicyPolicySetItem, final ICallback<? super DeviceCompliancePolicyPolicySetItem> callback) {
        send(HttpMethod.PUT, callback, newDeviceCompliancePolicyPolicySetItem);
    }

    /**
     * Creates a DeviceCompliancePolicyPolicySetItem with a new object
     *
     * @param newDeviceCompliancePolicyPolicySetItem the object to create/update
     * @return the created DeviceCompliancePolicyPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicyPolicySetItem put(final DeviceCompliancePolicyPolicySetItem newDeviceCompliancePolicyPolicySetItem) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCompliancePolicyPolicySetItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyPolicySetItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceCompliancePolicyPolicySetItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyPolicySetItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceCompliancePolicyPolicySetItemRequest)this;
     }

}


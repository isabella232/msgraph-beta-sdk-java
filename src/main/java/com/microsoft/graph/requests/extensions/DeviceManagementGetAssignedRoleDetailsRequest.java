// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceAndAppManagementAssignedRoleDetails;
import com.microsoft.graph.requests.extensions.IDeviceManagementGetAssignedRoleDetailsRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementGetAssignedRoleDetailsRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Get Assigned Role Details Request.
 */
public class DeviceManagementGetAssignedRoleDetailsRequest extends BaseRequest implements IDeviceManagementGetAssignedRoleDetailsRequest {

    /**
     * The request for this DeviceManagementGetAssignedRoleDetails
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementGetAssignedRoleDetailsRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceAndAppManagementAssignedRoleDetails.class);
    }

    /**
     * Gets the DeviceAndAppManagementAssignedRoleDetails
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceAndAppManagementAssignedRoleDetails> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceAndAppManagementAssignedRoleDetails
     *
     * @return the DeviceAndAppManagementAssignedRoleDetails
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public DeviceAndAppManagementAssignedRoleDetails get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceManagementGetAssignedRoleDetailsRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (DeviceManagementGetAssignedRoleDetailsRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceManagementGetAssignedRoleDetailsRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceManagementGetAssignedRoleDetailsRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IDeviceManagementGetAssignedRoleDetailsRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (DeviceManagementGetAssignedRoleDetailsRequest)this;
    }

    /**
     * Sets the order by clause for the request
     *
     * @param value the order by clause
     * @return the updated request
     */
    public IDeviceManagementGetAssignedRoleDetailsRequest orderBy(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$orderby", value));
        return (DeviceManagementGetAssignedRoleDetailsRequest)this;
    }

}

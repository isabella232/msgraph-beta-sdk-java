// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import com.microsoft.graph.requests.extensions.IDeviceManagementTemplateCreateInstanceRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.http.BaseCollectionRequest;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.http.BaseCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Template Create Instance Request.
 */
public interface IDeviceManagementTemplateCreateInstanceRequest {

    void post(final ICallback<DeviceManagementIntent> callback);

    DeviceManagementIntent post() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceManagementTemplateCreateInstanceRequest select(final String value) ;

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceManagementTemplateCreateInstanceRequest top(final int value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceManagementTemplateCreateInstanceRequest expand(final String value);

}

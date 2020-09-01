// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.ComanagementEligibleDevice;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Comanagement Eligible Device Collection Request.
 */
public interface IComanagementEligibleDeviceCollectionRequest {

    void get(final ICallback<IComanagementEligibleDeviceCollectionPage> callback);

    IComanagementEligibleDeviceCollectionPage get() throws ClientException;

    void post(final ComanagementEligibleDevice newComanagementEligibleDevice, final ICallback<ComanagementEligibleDevice> callback);

    ComanagementEligibleDevice post(final ComanagementEligibleDevice newComanagementEligibleDevice) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IComanagementEligibleDeviceCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IComanagementEligibleDeviceCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IComanagementEligibleDeviceCollectionRequest top(final int value);

}
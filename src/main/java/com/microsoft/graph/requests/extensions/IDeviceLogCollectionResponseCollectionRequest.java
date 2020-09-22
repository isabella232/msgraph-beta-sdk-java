// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagedDevice;
import com.microsoft.graph.models.extensions.DeviceLogCollectionResponse;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Log Collection Response Collection Request.
 */
public interface IDeviceLogCollectionResponseCollectionRequest extends IHttpRequest {

    void get(final ICallback<IDeviceLogCollectionResponseCollectionPage> callback);

    IDeviceLogCollectionResponseCollectionPage get() throws ClientException;

    void post(final DeviceLogCollectionResponse newDeviceLogCollectionResponse, final ICallback<DeviceLogCollectionResponse> callback);

    DeviceLogCollectionResponse post(final DeviceLogCollectionResponse newDeviceLogCollectionResponse) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDeviceLogCollectionResponseCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IDeviceLogCollectionResponseCollectionRequest filter(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDeviceLogCollectionResponseCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IDeviceLogCollectionResponseCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IDeviceLogCollectionResponseCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IDeviceLogCollectionResponseCollectionRequest skipToken(String skipToken);
}

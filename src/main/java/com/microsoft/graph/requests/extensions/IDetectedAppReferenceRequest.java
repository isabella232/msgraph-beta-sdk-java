// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.requests.extensions.IManagedDeviceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DetectedApp;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Detected App Reference Request.
 */
public interface IDetectedAppReferenceRequest extends IHttpRequest {

    void delete(final ICallback<? super DetectedApp> callback);

    DetectedApp delete() throws ClientException;

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IDetectedAppReferenceRequest select(final String value);

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IDetectedAppReferenceRequest expand(final String value);

    /**
     * Puts the DetectedApp
     *
     * @param srcDetectedApp the DetectedApp to PUT
     * @param callback the callback to be called after success or failure
     */
    void put(DetectedApp srcDetectedApp, final ICallback<? super DetectedApp> callback);

    /**
     * Puts the DetectedApp
     *
     * @param srcDetectedApp the DetectedApp to PUT
     * @return the DetectedApp
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    DetectedApp put(DetectedApp srcDetectedApp) throws ClientException;
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceLogCollectionResponseCreateDownloadUrlRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Log Collection Response Create Download Url Request Builder.
 */
public interface IDeviceLogCollectionResponseCreateDownloadUrlRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceLogCollectionResponseCreateDownloadUrlRequest
     *
     * @return the IDeviceLogCollectionResponseCreateDownloadUrlRequest instance
     */
    IDeviceLogCollectionResponseCreateDownloadUrlRequest buildRequest();

    /**
     * Creates the IDeviceLogCollectionResponseCreateDownloadUrlRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceLogCollectionResponseCreateDownloadUrlRequest instance
     */
    IDeviceLogCollectionResponseCreateDownloadUrlRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.ManagedAllDeviceCertificateState;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagedAllDeviceCertificateStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAllDeviceCertificateStateCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Managed All Device Certificate State Collection Request Builder.
 */
public interface IManagedAllDeviceCertificateStateCollectionRequestBuilder extends IRequestBuilder {

    IManagedAllDeviceCertificateStateCollectionRequest buildRequest();

    IManagedAllDeviceCertificateStateCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IManagedAllDeviceCertificateStateRequestBuilder byId(final String id);

}

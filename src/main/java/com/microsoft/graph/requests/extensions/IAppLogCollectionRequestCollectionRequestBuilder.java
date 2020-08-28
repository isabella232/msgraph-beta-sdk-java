// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppTroubleshootingEvent;
import com.microsoft.graph.models.extensions.AppLogCollectionRequest;
import com.microsoft.graph.models.extensions.AppLogCollectionDownloadDetails;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IAppLogCollectionRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IAppLogCollectionRequestCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the App Log Collection Request Collection Request Builder.
 */
public interface IAppLogCollectionRequestCollectionRequestBuilder extends IRequestBuilder {

    IAppLogCollectionRequestCollectionRequest buildRequest();

    IAppLogCollectionRequestCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IAppLogCollectionRequestRequestBuilder byId(final String id);

}

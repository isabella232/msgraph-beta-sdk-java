// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SalesOrder;
import com.microsoft.graph.models.extensions.SalesOrderLine;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISalesOrderLineRequestBuilder;
import com.microsoft.graph.requests.extensions.ISalesOrderLineCollectionRequest;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sales Order Line Collection Request Builder.
 */
public interface ISalesOrderLineCollectionRequestBuilder extends IRequestBuilder {

    ISalesOrderLineCollectionRequest buildRequest();

    ISalesOrderLineCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    ISalesOrderLineRequestBuilder byId(final String id);

}

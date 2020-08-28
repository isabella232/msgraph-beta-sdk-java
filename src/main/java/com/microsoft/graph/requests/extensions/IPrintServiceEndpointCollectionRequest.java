// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintService;
import com.microsoft.graph.models.extensions.PrintServiceEndpoint;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Print Service Endpoint Collection Request.
 */
public interface IPrintServiceEndpointCollectionRequest {

    void get(final ICallback<IPrintServiceEndpointCollectionPage> callback);

    IPrintServiceEndpointCollectionPage get() throws ClientException;

    void post(final PrintServiceEndpoint newPrintServiceEndpoint, final ICallback<PrintServiceEndpoint> callback);

    PrintServiceEndpoint post(final PrintServiceEndpoint newPrintServiceEndpoint) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IPrintServiceEndpointCollectionRequest expand(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IPrintServiceEndpointCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IPrintServiceEndpointCollectionRequest top(final int value);

}

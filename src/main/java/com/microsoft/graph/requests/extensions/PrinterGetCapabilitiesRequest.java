// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.PrinterCapabilities;
import com.microsoft.graph.requests.extensions.IPrinterGetCapabilitiesRequest;
import com.microsoft.graph.requests.extensions.PrinterGetCapabilitiesRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Printer Get Capabilities Request.
 */
public class PrinterGetCapabilitiesRequest extends BaseRequest implements IPrinterGetCapabilitiesRequest {

    /**
     * The request for this PrinterGetCapabilities
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrinterGetCapabilitiesRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrinterCapabilities.class);
    }

    /**
     * Gets the PrinterCapabilities
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PrinterCapabilities> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrinterCapabilities
     *
     * @return the PrinterCapabilities
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    public PrinterCapabilities get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IPrinterGetCapabilitiesRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (PrinterGetCapabilitiesRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IPrinterGetCapabilitiesRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (PrinterGetCapabilitiesRequest)this;
    }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IPrinterGetCapabilitiesRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (PrinterGetCapabilitiesRequest)this;
    }

}

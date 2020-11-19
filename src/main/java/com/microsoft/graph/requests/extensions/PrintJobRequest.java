// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintJob;
import com.microsoft.graph.models.extensions.PrintJobStatus;
import com.microsoft.graph.models.extensions.PrintJobConfiguration;
import com.microsoft.graph.requests.extensions.IPrintDocumentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintDocumentRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintDocumentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintDocumentRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPrintTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.PrintTaskRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Job Request.
 */
public class PrintJobRequest extends BaseRequest implements IPrintJobRequest {
	
    /**
     * The request for the PrintJob
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintJobRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintJob.class);
    }

    /**
     * Gets the PrintJob from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super PrintJob> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrintJob from the service
     *
     * @return the PrintJob from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintJob get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super PrintJob> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this PrintJob with a source
     *
     * @param sourcePrintJob the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrintJob sourcePrintJob, final ICallback<? super PrintJob> callback) {
        send(HttpMethod.PATCH, callback, sourcePrintJob);
    }

    /**
     * Patches this PrintJob with a source
     *
     * @param sourcePrintJob the source object with updates
     * @return the updated PrintJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintJob patch(final PrintJob sourcePrintJob) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrintJob);
    }

    /**
     * Creates a PrintJob with a new object
     *
     * @param newPrintJob the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrintJob newPrintJob, final ICallback<? super PrintJob> callback) {
        send(HttpMethod.POST, callback, newPrintJob);
    }

    /**
     * Creates a PrintJob with a new object
     *
     * @param newPrintJob the new object to create
     * @return the created PrintJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintJob post(final PrintJob newPrintJob) throws ClientException {
        return send(HttpMethod.POST, newPrintJob);
    }

    /**
     * Creates a PrintJob with a new object
     *
     * @param newPrintJob the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrintJob newPrintJob, final ICallback<? super PrintJob> callback) {
        send(HttpMethod.PUT, callback, newPrintJob);
    }

    /**
     * Creates a PrintJob with a new object
     *
     * @param newPrintJob the object to create/update
     * @return the created PrintJob
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintJob put(final PrintJob newPrintJob) throws ClientException {
        return send(HttpMethod.PUT, newPrintJob);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrintJobRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrintJobRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrintJobRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrintJobRequest)this;
     }

}


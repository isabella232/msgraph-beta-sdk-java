// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.PrintUsageSummaryByUser;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Print Usage Summary By User Request.
 */
public class PrintUsageSummaryByUserRequest extends BaseRequest implements IPrintUsageSummaryByUserRequest {
	
    /**
     * The request for the PrintUsageSummaryByUser
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public PrintUsageSummaryByUserRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, PrintUsageSummaryByUser.class);
    }

    /**
     * Gets the PrintUsageSummaryByUser from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<PrintUsageSummaryByUser> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the PrintUsageSummaryByUser from the service
     *
     * @return the PrintUsageSummaryByUser from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintUsageSummaryByUser get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<PrintUsageSummaryByUser> callback) {
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
     * Patches this PrintUsageSummaryByUser with a source
     *
     * @param sourcePrintUsageSummaryByUser the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final PrintUsageSummaryByUser sourcePrintUsageSummaryByUser, final ICallback<PrintUsageSummaryByUser> callback) {
        send(HttpMethod.PATCH, callback, sourcePrintUsageSummaryByUser);
    }

    /**
     * Patches this PrintUsageSummaryByUser with a source
     *
     * @param sourcePrintUsageSummaryByUser the source object with updates
     * @return the updated PrintUsageSummaryByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintUsageSummaryByUser patch(final PrintUsageSummaryByUser sourcePrintUsageSummaryByUser) throws ClientException {
        return send(HttpMethod.PATCH, sourcePrintUsageSummaryByUser);
    }

    /**
     * Creates a PrintUsageSummaryByUser with a new object
     *
     * @param newPrintUsageSummaryByUser the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final PrintUsageSummaryByUser newPrintUsageSummaryByUser, final ICallback<PrintUsageSummaryByUser> callback) {
        send(HttpMethod.POST, callback, newPrintUsageSummaryByUser);
    }

    /**
     * Creates a PrintUsageSummaryByUser with a new object
     *
     * @param newPrintUsageSummaryByUser the new object to create
     * @return the created PrintUsageSummaryByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintUsageSummaryByUser post(final PrintUsageSummaryByUser newPrintUsageSummaryByUser) throws ClientException {
        return send(HttpMethod.POST, newPrintUsageSummaryByUser);
    }

    /**
     * Creates a PrintUsageSummaryByUser with a new object
     *
     * @param newPrintUsageSummaryByUser the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final PrintUsageSummaryByUser newPrintUsageSummaryByUser, final ICallback<PrintUsageSummaryByUser> callback) {
        send(HttpMethod.PUT, callback, newPrintUsageSummaryByUser);
    }

    /**
     * Creates a PrintUsageSummaryByUser with a new object
     *
     * @param newPrintUsageSummaryByUser the object to create/update
     * @return the created PrintUsageSummaryByUser
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public PrintUsageSummaryByUser put(final PrintUsageSummaryByUser newPrintUsageSummaryByUser) throws ClientException {
        return send(HttpMethod.PUT, newPrintUsageSummaryByUser);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IPrintUsageSummaryByUserRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (PrintUsageSummaryByUserRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IPrintUsageSummaryByUserRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (PrintUsageSummaryByUserRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IPrintUsageSummaryByUserRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (PrintUsageSummaryByUserRequest)this;
     }

}


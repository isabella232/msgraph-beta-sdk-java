// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Currency;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Currency Request.
 */
public class CurrencyRequest extends BaseRequest implements ICurrencyRequest {
	
    /**
     * The request for the Currency
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public CurrencyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, Currency.class);
    }

    /**
     * Gets the Currency from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<Currency> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the Currency from the service
     *
     * @return the Currency from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Currency get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<Currency> callback) {
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
     * Patches this Currency with a source
     *
     * @param sourceCurrency the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final Currency sourceCurrency, final ICallback<Currency> callback) {
        send(HttpMethod.PATCH, callback, sourceCurrency);
    }

    /**
     * Patches this Currency with a source
     *
     * @param sourceCurrency the source object with updates
     * @return the updated Currency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Currency patch(final Currency sourceCurrency) throws ClientException {
        return send(HttpMethod.PATCH, sourceCurrency);
    }

    /**
     * Creates a Currency with a new object
     *
     * @param newCurrency the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final Currency newCurrency, final ICallback<Currency> callback) {
        send(HttpMethod.POST, callback, newCurrency);
    }

    /**
     * Creates a Currency with a new object
     *
     * @param newCurrency the new object to create
     * @return the created Currency
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public Currency post(final Currency newCurrency) throws ClientException {
        return send(HttpMethod.POST, newCurrency);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ICurrencyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (CurrencyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ICurrencyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (CurrencyRequest)this;
     }

}

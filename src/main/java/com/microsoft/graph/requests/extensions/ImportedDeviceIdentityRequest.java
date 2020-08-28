// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ImportedDeviceIdentity;
import com.microsoft.graph.models.extensions.ImportedDeviceIdentityResult;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Imported Device Identity Request.
 */
public class ImportedDeviceIdentityRequest extends BaseRequest implements IImportedDeviceIdentityRequest {
	
    /**
     * The request for the ImportedDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public ImportedDeviceIdentityRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends ImportedDeviceIdentity> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the ImportedDeviceIdentity
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public ImportedDeviceIdentityRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, ImportedDeviceIdentity.class);
    }

    /**
     * Gets the ImportedDeviceIdentity from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<ImportedDeviceIdentity> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the ImportedDeviceIdentity from the service
     *
     * @return the ImportedDeviceIdentity from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ImportedDeviceIdentity get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<ImportedDeviceIdentity> callback) {
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
     * Patches this ImportedDeviceIdentity with a source
     *
     * @param sourceImportedDeviceIdentity the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final ImportedDeviceIdentity sourceImportedDeviceIdentity, final ICallback<ImportedDeviceIdentity> callback) {
        send(HttpMethod.PATCH, callback, sourceImportedDeviceIdentity);
    }

    /**
     * Patches this ImportedDeviceIdentity with a source
     *
     * @param sourceImportedDeviceIdentity the source object with updates
     * @return the updated ImportedDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ImportedDeviceIdentity patch(final ImportedDeviceIdentity sourceImportedDeviceIdentity) throws ClientException {
        return send(HttpMethod.PATCH, sourceImportedDeviceIdentity);
    }

    /**
     * Creates a ImportedDeviceIdentity with a new object
     *
     * @param newImportedDeviceIdentity the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final ImportedDeviceIdentity newImportedDeviceIdentity, final ICallback<ImportedDeviceIdentity> callback) {
        send(HttpMethod.POST, callback, newImportedDeviceIdentity);
    }

    /**
     * Creates a ImportedDeviceIdentity with a new object
     *
     * @param newImportedDeviceIdentity the new object to create
     * @return the created ImportedDeviceIdentity
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public ImportedDeviceIdentity post(final ImportedDeviceIdentity newImportedDeviceIdentity) throws ClientException {
        return send(HttpMethod.POST, newImportedDeviceIdentity);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IImportedDeviceIdentityRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (ImportedDeviceIdentityRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IImportedDeviceIdentityRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (ImportedDeviceIdentityRequest)this;
     }

}


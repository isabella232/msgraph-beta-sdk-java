// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosVppAppAssignedDeviceLicense;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Vpp App Assigned Device License Request.
 */
public class IosVppAppAssignedDeviceLicenseRequest extends BaseRequest implements IIosVppAppAssignedDeviceLicenseRequest {
	
    /**
     * The request for the IosVppAppAssignedDeviceLicense
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosVppAppAssignedDeviceLicenseRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosVppAppAssignedDeviceLicense.class);
    }

    /**
     * Gets the IosVppAppAssignedDeviceLicense from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super IosVppAppAssignedDeviceLicense> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosVppAppAssignedDeviceLicense from the service
     *
     * @return the IosVppAppAssignedDeviceLicense from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppAppAssignedDeviceLicense get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super IosVppAppAssignedDeviceLicense> callback) {
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
     * Patches this IosVppAppAssignedDeviceLicense with a source
     *
     * @param sourceIosVppAppAssignedDeviceLicense the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosVppAppAssignedDeviceLicense sourceIosVppAppAssignedDeviceLicense, final ICallback<? super IosVppAppAssignedDeviceLicense> callback) {
        send(HttpMethod.PATCH, callback, sourceIosVppAppAssignedDeviceLicense);
    }

    /**
     * Patches this IosVppAppAssignedDeviceLicense with a source
     *
     * @param sourceIosVppAppAssignedDeviceLicense the source object with updates
     * @return the updated IosVppAppAssignedDeviceLicense
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppAppAssignedDeviceLicense patch(final IosVppAppAssignedDeviceLicense sourceIosVppAppAssignedDeviceLicense) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosVppAppAssignedDeviceLicense);
    }

    /**
     * Creates a IosVppAppAssignedDeviceLicense with a new object
     *
     * @param newIosVppAppAssignedDeviceLicense the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosVppAppAssignedDeviceLicense newIosVppAppAssignedDeviceLicense, final ICallback<? super IosVppAppAssignedDeviceLicense> callback) {
        send(HttpMethod.POST, callback, newIosVppAppAssignedDeviceLicense);
    }

    /**
     * Creates a IosVppAppAssignedDeviceLicense with a new object
     *
     * @param newIosVppAppAssignedDeviceLicense the new object to create
     * @return the created IosVppAppAssignedDeviceLicense
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppAppAssignedDeviceLicense post(final IosVppAppAssignedDeviceLicense newIosVppAppAssignedDeviceLicense) throws ClientException {
        return send(HttpMethod.POST, newIosVppAppAssignedDeviceLicense);
    }

    /**
     * Creates a IosVppAppAssignedDeviceLicense with a new object
     *
     * @param newIosVppAppAssignedDeviceLicense the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosVppAppAssignedDeviceLicense newIosVppAppAssignedDeviceLicense, final ICallback<? super IosVppAppAssignedDeviceLicense> callback) {
        send(HttpMethod.PUT, callback, newIosVppAppAssignedDeviceLicense);
    }

    /**
     * Creates a IosVppAppAssignedDeviceLicense with a new object
     *
     * @param newIosVppAppAssignedDeviceLicense the object to create/update
     * @return the created IosVppAppAssignedDeviceLicense
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosVppAppAssignedDeviceLicense put(final IosVppAppAssignedDeviceLicense newIosVppAppAssignedDeviceLicense) throws ClientException {
        return send(HttpMethod.PUT, newIosVppAppAssignedDeviceLicense);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosVppAppAssignedDeviceLicenseRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosVppAppAssignedDeviceLicenseRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosVppAppAssignedDeviceLicenseRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosVppAppAssignedDeviceLicenseRequest)this;
     }

}


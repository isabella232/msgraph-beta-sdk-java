// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.TenantSetupInfo;
import com.microsoft.graph.requests.extensions.IPrivilegedRoleSettingsRequestBuilder;
import com.microsoft.graph.requests.extensions.PrivilegedRoleSettingsRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Tenant Setup Info Request.
 */
public class TenantSetupInfoRequest extends BaseRequest implements ITenantSetupInfoRequest {
	
    /**
     * The request for the TenantSetupInfo
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public TenantSetupInfoRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, TenantSetupInfo.class);
    }

    /**
     * Gets the TenantSetupInfo from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super TenantSetupInfo> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the TenantSetupInfo from the service
     *
     * @return the TenantSetupInfo from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TenantSetupInfo get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super TenantSetupInfo> callback) {
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
     * Patches this TenantSetupInfo with a source
     *
     * @param sourceTenantSetupInfo the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final TenantSetupInfo sourceTenantSetupInfo, final ICallback<? super TenantSetupInfo> callback) {
        send(HttpMethod.PATCH, callback, sourceTenantSetupInfo);
    }

    /**
     * Patches this TenantSetupInfo with a source
     *
     * @param sourceTenantSetupInfo the source object with updates
     * @return the updated TenantSetupInfo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TenantSetupInfo patch(final TenantSetupInfo sourceTenantSetupInfo) throws ClientException {
        return send(HttpMethod.PATCH, sourceTenantSetupInfo);
    }

    /**
     * Creates a TenantSetupInfo with a new object
     *
     * @param newTenantSetupInfo the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final TenantSetupInfo newTenantSetupInfo, final ICallback<? super TenantSetupInfo> callback) {
        send(HttpMethod.POST, callback, newTenantSetupInfo);
    }

    /**
     * Creates a TenantSetupInfo with a new object
     *
     * @param newTenantSetupInfo the new object to create
     * @return the created TenantSetupInfo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TenantSetupInfo post(final TenantSetupInfo newTenantSetupInfo) throws ClientException {
        return send(HttpMethod.POST, newTenantSetupInfo);
    }

    /**
     * Creates a TenantSetupInfo with a new object
     *
     * @param newTenantSetupInfo the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final TenantSetupInfo newTenantSetupInfo, final ICallback<? super TenantSetupInfo> callback) {
        send(HttpMethod.PUT, callback, newTenantSetupInfo);
    }

    /**
     * Creates a TenantSetupInfo with a new object
     *
     * @param newTenantSetupInfo the object to create/update
     * @return the created TenantSetupInfo
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public TenantSetupInfo put(final TenantSetupInfo newTenantSetupInfo) throws ClientException {
        return send(HttpMethod.PUT, newTenantSetupInfo);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public ITenantSetupInfoRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (TenantSetupInfoRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public ITenantSetupInfoRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (TenantSetupInfoRequest)this;
     }

}


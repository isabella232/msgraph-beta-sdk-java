// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfigurationPolicySetItem;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Ios Lob App Provisioning Configuration Policy Set Item Request.
 */
public class IosLobAppProvisioningConfigurationPolicySetItemRequest extends BaseRequest implements IIosLobAppProvisioningConfigurationPolicySetItemRequest {
	
    /**
     * The request for the IosLobAppProvisioningConfigurationPolicySetItem
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public IosLobAppProvisioningConfigurationPolicySetItemRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, IosLobAppProvisioningConfigurationPolicySetItem.class);
    }

    /**
     * Gets the IosLobAppProvisioningConfigurationPolicySetItem from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<IosLobAppProvisioningConfigurationPolicySetItem> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the IosLobAppProvisioningConfigurationPolicySetItem from the service
     *
     * @return the IosLobAppProvisioningConfigurationPolicySetItem from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosLobAppProvisioningConfigurationPolicySetItem get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<IosLobAppProvisioningConfigurationPolicySetItem> callback) {
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
     * Patches this IosLobAppProvisioningConfigurationPolicySetItem with a source
     *
     * @param sourceIosLobAppProvisioningConfigurationPolicySetItem the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final IosLobAppProvisioningConfigurationPolicySetItem sourceIosLobAppProvisioningConfigurationPolicySetItem, final ICallback<IosLobAppProvisioningConfigurationPolicySetItem> callback) {
        send(HttpMethod.PATCH, callback, sourceIosLobAppProvisioningConfigurationPolicySetItem);
    }

    /**
     * Patches this IosLobAppProvisioningConfigurationPolicySetItem with a source
     *
     * @param sourceIosLobAppProvisioningConfigurationPolicySetItem the source object with updates
     * @return the updated IosLobAppProvisioningConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosLobAppProvisioningConfigurationPolicySetItem patch(final IosLobAppProvisioningConfigurationPolicySetItem sourceIosLobAppProvisioningConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.PATCH, sourceIosLobAppProvisioningConfigurationPolicySetItem);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationPolicySetItem with a new object
     *
     * @param newIosLobAppProvisioningConfigurationPolicySetItem the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final IosLobAppProvisioningConfigurationPolicySetItem newIosLobAppProvisioningConfigurationPolicySetItem, final ICallback<IosLobAppProvisioningConfigurationPolicySetItem> callback) {
        send(HttpMethod.POST, callback, newIosLobAppProvisioningConfigurationPolicySetItem);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationPolicySetItem with a new object
     *
     * @param newIosLobAppProvisioningConfigurationPolicySetItem the new object to create
     * @return the created IosLobAppProvisioningConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosLobAppProvisioningConfigurationPolicySetItem post(final IosLobAppProvisioningConfigurationPolicySetItem newIosLobAppProvisioningConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.POST, newIosLobAppProvisioningConfigurationPolicySetItem);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationPolicySetItem with a new object
     *
     * @param newIosLobAppProvisioningConfigurationPolicySetItem the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final IosLobAppProvisioningConfigurationPolicySetItem newIosLobAppProvisioningConfigurationPolicySetItem, final ICallback<IosLobAppProvisioningConfigurationPolicySetItem> callback) {
        send(HttpMethod.PUT, callback, newIosLobAppProvisioningConfigurationPolicySetItem);
    }

    /**
     * Creates a IosLobAppProvisioningConfigurationPolicySetItem with a new object
     *
     * @param newIosLobAppProvisioningConfigurationPolicySetItem the object to create/update
     * @return the created IosLobAppProvisioningConfigurationPolicySetItem
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public IosLobAppProvisioningConfigurationPolicySetItem put(final IosLobAppProvisioningConfigurationPolicySetItem newIosLobAppProvisioningConfigurationPolicySetItem) throws ClientException {
        return send(HttpMethod.PUT, newIosLobAppProvisioningConfigurationPolicySetItem);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IIosLobAppProvisioningConfigurationPolicySetItemRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (IosLobAppProvisioningConfigurationPolicySetItemRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IIosLobAppProvisioningConfigurationPolicySetItemRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (IosLobAppProvisioningConfigurationPolicySetItemRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IIosLobAppProvisioningConfigurationPolicySetItemRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (IosLobAppProvisioningConfigurationPolicySetItemRequest)this;
     }

}


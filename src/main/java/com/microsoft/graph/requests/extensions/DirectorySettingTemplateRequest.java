// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DirectorySettingTemplate;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Directory Setting Template Request.
 */
public class DirectorySettingTemplateRequest extends BaseRequest implements IDirectorySettingTemplateRequest {
	
    /**
     * The request for the DirectorySettingTemplate
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DirectorySettingTemplateRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DirectorySettingTemplate.class);
    }

    /**
     * Gets the DirectorySettingTemplate from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DirectorySettingTemplate> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DirectorySettingTemplate from the service
     *
     * @return the DirectorySettingTemplate from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectorySettingTemplate get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DirectorySettingTemplate> callback) {
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
     * Patches this DirectorySettingTemplate with a source
     *
     * @param sourceDirectorySettingTemplate the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DirectorySettingTemplate sourceDirectorySettingTemplate, final ICallback<DirectorySettingTemplate> callback) {
        send(HttpMethod.PATCH, callback, sourceDirectorySettingTemplate);
    }

    /**
     * Patches this DirectorySettingTemplate with a source
     *
     * @param sourceDirectorySettingTemplate the source object with updates
     * @return the updated DirectorySettingTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectorySettingTemplate patch(final DirectorySettingTemplate sourceDirectorySettingTemplate) throws ClientException {
        return send(HttpMethod.PATCH, sourceDirectorySettingTemplate);
    }

    /**
     * Creates a DirectorySettingTemplate with a new object
     *
     * @param newDirectorySettingTemplate the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DirectorySettingTemplate newDirectorySettingTemplate, final ICallback<DirectorySettingTemplate> callback) {
        send(HttpMethod.POST, callback, newDirectorySettingTemplate);
    }

    /**
     * Creates a DirectorySettingTemplate with a new object
     *
     * @param newDirectorySettingTemplate the new object to create
     * @return the created DirectorySettingTemplate
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DirectorySettingTemplate post(final DirectorySettingTemplate newDirectorySettingTemplate) throws ClientException {
        return send(HttpMethod.POST, newDirectorySettingTemplate);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDirectorySettingTemplateRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DirectorySettingTemplateRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDirectorySettingTemplateRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DirectorySettingTemplateRequest)this;
     }

}


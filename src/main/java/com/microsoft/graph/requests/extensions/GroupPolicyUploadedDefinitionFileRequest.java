// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedDefinitionFile;
import com.microsoft.graph.models.extensions.GroupPolicyUploadedLanguageFile;
import com.microsoft.graph.requests.extensions.IGroupPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyOperationRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyOperationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyOperationRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Uploaded Definition File Request.
 */
public class GroupPolicyUploadedDefinitionFileRequest extends BaseRequest implements IGroupPolicyUploadedDefinitionFileRequest {
	
    /**
     * The request for the GroupPolicyUploadedDefinitionFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyUploadedDefinitionFileRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyUploadedDefinitionFile.class);
    }

    /**
     * Gets the GroupPolicyUploadedDefinitionFile from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPolicyUploadedDefinitionFile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyUploadedDefinitionFile from the service
     *
     * @return the GroupPolicyUploadedDefinitionFile from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyUploadedDefinitionFile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupPolicyUploadedDefinitionFile> callback) {
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
     * Patches this GroupPolicyUploadedDefinitionFile with a source
     *
     * @param sourceGroupPolicyUploadedDefinitionFile the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyUploadedDefinitionFile sourceGroupPolicyUploadedDefinitionFile, final ICallback<GroupPolicyUploadedDefinitionFile> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Patches this GroupPolicyUploadedDefinitionFile with a source
     *
     * @param sourceGroupPolicyUploadedDefinitionFile the source object with updates
     * @return the updated GroupPolicyUploadedDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyUploadedDefinitionFile patch(final GroupPolicyUploadedDefinitionFile sourceGroupPolicyUploadedDefinitionFile) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Creates a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile, final ICallback<GroupPolicyUploadedDefinitionFile> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Creates a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the new object to create
     * @return the created GroupPolicyUploadedDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyUploadedDefinitionFile post(final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Creates a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile, final ICallback<GroupPolicyUploadedDefinitionFile> callback) {
        send(HttpMethod.PUT, callback, newGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Creates a GroupPolicyUploadedDefinitionFile with a new object
     *
     * @param newGroupPolicyUploadedDefinitionFile the object to create/update
     * @return the created GroupPolicyUploadedDefinitionFile
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyUploadedDefinitionFile put(final GroupPolicyUploadedDefinitionFile newGroupPolicyUploadedDefinitionFile) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyUploadedDefinitionFile);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyUploadedDefinitionFileRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupPolicyUploadedDefinitionFileRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyUploadedDefinitionFileRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupPolicyUploadedDefinitionFileRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IGroupPolicyUploadedDefinitionFileRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (GroupPolicyUploadedDefinitionFileRequest)this;
     }

}


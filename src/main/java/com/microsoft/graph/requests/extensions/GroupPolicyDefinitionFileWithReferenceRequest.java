// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyDefinitionFile;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IGroupPolicyDefinitionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.GroupPolicyDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Definition File With Reference Request.
 */
public class GroupPolicyDefinitionFileWithReferenceRequest extends BaseRequest implements IGroupPolicyDefinitionFileWithReferenceRequest {

    /**
     * The request for the GroupPolicyDefinitionFile
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyDefinitionFileWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyDefinitionFile.class);
    }

    public void post(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile, final IJsonBackedObject payload, final ICallback<GroupPolicyDefinitionFile> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public GroupPolicyDefinitionFile post(final GroupPolicyDefinitionFile newGroupPolicyDefinitionFile, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newGroupPolicyDefinitionFile;
        }
        return null;
    }

    public void get(final ICallback<GroupPolicyDefinitionFile> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public GroupPolicyDefinitionFile get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<GroupPolicyDefinitionFile> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final GroupPolicyDefinitionFile sourceGroupPolicyDefinitionFile, final ICallback<GroupPolicyDefinitionFile> callback) {
		send(HttpMethod.PATCH, callback, sourceGroupPolicyDefinitionFile);
	}

	public GroupPolicyDefinitionFile patch(final GroupPolicyDefinitionFile sourceGroupPolicyDefinitionFile) throws ClientException {
		return send(HttpMethod.PATCH, sourceGroupPolicyDefinitionFile);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IGroupPolicyDefinitionFileWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (GroupPolicyDefinitionFileWithReferenceRequest)this;
    }
    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    public IGroupPolicyDefinitionFileWithReferenceRequest filter(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
        return (GroupPolicyDefinitionFileWithReferenceRequest)this;
    }
}

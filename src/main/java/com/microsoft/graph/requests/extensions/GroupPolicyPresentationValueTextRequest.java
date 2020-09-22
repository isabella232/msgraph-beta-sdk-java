// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationValueText;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Value Text Request.
 */
public class GroupPolicyPresentationValueTextRequest extends BaseRequest implements IGroupPolicyPresentationValueTextRequest {
	
    /**
     * The request for the GroupPolicyPresentationValueText
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationValueTextRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationValueText.class);
    }

    /**
     * Gets the GroupPolicyPresentationValueText from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPolicyPresentationValueText> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyPresentationValueText from the service
     *
     * @return the GroupPolicyPresentationValueText from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationValueText get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupPolicyPresentationValueText> callback) {
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
     * Patches this GroupPolicyPresentationValueText with a source
     *
     * @param sourceGroupPolicyPresentationValueText the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyPresentationValueText sourceGroupPolicyPresentationValueText, final ICallback<GroupPolicyPresentationValueText> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyPresentationValueText);
    }

    /**
     * Patches this GroupPolicyPresentationValueText with a source
     *
     * @param sourceGroupPolicyPresentationValueText the source object with updates
     * @return the updated GroupPolicyPresentationValueText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationValueText patch(final GroupPolicyPresentationValueText sourceGroupPolicyPresentationValueText) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentationValueText);
    }

    /**
     * Creates a GroupPolicyPresentationValueText with a new object
     *
     * @param newGroupPolicyPresentationValueText the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyPresentationValueText newGroupPolicyPresentationValueText, final ICallback<GroupPolicyPresentationValueText> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyPresentationValueText);
    }

    /**
     * Creates a GroupPolicyPresentationValueText with a new object
     *
     * @param newGroupPolicyPresentationValueText the new object to create
     * @return the created GroupPolicyPresentationValueText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationValueText post(final GroupPolicyPresentationValueText newGroupPolicyPresentationValueText) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentationValueText);
    }

    /**
     * Creates a GroupPolicyPresentationValueText with a new object
     *
     * @param newGroupPolicyPresentationValueText the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final GroupPolicyPresentationValueText newGroupPolicyPresentationValueText, final ICallback<GroupPolicyPresentationValueText> callback) {
        send(HttpMethod.PUT, callback, newGroupPolicyPresentationValueText);
    }

    /**
     * Creates a GroupPolicyPresentationValueText with a new object
     *
     * @param newGroupPolicyPresentationValueText the object to create/update
     * @return the created GroupPolicyPresentationValueText
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationValueText put(final GroupPolicyPresentationValueText newGroupPolicyPresentationValueText) throws ClientException {
        return send(HttpMethod.PUT, newGroupPolicyPresentationValueText);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyPresentationValueTextRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupPolicyPresentationValueTextRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyPresentationValueTextRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupPolicyPresentationValueTextRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IGroupPolicyPresentationValueTextRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (GroupPolicyPresentationValueTextRequest)this;
     }

}


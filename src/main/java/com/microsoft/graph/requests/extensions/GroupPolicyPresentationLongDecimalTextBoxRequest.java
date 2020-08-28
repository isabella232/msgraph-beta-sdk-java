// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.GroupPolicyPresentationLongDecimalTextBox;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Group Policy Presentation Long Decimal Text Box Request.
 */
public class GroupPolicyPresentationLongDecimalTextBoxRequest extends BaseRequest implements IGroupPolicyPresentationLongDecimalTextBoxRequest {
	
    /**
     * The request for the GroupPolicyPresentationLongDecimalTextBox
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public GroupPolicyPresentationLongDecimalTextBoxRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, GroupPolicyPresentationLongDecimalTextBox.class);
    }

    /**
     * Gets the GroupPolicyPresentationLongDecimalTextBox from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<GroupPolicyPresentationLongDecimalTextBox> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the GroupPolicyPresentationLongDecimalTextBox from the service
     *
     * @return the GroupPolicyPresentationLongDecimalTextBox from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationLongDecimalTextBox get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<GroupPolicyPresentationLongDecimalTextBox> callback) {
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
     * Patches this GroupPolicyPresentationLongDecimalTextBox with a source
     *
     * @param sourceGroupPolicyPresentationLongDecimalTextBox the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final GroupPolicyPresentationLongDecimalTextBox sourceGroupPolicyPresentationLongDecimalTextBox, final ICallback<GroupPolicyPresentationLongDecimalTextBox> callback) {
        send(HttpMethod.PATCH, callback, sourceGroupPolicyPresentationLongDecimalTextBox);
    }

    /**
     * Patches this GroupPolicyPresentationLongDecimalTextBox with a source
     *
     * @param sourceGroupPolicyPresentationLongDecimalTextBox the source object with updates
     * @return the updated GroupPolicyPresentationLongDecimalTextBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationLongDecimalTextBox patch(final GroupPolicyPresentationLongDecimalTextBox sourceGroupPolicyPresentationLongDecimalTextBox) throws ClientException {
        return send(HttpMethod.PATCH, sourceGroupPolicyPresentationLongDecimalTextBox);
    }

    /**
     * Creates a GroupPolicyPresentationLongDecimalTextBox with a new object
     *
     * @param newGroupPolicyPresentationLongDecimalTextBox the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final GroupPolicyPresentationLongDecimalTextBox newGroupPolicyPresentationLongDecimalTextBox, final ICallback<GroupPolicyPresentationLongDecimalTextBox> callback) {
        send(HttpMethod.POST, callback, newGroupPolicyPresentationLongDecimalTextBox);
    }

    /**
     * Creates a GroupPolicyPresentationLongDecimalTextBox with a new object
     *
     * @param newGroupPolicyPresentationLongDecimalTextBox the new object to create
     * @return the created GroupPolicyPresentationLongDecimalTextBox
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public GroupPolicyPresentationLongDecimalTextBox post(final GroupPolicyPresentationLongDecimalTextBox newGroupPolicyPresentationLongDecimalTextBox) throws ClientException {
        return send(HttpMethod.POST, newGroupPolicyPresentationLongDecimalTextBox);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IGroupPolicyPresentationLongDecimalTextBoxRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (GroupPolicyPresentationLongDecimalTextBoxRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IGroupPolicyPresentationLongDecimalTextBoxRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (GroupPolicyPresentationLongDecimalTextBoxRequest)this;
     }

}


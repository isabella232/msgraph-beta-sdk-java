// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MobileAppProvisioningConfigGroupAssignment;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mobile App Provisioning Config Group Assignment Request.
 */
public class MobileAppProvisioningConfigGroupAssignmentRequest extends BaseRequest implements IMobileAppProvisioningConfigGroupAssignmentRequest {
	
    /**
     * The request for the MobileAppProvisioningConfigGroupAssignment
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MobileAppProvisioningConfigGroupAssignmentRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, MobileAppProvisioningConfigGroupAssignment.class);
    }

    /**
     * Gets the MobileAppProvisioningConfigGroupAssignment from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<MobileAppProvisioningConfigGroupAssignment> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the MobileAppProvisioningConfigGroupAssignment from the service
     *
     * @return the MobileAppProvisioningConfigGroupAssignment from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppProvisioningConfigGroupAssignment get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<MobileAppProvisioningConfigGroupAssignment> callback) {
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
     * Patches this MobileAppProvisioningConfigGroupAssignment with a source
     *
     * @param sourceMobileAppProvisioningConfigGroupAssignment the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final MobileAppProvisioningConfigGroupAssignment sourceMobileAppProvisioningConfigGroupAssignment, final ICallback<MobileAppProvisioningConfigGroupAssignment> callback) {
        send(HttpMethod.PATCH, callback, sourceMobileAppProvisioningConfigGroupAssignment);
    }

    /**
     * Patches this MobileAppProvisioningConfigGroupAssignment with a source
     *
     * @param sourceMobileAppProvisioningConfigGroupAssignment the source object with updates
     * @return the updated MobileAppProvisioningConfigGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppProvisioningConfigGroupAssignment patch(final MobileAppProvisioningConfigGroupAssignment sourceMobileAppProvisioningConfigGroupAssignment) throws ClientException {
        return send(HttpMethod.PATCH, sourceMobileAppProvisioningConfigGroupAssignment);
    }

    /**
     * Creates a MobileAppProvisioningConfigGroupAssignment with a new object
     *
     * @param newMobileAppProvisioningConfigGroupAssignment the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final MobileAppProvisioningConfigGroupAssignment newMobileAppProvisioningConfigGroupAssignment, final ICallback<MobileAppProvisioningConfigGroupAssignment> callback) {
        send(HttpMethod.POST, callback, newMobileAppProvisioningConfigGroupAssignment);
    }

    /**
     * Creates a MobileAppProvisioningConfigGroupAssignment with a new object
     *
     * @param newMobileAppProvisioningConfigGroupAssignment the new object to create
     * @return the created MobileAppProvisioningConfigGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppProvisioningConfigGroupAssignment post(final MobileAppProvisioningConfigGroupAssignment newMobileAppProvisioningConfigGroupAssignment) throws ClientException {
        return send(HttpMethod.POST, newMobileAppProvisioningConfigGroupAssignment);
    }

    /**
     * Creates a MobileAppProvisioningConfigGroupAssignment with a new object
     *
     * @param newMobileAppProvisioningConfigGroupAssignment the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final MobileAppProvisioningConfigGroupAssignment newMobileAppProvisioningConfigGroupAssignment, final ICallback<MobileAppProvisioningConfigGroupAssignment> callback) {
        send(HttpMethod.PUT, callback, newMobileAppProvisioningConfigGroupAssignment);
    }

    /**
     * Creates a MobileAppProvisioningConfigGroupAssignment with a new object
     *
     * @param newMobileAppProvisioningConfigGroupAssignment the object to create/update
     * @return the created MobileAppProvisioningConfigGroupAssignment
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public MobileAppProvisioningConfigGroupAssignment put(final MobileAppProvisioningConfigGroupAssignment newMobileAppProvisioningConfigGroupAssignment) throws ClientException {
        return send(HttpMethod.PUT, newMobileAppProvisioningConfigGroupAssignment);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IMobileAppProvisioningConfigGroupAssignmentRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (MobileAppProvisioningConfigGroupAssignmentRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IMobileAppProvisioningConfigGroupAssignmentRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (MobileAppProvisioningConfigGroupAssignmentRequest)this;
     }

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
     public IMobileAppProvisioningConfigGroupAssignmentRequest filter(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$filter", value));
         return (MobileAppProvisioningConfigGroupAssignmentRequest)this;
     }

}


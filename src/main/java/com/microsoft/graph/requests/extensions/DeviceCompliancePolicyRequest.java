// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicy;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.RetireScheduledManagedDevice;
import com.microsoft.graph.models.generated.ScheduledRetireState;
import com.microsoft.graph.models.extensions.DeviceCompliancePolicyScript;
import com.microsoft.graph.models.extensions.DeviceComplianceScriptValidationResult;
import com.microsoft.graph.models.extensions.DeviceComplianceScheduledActionForRule;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceCompliancePolicyAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceScheduledActionForRuleRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceComplianceUserOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceComplianceUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Compliance Policy Request.
 */
public class DeviceCompliancePolicyRequest extends BaseRequest implements IDeviceCompliancePolicyRequest {
	
    /**
     * The request for the DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param responseClass  the class of the response
     */
    public DeviceCompliancePolicyRequest(final String requestUrl,
            final IBaseClient client,
            final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions,
            final Class<? extends DeviceCompliancePolicy> responseClass) {
        super(requestUrl, client, requestOptions, responseClass);
    }

    /**
     * The request for the DeviceCompliancePolicy
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceCompliancePolicyRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceCompliancePolicy.class);
    }

    /**
     * Gets the DeviceCompliancePolicy from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DeviceCompliancePolicy> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DeviceCompliancePolicy from the service
     *
     * @return the DeviceCompliancePolicy from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicy get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DeviceCompliancePolicy> callback) {
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
     * Patches this DeviceCompliancePolicy with a source
     *
     * @param sourceDeviceCompliancePolicy the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DeviceCompliancePolicy sourceDeviceCompliancePolicy, final ICallback<? super DeviceCompliancePolicy> callback) {
        send(HttpMethod.PATCH, callback, sourceDeviceCompliancePolicy);
    }

    /**
     * Patches this DeviceCompliancePolicy with a source
     *
     * @param sourceDeviceCompliancePolicy the source object with updates
     * @return the updated DeviceCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicy patch(final DeviceCompliancePolicy sourceDeviceCompliancePolicy) throws ClientException {
        return send(HttpMethod.PATCH, sourceDeviceCompliancePolicy);
    }

    /**
     * Creates a DeviceCompliancePolicy with a new object
     *
     * @param newDeviceCompliancePolicy the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DeviceCompliancePolicy newDeviceCompliancePolicy, final ICallback<? super DeviceCompliancePolicy> callback) {
        send(HttpMethod.POST, callback, newDeviceCompliancePolicy);
    }

    /**
     * Creates a DeviceCompliancePolicy with a new object
     *
     * @param newDeviceCompliancePolicy the new object to create
     * @return the created DeviceCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicy post(final DeviceCompliancePolicy newDeviceCompliancePolicy) throws ClientException {
        return send(HttpMethod.POST, newDeviceCompliancePolicy);
    }

    /**
     * Creates a DeviceCompliancePolicy with a new object
     *
     * @param newDeviceCompliancePolicy the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DeviceCompliancePolicy newDeviceCompliancePolicy, final ICallback<? super DeviceCompliancePolicy> callback) {
        send(HttpMethod.PUT, callback, newDeviceCompliancePolicy);
    }

    /**
     * Creates a DeviceCompliancePolicy with a new object
     *
     * @param newDeviceCompliancePolicy the object to create/update
     * @return the created DeviceCompliancePolicy
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DeviceCompliancePolicy put(final DeviceCompliancePolicy newDeviceCompliancePolicy) throws ClientException {
        return send(HttpMethod.PUT, newDeviceCompliancePolicy);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DeviceCompliancePolicyRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDeviceCompliancePolicyRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DeviceCompliancePolicyRequest)this;
     }

}


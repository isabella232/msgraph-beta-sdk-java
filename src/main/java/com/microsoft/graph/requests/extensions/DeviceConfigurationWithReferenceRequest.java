// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.extensions.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.models.extensions.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.extensions.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.extensions.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceConfigurationUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.options.QueryOption;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.serializer.IJsonBackedObject;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Configuration With Reference Request.
 */
public class DeviceConfigurationWithReferenceRequest extends BaseRequest implements IDeviceConfigurationWithReferenceRequest {

    /**
     * The request for the DeviceConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceConfigurationWithReferenceRequest(String requestUrl, IBaseClient client, java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DeviceConfiguration.class);
    }

    public void post(final DeviceConfiguration newDeviceConfiguration, final IJsonBackedObject payload, final ICallback<DeviceConfiguration> callback) {
        send(HttpMethod.POST, callback, payload);
    }

    public DeviceConfiguration post(final DeviceConfiguration newDeviceConfiguration, final IJsonBackedObject payload) throws ClientException {
        IJsonBackedObject response = send(HttpMethod.POST, payload);
        if (response != null){
            return newDeviceConfiguration;
        }
        return null;
    }

    public void get(final ICallback<DeviceConfiguration> callback) {
        send(HttpMethod.GET, callback, null);
    }

    public DeviceConfiguration get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

	public void delete(final ICallback<DeviceConfiguration> callback) {
		send(HttpMethod.DELETE, callback, null);
	}

	public void delete() throws ClientException {
		send(HttpMethod.DELETE, null);
	}

	public void patch(final DeviceConfiguration sourceDeviceConfiguration, final ICallback<DeviceConfiguration> callback) {
		send(HttpMethod.PATCH, callback, sourceDeviceConfiguration);
	}

	public DeviceConfiguration patch(final DeviceConfiguration sourceDeviceConfiguration) throws ClientException {
		return send(HttpMethod.PATCH, sourceDeviceConfiguration);
	}


    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    public IDeviceConfigurationWithReferenceRequest select(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
        return (IDeviceConfigurationWithReferenceRequest)this;
    }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    public IDeviceConfigurationWithReferenceRequest expand(final String value) {
        getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
        return (DeviceConfigurationWithReferenceRequest)this;
    }
}

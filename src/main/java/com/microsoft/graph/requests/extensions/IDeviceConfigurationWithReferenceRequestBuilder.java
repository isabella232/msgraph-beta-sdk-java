// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceConfiguration;
import com.microsoft.graph.models.extensions.DeviceConfigurationGroupAssignment;
import com.microsoft.graph.models.extensions.DeviceConfigurationAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.models.extensions.DeviceConfigurationTargetedUserAndDevice;
import com.microsoft.graph.models.extensions.WindowsAssignedAccessProfile;
import com.microsoft.graph.models.extensions.WindowsPrivacyDataAccessControlItem;
import com.microsoft.graph.models.extensions.IosAvailableUpdateVersion;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISettingStateDeviceSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationDeviceOverviewRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceConfigurationUserOverviewRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Configuration With Reference Request Builder.
 */
public interface IDeviceConfigurationWithReferenceRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceConfigurationWithReferenceRequest instance
     */
    IDeviceConfigurationWithReferenceRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceConfigurationWithReferenceRequest instance
     */
    IDeviceConfigurationWithReferenceRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IDeviceConfigurationReferenceRequestBuilder reference();

}

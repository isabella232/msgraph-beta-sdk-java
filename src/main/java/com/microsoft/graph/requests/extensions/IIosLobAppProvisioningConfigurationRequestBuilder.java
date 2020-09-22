// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfiguration;
import com.microsoft.graph.models.extensions.MobileAppProvisioningConfigGroupAssignment;
import com.microsoft.graph.models.extensions.IosLobAppProvisioningConfigurationAssignment;
import com.microsoft.graph.models.extensions.HasPayloadLinkResultItem;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppProvisioningConfigGroupAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Ios Lob App Provisioning Configuration Request Builder.
 */
public interface IIosLobAppProvisioningConfigurationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IIosLobAppProvisioningConfigurationRequest instance
     */
    IIosLobAppProvisioningConfigurationRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IIosLobAppProvisioningConfigurationRequest instance
     */
    IIosLobAppProvisioningConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IIosLobAppProvisioningConfigurationAssignmentCollectionRequestBuilder assignments();

    IIosLobAppProvisioningConfigurationAssignmentRequestBuilder assignments(final String id);

    IManagedDeviceMobileAppConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses();

    IManagedDeviceMobileAppConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id);

    IMobileAppProvisioningConfigGroupAssignmentCollectionRequestBuilder groupAssignments();

    IMobileAppProvisioningConfigGroupAssignmentRequestBuilder groupAssignments(final String id);

    IManagedDeviceMobileAppConfigurationUserStatusCollectionRequestBuilder userStatuses();

    IManagedDeviceMobileAppConfigurationUserStatusRequestBuilder userStatuses(final String id);
    IIosLobAppProvisioningConfigurationAssignRequestBuilder assign(final java.util.List<MobileAppProvisioningConfigGroupAssignment> appProvisioningConfigurationGroupAssignments, final java.util.List<IosLobAppProvisioningConfigurationAssignment> iOSLobAppProvisioningConfigAssignments);

}
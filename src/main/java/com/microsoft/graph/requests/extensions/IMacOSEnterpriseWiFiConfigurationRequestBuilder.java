// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSEnterpriseWiFiConfiguration;
import com.microsoft.graph.requests.extensions.IMacOSTrustedRootCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSCertificateProfileBaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Mac OSEnterprise Wi Fi Configuration Request Builder.
 */
public interface IMacOSEnterpriseWiFiConfigurationRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IMacOSEnterpriseWiFiConfigurationRequest instance
     */
    IMacOSEnterpriseWiFiConfigurationRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IMacOSEnterpriseWiFiConfigurationRequest instance
     */
    IMacOSEnterpriseWiFiConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDeviceConfigurationGroupAssignmentCollectionRequestBuilder groupAssignments();

    IDeviceConfigurationGroupAssignmentRequestBuilder groupAssignments(final String id);

    IDeviceConfigurationAssignmentCollectionRequestBuilder assignments();

    IDeviceConfigurationAssignmentRequestBuilder assignments(final String id);

    IDeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses();

    IDeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id);

    IDeviceConfigurationUserStatusCollectionRequestBuilder userStatuses();

    IDeviceConfigurationUserStatusRequestBuilder userStatuses(final String id);

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the IDeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    IDeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview();

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the IDeviceConfigurationUserOverviewRequestBuilder instance
     */
    IDeviceConfigurationUserOverviewRequestBuilder userStatusOverview();

    ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries();

    ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id);

    /**
     * Gets the request builder for MacOSTrustedRootCertificate
     *
     * @return the IMacOSTrustedRootCertificateWithReferenceRequestBuilder instance
     */
    IMacOSTrustedRootCertificateWithReferenceRequestBuilder rootCertificateForServerValidation();

    IMacOSTrustedRootCertificateCollectionRequestBuilder rootCertificatesForServerValidation();

    IMacOSTrustedRootCertificateRequestBuilder rootCertificatesForServerValidation(final String id);

    /**
     * Gets the request builder for MacOSCertificateProfileBase
     *
     * @return the IMacOSCertificateProfileBaseWithReferenceRequestBuilder instance
     */
    IMacOSCertificateProfileBaseWithReferenceRequestBuilder identityCertificateForClientAuthentication();

}
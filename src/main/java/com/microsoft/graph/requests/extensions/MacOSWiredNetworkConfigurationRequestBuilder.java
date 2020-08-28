// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.MacOSWiredNetworkConfiguration;
import com.microsoft.graph.requests.extensions.IMacOSTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSTrustedRootCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IMacOSCertificateProfileBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.MacOSCertificateProfileBaseRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac OSWired Network Configuration Request Builder.
 */
public class MacOSWiredNetworkConfigurationRequestBuilder extends BaseRequestBuilder implements IMacOSWiredNetworkConfigurationRequestBuilder {

    /**
     * The request builder for the MacOSWiredNetworkConfiguration
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public MacOSWiredNetworkConfigurationRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @return the IMacOSWiredNetworkConfigurationRequest instance
     */
    public IMacOSWiredNetworkConfigurationRequest buildRequest() {
        return buildRequest(getOptions());
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IMacOSWiredNetworkConfigurationRequest instance
     */
    public IMacOSWiredNetworkConfigurationRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.MacOSWiredNetworkConfigurationRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceConfigurationGroupAssignmentCollectionRequestBuilder groupAssignments() {
        return new DeviceConfigurationGroupAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("groupAssignments"), getClient(), null);
    }

    public IDeviceConfigurationGroupAssignmentRequestBuilder groupAssignments(final String id) {
        return new DeviceConfigurationGroupAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("groupAssignments") + "/" + id, getClient(), null);
    }
    public IDeviceConfigurationAssignmentCollectionRequestBuilder assignments() {
        return new DeviceConfigurationAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IDeviceConfigurationAssignmentRequestBuilder assignments(final String id) {
        return new DeviceConfigurationAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IDeviceConfigurationDeviceStatusCollectionRequestBuilder deviceStatuses() {
        return new DeviceConfigurationDeviceStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses"), getClient(), null);
    }

    public IDeviceConfigurationDeviceStatusRequestBuilder deviceStatuses(final String id) {
        return new DeviceConfigurationDeviceStatusRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatuses") + "/" + id, getClient(), null);
    }
    public IDeviceConfigurationUserStatusCollectionRequestBuilder userStatuses() {
        return new DeviceConfigurationUserStatusCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses"), getClient(), null);
    }

    public IDeviceConfigurationUserStatusRequestBuilder userStatuses(final String id) {
        return new DeviceConfigurationUserStatusRequestBuilder(getRequestUrlWithAdditionalSegment("userStatuses") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationDeviceOverview
     *
     * @return the IDeviceConfigurationDeviceOverviewRequestBuilder instance
     */
    public IDeviceConfigurationDeviceOverviewRequestBuilder deviceStatusOverview() {
        return new DeviceConfigurationDeviceOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStatusOverview"), getClient(), null);
    }

    /**
     * Gets the request builder for DeviceConfigurationUserOverview
     *
     * @return the IDeviceConfigurationUserOverviewRequestBuilder instance
     */
    public IDeviceConfigurationUserOverviewRequestBuilder userStatusOverview() {
        return new DeviceConfigurationUserOverviewRequestBuilder(getRequestUrlWithAdditionalSegment("userStatusOverview"), getClient(), null);
    }
    public ISettingStateDeviceSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new SettingStateDeviceSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    public ISettingStateDeviceSummaryRequestBuilder deviceSettingStateSummaries(final String id) {
        return new SettingStateDeviceSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for MacOSTrustedRootCertificate
     *
     * @return the IMacOSTrustedRootCertificateWithReferenceRequestBuilder instance
     */
    public IMacOSTrustedRootCertificateWithReferenceRequestBuilder rootCertificateForServerValidation() {
        return new MacOSTrustedRootCertificateWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("rootCertificateForServerValidation"), getClient(), null);
    }

    /**
     * Gets the request builder for MacOSCertificateProfileBase
     *
     * @return the IMacOSCertificateProfileBaseWithReferenceRequestBuilder instance
     */
    public IMacOSCertificateProfileBaseWithReferenceRequestBuilder identityCertificateForClientAuthentication() {
        return new MacOSCertificateProfileBaseWithReferenceRequestBuilder(getRequestUrlWithAdditionalSegment("identityCertificateForClientAuthentication"), getClient(), null);
    }
}

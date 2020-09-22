// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementIntent;
import com.microsoft.graph.models.extensions.DeviceManagementIntentAssignment;
import com.microsoft.graph.models.extensions.DeviceManagementSettingInstance;
import com.microsoft.graph.models.extensions.DeviceManagementSettingComparison;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentAssignmentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentAssignmentRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentSettingCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentSettingCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceSettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceSettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceSettingStateSummaryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceSettingStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementSettingInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementSettingInstanceRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentUserStateRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentUserStateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentUserStateRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentDeviceStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceManagementIntentUserStateSummaryRequestBuilder;
import com.microsoft.graph.requests.extensions.DeviceManagementIntentUserStateSummaryRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Intent Request Builder.
 */
public class DeviceManagementIntentRequestBuilder extends BaseRequestBuilder implements IDeviceManagementIntentRequestBuilder {

    /**
     * The request builder for the DeviceManagementIntent
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DeviceManagementIntentRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions);
    }

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementIntentRequest instance
     */
    public IDeviceManagementIntentRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the request with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for this request
     * @return the IDeviceManagementIntentRequest instance
     */
    public IDeviceManagementIntentRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        return new com.microsoft.graph.requests.extensions.DeviceManagementIntentRequest(getRequestUrl(), getClient(), requestOptions);
    }


    public IDeviceManagementIntentAssignmentCollectionRequestBuilder assignments() {
        return new DeviceManagementIntentAssignmentCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("assignments"), getClient(), null);
    }

    public IDeviceManagementIntentAssignmentRequestBuilder assignments(final String id) {
        return new DeviceManagementIntentAssignmentRequestBuilder(getRequestUrlWithAdditionalSegment("assignments") + "/" + id, getClient(), null);
    }
    public IDeviceManagementIntentSettingCategoryCollectionRequestBuilder categories() {
        return new DeviceManagementIntentSettingCategoryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("categories"), getClient(), null);
    }

    public IDeviceManagementIntentSettingCategoryRequestBuilder categories(final String id) {
        return new DeviceManagementIntentSettingCategoryRequestBuilder(getRequestUrlWithAdditionalSegment("categories") + "/" + id, getClient(), null);
    }
    public IDeviceManagementIntentDeviceSettingStateSummaryCollectionRequestBuilder deviceSettingStateSummaries() {
        return new DeviceManagementIntentDeviceSettingStateSummaryCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries"), getClient(), null);
    }

    public IDeviceManagementIntentDeviceSettingStateSummaryRequestBuilder deviceSettingStateSummaries(final String id) {
        return new DeviceManagementIntentDeviceSettingStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceSettingStateSummaries") + "/" + id, getClient(), null);
    }
    public IDeviceManagementIntentDeviceStateCollectionRequestBuilder deviceStates() {
        return new DeviceManagementIntentDeviceStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates"), getClient(), null);
    }

    public IDeviceManagementIntentDeviceStateRequestBuilder deviceStates(final String id) {
        return new DeviceManagementIntentDeviceStateRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceManagementIntentDeviceStateSummary
     *
     * @return the IDeviceManagementIntentDeviceStateSummaryRequestBuilder instance
     */
    public IDeviceManagementIntentDeviceStateSummaryRequestBuilder deviceStateSummary() {
        return new DeviceManagementIntentDeviceStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("deviceStateSummary"), getClient(), null);
    }
    public IDeviceManagementSettingInstanceCollectionRequestBuilder settings() {
        return new DeviceManagementSettingInstanceCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("settings"), getClient(), null);
    }

    public IDeviceManagementSettingInstanceRequestBuilder settings(final String id) {
        return new DeviceManagementSettingInstanceRequestBuilder(getRequestUrlWithAdditionalSegment("settings") + "/" + id, getClient(), null);
    }
    public IDeviceManagementIntentUserStateCollectionRequestBuilder userStates() {
        return new DeviceManagementIntentUserStateCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("userStates"), getClient(), null);
    }

    public IDeviceManagementIntentUserStateRequestBuilder userStates(final String id) {
        return new DeviceManagementIntentUserStateRequestBuilder(getRequestUrlWithAdditionalSegment("userStates") + "/" + id, getClient(), null);
    }

    /**
     * Gets the request builder for DeviceManagementIntentUserStateSummary
     *
     * @return the IDeviceManagementIntentUserStateSummaryRequestBuilder instance
     */
    public IDeviceManagementIntentUserStateSummaryRequestBuilder userStateSummary() {
        return new DeviceManagementIntentUserStateSummaryRequestBuilder(getRequestUrlWithAdditionalSegment("userStateSummary"), getClient(), null);
    }

    public IDeviceManagementIntentAssignRequestBuilder assign(final java.util.List<DeviceManagementIntentAssignment> assignments) {
        return new DeviceManagementIntentAssignRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.assign"), getClient(), null, assignments);
    }

    public IDeviceManagementIntentCreateCopyRequestBuilder createCopy(final String displayName) {
        return new DeviceManagementIntentCreateCopyRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.createCopy"), getClient(), null, displayName);
    }

    public IDeviceManagementIntentMigrateToTemplateRequestBuilder migrateToTemplate(final String newTemplateId, final Boolean preserveCustomValues) {
        return new DeviceManagementIntentMigrateToTemplateRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.migrateToTemplate"), getClient(), null, newTemplateId, preserveCustomValues);
    }

    public IDeviceManagementIntentUpdateSettingsRequestBuilder updateSettings(final java.util.List<DeviceManagementSettingInstance> settings) {
        return new DeviceManagementIntentUpdateSettingsRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.updateSettings"), getClient(), null, settings);
    }

    public IDeviceManagementIntentCompareCollectionRequestBuilder compare(final String templateId) {
        return new DeviceManagementIntentCompareCollectionRequestBuilder(getRequestUrlWithAdditionalSegment("microsoft.graph.compare"), getClient(), null, templateId);
    }
}

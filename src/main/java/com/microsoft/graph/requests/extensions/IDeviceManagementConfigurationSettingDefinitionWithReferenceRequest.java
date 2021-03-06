// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.DeviceManagementConfigurationSettingDefinition;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Management Configuration Setting Definition With Reference Request.
 */
public interface IDeviceManagementConfigurationSettingDefinitionWithReferenceRequest extends IHttpRequest {

    void post(final DeviceManagementConfigurationSettingDefinition newDeviceManagementConfigurationSettingDefinition, final IJsonBackedObject payload, final ICallback<? super DeviceManagementConfigurationSettingDefinition> callback);

    DeviceManagementConfigurationSettingDefinition post(final DeviceManagementConfigurationSettingDefinition newDeviceManagementConfigurationSettingDefinition, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<? super DeviceManagementConfigurationSettingDefinition> callback);

    DeviceManagementConfigurationSettingDefinition get() throws ClientException;

	void delete(final ICallback<? super DeviceManagementConfigurationSettingDefinition> callback);

	void delete() throws ClientException;

	void patch(final DeviceManagementConfigurationSettingDefinition sourceDeviceManagementConfigurationSettingDefinition, final ICallback<? super DeviceManagementConfigurationSettingDefinition> callback);

	DeviceManagementConfigurationSettingDefinition patch(final DeviceManagementConfigurationSettingDefinition sourceDeviceManagementConfigurationSettingDefinition) throws ClientException;

    IDeviceManagementConfigurationSettingDefinitionWithReferenceRequest select(final String value);

    IDeviceManagementConfigurationSettingDefinitionWithReferenceRequest expand(final String value);

}

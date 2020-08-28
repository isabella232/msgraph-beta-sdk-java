// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceAppManagement;
import com.microsoft.graph.requests.extensions.IManagedEBookCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMobileAppCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IEnterpriseCodeSigningCertificateCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEnterpriseCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosLobAppProvisioningConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedDeviceMobileAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookCategoryCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedEBookCategoryRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IPolicySetRequestBuilder;
import com.microsoft.graph.requests.extensions.ISideLoadingKeyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISideLoadingKeyRequestBuilder;
import com.microsoft.graph.requests.extensions.IVppTokenCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IVppTokenRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IIosManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IAndroidManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDefaultManagedAppProtectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITargetedManagedAppConfigurationRequestBuilder;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IMdmWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppStatusCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagedAppStatusRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionDeviceRegistrationRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionWipeActionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsInformationProtectionWipeActionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementTaskCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDeviceAppManagementTaskRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsDefenderApplicationControlSupplementalPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.ISymantecCodeSigningCertificateRequestBuilder;
import com.microsoft.graph.requests.extensions.IWindowsManagementAppRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device App Management Request Builder.
 */
public interface IDeviceAppManagementRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the IDeviceAppManagementRequest instance
     */
    IDeviceAppManagementRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the IDeviceAppManagementRequest instance
     */
    IDeviceAppManagementRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IManagedEBookCollectionRequestBuilder managedEBooks();

    IManagedEBookRequestBuilder managedEBooks(final String id);

    IMobileAppCollectionRequestBuilder mobileApps();

    IMobileAppRequestBuilder mobileApps(final String id);

    IMobileAppCategoryCollectionRequestBuilder mobileAppCategories();

    IMobileAppCategoryRequestBuilder mobileAppCategories(final String id);

    IEnterpriseCodeSigningCertificateCollectionRequestBuilder enterpriseCodeSigningCertificates();

    IEnterpriseCodeSigningCertificateRequestBuilder enterpriseCodeSigningCertificates(final String id);

    IIosLobAppProvisioningConfigurationCollectionRequestBuilder iosLobAppProvisioningConfigurations();

    IIosLobAppProvisioningConfigurationRequestBuilder iosLobAppProvisioningConfigurations(final String id);

    /**
     * Gets the request builder for SymantecCodeSigningCertificate
     *
     * @return the ISymantecCodeSigningCertificateRequestBuilder instance
     */
    ISymantecCodeSigningCertificateRequestBuilder symantecCodeSigningCertificate();

    IManagedDeviceMobileAppConfigurationCollectionRequestBuilder mobileAppConfigurations();

    IManagedDeviceMobileAppConfigurationRequestBuilder mobileAppConfigurations(final String id);

    IManagedEBookCategoryCollectionRequestBuilder managedEBookCategories();

    IManagedEBookCategoryRequestBuilder managedEBookCategories(final String id);

    IPolicySetCollectionRequestBuilder policySets();

    IPolicySetRequestBuilder policySets(final String id);

    ISideLoadingKeyCollectionRequestBuilder sideLoadingKeys();

    ISideLoadingKeyRequestBuilder sideLoadingKeys(final String id);

    IVppTokenCollectionRequestBuilder vppTokens();

    IVppTokenRequestBuilder vppTokens(final String id);

    /**
     * Gets the request builder for WindowsManagementApp
     *
     * @return the IWindowsManagementAppWithReferenceRequestBuilder instance
     */
    IWindowsManagementAppWithReferenceRequestBuilder windowsManagementApp();

    IManagedAppPolicyCollectionRequestBuilder managedAppPolicies();

    IManagedAppPolicyRequestBuilder managedAppPolicies(final String id);

    IIosManagedAppProtectionCollectionRequestBuilder iosManagedAppProtections();

    IIosManagedAppProtectionRequestBuilder iosManagedAppProtections(final String id);

    IAndroidManagedAppProtectionCollectionRequestBuilder androidManagedAppProtections();

    IAndroidManagedAppProtectionRequestBuilder androidManagedAppProtections(final String id);

    IDefaultManagedAppProtectionCollectionRequestBuilder defaultManagedAppProtections();

    IDefaultManagedAppProtectionRequestBuilder defaultManagedAppProtections(final String id);

    ITargetedManagedAppConfigurationCollectionRequestBuilder targetedManagedAppConfigurations();

    ITargetedManagedAppConfigurationRequestBuilder targetedManagedAppConfigurations(final String id);

    IMdmWindowsInformationProtectionPolicyCollectionRequestBuilder mdmWindowsInformationProtectionPolicies();

    IMdmWindowsInformationProtectionPolicyRequestBuilder mdmWindowsInformationProtectionPolicies(final String id);

    IWindowsInformationProtectionPolicyCollectionRequestBuilder windowsInformationProtectionPolicies();

    IWindowsInformationProtectionPolicyRequestBuilder windowsInformationProtectionPolicies(final String id);

    IManagedAppRegistrationCollectionRequestBuilder managedAppRegistrations();

    IManagedAppRegistrationRequestBuilder managedAppRegistrations(final String id);

    IManagedAppStatusCollectionRequestBuilder managedAppStatuses();

    IManagedAppStatusRequestBuilder managedAppStatuses(final String id);

    IWindowsInformationProtectionDeviceRegistrationCollectionRequestBuilder windowsInformationProtectionDeviceRegistrations();

    IWindowsInformationProtectionDeviceRegistrationRequestBuilder windowsInformationProtectionDeviceRegistrations(final String id);

    IWindowsInformationProtectionWipeActionCollectionRequestBuilder windowsInformationProtectionWipeActions();

    IWindowsInformationProtectionWipeActionRequestBuilder windowsInformationProtectionWipeActions(final String id);

    IDeviceAppManagementTaskCollectionRequestBuilder deviceAppManagementTasks();

    IDeviceAppManagementTaskRequestBuilder deviceAppManagementTasks(final String id);

    IWindowsDefenderApplicationControlSupplementalPolicyCollectionRequestBuilder wdacSupplementalPolicies();

    IWindowsDefenderApplicationControlSupplementalPolicyRequestBuilder wdacSupplementalPolicies(final String id);
    IDeviceAppManagementSyncMicrosoftStoreForBusinessAppsRequestBuilder syncMicrosoftStoreForBusinessApps();

}
// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DepOnboardingSetting;
import com.microsoft.graph.requests.extensions.IEnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.EnrollmentProfileCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.EnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IImportedAppleDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedAppleDeviceIdentityCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ImportedAppleDeviceIdentityRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepIOSEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.DepIOSEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.IDepMacOSEnrollmentProfileRequestBuilder;
import com.microsoft.graph.requests.extensions.DepMacOSEnrollmentProfileRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Dep Onboarding Setting Request.
 */
public class DepOnboardingSettingRequest extends BaseRequest implements IDepOnboardingSettingRequest {
	
    /**
     * The request for the DepOnboardingSetting
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DepOnboardingSettingRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DepOnboardingSetting.class);
    }

    /**
     * Gets the DepOnboardingSetting from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<DepOnboardingSetting> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DepOnboardingSetting from the service
     *
     * @return the DepOnboardingSetting from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DepOnboardingSetting get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<DepOnboardingSetting> callback) {
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
     * Patches this DepOnboardingSetting with a source
     *
     * @param sourceDepOnboardingSetting the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DepOnboardingSetting sourceDepOnboardingSetting, final ICallback<DepOnboardingSetting> callback) {
        send(HttpMethod.PATCH, callback, sourceDepOnboardingSetting);
    }

    /**
     * Patches this DepOnboardingSetting with a source
     *
     * @param sourceDepOnboardingSetting the source object with updates
     * @return the updated DepOnboardingSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DepOnboardingSetting patch(final DepOnboardingSetting sourceDepOnboardingSetting) throws ClientException {
        return send(HttpMethod.PATCH, sourceDepOnboardingSetting);
    }

    /**
     * Creates a DepOnboardingSetting with a new object
     *
     * @param newDepOnboardingSetting the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DepOnboardingSetting newDepOnboardingSetting, final ICallback<DepOnboardingSetting> callback) {
        send(HttpMethod.POST, callback, newDepOnboardingSetting);
    }

    /**
     * Creates a DepOnboardingSetting with a new object
     *
     * @param newDepOnboardingSetting the new object to create
     * @return the created DepOnboardingSetting
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DepOnboardingSetting post(final DepOnboardingSetting newDepOnboardingSetting) throws ClientException {
        return send(HttpMethod.POST, newDepOnboardingSetting);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDepOnboardingSettingRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DepOnboardingSettingRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDepOnboardingSettingRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DepOnboardingSettingRequest)this;
     }

}


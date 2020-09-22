// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Dep Onboarding Setting Sync With Apple Device Enrollment Program Request.
 */
public interface IDepOnboardingSettingSyncWithAppleDeviceEnrollmentProgramRequest extends IHttpRequest {

    /**
     * Creates the DepOnboardingSettingSyncWithAppleDeviceEnrollmentProgram
     *
     * @param callback the callback to be called after success or failure
     */
    void post(final ICallback<Void> callback);

    /**
     * Creates the DepOnboardingSettingSyncWithAppleDeviceEnrollmentProgram
     *
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    void post() throws ClientException;

}

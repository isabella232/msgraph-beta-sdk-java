// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IWindowsUpdateForBusinessConfigurationExtendFeatureUpdatesPauseRequest;

import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.concurrency.IExecutors;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Windows Update For Business Configuration Extend Feature Updates Pause Request.
 */
public interface IWindowsUpdateForBusinessConfigurationExtendFeatureUpdatesPauseRequest {

    /**
     * Creates the WindowsUpdateForBusinessConfigurationExtendFeatureUpdatesPause
     *
     * @param callback the callback to be called after success or failure
     */
    void post(final ICallback<Void> callback);

    /**
     * Creates the WindowsUpdateForBusinessConfigurationExtendFeatureUpdatesPause
     *
     * @throws ClientException an exception occurs if there was an error while the request was sent
     */
    void post() throws ClientException;

}

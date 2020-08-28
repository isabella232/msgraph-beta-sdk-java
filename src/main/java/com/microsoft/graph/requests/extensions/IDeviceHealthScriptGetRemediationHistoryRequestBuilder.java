// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceHealthScriptGetRemediationHistoryRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Device Health Script Get Remediation History Request Builder.
 */
public interface IDeviceHealthScriptGetRemediationHistoryRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IDeviceHealthScriptGetRemediationHistoryRequest
     *
     * @return the IDeviceHealthScriptGetRemediationHistoryRequest instance
     */
    IDeviceHealthScriptGetRemediationHistoryRequest buildRequest();

    /**
     * Creates the IDeviceHealthScriptGetRemediationHistoryRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IDeviceHealthScriptGetRemediationHistoryRequest instance
     */
    IDeviceHealthScriptGetRemediationHistoryRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

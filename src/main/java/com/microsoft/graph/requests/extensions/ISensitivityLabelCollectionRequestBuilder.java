// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.SensitivityLabel;
import com.microsoft.graph.models.extensions.DiscoveredSensitiveType;
import com.microsoft.graph.models.extensions.CurrentLabel;
import com.microsoft.graph.models.extensions.EvaluateLabelJobResponse;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.ISensitivityLabelRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitivityLabelCollectionRequest;
import com.microsoft.graph.requests.extensions.ISensitivityLabelEvaluateRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Sensitivity Label Collection Request Builder.
 */
public interface ISensitivityLabelCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    ISensitivityLabelCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    ISensitivityLabelCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    ISensitivityLabelRequestBuilder byId(final String id);

    ISensitivityLabelEvaluateRequestBuilder evaluate(final java.util.List<DiscoveredSensitiveType> discoveredSensitiveTypes, final CurrentLabel currentLabel);
}

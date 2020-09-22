// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.InformationProtection;
import com.microsoft.graph.models.extensions.DataLossPreventionPolicy;
import com.microsoft.graph.models.extensions.DlpEvaluationInput;
import com.microsoft.graph.models.extensions.DlpNotification;
import com.microsoft.graph.models.extensions.DlpEvaluatePoliciesJobResponse;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IDataLossPreventionPolicyRequestBuilder;
import com.microsoft.graph.requests.extensions.IDataLossPreventionPolicyCollectionRequest;
import com.microsoft.graph.requests.extensions.IDataLossPreventionPolicyEvaluateRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Data Loss Prevention Policy Collection Request Builder.
 */
public interface IDataLossPreventionPolicyCollectionRequestBuilder extends IRequestBuilder {

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IDataLossPreventionPolicyCollectionRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the request
     *
     * @param requestOptions the options for this request
     * @return the IUserRequest instance
     */
    IDataLossPreventionPolicyCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IDataLossPreventionPolicyRequestBuilder byId(final String id);

    IDataLossPreventionPolicyEvaluateRequestBuilder evaluate(final String target, final DlpEvaluationInput evaluationInput, final DlpNotification notificationInfo);
}

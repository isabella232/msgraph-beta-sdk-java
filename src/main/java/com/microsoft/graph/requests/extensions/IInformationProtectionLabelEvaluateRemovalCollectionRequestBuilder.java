// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.DowngradeJustification;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IInformationProtectionLabelEvaluateRemovalCollectionRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Information Protection Label Evaluate Removal Collection Request Builder.
 */
public interface IInformationProtectionLabelEvaluateRemovalCollectionRequestBuilder extends IRequestBuilder {

    IInformationProtectionLabelEvaluateRemovalCollectionRequest buildRequest();

    IInformationProtectionLabelEvaluateRemovalCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

}

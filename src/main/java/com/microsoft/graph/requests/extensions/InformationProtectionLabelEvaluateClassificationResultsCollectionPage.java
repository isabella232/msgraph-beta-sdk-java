// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ContentInfo;
import com.microsoft.graph.models.extensions.ClassificationResult;
import com.microsoft.graph.models.extensions.InformationProtectionAction;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IInformationProtectionLabelEvaluateClassificationResultsCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelEvaluateClassificationResultsCollectionPage;
import com.microsoft.graph.requests.extensions.InformationProtectionLabelEvaluateClassificationResultsCollectionResponse;
import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.BaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Information Protection Label Evaluate Classification Results Collection Page.
 */
public class InformationProtectionLabelEvaluateClassificationResultsCollectionPage extends BaseCollectionPage<InformationProtectionAction, IInformationProtectionLabelEvaluateClassificationResultsCollectionRequestBuilder> implements IInformationProtectionLabelEvaluateClassificationResultsCollectionPage {

    /**
     * A collection page for InformationProtectionAction.
     *
     * @param response The serialized InformationProtectionLabelEvaluateClassificationResultsCollectionResponse from the service
     * @param builder The request builder for the next collection page
     */
    public InformationProtectionLabelEvaluateClassificationResultsCollectionPage(final InformationProtectionLabelEvaluateClassificationResultsCollectionResponse response, final IInformationProtectionLabelEvaluateClassificationResultsCollectionRequestBuilder builder) {
       super(response.value, builder);
    }
}
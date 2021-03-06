// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.models.extensions.RiskDetection;
import com.microsoft.graph.requests.extensions.IRiskDetectionCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.requests.extensions.RiskDetectionCollectionPage;
import com.microsoft.graph.requests.extensions.RiskDetectionCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Risk Detection Collection Page.
 */
public class RiskDetectionCollectionPage extends BaseCollectionPage<RiskDetection, IRiskDetectionCollectionRequestBuilder> implements IRiskDetectionCollectionPage {

    /**
     * A collection page for RiskDetection
     *
     * @param response the serialized RiskDetectionCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public RiskDetectionCollectionPage(final RiskDetectionCollectionResponse response, final IRiskDetectionCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}

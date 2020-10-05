// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.callrecords.requests.extensions;
import com.microsoft.graph.callrecords.models.extensions.Segment;
import com.microsoft.graph.callrecords.requests.extensions.ISegmentCollectionRequestBuilder;
import com.microsoft.graph.http.BaseCollectionPage;
import com.microsoft.graph.callrecords.requests.extensions.SegmentCollectionPage;
import com.microsoft.graph.callrecords.requests.extensions.SegmentCollectionResponse;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Segment Collection Page.
 */
public class SegmentCollectionPage extends BaseCollectionPage<Segment, ISegmentCollectionRequestBuilder> implements ISegmentCollectionPage {

    /**
     * A collection page for Segment
     *
     * @param response the serialized SegmentCollectionResponse from the service
     * @param builder  the request builder for the next collection page
     */
    public SegmentCollectionPage(final SegmentCollectionResponse response, final ISegmentCollectionRequestBuilder builder) {
        super(response.value, builder, response.additionalDataManager());
    }
}

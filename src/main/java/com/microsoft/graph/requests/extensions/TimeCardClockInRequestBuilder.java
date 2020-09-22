// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.ITimeCardClockInRequest;
import com.microsoft.graph.requests.extensions.TimeCardClockInRequest;
import com.microsoft.graph.models.extensions.ItemBody;
import com.microsoft.graph.models.extensions.TimeCard;
import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Time Card Clock In Request Builder.
 */
public class TimeCardClockInRequestBuilder extends BaseActionRequestBuilder implements ITimeCardClockInRequestBuilder {

    /**
     * The request builder for this TimeCardClockIn
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param atApprovedLocation the atApprovedLocation
     * @param onBehalfOfUserId the onBehalfOfUserId
     * @param notes the notes
     */
    public TimeCardClockInRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final Boolean atApprovedLocation, final String onBehalfOfUserId, final ItemBody notes) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("atApprovedLocation", atApprovedLocation);
        bodyParams.put("onBehalfOfUserId", onBehalfOfUserId);
        bodyParams.put("notes", notes);
    }

    /**
     * Creates the ITimeCardClockInRequest
     *
     * @param requestOptions the options for the request
     * @return the ITimeCardClockInRequest instance
     */
    public ITimeCardClockInRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the ITimeCardClockInRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the ITimeCardClockInRequest instance
     */
    public ITimeCardClockInRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        TimeCardClockInRequest request = new TimeCardClockInRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("atApprovedLocation")) {
            request.body.atApprovedLocation = getParameter("atApprovedLocation");
        }

        if (hasParameter("onBehalfOfUserId")) {
            request.body.onBehalfOfUserId = getParameter("onBehalfOfUserId");
        }

        if (hasParameter("notes")) {
            request.body.notes = getParameter("notes");
        }

        return request;
    }
}

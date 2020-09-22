// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IDeviceManagementReportsGetDeviceNonComplianceReportRequest;
import com.microsoft.graph.requests.extensions.DeviceManagementReportsGetDeviceNonComplianceReportRequest;

import com.microsoft.graph.core.BaseActionRequestBuilder;
import com.microsoft.graph.core.BaseFunctionRequestBuilder;
import com.microsoft.graph.core.IBaseClient;
import com.google.gson.JsonElement;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Device Management Reports Get Device Non Compliance Report Request Builder.
 */
public class DeviceManagementReportsGetDeviceNonComplianceReportRequestBuilder extends BaseActionRequestBuilder implements IDeviceManagementReportsGetDeviceNonComplianceReportRequestBuilder {

    /**
     * The request builder for this DeviceManagementReportsGetDeviceNonComplianceReport
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     * @param name the name
     * @param select the select
     * @param search the search
     * @param groupBy the groupBy
     * @param orderBy the orderBy
     * @param skip the skip
     * @param top the top
     * @param sessionId the sessionId
     * @param filter the filter
     */
    public DeviceManagementReportsGetDeviceNonComplianceReportRequestBuilder(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions, final String name, final java.util.List<String> select, final String search, final java.util.List<String> groupBy, final java.util.List<String> orderBy, final Integer skip, final Integer top, final String sessionId, final String filter) {
        super(requestUrl, client, requestOptions);
        bodyParams.put("name", name);
        bodyParams.put("select", select);
        bodyParams.put("search", search);
        bodyParams.put("groupBy", groupBy);
        bodyParams.put("orderBy", orderBy);
        bodyParams.put("skip", skip);
        bodyParams.put("top", top);
        bodyParams.put("sessionId", sessionId);
        bodyParams.put("filter", filter);
    }

    /**
     * Creates the IDeviceManagementReportsGetDeviceNonComplianceReportRequest
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetDeviceNonComplianceReportRequest instance
     */
    public IDeviceManagementReportsGetDeviceNonComplianceReportRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions) {
        return buildRequest(getOptions(requestOptions));
    }

    /**
     * Creates the IDeviceManagementReportsGetDeviceNonComplianceReportRequest with specific requestOptions instead of the existing requestOptions
     *
     * @param requestOptions the options for the request
     * @return the IDeviceManagementReportsGetDeviceNonComplianceReportRequest instance
     */
    public IDeviceManagementReportsGetDeviceNonComplianceReportRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        DeviceManagementReportsGetDeviceNonComplianceReportRequest request = new DeviceManagementReportsGetDeviceNonComplianceReportRequest(
                getRequestUrl(),
                getClient(),
                requestOptions
        );

        if (hasParameter("name")) {
            request.body.name = getParameter("name");
        }

        if (hasParameter("select")) {
            request.body.select = getParameter("select");
        }

        if (hasParameter("search")) {
            request.body.search = getParameter("search");
        }

        if (hasParameter("groupBy")) {
            request.body.groupBy = getParameter("groupBy");
        }

        if (hasParameter("orderBy")) {
            request.body.orderBy = getParameter("orderBy");
        }

        if (hasParameter("skip")) {
            request.body.skip = getParameter("skip");
        }

        if (hasParameter("top")) {
            request.body.top = getParameter("top");
        }

        if (hasParameter("sessionId")) {
            request.body.sessionId = getParameter("sessionId");
        }

        if (hasParameter("filter")) {
            request.body.filter = getParameter("filter");
        }

        return request;
    }
}

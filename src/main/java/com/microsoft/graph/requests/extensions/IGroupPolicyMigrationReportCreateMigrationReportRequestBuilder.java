// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;
import com.microsoft.graph.requests.extensions.IGroupPolicyMigrationReportCreateMigrationReportRequest;

import com.microsoft.graph.http.IRequestBuilder;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Group Policy Migration Report Create Migration Report Request Builder.
 */
public interface IGroupPolicyMigrationReportCreateMigrationReportRequestBuilder extends IRequestBuilder {

    /**
     * Creates the IGroupPolicyMigrationReportCreateMigrationReportRequest
     *
     * @param requestOptions the options for the request
     * @return the IGroupPolicyMigrationReportCreateMigrationReportRequest instance
     */
    IGroupPolicyMigrationReportCreateMigrationReportRequest buildRequest(final com.microsoft.graph.options.Option... requestOptions);

    /**
     * Creates the IGroupPolicyMigrationReportCreateMigrationReportRequest with specific options instead of the existing options
     *
     * @param requestOptions the options for the request
     * @return the IGroupPolicyMigrationReportCreateMigrationReportRequest instance
     */
    IGroupPolicyMigrationReportCreateMigrationReportRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);
}

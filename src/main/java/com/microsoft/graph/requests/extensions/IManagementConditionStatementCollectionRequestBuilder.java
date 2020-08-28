// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DeviceManagement;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.ManagementConditionExpressionString;
import com.microsoft.graph.models.generated.DevicePlatformType;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.requests.extensions.IManagementConditionStatementRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementCollectionRequest;
import com.microsoft.graph.requests.extensions.IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Management Condition Statement Collection Request Builder.
 */
public interface IManagementConditionStatementCollectionRequestBuilder extends IRequestBuilder {

    IManagementConditionStatementCollectionRequest buildRequest();

    IManagementConditionStatementCollectionRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);

    IManagementConditionStatementRequestBuilder byId(final String id);


    IManagementConditionStatementGetManagementConditionStatementsForPlatformCollectionRequestBuilder getManagementConditionStatementsForPlatform(final DevicePlatformType platform);
}

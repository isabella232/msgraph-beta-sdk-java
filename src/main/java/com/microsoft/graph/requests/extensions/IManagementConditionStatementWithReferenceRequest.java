// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.models.extensions.ManagementConditionExpressionString;
import com.microsoft.graph.models.generated.DevicePlatformType;
import com.microsoft.graph.requests.extensions.IManagementConditionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IManagementConditionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.models.extensions.ManagementConditionStatement;
import com.microsoft.graph.http.IHttpRequest;
import com.microsoft.graph.serializer.IJsonBackedObject;


// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Management Condition Statement With Reference Request.
 */
public interface IManagementConditionStatementWithReferenceRequest extends IHttpRequest {

    void post(final ManagementConditionStatement newManagementConditionStatement, final IJsonBackedObject payload, final ICallback<ManagementConditionStatement> callback);

    ManagementConditionStatement post(final ManagementConditionStatement newManagementConditionStatement, final IJsonBackedObject payload) throws ClientException;

    void get(final ICallback<ManagementConditionStatement> callback);

    ManagementConditionStatement get() throws ClientException;

	void delete(final ICallback<ManagementConditionStatement> callback);

	void delete() throws ClientException;

	void patch(final ManagementConditionStatement sourceManagementConditionStatement, final ICallback<ManagementConditionStatement> callback);

	ManagementConditionStatement patch(final ManagementConditionStatement sourceManagementConditionStatement) throws ClientException;

    IManagementConditionStatementWithReferenceRequest select(final String value);

    IManagementConditionStatementWithReferenceRequest expand(final String value);

}
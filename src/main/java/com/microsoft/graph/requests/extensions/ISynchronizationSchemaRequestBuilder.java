// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.SynchronizationSchema;
import com.microsoft.graph.models.extensions.ExpressionInputObject;
import com.microsoft.graph.models.extensions.AttributeDefinition;
import com.microsoft.graph.models.extensions.ParseExpressionResponse;
import com.microsoft.graph.models.extensions.AttributeMappingFunctionSchema;
import com.microsoft.graph.models.extensions.FilterOperatorSchema;
import com.microsoft.graph.requests.extensions.IDirectoryDefinitionCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IDirectoryDefinitionRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Synchronization Schema Request Builder.
 */
public interface ISynchronizationSchemaRequestBuilder extends IRequestBuilder {
    /**
     * Creates the request
     *
     * @return the ISynchronizationSchemaRequest instance
     */
    ISynchronizationSchemaRequest buildRequest();

    /**
     * Creates the request with specific options instead of the existing options
     *
     * @param requestOptions the options for this request
     * @return the ISynchronizationSchemaRequest instance
     */
    ISynchronizationSchemaRequest buildRequest(final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions);


    IDirectoryDefinitionCollectionRequestBuilder directories();

    IDirectoryDefinitionRequestBuilder directories(final String id);
    ISynchronizationSchemaParseExpressionRequestBuilder parseExpression(final String expression, final ExpressionInputObject testInputObject, final AttributeDefinition targetAttributeDefinition);

    ISynchronizationSchemaFunctionsCollectionRequestBuilder functions();

    ISynchronizationSchemaFilterOperatorsCollectionRequestBuilder filterOperators();

}
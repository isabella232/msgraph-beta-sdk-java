// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.RbacApplicationMultiple;
import com.microsoft.graph.models.extensions.UnifiedRoleDefinition;
import java.util.Arrays;
import java.util.EnumSet;

import com.microsoft.graph.http.IBaseCollectionPage;
import com.microsoft.graph.http.IHttpRequest;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Unified Role Definition Collection Request.
 */
public interface IUnifiedRoleDefinitionCollectionRequest extends IHttpRequest {

    void get(final ICallback<IUnifiedRoleDefinitionCollectionPage> callback);

    IUnifiedRoleDefinitionCollectionPage get() throws ClientException;

    void post(final UnifiedRoleDefinition newUnifiedRoleDefinition, final ICallback<UnifiedRoleDefinition> callback);

    UnifiedRoleDefinition post(final UnifiedRoleDefinition newUnifiedRoleDefinition) throws ClientException;

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
    IUnifiedRoleDefinitionCollectionRequest expand(final String value);

    /**
     * Sets the filter clause for the request
     *
     * @param value the filter clause
     * @return the updated request
     */
    IUnifiedRoleDefinitionCollectionRequest filter(final String value);

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
    IUnifiedRoleDefinitionCollectionRequest select(final String value);

    /**
     * Sets the top value for the request
     *
     * @param value the max number of items to return
     * @return the updated request
     */
    IUnifiedRoleDefinitionCollectionRequest top(final int value);

    /**
     * Sets the skip value for the request
     *
     * @param value of the number of items to skip
     * @return the updated request
     */
    IUnifiedRoleDefinitionCollectionRequest skip(final int value);

    /**
	 * Sets the skip token value for the request
	 * 
	 * @param skipToken value for pagination
     *
	 * @return the updated request
	 */
	IUnifiedRoleDefinitionCollectionRequest skipToken(String skipToken);
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.Synchronization;
import com.microsoft.graph.models.extensions.SynchronizationJob;
import com.microsoft.graph.models.extensions.SynchronizationJobApplicationParameters;
import com.microsoft.graph.models.extensions.StringKeyStringValuePair;
import com.microsoft.graph.models.extensions.SynchronizationJobRestartCriteria;
import com.microsoft.graph.models.extensions.SynchronizationSecretKeyStringValuePair;
import java.util.Arrays;
import java.util.EnumSet;

import com.google.gson.JsonObject;
import com.microsoft.graph.requests.extensions.ISynchronizationJobCollectionRequestBuilder;
import com.microsoft.graph.http.IBaseCollectionPage;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The interface for the Synchronization Job Collection Page.
 */
public interface ISynchronizationJobCollectionPage extends IBaseCollectionPage<SynchronizationJob, ISynchronizationJobCollectionRequestBuilder> {
}

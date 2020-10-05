// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.requests.extensions;

import com.microsoft.graph.http.IRequestBuilder;
import com.microsoft.graph.core.ClientException;
import com.microsoft.graph.concurrency.ICallback;
import com.microsoft.graph.models.extensions.DataClassificationService;
import com.microsoft.graph.models.extensions.ContentClassification;
import com.microsoft.graph.models.extensions.ExactMatchClassificationResult;
import com.microsoft.graph.requests.extensions.IExactMatchDataStoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchDataStoreRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchDataStoreCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchDataStoreRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IFileClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.FileClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.FileClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.IJobResponseBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IJobResponseBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.JobResponseBaseCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.JobResponseBaseRequestBuilder;
import com.microsoft.graph.requests.extensions.ITextClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ITextClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.TextClassificationRequestCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.TextClassificationRequestRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitiveTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitiveTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.SensitiveTypeCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SensitiveTypeRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitivityLabelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ISensitivityLabelRequestBuilder;
import com.microsoft.graph.requests.extensions.SensitivityLabelCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.SensitivityLabelRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.IExactMatchUploadAgentRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchUploadAgentCollectionRequestBuilder;
import com.microsoft.graph.requests.extensions.ExactMatchUploadAgentRequestBuilder;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.core.IBaseClient;
import com.microsoft.graph.http.BaseRequest;
import com.microsoft.graph.http.HttpMethod;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Data Classification Service Request.
 */
public class DataClassificationServiceRequest extends BaseRequest implements IDataClassificationServiceRequest {
	
    /**
     * The request for the DataClassificationService
     *
     * @param requestUrl     the request URL
     * @param client         the service client
     * @param requestOptions the options for this request
     */
    public DataClassificationServiceRequest(final String requestUrl, final IBaseClient client, final java.util.List<? extends com.microsoft.graph.options.Option> requestOptions) {
        super(requestUrl, client, requestOptions, DataClassificationService.class);
    }

    /**
     * Gets the DataClassificationService from the service
     *
     * @param callback the callback to be called after success or failure
     */
    public void get(final ICallback<? super DataClassificationService> callback) {
        send(HttpMethod.GET, callback, null);
    }

    /**
     * Gets the DataClassificationService from the service
     *
     * @return the DataClassificationService from the request
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataClassificationService get() throws ClientException {
       return send(HttpMethod.GET, null);
    }

    /**
     * Delete this item from the service
     *
     * @param callback the callback when the deletion action has completed
     */
    public void delete(final ICallback<? super DataClassificationService> callback) {
        send(HttpMethod.DELETE, callback, null);
    }

    /**
     * Delete this item from the service
     *
     * @throws ClientException if there was an exception during the delete operation
     */
    public void delete() throws ClientException {
        send(HttpMethod.DELETE, null);
    }

    /**
     * Patches this DataClassificationService with a source
     *
     * @param sourceDataClassificationService the source object with updates
     * @param callback the callback to be called after success or failure
     */
    public void patch(final DataClassificationService sourceDataClassificationService, final ICallback<? super DataClassificationService> callback) {
        send(HttpMethod.PATCH, callback, sourceDataClassificationService);
    }

    /**
     * Patches this DataClassificationService with a source
     *
     * @param sourceDataClassificationService the source object with updates
     * @return the updated DataClassificationService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataClassificationService patch(final DataClassificationService sourceDataClassificationService) throws ClientException {
        return send(HttpMethod.PATCH, sourceDataClassificationService);
    }

    /**
     * Creates a DataClassificationService with a new object
     *
     * @param newDataClassificationService the new object to create
     * @param callback the callback to be called after success or failure
     */
    public void post(final DataClassificationService newDataClassificationService, final ICallback<? super DataClassificationService> callback) {
        send(HttpMethod.POST, callback, newDataClassificationService);
    }

    /**
     * Creates a DataClassificationService with a new object
     *
     * @param newDataClassificationService the new object to create
     * @return the created DataClassificationService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataClassificationService post(final DataClassificationService newDataClassificationService) throws ClientException {
        return send(HttpMethod.POST, newDataClassificationService);
    }

    /**
     * Creates a DataClassificationService with a new object
     *
     * @param newDataClassificationService the object to create/update
     * @param callback the callback to be called after success or failure
     */
    public void put(final DataClassificationService newDataClassificationService, final ICallback<? super DataClassificationService> callback) {
        send(HttpMethod.PUT, callback, newDataClassificationService);
    }

    /**
     * Creates a DataClassificationService with a new object
     *
     * @param newDataClassificationService the object to create/update
     * @return the created DataClassificationService
     * @throws ClientException this exception occurs if the request was unable to complete for any reason
     */
    public DataClassificationService put(final DataClassificationService newDataClassificationService) throws ClientException {
        return send(HttpMethod.PUT, newDataClassificationService);
    }

    /**
     * Sets the select clause for the request
     *
     * @param value the select clause
     * @return the updated request
     */
     public IDataClassificationServiceRequest select(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$select", value));
         return (DataClassificationServiceRequest)this;
     }

    /**
     * Sets the expand clause for the request
     *
     * @param value the expand clause
     * @return the updated request
     */
     public IDataClassificationServiceRequest expand(final String value) {
         getQueryOptions().add(new com.microsoft.graph.options.QueryOption("$expand", value));
         return (DataClassificationServiceRequest)this;
     }

}


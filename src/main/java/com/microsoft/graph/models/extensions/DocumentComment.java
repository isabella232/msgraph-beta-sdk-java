// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.DocumentCommentReply;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.DocumentCommentReplyCollectionResponse;
import com.microsoft.graph.requests.extensions.DocumentCommentReplyCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Document Comment.
 */
public class DocumentComment extends Entity implements IJsonBackedObject {


    /**
     * The Content.
     * 
     */
    @SerializedName("content")
    @Expose
    public String content;

    /**
     * The Replies.
     * 
     */
    @SerializedName("replies")
    @Expose
    public DocumentCommentReplyCollectionPage replies;


    /**
     * The raw representation of this class
     */
    private JsonObject rawObject;

    /**
     * The serializer
     */
    private ISerializer serializer;

    /**
     * Gets the raw representation of this class
     *
     * @return the raw representation of this class
     */
    public JsonObject getRawObject() {
        return rawObject;
    }

    /**
     * Gets serializer
     *
     * @return the serializer
     */
    protected ISerializer getSerializer() {
        return serializer;
    }

    /**
     * Sets the raw JSON object
     *
     * @param serializer the serializer
     * @param json the JSON object to set this object to
     */
    public void setRawObject(final ISerializer serializer, final JsonObject json) {
        this.serializer = serializer;
        rawObject = json;


        if (json.has("replies")) {
            final DocumentCommentReplyCollectionResponse response = new DocumentCommentReplyCollectionResponse();
            if (json.has("replies@odata.nextLink")) {
                response.nextLink = json.get("replies@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("replies").toString(), JsonObject[].class);
            final DocumentCommentReply[] array = new DocumentCommentReply[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), DocumentCommentReply.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            replies = new DocumentCommentReplyCollectionPage(response, null);
        }
    }
}

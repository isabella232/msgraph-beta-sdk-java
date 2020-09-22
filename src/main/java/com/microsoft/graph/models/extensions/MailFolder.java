// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.MailFolder;
import com.microsoft.graph.models.extensions.MessageRule;
import com.microsoft.graph.models.extensions.Message;
import com.microsoft.graph.models.extensions.MultiValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.SingleValueLegacyExtendedProperty;
import com.microsoft.graph.models.extensions.UserConfiguration;
import com.microsoft.graph.models.extensions.Entity;
import com.microsoft.graph.requests.extensions.MailFolderCollectionResponse;
import com.microsoft.graph.requests.extensions.MailFolderCollectionPage;
import com.microsoft.graph.requests.extensions.MessageRuleCollectionResponse;
import com.microsoft.graph.requests.extensions.MessageRuleCollectionPage;
import com.microsoft.graph.requests.extensions.MessageCollectionResponse;
import com.microsoft.graph.requests.extensions.MessageCollectionPage;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.requests.extensions.MultiValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionResponse;
import com.microsoft.graph.requests.extensions.SingleValueLegacyExtendedPropertyCollectionPage;
import com.microsoft.graph.requests.extensions.UserConfigurationCollectionResponse;
import com.microsoft.graph.requests.extensions.UserConfigurationCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mail Folder.
 */
public class MailFolder extends Entity implements IJsonBackedObject {


    /**
     * The Child Folder Count.
     * The number of immediate child mailFolders in the current mailFolder.
     */
    @SerializedName("childFolderCount")
    @Expose
    public Integer childFolderCount;

    /**
     * The Display Name.
     * The mailFolder's display name.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Parent Folder Id.
     * The unique identifier for the mailFolder's parent mailFolder.
     */
    @SerializedName("parentFolderId")
    @Expose
    public String parentFolderId;

    /**
     * The Total Item Count.
     * The number of items in the mailFolder.
     */
    @SerializedName("totalItemCount")
    @Expose
    public Integer totalItemCount;

    /**
     * The Unread Item Count.
     * The number of items in the mailFolder marked as unread.
     */
    @SerializedName("unreadItemCount")
    @Expose
    public Integer unreadItemCount;

    /**
     * The Well Known Name.
     * 
     */
    @SerializedName("wellKnownName")
    @Expose
    public String wellKnownName;

    /**
     * The Child Folders.
     * The collection of child folders in the mailFolder.
     */
    @SerializedName("childFolders")
    @Expose
    public MailFolderCollectionPage childFolders;

    /**
     * The Message Rules.
     * The collection of rules that apply to the user's Inbox folder.
     */
    @SerializedName("messageRules")
    @Expose
    public MessageRuleCollectionPage messageRules;

    /**
     * The Messages.
     * The collection of messages in the mailFolder.
     */
    @SerializedName("messages")
    @Expose
    public MessageCollectionPage messages;

    /**
     * The Multi Value Extended Properties.
     * The collection of multi-value extended properties defined for the mailFolder. Read-only. Nullable.
     */
    @SerializedName("multiValueExtendedProperties")
    @Expose
    public MultiValueLegacyExtendedPropertyCollectionPage multiValueExtendedProperties;

    /**
     * The Single Value Extended Properties.
     * The collection of single-value extended properties defined for the mailFolder. Read-only. Nullable.
     */
    @SerializedName("singleValueExtendedProperties")
    @Expose
    public SingleValueLegacyExtendedPropertyCollectionPage singleValueExtendedProperties;

    /**
     * The User Configurations.
     * 
     */
    @SerializedName("userConfigurations")
    @Expose
    public UserConfigurationCollectionPage userConfigurations;


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


        if (json.has("childFolders")) {
            final MailFolderCollectionResponse response = new MailFolderCollectionResponse();
            if (json.has("childFolders@odata.nextLink")) {
                response.nextLink = json.get("childFolders@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("childFolders").toString(), JsonObject[].class);
            final MailFolder[] array = new MailFolder[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MailFolder.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            childFolders = new MailFolderCollectionPage(response, null);
        }

        if (json.has("messageRules")) {
            final MessageRuleCollectionResponse response = new MessageRuleCollectionResponse();
            if (json.has("messageRules@odata.nextLink")) {
                response.nextLink = json.get("messageRules@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("messageRules").toString(), JsonObject[].class);
            final MessageRule[] array = new MessageRule[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MessageRule.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            messageRules = new MessageRuleCollectionPage(response, null);
        }

        if (json.has("messages")) {
            final MessageCollectionResponse response = new MessageCollectionResponse();
            if (json.has("messages@odata.nextLink")) {
                response.nextLink = json.get("messages@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("messages").toString(), JsonObject[].class);
            final Message[] array = new Message[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), Message.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            messages = new MessageCollectionPage(response, null);
        }

        if (json.has("multiValueExtendedProperties")) {
            final MultiValueLegacyExtendedPropertyCollectionResponse response = new MultiValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("multiValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("multiValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("multiValueExtendedProperties").toString(), JsonObject[].class);
            final MultiValueLegacyExtendedProperty[] array = new MultiValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), MultiValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            multiValueExtendedProperties = new MultiValueLegacyExtendedPropertyCollectionPage(response, null);
        }

        if (json.has("singleValueExtendedProperties")) {
            final SingleValueLegacyExtendedPropertyCollectionResponse response = new SingleValueLegacyExtendedPropertyCollectionResponse();
            if (json.has("singleValueExtendedProperties@odata.nextLink")) {
                response.nextLink = json.get("singleValueExtendedProperties@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("singleValueExtendedProperties").toString(), JsonObject[].class);
            final SingleValueLegacyExtendedProperty[] array = new SingleValueLegacyExtendedProperty[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), SingleValueLegacyExtendedProperty.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            singleValueExtendedProperties = new SingleValueLegacyExtendedPropertyCollectionPage(response, null);
        }

        if (json.has("userConfigurations")) {
            final UserConfigurationCollectionResponse response = new UserConfigurationCollectionResponse();
            if (json.has("userConfigurations@odata.nextLink")) {
                response.nextLink = json.get("userConfigurations@odata.nextLink").getAsString();
            }

            final JsonObject[] sourceArray = serializer.deserializeObject(json.get("userConfigurations").toString(), JsonObject[].class);
            final UserConfiguration[] array = new UserConfiguration[sourceArray.length];
            for (int i = 0; i < sourceArray.length; i++) {
                array[i] = serializer.deserializeObject(sourceArray[i].toString(), UserConfiguration.class);
                array[i].setRawObject(serializer, sourceArray[i]);
            }
            response.value = Arrays.asList(array);
            userConfigurations = new UserConfigurationCollectionPage(response, null);
        }
    }
}

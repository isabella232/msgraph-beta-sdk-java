// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.Arrays;
import java.util.EnumSet;
import com.microsoft.graph.models.generated.AndroidDeviceOwnerEnrollmentMode;
import com.microsoft.graph.models.extensions.MimeContent;
import com.microsoft.graph.models.extensions.Entity;


import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;
import java.util.Map;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Android Device Owner Enrollment Profile.
 */
public class AndroidDeviceOwnerEnrollmentProfile extends Entity implements IJsonBackedObject {


    /**
     * The Account Id.
     * Tenant GUID the enrollment profile belongs to.
     */
    @SerializedName("accountId")
    @Expose
    public String accountId;

    /**
     * The Display Name.
     * Display name for the enrollment profile.
     */
    @SerializedName("displayName")
    @Expose
    public String displayName;

    /**
     * The Description.
     * Description for the enrollment profile.
     */
    @SerializedName("description")
    @Expose
    public String description;

    /**
     * The Enrollment Mode.
     * The enrollment mode of devices that use this enrollment profile.
     */
    @SerializedName("enrollmentMode")
    @Expose
    public AndroidDeviceOwnerEnrollmentMode enrollmentMode;

    /**
     * The Created Date Time.
     * Date time the enrollment profile was created.
     */
    @SerializedName("createdDateTime")
    @Expose
    public java.util.Calendar createdDateTime;

    /**
     * The Last Modified Date Time.
     * Date time the enrollment profile was last modified.
     */
    @SerializedName("lastModifiedDateTime")
    @Expose
    public java.util.Calendar lastModifiedDateTime;

    /**
     * The Token Value.
     * Value of the most recently created token for this enrollment profile.
     */
    @SerializedName("tokenValue")
    @Expose
    public String tokenValue;

    /**
     * The Token Creation Date Time.
     * Date time the most recently created token was created.
     */
    @SerializedName("tokenCreationDateTime")
    @Expose
    public java.util.Calendar tokenCreationDateTime;

    /**
     * The Token Expiration Date Time.
     * Date time the most recently created token will expire.
     */
    @SerializedName("tokenExpirationDateTime")
    @Expose
    public java.util.Calendar tokenExpirationDateTime;

    /**
     * The Enrolled Device Count.
     * Total number of Android devices that have enrolled using this enrollment profile.
     */
    @SerializedName("enrolledDeviceCount")
    @Expose
    public Integer enrolledDeviceCount;

    /**
     * The Qr Code Content.
     * String used to generate a QR code for the token.
     */
    @SerializedName("qrCodeContent")
    @Expose
    public String qrCodeContent;

    /**
     * The Qr Code Image.
     * String used to generate a QR code for the token.
     */
    @SerializedName("qrCodeImage")
    @Expose
    public MimeContent qrCodeImage;

    /**
     * The Role Scope Tag Ids.
     * List of Scope Tags for this Entity instance.
     */
    @SerializedName("roleScopeTagIds")
    @Expose
    public java.util.List<String> roleScopeTagIds;


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

    }
}

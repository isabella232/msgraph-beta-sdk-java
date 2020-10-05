// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.VppLicensingType;
import com.microsoft.graph.models.extensions.MacOsVppAppRevokeLicensesActionResult;
import com.microsoft.graph.models.generated.VppTokenAccountType;
import com.microsoft.graph.models.extensions.MacOsVppAppAssignedLicense;
import com.microsoft.graph.models.extensions.MobileApp;
import com.microsoft.graph.requests.extensions.MacOsVppAppAssignedLicenseCollectionPage;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Mac Os Vpp App.
 */
public class MacOsVppApp extends MobileApp implements IJsonBackedObject {


    /**
     * The App Store Url.
     * The store URL.
     */
    @SerializedName("appStoreUrl")
    @Expose
    public String appStoreUrl;

    /**
     * The Bundle Id.
     * The Identity Name.
     */
    @SerializedName("bundleId")
    @Expose
    public String bundleId;

    /**
     * The Licensing Type.
     * The supported License Type.
     */
    @SerializedName("licensingType")
    @Expose
    public VppLicensingType licensingType;

    /**
     * The Release Date Time.
     * The VPP application release date and time.
     */
    @SerializedName("releaseDateTime")
    @Expose
    public java.util.Calendar releaseDateTime;

    /**
     * The Revoke License Action Results.
     * Results of revoke license actions on this app.
     */
    @SerializedName("revokeLicenseActionResults")
    @Expose
    public java.util.List<MacOsVppAppRevokeLicensesActionResult> revokeLicenseActionResults;

    /**
     * The Total License Count.
     * The total number of VPP licenses.
     */
    @SerializedName("totalLicenseCount")
    @Expose
    public Integer totalLicenseCount;

    /**
     * The Used License Count.
     * The number of VPP licenses in use.
     */
    @SerializedName("usedLicenseCount")
    @Expose
    public Integer usedLicenseCount;

    /**
     * The Vpp Token Account Type.
     * The type of volume purchase program which the given Apple Volume Purchase Program Token is associated with. Possible values are: `business`, `education`.
     */
    @SerializedName("vppTokenAccountType")
    @Expose
    public VppTokenAccountType vppTokenAccountType;

    /**
     * The Vpp Token Apple Id.
     * The Apple Id associated with the given Apple Volume Purchase Program Token.
     */
    @SerializedName("vppTokenAppleId")
    @Expose
    public String vppTokenAppleId;

    /**
     * The Vpp Token Id.
     * Identifier of the VPP token associated with this app.
     */
    @SerializedName("vppTokenId")
    @Expose
    public String vppTokenId;

    /**
     * The Vpp Token Organization Name.
     * The organization associated with the Apple Volume Purchase Program Token
     */
    @SerializedName("vppTokenOrganizationName")
    @Expose
    public String vppTokenOrganizationName;

    /**
     * The Assigned Licenses.
     * The licenses assigned to this app.
     */
    @SerializedName("assignedLicenses")
    @Expose
    public MacOsVppAppAssignedLicenseCollectionPage assignedLicenses;


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


        if (json.has("assignedLicenses")) {
            assignedLicenses = serializer.deserializeObject(json.get("assignedLicenses").toString(), MacOsVppAppAssignedLicenseCollectionPage.class);
        }
    }
}

// ------------------------------------------------------------------------------
// Copyright (c) Microsoft Corporation.  All Rights Reserved.  Licensed under the MIT License.  See License in the project root for license information.
// ------------------------------------------------------------------------------

package com.microsoft.graph.models.extensions;
import com.microsoft.graph.serializer.ISerializer;
import com.microsoft.graph.serializer.IJsonBackedObject;
import com.microsoft.graph.serializer.AdditionalDataManager;
import java.util.EnumSet;
import com.microsoft.graph.models.extensions.RubricQualityFeedbackModel;
import com.microsoft.graph.models.extensions.RubricQualitySelectedColumnModel;
import com.microsoft.graph.models.extensions.EducationOutcome;


import com.google.gson.JsonObject;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

// **NOTE** This file was generated by a tool and any changes will be overwritten.

/**
 * The class for the Education Rubric Outcome.
 */
public class EducationRubricOutcome extends EducationOutcome implements IJsonBackedObject {


    /**
     * The Published Rubric Quality Feedback.
     * 
     */
    @SerializedName(value = "publishedRubricQualityFeedback", alternate = {"PublishedRubricQualityFeedback"})
    @Expose
    public java.util.List<RubricQualityFeedbackModel> publishedRubricQualityFeedback;

    /**
     * The Published Rubric Quality Selected Levels.
     * 
     */
    @SerializedName(value = "publishedRubricQualitySelectedLevels", alternate = {"PublishedRubricQualitySelectedLevels"})
    @Expose
    public java.util.List<RubricQualitySelectedColumnModel> publishedRubricQualitySelectedLevels;

    /**
     * The Rubric Quality Feedback.
     * 
     */
    @SerializedName(value = "rubricQualityFeedback", alternate = {"RubricQualityFeedback"})
    @Expose
    public java.util.List<RubricQualityFeedbackModel> rubricQualityFeedback;

    /**
     * The Rubric Quality Selected Levels.
     * 
     */
    @SerializedName(value = "rubricQualitySelectedLevels", alternate = {"RubricQualitySelectedLevels"})
    @Expose
    public java.util.List<RubricQualitySelectedColumnModel> rubricQualitySelectedLevels;


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

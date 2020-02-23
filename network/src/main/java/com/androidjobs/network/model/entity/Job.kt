package com.androidjobs.network.model.entity

import com.google.gson.annotations.SerializedName

data class Job(
    @SerializedName("country")
    val country: String,
    @SerializedName("native")
    val native: Boolean,
    @SerializedName("required_experience_years")
    val requiredExperienceYears: Int,
    @SerializedName("title")
    val title: String
)
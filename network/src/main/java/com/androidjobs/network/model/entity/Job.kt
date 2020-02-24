package com.androidjobs.network.model.entity

import com.google.gson.annotations.SerializedName
import io.objectbox.annotation.Entity
import io.objectbox.annotation.Id

@Entity
data class Job(
    @Id
    var id: Long = 0,
    @SerializedName("country")
    val country: String,
    @SerializedName("native")
    val native: Boolean,
    @SerializedName("required_experience_years")
    val requiredExperienceYears: Int,
    @SerializedName("title")
    val title: String
)
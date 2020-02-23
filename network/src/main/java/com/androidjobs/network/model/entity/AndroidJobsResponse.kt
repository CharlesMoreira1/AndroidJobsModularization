package com.androidjobs.network.model.entity

import com.google.gson.annotations.SerializedName

data class AndroidJobsResponse(
    @SerializedName("jobs")
    val jobs: List<Job>
)
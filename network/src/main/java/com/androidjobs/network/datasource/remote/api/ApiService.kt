package com.androidjobs.network.datasource.remote.api

import com.androidjobs.network.model.entity.AndroidJobsResponse
import retrofit2.http.GET

interface ApiService {

    @GET("android-jobs")
    suspend fun getListJobs(): AndroidJobsResponse
}
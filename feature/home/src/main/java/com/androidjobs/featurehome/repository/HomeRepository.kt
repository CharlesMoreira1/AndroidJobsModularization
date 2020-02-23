package com.androidjobs.featurehome.repository

import com.androidjobs.network.datasource.remote.ApiClient
import com.androidjobs.network.datasource.remote.api.ApiService
import com.androidjobs.network.model.entity.AndroidJobsResponse

class HomeRepository {

    suspend fun getListJobs() : AndroidJobsResponse?{
        return ApiClient.service<ApiService>().getListJobs()
    }
}
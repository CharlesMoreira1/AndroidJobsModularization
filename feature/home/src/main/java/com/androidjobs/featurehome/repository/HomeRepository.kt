package com.androidjobs.featurehome.repository

import com.androidjobs.core.base.BaseRepository
import com.androidjobs.network.datasource.remote.ApiClient
import com.androidjobs.network.datasource.remote.api.ApiService
import com.androidjobs.network.model.entity.Job

class HomeRepository(private val apiClient: ApiClient): BaseRepository() {

    suspend fun getListJobs() : List<Job>?{
       return apiClient.service(ApiService::class.java).getListJobs().jobs
    }
}
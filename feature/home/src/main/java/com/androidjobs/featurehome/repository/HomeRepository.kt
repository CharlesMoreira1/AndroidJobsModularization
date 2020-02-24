package com.androidjobs.featurehome.repository

import com.androidjobs.core.base.BaseRepository
import com.androidjobs.network.datasource.remote.ApiClient
import com.androidjobs.network.datasource.remote.api.ApiService
import com.androidjobs.network.model.entity.Job
import io.objectbox.BoxStore

class HomeRepository(private val apiClient: ApiClient, private val boxStore: BoxStore): BaseRepository() {

    suspend fun getListJobs(forceRefresh: Boolean) : List<Job>?{
        val boxJob = boxStore.boxFor(Job::class.java)
        return networkBoundResource(
            makeApiCall = {
               apiClient.service(ApiService::class.java).getListJobs().jobs
            },
            shouldFetch = {
                boxJob.all.isNullOrEmpty() || forceRefresh
            },
            saveCallResult = {
                boxJob.removeAll()
                boxJob.put(it)
            },
            loadFromDb = {
                boxJob.all
            }
        )
    }
}
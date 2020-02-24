package com.androidjobs.featurehome.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.androidjobs.core.base.BaseViewModel
import com.androidjobs.core.helper.Resource
import com.androidjobs.featurehome.repository.HomeRepository
import com.androidjobs.network.model.entity.Job

class HomeViewModel(private val repository: HomeRepository) : BaseViewModel() {

    private val mutableLiveDataListJobs = MutableLiveData<Resource<List<Job>>>()

    init {
        fetchListJobs()
    }

    fun getListJobs(): LiveData<Resource<List<Job>>> = mutableLiveDataListJobs

    private fun fetchListJobs(forceRefresh: Boolean = false) {
        mutableLiveDataListJobs.loading()

        viewModelScope.launchWithCallback(
            onSuccess = {
                mutableLiveDataListJobs.success(repository.getListJobs(forceRefresh))
            },
            onError = {
                mutableLiveDataListJobs.error(it)
            })
    }

    fun refreshViewModel() {
        fetchListJobs(true)
    }
}
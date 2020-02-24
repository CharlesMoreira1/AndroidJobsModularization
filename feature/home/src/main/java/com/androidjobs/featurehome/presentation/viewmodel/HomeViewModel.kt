package com.androidjobs.featurehome.presentation.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.androidjobs.core.base.BaseViewModel
import com.androidjobs.core.helper.Resource
import com.androidjobs.featurehome.repository.HomeRepository
import com.androidjobs.network.model.entity.Job
import kotlinx.coroutines.launch

class HomeViewModel(private val repository: HomeRepository) : BaseViewModel() {

    private val mutableLiveDataListJobs = MutableLiveData<Resource<List<Job>>>()

    init {
        fetchListJobs()
    }

    fun getListJobs(): LiveData<Resource<List<Job>>> = mutableLiveDataListJobs

    private fun fetchListJobs() {
        mutableLiveDataListJobs.loading()

        viewModelScope.launch {
            try {
                mutableLiveDataListJobs.success(repository.getListJobs())
            } catch (t: Throwable){
                mutableLiveDataListJobs.error(t)
            }
        }
    }
}
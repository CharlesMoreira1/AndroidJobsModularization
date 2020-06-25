package com.androidjobs.network.di

import com.androidjobs.network.datasource.local.ObjectBox
import com.androidjobs.network.datasource.remote.ApiClient
import io.objectbox.BoxStore
import org.koin.dsl.module

val apiClient = module {
    single<ApiClient> { ApiClient(get()) }
}

val setupObjectBox = module {
    single<BoxStore> { ObjectBox.init(get()) }
}

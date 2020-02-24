package com.androidjobs.featurehome.di

import com.androidjobs.featurehome.presentation.viewmodel.HomeViewModel
import com.androidjobs.featurehome.repository.HomeRepository
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val loadFeatureHome by lazy {
    listOf(viewModelModule,
        repositoryModule
    )
}

val repositoryModule = module {
    single<HomeRepository> { HomeRepository(get(), get()) }
}

val viewModelModule = module {
    viewModel<HomeViewModel> { HomeViewModel(get()) }
}
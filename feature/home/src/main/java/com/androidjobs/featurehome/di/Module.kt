package com.androidjobs.featurehome.di

import com.androidjobs.featurehome.presentation.viewmodel.HomeViewModel
import com.androidjobs.featurehome.repository.HomeRepository
import com.androidjobs.network.di.apiClient
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.core.KoinComponent
import org.koin.core.context.loadKoinModules
import org.koin.dsl.module

val repositoryModule = module {
    single<HomeRepository> { HomeRepository(get()) }
}

val viewModelModule = module {
    viewModel<HomeViewModel> { HomeViewModel(get()) }
}

object HomeFeatureModule : KoinComponent {
    fun inject() =
        loadKoinModules(
            listOf(
                viewModelModule,
                repositoryModule,
                apiClient
            )
        )
}


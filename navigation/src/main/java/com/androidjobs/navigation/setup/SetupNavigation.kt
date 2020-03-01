package com.androidjobs.navigation.setup

object SetupNavigation{
    lateinit var navigationInterfaceFeature: NavigationInterfaceFeature

    fun init(navigationInterfaceFeature: NavigationInterfaceFeature){
        this.navigationInterfaceFeature = navigationInterfaceFeature
    }
}

inline fun <reified T : NavigationInterfaceFeature> startNavigation(): T{
    return SetupNavigation.navigationInterfaceFeature as T
}
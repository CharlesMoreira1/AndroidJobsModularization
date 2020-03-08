package com.androidjobs

import android.app.Application
import android.content.Context
import com.androidjobs.featurehome.di.loadFeatureHome
import com.androidjobs.network.di.loadNetwork
import com.google.android.play.core.splitcompat.SplitCompat
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class MyApplication : Application() {

    init {
        instance = this
    }

    companion object {
        private var instance: MyApplication? = null
        fun applicationContext() = instance as MyApplication
    }

    override fun onCreate() {
        super.onCreate()
        startKoin {
            androidContext(this@MyApplication)
            modules(loadFeatureHome + loadNetwork)
        }
    }

    override fun attachBaseContext(base: Context?) {
        super.attachBaseContext(base)
        SplitCompat.install(this)
    }
}
package com.androidjobs.network.datasource.local

import android.content.Context
import android.util.Log
import com.androidjobs.network.model.entity.MyObjectBox
import io.objectbox.BoxStore
import io.objectbox.android.AndroidObjectBrowser

object ObjectBox {

    fun init(context: Context): BoxStore {
        return MyObjectBox.builder()
            .androidContext(context.applicationContext)
            .build()
            .startObjectBrowser(context)
    }

    private fun BoxStore.startObjectBrowser(context: Context): BoxStore{
        val started = AndroidObjectBrowser(this).start(context)
        Log.i("ObjectBrowser", "Started: $started")

        return this
    }
}
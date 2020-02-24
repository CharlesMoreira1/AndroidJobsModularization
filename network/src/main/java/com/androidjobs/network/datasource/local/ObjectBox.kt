package com.androidjobs.network.datasource.local

import android.content.Context
import com.androidjobs.network.model.entity.MyObjectBox
import io.objectbox.BoxStore

object ObjectBox {

    fun init(context: Context): BoxStore {
        return MyObjectBox.builder()
            .androidContext(context.applicationContext)
            .build()
    }
}
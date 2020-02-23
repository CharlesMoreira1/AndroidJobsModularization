package com.androidjobs.network

import android.content.Context

class ApplicationContext {

    companion object {
        val instance : ApplicationContext by lazy { ApplicationContext() }
    }

    private lateinit var context: Context

    fun init(context: Context){
        this.context = context
    }

    fun getContext() : Context = context
}
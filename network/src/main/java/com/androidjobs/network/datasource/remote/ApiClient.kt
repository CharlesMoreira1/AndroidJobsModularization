package com.androidjobs.network.datasource.remote

import com.androidjobs.network.ApplicationContext
import com.readystatesoftware.chuck.ChuckInterceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

    const val BASE_URL = "http://demo8470178.mockable.io/"

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .addInterceptor(ChuckInterceptor(ApplicationContext.instance.getContext()))
        .build()

    val getRetrofitInstance: (String) -> Retrofit = { url ->
        Retrofit.Builder()
            .baseUrl(url)
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .build()
    }

    inline fun <reified T> service(baseUrl: String = BASE_URL): T {
        return getRetrofitInstance(baseUrl).create(T::class.java)
    }
}
package com.example.cryptotracker.data.api

import com.example.cryptotracker.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiFactory {
    private const val BASE_URL = BuildConfig.BaseUrl

    val apiService: ApiService by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }
}
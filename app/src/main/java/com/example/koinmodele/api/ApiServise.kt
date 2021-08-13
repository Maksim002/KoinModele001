package com.example.android_di_koin_example.api

import com.example.testkoin.model.ExampleModel
import retrofit2.Response
import retrofit2.http.GET

interface ApiServise {
    @GET("v1/countries?")
    suspend fun news(): Response<ExampleModel>
}
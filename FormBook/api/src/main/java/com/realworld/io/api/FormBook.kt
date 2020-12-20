package com.realworld.io.api

import com.realworld.io.api.services.FormBookAPI
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class FormBook {

    private val retrofit: Retrofit = Retrofit.Builder()
        .baseUrl("https://conduit.productionready.io/api/")
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val api: FormBookAPI = retrofit.create(FormBookAPI::class.java)

}
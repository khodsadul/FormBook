package com.realworld.io.api.services

import com.realworld.io.api.models.ArticleResponse
import com.realworld.io.api.models.ArticlesResponse
import retrofit2.Call
import retrofit2.http.GET

interface FormBookAPI {

    @GET("articles/")
    fun getArticles(): Call<ArticlesResponse>

}
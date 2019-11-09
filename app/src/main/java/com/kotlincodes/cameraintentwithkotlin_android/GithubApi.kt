package com.kotlincodes.cameraintentwithkotlin_android

import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query
//import com.kotlincodes.cameraintentwithkotlin_android.GithubRepoModel

const val BASE_URL = "http://127.0.0.1:8000/api"

interface GithubApiImpl {
    @GET("/image")
    fun getRepoList(@Query("q") query: String): Call<MovieListResponse>
}



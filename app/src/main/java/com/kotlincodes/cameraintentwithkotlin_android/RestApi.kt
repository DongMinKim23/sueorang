package com.kotlincodes.cameraintentwithkotlin_android

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
//import com.kotlincodes.cameraintentwithkotlin_android.GithubApi
class RestApi {
    private val githubApiImpl : GithubApiImpl

    init {
        val retrofit = Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(MoshiConverterFactory.create())
                .build()
            githubApiImpl = retrofit.create(GithubApiImpl::class.java)
    }

    fun getRetrofit(param: String): Call<MovieListResponse> {
        return githubApiImpl.getRepoList(param)
    }
}
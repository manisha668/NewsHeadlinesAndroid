package com.example.newsheadlines.view.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    var retrofit: Retrofit? = null
    var baseURL : String = "http://newsapi.org/v2/"

    fun getRetrofitInstance() : GetNewsHeadlinesApi{

     if(retrofit == null){
        retrofit = Retrofit
            .Builder()
            .baseUrl(baseURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
     }
        return retrofit!!.create(GetNewsHeadlinesApi::class.java)
    }
}
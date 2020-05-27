package com.example.newsheadlines.view.network

import com.example.newsheadlines.view.model.NewsModel
import retrofit2.Call
import retrofit2.http.GET

interface GetNewsHeadlinesApi {

 @GET("top-headlines")
 fun getNewsList():Call<List<NewsModel>>
}
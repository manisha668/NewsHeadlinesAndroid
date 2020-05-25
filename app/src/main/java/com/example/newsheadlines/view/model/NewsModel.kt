package com.example.newsheadlines.view.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

object NewsModel {
  data class ArticleDetails(@SerializedName("articles") var articleDetails: ArrayList<ArticlesList>){

  }
}
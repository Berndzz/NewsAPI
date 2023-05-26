package com.androiddevs.mvvmnewsapp.util

import com.androiddevs.mvvmnewsapp.BuildConfig

// https://newsapi.org/v2/top-headlines
// https://newsapi.org/v2/everything

class Constants {
    companion object{
        const val API_KEY = BuildConfig.KEY
        const val BASE_URL = BuildConfig.URL
        const val SEARCH_NEWS_TIME_DELAY = 500L
        const val QUERY_PAGE_SIZE = 20
    }
}
package com.jemutai.retrofit.api

import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import retrofit2.create

private  const val  BASE_URL = "https://jsonplaceholder.typicode.com/"
object RetrofitInstance {
     private  val  retrofit by lazy {
         Retrofit.Builder()
             .baseUrl(BASE_URL)
             .addConverterFactory(MoshiConverterFactory.create())
             .build()

     }

    val api :BlogApi by lazy {
        retrofit.create(BlogApi::class.java)
    }

}
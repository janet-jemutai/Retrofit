package com.jemutai.retrofit.api

import com.jemutai.retrofit.models.Post
import retrofit2.http.GET

interface BlogApi{
    @GET("posts")
   suspend  fun  getPosts():List<Post>
}

package com.example.iconstore.utils

import com.example.iconstore.model.ApiResponse
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.*

interface IconFinderService {
    @GET(ICONS_URL)
    suspend fun getIcons(@QueryMap params: Map<String, String>) : Response<ApiResponse>

    @GET
    @Streaming
    fun downloadFile(@Url url: String): Call<ResponseBody>
}
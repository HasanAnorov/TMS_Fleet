package com.example.tmsfleet.networking

import com.example.tmsfleet.model.Model
import retrofit2.Response
import retrofit2.http.GET

interface NetworkService {
    @GET("/v2/list")
    suspend fun getAllData(): Response<List<Model>>
}
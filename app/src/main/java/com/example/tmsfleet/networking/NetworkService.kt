package com.example.tmsfleet.networking

import com.example.tmsfleet.model.Model
import retrofit2.Call
import retrofit2.http.GET

interface NetworkService {
    @GET("data_url")
    fun getAllData(): Call<List<Model>>
}
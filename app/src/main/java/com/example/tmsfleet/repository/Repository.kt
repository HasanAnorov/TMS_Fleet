package com.example.tmsfleet.repository

import com.example.tmsfleet.model.Model
import com.example.tmsfleet.networking.NetworkService
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val networkService: NetworkService) {

    suspend fun getAllData(): Response<List<Model>>{

        return networkService.getAllData()

    }

}
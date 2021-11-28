package com.example.tmsfleet.repository

import androidx.lifecycle.MutableLiveData
import com.example.tmsfleet.model.Model
import com.example.tmsfleet.networking.NetworkService
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

class Repository @Inject constructor(private val networkService: NetworkService) {

    fun getAllData(liveData:MutableLiveData<List<Model>>){

        val call :Call<List<Model>> = networkService.getAllData()
        call.enqueue(object : Callback<List<Model>> {
            override fun onResponse(call: Call<List<Model>>, response: Response<List<Model>>) {
                liveData.postValue(response.body())
            }

            override fun onFailure(call: Call<List<Model>>, t: Throwable) {
                liveData.postValue(null)
            }

        })

    }

}
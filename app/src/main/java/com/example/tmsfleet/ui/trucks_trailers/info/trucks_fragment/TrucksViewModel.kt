package com.example.tmsfleet.ui.trucks_trailers.info.trucks_fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tmsfleet.model.Model
import com.example.tmsfleet.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class TrucksViewModel @Inject constructor(private val repository: Repository) : ViewModel(){

    private var data:MutableLiveData<List<Model>> = MutableLiveData()

    fun getLiveData():MutableLiveData<List<Model>>{
        return data
    }

    fun loadData(){
        repository.getAllData(data)
    }

}
package com.example.tmsfleet.ui.trucks_and_trailers.trucks_fragment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tmsfleet.model.Model
import com.example.tmsfleet.repository.Repository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class TrucksViewModel @Inject constructor(
    private val repository: Repository
    ) : ViewModel(){

    private var data:MutableLiveData<Response<List<Model>>> = MutableLiveData()

    fun getLiveData():MutableLiveData<Response<List<Model>>>{
        return data
    }

    fun loadData() = viewModelScope.launch {
        repository.getAllData().let {
            data.postValue(it)
        }
    }
}
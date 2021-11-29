package com.example.tmsfleet.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.tmsfleet.utils.CHECK_YOUR_FIELDS
import com.example.tmsfleet.utils.PASSWORD_ERROR
import com.example.tmsfleet.utils.Resource
import com.example.tmsfleet.utils.USERNAME_ERROR
import com.example.tmsfleet.utils.Validator.isValidEmail
import kotlinx.coroutines.launch

class SignInViewModel : ViewModel() {

    private val  _text = MutableLiveData<String>().apply {
        value = "This is home fragment"
    }

    private val loginLiveDataPrivate = MutableLiveData<Resource<LoginResponse>>()
    val loginLiveData: LiveData<Resource<LoginResponse>> get() = loginLiveDataPrivate


    fun doLogin(email:String, password:String){

        val isEmailValid = isValidEmail(email)
        val isPasswordValid = password.trim().length>4
        if(isEmailValid && !isPasswordValid){
            loginLiveDataPrivate.value = Resource.DataError(PASSWORD_ERROR)
        }else if (isPasswordValid && !isEmailValid){
            loginLiveDataPrivate.value = Resource.DataError(USERNAME_ERROR)
        }else if (!isEmailValid && !isPasswordValid){
            loginLiveDataPrivate.value = Resource.DataError(CHECK_YOUR_FIELDS)
        }else{
            viewModelScope.launch {
                loginLiveDataPrivate.value =Resource.Loading()
            }
        }

    }

    val text : LiveData<String> = _text

}

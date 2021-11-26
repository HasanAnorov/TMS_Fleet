package com.example.tmsfleet.ui.auth

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.tmsfleet.utils.Validator.isValidEmail

class SignInViewModel : ViewModel() {

    private val  _text = MutableLiveData<String>().apply {
        value = "This is home fragment"
    }

    fun doLogin(email:String, password:String){

        val isEmailValid = isValidEmail(email)
        val isPasswordValid = password.trim().length>4
        if(isEmailValid && !isPasswordValid){

        }else if (isPasswordValid && !isEmailValid){

        }else if (!isEmailValid && !isPasswordValid){

        }else{

        }

    }

    val text : LiveData<String> = _text

}

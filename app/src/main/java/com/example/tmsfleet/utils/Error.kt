package com.example.tmsfleet.utils

import java.lang.Exception

class Error(val code: Int, val description: String) {

constructor(exception: Exception):this(
    code = DEFAULT_ERROR, description = exception.message ?: ""
    )
}

const val NO_INTERNET_CONNECTION = -1
const val NETWORK_ERROR = -2
const val DEFAULT_ERROR = -3
const val PASSWORD_ERROR = -101
const val USERNAME_ERROR = -102
const val CHECK_YOUR_FIELDS = -103
const val SEARCH_ERROR = -104
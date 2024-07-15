package com.example.dagger_hilt_demo.api_call_setup

import retrofit2.http.POST

interface ApiInterface {

    @POST
    fun login()
}
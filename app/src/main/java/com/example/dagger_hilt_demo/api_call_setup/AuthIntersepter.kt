package com.example.dagger_hilt_demo.api_call_setup

import okhttp3.Credentials
import okhttp3.Interceptor
import okhttp3.Response

class AuthIntersepter() : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {

        val credential = Credentials.basic("aaaa", "aaa")
        val request = chain.request()
        val authRequest = request.newBuilder()
            .header("Authorization", credential)
            .build()
        return chain.proceed(authRequest)
    }
}
package com.example.dagger_hilt_demo.api_call_setup

class RepositoryImpl(private val apiInterface: ApiInterface) : Repository {
    override suspend fun login() = apiInterface.login()


}
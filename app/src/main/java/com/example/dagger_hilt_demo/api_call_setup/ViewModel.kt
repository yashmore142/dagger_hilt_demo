package com.example.dagger_hilt_demo.api_call_setup

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineExceptionHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class ViewModel @Inject constructor(private val repository: Repository) : ViewModel() {
    private var errorData: MutableLiveData<String> = MutableLiveData("")
    private val coroutineException = CoroutineExceptionHandler { coroutineContext, throwable ->
        errorData.value = throwable.message
    }

    private var loginJob: Job? = null
    var loginResponse: MutableLiveData<String> = MutableLiveData()
    fun loginUser() {

        loginJob = viewModelScope.launch(coroutineException) {
            try {
                val response = withContext(Dispatchers.IO) {
                    repository.login()
                }

                // loginResponse = response


            } catch (e: Exception) {
                throw e
            }
        }


    }
}
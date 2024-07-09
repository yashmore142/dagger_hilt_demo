package com.example.dagger_hilt_demo.house

import android.util.Log
import javax.inject.Inject

class AlertMsg @Inject constructor() {
    fun startMessage(){
        println("Hello")
        Log.i("dagger","Hello yash")
    }
}
package com.example.dagger_hilt_demo.house

import javax.inject.Inject

class House @Inject constructor(private val alertMsg: AlertMsg) {



    fun alert(){
        alertMsg.startMessage()
    }
}
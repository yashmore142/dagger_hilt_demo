package com.example.dagger_hilt_demo.demo

import android.content.Context
import android.content.SharedPreferences
import android.util.Log
import com.example.dagger_hilt_demo.R

class Session(context: Context) {

    private var prefs: SharedPreferences =
        context.getSharedPreferences(context.getString(R.string.app_name), Context.MODE_PRIVATE)

    fun setMesssage(){
        Log.i("msg","demo message")
        Log.i("msg", "")
    }
}
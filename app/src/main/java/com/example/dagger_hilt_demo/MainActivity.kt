package com.example.dagger_hilt_demo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dagger_hilt_demo.api_call_setup.ViewModel
import com.example.dagger_hilt_demo.demo.Session
import com.example.dagger_hilt_demo.house.House
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var house: House

    @Inject
    lateinit var session: Session
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        house.alert()

        session.setMesssage()
    }
}
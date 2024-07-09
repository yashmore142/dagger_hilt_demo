package com.example.dagger_hilt_demo.demo

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
class Demo {


    @Provides
    @Singleton
    fun provideSession(@ApplicationContext context: Context) : Session{
        return Session(context)
    }
}
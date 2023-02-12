package com.nohjunh.test.di

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import timber.log.Timber

@HiltAndroidApp
class App : Application() {
    companion object {
        private lateinit var application : App
        fun getInstance() : App = application
    }

    override fun onCreate() {
        super.onCreate()
        application = this
        Timber.plant(Timber.DebugTree())
    }
}
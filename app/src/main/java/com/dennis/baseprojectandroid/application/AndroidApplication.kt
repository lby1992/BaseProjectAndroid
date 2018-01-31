package com.dennis.baseprojectandroid.application

import android.app.Application

import com.dennis.baseprojectandroid.core.injection.app.AppComponent
//import com.dennis.baseprojectandroid.core.injection.app.DaggerAppComponent

/**
 * Created by BY on 2018/1/16.
 */

class AndroidApplication : Application() {

    var appComponent: AppComponent? = null

    override fun onCreate() {
        super.onCreate()

        //Do something while initialing application.
        createAppComponent()
    }

    private fun createAppComponent() {
//        var appComponent = DaggerAppComponent.builder()
//                .build()
//
//        appComponent = appComponent
    }
}

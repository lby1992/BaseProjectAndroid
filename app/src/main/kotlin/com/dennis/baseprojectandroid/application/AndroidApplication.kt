package com.dennis.baseprojectandroid.application

import android.app.Application

import com.dennis.baseprojectandroid.core.injection.app.AppComponent
import com.dennis.baseprojectandroid.core.injection.app.AppModule
import com.dennis.baseprojectandroid.core.injection.app.DaggerAppComponent
import com.dennis.baseprojectandroid.core.plugins.setupFabric

/**
 * Created by BY on 2018/1/16.
 */

class AndroidApplication : Application() {

    companion object {
        @JvmStatic lateinit var appComponent: AppComponent
    }

    override fun onCreate() {
        super.onCreate()

        //Do something while initialing application.
        createAppComponent()

        setupFabric(this)
    }

    private fun createAppComponent() {
        AndroidApplication.appComponent = DaggerAppComponent.builder().appModule(AppModule(this)).build()
        AndroidApplication.appComponent.inject(this)
    }
}

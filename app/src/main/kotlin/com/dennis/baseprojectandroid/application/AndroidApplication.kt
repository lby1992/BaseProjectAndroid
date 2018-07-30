package com.dennis.baseprojectandroid.application

import android.app.Activity
import android.app.Application
import com.dennis.baseprojectandroid.core.injection.app.AppInjector
import com.dennis.baseprojectandroid.core.plugins.setupFabric
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasActivityInjector
import javax.inject.Inject

/**
 * Created by BY on 2018/1/16.
 */

class AndroidApplication : Application(), HasActivityInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Activity>

    override fun onCreate() {
        super.onCreate()

        //Do something while initialing application.
        AppInjector.init(this)

        setupFabric(this)
    }

    override fun activityInjector(): AndroidInjector<Activity> = dispatchingAndroidInjector
}

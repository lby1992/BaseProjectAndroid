package com.dennis.baseprojectandroid.core.injection.app

import com.dennis.baseprojectandroid.ui.splash.SplashActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class SplashActivityModule {

    @ContributesAndroidInjector
    abstract fun contributeSplashActivity(): SplashActivity
}
package com.dennis.baseprojectandroid.core.injection.app

import android.arch.lifecycle.ViewModel
import android.arch.lifecycle.ViewModelProvider
import com.dennis.baseprojectandroid.core.injection.ui.ViewModelKey
import com.dennis.baseprojectandroid.ui.splash.SplashViewModel
import com.dennis.baseprojectandroid.viewmodel.AppViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AppViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(SplashViewModel::class)
    abstract fun bindSplashViewModel(viewModel: SplashViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: AppViewModelFactory): ViewModelProvider.Factory
}
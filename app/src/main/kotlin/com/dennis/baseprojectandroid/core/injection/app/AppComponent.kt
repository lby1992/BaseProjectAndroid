package com.dennis.baseprojectandroid.core.injection.app

import android.app.Application
import com.dennis.baseprojectandroid.application.AndroidApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by BY on 2018/1/16.
 */
@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    AppViewModelModule::class,
    SplashActivityModule::class
])
interface AppComponent {
    fun inject(application: AndroidApplication)

    @Component.Builder
    interface Builder {
        @BindsInstance
        fun application(application: Application): Builder

        fun build(): AppComponent
    }
}

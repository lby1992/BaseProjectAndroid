package com.dennis.baseprojectandroid.core.injection.app

import android.content.Context
import com.dennis.baseprojectandroid.db.AppDatabase
import javax.inject.Singleton

import dagger.Component

/**
 * Created by BY on 2018/1/16.
 */
@Singleton
@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(context: Context)
    fun appDatabase(): AppDatabase
}

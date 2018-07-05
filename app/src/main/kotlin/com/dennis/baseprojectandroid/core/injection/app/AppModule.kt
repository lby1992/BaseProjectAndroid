package com.dennis.baseprojectandroid.core.injection.app

import android.arch.persistence.room.Room
import android.content.Context
import com.dennis.baseprojectandroid.db.AppDatabase
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by BY on 2018/3/9.
 */
@Module
class AppModule(private val context: Context) {
    @Provides
    @Singleton
    public fun provideAppDatabase(): AppDatabase =
            Room.databaseBuilder(context, AppDatabase::class.java, "base-project").build()
}
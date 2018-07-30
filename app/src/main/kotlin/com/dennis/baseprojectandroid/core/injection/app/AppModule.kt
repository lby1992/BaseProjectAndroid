package com.dennis.baseprojectandroid.core.injection.app

import dagger.Module

/**
 * Created by BY on 2018/3/9.
 */
@Module(includes = [
    AppViewModelModule::class
])
class AppModule(/*private val context: Context*/) {
    //TODO move to DatabaseModule
//    @Provides
//    @Singleton
//    public fun provideAppDatabase(): AppDatabase =
//            Room.databaseBuilder(context, AppDatabase::class.java, "base-project").build()
}
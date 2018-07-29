package com.dennis.baseprojectandroid.db

import android.arch.persistence.room.Database
import android.arch.persistence.room.RoomDatabase
import com.dennis.baseprojectandroid.db.dao.UserDao
import com.dennis.baseprojectandroid.db.entity.UserEntity

/**
 * Created by BY on 2018/3/9.
 */
@Database(entities = [UserEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun userDao(): UserDao
}
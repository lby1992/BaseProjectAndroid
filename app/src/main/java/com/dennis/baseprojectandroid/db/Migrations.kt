package com.dennis.baseprojectandroid.db

import android.arch.persistence.db.SupportSQLiteDatabase
import android.arch.persistence.room.migration.Migration

/**
 * Created by BY on 2018/3/9.
 */
//Caution: If you don't provide the necessary migrations, Room rebuilds the database instead, which means you'll lose all of your data in the database.
/*
usage:
    Room.databaseBuilder(getApplicationContext(), MyDb.class, "database-name")
        .addMigrations(MIGRATION_1_2, MIGRATION_2_3).build();
 */
val MIGRATION_1_2: Migration by lazy {
    object : Migration(1, 2) {
        override fun migrate(database: SupportSQLiteDatabase) {
            database.execSQL("ALTER TABLE books ADD COLUMN pub_year INTEGER")
        }

    }
}
package com.dennis.baseprojectandroid.db

import android.arch.persistence.db.framework.FrameworkSQLiteOpenHelperFactory
import android.arch.persistence.room.testing.MigrationTestHelper
import android.support.test.InstrumentationRegistry
import android.support.test.runner.AndroidJUnit4
import org.junit.Rule
import org.junit.runner.RunWith

/**
 * A sample migration test
 * Created by BY on 2018/3/9.
 */
@RunWith(AndroidJUnit4::class)
class MigrationTest {

    private val TEST_DB: String = "migration-test"

    @Rule
    val helper: MigrationTestHelper = MigrationTestHelper(InstrumentationRegistry.getInstrumentation(),
            AppDatabase::class.java.canonicalName,
            FrameworkSQLiteOpenHelperFactory())

//    @Test
//    public void migrate1To2() throws IOException {
//        SupportSQLiteDatabase db = helper.createDatabase(TEST_DB, 1);
//
//        // db has schema version 1. insert some data using SQL queries.
//        // You cannot use DAO classes because they expect the latest schema.
//        db.execSQL(...);
//
//        // Prepare for the next version.
//        db.close();
//
//        // Re-open the database with version 2 and provide
//        // MIGRATION_1_2 as the migration process.
//        db = helper.runMigrationsAndValidate(TEST_DB, 2, true, MIGRATION_1_2);
//
//        // MigrationTestHelper automatically verifies the schema changes,
//        // but you need to validate that the data was migrated properly.
//    }
}
package com.dennis.baseprojectandroid.db.dao

import android.arch.persistence.room.*
import com.dennis.baseprojectandroid.db.entity.UserBasicTuple
import com.dennis.baseprojectandroid.db.entity.UserEntity


/**
 * Created by BY on 2018/3/9.
 */
@Dao
interface UserDao {
    @get:Query("SELECT * FROM users")
    val all: List<UserEntity>

    @Query("SELECT * FROM users WHERE id IN (:userIds)")
    fun loadAllByIds(userIds: IntArray): List<UserEntity>
//
//    @Query("SELECT * FROM users WHERE first_name LIKE :first AND " + "last_name LIKE :last LIMIT 1")
//    fun findByName(first: String, last: String): UserEntity

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(vararg users: UserEntity)

    @Delete
    fun delete(user: UserEntity)

    //Returning subsets of columns
    @Query("SELECT full_name, email FROM users WHERE id = :userId")
    fun findBasicProfile(userId: String): UserBasicTuple
}
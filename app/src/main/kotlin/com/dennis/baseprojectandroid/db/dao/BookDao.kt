package com.dennis.baseprojectandroid.db.dao

import android.arch.persistence.room.Dao
import android.arch.persistence.room.Query
import com.dennis.baseprojectandroid.db.entity.BookEntity

/**
 * Created by BY on 2018/3/9.
 */
@Dao
interface BookDao {
    //Querying multiple tables
    @Query("SELECT * FROM books " +
            "INNER JOIN users ON users.id = books.user_id " +
            "WHERE users.full_name LIKE :userName")
    fun findBooksBorrowedByNameSync(userName: String): List<BookEntity>
}
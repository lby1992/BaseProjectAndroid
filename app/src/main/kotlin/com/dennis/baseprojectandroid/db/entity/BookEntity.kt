package com.dennis.baseprojectandroid.db.entity

import android.arch.persistence.room.*

/**
 * Created by BY on 2018/3/9.
 */
@Entity(tableName = "books",
        foreignKeys = [ForeignKey(entity = UserEntity::class, parentColumns = ["id"], childColumns = ["user_id"])],
        indices = [(Index("title"))])
data class BookEntity(@PrimaryKey var id: String,
                      var title: String,
                      @ColumnInfo(name = "user_id") var userId: String)
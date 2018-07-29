package com.dennis.baseprojectandroid.db.entity

import android.arch.persistence.room.ColumnInfo

/**
 * Created by BY on 2018/3/9.
 */
data class UserBasicTuple(
    @ColumnInfo(name = "full_name") var name: String,
    @ColumnInfo(name = "email") var email: String
)
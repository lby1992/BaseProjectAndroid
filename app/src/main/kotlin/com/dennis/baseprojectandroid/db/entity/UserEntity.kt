package com.dennis.baseprojectandroid.db.entity

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Embedded
import android.arch.persistence.room.Entity
import android.arch.persistence.room.Index
import android.arch.persistence.room.PrimaryKey

/**
 * By default, Room uses the class name as the database table name.
 * Created by BY on 2018/3/9.
 */
//the table `users` contains the following columns: id, full_name, email, street, state, city, post_code.
@Entity(tableName = "users",
        indices = [(Index("full_name", "email", unique = true))])
class UserEntity(
    @PrimaryKey var id: String,
    @ColumnInfo(name = "full_name") var name: String,
    var email: String,
    @Embedded var address: AddressEntity
    /*,@Ignore var unusedProperty: String*/
)
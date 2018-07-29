package com.dennis.baseprojectandroid.db.entity

import android.arch.persistence.room.ColumnInfo

/**
 * Created by BY on 2018/3/9.
 */
//Note: Embedded fields can also include other embedded fields.
data class AddressEntity (
    var street: String,
    var state: String,
    var city: String,
    @ColumnInfo(name = "post_code") var postCode: Int
)

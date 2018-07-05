package com.dennis.baseprojectandroid.core.plugins

import android.content.Context
import com.crashlytics.android.Crashlytics
import io.fabric.sdk.android.Fabric

private val crashlytics: Crashlytics by lazy {
    Crashlytics()
}

fun setupFabric(context: Context) {
    Fabric.with(context, crashlytics)
}
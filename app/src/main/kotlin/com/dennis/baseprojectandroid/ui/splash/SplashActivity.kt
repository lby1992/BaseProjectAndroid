package com.dennis.baseprojectandroid.ui.splash

import android.arch.lifecycle.ViewModelProvider
import android.os.Bundle
import com.dennis.baseprojectandroid.R
import com.dennis.baseprojectandroid.ui.BaseActivity
import javax.inject.Inject

/**
 * Splash activity.
 * <br></br>
 * Created by BY on 2018/1/17.
 */

class SplashActivity : BaseActivity() {
    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        checkNotNull(viewModelFactory)
    }
}

package com.dennis.baseprojectandroid.ui.splash;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.dennis.baseprojectandroid.R;
import com.dennis.baseprojectandroid.ui.BaseActivity;

/**
 * Splash activity.
 * <br/>
 * Created by BY on 2018/1/17.
 */

public class SplashActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
    }
}

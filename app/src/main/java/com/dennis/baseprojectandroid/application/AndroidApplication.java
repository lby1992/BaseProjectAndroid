package com.dennis.baseprojectandroid.application;

import android.app.Application;

import com.dennis.baseprojectandroid.core.injection.app.AppComponent;
import com.dennis.baseprojectandroid.core.injection.app.DaggerAppComponent;

/**
 * Created by BY on 2018/1/16.
 */

public class AndroidApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        //Do something while initialing application.
        createAppComponent();
    }

    private void createAppComponent() {
        AppComponent appComponent = DaggerAppComponent.builder()
                .build();

        setAppComponent(appComponent);
    }

    public void setAppComponent(AppComponent appComponent) {
        this.appComponent = appComponent;
    }

    public AppComponent getAppComponent() {
        return appComponent;
    }
}

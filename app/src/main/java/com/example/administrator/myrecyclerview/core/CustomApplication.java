package com.example.administrator.myrecyclerview.core;

import android.app.Application;

/**
 * Created by Stay on 2/2/16.
 * Powered by www.stay4it.com
 */
public class CustomApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AppStatusTracker.init(this);
    }
}

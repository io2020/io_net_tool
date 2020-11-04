package com.io.smartnpc.app;

import android.app.Application;

/**
 * @author xiaocj
 * @date 2020/10/30
 * @description
 */
public class App extends Application {

    public static App instance;
    public static App getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}

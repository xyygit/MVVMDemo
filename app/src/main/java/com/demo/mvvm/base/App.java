package com.demo.mvvm.base;

import android.app.Application;
import android.content.Context;

/**
 * @author yayun.xia.
 * @class App.java
 * @explain
 * @create time 2020/9/25 15:51.
 */
public class App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    //返回
    public static Context getContextObject() {
        return context;
    }
}

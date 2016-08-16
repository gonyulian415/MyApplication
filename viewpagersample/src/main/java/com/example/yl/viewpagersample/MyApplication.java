package com.example.yl.viewpagersample;

import android.app.Application;

import org.xutils.x;

/**
 * Created by yl on 2016/7/31.
 */
public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        x.Ext.init(this);
    }
}

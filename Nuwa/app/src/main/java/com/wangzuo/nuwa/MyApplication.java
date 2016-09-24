package com.wangzuo.nuwa;

import android.app.Application;
import android.content.Context;

import cn.jiajixin.nuwa.Nuwa;

/**
 * Created by hasee on 2016/9/24.
 */

public class MyApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();

    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);

        Nuwa.init(this);
        Nuwa.loadPatch(this,"/sdcard/patch.jar");
    }
}

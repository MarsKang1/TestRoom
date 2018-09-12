package com.example.pc_304.testroom;

import android.app.Application;
import android.content.Context;

/**
 * Created by KangJH on 2018/9/12.
 * The harder you work, the luckier you will be.
 * 全局的context
 */
public class RoomApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this;
    }

    public static Context getContext() {
        return context;
    }
}

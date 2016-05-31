package com.android.jpush.sdk;

import android.app.Activity;
import android.content.Context;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Glen on 2016/5/17.
 */
public class JPushSdk {
    public static Class<? extends Activity> sHandleActivity;

    public static void init(Context context, boolean debug) {
        JPushInterface.setDebugMode(debug);
        JPushInterface.init(context);
    }

    public static Class<? extends Activity> getHandleActivity() {
        return sHandleActivity;
    }

    public static void setHandleActivity(Class<? extends Activity> sHandleActivity) {
        JPushSdk.sHandleActivity = sHandleActivity;
    }
}

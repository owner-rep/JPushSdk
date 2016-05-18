package com.android.jpush.sdk;

import android.content.Context;

import cn.jpush.android.api.JPushInterface;

/**
 * Created by Glen on 2016/5/17.
 */
public class JPushSdk {

    public static void init(Context context, boolean debug) {
        JPushInterface.setDebugMode(debug);
        JPushInterface.init(context);
    }
}

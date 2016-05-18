package com.android.jpush.sdk.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.android.jpush.sdk.JPushSdk;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        JPushSdk.init(getApplicationContext(), true);
    }
}

package com.provider.Application;

import android.app.Application;
import android.content.Context;

import com.orhanobut.hawk.Hawk;



public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate( );
        Hawk.init(MyApp.this).build();
    }


}

package com.provider.CommonUtility;

import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

/**
 * Created by android on 5/6/18.
 */

public class CommonUtils
{

    public static  void hidingStatusBar(AppCompatActivity appCompatActivity) {
        appCompatActivity.requestWindowFeature(Window.FEATURE_NO_TITLE);
        appCompatActivity.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
    }
}

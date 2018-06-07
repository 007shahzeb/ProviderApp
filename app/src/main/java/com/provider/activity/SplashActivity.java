package com.provider.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.provider.CommonUtility.CommonUtils;
import com.provider.R;

public class SplashActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        CommonUtils.hidingStatusBar(SplashActivity.this);








    }


}

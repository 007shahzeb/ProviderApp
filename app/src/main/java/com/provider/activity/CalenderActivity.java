package com.provider.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.provider.R;

import java.util.Calendar;

public class CalenderActivity extends AppCompatActivity {


    private TextView tv_currentdate, tv_day, tv_calender, tv_pendingalertsCounts, tv_completedalertsCounts, tv_viewAlerts;
    private ImageView image_cancel;
    private Calendar calendarView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);


        findingViewsIdsHere();
    }

    private void findingViewsIdsHere() {

        tv_currentdate = findViewById(R.id.tv_currentdate);
        tv_day = findViewById(R.id.tv_day);
        tv_calender = findViewById(R.id.tv_calender);
        tv_pendingalertsCounts = findViewById(R.id.tv_pendingalertsCounts);
        tv_completedalertsCounts = findViewById(R.id.tv_completedalertsCounts);
        tv_viewAlerts = findViewById(R.id.tv_viewAlerts);

    }
}

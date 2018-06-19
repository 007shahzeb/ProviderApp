package com.provider.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.provider.R;

public class SignInActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText ed_username, ed_password;
    private Button btn_signin;
    private TextView tv_signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signin);


        findingViewsIdsHere();
        clcikcEvents();
    }

    private void clcikcEvents() {
        tv_signup.setOnClickListener(this);

    }

    private void findingViewsIdsHere() {

        ed_username = findViewById(R.id.ed_username);
        ed_password = findViewById(R.id.ed_password);
        btn_signin = findViewById(R.id.btn_signin);
        tv_signup = findViewById(R.id.tv_signup);

    }


    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.tv_signup:

                Intent intent = new Intent(SignInActivity.this, SignUpActivity.class);
                startActivity(intent);
                finish();

        }
    }
}

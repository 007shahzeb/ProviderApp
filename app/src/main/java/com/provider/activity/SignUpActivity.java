package com.provider.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.provider.R;

public class SignUpActivity extends AppCompatActivity implements View.OnClickListener {


    private EditText register_ed_username, register_ed_password;
    private Button btn_register;
    private TextView tv_signin;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        findingViewIdsHere();
        clcikEvents();


    }

    private void clcikEvents() {
        tv_signin.setOnClickListener(this);

    }

    private void findingViewIdsHere() {

        register_ed_username = findViewById(R.id.register_ed_username);
        register_ed_password = findViewById(R.id.register_ed_password);
        btn_register = findViewById(R.id.btn_register);
        tv_signin = findViewById(R.id.tv_signin);


    }

    @Override
    public void onClick(View v) {


        switch (v.getId()) {

            case R.id.tv_signin:

                Intent intent = new Intent(SignUpActivity.this, SignInActivity.class);
                startActivity(intent);
                finish();
        }

    }
}

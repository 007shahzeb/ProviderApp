package com.provider.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.provider.R;

public class MyProfileActivity extends AppCompatActivity {


    private ImageView image_backarrow, profile_image;
    private TextView tv_myprofile, tv_signoff, tv_account_details, tv_edit;
    private TextInputLayout textInput_username, textInput_phoneno, textInput_email, textInput_password;
    private EditText til_ed_userName, til_ed_phoneno, til_ed_email, til_ed_password;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myprofile);


        findingViewsIdsHere();


    }

    private void findingViewsIdsHere() {

        image_backarrow = findViewById(R.id.image_backarrow);
        profile_image = findViewById(R.id.profile_image);

        tv_myprofile = findViewById(R.id.tv_myprofile);
        tv_signoff = findViewById(R.id.tv_signoff);
        tv_account_details = findViewById(R.id.tv_account_details);
        tv_edit = findViewById(R.id.tv_edit);

        textInput_username = findViewById(R.id.textInput_username);
        textInput_phoneno = findViewById(R.id.textInput_phoneno);
        textInput_email = findViewById(R.id.textInput_email);
        textInput_password = findViewById(R.id.textInput_password);

        til_ed_userName = findViewById(R.id.til_ed_userName);
        til_ed_phoneno = findViewById(R.id.til_ed_phoneno);
        til_ed_email = findViewById(R.id.til_ed_email);
        til_ed_password = findViewById(R.id.til_ed_password);


    }
}

package com.elmorshdi.hr;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void logIn(View view) {
        Intent intent = new Intent(com.elmorshdi.hr.LoginActivity.this, MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void goSignUp(View view) {
    }
}
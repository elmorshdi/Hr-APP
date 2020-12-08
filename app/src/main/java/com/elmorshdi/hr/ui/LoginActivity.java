package com.elmorshdi.hr.ui;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.elmorshdi.hr.R;

public class LoginActivity extends AppCompatActivity {
    EditText user_name;
    EditText pass;
    Button signIn;
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    String s;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        user_name = findViewById(R.id.loginemail);
        pass = findViewById(R.id.loginpassword);
        signIn = findViewById(R.id.signin);

        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logIn();
            }
        });
    }

    // use user name and password "adman"
    public void logIn() {
        String user = user_name.getText().toString();
        String password = pass.getText().toString();
        if (user.equals("admin") && password.equals("admin")) {
            goMain();
        } else {
            Toast.makeText(getBaseContext(), "User Name or Password is Wrong ", Toast.LENGTH_SHORT).show();
        }
    }

    public void goMain() {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        startActivity(intent);
        finish();
    }

    public void goSignUp(View view) {
    }
}
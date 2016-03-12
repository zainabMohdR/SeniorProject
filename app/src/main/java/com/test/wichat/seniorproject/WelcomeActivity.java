package com.test.wichat.seniorproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class WelcomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        Button loginBtn = (Button)findViewById(R.id.btnLogin);
        Button signupBtn = (Button)findViewById(R.id.btnSignup);


        loginBtn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent signinIntent = new Intent(WelcomeActivity.this, login.class);
                        startActivity(signinIntent);

                    }
                }
        );

        signupBtn.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        Intent signupIntent = new Intent(WelcomeActivity.this, register.class);
                        startActivity(signupIntent);

                    }
                }
        );
    }

}

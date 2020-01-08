package com.example.tulsi.trackingapp;

import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class MainActivity extends AppCompatActivity {

    private Button mSignInButton;
    private Button mSignUpButton;


    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mSignInButton = findViewById(R.id.button_sign_in);
        mSignUpButton = findViewById(R.id.button_sign_up);

        mAuth = FirebaseAuth.getInstance();

    }
    public void Signin(View view)
    {
        Intent intent=new Intent(getApplicationContext(),SignInActivity.class);
        startActivity(intent);

    }

    public void Signup(View view)
    {
        Intent intent=new Intent(getApplicationContext(),SignUp.class);
        startActivity(intent);

    }
}




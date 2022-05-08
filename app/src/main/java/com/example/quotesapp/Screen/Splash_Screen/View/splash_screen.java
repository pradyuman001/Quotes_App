package com.example.quotesapp.Screen.Splash_Screen.View;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.quotesapp.R;
import com.example.quotesapp.Screen.Home_Screen.View.home_screen;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(splash_screen.this, home_screen.class);
                startActivity(intent);
                finish();


            }
        }, 2500);



    }
}
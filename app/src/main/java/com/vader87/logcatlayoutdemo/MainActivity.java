package com.vader87.logcatlayoutdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    com.vader87.locatlayout.LogcatLayout logcatLayout = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        com.vader87.locatlayout.LogcatLayout logcatLayout = (com.vader87.locatlayout.LogcatLayout)findViewById(R.id.logcatLayout);
        logcatLayout.d("MainActivity", "Debug");
        logcatLayout.w("MainActivity", "Warn");
        logcatLayout.e("MainActivity", "Error");
    }
}

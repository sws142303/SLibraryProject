package com.example.sapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.slibrary.stools.SToast;

/**
 * @author Sws
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.tv).setOnClickListener(v -> {
            SToast.showToast(this,"hhhhhhhhhhhhhhhhhhhh");
        });
    }
}
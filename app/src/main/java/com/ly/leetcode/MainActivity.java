package com.ly.leetcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ly.leetcode.sub.Subjcet338;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Subjcet338().run();
    }
}

package com.ly.leetcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ly.leetcode.sub.Subject49;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Subject49().run();

    }
}

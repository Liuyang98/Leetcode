package com.ly.leetcode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ly.leetcode.sub.Subject1;
import com.ly.leetcode.sub.Subject11;
import com.ly.leetcode.sub.Subject2;
import com.ly.leetcode.sub.Subject21;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        new Subject11().run();

    }
}

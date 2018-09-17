package com.ly.leetcode.sub;


import android.util.Log;

/**
 * x 的平方根
 * <p>
 * 实现 int sqrt(int x) 函数。
 * 计算并返回 x 的平方根，其中 x 是非负整数。
 * 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 * 示例 1:
 * 输入: 4
 * 输出: 2
 * 示例 2:
 * 输入: 8
 * 输出: 2
 * 说明: 8 的平方根是 2.82842...,
 * 由于返回类型是整数，小数部分将被舍去。
 */
public class Subject69 implements Subjcet {
    private static final String TAG = "Subject1";

    @Override
    public void run() {
        int n = mySqrt(9);
        Log.e(TAG, "run: " + n);
    }


    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        while (low <= high) {
            long mid = (low + high) / 2;//防止溢出
            if (mid * mid == x) {
                return (int) mid;
            } else if (mid * mid < x) {
                low = (int) (mid + 1);
            } else {
                high = (int) (mid - 1);
            }
        }
        return high;
    }
}

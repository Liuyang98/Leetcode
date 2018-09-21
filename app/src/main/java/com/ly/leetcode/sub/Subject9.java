package com.ly.leetcode.sub;


import android.util.Log;

import com.ly.leetcode.bean.ListNode;

/**
 * 回文数
 * <p>
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 121
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 示例 3:
 * <p>
 * 输入: 10
 * 输出: false
 * 解释: 从右向左读, 为 01 。因此它不是一个回文数。
 * 进阶:
 * <p>
 * 你能不将整数转为字符串来解决这个问题吗？
 */
public class Subject9 implements Subjcet {
    private static final String TAG = "Subject9";

    @Override
    public void run() {
        boolean b = isPalindrome(2231);
        Log.e(TAG, "run: " + b);
    }

    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int n = x;
        int tmp  = 0;
        while (x != 0) {
            tmp = tmp * 10 + x % 10;
            x = x/10;
        }
        return n == tmp ? true : false;
    }
}

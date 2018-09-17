package com.ly.leetcode.sub;


import android.util.Log;

import java.util.HashSet;

/**
 * 快乐数
 * <p>
 * 编写一个算法来判断一个数是不是“快乐数”。
 * <p>
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，
 * 也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 * <p>
 * 示例:
 * <p>
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class Subject202 implements Subjcet {
    private static final String TAG = "Subject202";

    @Override
    public void run() {
        boolean n = isHappy(11111111);
        Log.e(TAG, "run: " + n);
    }

    public boolean isHappy(int n) {
        HashSet hashSet = new HashSet();
        int sum = n;

        while (sum != 1) {
            n = sum;
            sum = 0;

            while (n != 0) {
                int w=n%10;
                sum += w*w;
                n /= 10;
            }

            if (hashSet.contains(0 + sum)) {
                return false;
            } else {
                hashSet.add(0 + sum);
            }
        }
        return true;
    }
}

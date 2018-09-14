package com.ly.leetcode.sub;


import com.ly.leetcode.util.LogUtil;

/**
 * 编写一个函数，输入是一个无符号整数，返回其二进制表达式中数字位数为 ‘1’ 的个数（也被称为汉明重量）。
 * 示例 :
 * 输入: 11
 * 输出: 3
 * 解释: 整数 11 的二进制表示为 00000000000000000000000000001011
 * 示例 2:
 * 输入: 128
 * 输出: 1
 * 解释: 整数 128 的二进制表示为 00000000000000000000000010000000
 */
public class Subject191 implements Subjcet {
    private static final String TAG = "Subject191";

    @Override
    public void run() {
        int n = hammingWeight(1027);
        LogUtil.e( "run: " + n);
    }

    public int hammingWeight(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = n & (n - 1);
        }
        return count;
    }
}

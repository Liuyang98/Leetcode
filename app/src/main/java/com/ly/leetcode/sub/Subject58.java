package com.ly.leetcode.sub;


import android.util.Log;


/**
 * 最后一个单词的长度
 * <p>
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 * 如果不存在最后一个单词，请返回 0 。
 * 说明：一个单词是指由字母组成，但不包含任何空格的字符串。
 * 示例:
 * 输入: "Hello World"
 * 输出: 5
 */
public class Subject58 implements Subjcet {
    private static final String TAG = "Subject1";

    @Override
    public void run() {

        int n = lengthOfLastWord("a ");
        Log.e(TAG, "run: " + n);
    }


    public int lengthOfLastWord(String s) {
        s = s.trim();
        return s.contains(" ")?s.length() - s.lastIndexOf(" ") - 1:s.length();
    }

}

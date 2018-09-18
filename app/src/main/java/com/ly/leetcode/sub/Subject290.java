package com.ly.leetcode.sub;


import android.util.Log;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * 单词模式
 * <p>
 * 给定一种 pattern(模式) 和一个字符串 str ，判断 str 是否遵循相同的模式。
 * 这里的遵循指完全匹配，例如， pattern 里的每个字母和字符串 str 中的每个非空单词之间存在着双向连接的对应模式。
 * 示例1:
 * 输入: pattern = "abba", str = "dog cat cat dog"
 * 输出: true
 * 示例 2:
 * 输入:pattern = "abba", str = "dog cat cat fish"
 * 输出: false
 * 示例 3:
 * 输入: pattern = "aaaa", str = "dog cat cat dog"
 * 输出: false
 * 示例 4:
 * 输入: pattern = "abba", str = "dog dog dog dog"
 * 输出: false
 */
public class Subject290 implements Subjcet {
    private static final String TAG = "Subject290";

    @Override
    public void run() {
        boolean bool = wordPattern("jquery", "jquery");
        Log.e(TAG, "run: " + bool);
    }

    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> hashMap = new HashMap<>();
        char[] pcs = pattern.toCharArray();
        String[] s = str.split(" ");
        if (pcs.length != s.length) return false;

        for (int i = 0; i < pcs.length; i++) {
            String a = hashMap.put(pcs[i], s[i]);
            if (null != a && !a.equals(s[i])) return false;
        }

        HashSet hashSet = new HashSet();
        for (Map.Entry<Character, String> entry : hashMap.entrySet())
            hashSet.add(entry.getValue());

        return hashMap.size() == hashSet.size();
    }

}

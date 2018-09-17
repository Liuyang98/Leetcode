package com.ly.leetcode.sub;


import android.util.Log;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 给定一个未排序的整数数组，找出其中没有出现的最小的正整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,2,0]
 * 输出: 3
 * 示例 2:
 * <p>
 * 输入: [3,4,-1,1]
 * 输出: 2
 * 示例 3:
 * <p>
 * 输入: [7,8,9,11,12]
 * 输出: 1
 * 说明:
 * <p>
 * 你的算法的时间复杂度应为O(n)，并且只能使用常数级别的空间。
 */
public class Subject41 implements Subjcet {
    private static final String TAG = "Subject1";

    @Override
    public void run() {
        int n = firstMissingPositive(new int[]{7, 8, 9, 11, 12});
        Log.e(TAG, "run: " + n);
    }

    public int firstMissingPositive(int[] nums) {
        int length = nums.length;
        int[] cnum = new int[length];

        if (length == 1) return nums[0] == 1 ? 2 : 1;

        for (int i = 0; i < length; i++)
            if (nums[i] > length || nums[i] < 0) nums[i] = 0;

        for (int i = 0; i < length; i++)
            if (nums[i] > 0) cnum[nums[i] - 1] = nums[i];

        for (int i = 0; i < length; i++)
            if (cnum[i] == 0) return ++i;

        return ++length ;
    }

}

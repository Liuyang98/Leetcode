package com.ly.leetcode.sub;


import android.util.Log;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数之和：
 *
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * <p>
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */
public class Subject1 implements Subjcet {
    private static final String TAG = "Subject1";

    @Override
    public void run() {
        int[] ints = twoSum(new int[]{2, 7, 11, 19}, 9);

        Log.e(TAG, "run: " + Arrays.toString(ints));
    }

    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hashMap = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                return new int[]{hashMap.get(target - nums[i]), i};
            } else {
                hashMap.put(nums[i], i);
            }
        }
        return new int[]{};
    }

}

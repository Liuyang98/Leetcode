package com.ly.leetcode.sub;


import android.util.Log;

import java.util.Arrays;
import java.util.HashSet;

/**
 * 在排序数组中查找元素的第一个和最后一个位置
 * <p>
 * 给定一个按照升序排列的整数数组 nums，和一个目标值 target。找出给定目标值在数组中的开始位置和结束位置。
 * 你的算法时间复杂度必须是 O(log n) 级别。
 * 如果数组中不存在目标值，返回 [-1, -1]。
 * 示例 1:
 * 输入: nums = [5,7,7,8,8,10], target = 8
 * 输出: [3,4]
 * 示例 2:
 * 输入: nums = [5,7,7,8,8,10], target = 6
 * 输出: [-1,-1]
 */
public class Subject34 implements Subjcet {
    private static final String TAG = "Subject34";

    @Override
    public void run() {
        int[] bool = searchRange(new int[]{1, 3}, 1);

        Log.e(TAG, "run: " + Arrays.toString(bool));
    }

    public int[] searchRange(int[] nums, int target) {
        int[] inits = new int[]{-1, -1};
        int length = nums.length;
        if (length == 0 || target > nums[length - 1] || target < nums[0]) return inits;

        int l = 0;
        int r = length;
        int mid;

        while (l <= r) {
            mid = (l + r) / 2;

            if (nums[mid] > target) {
                r = mid - 1;
            } else if (nums[mid] < target) {
                l = mid + 1;
            } else {
                l = mid;
                r = mid;


                while (l > 0 && nums[(l - 1)] == target) {
                    l--;
                }


                while (r < length - 1 && nums[(r + 1)] == target) {
                    r++;
                }

                inits[0] = l;
                inits[1] = r;
                break;
            }
        }

        return inits;
    }


}

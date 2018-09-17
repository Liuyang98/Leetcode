package com.ly.leetcode.sub;


import com.ly.leetcode.bean.ListNode;

/**
 * 删除排序链表中的重复元素
 * <p>
 * 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 1->1->2
 * 输出: 1->2
 * 示例 2:
 * <p>
 * 输入: 1->1->2->3->3
 * 输出: 1->2->3
 */
public class Subject83 implements Subjcet {
    private static final String TAG = "Subject1";

    @Override
    public void run() {
//        ListNode. n = deleteDuplicates( l1);
//        Log.e(TAG, "run: " + n);
    }


    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }
        return head;
    }

}

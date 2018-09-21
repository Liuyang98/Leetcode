package com.ly.leetcode.sub;

import android.util.Log;

import com.ly.leetcode.bean.ListNode;


/**
 * 环形链表
 * <p>
 * 给定一个链表，判断链表中是否有环。
 * <p>
 * 进阶：
 * 你能否不使用额外空间解决此题？
 */
public class Subject141 implements Subjcet {
    private static final String TAG = "Subject141";

    @Override
    public void run() {
        boolean bool = hasCycle(new ListNode(1));
        Log.e(TAG, "run: " + bool);
    }

    public boolean hasCycle(ListNode head) {
        ListNode slow = head, fast = head;
        while (slow != null && fast != null) {
            if (slow == slow.next) return true;
            if (fast.next != null) {
                fast = fast.next.next;
            } else {
                return false;
            }
            slow = slow.next;
            if (fast == slow && fast != null) return true;
        }
        return false;
    }
}

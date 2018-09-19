package com.ly.leetcode.sub;


import com.ly.leetcode.bean.ListNode;


/**
 * 反转链表
 * <p>
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 */
public class Subject206 implements Subjcet {
    private static final String TAG = "Subject263";

    @Override
    public void run() {
//        Log.e(TAG, "isUgly: " + b);

    }

    private ListNode newHead;
    public ListNode reverseList(ListNode head) {
        if(head == null)
            return null;
        else if(head.next == null)
            return head;
        reverse(head).next = null;
        return newHead;
    }

    public ListNode reverse (ListNode head) {
        if(head.next == null) {
            newHead = head;
            return head;
        }
        ListNode node = reverse(head.next);
        node.next = head;
        return head;
    }
}

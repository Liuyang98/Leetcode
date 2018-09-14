package com.ly.leetcode.sub;


import android.util.Log;

import com.ly.leetcode.bean.ListNode;

import java.util.Arrays;
import java.util.HashMap;

/**
 * 两数相加
 * <p>
 * 给定两个非空链表来表示两个非负整数。位数按照逆序方式存储，它们的每个节点只存储单个数字。将两数相加返回一个新的链表。
 * 你可以假设除了数字 0 之外，这两个数字都不会以零开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 */
public class Subject2 implements Subjcet {
    private static final String TAG = "Subject2";

    @Override
    public void run() {

        ListNode listNode = new ListNode(2);
        ListNode listNode2 = new ListNode(4);
        ListNode listNode3 = new ListNode(3);
        listNode.next = listNode2;
        listNode2.next = listNode3;

        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(4);
        listNode4.next = listNode5;
        listNode5.next = listNode6;


        ListNode ls = addTwoNumbers(listNode, listNode4);

        while (ls != null) {
            Log.e(TAG, "run: " + ls.val);
            ls = ls.next;
        }
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int plus = 0;
        ListNode head = new ListNode(0);
        ListNode l3 = head;

        while (l1 != null || l2 != null) {
            int value;
            if (l1 == null) {
                value = l2.val + plus;
                l2 = l2.next;
            } else if (l2 == null) {
                value = l1.val + plus;
                l1 = l1.next;
            } else {
                value = l1.val + l2.val + plus;
                l1 = l1.next;
                l2 = l2.next;
            }
            plus = value / 10;
            l3.next = new ListNode(value % 10);
            l3 = l3.next;
        }
        if (plus == 1) l3.next = new ListNode(1);
        return head.next;
    }
}

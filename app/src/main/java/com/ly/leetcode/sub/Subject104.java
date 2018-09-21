package com.ly.leetcode.sub;

import com.ly.leetcode.bean.TreeNode;

/**
 * 二叉树的最大深度
 * <p>
 * 给定一个二叉树，找出其最大深度。
 * <p>
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 * <p>
 * 说明: 叶子节点是指没有子节点的节点。
 * <p>
 * 示例：
 * 给定二叉树 [3,9,20,null,null,15,7]，
 * <p>
 * 3
 * / \
 * 9  20
 * / \
 * 15  7
 * 返回它的最大深度 3 。
 */
public class Subject104 implements Subjcet {
    private static final String TAG = "Subject238";
    private int max = 0;

    @Override
    public void run() {

    }

    public int maxDepth(TreeNode root) {
        bianli(root, 1);

        return max;
    }


    private void bianli(TreeNode root, int cj) {
        if (root == null) return;
        if (max < cj) max = cj;
        bianli(root.left, cj + 1);
        bianli(root.right, cj + 1);
    }
}

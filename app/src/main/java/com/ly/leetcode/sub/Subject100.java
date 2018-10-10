package com.ly.leetcode.sub;


import com.ly.leetcode.bean.TreeNode;

/**
 * 相同的树
 * <p>
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 * <p>
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 * 示例 1:
 * 输入:       1         1
 *           / \       / \
 *          2   3     2   3
 * [1,2,3],   [1,2,3]
 * 输出: true
 * 示例 2:
 * 输入:      1          1
 *          /           \
 *        2             2
 * [1,2],     [1,null,2]
 * 输出: false
 * 示例 3:
 * 输入:       1         1
 *           / \       / \
 *          2   1     1   2
 * [1,2,1],   [1,1,2]
 * 输出: false
 */
public class Subject100 implements Subjcet {
    private static final String TAG = "Subject100";

    @Override
    public void run() {
//        boolean b = isSameTree();
    }

    /**
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (q == null && p == null) return true;

        if (q != null && p != null) {
            if (q.val != p.val) return false;
            else return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else return false;
    }


}

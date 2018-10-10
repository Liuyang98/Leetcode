package com.ly.leetcode.sub;

import com.ly.leetcode.bean.TreeNode;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Subject94 implements Subjcet {

    @Override
    public void run() {

    }

    public List<Integer> inorderTraversal(TreeNode root) {
        TreeNode p=root;
        List<Integer> list=new ArrayList();
        Stack<TreeNode> stack=new Stack();

        while (p!=null || !stack.empty()){
            while(p!=null){
                stack.push(p);
                p=p.left;
            }
            p=stack.pop();
            list.add(p.val);
            p=p.right;
        }
        return list;
    }
}

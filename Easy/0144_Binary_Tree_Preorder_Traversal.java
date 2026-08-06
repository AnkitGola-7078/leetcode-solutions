/*
 * Problem: Binary Tree Preorder Traversal
 * Problem ID: 144
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.6 MB
 * Synced From: LeetCode
 * Date: 2026-08-06
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static void pre(TreeNode root,List<Integer> l){
        if(root==null) return;
        l.add(root.val);//root
        pre(root.left,l);
        pre(root.right,l);
    }
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> l=new ArrayList<>();
        pre(root,l);
        return l;
    }
}
/*
 * Problem: Binary Tree Postorder Traversal
 * Problem ID: 145
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43 MB
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
     static void post(TreeNode root,List<Integer> l){
        if(root==null) return ;
        post(root.left,l);
        
        post(root.right,l);
        l.add(root.val);
    }
    public List<Integer> postorderTraversal(TreeNode root) {
         List<Integer> l=new ArrayList<>();
         post(root,l);
         return l;
    }
}
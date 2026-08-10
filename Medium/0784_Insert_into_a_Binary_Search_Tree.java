/*
 * Problem: Insert into a Binary Search Tree
 * Problem ID: 784
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 47 MB
 * Synced From: LeetCode
 * Date: 2026-08-10
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
    public TreeNode insertIntoBST(TreeNode root, int val) {
       if(root==null) return new TreeNode(val);
       if(root.val>val){
          if(root.left==null){
            root.left=new TreeNode(val);//if null to insert the new node
          }else{
            insertIntoBST(root.left,val);
          }
       }else{
           if(root.right==null){
            root.right=new TreeNode(val);//if null to insert the new node
          }else{
            insertIntoBST(root.right,val);
          }
        }
        return root;
       
    }
}
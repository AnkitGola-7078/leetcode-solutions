/*
 * Problem: Predict the Winner
 * Problem ID: 486
 * Difficulty: Medium
 * Language: Java
 * Runtime: 59 ms
 * Memory: 42.8 MB
 * Synced From: LeetCode
 * Date: 2026-08-01
 */

class Solution {
    static int f(int nums[],int i,int j){
        if(i==j) return nums[i];
        return Math.max(nums[i]-f(nums,i+1,j),nums[j]-f(nums,i,j-1));
    }
    public boolean predictTheWinner(int[] nums) {
        int ans= f(nums,0,nums.length-1);
        return ans>=0?true:false;
    }
}
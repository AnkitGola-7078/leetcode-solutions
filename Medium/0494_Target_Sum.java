/*
 * Problem: Target Sum
 * Problem ID: 494
 * Difficulty: Medium
 * Language: Java
 * Runtime: 557 ms
 * Memory: 42.8 MB
 * Synced From: LeetCode
 * Date: 2026-07-26
 */

class Solution {
    static int f(int[] nums,int t,int s,int i){
       
        if(i==nums.length){
            return (s==t)?1:0;
        }
        return f(nums,t,s+nums[i],i+1)+f(nums,t,s-nums[i],i+1);

    }
    public int findTargetSumWays(int[] nums, int target) {
        return f(nums,target,0,0);
    }
}
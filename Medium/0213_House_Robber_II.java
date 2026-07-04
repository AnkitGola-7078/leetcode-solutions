/*
 * Problem: House Robber II
 * Problem ID: 213
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-04
 */

class Solution {
    static int robin(int [] nums,int i,int j,int dp[]){
        if(i>j) return 0;
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int t=nums[i]+robin(nums,i+2,j,dp);
        int skip=robin(nums,i+1,j,dp);
        return dp[i]=Math.max(t,skip);

    }
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1) return nums[0];
       
       // Case 1: leave first house (rob from 1..n-1)//i-->start j->end
        int[] dp1 = new int[n];
        Arrays.fill(dp1, -1);
        int c1 = robin(nums, 1, n - 1, dp1);

        // Case 2: leave last house (rob from 0..n-2)
        int[] dp2 = new int[n];
        Arrays.fill(dp2, -1);
        int c2 = robin(nums, 0, n - 2, dp2);
        return Math.max(c1,c2);
    }
}
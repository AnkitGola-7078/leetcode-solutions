/*
 * Problem: House Robber II
 * Problem ID: 213
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43 MB
 * Synced From: LeetCode
 * Date: 2026-07-27
 */

class Solution {
    static int f(int nums[],int i,int j,int dp[]){
        if(i>j) return 0;
        if(i>=nums.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+f(nums,i+2,j,dp);
        int skip=f(nums,i+1,j,dp);
        dp[i]= Math.max(take,skip);
        return dp[i];
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int dp1[]=new int[nums.length];
        Arrays.fill(dp1,-1);
        int s1=f(nums,0,nums.length-2,dp1);

        int dp2[]=new int[nums.length];
        Arrays.fill(dp2,-1);
        int s2=f(nums,1,nums.length-1,dp2);
        return Math.max(s1,s2);

    }
}
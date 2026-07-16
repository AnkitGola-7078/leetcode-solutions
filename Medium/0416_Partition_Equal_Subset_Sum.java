/*
 * Problem: Partition Equal Subset Sum
 * Problem ID: 416
 * Difficulty: Medium
 * Language: Java
 * Runtime: 90 ms
 * Memory: 72.4 MB
 * Synced From: LeetCode
 * Date: 2026-07-16
 */

class Solution {
    boolean f(int[] nums,int i,int t,Boolean[][] dp){
        if(t==0) return true;
        if(i==nums.length ||t<0) return false;
        if(dp[i][t]!=null) return dp[i][t];
        boolean take=f(nums,i+1,t-nums[i],dp);
        boolean ntake=f(nums,i+1,t,dp);
        dp[i][t]=take || ntake;
        return dp[i][t];
    }
    public boolean canPartition(int[] nums) {
        int s=0;
        for(int i=0;i<nums.length;i++){
            s+=nums[i];
        }
        if(s%2!=0) return false;
        Boolean[][] dp=new Boolean[nums.length][s/2+1];
        return f(nums,0,s/2,dp);
    }
}
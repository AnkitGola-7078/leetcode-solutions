/*
 * Problem: House Robber
 * Problem ID: 198
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-04
 */

//recursive code tc= o^n

/*class Solution {
    static int f(int[] nums ,int i){
        if(i==0) return nums[0];
        if(i==1) return Math.max(nums[0],nums[1]);
        int take=nums[i]+f(nums,i-2);
        int nottake=f(nums,i-1);
        return Math.max(take,nottake);
    }
    public int rob(int[] nums) {
        return f(nums,nums.length-1);
    }
}*/

//recursive + dp
class Solution {
    static int f(int[] nums ,int i,int dp[]){

        if(dp[i]!=-1) return dp[i];
        int take=nums[i]+f(nums,i-2,dp);
        int nottake=f(nums,i-1,dp);
        dp[i] =Math.max(take,nottake);
        return dp[i];
    }
    public int rob(int[] nums) {
        if(nums.length==1) return nums[0];
        int dp[]=new int[nums.length];
        Arrays.fill(dp,-1);
        dp[0]=nums[0];
        dp[1]=Math.max(nums[0],nums[1]);
        return f(nums,nums.length-1,dp);
    }
}
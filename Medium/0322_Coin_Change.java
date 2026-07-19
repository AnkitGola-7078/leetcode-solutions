/*
 * Problem: Coin Change
 * Problem ID: 322
 * Difficulty: Medium
 * Language: Java
 * Runtime: 25 ms
 * Memory: 46.5 MB
 * Synced From: LeetCode
 * Date: 2026-07-19
 */

class Solution {
    static int f(int[] nums, int t,int[] dp){
        if(t == 0) return 0;                       
        if(t < 0) return Integer.MAX_VALUE;       
        if(dp[t]!=-1) return dp[t];
        int ans = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){      
            int take = f(nums, t - nums[i],dp);       
            if(take != Integer.MAX_VALUE) {        
                ans = Math.min(ans, take + 1);     
            }
        }
        dp[t]=ans;
        return dp[t];
    }
    public int coinChange(int[] coins, int amount) {
        
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        int res = f(coins, amount,dp);
        return res == Integer.MAX_VALUE ? -1 : res;
    }
}

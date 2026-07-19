/*
 * Problem: Coin Change
 * Problem ID: 322
 * Difficulty: Medium
 * Language: Java
 * Runtime: 39 ms
 * Memory: 47.2 MB
 * Synced From: LeetCode
 * Date: 2026-07-19
 */

class Solution {
    static int f(int[] coins, int t,int i,int dp[][]){
        if(t==0) return 0;
        if(t<0 ||i<0) return Integer.MAX_VALUE;
        if(dp[i][t]!=-1) return dp[i][t];

        int take=f(coins,t-coins[i],i,dp);
        if(take != Integer.MAX_VALUE) take += 1; 
        int skip=f(coins,t,i-1,dp);
        dp[i][t] =Math.min(take,skip);
        return dp[i][t];
    }
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[coins.length][amount+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        int res=f(coins,amount,coins.length-1,dp);
        return res==Integer.MAX_VALUE?-1:res;
        
    }
}
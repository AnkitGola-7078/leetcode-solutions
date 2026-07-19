/*
 * Problem: Coin Change II
 * Problem ID: 518
 * Difficulty: Medium
 * Language: Java
 * Runtime: 16 ms
 * Memory: 57.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-19
 */


class Solution {
    static int f(int[] coins, int t,int i,int dp[][]){
        if(t==0) return 1;
        if(t<0 ||i<0) return 0;
        if(dp[i][t]!=-1) return dp[i][t];

        int take=f(coins,t-coins[i],i,dp);//i becoue hum unlimit time coin use kr skyte h
        int skip=f(coins,t,i-1,dp);
        dp[i][t] =take+skip;
        return dp[i][t];
    }
    public int change(int amount, int[] coins) {
        int dp[][]=new int[coins.length][amount+1];
        for(int[] row : dp) Arrays.fill(row, -1);
        int res=f(coins,amount,coins.length-1,dp);
        return res==Integer.MAX_VALUE?-1:res;
        
    }
}
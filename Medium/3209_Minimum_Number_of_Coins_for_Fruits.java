/*
 * Problem: Minimum Number of Coins for Fruits
 * Problem ID: 3209
 * Difficulty: Medium
 * Language: Java
 * Runtime: 42 ms
 * Memory: 63.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-27
 */

class Solution {
    static int f(int[] prices,int i,int f,int dp[][]){
        if(i>=prices.length)return 0;
        if(dp[i][f]!=-1) return dp[i][f];
        int take=prices[i]+f(prices,i+1,i+1,dp);
        int skip= (f>0)?f(prices,i+1,f-1,dp):Integer.MAX_VALUE;
        dp[i][f]= Math.min(take,skip);
        return dp[i][f];
    }
    public int minimumCoins(int[] prices) {
        int dp[][] = new int[prices.length][prices.length+1];
        for(int d[] : dp){
            Arrays.fill(d,-1);
        }
       return f(prices,0,0,dp);
    }
}
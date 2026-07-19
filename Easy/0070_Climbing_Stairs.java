/*
 * Problem: Climbing Stairs
 * Problem ID: 70
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42 MB
 * Synced From: LeetCode
 * Date: 2026-07-19
 */

class Solution {
    static int f(int n,int i,int dp[]){
        if(i==n) return 1;
        if(i>n) return 0;
        if(dp[i]!=-1) return dp[i];
        int take=f(n,i+1,dp);
        int nottake=f(n,i+2,dp);
        dp[i]= take+nottake;
        return dp[i];
    }
    public int climbStairs(int n) {
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return f(n,0,dp);
    }
}
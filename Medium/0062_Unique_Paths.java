/*
 * Problem: Unique Paths
 * Problem ID: 62
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.3 MB
 * Synced From: LeetCode
 * Date: 2026-07-20
 */

class Solution {
    static int f(int m,int n,int r,int d,int dp[][]){
        if(r==m || d==n) return 0;
        if(r==m-1 || d==n-1) return 1;
        if(dp[r][d]!=-1) return dp[r][d];
        dp[r][d]=f(m,n,r+1,d,dp)+f(m,n,r,d+1,dp);
        return dp[r][d];

    }
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m+1][n+1];
        for(int[] arr:dp){
            Arrays.fill(arr,-1);
        }
        return f(m,n,0,0,dp);
    }
}
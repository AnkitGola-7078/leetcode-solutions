/*
 * Problem: Unique Paths II
 * Problem ID: 63
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43.1 MB
 * Synced From: LeetCode
 * Date: 2026-07-20
 */

class Solution {
    static int f(int[][] obs,int m,int n,int r,int d,int dp[][]){
        if(r==m ||d==n)return 0;
        if(obs[r][d]==1) return 0;
        if(r==m-1 && d==n-1 && obs[r][d]!=1) return 1;
        if(dp[r][d]!=-1) return dp[r][d];
        dp[r][d]=f(obs,m,n,r+1,d,dp)+f(obs,m,n,r,d+1,dp);
        return dp[r][d];
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int arr[]:dp){
            Arrays.fill(arr,-1);
        }

        return f(obstacleGrid,m,n,0,0,dp);
    }
}
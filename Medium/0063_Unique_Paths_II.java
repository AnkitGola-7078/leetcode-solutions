/*
 * Problem: Unique Paths II
 * Problem ID: 63
 * Difficulty: Medium
 * Language: Java
 * Runtime: 0 ms
 * Memory: 43 MB
 * Synced From: LeetCode
 * Date: 2026-07-04
 */

class Solution {
    static int f(int m,int n,int r,int d,int[][] obs,int dp[][]){
        if(r>=m || d>=n) return 0;
        if(obs[r][d]==1) return 0;
        if(r==m-1 && d==n-1) return 1;
        
        if(dp[r][d]!=-1) return dp[r][d];
        int right=f(m,n,r+1,d,obs,dp);
        int down=f(m,n,r,d+1,obs,dp);
        dp[r][d] =(right+down);
        return dp[r][d];
    }
    public int uniquePathsWithObstacles(int[][] obs) {
        int m=obs.length;
        int n=obs[0].length;
        int dp[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }

        return f(m,n,0,0,obs,dp);
    }
}


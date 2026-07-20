/*
 * Problem: Minimum Falling Path Sum
 * Problem ID: 967
 * Difficulty: Medium
 * Language: Java
 * Runtime: 7 ms
 * Memory: 46.8 MB
 * Synced From: LeetCode
 * Date: 2026-07-20
 */

class Solution {
    /*static int f(int[][] matrix,int m,int n,int r,int c,int[][] dp){
        if(r==m-1) return dp[r][c] = matrix[r][c];   
        if(dp[r][c]!=-1) return dp[r][c];    
         
        
        int below = f(matrix,m,n,r+1,c,dp);
        int diagonalright = (c+1<n) ? f(matrix,m,n,r+1,c+1,dp) : Integer.MAX_VALUE;
        int diagonalleft  = (c-1>=0) ? f(matrix,m,n,r+1,c-1,dp) : Integer.MAX_VALUE;
        
        dp[r][c]=matrix[r][c]+Math.min(below,Math.min(diagonalright,diagonalleft));
        return dp[r][c];
    }*/
    public int minFallingPathSum(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int ans=Integer.MAX_VALUE;
        int dp[][]=new int[m][n];
        for (int j = 0; j < n; j++) {
            dp[n-1][j] = matrix[n-1][j];
        }
        for(int r=n-2;r>=0;r--){
            for(int c=0;c<n;c++){
             int below = dp[r+1][c];
             int diagonalright = (c+1<n) ? dp[r+1][c+1] : Integer.MAX_VALUE;
             int diagonalleft  = (c-1>=0) ? dp[r+1][c-1] : Integer.MAX_VALUE;
             dp[r][c]=matrix[r][c]+Math.min(below,Math.min(diagonalright,diagonalleft));
            }
        }
        
      
        for(int i=0;i<n;i++){
            ans=Math.min(ans,dp[0][i]);//first row any elemnt ko skta hai
        }
        return ans;
      
    }
}
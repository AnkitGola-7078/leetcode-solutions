/*
 * Problem: Ones and Zeroes
 * Problem ID: 474
 * Difficulty: Medium
 * Language: Java
 * Runtime: 69 ms
 * Memory: 99.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-28
 */

class Solution {
    static int f(String[] strs, int m, int n,int i,int[][][] dp){
        if(i<0) return 0;
        if(dp[i][m][n]!=-1)return dp[i][m][n];

        int ones=0;
        int zeros=0;
        for(char c:strs[i].toCharArray()){
            if(c=='0'){
                zeros++;
            }else{
                ones++;
            }
        }
        
        int skip =f(strs,m,n,i-1,dp);
        int take=0;
        if(ones<=n && zeros<=m){
           take=1+f(strs,m-zeros,n-ones,i-1,dp);
        }
        return dp[i][m][n]= Math.max(skip,take);
    }
    public int findMaxForm(String[] strs, int m, int n) {
        int[][][] dp = new int[strs.length][m+1][n+1];
        for (int[][] arr : dp) {
            for (int[] a : arr) Arrays.fill(a, -1);
        }
        return f(strs,m,n,strs.length-1,dp);
    }
}
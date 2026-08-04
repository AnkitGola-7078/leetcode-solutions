/*
 * Problem: Longest Common Subsequence
 * Problem ID: 1250
 * Difficulty: Medium
 * Language: Java
 * Runtime: 32 ms
 * Memory: 53.9 MB
 * Synced From: LeetCode
 * Date: 2026-08-04
 */

class Solution {
    static int f(String s1,String s2,int i,int j, int dp[][]){
        if(i>=s1.length()||j>=s2.length()) return 0;
        int ans=0;
        if(dp[i][j]!=-1) return dp[i][j];
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]= 1+f(s1,s2,i+1,j+1,dp);
        }else{
            ans =Math.max(f(s1,s2,i+1,j,dp),f(s1,s2,i,j+1,dp));
        }
        return dp[i][j]=ans;
    }
    public int longestCommonSubsequence(String s1, String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        for(int a[]:dp) Arrays.fill(a,-1);
        return f(s1,s2,0,0,dp);
    }
}
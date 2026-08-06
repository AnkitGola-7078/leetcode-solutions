/*
 * Problem: Minimum Insertion Steps to Make a String Palindrome
 * Problem ID: 1437
 * Difficulty: Hard
 * Language: Java
 * Runtime: 20 ms
 * Memory: 54.2 MB
 * Synced From: LeetCode
 * Date: 2026-08-06
 */

class Solution {
    static int f(String s,int i,int j,Integer dp[][]){
        if(i>=j) return 0;
        if(dp[i][j]!=null) return dp[i][j];
        if(s.charAt(i)==s.charAt(j)){
            return dp[i][j]= f(s,i+1,j-1,dp);
        }else{
           return dp[i][j]= Math.min(1+f(s,i+1,j,dp),1+f(s,i,j-1,dp));
        }
    }
    public int minInsertions(String s) {
        Integer dp[][]=new Integer[501][501];
        return f(s,0,s.length()-1,dp);
    }
}
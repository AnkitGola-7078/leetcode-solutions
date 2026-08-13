/*
 * Problem: Edit Distance
 * Problem ID: 72
 * Difficulty: Medium
 * Language: Java
 * Runtime: 3 ms
 * Memory: 47.4 MB
 * Synced From: LeetCode
 * Date: 2026-08-13
 */

class Solution {
    static int f(String w1,String w2,int i,int j,int dp[][]){
        if(i==w1.length()) return w2.length()-j;
        if(j==w2.length()) return w1.length()-i;
        if(dp[i][j]!=-1) return dp[i][j];
        if(w1.charAt(i)==w2.charAt(j)){
            return dp[i][j]= f(w1,w2,i+1,j+1,dp);
        }else{
            int insert=1+f(w1,w2,i+1,j,dp);
            int delete=1+f(w1,w2,i,j+1,dp);
            int replace=1+f(w1,w2,i+1,j+1,dp);
            return dp[i][j]= Math.min(insert,Math.min(delete,replace));
        }
    }
    public int minDistance(String w1, String w2) {
        int dp[][]=new int[w1.length()][w2.length()];
        for(int a[]:dp) Arrays.fill(a,-1);
        return f(w1,w2,0,0,dp);
    }
}
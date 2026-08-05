/*
 * Problem: Shortest Common Supersequence 
 * Problem ID: 1170
 * Difficulty: Hard
 * Language: Java
 * Runtime: 25 ms
 * Memory: 54.1 MB
 * Synced From: LeetCode
 * Date: 2026-08-05
 */

class Solution {
    static String f(String s1,String s2,int i,int j,String dp[][]){
        if(i==s1.length()){
            return s2.substring(j);
        }
        if(j==s2.length()){
            return s1.substring(i);
        }
       
        
        if(dp[i][j]!=null) return dp[i][j];
        
        if(s1.charAt(i)==s2.charAt(j)){
            return dp[i][j]=s1.charAt(i)+f(s1,s2,i+1,j+1,dp);
        }else{
            String t1=s1.charAt(i)+f(s1,s2,i+1,j,dp);
            String t2=s2.charAt(j)+f(s1,s2,i,j+1,dp);
            dp[i][j]= t1.length()<=t2.length()?t1:t2;
        }
        return dp[i][j];
       
    }
    public String shortestCommonSupersequence(String s1, String s2) {
        int dp[][]=new int[s1.length()+1][s2.length()+1];
        // for(int a[]:dp) Arrays.fill(a,-1);
        //return f(s1,s2,0,0,dp);
        int m=s1.length();
        int n=s2.length();
        
        for(int i=0;i<m+1;i++){
            for(int j=0;j<n+1;j++){
                if(j==0||i==0){
                    dp[i][j]= i+j;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                     dp[i][j]=1+dp[i-1][j-1];
                }else{
                     dp[i][j]= Math.min(1+dp[i-1][j],1+dp[i][j-1]);
                }
            }
        }
        int i=m;
        int j=n;
        StringBuilder sb=new StringBuilder();
        while(i>0 && j>0){
            if(s1.charAt(i-1)==s2.charAt(j-1)){
                sb.append(s1.charAt(i-1));
                i--;
                j--;
            }else{
                if(dp[i-1][j]<dp[i][j-1]){
                    sb.append(s1.charAt(i-1));
                    i--;
                }else{
                    sb.append(s2.charAt(j-1));
                    j--;
                }
            }
        }
        //remaing charater if one of string is finish
        while(i>0){
            sb.append(s1.charAt(i-1));
            i--;
        }
        while(j>0){
            sb.append(s2.charAt(j-1));
            j--;
        }
        return sb.reverse().toString();
    }
}
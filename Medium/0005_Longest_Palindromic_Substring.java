/*
 * Problem: Longest Palindromic Substring
 * Problem ID: 5
 * Difficulty: Medium
 * Language: Java
 * Runtime: 499 ms
 * Memory: 276.3 MB
 * Synced From: LeetCode
 * Date: 2026-08-06
 */

class Solution {
    static boolean ispali(int s,int e,String st,Boolean dp[][]){
        // int i=s;
        // int j=e-1;
         /* while(i<=j){
           if(st.charAt(i)==st.charAt(j)){
              i++;
              j--;
             
           }else{
            return false;
           }
        }
        return true;*/

        //recursive palindrom code
        if(s>=e) return true;
        if(dp[s][e]!=null) return dp[s][e];
        if(st.charAt(s)==st.charAt(e)){
            dp[s][e]= ispali(s+1,e-1,st,dp);
        }else{
            dp[s][e]=false;
        }
        return dp[s][e];

    }
    public String longestPalindrome(String s) {
        String st="";
        int max=0;
        Boolean dp[][]=new Boolean[1001][1001];
       // for(int a[]:dp) Arrays.fill(a,-1);
        for(int i=0;i<s.length();i++){
            
            for(int j=i;j<s.length();j++){
                if(ispali(i,j,s,dp)){
                    String sub = s.substring(i, j+1);
                    if(max<sub.length()){
                        max=sub.length();
                        st=sub;
                        
                    }
                }
            }

       
        }
        return st;
    }

}

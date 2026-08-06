/*
 * Problem: Longest Palindromic Substring
 * Problem ID: 5
 * Difficulty: Medium
 * Language: Java
 * Runtime: 270 ms
 * Memory: 277.6 MB
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
        int idx=-1;
        int maxL=0;
        Boolean dp[][]=new Boolean[1001][1001];
       
        //o or 1 length palidrom string is alway true
        for(int i=0;i<s.length();i++){
            dp[i][i]=true;
            maxL=1;
            idx=0;
        }
        int n=s.length();
        for(int l=2;l<=n;l++){
            for(int i=0;i<n-l+1;i++){
                int j=i+l-1;
                if(s.charAt(i)==s.charAt(j) && l==2){
                    dp[i][j]=true;
                    maxL=2;
                    idx=i;
                }else if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true){
                    dp[i][j]=true;
                    if(j-i+1>maxL){
                       maxL=j-i+1;
                       idx=i;
                    }
                }else{
                    dp[i][j]=false;
                }
            }
        }
        return s.substring(idx,idx+maxL);
    }

}

/*
 * Problem: Longest Palindromic Substring
 * Problem ID: 5
 * Difficulty: Medium
 * Language: Java
 * Runtime: 1857 ms
 * Memory: 47.1 MB
 * Synced From: LeetCode
 * Date: 2026-08-06
 */

class Solution {
    static boolean ispali(int s,int e,String st){
        int i=s;
        int j=e-1;
      
        while(i<=j){
           if(st.charAt(i)==st.charAt(j)){
              i++;
              j--;
             
           }else{
            return false;
           }
        }
        return true;
    }
    public String longestPalindrome(String s) {
        String st="";
        int max=0;
        for(int i=0;i<s.length();i++){
           
            for(int j=i;j<s.length();j++){
                if(ispali(i,j+1,s)){
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

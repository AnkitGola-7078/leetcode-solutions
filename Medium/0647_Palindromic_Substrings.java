/*
 * Problem: Palindromic Substrings
 * Problem ID: 647
 * Difficulty: Medium
 * Language: Java
 * Runtime: 744 ms
 * Memory: 42.5 MB
 * Synced From: LeetCode
 * Date: 2026-08-05
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
    public int countSubstrings(String s) {
        int c=0;
       for(int i=0;i<s.length();i++){
        for(int j=i;j<s.length();j++){
            if(ispali(i,j+1,s)){
                c++;
            }
        }
       }
       return c;
    }
}
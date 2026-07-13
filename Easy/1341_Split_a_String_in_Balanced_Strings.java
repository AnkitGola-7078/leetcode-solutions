/*
 * Problem: Split a String in Balanced Strings
 * Problem ID: 1341
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.6 MB
 * Synced From: LeetCode
 * Date: 2026-07-13
 */

class Solution {
    public int balancedStringSplit(String s) {
        int balance=0;
        int count=0;
        for(char c:s.toCharArray()){
            if(c=='L'){
              balance++;
            }else{
                balance--;
            }
            if(balance==0){
                count++;
            }
        }
        return count;
    }
}
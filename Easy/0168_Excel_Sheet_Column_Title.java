/*
 * Problem: Excel Sheet Column Title
 * Problem ID: 168
 * Difficulty: Easy
 * Language: Java
 * Runtime: 0 ms
 * Memory: 42.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-14
 */

class Solution {
    public String convertToTitle(int colNumber) {
        StringBuilder st = new StringBuilder();
        while(colNumber>0){
            colNumber--;
            st.append((char)(colNumber%26+'A'));//cureent elemtn nikalna
            colNumber/=26;
        }
        return st.reverse().toString();
    }
}
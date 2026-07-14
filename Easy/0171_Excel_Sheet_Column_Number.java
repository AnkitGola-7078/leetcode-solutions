/*
 * Problem: Excel Sheet Column Number
 * Problem ID: 171
 * Difficulty: Easy
 * Language: Java
 * Runtime: 1 ms
 * Memory: 43.7 MB
 * Synced From: LeetCode
 * Date: 2026-07-14
 */

class Solution {
    public int titleToNumber(String columnTitle) {
        int res=0;
        for(int i=0;i<columnTitle.length();i++){
            char ch=columnTitle.charAt(i);
            int val=(ch-'A')+1;
            res=res*26+val;
        }
        return res;
    }
}